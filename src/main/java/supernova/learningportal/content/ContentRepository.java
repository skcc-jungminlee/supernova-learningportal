package supernova.learningportal.content;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContentRepository extends JpaRepository<Content, String> {
    List<Content> findByFieldAndTargetLevelAndType(String field, String targetLevel, String type);
    List<Content> findByStatus(ContentStatus status);
    List<Content> findByField(String field);
} 