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
 * Specifies the CPU resource settings for the Elasticsearch cluster.
 */
@Schema(description = "Specifies the CPU resource settings for the Elasticsearch cluster.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ClusterMetadataCpuResourcesSettings {
  @SerializedName("boost")
  private Boolean boost = null;

  @SerializedName("hard_limit")
  private Boolean hardLimit = null;

  public ClusterMetadataCpuResourcesSettings boost(Boolean boost) {
    this.boost = boost;
    return this;
  }

   /**
   * Indicates if the the CPU boost flag for a cluster is enabled or not
   * @return boost
  **/
  @Schema(required = true, description = "Indicates if the the CPU boost flag for a cluster is enabled or not")
  public Boolean isBoost() {
    return boost;
  }

  public void setBoost(Boolean boost) {
    this.boost = boost;
  }

  public ClusterMetadataCpuResourcesSettings hardLimit(Boolean hardLimit) {
    this.hardLimit = hardLimit;
    return this;
  }

   /**
   * Indicates if the the CPU hard limit flag for a cluster is enabled or not
   * @return hardLimit
  **/
  @Schema(required = true, description = "Indicates if the the CPU hard limit flag for a cluster is enabled or not")
  public Boolean isHardLimit() {
    return hardLimit;
  }

  public void setHardLimit(Boolean hardLimit) {
    this.hardLimit = hardLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterMetadataCpuResourcesSettings clusterMetadataCpuResourcesSettings = (ClusterMetadataCpuResourcesSettings) o;
    return Objects.equals(this.boost, clusterMetadataCpuResourcesSettings.boost) &&
        Objects.equals(this.hardLimit, clusterMetadataCpuResourcesSettings.hardLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boost, hardLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterMetadataCpuResourcesSettings {\n");
    
    sb.append("    boost: ").append(toIndentedString(boost)).append("\n");
    sb.append("    hardLimit: ").append(toIndentedString(hardLimit)).append("\n");
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
