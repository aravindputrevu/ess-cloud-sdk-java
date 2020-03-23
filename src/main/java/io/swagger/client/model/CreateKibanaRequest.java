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
import io.swagger.client.model.KibanaClusterPlan;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The request body for creating one or more Kibana instances.
 */
@Schema(description = "The request body for creating one or more Kibana instances.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class CreateKibanaRequest {
  @SerializedName("cluster_name")
  private String clusterName = null;

  @SerializedName("elasticsearch_cluster_id")
  private String elasticsearchClusterId = null;

  @SerializedName("plan")
  private KibanaClusterPlan plan = null;

  public CreateKibanaRequest clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

   /**
   * The human readable name for the Kibana cluster (default: takes the name of its Elasticsearch cluster)
   * @return clusterName
  **/
  @Schema(description = "The human readable name for the Kibana cluster (default: takes the name of its Elasticsearch cluster)")
  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public CreateKibanaRequest elasticsearchClusterId(String elasticsearchClusterId) {
    this.elasticsearchClusterId = elasticsearchClusterId;
    return this;
  }

   /**
   * The Id of the Elasticsearch cluster to which this Kibana will be connected
   * @return elasticsearchClusterId
  **/
  @Schema(required = true, description = "The Id of the Elasticsearch cluster to which this Kibana will be connected")
  public String getElasticsearchClusterId() {
    return elasticsearchClusterId;
  }

  public void setElasticsearchClusterId(String elasticsearchClusterId) {
    this.elasticsearchClusterId = elasticsearchClusterId;
  }

  public CreateKibanaRequest plan(KibanaClusterPlan plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Get plan
   * @return plan
  **/
  @Schema(required = true, description = "")
  public KibanaClusterPlan getPlan() {
    return plan;
  }

  public void setPlan(KibanaClusterPlan plan) {
    this.plan = plan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateKibanaRequest createKibanaRequest = (CreateKibanaRequest) o;
    return Objects.equals(this.clusterName, createKibanaRequest.clusterName) &&
        Objects.equals(this.elasticsearchClusterId, createKibanaRequest.elasticsearchClusterId) &&
        Objects.equals(this.plan, createKibanaRequest.plan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterName, elasticsearchClusterId, plan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateKibanaRequest {\n");
    
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    elasticsearchClusterId: ").append(toIndentedString(elasticsearchClusterId)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
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