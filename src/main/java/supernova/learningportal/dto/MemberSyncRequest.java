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
 * MemberSyncRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:32.815711100+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
public class MemberSyncRequest {

  private String externalSystemId;

  private String memberId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime syncTimestamp;

  public MemberSyncRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MemberSyncRequest(String externalSystemId, String memberId) {
    this.externalSystemId = externalSystemId;
    this.memberId = memberId;
  }

  public MemberSyncRequest externalSystemId(String externalSystemId) {
    this.externalSystemId = externalSystemId;
    return this;
  }

  /**
   * Get externalSystemId
   * @return externalSystemId
   */
  @NotNull 
  @Schema(name = "externalSystemId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("externalSystemId")
  public String getExternalSystemId() {
    return externalSystemId;
  }

  public void setExternalSystemId(String externalSystemId) {
    this.externalSystemId = externalSystemId;
  }

  public MemberSyncRequest memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

  /**
   * Get memberId
   * @return memberId
   */
  @NotNull 
  @Schema(name = "memberId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("memberId")
  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public MemberSyncRequest syncTimestamp(OffsetDateTime syncTimestamp) {
    this.syncTimestamp = syncTimestamp;
    return this;
  }

  /**
   * Get syncTimestamp
   * @return syncTimestamp
   */
  @Valid 
  @Schema(name = "syncTimestamp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("syncTimestamp")
  public OffsetDateTime getSyncTimestamp() {
    return syncTimestamp;
  }

  public void setSyncTimestamp(OffsetDateTime syncTimestamp) {
    this.syncTimestamp = syncTimestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberSyncRequest memberSyncRequest = (MemberSyncRequest) o;
    return Objects.equals(this.externalSystemId, memberSyncRequest.externalSystemId) &&
        Objects.equals(this.memberId, memberSyncRequest.memberId) &&
        Objects.equals(this.syncTimestamp, memberSyncRequest.syncTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalSystemId, memberId, syncTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberSyncRequest {\n");
    sb.append("    externalSystemId: ").append(toIndentedString(externalSystemId)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    syncTimestamp: ").append(toIndentedString(syncTimestamp)).append("\n");
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

