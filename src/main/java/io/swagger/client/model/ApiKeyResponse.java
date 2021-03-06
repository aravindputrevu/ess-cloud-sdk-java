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
import org.threeten.bp.OffsetDateTime;
/**
 * The response model for an API key.
 */
@Schema(description = "The response model for an API key.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ApiKeyResponse {
  @SerializedName("id")
  private String id = null;

  @SerializedName("user_id")
  private String userId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("creation_date")
  private OffsetDateTime creationDate = null;

  public ApiKeyResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The API key ID.
   * @return id
  **/
  @Schema(required = true, description = "The API key ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ApiKeyResponse userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The user ID.
   * @return userId
  **/
  @Schema(description = "The user ID.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public ApiKeyResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The API key description. TIP: Useful when you have multiple API keys.
   * @return description
  **/
  @Schema(required = true, description = "The API key description. TIP: Useful when you have multiple API keys.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ApiKeyResponse key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The API key. TIP: Since the API key is returned only once, save it in a safe place.
   * @return key
  **/
  @Schema(description = "The API key. TIP: Since the API key is returned only once, save it in a safe place.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ApiKeyResponse creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * The date/time for when the API key is created.
   * @return creationDate
  **/
  @Schema(required = true, description = "The date/time for when the API key is created.")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKeyResponse apiKeyResponse = (ApiKeyResponse) o;
    return Objects.equals(this.id, apiKeyResponse.id) &&
        Objects.equals(this.userId, apiKeyResponse.userId) &&
        Objects.equals(this.description, apiKeyResponse.description) &&
        Objects.equals(this.key, apiKeyResponse.key) &&
        Objects.equals(this.creationDate, apiKeyResponse.creationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, description, key, creationDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
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
