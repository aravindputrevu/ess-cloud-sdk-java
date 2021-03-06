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
import io.swagger.client.model.RunnerInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Information about all of the runners.
 */
@Schema(description = "Information about all of the runners.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class RunnerOverview {
  @SerializedName("runners")
  private List<RunnerInfo> runners = new ArrayList<RunnerInfo>();

  public RunnerOverview runners(List<RunnerInfo> runners) {
    this.runners = runners;
    return this;
  }

  public RunnerOverview addRunnersItem(RunnerInfo runnersItem) {
    this.runners.add(runnersItem);
    return this;
  }

   /**
   * List of runners
   * @return runners
  **/
  @Schema(required = true, description = "List of runners")
  public List<RunnerInfo> getRunners() {
    return runners;
  }

  public void setRunners(List<RunnerInfo> runners) {
    this.runners = runners;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunnerOverview runnerOverview = (RunnerOverview) o;
    return Objects.equals(this.runners, runnerOverview.runners);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runners);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunnerOverview {\n");
    
    sb.append("    runners: ").append(toIndentedString(runners)).append("\n");
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
