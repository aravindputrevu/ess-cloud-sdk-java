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
import io.swagger.client.model.CapacityConstraintsResource;
import io.swagger.client.model.CompatibleNodeTypesResource;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Information about the compatible version.
 */
@Schema(description = "Information about the compatible version.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class CompatibleVersionResource {
  @SerializedName("version")
  private String version = null;

  @SerializedName("node_types")
  private List<CompatibleNodeTypesResource> nodeTypes = new ArrayList<CompatibleNodeTypesResource>();

  @SerializedName("capacity_constraints")
  private CapacityConstraintsResource capacityConstraints = null;

  public CompatibleVersionResource version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Compatible version, the key for this resource
   * @return version
  **/
  @Schema(required = true, description = "Compatible version, the key for this resource")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public CompatibleVersionResource nodeTypes(List<CompatibleNodeTypesResource> nodeTypes) {
    this.nodeTypes = nodeTypes;
    return this;
  }

  public CompatibleVersionResource addNodeTypesItem(CompatibleNodeTypesResource nodeTypesItem) {
    this.nodeTypes.add(nodeTypesItem);
    return this;
  }

   /**
   * Supported node types for the version
   * @return nodeTypes
  **/
  @Schema(required = true, description = "Supported node types for the version")
  public List<CompatibleNodeTypesResource> getNodeTypes() {
    return nodeTypes;
  }

  public void setNodeTypes(List<CompatibleNodeTypesResource> nodeTypes) {
    this.nodeTypes = nodeTypes;
  }

  public CompatibleVersionResource capacityConstraints(CapacityConstraintsResource capacityConstraints) {
    this.capacityConstraints = capacityConstraints;
    return this;
  }

   /**
   * Get capacityConstraints
   * @return capacityConstraints
  **/
  @Schema(description = "")
  public CapacityConstraintsResource getCapacityConstraints() {
    return capacityConstraints;
  }

  public void setCapacityConstraints(CapacityConstraintsResource capacityConstraints) {
    this.capacityConstraints = capacityConstraints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompatibleVersionResource compatibleVersionResource = (CompatibleVersionResource) o;
    return Objects.equals(this.version, compatibleVersionResource.version) &&
        Objects.equals(this.nodeTypes, compatibleVersionResource.nodeTypes) &&
        Objects.equals(this.capacityConstraints, compatibleVersionResource.capacityConstraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, nodeTypes, capacityConstraints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompatibleVersionResource {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    nodeTypes: ").append(toIndentedString(nodeTypes)).append("\n");
    sb.append("    capacityConstraints: ").append(toIndentedString(capacityConstraints)).append("\n");
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
