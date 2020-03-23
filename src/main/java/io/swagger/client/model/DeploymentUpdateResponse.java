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
import io.swagger.client.model.DeploymentDiagnostics;
import io.swagger.client.model.DeploymentResource;
import io.swagger.client.model.Orphaned;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * A response returned from the Deployment update endpoint
 */
@Schema(description = "A response returned from the Deployment update endpoint")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class DeploymentUpdateResponse {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("resources")
  private List<DeploymentResource> resources = new ArrayList<DeploymentResource>();

  @SerializedName("shutdown_resources")
  private Orphaned shutdownResources = null;

  @SerializedName("diagnostics")
  private DeploymentDiagnostics diagnostics = null;

  public DeploymentUpdateResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the deployment
   * @return id
  **/
  @Schema(required = true, description = "The id of the deployment")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DeploymentUpdateResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the deployment
   * @return name
  **/
  @Schema(required = true, description = "The name of the deployment")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DeploymentUpdateResponse resources(List<DeploymentResource> resources) {
    this.resources = resources;
    return this;
  }

  public DeploymentUpdateResponse addResourcesItem(DeploymentResource resourcesItem) {
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * List of resources that are part of the deployment after the update operation.
   * @return resources
  **/
  @Schema(required = true, description = "List of resources that are part of the deployment after the update operation.")
  public List<DeploymentResource> getResources() {
    return resources;
  }

  public void setResources(List<DeploymentResource> resources) {
    this.resources = resources;
  }

  public DeploymentUpdateResponse shutdownResources(Orphaned shutdownResources) {
    this.shutdownResources = shutdownResources;
    return this;
  }

   /**
   * Get shutdownResources
   * @return shutdownResources
  **/
  @Schema(description = "")
  public Orphaned getShutdownResources() {
    return shutdownResources;
  }

  public void setShutdownResources(Orphaned shutdownResources) {
    this.shutdownResources = shutdownResources;
  }

  public DeploymentUpdateResponse diagnostics(DeploymentDiagnostics diagnostics) {
    this.diagnostics = diagnostics;
    return this;
  }

   /**
   * Get diagnostics
   * @return diagnostics
  **/
  @Schema(description = "")
  public DeploymentDiagnostics getDiagnostics() {
    return diagnostics;
  }

  public void setDiagnostics(DeploymentDiagnostics diagnostics) {
    this.diagnostics = diagnostics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentUpdateResponse deploymentUpdateResponse = (DeploymentUpdateResponse) o;
    return Objects.equals(this.id, deploymentUpdateResponse.id) &&
        Objects.equals(this.name, deploymentUpdateResponse.name) &&
        Objects.equals(this.resources, deploymentUpdateResponse.resources) &&
        Objects.equals(this.shutdownResources, deploymentUpdateResponse.shutdownResources) &&
        Objects.equals(this.diagnostics, deploymentUpdateResponse.diagnostics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, resources, shutdownResources, diagnostics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentUpdateResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    shutdownResources: ").append(toIndentedString(shutdownResources)).append("\n");
    sb.append("    diagnostics: ").append(toIndentedString(diagnostics)).append("\n");
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
