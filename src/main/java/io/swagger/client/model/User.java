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
import io.swagger.client.model.UserMetadata;
import io.swagger.client.model.UserSecurity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * An API user
 */
@Schema(description = "An API user")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class User {
  @SerializedName("user_name")
  private String userName = null;

  @SerializedName("security")
  private UserSecurity security = null;

  @SerializedName("metadata")
  private UserMetadata metadata = null;

  @SerializedName("full_name")
  private String fullName = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("builtin")
  private Boolean builtin = null;

  public User userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * The user&#x27;s identifier
   * @return userName
  **/
  @Schema(required = true, description = "The user's identifier")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public User security(UserSecurity security) {
    this.security = security;
    return this;
  }

   /**
   * Get security
   * @return security
  **/
  @Schema(required = true, description = "")
  public UserSecurity getSecurity() {
    return security;
  }

  public void setSecurity(UserSecurity security) {
    this.security = security;
  }

  public User metadata(UserMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Schema(description = "")
  public UserMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(UserMetadata metadata) {
    this.metadata = metadata;
  }

  public User fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * The user&#x27;s optional full name
   * @return fullName
  **/
  @Schema(description = "The user's optional full name")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The user&#x27;s optional email address
   * @return email
  **/
  @Schema(description = "The user's optional email address")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User builtin(Boolean builtin) {
    this.builtin = builtin;
    return this;
  }

   /**
   * True if the user is a built-in read-only user
   * @return builtin
  **/
  @Schema(description = "True if the user is a built-in read-only user")
  public Boolean isBuiltin() {
    return builtin;
  }

  public void setBuiltin(Boolean builtin) {
    this.builtin = builtin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.userName, user.userName) &&
        Objects.equals(this.security, user.security) &&
        Objects.equals(this.metadata, user.metadata) &&
        Objects.equals(this.fullName, user.fullName) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.builtin, user.builtin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, security, metadata, fullName, email, builtin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    builtin: ").append(toIndentedString(builtin)).append("\n");
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