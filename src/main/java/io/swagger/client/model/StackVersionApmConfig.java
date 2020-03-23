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
import io.swagger.client.model.StackVersionInstanceCapacityConstraint;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * The APM Server configuration for an Elastic Stack version.
 */
@Schema(description = "The APM Server configuration for an Elastic Stack version.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class StackVersionApmConfig {
  @SerializedName("version")
  private String version = null;

  @SerializedName("docker_image")
  private String dockerImage = null;

  @SerializedName("blacklist")
  private List<String> blacklist = new ArrayList<String>();

  @SerializedName("settings")
  private Object settings = null;

  @SerializedName("capacity_constraints")
  private StackVersionInstanceCapacityConstraint capacityConstraints = null;

  @SerializedName("compatible_node_types")
  private List<String> compatibleNodeTypes = null;

  public StackVersionApmConfig version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Version of APM
   * @return version
  **/
  @Schema(description = "Version of APM")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public StackVersionApmConfig dockerImage(String dockerImage) {
    this.dockerImage = dockerImage;
    return this;
  }

   /**
   * Docker image for the APM
   * @return dockerImage
  **/
  @Schema(required = true, description = "Docker image for the APM")
  public String getDockerImage() {
    return dockerImage;
  }

  public void setDockerImage(String dockerImage) {
    this.dockerImage = dockerImage;
  }

  public StackVersionApmConfig blacklist(List<String> blacklist) {
    this.blacklist = blacklist;
    return this;
  }

  public StackVersionApmConfig addBlacklistItem(String blacklistItem) {
    this.blacklist.add(blacklistItem);
    return this;
  }

   /**
   * List of configuration options that cannot be overridden by user settings
   * @return blacklist
  **/
  @Schema(required = true, description = "List of configuration options that cannot be overridden by user settings")
  public List<String> getBlacklist() {
    return blacklist;
  }

  public void setBlacklist(List<String> blacklist) {
    this.blacklist = blacklist;
  }

  public StackVersionApmConfig settings(Object settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Settings that are applied to all nodes of this type
   * @return settings
  **/
  @Schema(description = "Settings that are applied to all nodes of this type")
  public Object getSettings() {
    return settings;
  }

  public void setSettings(Object settings) {
    this.settings = settings;
  }

  public StackVersionApmConfig capacityConstraints(StackVersionInstanceCapacityConstraint capacityConstraints) {
    this.capacityConstraints = capacityConstraints;
    return this;
  }

   /**
   * Get capacityConstraints
   * @return capacityConstraints
  **/
  @Schema(description = "")
  public StackVersionInstanceCapacityConstraint getCapacityConstraints() {
    return capacityConstraints;
  }

  public void setCapacityConstraints(StackVersionInstanceCapacityConstraint capacityConstraints) {
    this.capacityConstraints = capacityConstraints;
  }

  public StackVersionApmConfig compatibleNodeTypes(List<String> compatibleNodeTypes) {
    this.compatibleNodeTypes = compatibleNodeTypes;
    return this;
  }

  public StackVersionApmConfig addCompatibleNodeTypesItem(String compatibleNodeTypesItem) {
    if (this.compatibleNodeTypes == null) {
      this.compatibleNodeTypes = new ArrayList<String>();
    }
    this.compatibleNodeTypes.add(compatibleNodeTypesItem);
    return this;
  }

   /**
   * Node types that are compatible with this one
   * @return compatibleNodeTypes
  **/
  @Schema(description = "Node types that are compatible with this one")
  public List<String> getCompatibleNodeTypes() {
    return compatibleNodeTypes;
  }

  public void setCompatibleNodeTypes(List<String> compatibleNodeTypes) {
    this.compatibleNodeTypes = compatibleNodeTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StackVersionApmConfig stackVersionApmConfig = (StackVersionApmConfig) o;
    return Objects.equals(this.version, stackVersionApmConfig.version) &&
        Objects.equals(this.dockerImage, stackVersionApmConfig.dockerImage) &&
        Objects.equals(this.blacklist, stackVersionApmConfig.blacklist) &&
        Objects.equals(this.settings, stackVersionApmConfig.settings) &&
        Objects.equals(this.capacityConstraints, stackVersionApmConfig.capacityConstraints) &&
        Objects.equals(this.compatibleNodeTypes, stackVersionApmConfig.compatibleNodeTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, dockerImage, blacklist, settings, capacityConstraints, compatibleNodeTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StackVersionApmConfig {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    dockerImage: ").append(toIndentedString(dockerImage)).append("\n");
    sb.append("    blacklist: ").append(toIndentedString(blacklist)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    capacityConstraints: ").append(toIndentedString(capacityConstraints)).append("\n");
    sb.append("    compatibleNodeTypes: ").append(toIndentedString(compatibleNodeTypes)).append("\n");
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
