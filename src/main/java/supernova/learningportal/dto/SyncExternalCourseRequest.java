package supernova.learningportal.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SyncExternalCourseRequest
 */

@JsonTypeName("syncExternalCourse_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:32.815711100+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
public class SyncExternalCourseRequest {

  private String courseName;

  private @Nullable String duration;

  private String externalCourseId;

  private @Nullable String provider;

  public SyncExternalCourseRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SyncExternalCourseRequest(String courseName, String externalCourseId) {
    this.courseName = courseName;
    this.externalCourseId = externalCourseId;
  }

  public SyncExternalCourseRequest courseName(String courseName) {
    this.courseName = courseName;
    return this;
  }

  /**
   * Get courseName
   * @return courseName
   */
  @NotNull 
  @Schema(name = "courseName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("courseName")
  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public SyncExternalCourseRequest duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
   */
  
  @Schema(name = "duration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("duration")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public SyncExternalCourseRequest externalCourseId(String externalCourseId) {
    this.externalCourseId = externalCourseId;
    return this;
  }

  /**
   * Get externalCourseId
   * @return externalCourseId
   */
  @NotNull 
  @Schema(name = "externalCourseId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("externalCourseId")
  public String getExternalCourseId() {
    return externalCourseId;
  }

  public void setExternalCourseId(String externalCourseId) {
    this.externalCourseId = externalCourseId;
  }

  public SyncExternalCourseRequest provider(String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Get provider
   * @return provider
   */
  
  @Schema(name = "provider", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncExternalCourseRequest syncExternalCourseRequest = (SyncExternalCourseRequest) o;
    return Objects.equals(this.courseName, syncExternalCourseRequest.courseName) &&
        Objects.equals(this.duration, syncExternalCourseRequest.duration) &&
        Objects.equals(this.externalCourseId, syncExternalCourseRequest.externalCourseId) &&
        Objects.equals(this.provider, syncExternalCourseRequest.provider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseName, duration, externalCourseId, provider);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncExternalCourseRequest {\n");
    sb.append("    courseName: ").append(toIndentedString(courseName)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    externalCourseId: ").append(toIndentedString(externalCourseId)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
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

