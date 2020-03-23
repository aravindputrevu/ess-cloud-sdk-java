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
import io.swagger.client.model.ProxiesAllocationsInfo;
import io.swagger.client.model.ProxiesFilteredGroupHealth;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ProxiesHealth
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ProxiesHealth {
  @SerializedName("observed_proxies_count")
  private Integer observedProxiesCount = null;

  @SerializedName("expected_proxies_count")
  private Integer expectedProxiesCount = null;

  @SerializedName("allocations")
  private List<ProxiesAllocationsInfo> allocations = new ArrayList<ProxiesAllocationsInfo>();

  @SerializedName("filtered_groups")
  private List<ProxiesFilteredGroupHealth> filteredGroups = new ArrayList<ProxiesFilteredGroupHealth>();

  @SerializedName("status")
  private String status = null;

  public ProxiesHealth observedProxiesCount(Integer observedProxiesCount) {
    this.observedProxiesCount = observedProxiesCount;
    return this;
  }

   /**
   * Total number of proxies
   * @return observedProxiesCount
  **/
  @Schema(required = true, description = "Total number of proxies")
  public Integer getObservedProxiesCount() {
    return observedProxiesCount;
  }

  public void setObservedProxiesCount(Integer observedProxiesCount) {
    this.observedProxiesCount = observedProxiesCount;
  }

  public ProxiesHealth expectedProxiesCount(Integer expectedProxiesCount) {
    this.expectedProxiesCount = expectedProxiesCount;
    return this;
  }

   /**
   * Expected minimum number of proxies
   * @return expectedProxiesCount
  **/
  @Schema(required = true, description = "Expected minimum number of proxies")
  public Integer getExpectedProxiesCount() {
    return expectedProxiesCount;
  }

  public void setExpectedProxiesCount(Integer expectedProxiesCount) {
    this.expectedProxiesCount = expectedProxiesCount;
  }

  public ProxiesHealth allocations(List<ProxiesAllocationsInfo> allocations) {
    this.allocations = allocations;
    return this;
  }

  public ProxiesHealth addAllocationsItem(ProxiesAllocationsInfo allocationsItem) {
    this.allocations.add(allocationsItem);
    return this;
  }

   /**
   * Allocations for proxies
   * @return allocations
  **/
  @Schema(required = true, description = "Allocations for proxies")
  public List<ProxiesAllocationsInfo> getAllocations() {
    return allocations;
  }

  public void setAllocations(List<ProxiesAllocationsInfo> allocations) {
    this.allocations = allocations;
  }

  public ProxiesHealth filteredGroups(List<ProxiesFilteredGroupHealth> filteredGroups) {
    this.filteredGroups = filteredGroups;
    return this;
  }

  public ProxiesHealth addFilteredGroupsItem(ProxiesFilteredGroupHealth filteredGroupsItem) {
    this.filteredGroups.add(filteredGroupsItem);
    return this;
  }

   /**
   * Filtered groups of proxies with associated status
   * @return filteredGroups
  **/
  @Schema(required = true, description = "Filtered groups of proxies with associated status")
  public List<ProxiesFilteredGroupHealth> getFilteredGroups() {
    return filteredGroups;
  }

  public void setFilteredGroups(List<ProxiesFilteredGroupHealth> filteredGroups) {
    this.filteredGroups = filteredGroups;
  }

  public ProxiesHealth status(String status) {
    this.status = status;
    return this;
  }

   /**
   * \&quot;Health status for all proxies. One of \&quot;Green\&quot;, \&quot;Yellow\&quot; or \&quot;Red\&quot;
   * @return status
  **/
  @Schema(required = true, description = "\"Health status for all proxies. One of \"Green\", \"Yellow\" or \"Red\"")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProxiesHealth proxiesHealth = (ProxiesHealth) o;
    return Objects.equals(this.observedProxiesCount, proxiesHealth.observedProxiesCount) &&
        Objects.equals(this.expectedProxiesCount, proxiesHealth.expectedProxiesCount) &&
        Objects.equals(this.allocations, proxiesHealth.allocations) &&
        Objects.equals(this.filteredGroups, proxiesHealth.filteredGroups) &&
        Objects.equals(this.status, proxiesHealth.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(observedProxiesCount, expectedProxiesCount, allocations, filteredGroups, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProxiesHealth {\n");
    
    sb.append("    observedProxiesCount: ").append(toIndentedString(observedProxiesCount)).append("\n");
    sb.append("    expectedProxiesCount: ").append(toIndentedString(expectedProxiesCount)).append("\n");
    sb.append("    allocations: ").append(toIndentedString(allocations)).append("\n");
    sb.append("    filteredGroups: ").append(toIndentedString(filteredGroups)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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