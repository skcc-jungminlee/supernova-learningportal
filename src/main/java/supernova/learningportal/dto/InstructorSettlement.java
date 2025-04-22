package supernova.learningportal.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.time.LocalDate;
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
 * InstructorSettlement
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:32.815711100+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
public class InstructorSettlement {

  private BigDecimal amount;

  private String instructorId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate paymentDate;

  private String programId;

  public InstructorSettlement() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public InstructorSettlement(BigDecimal amount, String instructorId, String programId) {
    this.amount = amount;
    this.instructorId = instructorId;
    this.programId = programId;
  }

  public InstructorSettlement amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @NotNull @Valid 
  @Schema(name = "amount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public InstructorSettlement instructorId(String instructorId) {
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

  public InstructorSettlement paymentDate(LocalDate paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

  /**
   * Get paymentDate
   * @return paymentDate
   */
  @Valid 
  @Schema(name = "paymentDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentDate")
  public LocalDate getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(LocalDate paymentDate) {
    this.paymentDate = paymentDate;
  }

  public InstructorSettlement programId(String programId) {
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
    InstructorSettlement instructorSettlement = (InstructorSettlement) o;
    return Objects.equals(this.amount, instructorSettlement.amount) &&
        Objects.equals(this.instructorId, instructorSettlement.instructorId) &&
        Objects.equals(this.paymentDate, instructorSettlement.paymentDate) &&
        Objects.equals(this.programId, instructorSettlement.programId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, instructorId, paymentDate, programId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstructorSettlement {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    instructorId: ").append(toIndentedString(instructorId)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
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

