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
import io.swagger.client.model.ClusterSnapshotRepositoryInfo;
import io.swagger.client.model.ClusterSnapshotRetention;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * The snapshot configuration settings for an Elasticsearch cluster.
 */
@Schema(description = "The snapshot configuration settings for an Elasticsearch cluster.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ClusterSnapshotSettings {
  @SerializedName("repository_name")
  private String repositoryName = null;

  @SerializedName("repository")
  private ClusterSnapshotRepositoryInfo repository = null;

  @SerializedName("interval")
  private String interval = null;

  @SerializedName("pending_interval")
  private String pendingInterval = null;

  @SerializedName("wait_time_after_snapshotting")
  private String waitTimeAfterSnapshotting = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("suspended")
  private List<String> suspended = null;

  @SerializedName("retention")
  private ClusterSnapshotRetention retention = null;

  public ClusterSnapshotSettings repositoryName(String repositoryName) {
    this.repositoryName = repositoryName;
    return this;
  }

   /**
   * Deprecated: ECE snapshot repository name, please use [repository] instead
   * @return repositoryName
  **/
  @Schema(description = "Deprecated: ECE snapshot repository name, please use [repository] instead")
  public String getRepositoryName() {
    return repositoryName;
  }

  public void setRepositoryName(String repositoryName) {
    this.repositoryName = repositoryName;
  }

  public ClusterSnapshotSettings repository(ClusterSnapshotRepositoryInfo repository) {
    this.repository = repository;
    return this;
  }

   /**
   * Get repository
   * @return repository
  **/
  @Schema(description = "")
  public ClusterSnapshotRepositoryInfo getRepository() {
    return repository;
  }

  public void setRepository(ClusterSnapshotRepositoryInfo repository) {
    this.repository = repository;
  }

  public ClusterSnapshotSettings interval(String interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Interval between snapshots, with the format &#x27;length unit&#x27; (space is optional), where unit can be one of: d (day), h (hour), min (minute). Default is 30 minutes
   * @return interval
  **/
  @Schema(description = "Interval between snapshots, with the format 'length unit' (space is optional), where unit can be one of: d (day), h (hour), min (minute). Default is 30 minutes")
  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }

  public ClusterSnapshotSettings pendingInterval(String pendingInterval) {
    this.pendingInterval = pendingInterval;
    return this;
  }

   /**
   * Interval between snapshot progress checks, with the format &#x27;length unit&#x27; (space is optional), where unit can be one of: d (day), h (hour), min (minute). Default is 1 minute
   * @return pendingInterval
  **/
  @Schema(description = "Interval between snapshot progress checks, with the format 'length unit' (space is optional), where unit can be one of: d (day), h (hour), min (minute). Default is 1 minute")
  public String getPendingInterval() {
    return pendingInterval;
  }

  public void setPendingInterval(String pendingInterval) {
    this.pendingInterval = pendingInterval;
  }

  public ClusterSnapshotSettings waitTimeAfterSnapshotting(String waitTimeAfterSnapshotting) {
    this.waitTimeAfterSnapshotting = waitTimeAfterSnapshotting;
    return this;
  }

   /**
   * The time to wait between snapshot phases (snapshot, purge), with the format &#x27;length unit&#x27; (space is optional), where unit can be one of: d (day), h (hour), min (minute). Default is 10 minutes
   * @return waitTimeAfterSnapshotting
  **/
  @Schema(description = "The time to wait between snapshot phases (snapshot, purge), with the format 'length unit' (space is optional), where unit can be one of: d (day), h (hour), min (minute). Default is 10 minutes")
  public String getWaitTimeAfterSnapshotting() {
    return waitTimeAfterSnapshotting;
  }

  public void setWaitTimeAfterSnapshotting(String waitTimeAfterSnapshotting) {
    this.waitTimeAfterSnapshotting = waitTimeAfterSnapshotting;
  }

  public ClusterSnapshotSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates if Snapshotting is enabled
   * @return enabled
  **/
  @Schema(description = "Indicates if Snapshotting is enabled")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public ClusterSnapshotSettings suspended(List<String> suspended) {
    this.suspended = suspended;
    return this;
  }

  public ClusterSnapshotSettings addSuspendedItem(String suspendedItem) {
    if (this.suspended == null) {
      this.suspended = new ArrayList<String>();
    }
    this.suspended.add(suspendedItem);
    return this;
  }

   /**
   * List of temporary snapshot suspensions
   * @return suspended
  **/
  @Schema(description = "List of temporary snapshot suspensions")
  public List<String> getSuspended() {
    return suspended;
  }

  public void setSuspended(List<String> suspended) {
    this.suspended = suspended;
  }

  public ClusterSnapshotSettings retention(ClusterSnapshotRetention retention) {
    this.retention = retention;
    return this;
  }

   /**
   * Get retention
   * @return retention
  **/
  @Schema(description = "")
  public ClusterSnapshotRetention getRetention() {
    return retention;
  }

  public void setRetention(ClusterSnapshotRetention retention) {
    this.retention = retention;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterSnapshotSettings clusterSnapshotSettings = (ClusterSnapshotSettings) o;
    return Objects.equals(this.repositoryName, clusterSnapshotSettings.repositoryName) &&
        Objects.equals(this.repository, clusterSnapshotSettings.repository) &&
        Objects.equals(this.interval, clusterSnapshotSettings.interval) &&
        Objects.equals(this.pendingInterval, clusterSnapshotSettings.pendingInterval) &&
        Objects.equals(this.waitTimeAfterSnapshotting, clusterSnapshotSettings.waitTimeAfterSnapshotting) &&
        Objects.equals(this.enabled, clusterSnapshotSettings.enabled) &&
        Objects.equals(this.suspended, clusterSnapshotSettings.suspended) &&
        Objects.equals(this.retention, clusterSnapshotSettings.retention);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repositoryName, repository, interval, pendingInterval, waitTimeAfterSnapshotting, enabled, suspended, retention);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterSnapshotSettings {\n");
    
    sb.append("    repositoryName: ").append(toIndentedString(repositoryName)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    pendingInterval: ").append(toIndentedString(pendingInterval)).append("\n");
    sb.append("    waitTimeAfterSnapshotting: ").append(toIndentedString(waitTimeAfterSnapshotting)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    retention: ").append(toIndentedString(retention)).append("\n");
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
