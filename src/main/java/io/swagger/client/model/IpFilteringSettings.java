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
import java.util.ArrayList;
import java.util.List;
/**
 * The configuration settings for IP filtering.
 */
@Schema(description = "The configuration settings for IP filtering.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class IpFilteringSettings {
  @SerializedName("rulesets")
  private List<String> rulesets = new ArrayList<String>();

  public IpFilteringSettings rulesets(List<String> rulesets) {
    this.rulesets = rulesets;
    return this;
  }

  public IpFilteringSettings addRulesetsItem(String rulesetsItem) {
    this.rulesets.add(rulesetsItem);
    return this;
  }

   /**
   * IDs of the IP filter rulesets
   * @return rulesets
  **/
  @Schema(required = true, description = "IDs of the IP filter rulesets")
  public List<String> getRulesets() {
    return rulesets;
  }

  public void setRulesets(List<String> rulesets) {
    this.rulesets = rulesets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpFilteringSettings ipFilteringSettings = (IpFilteringSettings) o;
    return Objects.equals(this.rulesets, ipFilteringSettings.rulesets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rulesets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpFilteringSettings {\n");
    
    sb.append("    rulesets: ").append(toIndentedString(rulesets)).append("\n");
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
