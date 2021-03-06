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
 * Information about the Elasticsearch instances. For split-brain cases, this also includes sub-clusters.
 */
@Schema(description = "Information about the Elasticsearch instances. For split-brain cases, this also includes sub-clusters.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ElasticsearchMasterElement {
  @SerializedName("master_node_id")
  private String masterNodeId = null;

  @SerializedName("master_instance_name")
  private String masterInstanceName = null;

  @SerializedName("instances")
  private List<String> instances = new ArrayList<String>();

  public ElasticsearchMasterElement masterNodeId(String masterNodeId) {
    this.masterNodeId = masterNodeId;
    return this;
  }

   /**
   * The Elasticsearch node id of a master node
   * @return masterNodeId
  **/
  @Schema(required = true, description = "The Elasticsearch node id of a master node")
  public String getMasterNodeId() {
    return masterNodeId;
  }

  public void setMasterNodeId(String masterNodeId) {
    this.masterNodeId = masterNodeId;
  }

  public ElasticsearchMasterElement masterInstanceName(String masterInstanceName) {
    this.masterInstanceName = masterInstanceName;
    return this;
  }

   /**
   * The corresponding instance name of the container hosting the Elasticsearch master node, if available
   * @return masterInstanceName
  **/
  @Schema(description = "The corresponding instance name of the container hosting the Elasticsearch master node, if available")
  public String getMasterInstanceName() {
    return masterInstanceName;
  }

  public void setMasterInstanceName(String masterInstanceName) {
    this.masterInstanceName = masterInstanceName;
  }

  public ElasticsearchMasterElement instances(List<String> instances) {
    this.instances = instances;
    return this;
  }

  public ElasticsearchMasterElement addInstancesItem(String instancesItem) {
    this.instances.add(instancesItem);
    return this;
  }

   /**
   * The names of the instance/container hosting the node belong to the cluster with the given master
   * @return instances
  **/
  @Schema(required = true, description = "The names of the instance/container hosting the node belong to the cluster with the given master")
  public List<String> getInstances() {
    return instances;
  }

  public void setInstances(List<String> instances) {
    this.instances = instances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticsearchMasterElement elasticsearchMasterElement = (ElasticsearchMasterElement) o;
    return Objects.equals(this.masterNodeId, elasticsearchMasterElement.masterNodeId) &&
        Objects.equals(this.masterInstanceName, elasticsearchMasterElement.masterInstanceName) &&
        Objects.equals(this.instances, elasticsearchMasterElement.instances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(masterNodeId, masterInstanceName, instances);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticsearchMasterElement {\n");
    
    sb.append("    masterNodeId: ").append(toIndentedString(masterNodeId)).append("\n");
    sb.append("    masterInstanceName: ").append(toIndentedString(masterInstanceName)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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
