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
 * InstructorApplication
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:32.815711100+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
public class InstructorApplication {

  private @Nullable String career;

  private @Nullable String certificateFileUrl;

  private String email;

  private String name;

  private String phoneNumber;

  private String specialty;

  public InstructorApplication() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public InstructorApplication(String email, String name, String phoneNumber, String specialty) {
    this.email = email;
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.specialty = specialty;
  }

  public InstructorApplication career(String career) {
    this.career = career;
    return this;
  }

  /**
   * Get career
   * @return career
   */
  
  @Schema(name = "career", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("career")
  public String getCareer() {
    return career;
  }

  public void setCareer(String career) {
    this.career = career;
  }

  public InstructorApplication certificateFileUrl(String certificateFileUrl) {
    this.certificateFileUrl = certificateFileUrl;
    return this;
  }

  /**
   * Get certificateFileUrl
   * @return certificateFileUrl
   */
  
  @Schema(name = "certificateFileUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("certificateFileUrl")
  public String getCertificateFileUrl() {
    return certificateFileUrl;
  }

  public void setCertificateFileUrl(String certificateFileUrl) {
    this.certificateFileUrl = certificateFileUrl;
  }

  public InstructorApplication email(String email) {
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

  public InstructorApplication name(String name) {
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

  public InstructorApplication phoneNumber(String phoneNumber) {
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

  public InstructorApplication specialty(String specialty) {
    this.specialty = specialty;
    return this;
  }

  /**
   * Get specialty
   * @return specialty
   */
  @NotNull 
  @Schema(name = "specialty", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("specialty")
  public String getSpecialty() {
    return specialty;
  }

  public void setSpecialty(String specialty) {
    this.specialty = specialty;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstructorApplication instructorApplication = (InstructorApplication) o;
    return Objects.equals(this.career, instructorApplication.career) &&
        Objects.equals(this.certificateFileUrl, instructorApplication.certificateFileUrl) &&
        Objects.equals(this.email, instructorApplication.email) &&
        Objects.equals(this.name, instructorApplication.name) &&
        Objects.equals(this.phoneNumber, instructorApplication.phoneNumber) &&
        Objects.equals(this.specialty, instructorApplication.specialty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(career, certificateFileUrl, email, name, phoneNumber, specialty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstructorApplication {\n");
    sb.append("    career: ").append(toIndentedString(career)).append("\n");
    sb.append("    certificateFileUrl: ").append(toIndentedString(certificateFileUrl)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    specialty: ").append(toIndentedString(specialty)).append("\n");
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

