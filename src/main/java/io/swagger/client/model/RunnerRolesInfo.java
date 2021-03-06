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
import io.swagger.client.model.RunnerRoleInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * A list of runner roles.
 */
@Schema(description = "A list of runner roles.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class RunnerRolesInfo {
  @SerializedName("roles")
  private List<RunnerRoleInfo> roles = new ArrayList<RunnerRoleInfo>();

  public RunnerRolesInfo roles(List<RunnerRoleInfo> roles) {
    this.roles = roles;
    return this;
  }

  public RunnerRolesInfo addRolesItem(RunnerRoleInfo rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * List of roles
   * @return roles
  **/
  @Schema(required = true, description = "List of roles")
  public List<RunnerRoleInfo> getRoles() {
    return roles;
  }

  public void setRoles(List<RunnerRoleInfo> roles) {
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
    RunnerRolesInfo runnerRolesInfo = (RunnerRolesInfo) o;
    return Objects.equals(this.roles, runnerRolesInfo.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunnerRolesInfo {\n");
    
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
