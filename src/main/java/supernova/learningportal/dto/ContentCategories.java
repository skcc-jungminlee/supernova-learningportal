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
 * ContentCategories
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:32.815711100+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
public class ContentCategories {

  private String field;

  private String targetLevel;

  private String type;

  public ContentCategories() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ContentCategories(String field, String targetLevel, String type) {
    this.field = field;
    this.targetLevel = targetLevel;
    this.type = type;
  }

  public ContentCategories field(String field) {
    this.field = field;
    return this;
  }

  /**
   * 예: 지도자, 심판
   * @return field
   */
  @NotNull 
  @Schema(name = "field", description = "예: 지도자, 심판", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("field")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public ContentCategories targetLevel(String targetLevel) {
    this.targetLevel = targetLevel;
    return this;
  }

  /**
   * 예: 초급, 중급, 고급
   * @return targetLevel
   */
  @NotNull 
  @Schema(name = "targetLevel", description = "예: 초급, 중급, 고급", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("targetLevel")
  public String getTargetLevel() {
    return targetLevel;
  }

  public void setTargetLevel(String targetLevel) {
    this.targetLevel = targetLevel;
  }

  public ContentCategories type(String type) {
    this.type = type;
    return this;
  }

  /**
   * 예: 기초, 심화
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "예: 기초, 심화", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentCategories contentCategories = (ContentCategories) o;
    return Objects.equals(this.field, contentCategories.field) &&
        Objects.equals(this.targetLevel, contentCategories.targetLevel) &&
        Objects.equals(this.type, contentCategories.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, targetLevel, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentCategories {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    targetLevel: ").append(toIndentedString(targetLevel)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

