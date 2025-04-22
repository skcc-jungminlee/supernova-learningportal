package supernova.learningportal.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * EnrollmentPayment
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:32.815711100+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
public class EnrollmentPayment {

  private BigDecimal amount;

  private String enrollmentId;

  private @Nullable String payerName;

  /**
   * Gets or Sets paymentMethod
   */
  public enum PaymentMethodEnum {
    CARD("CARD"),
    
    BANK_TRANSFER("BANK_TRANSFER"),
    
    MOBILE("MOBILE");

    private String value;

    PaymentMethodEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PaymentMethodEnum fromValue(String value) {
      for (PaymentMethodEnum b : PaymentMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PaymentMethodEnum paymentMethod;

  public EnrollmentPayment() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EnrollmentPayment(BigDecimal amount, String enrollmentId, PaymentMethodEnum paymentMethod) {
    this.amount = amount;
    this.enrollmentId = enrollmentId;
    this.paymentMethod = paymentMethod;
  }

  public EnrollmentPayment amount(BigDecimal amount) {
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

  public EnrollmentPayment enrollmentId(String enrollmentId) {
    this.enrollmentId = enrollmentId;
    return this;
  }

  /**
   * Get enrollmentId
   * @return enrollmentId
   */
  @NotNull 
  @Schema(name = "enrollmentId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("enrollmentId")
  public String getEnrollmentId() {
    return enrollmentId;
  }

  public void setEnrollmentId(String enrollmentId) {
    this.enrollmentId = enrollmentId;
  }

  public EnrollmentPayment payerName(String payerName) {
    this.payerName = payerName;
    return this;
  }

  /**
   * Get payerName
   * @return payerName
   */
  
  @Schema(name = "payerName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("payerName")
  public String getPayerName() {
    return payerName;
  }

  public void setPayerName(String payerName) {
    this.payerName = payerName;
  }

  public EnrollmentPayment paymentMethod(PaymentMethodEnum paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Get paymentMethod
   * @return paymentMethod
   */
  @NotNull 
  @Schema(name = "paymentMethod", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("paymentMethod")
  public PaymentMethodEnum getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethodEnum paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnrollmentPayment enrollmentPayment = (EnrollmentPayment) o;
    return Objects.equals(this.amount, enrollmentPayment.amount) &&
        Objects.equals(this.enrollmentId, enrollmentPayment.enrollmentId) &&
        Objects.equals(this.payerName, enrollmentPayment.payerName) &&
        Objects.equals(this.paymentMethod, enrollmentPayment.paymentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, enrollmentId, payerName, paymentMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrollmentPayment {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    enrollmentId: ").append(toIndentedString(enrollmentId)).append("\n");
    sb.append("    payerName: ").append(toIndentedString(payerName)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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

