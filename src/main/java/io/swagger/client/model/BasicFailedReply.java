/*
 * Elastic Cloud API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.BasicFailedReplyElement;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * BasicFailedReply
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class BasicFailedReply {
  @SerializedName("errors")
  private List<BasicFailedReplyElement> errors = new ArrayList<BasicFailedReplyElement>();

  public BasicFailedReply errors(List<BasicFailedReplyElement> errors) {
    this.errors = errors;
    return this;
  }

  public BasicFailedReply addErrorsItem(BasicFailedReplyElement errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * A list of errors that occurred in the failing request
   * @return errors
  **/
  @Schema(required = true, description = "A list of errors that occurred in the failing request")
  public List<BasicFailedReplyElement> getErrors() {
    return errors;
  }

  public void setErrors(List<BasicFailedReplyElement> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicFailedReply basicFailedReply = (BasicFailedReply) o;
    return Objects.equals(this.errors, basicFailedReply.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicFailedReply {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}