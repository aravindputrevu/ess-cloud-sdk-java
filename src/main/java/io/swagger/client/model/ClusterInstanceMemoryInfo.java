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
 * Information about the memory capacity and use of the Kibana instance or APM Server.
 */
@Schema(description = "Information about the memory capacity and use of the Kibana instance or APM Server.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ClusterInstanceMemoryInfo {
  @SerializedName("instance_capacity")
  private Integer instanceCapacity = null;

  @SerializedName("instance_capacity_planned")
  private Integer instanceCapacityPlanned = null;

  @SerializedName("memory_pressure")
  private Integer memoryPressure = null;

  @SerializedName("native_memory_pressure")
  private Integer nativeMemoryPressure = null;

  public ClusterInstanceMemoryInfo instanceCapacity(Integer instanceCapacity) {
    this.instanceCapacity = instanceCapacity;
    return this;
  }

   /**
   * The memory capacity in MB of the instance
   * @return instanceCapacity
  **/
  @Schema(required = true, description = "The memory capacity in MB of the instance")
  public Integer getInstanceCapacity() {
    return instanceCapacity;
  }

  public void setInstanceCapacity(Integer instanceCapacity) {
    this.instanceCapacity = instanceCapacity;
  }

  public ClusterInstanceMemoryInfo instanceCapacityPlanned(Integer instanceCapacityPlanned) {
    this.instanceCapacityPlanned = instanceCapacityPlanned;
    return this;
  }

   /**
   * The planned memory capacity in MB of the instance (only shown when an override is present)
   * @return instanceCapacityPlanned
  **/
  @Schema(description = "The planned memory capacity in MB of the instance (only shown when an override is present)")
  public Integer getInstanceCapacityPlanned() {
    return instanceCapacityPlanned;
  }

  public void setInstanceCapacityPlanned(Integer instanceCapacityPlanned) {
    this.instanceCapacityPlanned = instanceCapacityPlanned;
  }

  public ClusterInstanceMemoryInfo memoryPressure(Integer memoryPressure) {
    this.memoryPressure = memoryPressure;
    return this;
  }

   /**
   * The % memory pressure of the service if available (60-75% consider increasing capacity, &gt;75% can incur significant performance and stability issues)
   * @return memoryPressure
  **/
  @Schema(description = "The % memory pressure of the service if available (60-75% consider increasing capacity, >75% can incur significant performance and stability issues)")
  public Integer getMemoryPressure() {
    return memoryPressure;
  }

  public void setMemoryPressure(Integer memoryPressure) {
    this.memoryPressure = memoryPressure;
  }

  public ClusterInstanceMemoryInfo nativeMemoryPressure(Integer nativeMemoryPressure) {
    this.nativeMemoryPressure = nativeMemoryPressure;
    return this;
  }

   /**
   * The % native memory pressure of the service if available
   * @return nativeMemoryPressure
  **/
  @Schema(description = "The % native memory pressure of the service if available")
  public Integer getNativeMemoryPressure() {
    return nativeMemoryPressure;
  }

  public void setNativeMemoryPressure(Integer nativeMemoryPressure) {
    this.nativeMemoryPressure = nativeMemoryPressure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterInstanceMemoryInfo clusterInstanceMemoryInfo = (ClusterInstanceMemoryInfo) o;
    return Objects.equals(this.instanceCapacity, clusterInstanceMemoryInfo.instanceCapacity) &&
        Objects.equals(this.instanceCapacityPlanned, clusterInstanceMemoryInfo.instanceCapacityPlanned) &&
        Objects.equals(this.memoryPressure, clusterInstanceMemoryInfo.memoryPressure) &&
        Objects.equals(this.nativeMemoryPressure, clusterInstanceMemoryInfo.nativeMemoryPressure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceCapacity, instanceCapacityPlanned, memoryPressure, nativeMemoryPressure);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterInstanceMemoryInfo {\n");
    
    sb.append("    instanceCapacity: ").append(toIndentedString(instanceCapacity)).append("\n");
    sb.append("    instanceCapacityPlanned: ").append(toIndentedString(instanceCapacityPlanned)).append("\n");
    sb.append("    memoryPressure: ").append(toIndentedString(memoryPressure)).append("\n");
    sb.append("    nativeMemoryPressure: ").append(toIndentedString(nativeMemoryPressure)).append("\n");
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
