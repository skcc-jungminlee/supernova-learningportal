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
 * EnrollmentSubmit
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:32.815711100+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
public class EnrollmentSubmit {

  private @Nullable Boolean confirmation;

  private String draftId;

  public EnrollmentSubmit() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EnrollmentSubmit(String draftId) {
    this.draftId = draftId;
  }

  public EnrollmentSubmit confirmation(Boolean confirmation) {
    this.confirmation = confirmation;
    return this;
  }

  /**
   * Get confirmation
   * @return confirmation
   */
  
  @Schema(name = "confirmation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("confirmation")
  public Boolean getConfirmation() {
    return confirmation;
  }

  public void setConfirmation(Boolean confirmation) {
    this.confirmation = confirmation;
  }

  public EnrollmentSubmit draftId(String draftId) {
    this.draftId = draftId;
    return this;
  }

  /**
   * Get draftId
   * @return draftId
   */
  @NotNull 
  @Schema(name = "draftId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("draftId")
  public String getDraftId() {
    return draftId;
  }

  public void setDraftId(String draftId) {
    this.draftId = draftId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnrollmentSubmit enrollmentSubmit = (EnrollmentSubmit) o;
    return Objects.equals(this.confirmation, enrollmentSubmit.confirmation) &&
        Objects.equals(this.draftId, enrollmentSubmit.draftId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confirmation, draftId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrollmentSubmit {\n");
    sb.append("    confirmation: ").append(toIndentedString(confirmation)).append("\n");
    sb.append("    draftId: ").append(toIndentedString(draftId)).append("\n");
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

