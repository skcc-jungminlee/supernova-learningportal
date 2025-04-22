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
 * ReceiveCertificateHistoryRequest
 */

@JsonTypeName("receiveCertificateHistory_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:32.815711100+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
public class ReceiveCertificateHistoryRequest {

  private String certificateId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime issuedAt;

  private String userId;

  public ReceiveCertificateHistoryRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ReceiveCertificateHistoryRequest(String certificateId, String userId) {
    this.certificateId = certificateId;
    this.userId = userId;
  }

  public ReceiveCertificateHistoryRequest certificateId(String certificateId) {
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

  public ReceiveCertificateHistoryRequest issuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
    return this;
  }

  /**
   * Get issuedAt
   * @return issuedAt
   */
  @Valid 
  @Schema(name = "issuedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issuedAt")
  public OffsetDateTime getIssuedAt() {
    return issuedAt;
  }

  public void setIssuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
  }

  public ReceiveCertificateHistoryRequest userId(String userId) {
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
    ReceiveCertificateHistoryRequest receiveCertificateHistoryRequest = (ReceiveCertificateHistoryRequest) o;
    return Objects.equals(this.certificateId, receiveCertificateHistoryRequest.certificateId) &&
        Objects.equals(this.issuedAt, receiveCertificateHistoryRequest.issuedAt) &&
        Objects.equals(this.userId, receiveCertificateHistoryRequest.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateId, issuedAt, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiveCertificateHistoryRequest {\n");
    sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
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

