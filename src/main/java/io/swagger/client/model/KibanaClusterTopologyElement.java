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
import io.swagger.client.model.KibanaConfiguration;
import io.swagger.client.model.TopologySize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The topology of the Kibana nodes, including the number, capacity, and type of nodes, and where they can be allocated.
 */
@Schema(description = "The topology of the Kibana nodes, including the number, capacity, and type of nodes, and where they can be allocated.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class KibanaClusterTopologyElement {
  @SerializedName("memory_per_node")
  private Integer memoryPerNode = null;

  @SerializedName("node_count_per_zone")
  private Integer nodeCountPerZone = null;

  @SerializedName("allocator_filter")
  private Object allocatorFilter = null;

  @SerializedName("node_configuration")
  private String nodeConfiguration = null;

  @SerializedName("instance_configuration_id")
  private String instanceConfigurationId = null;

  @SerializedName("size")
  private TopologySize size = null;

  @SerializedName("zone_count")
  private Integer zoneCount = null;

  @SerializedName("kibana")
  private KibanaConfiguration kibana = null;

  public KibanaClusterTopologyElement memoryPerNode(Integer memoryPerNode) {
    this.memoryPerNode = memoryPerNode;
    return this;
  }

   /**
   * The memory capacity in MB for each node of this type built in each zone.
   * @return memoryPerNode
  **/
  @Schema(description = "The memory capacity in MB for each node of this type built in each zone.")
  public Integer getMemoryPerNode() {
    return memoryPerNode;
  }

  public void setMemoryPerNode(Integer memoryPerNode) {
    this.memoryPerNode = memoryPerNode;
  }

  public KibanaClusterTopologyElement nodeCountPerZone(Integer nodeCountPerZone) {
    this.nodeCountPerZone = nodeCountPerZone;
    return this;
  }

   /**
   * The number of nodes of this type that are allocated within each zone (i.e. total capacity per zone &#x3D; &#x60;node_count_per_zone&#x60; * &#x60;memory_per_node&#x60; in MB).
   * @return nodeCountPerZone
  **/
  @Schema(description = "The number of nodes of this type that are allocated within each zone (i.e. total capacity per zone = `node_count_per_zone` * `memory_per_node` in MB).")
  public Integer getNodeCountPerZone() {
    return nodeCountPerZone;
  }

  public void setNodeCountPerZone(Integer nodeCountPerZone) {
    this.nodeCountPerZone = nodeCountPerZone;
  }

  public KibanaClusterTopologyElement allocatorFilter(Object allocatorFilter) {
    this.allocatorFilter = allocatorFilter;
    return this;
  }

   /**
   * DEPRECATED: Scheduled for removal in a future version of the API.  Controls the allocation strategy of this node type using a simplified version of the Elasticsearch filter DSL (together with &#x27;node_configuration&#x27;)
   * @return allocatorFilter
  **/
  @Schema(description = "DEPRECATED: Scheduled for removal in a future version of the API.  Controls the allocation strategy of this node type using a simplified version of the Elasticsearch filter DSL (together with 'node_configuration')")
  public Object getAllocatorFilter() {
    return allocatorFilter;
  }

  public void setAllocatorFilter(Object allocatorFilter) {
    this.allocatorFilter = allocatorFilter;
  }

  public KibanaClusterTopologyElement nodeConfiguration(String nodeConfiguration) {
    this.nodeConfiguration = nodeConfiguration;
    return this;
  }

   /**
   * DEPRECATED: Scheduled for removal in a future version of the API.  Controls the allocation strategy of this node type by pointing to the names of pre-registered allocator settings. Unless otherwise specified for this deployment, should be omitted.
   * @return nodeConfiguration
  **/
  @Schema(description = "DEPRECATED: Scheduled for removal in a future version of the API.  Controls the allocation strategy of this node type by pointing to the names of pre-registered allocator settings. Unless otherwise specified for this deployment, should be omitted.")
  public String getNodeConfiguration() {
    return nodeConfiguration;
  }

  public void setNodeConfiguration(String nodeConfiguration) {
    this.nodeConfiguration = nodeConfiguration;
  }

  public KibanaClusterTopologyElement instanceConfigurationId(String instanceConfigurationId) {
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

  public KibanaClusterTopologyElement size(TopologySize size) {
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

  public KibanaClusterTopologyElement zoneCount(Integer zoneCount) {
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

  public KibanaClusterTopologyElement kibana(KibanaConfiguration kibana) {
    this.kibana = kibana;
    return this;
  }

   /**
   * Get kibana
   * @return kibana
  **/
  @Schema(description = "")
  public KibanaConfiguration getKibana() {
    return kibana;
  }

  public void setKibana(KibanaConfiguration kibana) {
    this.kibana = kibana;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KibanaClusterTopologyElement kibanaClusterTopologyElement = (KibanaClusterTopologyElement) o;
    return Objects.equals(this.memoryPerNode, kibanaClusterTopologyElement.memoryPerNode) &&
        Objects.equals(this.nodeCountPerZone, kibanaClusterTopologyElement.nodeCountPerZone) &&
        Objects.equals(this.allocatorFilter, kibanaClusterTopologyElement.allocatorFilter) &&
        Objects.equals(this.nodeConfiguration, kibanaClusterTopologyElement.nodeConfiguration) &&
        Objects.equals(this.instanceConfigurationId, kibanaClusterTopologyElement.instanceConfigurationId) &&
        Objects.equals(this.size, kibanaClusterTopologyElement.size) &&
        Objects.equals(this.zoneCount, kibanaClusterTopologyElement.zoneCount) &&
        Objects.equals(this.kibana, kibanaClusterTopologyElement.kibana);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memoryPerNode, nodeCountPerZone, allocatorFilter, nodeConfiguration, instanceConfigurationId, size, zoneCount, kibana);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KibanaClusterTopologyElement {\n");
    
    sb.append("    memoryPerNode: ").append(toIndentedString(memoryPerNode)).append("\n");
    sb.append("    nodeCountPerZone: ").append(toIndentedString(nodeCountPerZone)).append("\n");
    sb.append("    allocatorFilter: ").append(toIndentedString(allocatorFilter)).append("\n");
    sb.append("    nodeConfiguration: ").append(toIndentedString(nodeConfiguration)).append("\n");
    sb.append("    instanceConfigurationId: ").append(toIndentedString(instanceConfigurationId)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    zoneCount: ").append(toIndentedString(zoneCount)).append("\n");
    sb.append("    kibana: ").append(toIndentedString(kibana)).append("\n");
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
