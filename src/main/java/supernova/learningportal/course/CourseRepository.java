package supernova.learningportal.course;

import supernova.learningportal.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
    // Additional query methods can be defined here
} 