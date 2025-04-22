package supernova.learningportal.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DesiredContentRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:32.815711100+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
public class DesiredContentRequest {

  private @Nullable String expectedUse;

  private String field;

  private String reason;

  private String title;

  public DesiredContentRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DesiredContentRequest(String field, String reason, String title) {
    this.field = field;
    this.reason = reason;
    this.title = title;
  }

  public DesiredContentRequest expectedUse(String expectedUse) {
    this.expectedUse = expectedUse;
    return this;
  }

  /**
   * Get expectedUse
   * @return expectedUse
   */
  
  @Schema(name = "expectedUse", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expectedUse")
  public String getExpectedUse() {
    return expectedUse;
  }

  public void setExpectedUse(String expectedUse) {
    this.expectedUse = expectedUse;
  }

  public DesiredContentRequest field(String field) {
    this.field = field;
    return this;
  }

  /**
   * Get field
   * @return field
   */
  @NotNull 
  @Schema(name = "field", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("field")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public DesiredContentRequest reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
   */
  @NotNull 
  @Schema(name = "reason", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public DesiredContentRequest title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @NotNull 
  @Schema(name = "title", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DesiredContentRequest desiredContentRequest = (DesiredContentRequest) o;
    return Objects.equals(this.expectedUse, desiredContentRequest.expectedUse) &&
        Objects.equals(this.field, desiredContentRequest.field) &&
        Objects.equals(this.reason, desiredContentRequest.reason) &&
        Objects.equals(this.title, desiredContentRequest.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expectedUse, field, reason, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DesiredContentRequest {\n");
    sb.append("    expectedUse: ").append(toIndentedString(expectedUse)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

