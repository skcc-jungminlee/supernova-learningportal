package supernova.learningportal.course;

import org.springframework.core.io.Resource;
import supernova.learningportal.dto.EnrollmentDraft;
import supernova.learningportal.dto.EnrollmentSubmit;
import java.util.Optional;

public interface CourseEnrollmentService {
    void cancelEnrollment(String id);
    Resource downloadCertificate(String courseId, String userId);
    void getCourses();
    void getEnrollmentStatus(String userId);
    void saveEnrollmentDraft(EnrollmentDraft enrollmentDraft);
    void submitEnrollment(EnrollmentSubmit enrollmentSubmit);
} 