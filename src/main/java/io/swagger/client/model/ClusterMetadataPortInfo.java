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
 * Information about the ports that allow communication between the Elasticsearch cluster and various protocols.
 */
@Schema(description = "Information about the ports that allow communication between the Elasticsearch cluster and various protocols.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ClusterMetadataPortInfo {
  @SerializedName("http")
  private Integer http = null;

  @SerializedName("https")
  private Integer https = null;

  public ClusterMetadataPortInfo http(Integer http) {
    this.http = http;
    return this;
  }

   /**
   * Port where the cluster listens for HTTP traffic
   * @return http
  **/
  @Schema(required = true, description = "Port where the cluster listens for HTTP traffic")
  public Integer getHttp() {
    return http;
  }

  public void setHttp(Integer http) {
    this.http = http;
  }

  public ClusterMetadataPortInfo https(Integer https) {
    this.https = https;
    return this;
  }

   /**
   * Port where the cluster listens for HTTPS traffic
   * @return https
  **/
  @Schema(required = true, description = "Port where the cluster listens for HTTPS traffic")
  public Integer getHttps() {
    return https;
  }

  public void setHttps(Integer https) {
    this.https = https;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterMetadataPortInfo clusterMetadataPortInfo = (ClusterMetadataPortInfo) o;
    return Objects.equals(this.http, clusterMetadataPortInfo.http) &&
        Objects.equals(this.https, clusterMetadataPortInfo.https);
  }

  @Override
  public int hashCode() {
    return Objects.hash(http, https);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterMetadataPortInfo {\n");
    
    sb.append("    http: ").append(toIndentedString(http)).append("\n");
    sb.append("    https: ").append(toIndentedString(https)).append("\n");
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
