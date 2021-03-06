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
import io.swagger.client.model.DeploymentUpdateMetadata;
import io.swagger.client.model.DeploymentUpdateResources;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * A request for updating a Deployment consisting of multiple resources
 */
@Schema(description = "A request for updating a Deployment consisting of multiple resources")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class DeploymentUpdateRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("prune_orphans")
  private Boolean pruneOrphans = null;

  @SerializedName("resources")
  private DeploymentUpdateResources resources = null;

  @SerializedName("metadata")
  private DeploymentUpdateMetadata metadata = null;

  public DeploymentUpdateRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A new name for the deployment, otherwise stays the same.
   * @return name
  **/
  @Schema(description = "A new name for the deployment, otherwise stays the same.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DeploymentUpdateRequest pruneOrphans(Boolean pruneOrphans) {
    this.pruneOrphans = pruneOrphans;
    return this;
  }

   /**
   * Whether or not to prune orphan resources that are no longer mentioned in this request. Note that resourcesare tracked by ref_id, and if a resource&#x27;s ref_id is changed, any previous running resources created with that previousref_id are considered to be orphaned as well.
   * @return pruneOrphans
  **/
  @Schema(required = true, description = "Whether or not to prune orphan resources that are no longer mentioned in this request. Note that resourcesare tracked by ref_id, and if a resource's ref_id is changed, any previous running resources created with that previousref_id are considered to be orphaned as well.")
  public Boolean isPruneOrphans() {
    return pruneOrphans;
  }

  public void setPruneOrphans(Boolean pruneOrphans) {
    this.pruneOrphans = pruneOrphans;
  }

  public DeploymentUpdateRequest resources(DeploymentUpdateResources resources) {
    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @Schema(description = "")
  public DeploymentUpdateResources getResources() {
    return resources;
  }

  public void setResources(DeploymentUpdateResources resources) {
    this.resources = resources;
  }

  public DeploymentUpdateRequest metadata(DeploymentUpdateMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Schema(description = "")
  public DeploymentUpdateMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(DeploymentUpdateMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentUpdateRequest deploymentUpdateRequest = (DeploymentUpdateRequest) o;
    return Objects.equals(this.name, deploymentUpdateRequest.name) &&
        Objects.equals(this.pruneOrphans, deploymentUpdateRequest.pruneOrphans) &&
        Objects.equals(this.resources, deploymentUpdateRequest.resources) &&
        Objects.equals(this.metadata, deploymentUpdateRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pruneOrphans, resources, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentUpdateRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pruneOrphans: ").append(toIndentedString(pruneOrphans)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
