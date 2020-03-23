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
import io.swagger.client.model.ElasticsearchClusterBlockingIssues;
import io.swagger.client.model.ElasticsearchMasterInfo;
import io.swagger.client.model.ElasticsearchShardsInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Information about the Elasticsearch cluster.
 */
@Schema(description = "Information about the Elasticsearch cluster.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ElasticsearchInfo {
  @SerializedName("healthy")
  private Boolean healthy = null;

  @SerializedName("shard_info")
  private ElasticsearchShardsInfo shardInfo = null;

  @SerializedName("master_info")
  private ElasticsearchMasterInfo masterInfo = null;

  @SerializedName("blocking_issues")
  private ElasticsearchClusterBlockingIssues blockingIssues = null;

  public ElasticsearchInfo healthy(Boolean healthy) {
    this.healthy = healthy;
    return this;
  }

   /**
   * Whether the Elasticsearch cluster is healthy (check the sub-objects for more details if not)
   * @return healthy
  **/
  @Schema(required = true, description = "Whether the Elasticsearch cluster is healthy (check the sub-objects for more details if not)")
  public Boolean isHealthy() {
    return healthy;
  }

  public void setHealthy(Boolean healthy) {
    this.healthy = healthy;
  }

  public ElasticsearchInfo shardInfo(ElasticsearchShardsInfo shardInfo) {
    this.shardInfo = shardInfo;
    return this;
  }

   /**
   * Get shardInfo
   * @return shardInfo
  **/
  @Schema(required = true, description = "")
  public ElasticsearchShardsInfo getShardInfo() {
    return shardInfo;
  }

  public void setShardInfo(ElasticsearchShardsInfo shardInfo) {
    this.shardInfo = shardInfo;
  }

  public ElasticsearchInfo masterInfo(ElasticsearchMasterInfo masterInfo) {
    this.masterInfo = masterInfo;
    return this;
  }

   /**
   * Get masterInfo
   * @return masterInfo
  **/
  @Schema(required = true, description = "")
  public ElasticsearchMasterInfo getMasterInfo() {
    return masterInfo;
  }

  public void setMasterInfo(ElasticsearchMasterInfo masterInfo) {
    this.masterInfo = masterInfo;
  }

  public ElasticsearchInfo blockingIssues(ElasticsearchClusterBlockingIssues blockingIssues) {
    this.blockingIssues = blockingIssues;
    return this;
  }

   /**
   * Get blockingIssues
   * @return blockingIssues
  **/
  @Schema(description = "")
  public ElasticsearchClusterBlockingIssues getBlockingIssues() {
    return blockingIssues;
  }

  public void setBlockingIssues(ElasticsearchClusterBlockingIssues blockingIssues) {
    this.blockingIssues = blockingIssues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticsearchInfo elasticsearchInfo = (ElasticsearchInfo) o;
    return Objects.equals(this.healthy, elasticsearchInfo.healthy) &&
        Objects.equals(this.shardInfo, elasticsearchInfo.shardInfo) &&
        Objects.equals(this.masterInfo, elasticsearchInfo.masterInfo) &&
        Objects.equals(this.blockingIssues, elasticsearchInfo.blockingIssues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(healthy, shardInfo, masterInfo, blockingIssues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticsearchInfo {\n");
    
    sb.append("    healthy: ").append(toIndentedString(healthy)).append("\n");
    sb.append("    shardInfo: ").append(toIndentedString(shardInfo)).append("\n");
    sb.append("    masterInfo: ").append(toIndentedString(masterInfo)).append("\n");
    sb.append("    blockingIssues: ").append(toIndentedString(blockingIssues)).append("\n");
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