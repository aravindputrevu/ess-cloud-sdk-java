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
import io.swagger.client.model.AppSearchConfiguration;
import io.swagger.client.model.AppSearchNodeTypes;
import io.swagger.client.model.TopologySize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Defines the topology of the AppSearch nodes (eg number/capacity of nodes, and where they can be allocated)
 */
@Schema(description = "Defines the topology of the AppSearch nodes (eg number/capacity of nodes, and where they can be allocated)")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class AppSearchTopologyElement {
  @SerializedName("node_type")
  private AppSearchNodeTypes nodeType = null;

  @SerializedName("instance_configuration_id")
  private String instanceConfigurationId = null;

  @SerializedName("size")
  private TopologySize size = null;

  @SerializedName("zone_count")
  private Integer zoneCount = null;

  @SerializedName("appsearch")
  private AppSearchConfiguration appsearch = null;

  public AppSearchTopologyElement nodeType(AppSearchNodeTypes nodeType) {
    this.nodeType = nodeType;
    return this;
  }

   /**
   * Get nodeType
   * @return nodeType
  **/
  @Schema(description = "")
  public AppSearchNodeTypes getNodeType() {
    return nodeType;
  }

  public void setNodeType(AppSearchNodeTypes nodeType) {
    this.nodeType = nodeType;
  }

  public AppSearchTopologyElement instanceConfigurationId(String instanceConfigurationId) {
    this.instanceConfigurationId = instanceConfigurationId;
    return this;
  }

   /**
   * Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the id of an existing instance configuration.
   * @return instanceConfigurationId
  **/
  @Schema(description = "Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the id of an existing instance configuration.")
  public String getInstanceConfigurationId() {
    return instanceConfigurationId;
  }

  public void setInstanceConfigurationId(String instanceConfigurationId) {
    this.instanceConfigurationId = instanceConfigurationId;
  }

  public AppSearchTopologyElement size(TopologySize size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public TopologySize getSize() {
    return size;
  }

  public void setSize(TopologySize size) {
    this.size = size;
  }

  public AppSearchTopologyElement zoneCount(Integer zoneCount) {
    this.zoneCount = zoneCount;
    return this;
  }

   /**
   * number of zones in which nodes will be placed
   * @return zoneCount
  **/
  @Schema(description = "number of zones in which nodes will be placed")
  public Integer getZoneCount() {
    return zoneCount;
  }

  public void setZoneCount(Integer zoneCount) {
    this.zoneCount = zoneCount;
  }

  public AppSearchTopologyElement appsearch(AppSearchConfiguration appsearch) {
    this.appsearch = appsearch;
    return this;
  }

   /**
   * Get appsearch
   * @return appsearch
  **/
  @Schema(description = "")
  public AppSearchConfiguration getAppsearch() {
    return appsearch;
  }

  public void setAppsearch(AppSearchConfiguration appsearch) {
    this.appsearch = appsearch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppSearchTopologyElement appSearchTopologyElement = (AppSearchTopologyElement) o;
    return Objects.equals(this.nodeType, appSearchTopologyElement.nodeType) &&
        Objects.equals(this.instanceConfigurationId, appSearchTopologyElement.instanceConfigurationId) &&
        Objects.equals(this.size, appSearchTopologyElement.size) &&
        Objects.equals(this.zoneCount, appSearchTopologyElement.zoneCount) &&
        Objects.equals(this.appsearch, appSearchTopologyElement.appsearch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeType, instanceConfigurationId, size, zoneCount, appsearch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppSearchTopologyElement {\n");
    
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    instanceConfigurationId: ").append(toIndentedString(instanceConfigurationId)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    zoneCount: ").append(toIndentedString(zoneCount)).append("\n");
    sb.append("    appsearch: ").append(toIndentedString(appsearch)).append("\n");
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
