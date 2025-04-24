package supernova.learningportal.course;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import supernova.learningportal.dto.EnrollmentDraft;
import supernova.learningportal.dto.EnrollmentSubmit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import java.time.LocalDateTime;

@Service
public class CourseEnrollmentServiceImpl implements CourseEnrollmentService {

    @Autowired
    private CourseEnrollmentRepository enrollmentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private CertificateRepository certificateRepository;

    @Override
    public void cancelEnrollment(String id) {
        enrollmentRepository.findById(Long.parseLong(id)).ifPresent(enrollment -> {
            // Assuming there's a status field to update
            enrollment.setStatus("Cancelled");
            enrollmentRepository.save(enrollment);
        });
    }

    @Override
    public Resource downloadCertificate(String courseId, String userId) {
        // Assuming there's a method to find certificate by courseId and userId
        return certificateRepository.findByCourseIdAndUserId(Long.parseLong(courseId), userId)
                .map(certificate -> {
                    // Convert certificate to Resource
                    return new ByteArrayResource(certificate.getData());
                })
                .orElse(null);
    }

    @Override
    public void getCourses() {
        courseRepository.findAll().forEach(course -> {
            // Process each course
            System.out.println(course);
        });
    }

    @Override
    public void getEnrollmentStatus(String userId) {
        enrollmentRepository.findByUserId(userId);
    }

    private CourseEnrollment mapToCourseEnrollment(EnrollmentDraft enrollmentDraft) {
        CourseEnrollment enrollment = new CourseEnrollment();
        enrollment.setUserId(enrollmentDraft.getEmail()); // Assuming email is used as userId
        enrollment.setCourseId(enrollmentDraft.getCourseName()); // Assuming courseName is used as courseId
        enrollment.setStatus("Draft");
        enrollment.setCreatedAt(LocalDateTime.now());
        enrollment.setUpdatedAt(LocalDateTime.now());
        return enrollment;
    }

    private CourseEnrollment mapToCourseEnrollment(EnrollmentSubmit enrollmentSubmit) {
        CourseEnrollment enrollment = new CourseEnrollment();
        enrollment.setId(Long.parseLong(enrollmentSubmit.getDraftId()));
        enrollment.setStatus(enrollmentSubmit.getConfirmation() ? "Submitted" : "Pending");
        enrollment.setUpdatedAt(LocalDateTime.now());
        return enrollment;
    }

    @Override
    public void saveEnrollmentDraft(EnrollmentDraft enrollmentDraft) {
        CourseEnrollment enrollment = mapToCourseEnrollment(enrollmentDraft);
        enrollmentRepository.save(enrollment);
    }

    @Override
    public void submitEnrollment(EnrollmentSubmit enrollmentSubmit) {
        CourseEnrollment enrollment = mapToCourseEnrollment(enrollmentSubmit);
        enrollmentRepository.save(enrollment);
    }
} 