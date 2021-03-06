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
import io.swagger.client.model.StackVersionInstanceCapacityConstraint;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * The configuration for an Elastic Stack node type.
 */
@Schema(description = "The configuration for an Elastic Stack node type.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class StackVersionNodeType {
  @SerializedName("node_type")
  private String nodeType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("settings")
  private Object settings = null;

  @SerializedName("capacity_constraints")
  private StackVersionInstanceCapacityConstraint capacityConstraints = null;

  @SerializedName("compatible_node_types")
  private List<String> compatibleNodeTypes = null;

  @SerializedName("mandatory")
  private Boolean mandatory = null;

  public StackVersionNodeType nodeType(String nodeType) {
    this.nodeType = nodeType;
    return this;
  }

   /**
   * Type of the node (master, data, ...)
   * @return nodeType
  **/
  @Schema(required = true, description = "Type of the node (master, data, ...)")
  public String getNodeType() {
    return nodeType;
  }

  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }

  public StackVersionNodeType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the node type
   * @return name
  **/
  @Schema(required = true, description = "Name of the node type")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StackVersionNodeType description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the node type
   * @return description
  **/
  @Schema(required = true, description = "Description of the node type")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public StackVersionNodeType settings(Object settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Settings that are applied to all nodes of this type
   * @return settings
  **/
  @Schema(description = "Settings that are applied to all nodes of this type")
  public Object getSettings() {
    return settings;
  }

  public void setSettings(Object settings) {
    this.settings = settings;
  }

  public StackVersionNodeType capacityConstraints(StackVersionInstanceCapacityConstraint capacityConstraints) {
    this.capacityConstraints = capacityConstraints;
    return this;
  }

   /**
   * Get capacityConstraints
   * @return capacityConstraints
  **/
  @Schema(description = "")
  public StackVersionInstanceCapacityConstraint getCapacityConstraints() {
    return capacityConstraints;
  }

  public void setCapacityConstraints(StackVersionInstanceCapacityConstraint capacityConstraints) {
    this.capacityConstraints = capacityConstraints;
  }

  public StackVersionNodeType compatibleNodeTypes(List<String> compatibleNodeTypes) {
    this.compatibleNodeTypes = compatibleNodeTypes;
    return this;
  }

  public StackVersionNodeType addCompatibleNodeTypesItem(String compatibleNodeTypesItem) {
    if (this.compatibleNodeTypes == null) {
      this.compatibleNodeTypes = new ArrayList<String>();
    }
    this.compatibleNodeTypes.add(compatibleNodeTypesItem);
    return this;
  }

   /**
   * Node types that are compatible with this one
   * @return compatibleNodeTypes
  **/
  @Schema(description = "Node types that are compatible with this one")
  public List<String> getCompatibleNodeTypes() {
    return compatibleNodeTypes;
  }

  public void setCompatibleNodeTypes(List<String> compatibleNodeTypes) {
    this.compatibleNodeTypes = compatibleNodeTypes;
  }

  public StackVersionNodeType mandatory(Boolean mandatory) {
    this.mandatory = mandatory;
    return this;
  }

   /**
   * Flag to specify a node type is mandatory in a cluster&#x27;s plan
   * @return mandatory
  **/
  @Schema(description = "Flag to specify a node type is mandatory in a cluster's plan")
  public Boolean isMandatory() {
    return mandatory;
  }

  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StackVersionNodeType stackVersionNodeType = (StackVersionNodeType) o;
    return Objects.equals(this.nodeType, stackVersionNodeType.nodeType) &&
        Objects.equals(this.name, stackVersionNodeType.name) &&
        Objects.equals(this.description, stackVersionNodeType.description) &&
        Objects.equals(this.settings, stackVersionNodeType.settings) &&
        Objects.equals(this.capacityConstraints, stackVersionNodeType.capacityConstraints) &&
        Objects.equals(this.compatibleNodeTypes, stackVersionNodeType.compatibleNodeTypes) &&
        Objects.equals(this.mandatory, stackVersionNodeType.mandatory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeType, name, description, settings, capacityConstraints, compatibleNodeTypes, mandatory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StackVersionNodeType {\n");
    
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    capacityConstraints: ").append(toIndentedString(capacityConstraints)).append("\n");
    sb.append("    compatibleNodeTypes: ").append(toIndentedString(compatibleNodeTypes)).append("\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
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
