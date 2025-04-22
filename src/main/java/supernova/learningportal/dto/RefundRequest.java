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
 * RefundRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:32.815711100+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
public class RefundRequest {

  private @Nullable String bankAccount;

  private String reason;

  private BigDecimal refundAmount;

  public RefundRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RefundRequest(String reason, BigDecimal refundAmount) {
    this.reason = reason;
    this.refundAmount = refundAmount;
  }

  public RefundRequest bankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

  /**
   * Get bankAccount
   * @return bankAccount
   */
  
  @Schema(name = "bankAccount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bankAccount")
  public String getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }

  public RefundRequest reason(String reason) {
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

  public RefundRequest refundAmount(BigDecimal refundAmount) {
    this.refundAmount = refundAmount;
    return this;
  }

  /**
   * Get refundAmount
   * @return refundAmount
   */
  @NotNull @Valid 
  @Schema(name = "refundAmount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("refundAmount")
  public BigDecimal getRefundAmount() {
    return refundAmount;
  }

  public void setRefundAmount(BigDecimal refundAmount) {
    this.refundAmount = refundAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundRequest refundRequest = (RefundRequest) o;
    return Objects.equals(this.bankAccount, refundRequest.bankAccount) &&
        Objects.equals(this.reason, refundRequest.reason) &&
        Objects.equals(this.refundAmount, refundRequest.refundAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccount, reason, refundAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundRequest {\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
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

