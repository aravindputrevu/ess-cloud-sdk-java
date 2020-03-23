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
 * LegacySecuritySettings
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class LegacySecuritySettings {
  @SerializedName("users_yaml")
  private String usersYaml = null;

  @SerializedName("users_roles_yaml")
  private String usersRolesYaml = null;

  @SerializedName("roles_yaml")
  private String rolesYaml = null;

  public LegacySecuritySettings usersYaml(String usersYaml) {
    this.usersYaml = usersYaml;
    return this;
  }

   /**
   * The &#x27;users&#x27; YAML Shield definition
   * @return usersYaml
  **/
  @Schema(description = "The 'users' YAML Shield definition")
  public String getUsersYaml() {
    return usersYaml;
  }

  public void setUsersYaml(String usersYaml) {
    this.usersYaml = usersYaml;
  }

  public LegacySecuritySettings usersRolesYaml(String usersRolesYaml) {
    this.usersRolesYaml = usersRolesYaml;
    return this;
  }

   /**
   * The &#x27;users_roles&#x27; YAML Shield definition
   * @return usersRolesYaml
  **/
  @Schema(description = "The 'users_roles' YAML Shield definition")
  public String getUsersRolesYaml() {
    return usersRolesYaml;
  }

  public void setUsersRolesYaml(String usersRolesYaml) {
    this.usersRolesYaml = usersRolesYaml;
  }

  public LegacySecuritySettings rolesYaml(String rolesYaml) {
    this.rolesYaml = rolesYaml;
    return this;
  }

   /**
   * The &#x27;roles&#x27; YAML Shield definition
   * @return rolesYaml
  **/
  @Schema(description = "The 'roles' YAML Shield definition")
  public String getRolesYaml() {
    return rolesYaml;
  }

  public void setRolesYaml(String rolesYaml) {
    this.rolesYaml = rolesYaml;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegacySecuritySettings legacySecuritySettings = (LegacySecuritySettings) o;
    return Objects.equals(this.usersYaml, legacySecuritySettings.usersYaml) &&
        Objects.equals(this.usersRolesYaml, legacySecuritySettings.usersRolesYaml) &&
        Objects.equals(this.rolesYaml, legacySecuritySettings.rolesYaml);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usersYaml, usersRolesYaml, rolesYaml);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegacySecuritySettings {\n");
    
    sb.append("    usersYaml: ").append(toIndentedString(usersYaml)).append("\n");
    sb.append("    usersRolesYaml: ").append(toIndentedString(usersRolesYaml)).append("\n");
    sb.append("    rolesYaml: ").append(toIndentedString(rolesYaml)).append("\n");
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