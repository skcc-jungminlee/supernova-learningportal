package supernova.learningportal.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CertificateHistory
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:32.815711100+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
public class CertificateHistory {

  private String certificateId;

  private String courseId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime issuedAt;

  private String userId;

  public CertificateHistory() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CertificateHistory(String certificateId, String courseId, OffsetDateTime issuedAt, String userId) {
    this.certificateId = certificateId;
    this.courseId = courseId;
    this.issuedAt = issuedAt;
    this.userId = userId;
  }

  public CertificateHistory certificateId(String certificateId) {
    this.certificateId = certificateId;
    return this;
  }

  /**
   * Get certificateId
   * @return certificateId
   */
  @NotNull 
  @Schema(name = "certificateId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("certificateId")
  public String getCertificateId() {
    return certificateId;
  }

  public void setCertificateId(String certificateId) {
    this.certificateId = certificateId;
  }

  public CertificateHistory courseId(String courseId) {
    this.courseId = courseId;
    return this;
  }

  /**
   * Get courseId
   * @return courseId
   */
  @NotNull 
  @Schema(name = "courseId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("courseId")
  public String getCourseId() {
    return courseId;
  }

  public void setCourseId(String courseId) {
    this.courseId = courseId;
  }

  public CertificateHistory issuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
    return this;
  }

  /**
   * Get issuedAt
   * @return issuedAt
   */
  @NotNull @Valid 
  @Schema(name = "issuedAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issuedAt")
  public OffsetDateTime getIssuedAt() {
    return issuedAt;
  }

  public void setIssuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
  }

  public CertificateHistory userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  @NotNull 
  @Schema(name = "userId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateHistory certificateHistory = (CertificateHistory) o;
    return Objects.equals(this.certificateId, certificateHistory.certificateId) &&
        Objects.equals(this.courseId, certificateHistory.courseId) &&
        Objects.equals(this.issuedAt, certificateHistory.issuedAt) &&
        Objects.equals(this.userId, certificateHistory.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateId, courseId, issuedAt, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateHistory {\n");
    sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
    sb.append("    courseId: ").append(toIndentedString(courseId)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

