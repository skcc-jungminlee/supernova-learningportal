package supernova.learningportal.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * ProgramSchedule
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:32.815711100+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
public class ProgramSchedule {

  @Valid
  private List<String> days = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate endDate;

  private @Nullable String roomId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate startDate;

  private String time;

  public ProgramSchedule() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProgramSchedule(List<String> days, LocalDate endDate, LocalDate startDate, String time) {
    this.days = days;
    this.endDate = endDate;
    this.startDate = startDate;
    this.time = time;
  }

  public ProgramSchedule days(List<String> days) {
    this.days = days;
    return this;
  }

  public ProgramSchedule addDaysItem(String daysItem) {
    if (this.days == null) {
      this.days = new ArrayList<>();
    }
    this.days.add(daysItem);
    return this;
  }

  /**
   * Get days
   * @return days
   */
  @NotNull 
  @Schema(name = "days", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("days")
  public List<String> getDays() {
    return days;
  }

  public void setDays(List<String> days) {
    this.days = days;
  }

  public ProgramSchedule endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  @NotNull @Valid 
  @Schema(name = "endDate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("endDate")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public ProgramSchedule roomId(String roomId) {
    this.roomId = roomId;
    return this;
  }

  /**
   * Get roomId
   * @return roomId
   */
  
  @Schema(name = "roomId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roomId")
  public String getRoomId() {
    return roomId;
  }

  public void setRoomId(String roomId) {
    this.roomId = roomId;
  }

  public ProgramSchedule startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  @NotNull @Valid 
  @Schema(name = "startDate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("startDate")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public ProgramSchedule time(String time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
   */
  @NotNull 
  @Schema(name = "time", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("time")
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgramSchedule programSchedule = (ProgramSchedule) o;
    return Objects.equals(this.days, programSchedule.days) &&
        Objects.equals(this.endDate, programSchedule.endDate) &&
        Objects.equals(this.roomId, programSchedule.roomId) &&
        Objects.equals(this.startDate, programSchedule.startDate) &&
        Objects.equals(this.time, programSchedule.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(days, endDate, roomId, startDate, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgramSchedule {\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

