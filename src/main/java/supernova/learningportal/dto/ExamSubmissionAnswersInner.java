package supernova.learningportal.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ExamSubmissionAnswersInner
 */

@JsonTypeName("ExamSubmission_answers_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:32.815711100+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
public class ExamSubmissionAnswersInner {

  private String answer;

  private String questionId;

  public ExamSubmissionAnswersInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ExamSubmissionAnswersInner(String answer, String questionId) {
    this.answer = answer;
    this.questionId = questionId;
  }

  public ExamSubmissionAnswersInner answer(String answer) {
    this.answer = answer;
    return this;
  }

  /**
   * Get answer
   * @return answer
   */
  @NotNull 
  @Schema(name = "answer", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("answer")
  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public ExamSubmissionAnswersInner questionId(String questionId) {
    this.questionId = questionId;
    return this;
  }

  /**
   * Get questionId
   * @return questionId
   */
  @NotNull 
  @Schema(name = "questionId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("questionId")
  public String getQuestionId() {
    return questionId;
  }

  public void setQuestionId(String questionId) {
    this.questionId = questionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExamSubmissionAnswersInner examSubmissionAnswersInner = (ExamSubmissionAnswersInner) o;
    return Objects.equals(this.answer, examSubmissionAnswersInner.answer) &&
        Objects.equals(this.questionId, examSubmissionAnswersInner.questionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answer, questionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExamSubmissionAnswersInner {\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
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

