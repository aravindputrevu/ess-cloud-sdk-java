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
import io.swagger.client.model.ProxyAllocationInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Information about a proxy.
 */
@Schema(description = "Information about a proxy.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ProxyInfo {
  @SerializedName("proxy_id")
  private String proxyId = null;

  @SerializedName("runner_id")
  private String runnerId = null;

  @SerializedName("host_ip")
  private String hostIp = null;

  @SerializedName("public_hostname")
  private String publicHostname = null;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("healthy")
  private Boolean healthy = null;

  @SerializedName("zone")
  private String zone = null;

  @SerializedName("allocations")
  private List<ProxyAllocationInfo> allocations = new ArrayList<ProxyAllocationInfo>();

  public ProxyInfo proxyId(String proxyId) {
    this.proxyId = proxyId;
    return this;
  }

   /**
   * The proxy identifier
   * @return proxyId
  **/
  @Schema(required = true, description = "The proxy identifier")
  public String getProxyId() {
    return proxyId;
  }

  public void setProxyId(String proxyId) {
    this.proxyId = proxyId;
  }

  public ProxyInfo runnerId(String runnerId) {
    this.runnerId = runnerId;
    return this;
  }

   /**
   * Identifier of the runner for the proxy
   * @return runnerId
  **/
  @Schema(description = "Identifier of the runner for the proxy")
  public String getRunnerId() {
    return runnerId;
  }

  public void setRunnerId(String runnerId) {
    this.runnerId = runnerId;
  }

  public ProxyInfo hostIp(String hostIp) {
    this.hostIp = hostIp;
    return this;
  }

   /**
   * IP of the host the proxy runs on
   * @return hostIp
  **/
  @Schema(required = true, description = "IP of the host the proxy runs on")
  public String getHostIp() {
    return hostIp;
  }

  public void setHostIp(String hostIp) {
    this.hostIp = hostIp;
  }

  public ProxyInfo publicHostname(String publicHostname) {
    this.publicHostname = publicHostname;
    return this;
  }

   /**
   * Public hostname of the host the proxy runs on
   * @return publicHostname
  **/
  @Schema(required = true, description = "Public hostname of the host the proxy runs on")
  public String getPublicHostname() {
    return publicHostname;
  }

  public void setPublicHostname(String publicHostname) {
    this.publicHostname = publicHostname;
  }

  public ProxyInfo metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Arbitrary metadata associated with the proxy
   * @return metadata
  **/
  @Schema(required = true, description = "Arbitrary metadata associated with the proxy")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public ProxyInfo healthy(Boolean healthy) {
    this.healthy = healthy;
    return this;
  }

   /**
   * Specifies if the proxy is healthy
   * @return healthy
  **/
  @Schema(required = true, description = "Specifies if the proxy is healthy")
  public Boolean isHealthy() {
    return healthy;
  }

  public void setHealthy(Boolean healthy) {
    this.healthy = healthy;
  }

  public ProxyInfo zone(String zone) {
    this.zone = zone;
    return this;
  }

   /**
   * The zone.
   * @return zone
  **/
  @Schema(description = "The zone.")
  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }

  public ProxyInfo allocations(List<ProxyAllocationInfo> allocations) {
    this.allocations = allocations;
    return this;
  }

  public ProxyInfo addAllocationsItem(ProxyAllocationInfo allocationsItem) {
    this.allocations.add(allocationsItem);
    return this;
  }

   /**
   * Allocation information by type.
   * @return allocations
  **/
  @Schema(required = true, description = "Allocation information by type.")
  public List<ProxyAllocationInfo> getAllocations() {
    return allocations;
  }

  public void setAllocations(List<ProxyAllocationInfo> allocations) {
    this.allocations = allocations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProxyInfo proxyInfo = (ProxyInfo) o;
    return Objects.equals(this.proxyId, proxyInfo.proxyId) &&
        Objects.equals(this.runnerId, proxyInfo.runnerId) &&
        Objects.equals(this.hostIp, proxyInfo.hostIp) &&
        Objects.equals(this.publicHostname, proxyInfo.publicHostname) &&
        Objects.equals(this.metadata, proxyInfo.metadata) &&
        Objects.equals(this.healthy, proxyInfo.healthy) &&
        Objects.equals(this.zone, proxyInfo.zone) &&
        Objects.equals(this.allocations, proxyInfo.allocations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proxyId, runnerId, hostIp, publicHostname, metadata, healthy, zone, allocations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProxyInfo {\n");
    
    sb.append("    proxyId: ").append(toIndentedString(proxyId)).append("\n");
    sb.append("    runnerId: ").append(toIndentedString(runnerId)).append("\n");
    sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
    sb.append("    publicHostname: ").append(toIndentedString(publicHostname)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    healthy: ").append(toIndentedString(healthy)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
    sb.append("    allocations: ").append(toIndentedString(allocations)).append("\n");
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