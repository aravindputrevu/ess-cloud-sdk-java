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
import io.swagger.client.model.TopologySize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The cluster topology for the Elasticsearch security deployment.
 */
@Schema(description = "The cluster topology for the Elasticsearch security deployment.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class SecurityDeploymentTopology {
  @SerializedName("size")
  private TopologySize size = null;

  @SerializedName("zone_count")
  private Integer zoneCount = null;

  public SecurityDeploymentTopology size(TopologySize size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public TopologySize getSize() {
    return size;
  }

  public void setSize(TopologySize size) {
    this.size = size;
  }

  public SecurityDeploymentTopology zoneCount(Integer zoneCount) {
    this.zoneCount = zoneCount;
    return this;
  }

   /**
   * The default number of zones in which data nodes will be placed
   * @return zoneCount
  **/
  @Schema(description = "The default number of zones in which data nodes will be placed")
  public Integer getZoneCount() {
    return zoneCount;
  }

  public void setZoneCount(Integer zoneCount) {
    this.zoneCount = zoneCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityDeploymentTopology securityDeploymentTopology = (SecurityDeploymentTopology) o;
    return Objects.equals(this.size, securityDeploymentTopology.size) &&
        Objects.equals(this.zoneCount, securityDeploymentTopology.zoneCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, zoneCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityDeploymentTopology {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    zoneCount: ").append(toIndentedString(zoneCount)).append("\n");
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
