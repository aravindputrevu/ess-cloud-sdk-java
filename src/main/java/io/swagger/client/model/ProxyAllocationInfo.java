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
import io.swagger.client.model.ProxyAllocationCounts;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The single proxy allocation for a specified type, such as Elasticsearch, Kibana, or APM.
 */
@Schema(description = "The single proxy allocation for a specified type, such as Elasticsearch, Kibana, or APM.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ProxyAllocationInfo {
  @SerializedName("allocations_type")
  private String allocationsType = null;

  @SerializedName("counts")
  private ProxyAllocationCounts counts = null;

  public ProxyAllocationInfo allocationsType(String allocationsType) {
    this.allocationsType = allocationsType;
    return this;
  }

   /**
   * The type of proxy allocations (e.g. Elasticsearch, Kibana, APM)
   * @return allocationsType
  **/
  @Schema(required = true, description = "The type of proxy allocations (e.g. Elasticsearch, Kibana, APM)")
  public String getAllocationsType() {
    return allocationsType;
  }

  public void setAllocationsType(String allocationsType) {
    this.allocationsType = allocationsType;
  }

  public ProxyAllocationInfo counts(ProxyAllocationCounts counts) {
    this.counts = counts;
    return this;
  }

   /**
   * Get counts
   * @return counts
  **/
  @Schema(required = true, description = "")
  public ProxyAllocationCounts getCounts() {
    return counts;
  }

  public void setCounts(ProxyAllocationCounts counts) {
    this.counts = counts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProxyAllocationInfo proxyAllocationInfo = (ProxyAllocationInfo) o;
    return Objects.equals(this.allocationsType, proxyAllocationInfo.allocationsType) &&
        Objects.equals(this.counts, proxyAllocationInfo.counts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationsType, counts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProxyAllocationInfo {\n");
    
    sb.append("    allocationsType: ").append(toIndentedString(allocationsType)).append("\n");
    sb.append("    counts: ").append(toIndentedString(counts)).append("\n");
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
