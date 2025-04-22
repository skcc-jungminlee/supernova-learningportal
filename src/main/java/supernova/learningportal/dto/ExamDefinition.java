package supernova.learningportal.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import supernova.learningportal.dto.ExamDefinitionQuestionsInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ExamDefinition
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:32.815711100+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
public class ExamDefinition {

  private String courseId;

  private @Nullable Integer durationMinutes;

  @Valid
  private List<@Valid ExamDefinitionQuestionsInner> questions = new ArrayList<>();

  private String title;

  public ExamDefinition() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ExamDefinition(String courseId, List<@Valid ExamDefinitionQuestionsInner> questions, String title) {
    this.courseId = courseId;
    this.questions = questions;
    this.title = title;
  }

  public ExamDefinition courseId(String courseId) {
    this.courseId = courseId;
    return this;
  }

  /**
   * Get courseId
   * @return courseId
   */
  @NotNull 
  @Schema(name = "courseId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("courseId")
  public String getCourseId() {
    return courseId;
  }

  public void setCourseId(String courseId) {
    this.courseId = courseId;
  }

  public ExamDefinition durationMinutes(Integer durationMinutes) {
    this.durationMinutes = durationMinutes;
    return this;
  }

  /**
   * Get durationMinutes
   * @return durationMinutes
   */
  
  @Schema(name = "durationMinutes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("durationMinutes")
  public Integer getDurationMinutes() {
    return durationMinutes;
  }

  public void setDurationMinutes(Integer durationMinutes) {
    this.durationMinutes = durationMinutes;
  }

  public ExamDefinition questions(List<@Valid ExamDefinitionQuestionsInner> questions) {
    this.questions = questions;
    return this;
  }

  public ExamDefinition addQuestionsItem(ExamDefinitionQuestionsInner questionsItem) {
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
  public List<@Valid ExamDefinitionQuestionsInner> getQuestions() {
    return questions;
  }

  public void setQuestions(List<@Valid ExamDefinitionQuestionsInner> questions) {
    this.questions = questions;
  }

  public ExamDefinition title(String title) {
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
    ExamDefinition examDefinition = (ExamDefinition) o;
    return Objects.equals(this.courseId, examDefinition.courseId) &&
        Objects.equals(this.durationMinutes, examDefinition.durationMinutes) &&
        Objects.equals(this.questions, examDefinition.questions) &&
        Objects.equals(this.title, examDefinition.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseId, durationMinutes, questions, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExamDefinition {\n");
    sb.append("    courseId: ").append(toIndentedString(courseId)).append("\n");
    sb.append("    durationMinutes: ").append(toIndentedString(durationMinutes)).append("\n");
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

