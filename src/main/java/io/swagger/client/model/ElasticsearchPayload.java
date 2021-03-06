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
import io.swagger.client.model.ElasticsearchClusterPlan;
import io.swagger.client.model.ElasticsearchClusterSettings;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * An alias for an Elasticsearch Cluster paired with a request for creating one
 */
@Schema(description = "An alias for an Elasticsearch Cluster paired with a request for creating one")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ElasticsearchPayload {
  @SerializedName("ref_id")
  private String refId = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("region")
  private String region = null;

  @SerializedName("plan")
  private ElasticsearchClusterPlan plan = null;

  @SerializedName("settings")
  private ElasticsearchClusterSettings settings = null;

  public ElasticsearchPayload refId(String refId) {
    this.refId = refId;
    return this;
  }

   /**
   * A locally-unique user-specified id for this Elasticsearch cluster
   * @return refId
  **/
  @Schema(required = true, description = "A locally-unique user-specified id for this Elasticsearch cluster")
  public String getRefId() {
    return refId;
  }

  public void setRefId(String refId) {
    this.refId = refId;
  }

  public ElasticsearchPayload displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The human readable name for the cluster (defaults to the generated cluster id if not specified)
   * @return displayName
  **/
  @Schema(description = "The human readable name for the cluster (defaults to the generated cluster id if not specified)")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ElasticsearchPayload region(String region) {
    this.region = region;
    return this;
  }

   /**
   * The region where this resource exists
   * @return region
  **/
  @Schema(required = true, description = "The region where this resource exists")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public ElasticsearchPayload plan(ElasticsearchClusterPlan plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Get plan
   * @return plan
  **/
  @Schema(required = true, description = "")
  public ElasticsearchClusterPlan getPlan() {
    return plan;
  }

  public void setPlan(ElasticsearchClusterPlan plan) {
    this.plan = plan;
  }

  public ElasticsearchPayload settings(ElasticsearchClusterSettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @Schema(description = "")
  public ElasticsearchClusterSettings getSettings() {
    return settings;
  }

  public void setSettings(ElasticsearchClusterSettings settings) {
    this.settings = settings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticsearchPayload elasticsearchPayload = (ElasticsearchPayload) o;
    return Objects.equals(this.refId, elasticsearchPayload.refId) &&
        Objects.equals(this.displayName, elasticsearchPayload.displayName) &&
        Objects.equals(this.region, elasticsearchPayload.region) &&
        Objects.equals(this.plan, elasticsearchPayload.plan) &&
        Objects.equals(this.settings, elasticsearchPayload.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refId, displayName, region, plan, settings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticsearchPayload {\n");
    
    sb.append("    refId: ").append(toIndentedString(refId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
