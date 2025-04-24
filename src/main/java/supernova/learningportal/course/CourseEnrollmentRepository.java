package supernova.learningportal.course;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseEnrollmentRepository extends JpaRepository<CourseEnrollment, Long> {
    // Additional query methods can be defined here

    Optional<CourseEnrollment> findByUserId(String userId);
} 