package supernova.learningportal.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import supernova.learningportal.dto.SurveyDefinitionQuestionsInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SurveyDefinition
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:32.815711100+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
public class SurveyDefinition {

  @Valid
  private List<@Valid SurveyDefinitionQuestionsInner> questions = new ArrayList<>();

  private String title;

  public SurveyDefinition() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SurveyDefinition(List<@Valid SurveyDefinitionQuestionsInner> questions, String title) {
    this.questions = questions;
    this.title = title;
  }

  public SurveyDefinition questions(List<@Valid SurveyDefinitionQuestionsInner> questions) {
    this.questions = questions;
    return this;
  }

  public SurveyDefinition addQuestionsItem(SurveyDefinitionQuestionsInner questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<>();
    }
    this.questions.add(questionsItem);
    return this;
  }

  /**
   * Get questions
   * @return questions
   */
  @NotNull @Valid 
  @Schema(name = "questions", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("questions")
  public List<@Valid SurveyDefinitionQuestionsInner> getQuestions() {
    return questions;
  }

  public void setQuestions(List<@Valid SurveyDefinitionQuestionsInner> questions) {
    this.questions = questions;
  }

  public SurveyDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @NotNull 
  @Schema(name = "title", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurveyDefinition surveyDefinition = (SurveyDefinition) o;
    return Objects.equals(this.questions, surveyDefinition.questions) &&
        Objects.equals(this.title, surveyDefinition.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questions, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyDefinition {\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

