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
import org.threeten.bp.OffsetDateTime;
/**
 * Information about the monitoring status for the Elasticsearch cluster.
 */
@Schema(description = "Information about the monitoring status for the Elasticsearch cluster.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ElasticsearchMonitoringInfo {
  @SerializedName("healthy")
  private Boolean healthy = null;

  @SerializedName("last_modified")
  private OffsetDateTime lastModified = null;

  @SerializedName("last_update_status")
  private String lastUpdateStatus = null;

  @SerializedName("source_cluster_ids")
  private List<String> sourceClusterIds = new ArrayList<String>();

  @SerializedName("destination_cluster_ids")
  private List<String> destinationClusterIds = new ArrayList<String>();

  public ElasticsearchMonitoringInfo healthy(Boolean healthy) {
    this.healthy = healthy;
    return this;
  }

   /**
   * Whether the Monitoring configuration has been successfully applied
   * @return healthy
  **/
  @Schema(required = true, description = "Whether the Monitoring configuration has been successfully applied")
  public Boolean isHealthy() {
    return healthy;
  }

  public void setHealthy(Boolean healthy) {
    this.healthy = healthy;
  }

  public ElasticsearchMonitoringInfo lastModified(OffsetDateTime lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * The time the monitoring configuration was last changed
   * @return lastModified
  **/
  @Schema(required = true, description = "The time the monitoring configuration was last changed")
  public OffsetDateTime getLastModified() {
    return lastModified;
  }

  public void setLastModified(OffsetDateTime lastModified) {
    this.lastModified = lastModified;
  }

  public ElasticsearchMonitoringInfo lastUpdateStatus(String lastUpdateStatus) {
    this.lastUpdateStatus = lastUpdateStatus;
    return this;
  }

   /**
   * The status message from the last update (successful or not)
   * @return lastUpdateStatus
  **/
  @Schema(required = true, description = "The status message from the last update (successful or not)")
  public String getLastUpdateStatus() {
    return lastUpdateStatus;
  }

  public void setLastUpdateStatus(String lastUpdateStatus) {
    this.lastUpdateStatus = lastUpdateStatus;
  }

  public ElasticsearchMonitoringInfo sourceClusterIds(List<String> sourceClusterIds) {
    this.sourceClusterIds = sourceClusterIds;
    return this;
  }

  public ElasticsearchMonitoringInfo addSourceClusterIdsItem(String sourceClusterIdsItem) {
    this.sourceClusterIds.add(sourceClusterIdsItem);
    return this;
  }

   /**
   * The list of clusters Ids from which this cluster is currently receiving monitoring data
   * @return sourceClusterIds
  **/
  @Schema(required = true, description = "The list of clusters Ids from which this cluster is currently receiving monitoring data")
  public List<String> getSourceClusterIds() {
    return sourceClusterIds;
  }

  public void setSourceClusterIds(List<String> sourceClusterIds) {
    this.sourceClusterIds = sourceClusterIds;
  }

  public ElasticsearchMonitoringInfo destinationClusterIds(List<String> destinationClusterIds) {
    this.destinationClusterIds = destinationClusterIds;
    return this;
  }

  public ElasticsearchMonitoringInfo addDestinationClusterIdsItem(String destinationClusterIdsItem) {
    this.destinationClusterIds.add(destinationClusterIdsItem);
    return this;
  }

   /**
   * The list of clusters Ids to which this cluster is currently sending monitoring data
   * @return destinationClusterIds
  **/
  @Schema(required = true, description = "The list of clusters Ids to which this cluster is currently sending monitoring data")
  public List<String> getDestinationClusterIds() {
    return destinationClusterIds;
  }

  public void setDestinationClusterIds(List<String> destinationClusterIds) {
    this.destinationClusterIds = destinationClusterIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticsearchMonitoringInfo elasticsearchMonitoringInfo = (ElasticsearchMonitoringInfo) o;
    return Objects.equals(this.healthy, elasticsearchMonitoringInfo.healthy) &&
        Objects.equals(this.lastModified, elasticsearchMonitoringInfo.lastModified) &&
        Objects.equals(this.lastUpdateStatus, elasticsearchMonitoringInfo.lastUpdateStatus) &&
        Objects.equals(this.sourceClusterIds, elasticsearchMonitoringInfo.sourceClusterIds) &&
        Objects.equals(this.destinationClusterIds, elasticsearchMonitoringInfo.destinationClusterIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(healthy, lastModified, lastUpdateStatus, sourceClusterIds, destinationClusterIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticsearchMonitoringInfo {\n");
    
    sb.append("    healthy: ").append(toIndentedString(healthy)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    lastUpdateStatus: ").append(toIndentedString(lastUpdateStatus)).append("\n");
    sb.append("    sourceClusterIds: ").append(toIndentedString(sourceClusterIds)).append("\n");
    sb.append("    destinationClusterIds: ").append(toIndentedString(destinationClusterIds)).append("\n");
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