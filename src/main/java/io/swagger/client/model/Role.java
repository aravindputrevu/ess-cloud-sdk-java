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
import io.swagger.client.model.ContainersEntry;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Describes whether certain runners are blessed to run a Role.
 */
@Schema(description = "Describes whether certain runners are blessed to run a Role.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class Role {
  @SerializedName("id")
  private String id = null;

  @SerializedName("auto_blessed")
  private Boolean autoBlessed = null;

  @SerializedName("containers")
  private List<ContainersEntry> containers = new ArrayList<ContainersEntry>();

  public Role id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique id of this role
   * @return id
  **/
  @Schema(example = "constructor", required = true, description = "The unique id of this role")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Role autoBlessed(Boolean autoBlessed) {
    this.autoBlessed = autoBlessed;
    return this;
  }

   /**
   * Whether runners are automatically allowed to be assigned the containers of this role.
   * @return autoBlessed
  **/
  @Schema(required = true, description = "Whether runners are automatically allowed to be assigned the containers of this role.")
  public Boolean isAutoBlessed() {
    return autoBlessed;
  }

  public void setAutoBlessed(Boolean autoBlessed) {
    this.autoBlessed = autoBlessed;
  }

  public Role containers(List<ContainersEntry> containers) {
    this.containers = containers;
    return this;
  }

  public Role addContainersItem(ContainersEntry containersItem) {
    this.containers.add(containersItem);
    return this;
  }

   /**
   * The containers that are part of this role
   * @return containers
  **/
  @Schema(required = true, description = "The containers that are part of this role")
  public List<ContainersEntry> getContainers() {
    return containers;
  }

  public void setContainers(List<ContainersEntry> containers) {
    this.containers = containers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role role = (Role) o;
    return Objects.equals(this.id, role.id) &&
        Objects.equals(this.autoBlessed, role.autoBlessed) &&
        Objects.equals(this.containers, role.containers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, autoBlessed, containers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    autoBlessed: ").append(toIndentedString(autoBlessed)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
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
