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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The request payload that creates the API keys.
 */
@Schema(description = "The request payload that creates the API keys.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class CreateApiKeyRequest {
  @SerializedName("description")
  private String description = null;

  @SerializedName("authentication_token")
  private String authenticationToken = null;

  public CreateApiKeyRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * API key description. Useful if there are multiple keys
   * @return description
  **/
  @Schema(required = true, description = "API key description. Useful if there are multiple keys")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateApiKeyRequest authenticationToken(String authenticationToken) {
    this.authenticationToken = authenticationToken;
    return this;
  }

   /**
   * The security token from reauthenticate API
   * @return authenticationToken
  **/
  @Schema(required = true, description = "The security token from reauthenticate API")
  public String getAuthenticationToken() {
    return authenticationToken;
  }

  public void setAuthenticationToken(String authenticationToken) {
    this.authenticationToken = authenticationToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateApiKeyRequest createApiKeyRequest = (CreateApiKeyRequest) o;
    return Objects.equals(this.description, createApiKeyRequest.description) &&
        Objects.equals(this.authenticationToken, createApiKeyRequest.authenticationToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, authenticationToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateApiKeyRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    authenticationToken: ").append(toIndentedString(authenticationToken)).append("\n");
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