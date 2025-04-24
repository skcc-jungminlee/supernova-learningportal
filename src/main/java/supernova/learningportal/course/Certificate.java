package supernova.learningportal.course;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table(name = "certificate")
@ToString
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String userId;

    @Column(nullable = false)
    private String courseId;

    @Column(nullable = false)
    private LocalDate issueDate;

    // Getters and setters

    public byte[] getData() {
        // Assuming certificate data is stored as a byte array
        // This is a placeholder implementation
        return new byte[0];
    }
} 