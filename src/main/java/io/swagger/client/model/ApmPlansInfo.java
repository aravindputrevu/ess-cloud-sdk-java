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
import io.swagger.client.model.ApmPlanInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Information about current, pending, and past APM Server plans.
 */
@Schema(description = "Information about current, pending, and past APM Server plans.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ApmPlansInfo {
  @SerializedName("healthy")
  private Boolean healthy = null;

  @SerializedName("current")
  private ApmPlanInfo current = null;

  @SerializedName("pending")
  private ApmPlanInfo pending = null;

  @SerializedName("history")
  private List<ApmPlanInfo> history = new ArrayList<ApmPlanInfo>();

  public ApmPlansInfo healthy(Boolean healthy) {
    this.healthy = healthy;
    return this;
  }

   /**
   * Whether the plan situation is healthy (if unhealthy, means the last plan attempt failed)
   * @return healthy
  **/
  @Schema(required = true, description = "Whether the plan situation is healthy (if unhealthy, means the last plan attempt failed)")
  public Boolean isHealthy() {
    return healthy;
  }

  public void setHealthy(Boolean healthy) {
    this.healthy = healthy;
  }

  public ApmPlansInfo current(ApmPlanInfo current) {
    this.current = current;
    return this;
  }

   /**
   * Get current
   * @return current
  **/
  @Schema(description = "")
  public ApmPlanInfo getCurrent() {
    return current;
  }

  public void setCurrent(ApmPlanInfo current) {
    this.current = current;
  }

  public ApmPlansInfo pending(ApmPlanInfo pending) {
    this.pending = pending;
    return this;
  }

   /**
   * Get pending
   * @return pending
  **/
  @Schema(description = "")
  public ApmPlanInfo getPending() {
    return pending;
  }

  public void setPending(ApmPlanInfo pending) {
    this.pending = pending;
  }

  public ApmPlansInfo history(List<ApmPlanInfo> history) {
    this.history = history;
    return this;
  }

  public ApmPlansInfo addHistoryItem(ApmPlanInfo historyItem) {
    this.history.add(historyItem);
    return this;
  }

   /**
   * Get history
   * @return history
  **/
  @Schema(required = true, description = "")
  public List<ApmPlanInfo> getHistory() {
    return history;
  }

  public void setHistory(List<ApmPlanInfo> history) {
    this.history = history;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApmPlansInfo apmPlansInfo = (ApmPlansInfo) o;
    return Objects.equals(this.healthy, apmPlansInfo.healthy) &&
        Objects.equals(this.current, apmPlansInfo.current) &&
        Objects.equals(this.pending, apmPlansInfo.pending) &&
        Objects.equals(this.history, apmPlansInfo.history);
  }

  @Override
  public int hashCode() {
    return Objects.hash(healthy, current, pending, history);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApmPlansInfo {\n");
    
    sb.append("    healthy: ").append(toIndentedString(healthy)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
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