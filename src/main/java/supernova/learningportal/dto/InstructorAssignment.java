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
 * InstructorAssignment
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:32.815711100+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
public class InstructorAssignment {

  private String instructorId;

  private String programId;

  public InstructorAssignment() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public InstructorAssignment(String instructorId, String programId) {
    this.instructorId = instructorId;
    this.programId = programId;
  }

  public InstructorAssignment instructorId(String instructorId) {
    this.instructorId = instructorId;
    return this;
  }

  /**
   * Get instructorId
   * @return instructorId
   */
  @NotNull 
  @Schema(name = "instructorId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("instructorId")
  public String getInstructorId() {
    return instructorId;
  }

  public void setInstructorId(String instructorId) {
    this.instructorId = instructorId;
  }

  public InstructorAssignment programId(String programId) {
    this.programId = programId;
    return this;
  }

  /**
   * Get programId
   * @return programId
   */
  @NotNull 
  @Schema(name = "programId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("programId")
  public String getProgramId() {
    return programId;
  }

  public void setProgramId(String programId) {
    this.programId = programId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstructorAssignment instructorAssignment = (InstructorAssignment) o;
    return Objects.equals(this.instructorId, instructorAssignment.instructorId) &&
        Objects.equals(this.programId, instructorAssignment.programId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instructorId, programId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstructorAssignment {\n");
    sb.append("    instructorId: ").append(toIndentedString(instructorId)).append("\n");
    sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
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

