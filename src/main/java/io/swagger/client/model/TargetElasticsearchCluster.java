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
import io.swagger.client.model.Hyperlink;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Information about the specified Elasticsearch cluster.
 */
@Schema(description = "Information about the specified Elasticsearch cluster.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class TargetElasticsearchCluster {
  @SerializedName("elasticsearch_id")
  private String elasticsearchId = null;

  @SerializedName("links")
  private Map<String, Hyperlink> links = null;

  public TargetElasticsearchCluster elasticsearchId(String elasticsearchId) {
    this.elasticsearchId = elasticsearchId;
    return this;
  }

   /**
   * The Elasticsearch cluster Id
   * @return elasticsearchId
  **/
  @Schema(required = true, description = "The Elasticsearch cluster Id")
  public String getElasticsearchId() {
    return elasticsearchId;
  }

  public void setElasticsearchId(String elasticsearchId) {
    this.elasticsearchId = elasticsearchId;
  }

  public TargetElasticsearchCluster links(Map<String, Hyperlink> links) {
    this.links = links;
    return this;
  }

  public TargetElasticsearchCluster putLinksItem(String key, Hyperlink linksItem) {
    if (this.links == null) {
      this.links = new HashMap<String, Hyperlink>();
    }
    this.links.put(key, linksItem);
    return this;
  }

   /**
   * A map of application-specific operations (which map to &#x27;operationId&#x27;s in the Swagger API) to metadata about that operation
   * @return links
  **/
  @Schema(description = "A map of application-specific operations (which map to 'operationId's in the Swagger API) to metadata about that operation")
  public Map<String, Hyperlink> getLinks() {
    return links;
  }

  public void setLinks(Map<String, Hyperlink> links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetElasticsearchCluster targetElasticsearchCluster = (TargetElasticsearchCluster) o;
    return Objects.equals(this.elasticsearchId, targetElasticsearchCluster.elasticsearchId) &&
        Objects.equals(this.links, targetElasticsearchCluster.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elasticsearchId, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetElasticsearchCluster {\n");
    
    sb.append("    elasticsearchId: ").append(toIndentedString(elasticsearchId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
