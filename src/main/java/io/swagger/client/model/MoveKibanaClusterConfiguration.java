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
import io.swagger.client.model.TransientKibanaPlanConfiguration;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * The configuration object for moving Kibana instances.
 */
@Schema(description = "The configuration object for moving Kibana instances.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class MoveKibanaClusterConfiguration {
  @SerializedName("cluster_ids")
  private List<String> clusterIds = new ArrayList<String>();

  @SerializedName("plan_override")
  private TransientKibanaPlanConfiguration planOverride = null;

  public MoveKibanaClusterConfiguration clusterIds(List<String> clusterIds) {
    this.clusterIds = clusterIds;
    return this;
  }

  public MoveKibanaClusterConfiguration addClusterIdsItem(String clusterIdsItem) {
    this.clusterIds.add(clusterIdsItem);
    return this;
  }

   /**
   * Identifiers for the Kibana clusters.
   * @return clusterIds
  **/
  @Schema(required = true, description = "Identifiers for the Kibana clusters.")
  public List<String> getClusterIds() {
    return clusterIds;
  }

  public void setClusterIds(List<String> clusterIds) {
    this.clusterIds = clusterIds;
  }

  public MoveKibanaClusterConfiguration planOverride(TransientKibanaPlanConfiguration planOverride) {
    this.planOverride = planOverride;
    return this;
  }

   /**
   * Get planOverride
   * @return planOverride
  **/
  @Schema(description = "")
  public TransientKibanaPlanConfiguration getPlanOverride() {
    return planOverride;
  }

  public void setPlanOverride(TransientKibanaPlanConfiguration planOverride) {
    this.planOverride = planOverride;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveKibanaClusterConfiguration moveKibanaClusterConfiguration = (MoveKibanaClusterConfiguration) o;
    return Objects.equals(this.clusterIds, moveKibanaClusterConfiguration.clusterIds) &&
        Objects.equals(this.planOverride, moveKibanaClusterConfiguration.planOverride);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterIds, planOverride);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveKibanaClusterConfiguration {\n");
    
    sb.append("    clusterIds: ").append(toIndentedString(clusterIds)).append("\n");
    sb.append("    planOverride: ").append(toIndentedString(planOverride)).append("\n");
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