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
import io.swagger.client.model.DeploymentResource;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * DeploymentsListingData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class DeploymentsListingData {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("resources")
  private List<DeploymentResource> resources = new ArrayList<DeploymentResource>();

  public DeploymentsListingData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of this deployment
   * @return id
  **/
  @Schema(required = true, description = "The id of this deployment")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DeploymentsListingData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of this deployment
   * @return name
  **/
  @Schema(required = true, description = "The name of this deployment")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DeploymentsListingData resources(List<DeploymentResource> resources) {
    this.resources = resources;
    return this;
  }

  public DeploymentsListingData addResourcesItem(DeploymentResource resourcesItem) {
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * List of resources in this deployment
   * @return resources
  **/
  @Schema(required = true, description = "List of resources in this deployment")
  public List<DeploymentResource> getResources() {
    return resources;
  }

  public void setResources(List<DeploymentResource> resources) {
    this.resources = resources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentsListingData deploymentsListingData = (DeploymentsListingData) o;
    return Objects.equals(this.id, deploymentsListingData.id) &&
        Objects.equals(this.name, deploymentsListingData.name) &&
        Objects.equals(this.resources, deploymentsListingData.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, resources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentsListingData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
