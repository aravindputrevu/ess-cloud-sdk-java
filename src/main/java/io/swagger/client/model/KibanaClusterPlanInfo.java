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
import io.swagger.client.model.ChangeSourceInfo;
import io.swagger.client.model.ClusterPlanStepInfo;
import io.swagger.client.model.KibanaClusterPlan;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * Information about the current, pending, or past Kibana instance plan.
 */
@Schema(description = "Information about the current, pending, or past Kibana instance plan.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class KibanaClusterPlanInfo {
  @SerializedName("plan_attempt_id")
  private String planAttemptId = null;

  @SerializedName("plan_attempt_name")
  private String planAttemptName = null;

  @SerializedName("healthy")
  private Boolean healthy = null;

  @SerializedName("attempt_start_time")
  private OffsetDateTime attemptStartTime = null;

  @SerializedName("attempt_end_time")
  private OffsetDateTime attemptEndTime = null;

  @SerializedName("plan_end_time")
  private OffsetDateTime planEndTime = null;

  @SerializedName("plan")
  private KibanaClusterPlan plan = null;

  @SerializedName("plan_attempt_log")
  private List<ClusterPlanStepInfo> planAttemptLog = new ArrayList<ClusterPlanStepInfo>();

  @SerializedName("source")
  private ChangeSourceInfo source = null;

  public KibanaClusterPlanInfo planAttemptId(String planAttemptId) {
    this.planAttemptId = planAttemptId;
    return this;
  }

   /**
   * A UUID for each plan attempt
   * @return planAttemptId
  **/
  @Schema(description = "A UUID for each plan attempt")
  public String getPlanAttemptId() {
    return planAttemptId;
  }

  public void setPlanAttemptId(String planAttemptId) {
    this.planAttemptId = planAttemptId;
  }

  public KibanaClusterPlanInfo planAttemptName(String planAttemptName) {
    this.planAttemptName = planAttemptName;
    return this;
  }

   /**
   * A human readable name for each plan attempt, only populated when retrieving plan histories
   * @return planAttemptName
  **/
  @Schema(description = "A human readable name for each plan attempt, only populated when retrieving plan histories")
  public String getPlanAttemptName() {
    return planAttemptName;
  }

  public void setPlanAttemptName(String planAttemptName) {
    this.planAttemptName = planAttemptName;
  }

  public KibanaClusterPlanInfo healthy(Boolean healthy) {
    this.healthy = healthy;
    return this;
  }

   /**
   * Either the plan ended successfully, or is not yet completed (and no errors have occurred)
   * @return healthy
  **/
  @Schema(required = true, description = "Either the plan ended successfully, or is not yet completed (and no errors have occurred)")
  public Boolean isHealthy() {
    return healthy;
  }

  public void setHealthy(Boolean healthy) {
    this.healthy = healthy;
  }

  public KibanaClusterPlanInfo attemptStartTime(OffsetDateTime attemptStartTime) {
    this.attemptStartTime = attemptStartTime;
    return this;
  }

   /**
   * When this plan attempt (ie to apply the plan to the cluster) started (ISO format in UTC)
   * @return attemptStartTime
  **/
  @Schema(required = true, description = "When this plan attempt (ie to apply the plan to the cluster) started (ISO format in UTC)")
  public OffsetDateTime getAttemptStartTime() {
    return attemptStartTime;
  }

  public void setAttemptStartTime(OffsetDateTime attemptStartTime) {
    this.attemptStartTime = attemptStartTime;
  }

  public KibanaClusterPlanInfo attemptEndTime(OffsetDateTime attemptEndTime) {
    this.attemptEndTime = attemptEndTime;
    return this;
  }

   /**
   * If this plan completed or failed (ie is not pending), when the attempt ended (ISO format in UTC)
   * @return attemptEndTime
  **/
  @Schema(description = "If this plan completed or failed (ie is not pending), when the attempt ended (ISO format in UTC)")
  public OffsetDateTime getAttemptEndTime() {
    return attemptEndTime;
  }

  public void setAttemptEndTime(OffsetDateTime attemptEndTime) {
    this.attemptEndTime = attemptEndTime;
  }

  public KibanaClusterPlanInfo planEndTime(OffsetDateTime planEndTime) {
    this.planEndTime = planEndTime;
    return this;
  }

   /**
   * If this plan is not current or pending, when the plan was no longer active (ISO format in UTC)
   * @return planEndTime
  **/
  @Schema(description = "If this plan is not current or pending, when the plan was no longer active (ISO format in UTC)")
  public OffsetDateTime getPlanEndTime() {
    return planEndTime;
  }

  public void setPlanEndTime(OffsetDateTime planEndTime) {
    this.planEndTime = planEndTime;
  }

  public KibanaClusterPlanInfo plan(KibanaClusterPlan plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Get plan
   * @return plan
  **/
  @Schema(description = "")
  public KibanaClusterPlan getPlan() {
    return plan;
  }

  public void setPlan(KibanaClusterPlan plan) {
    this.plan = plan;
  }

  public KibanaClusterPlanInfo planAttemptLog(List<ClusterPlanStepInfo> planAttemptLog) {
    this.planAttemptLog = planAttemptLog;
    return this;
  }

  public KibanaClusterPlanInfo addPlanAttemptLogItem(ClusterPlanStepInfo planAttemptLogItem) {
    this.planAttemptLog.add(planAttemptLogItem);
    return this;
  }

   /**
   * Get planAttemptLog
   * @return planAttemptLog
  **/
  @Schema(required = true, description = "")
  public List<ClusterPlanStepInfo> getPlanAttemptLog() {
    return planAttemptLog;
  }

  public void setPlanAttemptLog(List<ClusterPlanStepInfo> planAttemptLog) {
    this.planAttemptLog = planAttemptLog;
  }

  public KibanaClusterPlanInfo source(ChangeSourceInfo source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(description = "")
  public ChangeSourceInfo getSource() {
    return source;
  }

  public void setSource(ChangeSourceInfo source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KibanaClusterPlanInfo kibanaClusterPlanInfo = (KibanaClusterPlanInfo) o;
    return Objects.equals(this.planAttemptId, kibanaClusterPlanInfo.planAttemptId) &&
        Objects.equals(this.planAttemptName, kibanaClusterPlanInfo.planAttemptName) &&
        Objects.equals(this.healthy, kibanaClusterPlanInfo.healthy) &&
        Objects.equals(this.attemptStartTime, kibanaClusterPlanInfo.attemptStartTime) &&
        Objects.equals(this.attemptEndTime, kibanaClusterPlanInfo.attemptEndTime) &&
        Objects.equals(this.planEndTime, kibanaClusterPlanInfo.planEndTime) &&
        Objects.equals(this.plan, kibanaClusterPlanInfo.plan) &&
        Objects.equals(this.planAttemptLog, kibanaClusterPlanInfo.planAttemptLog) &&
        Objects.equals(this.source, kibanaClusterPlanInfo.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planAttemptId, planAttemptName, healthy, attemptStartTime, attemptEndTime, planEndTime, plan, planAttemptLog, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KibanaClusterPlanInfo {\n");
    
    sb.append("    planAttemptId: ").append(toIndentedString(planAttemptId)).append("\n");
    sb.append("    planAttemptName: ").append(toIndentedString(planAttemptName)).append("\n");
    sb.append("    healthy: ").append(toIndentedString(healthy)).append("\n");
    sb.append("    attemptStartTime: ").append(toIndentedString(attemptStartTime)).append("\n");
    sb.append("    attemptEndTime: ").append(toIndentedString(attemptEndTime)).append("\n");
    sb.append("    planEndTime: ").append(toIndentedString(planEndTime)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    planAttemptLog: ").append(toIndentedString(planAttemptLog)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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