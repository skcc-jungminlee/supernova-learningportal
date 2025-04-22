package supernova.learningportal.content;

import supernova.learningportal.content.ContentManagementApi;
import supernova.learningportal.dto.ContentCategories;
import supernova.learningportal.dto.ContentReview;
import supernova.learningportal.dto.DesiredContentRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T19:00:30.513420+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
@Controller
@RequestMapping("${openapi.eOpen.base-path:}")
public class ContentManagementApiController implements ContentManagementApi {

    private final NativeWebRequest request;
    private final ContentService contentService;

    @Autowired
    public ContentManagementApiController(NativeWebRequest request, ContentService contentService) {
        this.request = request;
        this.contentService = contentService;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Void> requestContentModification(String id, String reason, MultipartFile file) {
        contentService.requestContentModification(id, reason, file);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> requestDesiredContent(@Valid DesiredContentRequest desiredContentRequest) {
        contentService.createDesiredContent(desiredContentRequest);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> reviewContent(String id, @Valid ContentReview contentReview) {
        contentService.reviewContent(id, contentReview);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> setContentCategories(String id, @Valid ContentCategories contentCategories) {
        contentService.setContentCategories(id, contentCategories);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> uploadContent(MultipartFile file, String title, String description, String version) {
        contentService.uploadContent(file, title, description, version);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
