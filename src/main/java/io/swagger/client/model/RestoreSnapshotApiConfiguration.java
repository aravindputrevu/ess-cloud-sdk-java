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
 * The configuration for the restore command, such as which indices you want to restore.
 */
@Schema(description = "The configuration for the restore command, such as which indices you want to restore.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class RestoreSnapshotApiConfiguration {
  @SerializedName("indices")
  private List<String> indices = null;

  @SerializedName("raw_settings")
  private Object rawSettings = null;

  public RestoreSnapshotApiConfiguration indices(List<String> indices) {
    this.indices = indices;
    return this;
  }

  public RestoreSnapshotApiConfiguration addIndicesItem(String indicesItem) {
    if (this.indices == null) {
      this.indices = new ArrayList<String>();
    }
    this.indices.add(indicesItem);
    return this;
  }

   /**
   * The list of indices to restore (supports +ve and -ve selection and wildcarding - see the default Elasticsearch index format documentation)
   * @return indices
  **/
  @Schema(description = "The list of indices to restore (supports +ve and -ve selection and wildcarding - see the default Elasticsearch index format documentation)")
  public List<String> getIndices() {
    return indices;
  }

  public void setIndices(List<String> indices) {
    this.indices = indices;
  }

  public RestoreSnapshotApiConfiguration rawSettings(Object rawSettings) {
    this.rawSettings = rawSettings;
    return this;
  }

   /**
   * This JSON object (merged with the &#x27;indices&#x27; field (if present) is passed untouched into the restore command - see the Elasticsearch &#x27;_snapshot&#x27; documentation for more details on supported formats
   * @return rawSettings
  **/
  @Schema(description = "This JSON object (merged with the 'indices' field (if present) is passed untouched into the restore command - see the Elasticsearch '_snapshot' documentation for more details on supported formats")
  public Object getRawSettings() {
    return rawSettings;
  }

  public void setRawSettings(Object rawSettings) {
    this.rawSettings = rawSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestoreSnapshotApiConfiguration restoreSnapshotApiConfiguration = (RestoreSnapshotApiConfiguration) o;
    return Objects.equals(this.indices, restoreSnapshotApiConfiguration.indices) &&
        Objects.equals(this.rawSettings, restoreSnapshotApiConfiguration.rawSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indices, rawSettings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestoreSnapshotApiConfiguration {\n");
    
    sb.append("    indices: ").append(toIndentedString(indices)).append("\n");
    sb.append("    rawSettings: ").append(toIndentedString(rawSettings)).append("\n");
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