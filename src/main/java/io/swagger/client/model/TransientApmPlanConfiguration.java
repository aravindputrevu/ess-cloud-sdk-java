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
import io.swagger.client.model.ApmPlanControlConfiguration;
import io.swagger.client.model.PlanStrategy;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Defines the configuration parameters that control how the plan is applied. For example, the Elasticsearch cluster topology and APM Server settings.
 */
@Schema(description = "Defines the configuration parameters that control how the plan is applied. For example, the Elasticsearch cluster topology and APM Server settings.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class TransientApmPlanConfiguration {
  @SerializedName("strategy")
  private PlanStrategy strategy = null;

  @SerializedName("plan_configuration")
  private ApmPlanControlConfiguration planConfiguration = null;

  public TransientApmPlanConfiguration strategy(PlanStrategy strategy) {
    this.strategy = strategy;
    return this;
  }

   /**
   * Get strategy
   * @return strategy
  **/
  @Schema(description = "")
  public PlanStrategy getStrategy() {
    return strategy;
  }

  public void setStrategy(PlanStrategy strategy) {
    this.strategy = strategy;
  }

  public TransientApmPlanConfiguration planConfiguration(ApmPlanControlConfiguration planConfiguration) {
    this.planConfiguration = planConfiguration;
    return this;
  }

   /**
   * Get planConfiguration
   * @return planConfiguration
  **/
  @Schema(description = "")
  public ApmPlanControlConfiguration getPlanConfiguration() {
    return planConfiguration;
  }

  public void setPlanConfiguration(ApmPlanControlConfiguration planConfiguration) {
    this.planConfiguration = planConfiguration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransientApmPlanConfiguration transientApmPlanConfiguration = (TransientApmPlanConfiguration) o;
    return Objects.equals(this.strategy, transientApmPlanConfiguration.strategy) &&
        Objects.equals(this.planConfiguration, transientApmPlanConfiguration.planConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(strategy, planConfiguration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransientApmPlanConfiguration {\n");
    
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    planConfiguration: ").append(toIndentedString(planConfiguration)).append("\n");
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