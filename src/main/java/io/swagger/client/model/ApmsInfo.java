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
import io.swagger.client.model.ApmInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * A container for information about a set of APM Servers.
 */
@Schema(description = "A container for information about a set of APM Servers.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ApmsInfo {
  @SerializedName("return_count")
  private Integer returnCount = null;

  @SerializedName("match_count")
  private Integer matchCount = null;

  @SerializedName("apms")
  private List<ApmInfo> apms = new ArrayList<ApmInfo>();

  public ApmsInfo returnCount(Integer returnCount) {
    this.returnCount = returnCount;
    return this;
  }

   /**
   * The number of clusters actually returned
   * @return returnCount
  **/
  @Schema(required = true, description = "The number of clusters actually returned")
  public Integer getReturnCount() {
    return returnCount;
  }

  public void setReturnCount(Integer returnCount) {
    this.returnCount = returnCount;
  }

  public ApmsInfo matchCount(Integer matchCount) {
    this.matchCount = matchCount;
    return this;
  }

   /**
   * If a query is supplied, then the total number of clusters that matched
   * @return matchCount
  **/
  @Schema(description = "If a query is supplied, then the total number of clusters that matched")
  public Integer getMatchCount() {
    return matchCount;
  }

  public void setMatchCount(Integer matchCount) {
    this.matchCount = matchCount;
  }

  public ApmsInfo apms(List<ApmInfo> apms) {
    this.apms = apms;
    return this;
  }

  public ApmsInfo addApmsItem(ApmInfo apmsItem) {
    this.apms.add(apmsItem);
    return this;
  }

   /**
   * Get apms
   * @return apms
  **/
  @Schema(required = true, description = "")
  public List<ApmInfo> getApms() {
    return apms;
  }

  public void setApms(List<ApmInfo> apms) {
    this.apms = apms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApmsInfo apmsInfo = (ApmsInfo) o;
    return Objects.equals(this.returnCount, apmsInfo.returnCount) &&
        Objects.equals(this.matchCount, apmsInfo.matchCount) &&
        Objects.equals(this.apms, apmsInfo.apms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnCount, matchCount, apms);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApmsInfo {\n");
    
    sb.append("    returnCount: ").append(toIndentedString(returnCount)).append("\n");
    sb.append("    matchCount: ").append(toIndentedString(matchCount)).append("\n");
    sb.append("    apms: ").append(toIndentedString(apms)).append("\n");
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
