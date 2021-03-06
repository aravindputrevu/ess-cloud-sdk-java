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
 * The information about an Elasticsearch cluster user.
 */
@Schema(description = "The information about an Elasticsearch cluster user.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ElasticsearchClusterUser {
  @SerializedName("username")
  private String username = null;

  @SerializedName("password_hash")
  private String passwordHash = null;

  public ElasticsearchClusterUser username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The username
   * @return username
  **/
  @Schema(required = true, description = "The username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public ElasticsearchClusterUser passwordHash(String passwordHash) {
    this.passwordHash = passwordHash;
    return this;
  }

   /**
   * The hashed password
   * @return passwordHash
  **/
  @Schema(required = true, description = "The hashed password")
  public String getPasswordHash() {
    return passwordHash;
  }

  public void setPasswordHash(String passwordHash) {
    this.passwordHash = passwordHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticsearchClusterUser elasticsearchClusterUser = (ElasticsearchClusterUser) o;
    return Objects.equals(this.username, elasticsearchClusterUser.username) &&
        Objects.equals(this.passwordHash, elasticsearchClusterUser.passwordHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, passwordHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticsearchClusterUser {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    passwordHash: ").append(toIndentedString(passwordHash)).append("\n");
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
