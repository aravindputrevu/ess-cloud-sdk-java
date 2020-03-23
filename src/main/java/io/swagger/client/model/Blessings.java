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
import io.swagger.client.model.Blessing;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Describes whether certain runners are blessed to run a Role.
 */
@Schema(description = "Describes whether certain runners are blessed to run a Role.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class Blessings {
  @SerializedName("runner_ids_to_blessing")
  private Map<String, Blessing> runnerIdsToBlessing = new HashMap<String, Blessing>();

  public Blessings runnerIdsToBlessing(Map<String, Blessing> runnerIdsToBlessing) {
    this.runnerIdsToBlessing = runnerIdsToBlessing;
    return this;
  }

  public Blessings putRunnerIdsToBlessingItem(String key, Blessing runnerIdsToBlessingItem) {
    this.runnerIdsToBlessing.put(key, runnerIdsToBlessingItem);
    return this;
  }

   /**
   * A mapping of Runner Ids to whether or not they are blessed to run the associated role
   * @return runnerIdsToBlessing
  **/
  @Schema(required = true, description = "A mapping of Runner Ids to whether or not they are blessed to run the associated role")
  public Map<String, Blessing> getRunnerIdsToBlessing() {
    return runnerIdsToBlessing;
  }

  public void setRunnerIdsToBlessing(Map<String, Blessing> runnerIdsToBlessing) {
    this.runnerIdsToBlessing = runnerIdsToBlessing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Blessings blessings = (Blessings) o;
    return Objects.equals(this.runnerIdsToBlessing, blessings.runnerIdsToBlessing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runnerIdsToBlessing);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Blessings {\n");
    
    sb.append("    runnerIdsToBlessing: ").append(toIndentedString(runnerIdsToBlessing)).append("\n");
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