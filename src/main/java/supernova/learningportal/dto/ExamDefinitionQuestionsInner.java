package supernova.learningportal.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * ExamDefinitionQuestionsInner
 */

@JsonTypeName("ExamDefinition_questions_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:32.815711100+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
public class ExamDefinitionQuestionsInner {

  private @Nullable String answer;

  @Valid
  private List<String> options = new ArrayList<>();

  private String questionText;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    MULTIPLE_CHOICE("MULTIPLE_CHOICE"),
    
    SUBJECTIVE("SUBJECTIVE");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  public ExamDefinitionQuestionsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ExamDefinitionQuestionsInner(String questionText, TypeEnum type) {
    this.questionText = questionText;
    this.type = type;
  }

  public ExamDefinitionQuestionsInner answer(String answer) {
    this.answer = answer;
    return this;
  }

  /**
   * Get answer
   * @return answer
   */
  
  @Schema(name = "answer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("answer")
  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public ExamDefinitionQuestionsInner options(List<String> options) {
    this.options = options;
    return this;
  }

  public ExamDefinitionQuestionsInner addOptionsItem(String optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Get options
   * @return options
   */
  
  @Schema(name = "options", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("options")
  public List<String> getOptions() {
    return options;
  }

  public void setOptions(List<String> options) {
    this.options = options;
  }

  public ExamDefinitionQuestionsInner questionText(String questionText) {
    this.questionText = questionText;
    return this;
  }

  /**
   * Get questionText
   * @return questionText
   */
  @NotNull 
  @Schema(name = "questionText", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("questionText")
  public String getQuestionText() {
    return questionText;
  }

  public void setQuestionText(String questionText) {
    this.questionText = questionText;
  }

  public ExamDefinitionQuestionsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @NotNull 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
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
    ExamDefinitionQuestionsInner examDefinitionQuestionsInner = (ExamDefinitionQuestionsInner) o;
    return Objects.equals(this.answer, examDefinitionQuestionsInner.answer) &&
        Objects.equals(this.options, examDefinitionQuestionsInner.options) &&
        Objects.equals(this.questionText, examDefinitionQuestionsInner.questionText) &&
        Objects.equals(this.type, examDefinitionQuestionsInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answer, options, questionText, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExamDefinitionQuestionsInner {\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    questionText: ").append(toIndentedString(questionText)).append("\n");
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

