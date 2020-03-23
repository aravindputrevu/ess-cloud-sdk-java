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
import io.swagger.client.model.ApmCrudResponse;
import io.swagger.client.model.ClusterCredentials;
import io.swagger.client.model.ClusterCrudResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The response to an Elasticsearch cluster or Kibana instance CRUD (create/update-plan) request.
 */
@Schema(description = "The response to an Elasticsearch cluster or Kibana instance CRUD (create/update-plan) request.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ClusterCrudResponse {
  @SerializedName("elasticsearch_cluster_id")
  private String elasticsearchClusterId = null;

  @SerializedName("kibana_cluster_id")
  private String kibanaClusterId = null;

  @SerializedName("apm_id")
  private String apmId = null;

  @SerializedName("cloud_id")
  private String cloudId = null;

  @SerializedName("credentials")
  private ClusterCredentials credentials = null;

  @SerializedName("diagnostics")
  private Object diagnostics = null;

  @SerializedName("kibana")
  private ClusterCrudResponse kibana = null;

  @SerializedName("apm")
  private ApmCrudResponse apm = null;

  public ClusterCrudResponse elasticsearchClusterId(String elasticsearchClusterId) {
    this.elasticsearchClusterId = elasticsearchClusterId;
    return this;
  }

   /**
   * For an operation creating or updating an Elasticsearch cluster, the Id of that cluster
   * @return elasticsearchClusterId
  **/
  @Schema(description = "For an operation creating or updating an Elasticsearch cluster, the Id of that cluster")
  public String getElasticsearchClusterId() {
    return elasticsearchClusterId;
  }

  public void setElasticsearchClusterId(String elasticsearchClusterId) {
    this.elasticsearchClusterId = elasticsearchClusterId;
  }

  public ClusterCrudResponse kibanaClusterId(String kibanaClusterId) {
    this.kibanaClusterId = kibanaClusterId;
    return this;
  }

   /**
   * For an operation creating or updating a Kibana cluster, the Id of that cluster
   * @return kibanaClusterId
  **/
  @Schema(description = "For an operation creating or updating a Kibana cluster, the Id of that cluster")
  public String getKibanaClusterId() {
    return kibanaClusterId;
  }

  public void setKibanaClusterId(String kibanaClusterId) {
    this.kibanaClusterId = kibanaClusterId;
  }

  public ClusterCrudResponse apmId(String apmId) {
    this.apmId = apmId;
    return this;
  }

   /**
   * For an operation creating or updating an APM, the Id of that cluster
   * @return apmId
  **/
  @Schema(description = "For an operation creating or updating an APM, the Id of that cluster")
  public String getApmId() {
    return apmId;
  }

  public void setApmId(String apmId) {
    this.apmId = apmId;
  }

  public ClusterCrudResponse cloudId(String cloudId) {
    this.cloudId = cloudId;
    return this;
  }

   /**
   * An encoded string that provides other Elastic services with the necessary information to connect to this Elasticsearch and Kibana
   * @return cloudId
  **/
  @Schema(description = "An encoded string that provides other Elastic services with the necessary information to connect to this Elasticsearch and Kibana")
  public String getCloudId() {
    return cloudId;
  }

  public void setCloudId(String cloudId) {
    this.cloudId = cloudId;
  }

  public ClusterCrudResponse credentials(ClusterCredentials credentials) {
    this.credentials = credentials;
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @Schema(description = "")
  public ClusterCredentials getCredentials() {
    return credentials;
  }

  public void setCredentials(ClusterCredentials credentials) {
    this.credentials = credentials;
  }

  public ClusterCrudResponse diagnostics(Object diagnostics) {
    this.diagnostics = diagnostics;
    return this;
  }

   /**
   * If the endpoint is called with URL param &#x27;validate_only&#x3D;true&#x27;, then this contains advanced debug info (the internal plan representation)
   * @return diagnostics
  **/
  @Schema(description = "If the endpoint is called with URL param 'validate_only=true', then this contains advanced debug info (the internal plan representation)")
  public Object getDiagnostics() {
    return diagnostics;
  }

  public void setDiagnostics(Object diagnostics) {
    this.diagnostics = diagnostics;
  }

  public ClusterCrudResponse kibana(ClusterCrudResponse kibana) {
    this.kibana = kibana;
    return this;
  }

   /**
   * Get kibana
   * @return kibana
  **/
  @Schema(description = "")
  public ClusterCrudResponse getKibana() {
    return kibana;
  }

  public void setKibana(ClusterCrudResponse kibana) {
    this.kibana = kibana;
  }

  public ClusterCrudResponse apm(ApmCrudResponse apm) {
    this.apm = apm;
    return this;
  }

   /**
   * Get apm
   * @return apm
  **/
  @Schema(description = "")
  public ApmCrudResponse getApm() {
    return apm;
  }

  public void setApm(ApmCrudResponse apm) {
    this.apm = apm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterCrudResponse clusterCrudResponse = (ClusterCrudResponse) o;
    return Objects.equals(this.elasticsearchClusterId, clusterCrudResponse.elasticsearchClusterId) &&
        Objects.equals(this.kibanaClusterId, clusterCrudResponse.kibanaClusterId) &&
        Objects.equals(this.apmId, clusterCrudResponse.apmId) &&
        Objects.equals(this.cloudId, clusterCrudResponse.cloudId) &&
        Objects.equals(this.credentials, clusterCrudResponse.credentials) &&
        Objects.equals(this.diagnostics, clusterCrudResponse.diagnostics) &&
        Objects.equals(this.kibana, clusterCrudResponse.kibana) &&
        Objects.equals(this.apm, clusterCrudResponse.apm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elasticsearchClusterId, kibanaClusterId, apmId, cloudId, credentials, diagnostics, kibana, apm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterCrudResponse {\n");
    
    sb.append("    elasticsearchClusterId: ").append(toIndentedString(elasticsearchClusterId)).append("\n");
    sb.append("    kibanaClusterId: ").append(toIndentedString(kibanaClusterId)).append("\n");
    sb.append("    apmId: ").append(toIndentedString(apmId)).append("\n");
    sb.append("    cloudId: ").append(toIndentedString(cloudId)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    diagnostics: ").append(toIndentedString(diagnostics)).append("\n");
    sb.append("    kibana: ").append(toIndentedString(kibana)).append("\n");
    sb.append("    apm: ").append(toIndentedString(apm)).append("\n");
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