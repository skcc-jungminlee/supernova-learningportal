package supernova.learningportal.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Program
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:32.815711100+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
public class Program {

  private BigDecimal fee;

  private @Nullable String location;

  private String programName;

  private String programType;

  private Integer round;

  private String targetGroup;

  public Program() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Program(BigDecimal fee, String programName, String programType, Integer round, String targetGroup) {
    this.fee = fee;
    this.programName = programName;
    this.programType = programType;
    this.round = round;
    this.targetGroup = targetGroup;
  }

  public Program fee(BigDecimal fee) {
    this.fee = fee;
    return this;
  }

  /**
   * Get fee
   * @return fee
   */
  @NotNull @Valid 
  @Schema(name = "fee", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fee")
  public BigDecimal getFee() {
    return fee;
  }

  public void setFee(BigDecimal fee) {
    this.fee = fee;
  }

  public Program location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  
  @Schema(name = "location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Program programName(String programName) {
    this.programName = programName;
    return this;
  }

  /**
   * Get programName
   * @return programName
   */
  @NotNull 
  @Schema(name = "programName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("programName")
  public String getProgramName() {
    return programName;
  }

  public void setProgramName(String programName) {
    this.programName = programName;
  }

  public Program programType(String programType) {
    this.programType = programType;
    return this;
  }

  /**
   * Get programType
   * @return programType
   */
  @NotNull 
  @Schema(name = "programType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("programType")
  public String getProgramType() {
    return programType;
  }

  public void setProgramType(String programType) {
    this.programType = programType;
  }

  public Program round(Integer round) {
    this.round = round;
    return this;
  }

  /**
   * Get round
   * @return round
   */
  @NotNull 
  @Schema(name = "round", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("round")
  public Integer getRound() {
    return round;
  }

  public void setRound(Integer round) {
    this.round = round;
  }

  public Program targetGroup(String targetGroup) {
    this.targetGroup = targetGroup;
    return this;
  }

  /**
   * Get targetGroup
   * @return targetGroup
   */
  @NotNull 
  @Schema(name = "targetGroup", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("targetGroup")
  public String getTargetGroup() {
    return targetGroup;
  }

  public void setTargetGroup(String targetGroup) {
    this.targetGroup = targetGroup;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Program program = (Program) o;
    return Objects.equals(this.fee, program.fee) &&
        Objects.equals(this.location, program.location) &&
        Objects.equals(this.programName, program.programName) &&
        Objects.equals(this.programType, program.programType) &&
        Objects.equals(this.round, program.round) &&
        Objects.equals(this.targetGroup, program.targetGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fee, location, programName, programType, round, targetGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Program {\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    programName: ").append(toIndentedString(programName)).append("\n");
    sb.append("    programType: ").append(toIndentedString(programType)).append("\n");
    sb.append("    round: ").append(toIndentedString(round)).append("\n");
    sb.append("    targetGroup: ").append(toIndentedString(targetGroup)).append("\n");
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

