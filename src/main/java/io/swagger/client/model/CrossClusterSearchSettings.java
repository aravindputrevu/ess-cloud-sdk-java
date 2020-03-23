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
import io.swagger.client.model.RemoteClusterRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * The configuration settings for the cross-cluster search.
 */
@Schema(description = "The configuration settings for the cross-cluster search.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class CrossClusterSearchSettings {
  @SerializedName("remote_clusters")
  private Map<String, RemoteClusterRef> remoteClusters = new HashMap<String, RemoteClusterRef>();

  public CrossClusterSearchSettings remoteClusters(Map<String, RemoteClusterRef> remoteClusters) {
    this.remoteClusters = remoteClusters;
    return this;
  }

  public CrossClusterSearchSettings putRemoteClustersItem(String key, RemoteClusterRef remoteClustersItem) {
    this.remoteClusters.put(key, remoteClustersItem);
    return this;
  }

   /**
   * Mapping of remote cluster references keyed by their respective aliases. Aliases must only contain letters, digits, dashes and underscores
   * @return remoteClusters
  **/
  @Schema(required = true, description = "Mapping of remote cluster references keyed by their respective aliases. Aliases must only contain letters, digits, dashes and underscores")
  public Map<String, RemoteClusterRef> getRemoteClusters() {
    return remoteClusters;
  }

  public void setRemoteClusters(Map<String, RemoteClusterRef> remoteClusters) {
    this.remoteClusters = remoteClusters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrossClusterSearchSettings crossClusterSearchSettings = (CrossClusterSearchSettings) o;
    return Objects.equals(this.remoteClusters, crossClusterSearchSettings.remoteClusters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remoteClusters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrossClusterSearchSettings {\n");
    
    sb.append("    remoteClusters: ").append(toIndentedString(remoteClusters)).append("\n");
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
