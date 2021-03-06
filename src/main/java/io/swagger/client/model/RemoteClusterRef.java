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
 * The Elasticsearch cluster to connect to for cross-cluster search.
 */
@Schema(description = "The Elasticsearch cluster to connect to for cross-cluster search.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class RemoteClusterRef {
  @SerializedName("cluster_id")
  private String clusterId = null;

  @SerializedName("skip_unavailable")
  private Boolean skipUnavailable = null;

  public RemoteClusterRef clusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Cluster id of the remote cluster
   * @return clusterId
  **/
  @Schema(required = true, description = "Cluster id of the remote cluster")
  public String getClusterId() {
    return clusterId;
  }

  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  public RemoteClusterRef skipUnavailable(Boolean skipUnavailable) {
    this.skipUnavailable = skipUnavailable;
    return this;
  }

   /**
   * If true, skip this cluster during search if it is disconnected. Default: false
   * @return skipUnavailable
  **/
  @Schema(description = "If true, skip this cluster during search if it is disconnected. Default: false")
  public Boolean isSkipUnavailable() {
    return skipUnavailable;
  }

  public void setSkipUnavailable(Boolean skipUnavailable) {
    this.skipUnavailable = skipUnavailable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteClusterRef remoteClusterRef = (RemoteClusterRef) o;
    return Objects.equals(this.clusterId, remoteClusterRef.clusterId) &&
        Objects.equals(this.skipUnavailable, remoteClusterRef.skipUnavailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, skipUnavailable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteClusterRef {\n");
    
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    skipUnavailable: ").append(toIndentedString(skipUnavailable)).append("\n");
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
