package supernova.learningportal.content;

import supernova.learningportal.dto.ContentCategories;
import supernova.learningportal.dto.ContentReview;
import supernova.learningportal.dto.DesiredContentRequest;
import supernova.learningportal.exception.ContentUploadException;
import supernova.learningportal.exception.FileStorageException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
@Transactional
@RequiredArgsConstructor
public class ContentService {

    private final ContentRepository contentRepository;

    public Content createDesiredContent(DesiredContentRequest request) {
        Content content = new Content();
        content.setTitle(request.getTitle());
        content.setField(request.getField());
        content.setExpectedUse(request.getExpectedUse());
        content.setStatus(ContentStatus.PENDING);
        return contentRepository.save(content);
    }

    public Content reviewContent(String contentId, ContentReview review) {
        Content content = contentRepository.findById(contentId)
                .orElseThrow(() -> new RuntimeException("Content not found with id: " + contentId));
        
        content.setStatus(ContentStatus.valueOf(review.getStatus().name()));
        content.setReviewReason(review.getReason());
        return contentRepository.save(content);
    }

    public List<Content> getContentsByCategories(ContentCategories categories) {
        return contentRepository.findByFieldAndTargetLevelAndType(
            categories.getField(),
            categories.getTargetLevel(),
            categories.getType()
        );
    }

    public List<Content> getContentsByField(String field) {
        return contentRepository.findByField(field);
    }

    public List<Content> getPendingContents() {
        return contentRepository.findByStatus(ContentStatus.PENDING);
    }

    public Content getContent(String contentId) {
        return contentRepository.findById(contentId)
                .orElseThrow(() -> new RuntimeException("Content not found with id: " + contentId));
    }

    public void deleteContent(String contentId) {
        contentRepository.deleteById(contentId);
    }

    public Content requestContentModification(String contentId, String reason, MultipartFile file) {
        Content content = getContent(contentId);
        // 수정 요청 상태로 변경
        content.setStatus(ContentStatus.PENDING);
        content.setReviewReason(reason);
        
        if (file != null) {
            try {
                // TODO: 파일 저장 로직 구현
                // saveContentFile(contentId, file);
            } catch (Exception e) {
                throw new RuntimeException("Failed to save content file", e);
            }
        }
        
        return contentRepository.save(content);
    }

    public Content uploadContent(MultipartFile file, String title, String description, String version) {
        if (file == null || file.isEmpty()) {
            throw new IllegalArgumentException("File cannot be empty");
        }

        Content content = new Content();
        content.setTitle(title);
        content.setDescription(description);
        content.setVersion(version);
        content.setStatus(ContentStatus.PENDING);
        
        // 임시로 기본값 설정 (실제로는 파라미터로 받아야 함)
        content.setField("미분류");
        content.setTargetLevel("미분류");
        content.setType("미분류");
        
        try {
            String fileUrl = saveContentFile(file);
            content.setFileUrl(fileUrl);
            content = contentRepository.save(content);
        } catch (FileStorageException e) {
            throw new ContentUploadException("Failed to store file: " + e.getMessage(), e);
        } catch (Exception e) {
            throw new ContentUploadException("Failed to upload content: " + e.getMessage(), e);
        }
        
        return content;
    }

    private String saveContentFile(MultipartFile file) throws FileStorageException {
        try {
            // 파일 저장 경로 설정
            String uploadDir = "uploads/contents";
            File directory = new File(uploadDir);
            if (!directory.exists()) {
                directory.mkdirs();
            }

            // 고유한 파일명 생성
            String originalFilename = file.getOriginalFilename();
            String fileExtension = originalFilename.substring(originalFilename.lastIndexOf("."));
            String uniqueFilename = UUID.randomUUID().toString() + fileExtension;
            String filePath = uploadDir + File.separator + uniqueFilename;

            // 파일 저장
            // File dest = new File(filePath);
            // file.transferTo(dest);

            // 파일 URL 생성
            return "/api/contents/files/" + uniqueFilename;
        } catch (Exception e) {
            throw new FileStorageException("Could not store file " + file.getOriginalFilename(), e);
        }
    }

    public Content setContentCategories(String contentId, ContentCategories categories) {
        Content content = getContent(contentId);
        content.setField(categories.getField());
        content.setTargetLevel(categories.getTargetLevel());
        content.setType(categories.getType());
        return contentRepository.save(content);
    }
} 