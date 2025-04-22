package supernova.learningportal.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
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
 * ReservationRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:32.815711100+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
public class ReservationRequest {

  private @Nullable String applicantContact;

  private String applicantName;

  /**
   * Gets or Sets applicantType
   */
  public enum ApplicantTypeEnum {
    INTERNAL("INTERNAL"),
    
    EXTERNAL("EXTERNAL");

    private String value;

    ApplicantTypeEnum(String value) {
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
    public static ApplicantTypeEnum fromValue(String value) {
      for (ApplicantTypeEnum b : ApplicantTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ApplicantTypeEnum applicantType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDateTime;

  private String roomId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDateTime;

  public ReservationRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ReservationRequest(String applicantName, OffsetDateTime endDateTime, String roomId, OffsetDateTime startDateTime) {
    this.applicantName = applicantName;
    this.endDateTime = endDateTime;
    this.roomId = roomId;
    this.startDateTime = startDateTime;
  }

  public ReservationRequest applicantContact(String applicantContact) {
    this.applicantContact = applicantContact;
    return this;
  }

  /**
   * Get applicantContact
   * @return applicantContact
   */
  
  @Schema(name = "applicantContact", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("applicantContact")
  public String getApplicantContact() {
    return applicantContact;
  }

  public void setApplicantContact(String applicantContact) {
    this.applicantContact = applicantContact;
  }

  public ReservationRequest applicantName(String applicantName) {
    this.applicantName = applicantName;
    return this;
  }

  /**
   * Get applicantName
   * @return applicantName
   */
  @NotNull 
  @Schema(name = "applicantName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("applicantName")
  public String getApplicantName() {
    return applicantName;
  }

  public void setApplicantName(String applicantName) {
    this.applicantName = applicantName;
  }

  public ReservationRequest applicantType(ApplicantTypeEnum applicantType) {
    this.applicantType = applicantType;
    return this;
  }

  /**
   * Get applicantType
   * @return applicantType
   */
  
  @Schema(name = "applicantType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("applicantType")
  public ApplicantTypeEnum getApplicantType() {
    return applicantType;
  }

  public void setApplicantType(ApplicantTypeEnum applicantType) {
    this.applicantType = applicantType;
  }

  public ReservationRequest endDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

  /**
   * Get endDateTime
   * @return endDateTime
   */
  @NotNull @Valid 
  @Schema(name = "endDateTime", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("endDateTime")
  public OffsetDateTime getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
  }

  public ReservationRequest roomId(String roomId) {
    this.roomId = roomId;
    return this;
  }

  /**
   * Get roomId
   * @return roomId
   */
  @NotNull 
  @Schema(name = "roomId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("roomId")
  public String getRoomId() {
    return roomId;
  }

  public void setRoomId(String roomId) {
    this.roomId = roomId;
  }

  public ReservationRequest startDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

  /**
   * Get startDateTime
   * @return startDateTime
   */
  @NotNull @Valid 
  @Schema(name = "startDateTime", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("startDateTime")
  public OffsetDateTime getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservationRequest reservationRequest = (ReservationRequest) o;
    return Objects.equals(this.applicantContact, reservationRequest.applicantContact) &&
        Objects.equals(this.applicantName, reservationRequest.applicantName) &&
        Objects.equals(this.applicantType, reservationRequest.applicantType) &&
        Objects.equals(this.endDateTime, reservationRequest.endDateTime) &&
        Objects.equals(this.roomId, reservationRequest.roomId) &&
        Objects.equals(this.startDateTime, reservationRequest.startDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicantContact, applicantName, applicantType, endDateTime, roomId, startDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservationRequest {\n");
    sb.append("    applicantContact: ").append(toIndentedString(applicantContact)).append("\n");
    sb.append("    applicantName: ").append(toIndentedString(applicantName)).append("\n");
    sb.append("    applicantType: ").append(toIndentedString(applicantType)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
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

