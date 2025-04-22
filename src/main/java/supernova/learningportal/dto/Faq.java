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
 * Faq
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:32.815711100+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
public class Faq {

  private String answer;

  private @Nullable String category;

  private String question;

  public Faq() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Faq(String answer, String question) {
    this.answer = answer;
    this.question = question;
  }

  public Faq answer(String answer) {
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

  public Faq category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
   */
  
  @Schema(name = "category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Faq question(String question) {
    this.question = question;
    return this;
  }

  /**
   * Get question
   * @return question
   */
  @NotNull 
  @Schema(name = "question", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("question")
  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Faq faq = (Faq) o;
    return Objects.equals(this.answer, faq.answer) &&
        Objects.equals(this.category, faq.category) &&
        Objects.equals(this.question, faq.question);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answer, category, question);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Faq {\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
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

