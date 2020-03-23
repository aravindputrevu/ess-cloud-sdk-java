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
import io.swagger.client.model.ContainersEntryOptions;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Represents the association between a Role and a Container Set
 */
@Schema(description = "Represents the association between a Role and a Container Set")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ContainersEntry {
  @SerializedName("name")
  private String name = null;

  @SerializedName("container_set_name")
  private String containerSetName = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("options")
  private ContainersEntryOptions options = null;

  public ContainersEntry name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the association
   * @return name
  **/
  @Schema(required = true, description = "Name of the association")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ContainersEntry containerSetName(String containerSetName) {
    this.containerSetName = containerSetName;
    return this;
  }

   /**
   * The container set name (id)
   * @return containerSetName
  **/
  @Schema(required = true, description = "The container set name (id)")
  public String getContainerSetName() {
    return containerSetName;
  }

  public void setContainerSetName(String containerSetName) {
    this.containerSetName = containerSetName;
  }

  public ContainersEntry kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * The kind of container set, should be one of &#x27;docker&#x27;, &#x27;elasticsearch&#x27;, &#x27;kibana&#x27;, or &#x27;apm&#x27;
   * @return kind
  **/
  @Schema(required = true, description = "The kind of container set, should be one of 'docker', 'elasticsearch', 'kibana', or 'apm'")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public ContainersEntry options(ContainersEntryOptions options) {
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @Schema(required = true, description = "")
  public ContainersEntryOptions getOptions() {
    return options;
  }

  public void setOptions(ContainersEntryOptions options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainersEntry containersEntry = (ContainersEntry) o;
    return Objects.equals(this.name, containersEntry.name) &&
        Objects.equals(this.containerSetName, containersEntry.containerSetName) &&
        Objects.equals(this.kind, containersEntry.kind) &&
        Objects.equals(this.options, containersEntry.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, containerSetName, kind, options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainersEntry {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    containerSetName: ").append(toIndentedString(containerSetName)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
