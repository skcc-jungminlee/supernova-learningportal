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
 * EnrollmentDraft
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:32.815711100+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
public class EnrollmentDraft {

  private String courseName;

  private String email;

  private @Nullable String motivation;

  private String name;

  private String phoneNumber;

  public EnrollmentDraft() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EnrollmentDraft(String courseName, String email, String name, String phoneNumber) {
    this.courseName = courseName;
    this.email = email;
    this.name = name;
    this.phoneNumber = phoneNumber;
  }

  public EnrollmentDraft courseName(String courseName) {
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

  public EnrollmentDraft email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @NotNull 
  @Schema(name = "email", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public EnrollmentDraft motivation(String motivation) {
    this.motivation = motivation;
    return this;
  }

  /**
   * Get motivation
   * @return motivation
   */
  
  @Schema(name = "motivation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("motivation")
  public String getMotivation() {
    return motivation;
  }

  public void setMotivation(String motivation) {
    this.motivation = motivation;
  }

  public EnrollmentDraft name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EnrollmentDraft phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
   */
  @NotNull 
  @Schema(name = "phoneNumber", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnrollmentDraft enrollmentDraft = (EnrollmentDraft) o;
    return Objects.equals(this.courseName, enrollmentDraft.courseName) &&
        Objects.equals(this.email, enrollmentDraft.email) &&
        Objects.equals(this.motivation, enrollmentDraft.motivation) &&
        Objects.equals(this.name, enrollmentDraft.name) &&
        Objects.equals(this.phoneNumber, enrollmentDraft.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseName, email, motivation, name, phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrollmentDraft {\n");
    sb.append("    courseName: ").append(toIndentedString(courseName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    motivation: ").append(toIndentedString(motivation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

