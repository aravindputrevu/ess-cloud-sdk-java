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
 * Information about an issue and the Elasticsearch instance it affects.
 */
@Schema(description = "Information about an issue and the Elasticsearch instance it affects.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ElasticsearchClusterBlockingIssueElement {
  @SerializedName("description")
  private String description = null;

  @SerializedName("instances")
  private List<String> instances = null;

  public ElasticsearchClusterBlockingIssueElement description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the issue
   * @return description
  **/
  @Schema(description = "Description of the issue")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ElasticsearchClusterBlockingIssueElement instances(List<String> instances) {
    this.instances = instances;
    return this;
  }

  public ElasticsearchClusterBlockingIssueElement addInstancesItem(String instancesItem) {
    if (this.instances == null) {
      this.instances = new ArrayList<String>();
    }
    this.instances.add(instancesItem);
    return this;
  }

   /**
   * A list of instances that are affected by the issue
   * @return instances
  **/
  @Schema(description = "A list of instances that are affected by the issue")
  public List<String> getInstances() {
    return instances;
  }

  public void setInstances(List<String> instances) {
    this.instances = instances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticsearchClusterBlockingIssueElement elasticsearchClusterBlockingIssueElement = (ElasticsearchClusterBlockingIssueElement) o;
    return Objects.equals(this.description, elasticsearchClusterBlockingIssueElement.description) &&
        Objects.equals(this.instances, elasticsearchClusterBlockingIssueElement.instances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, instances);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticsearchClusterBlockingIssueElement {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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
