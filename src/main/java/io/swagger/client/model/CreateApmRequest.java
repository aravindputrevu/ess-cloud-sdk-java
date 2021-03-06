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
import io.swagger.client.model.ApmPlan;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The request body for creating one or more APM Servers.
 */
@Schema(description = "The request body for creating one or more APM Servers.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class CreateApmRequest {
  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("elasticsearch_cluster_id")
  private String elasticsearchClusterId = null;

  @SerializedName("plan")
  private ApmPlan plan = null;

  public CreateApmRequest displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The human readable name for the APM cluster (default: takes the name of its Elasticsearch cluster)
   * @return displayName
  **/
  @Schema(description = "The human readable name for the APM cluster (default: takes the name of its Elasticsearch cluster)")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public CreateApmRequest elasticsearchClusterId(String elasticsearchClusterId) {
    this.elasticsearchClusterId = elasticsearchClusterId;
    return this;
  }

   /**
   * The Id of the Elasticsearch cluster to which this APM will be connected
   * @return elasticsearchClusterId
  **/
  @Schema(required = true, description = "The Id of the Elasticsearch cluster to which this APM will be connected")
  public String getElasticsearchClusterId() {
    return elasticsearchClusterId;
  }

  public void setElasticsearchClusterId(String elasticsearchClusterId) {
    this.elasticsearchClusterId = elasticsearchClusterId;
  }

  public CreateApmRequest plan(ApmPlan plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Get plan
   * @return plan
  **/
  @Schema(required = true, description = "")
  public ApmPlan getPlan() {
    return plan;
  }

  public void setPlan(ApmPlan plan) {
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
    CreateApmRequest createApmRequest = (CreateApmRequest) o;
    return Objects.equals(this.displayName, createApmRequest.displayName) &&
        Objects.equals(this.elasticsearchClusterId, createApmRequest.elasticsearchClusterId) &&
        Objects.equals(this.plan, createApmRequest.plan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, elasticsearchClusterId, plan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateApmRequest {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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
