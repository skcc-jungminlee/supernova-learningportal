package supernova.learningportal.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import supernova.learningportal.dto.MixedModeSettingsOfflineSchedule;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MixedModeSettings
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:32.815711100+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
public class MixedModeSettings {

  private @Nullable Integer attendanceRate;

  private String completionConditions;

  /**
   * Gets or Sets mode
   */
  public enum ModeEnum {
    ONLINE_ONLY("ONLINE_ONLY"),
    
    OFFLINE_ONLY("OFFLINE_ONLY"),
    
    MIXED("MIXED");

    private String value;

    ModeEnum(String value) {
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
    public static ModeEnum fromValue(String value) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ModeEnum mode;

  private @Nullable MixedModeSettingsOfflineSchedule offlineSchedule;

  private @Nullable String onlineContentId;

  private @Nullable Integer progressRate;

  public MixedModeSettings() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MixedModeSettings(String completionConditions, ModeEnum mode) {
    this.completionConditions = completionConditions;
    this.mode = mode;
  }

  public MixedModeSettings attendanceRate(Integer attendanceRate) {
    this.attendanceRate = attendanceRate;
    return this;
  }

  /**
   * Get attendanceRate
   * @return attendanceRate
   */
  
  @Schema(name = "attendanceRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attendanceRate")
  public Integer getAttendanceRate() {
    return attendanceRate;
  }

  public void setAttendanceRate(Integer attendanceRate) {
    this.attendanceRate = attendanceRate;
  }

  public MixedModeSettings completionConditions(String completionConditions) {
    this.completionConditions = completionConditions;
    return this;
  }

  /**
   * Get completionConditions
   * @return completionConditions
   */
  @NotNull 
  @Schema(name = "completionConditions", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("completionConditions")
  public String getCompletionConditions() {
    return completionConditions;
  }

  public void setCompletionConditions(String completionConditions) {
    this.completionConditions = completionConditions;
  }

  public MixedModeSettings mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * @return mode
   */
  @NotNull 
  @Schema(name = "mode", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mode")
  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public MixedModeSettings offlineSchedule(MixedModeSettingsOfflineSchedule offlineSchedule) {
    this.offlineSchedule = offlineSchedule;
    return this;
  }

  /**
   * Get offlineSchedule
   * @return offlineSchedule
   */
  @Valid 
  @Schema(name = "offlineSchedule", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offlineSchedule")
  public MixedModeSettingsOfflineSchedule getOfflineSchedule() {
    return offlineSchedule;
  }

  public void setOfflineSchedule(MixedModeSettingsOfflineSchedule offlineSchedule) {
    this.offlineSchedule = offlineSchedule;
  }

  public MixedModeSettings onlineContentId(String onlineContentId) {
    this.onlineContentId = onlineContentId;
    return this;
  }

  /**
   * Get onlineContentId
   * @return onlineContentId
   */
  
  @Schema(name = "onlineContentId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("onlineContentId")
  public String getOnlineContentId() {
    return onlineContentId;
  }

  public void setOnlineContentId(String onlineContentId) {
    this.onlineContentId = onlineContentId;
  }

  public MixedModeSettings progressRate(Integer progressRate) {
    this.progressRate = progressRate;
    return this;
  }

  /**
   * Get progressRate
   * @return progressRate
   */
  
  @Schema(name = "progressRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("progressRate")
  public Integer getProgressRate() {
    return progressRate;
  }

  public void setProgressRate(Integer progressRate) {
    this.progressRate = progressRate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MixedModeSettings mixedModeSettings = (MixedModeSettings) o;
    return Objects.equals(this.attendanceRate, mixedModeSettings.attendanceRate) &&
        Objects.equals(this.completionConditions, mixedModeSettings.completionConditions) &&
        Objects.equals(this.mode, mixedModeSettings.mode) &&
        Objects.equals(this.offlineSchedule, mixedModeSettings.offlineSchedule) &&
        Objects.equals(this.onlineContentId, mixedModeSettings.onlineContentId) &&
        Objects.equals(this.progressRate, mixedModeSettings.progressRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attendanceRate, completionConditions, mode, offlineSchedule, onlineContentId, progressRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MixedModeSettings {\n");
    sb.append("    attendanceRate: ").append(toIndentedString(attendanceRate)).append("\n");
    sb.append("    completionConditions: ").append(toIndentedString(completionConditions)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    offlineSchedule: ").append(toIndentedString(offlineSchedule)).append("\n");
    sb.append("    onlineContentId: ").append(toIndentedString(onlineContentId)).append("\n");
    sb.append("    progressRate: ").append(toIndentedString(progressRate)).append("\n");
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

