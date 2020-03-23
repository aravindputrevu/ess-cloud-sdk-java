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
/**
 * Holds diagnostics for a Kibana resource
 */
@Schema(description = "Holds diagnostics for a Kibana resource")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class Kibana {
  @SerializedName("ref_id")
  private String refId = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("elasticsearch_cluster_ref_id")
  private String elasticsearchClusterRefId = null;

  @SerializedName("backend_plan")
  private Object backendPlan = null;

  public Kibana refId(String refId) {
    this.refId = refId;
    return this;
  }

   /**
   * A locally-unique user-specified id
   * @return refId
  **/
  @Schema(required = true, description = "A locally-unique user-specified id")
  public String getRefId() {
    return refId;
  }

  public void setRefId(String refId) {
    this.refId = refId;
  }

  public Kibana displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The human readable name (defaults to the generated cluster id if not specified)
   * @return displayName
  **/
  @Schema(required = true, description = "The human readable name (defaults to the generated cluster id if not specified)")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Kibana elasticsearchClusterRefId(String elasticsearchClusterRefId) {
    this.elasticsearchClusterRefId = elasticsearchClusterRefId;
    return this;
  }

   /**
   * The user-specified id of the Elasticsearch Cluster that this will link to
   * @return elasticsearchClusterRefId
  **/
  @Schema(required = true, description = "The user-specified id of the Elasticsearch Cluster that this will link to")
  public String getElasticsearchClusterRefId() {
    return elasticsearchClusterRefId;
  }

  public void setElasticsearchClusterRefId(String elasticsearchClusterRefId) {
    this.elasticsearchClusterRefId = elasticsearchClusterRefId;
  }

  public Kibana backendPlan(Object backendPlan) {
    this.backendPlan = backendPlan;
    return this;
  }

   /**
   * The backend plan as JSON
   * @return backendPlan
  **/
  @Schema(required = true, description = "The backend plan as JSON")
  public Object getBackendPlan() {
    return backendPlan;
  }

  public void setBackendPlan(Object backendPlan) {
    this.backendPlan = backendPlan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Kibana kibana = (Kibana) o;
    return Objects.equals(this.refId, kibana.refId) &&
        Objects.equals(this.displayName, kibana.displayName) &&
        Objects.equals(this.elasticsearchClusterRefId, kibana.elasticsearchClusterRefId) &&
        Objects.equals(this.backendPlan, kibana.backendPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refId, displayName, elasticsearchClusterRefId, backendPlan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Kibana {\n");
    
    sb.append("    refId: ").append(toIndentedString(refId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    elasticsearchClusterRefId: ").append(toIndentedString(elasticsearchClusterRefId)).append("\n");
    sb.append("    backendPlan: ").append(toIndentedString(backendPlan)).append("\n");
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
