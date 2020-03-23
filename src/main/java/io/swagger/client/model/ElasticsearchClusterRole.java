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
import java.util.ArrayList;
import java.util.List;
/**
 * The authorization information for an Elasticsearch cluster user.
 */
@Schema(description = "The authorization information for an Elasticsearch cluster user.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ElasticsearchClusterRole {
  @SerializedName("username")
  private String username = null;

  @SerializedName("roles")
  private List<String> roles = new ArrayList<String>();

  public ElasticsearchClusterRole username(String username) {
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

  public ElasticsearchClusterRole roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public ElasticsearchClusterRole addRolesItem(String rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * The list of roles for this user
   * @return roles
  **/
  @Schema(required = true, description = "The list of roles for this user")
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticsearchClusterRole elasticsearchClusterRole = (ElasticsearchClusterRole) o;
    return Objects.equals(this.username, elasticsearchClusterRole.username) &&
        Objects.equals(this.roles, elasticsearchClusterRole.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, roles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticsearchClusterRole {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
