package supernova.learningportal.course;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CertificateRepository extends JpaRepository<Certificate, Long> {
    // Additional query methods can be defined here

    Optional<Certificate> findByCourseIdAndUserId(Long courseId, String userId);
} 