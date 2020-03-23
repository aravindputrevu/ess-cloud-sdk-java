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
import io.swagger.client.model.RunnerBuildInfo;
import io.swagger.client.model.RunnerContainerInfo;
import io.swagger.client.model.RunnerRoleInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Information about a specified runner.
 */
@Schema(description = "Information about a specified runner.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class RunnerInfo {
  @SerializedName("runner_id")
  private String runnerId = null;

  @SerializedName("runner_name")
  private String runnerName = null;

  @SerializedName("zone")
  private String zone = null;

  @SerializedName("tags")
  private Map<String, String> tags = null;

  @SerializedName("features")
  private Map<String, Boolean> features = null;

  @SerializedName("build_info")
  private RunnerBuildInfo buildInfo = null;

  @SerializedName("host_ip")
  private String hostIp = null;

  @SerializedName("public_hostname")
  private String publicHostname = null;

  @SerializedName("containers")
  private List<RunnerContainerInfo> containers = new ArrayList<RunnerContainerInfo>();

  @SerializedName("roles")
  private List<RunnerRoleInfo> roles = new ArrayList<RunnerRoleInfo>();

  @SerializedName("connected")
  private Boolean connected = null;

  @SerializedName("healthy")
  private Boolean healthy = null;

  public RunnerInfo runnerId(String runnerId) {
    this.runnerId = runnerId;
    return this;
  }

   /**
   * The runner identifier
   * @return runnerId
  **/
  @Schema(required = true, description = "The runner identifier")
  public String getRunnerId() {
    return runnerId;
  }

  public void setRunnerId(String runnerId) {
    this.runnerId = runnerId;
  }

  public RunnerInfo runnerName(String runnerName) {
    this.runnerName = runnerName;
    return this;
  }

   /**
   * The runner name
   * @return runnerName
  **/
  @Schema(description = "The runner name")
  public String getRunnerName() {
    return runnerName;
  }

  public void setRunnerName(String runnerName) {
    this.runnerName = runnerName;
  }

  public RunnerInfo zone(String zone) {
    this.zone = zone;
    return this;
  }

   /**
   * Identifier of the zone
   * @return zone
  **/
  @Schema(description = "Identifier of the zone")
  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }

  public RunnerInfo tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public RunnerInfo putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<String, String>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Meta data of the runner, like image ID or processor architecture
   * @return tags
  **/
  @Schema(description = "Meta data of the runner, like image ID or processor architecture")
  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  public RunnerInfo features(Map<String, Boolean> features) {
    this.features = features;
    return this;
  }

  public RunnerInfo putFeaturesItem(String key, Boolean featuresItem) {
    if (this.features == null) {
      this.features = new HashMap<String, Boolean>();
    }
    this.features.put(key, featuresItem);
    return this;
  }

   /**
   * State of features of the runner
   * @return features
  **/
  @Schema(description = "State of features of the runner")
  public Map<String, Boolean> getFeatures() {
    return features;
  }

  public void setFeatures(Map<String, Boolean> features) {
    this.features = features;
  }

  public RunnerInfo buildInfo(RunnerBuildInfo buildInfo) {
    this.buildInfo = buildInfo;
    return this;
  }

   /**
   * Get buildInfo
   * @return buildInfo
  **/
  @Schema(description = "")
  public RunnerBuildInfo getBuildInfo() {
    return buildInfo;
  }

  public void setBuildInfo(RunnerBuildInfo buildInfo) {
    this.buildInfo = buildInfo;
  }

  public RunnerInfo hostIp(String hostIp) {
    this.hostIp = hostIp;
    return this;
  }

   /**
   * Host IP for the runner
   * @return hostIp
  **/
  @Schema(required = true, description = "Host IP for the runner")
  public String getHostIp() {
    return hostIp;
  }

  public void setHostIp(String hostIp) {
    this.hostIp = hostIp;
  }

  public RunnerInfo publicHostname(String publicHostname) {
    this.publicHostname = publicHostname;
    return this;
  }

   /**
   * Public hostname for the runner
   * @return publicHostname
  **/
  @Schema(required = true, description = "Public hostname for the runner")
  public String getPublicHostname() {
    return publicHostname;
  }

  public void setPublicHostname(String publicHostname) {
    this.publicHostname = publicHostname;
  }

  public RunnerInfo containers(List<RunnerContainerInfo> containers) {
    this.containers = containers;
    return this;
  }

  public RunnerInfo addContainersItem(RunnerContainerInfo containersItem) {
    this.containers.add(containersItem);
    return this;
  }

   /**
   * Containers for the runner
   * @return containers
  **/
  @Schema(required = true, description = "Containers for the runner")
  public List<RunnerContainerInfo> getContainers() {
    return containers;
  }

  public void setContainers(List<RunnerContainerInfo> containers) {
    this.containers = containers;
  }

  public RunnerInfo roles(List<RunnerRoleInfo> roles) {
    this.roles = roles;
    return this;
  }

  public RunnerInfo addRolesItem(RunnerRoleInfo rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Roles for the runner
   * @return roles
  **/
  @Schema(required = true, description = "Roles for the runner")
  public List<RunnerRoleInfo> getRoles() {
    return roles;
  }

  public void setRoles(List<RunnerRoleInfo> roles) {
    this.roles = roles;
  }

  public RunnerInfo connected(Boolean connected) {
    this.connected = connected;
    return this;
  }

   /**
   * Specifies if the runner is connected
   * @return connected
  **/
  @Schema(required = true, description = "Specifies if the runner is connected")
  public Boolean isConnected() {
    return connected;
  }

  public void setConnected(Boolean connected) {
    this.connected = connected;
  }

  public RunnerInfo healthy(Boolean healthy) {
    this.healthy = healthy;
    return this;
  }

   /**
   * Specifies if the runner is healthy
   * @return healthy
  **/
  @Schema(required = true, description = "Specifies if the runner is healthy")
  public Boolean isHealthy() {
    return healthy;
  }

  public void setHealthy(Boolean healthy) {
    this.healthy = healthy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunnerInfo runnerInfo = (RunnerInfo) o;
    return Objects.equals(this.runnerId, runnerInfo.runnerId) &&
        Objects.equals(this.runnerName, runnerInfo.runnerName) &&
        Objects.equals(this.zone, runnerInfo.zone) &&
        Objects.equals(this.tags, runnerInfo.tags) &&
        Objects.equals(this.features, runnerInfo.features) &&
        Objects.equals(this.buildInfo, runnerInfo.buildInfo) &&
        Objects.equals(this.hostIp, runnerInfo.hostIp) &&
        Objects.equals(this.publicHostname, runnerInfo.publicHostname) &&
        Objects.equals(this.containers, runnerInfo.containers) &&
        Objects.equals(this.roles, runnerInfo.roles) &&
        Objects.equals(this.connected, runnerInfo.connected) &&
        Objects.equals(this.healthy, runnerInfo.healthy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runnerId, runnerName, zone, tags, features, buildInfo, hostIp, publicHostname, containers, roles, connected, healthy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunnerInfo {\n");
    
    sb.append("    runnerId: ").append(toIndentedString(runnerId)).append("\n");
    sb.append("    runnerName: ").append(toIndentedString(runnerName)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    buildInfo: ").append(toIndentedString(buildInfo)).append("\n");
    sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
    sb.append("    publicHostname: ").append(toIndentedString(publicHostname)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
    sb.append("    healthy: ").append(toIndentedString(healthy)).append("\n");
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
