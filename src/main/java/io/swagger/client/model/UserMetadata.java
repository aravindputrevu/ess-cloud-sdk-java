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
 * Metadata for a user
 */
@Schema(description = "Metadata for a user")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class UserMetadata {
  @SerializedName("created_by")
  private String createdBy = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("updated_by")
  private String updatedBy = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  @SerializedName("first_login_at")
  private OffsetDateTime firstLoginAt = null;

  @SerializedName("last_login_at")
  private OffsetDateTime lastLoginAt = null;

  public UserMetadata createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * The Id of the user that created this user
   * @return createdBy
  **/
  @Schema(description = "The Id of the user that created this user")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public UserMetadata createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time when the user was created
   * @return createdAt
  **/
  @Schema(description = "The date and time when the user was created")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public UserMetadata updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

   /**
   * The Id of the user that last updated this user
   * @return updatedBy
  **/
  @Schema(description = "The Id of the user that last updated this user")
  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  public UserMetadata updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time when the user was last updated
   * @return updatedAt
  **/
  @Schema(description = "The date and time when the user was last updated")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public UserMetadata firstLoginAt(OffsetDateTime firstLoginAt) {
    this.firstLoginAt = firstLoginAt;
    return this;
  }

   /**
   * The date and time when the user first logged in
   * @return firstLoginAt
  **/
  @Schema(description = "The date and time when the user first logged in")
  public OffsetDateTime getFirstLoginAt() {
    return firstLoginAt;
  }

  public void setFirstLoginAt(OffsetDateTime firstLoginAt) {
    this.firstLoginAt = firstLoginAt;
  }

  public UserMetadata lastLoginAt(OffsetDateTime lastLoginAt) {
    this.lastLoginAt = lastLoginAt;
    return this;
  }

   /**
   * The date and time when the user last logged in
   * @return lastLoginAt
  **/
  @Schema(description = "The date and time when the user last logged in")
  public OffsetDateTime getLastLoginAt() {
    return lastLoginAt;
  }

  public void setLastLoginAt(OffsetDateTime lastLoginAt) {
    this.lastLoginAt = lastLoginAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserMetadata userMetadata = (UserMetadata) o;
    return Objects.equals(this.createdBy, userMetadata.createdBy) &&
        Objects.equals(this.createdAt, userMetadata.createdAt) &&
        Objects.equals(this.updatedBy, userMetadata.updatedBy) &&
        Objects.equals(this.updatedAt, userMetadata.updatedAt) &&
        Objects.equals(this.firstLoginAt, userMetadata.firstLoginAt) &&
        Objects.equals(this.lastLoginAt, userMetadata.lastLoginAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdAt, updatedBy, updatedAt, firstLoginAt, lastLoginAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserMetadata {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    firstLoginAt: ").append(toIndentedString(firstLoginAt)).append("\n");
    sb.append("    lastLoginAt: ").append(toIndentedString(lastLoginAt)).append("\n");
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