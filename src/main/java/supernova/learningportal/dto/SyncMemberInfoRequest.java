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
 * SyncMemberInfoRequest
 */

@JsonTypeName("syncMemberInfo_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:32.815711100+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
public class SyncMemberInfoRequest {

  private String externalSystem;

  private String memberId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime syncedAt;

  public SyncMemberInfoRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SyncMemberInfoRequest(String externalSystem, String memberId) {
    this.externalSystem = externalSystem;
    this.memberId = memberId;
  }

  public SyncMemberInfoRequest externalSystem(String externalSystem) {
    this.externalSystem = externalSystem;
    return this;
  }

  /**
   * Get externalSystem
   * @return externalSystem
   */
  @NotNull 
  @Schema(name = "externalSystem", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("externalSystem")
  public String getExternalSystem() {
    return externalSystem;
  }

  public void setExternalSystem(String externalSystem) {
    this.externalSystem = externalSystem;
  }

  public SyncMemberInfoRequest memberId(String memberId) {
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

  public SyncMemberInfoRequest syncedAt(OffsetDateTime syncedAt) {
    this.syncedAt = syncedAt;
    return this;
  }

  /**
   * Get syncedAt
   * @return syncedAt
   */
  @Valid 
  @Schema(name = "syncedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("syncedAt")
  public OffsetDateTime getSyncedAt() {
    return syncedAt;
  }

  public void setSyncedAt(OffsetDateTime syncedAt) {
    this.syncedAt = syncedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncMemberInfoRequest syncMemberInfoRequest = (SyncMemberInfoRequest) o;
    return Objects.equals(this.externalSystem, syncMemberInfoRequest.externalSystem) &&
        Objects.equals(this.memberId, syncMemberInfoRequest.memberId) &&
        Objects.equals(this.syncedAt, syncMemberInfoRequest.syncedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalSystem, memberId, syncedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncMemberInfoRequest {\n");
    sb.append("    externalSystem: ").append(toIndentedString(externalSystem)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    syncedAt: ").append(toIndentedString(syncedAt)).append("\n");
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

