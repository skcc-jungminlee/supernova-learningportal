package supernova.learningportal.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import supernova.learningportal.dto.ExamSubmissionAnswersInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SurveyResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:32.815711100+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
public class SurveyResponse {

  @Valid
  private List<@Valid ExamSubmissionAnswersInner> answers = new ArrayList<>();

  public SurveyResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SurveyResponse(List<@Valid ExamSubmissionAnswersInner> answers) {
    this.answers = answers;
  }

  public SurveyResponse answers(List<@Valid ExamSubmissionAnswersInner> answers) {
    this.answers = answers;
    return this;
  }

  public SurveyResponse addAnswersItem(ExamSubmissionAnswersInner answersItem) {
    if (this.answers == null) {
      this.answers = new ArrayList<>();
    }
    this.answers.add(answersItem);
    return this;
  }

  /**
   * Get answers
   * @return answers
   */
  @NotNull @Valid 
  @Schema(name = "answers", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("answers")
  public List<@Valid ExamSubmissionAnswersInner> getAnswers() {
    return answers;
  }

  public void setAnswers(List<@Valid ExamSubmissionAnswersInner> answers) {
    this.answers = answers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurveyResponse surveyResponse = (SurveyResponse) o;
    return Objects.equals(this.answers, surveyResponse.answers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyResponse {\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
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

