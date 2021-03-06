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
import io.swagger.client.model.AllocatorInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * The allocators for the specified zone.
 */
@Schema(description = "The allocators for the specified zone.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class AllocatorZoneInfo {
  @SerializedName("zone_id")
  private String zoneId = null;

  @SerializedName("allocators")
  private List<AllocatorInfo> allocators = new ArrayList<AllocatorInfo>();

  public AllocatorZoneInfo zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Identifier of the zone
   * @return zoneId
  **/
  @Schema(required = true, description = "Identifier of the zone")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }

  public AllocatorZoneInfo allocators(List<AllocatorInfo> allocators) {
    this.allocators = allocators;
    return this;
  }

  public AllocatorZoneInfo addAllocatorsItem(AllocatorInfo allocatorsItem) {
    this.allocators.add(allocatorsItem);
    return this;
  }

   /**
   * Get allocators
   * @return allocators
  **/
  @Schema(required = true, description = "")
  public List<AllocatorInfo> getAllocators() {
    return allocators;
  }

  public void setAllocators(List<AllocatorInfo> allocators) {
    this.allocators = allocators;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllocatorZoneInfo allocatorZoneInfo = (AllocatorZoneInfo) o;
    return Objects.equals(this.zoneId, allocatorZoneInfo.zoneId) &&
        Objects.equals(this.allocators, allocatorZoneInfo.allocators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zoneId, allocators);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocatorZoneInfo {\n");
    
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
    sb.append("    allocators: ").append(toIndentedString(allocators)).append("\n");
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
