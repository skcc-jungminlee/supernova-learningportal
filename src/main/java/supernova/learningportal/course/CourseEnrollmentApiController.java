package supernova.learningportal.course;

import supernova.learningportal.dto.EnrollmentDraft;
import supernova.learningportal.dto.EnrollmentSubmit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.NativeWebRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:09.122869400+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
@Controller
@RequestMapping("${openapi.eOpen.base-path:}")
public class CourseEnrollmentApiController implements CourseEnrollmentApi {

    private final NativeWebRequest request;
    private final CourseEnrollmentService courseEnrollmentService;
    private static final Logger logger = LoggerFactory.getLogger(CourseEnrollmentApiController.class);

    @Autowired
    public CourseEnrollmentApiController(NativeWebRequest request, CourseEnrollmentService courseEnrollmentService) {
        this.request = request;
        this.courseEnrollmentService = courseEnrollmentService;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Void> cancelEnrollment(@PathVariable("id") String id) {
        try {
            courseEnrollmentService.cancelEnrollment(id);
            logger.info("Enrollment with ID {} cancelled successfully.", id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error cancelling enrollment with ID {}: {}", id, e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Resource> downloadCertificate(
            @NotNull @Valid @RequestParam(value = "courseId", required = true) String courseId,
            @NotNull @Valid @RequestParam(value = "userId", required = true) String userId) {
        try {
            Resource resource = courseEnrollmentService.downloadCertificate(courseId, userId);
            if (resource != null) {
                logger.info("Certificate downloaded for courseId {} and userId {}.", courseId, userId);
                return ResponseEntity.ok(resource);
            } else {
                logger.warn("Certificate not found for courseId {} and userId {}.", courseId, userId);
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            logger.error("Error downloading certificate for courseId {} and userId {}: {}", courseId, userId, e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Void> getCourses() {
        try {
            courseEnrollmentService.getCourses();
            logger.info("Courses retrieved successfully.");
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error retrieving courses: {}", e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Void> getEnrollmentStatus(
            @NotNull @Valid @RequestParam(value = "userId", required = true) String userId) {
        try {
            courseEnrollmentService.getEnrollmentStatus(userId);
            logger.info("Enrollment status retrieved for userId {}.", userId);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error retrieving enrollment status for userId {}: {}", userId, e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Void> saveEnrollmentDraft(
            @Valid @RequestBody EnrollmentDraft enrollmentDraft) {
        try {
            courseEnrollmentService.saveEnrollmentDraft(enrollmentDraft);
            logger.info("Enrollment draft saved successfully.");
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error saving enrollment draft: {}", e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Void> submitEnrollment(
            @Valid @RequestBody EnrollmentSubmit enrollmentSubmit) {
        try {
            courseEnrollmentService.submitEnrollment(enrollmentSubmit);
            logger.info("Enrollment submitted successfully.");
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error submitting enrollment: {}", e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}