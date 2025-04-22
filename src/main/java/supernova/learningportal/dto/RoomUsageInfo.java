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
 * RoomUsageInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:32.815711100+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
public class RoomUsageInfo {

  @Valid
  private List<String> availableDays = new ArrayList<>();

  private String availableTime;

  private @Nullable String notes;

  public RoomUsageInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RoomUsageInfo(List<String> availableDays, String availableTime) {
    this.availableDays = availableDays;
    this.availableTime = availableTime;
  }

  public RoomUsageInfo availableDays(List<String> availableDays) {
    this.availableDays = availableDays;
    return this;
  }

  public RoomUsageInfo addAvailableDaysItem(String availableDaysItem) {
    if (this.availableDays == null) {
      this.availableDays = new ArrayList<>();
    }
    this.availableDays.add(availableDaysItem);
    return this;
  }

  /**
   * Get availableDays
   * @return availableDays
   */
  @NotNull 
  @Schema(name = "availableDays", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("availableDays")
  public List<String> getAvailableDays() {
    return availableDays;
  }

  public void setAvailableDays(List<String> availableDays) {
    this.availableDays = availableDays;
  }

  public RoomUsageInfo availableTime(String availableTime) {
    this.availableTime = availableTime;
    return this;
  }

  /**
   * Get availableTime
   * @return availableTime
   */
  @NotNull 
  @Schema(name = "availableTime", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("availableTime")
  public String getAvailableTime() {
    return availableTime;
  }

  public void setAvailableTime(String availableTime) {
    this.availableTime = availableTime;
  }

  public RoomUsageInfo notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
   */
  
  @Schema(name = "notes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomUsageInfo roomUsageInfo = (RoomUsageInfo) o;
    return Objects.equals(this.availableDays, roomUsageInfo.availableDays) &&
        Objects.equals(this.availableTime, roomUsageInfo.availableTime) &&
        Objects.equals(this.notes, roomUsageInfo.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableDays, availableTime, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomUsageInfo {\n");
    sb.append("    availableDays: ").append(toIndentedString(availableDays)).append("\n");
    sb.append("    availableTime: ").append(toIndentedString(availableTime)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

