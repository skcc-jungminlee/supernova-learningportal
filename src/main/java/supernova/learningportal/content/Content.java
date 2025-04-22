package supernova.learningportal.content;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDateTime;

@Entity
@Table(name = "content")
@Getter
@Setter
@NoArgsConstructor
public class Content {

    @Id
    @GeneratedValue
    @UuidGenerator
    @Column(columnDefinition = "VARCHAR(36)")
    private String id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String field;

    @Column(nullable = false)
    private String targetLevel;

    @Column(nullable = false)
    private String type;

    @Column(name = "expected_use")
    private String expectedUse;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ContentStatus status;

    @Column(name = "review_reason")
    private String reviewReason;

    @Column(name = "file_url")
    private String fileUrl;

    @Column
    private String description;

    @Column
    private String version;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }
} 