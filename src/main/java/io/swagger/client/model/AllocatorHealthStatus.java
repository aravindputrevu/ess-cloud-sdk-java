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
 * The health status of the allocator.
 */
@Schema(description = "The health status of the allocator.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class AllocatorHealthStatus {
  @SerializedName("connected")
  private Boolean connected = null;

  @SerializedName("healthy")
  private Boolean healthy = null;

  @SerializedName("maintenance_mode")
  private Boolean maintenanceMode = null;

  public AllocatorHealthStatus connected(Boolean connected) {
    this.connected = connected;
    return this;
  }

   /**
   * Whether the allocator is connected
   * @return connected
  **/
  @Schema(required = true, description = "Whether the allocator is connected")
  public Boolean isConnected() {
    return connected;
  }

  public void setConnected(Boolean connected) {
    this.connected = connected;
  }

  public AllocatorHealthStatus healthy(Boolean healthy) {
    this.healthy = healthy;
    return this;
  }

   /**
   * Whether the allocator is healthy, meaning it is either connected or has no instances
   * @return healthy
  **/
  @Schema(required = true, description = "Whether the allocator is healthy, meaning it is either connected or has no instances")
  public Boolean isHealthy() {
    return healthy;
  }

  public void setHealthy(Boolean healthy) {
    this.healthy = healthy;
  }

  public AllocatorHealthStatus maintenanceMode(Boolean maintenanceMode) {
    this.maintenanceMode = maintenanceMode;
    return this;
  }

   /**
   * Whether the allocator is in maintenance mode (meaning that new workload won&#x27;t be assigned to it)
   * @return maintenanceMode
  **/
  @Schema(required = true, description = "Whether the allocator is in maintenance mode (meaning that new workload won't be assigned to it)")
  public Boolean isMaintenanceMode() {
    return maintenanceMode;
  }

  public void setMaintenanceMode(Boolean maintenanceMode) {
    this.maintenanceMode = maintenanceMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllocatorHealthStatus allocatorHealthStatus = (AllocatorHealthStatus) o;
    return Objects.equals(this.connected, allocatorHealthStatus.connected) &&
        Objects.equals(this.healthy, allocatorHealthStatus.healthy) &&
        Objects.equals(this.maintenanceMode, allocatorHealthStatus.maintenanceMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connected, healthy, maintenanceMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocatorHealthStatus {\n");
    
    sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
    sb.append("    healthy: ").append(toIndentedString(healthy)).append("\n");
    sb.append("    maintenanceMode: ").append(toIndentedString(maintenanceMode)).append("\n");
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
