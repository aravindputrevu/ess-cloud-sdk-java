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
/**
 * The cross-cluster search clusters for the remote clusters.
 */
@Schema(description = "The cross-cluster search clusters for the remote clusters.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class CrossClusterSearchClusters {
  @SerializedName("ccs_clusters")
  private List<String> ccsClusters = new ArrayList<String>();

  public CrossClusterSearchClusters ccsClusters(List<String> ccsClusters) {
    this.ccsClusters = ccsClusters;
    return this;
  }

  public CrossClusterSearchClusters addCcsClustersItem(String ccsClustersItem) {
    this.ccsClusters.add(ccsClustersItem);
    return this;
  }

   /**
   * Cross-cluster search clusers&#x27; IDs for the remote cluster
   * @return ccsClusters
  **/
  @Schema(required = true, description = "Cross-cluster search clusers' IDs for the remote cluster")
  public List<String> getCcsClusters() {
    return ccsClusters;
  }

  public void setCcsClusters(List<String> ccsClusters) {
    this.ccsClusters = ccsClusters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrossClusterSearchClusters crossClusterSearchClusters = (CrossClusterSearchClusters) o;
    return Objects.equals(this.ccsClusters, crossClusterSearchClusters.ccsClusters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ccsClusters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrossClusterSearchClusters {\n");
    
    sb.append("    ccsClusters: ").append(toIndentedString(ccsClusters)).append("\n");
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