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
import io.swagger.client.model.ConfigStoreOption;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * A list of Config Store values.
 */
@Schema(description = "A list of Config Store values.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ConfigStoreOptionList {
  @SerializedName("values")
  private List<ConfigStoreOption> values = new ArrayList<ConfigStoreOption>();

  public ConfigStoreOptionList values(List<ConfigStoreOption> values) {
    this.values = values;
    return this;
  }

  public ConfigStoreOptionList addValuesItem(ConfigStoreOption valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * List of Config Store Options
   * @return values
  **/
  @Schema(required = true, description = "List of Config Store Options")
  public List<ConfigStoreOption> getValues() {
    return values;
  }

  public void setValues(List<ConfigStoreOption> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigStoreOptionList configStoreOptionList = (ConfigStoreOptionList) o;
    return Objects.equals(this.values, configStoreOptionList.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigStoreOptionList {\n");
    
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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