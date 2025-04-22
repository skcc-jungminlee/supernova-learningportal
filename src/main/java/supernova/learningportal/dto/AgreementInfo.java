package supernova.learningportal.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AgreementInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:32.815711100+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
public class AgreementInfo {

  @Valid
  private List<String> optionalAgreements = new ArrayList<>();

  @Valid
  private List<String> requiredAgreements = new ArrayList<>();

  public AgreementInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AgreementInfo(List<String> requiredAgreements) {
    this.requiredAgreements = requiredAgreements;
  }

  public AgreementInfo optionalAgreements(List<String> optionalAgreements) {
    this.optionalAgreements = optionalAgreements;
    return this;
  }

  public AgreementInfo addOptionalAgreementsItem(String optionalAgreementsItem) {
    if (this.optionalAgreements == null) {
      this.optionalAgreements = new ArrayList<>();
    }
    this.optionalAgreements.add(optionalAgreementsItem);
    return this;
  }

  /**
   * Get optionalAgreements
   * @return optionalAgreements
   */
  
  @Schema(name = "optionalAgreements", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optionalAgreements")
  public List<String> getOptionalAgreements() {
    return optionalAgreements;
  }

  public void setOptionalAgreements(List<String> optionalAgreements) {
    this.optionalAgreements = optionalAgreements;
  }

  public AgreementInfo requiredAgreements(List<String> requiredAgreements) {
    this.requiredAgreements = requiredAgreements;
    return this;
  }

  public AgreementInfo addRequiredAgreementsItem(String requiredAgreementsItem) {
    if (this.requiredAgreements == null) {
      this.requiredAgreements = new ArrayList<>();
    }
    this.requiredAgreements.add(requiredAgreementsItem);
    return this;
  }

  /**
   * Get requiredAgreements
   * @return requiredAgreements
   */
  @NotNull 
  @Schema(name = "requiredAgreements", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("requiredAgreements")
  public List<String> getRequiredAgreements() {
    return requiredAgreements;
  }

  public void setRequiredAgreements(List<String> requiredAgreements) {
    this.requiredAgreements = requiredAgreements;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgreementInfo agreementInfo = (AgreementInfo) o;
    return Objects.equals(this.optionalAgreements, agreementInfo.optionalAgreements) &&
        Objects.equals(this.requiredAgreements, agreementInfo.requiredAgreements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optionalAgreements, requiredAgreements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementInfo {\n");
    sb.append("    optionalAgreements: ").append(toIndentedString(optionalAgreements)).append("\n");
    sb.append("    requiredAgreements: ").append(toIndentedString(requiredAgreements)).append("\n");
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

