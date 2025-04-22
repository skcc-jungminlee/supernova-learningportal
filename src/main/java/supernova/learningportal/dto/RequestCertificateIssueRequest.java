package supernova.learningportal.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * RequestCertificateIssueRequest
 */

@JsonTypeName("requestCertificateIssue_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:32.815711100+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
public class RequestCertificateIssueRequest {

  private String courseId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime requestedAt;

  private String userId;

  public RequestCertificateIssueRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RequestCertificateIssueRequest(String courseId, String userId) {
    this.courseId = courseId;
    this.userId = userId;
  }

  public RequestCertificateIssueRequest courseId(String courseId) {
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

  public RequestCertificateIssueRequest requestedAt(OffsetDateTime requestedAt) {
    this.requestedAt = requestedAt;
    return this;
  }

  /**
   * Get requestedAt
   * @return requestedAt
   */
  @Valid 
  @Schema(name = "requestedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestedAt")
  public OffsetDateTime getRequestedAt() {
    return requestedAt;
  }

  public void setRequestedAt(OffsetDateTime requestedAt) {
    this.requestedAt = requestedAt;
  }

  public RequestCertificateIssueRequest userId(String userId) {
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
    RequestCertificateIssueRequest requestCertificateIssueRequest = (RequestCertificateIssueRequest) o;
    return Objects.equals(this.courseId, requestCertificateIssueRequest.courseId) &&
        Objects.equals(this.requestedAt, requestCertificateIssueRequest.requestedAt) &&
        Objects.equals(this.userId, requestCertificateIssueRequest.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseId, requestedAt, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestCertificateIssueRequest {\n");
    sb.append("    courseId: ").append(toIndentedString(courseId)).append("\n");
    sb.append("    requestedAt: ").append(toIndentedString(requestedAt)).append("\n");
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

