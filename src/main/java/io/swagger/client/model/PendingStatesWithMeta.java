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
import io.swagger.client.model.Metadata;
import io.swagger.client.model.PendingStates;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Persisted pending states for a role along with metadata
 */
@Schema(description = "Persisted pending states for a role along with metadata")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class PendingStatesWithMeta {
  @SerializedName("value")
  private PendingStates value = null;

  @SerializedName("meta")
  private Metadata meta = null;

  public PendingStatesWithMeta value(PendingStates value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(required = true, description = "")
  public PendingStates getValue() {
    return value;
  }

  public void setValue(PendingStates value) {
    this.value = value;
  }

  public PendingStatesWithMeta meta(Metadata meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @Schema(required = true, description = "")
  public Metadata getMeta() {
    return meta;
  }

  public void setMeta(Metadata meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PendingStatesWithMeta pendingStatesWithMeta = (PendingStatesWithMeta) o;
    return Objects.equals(this.value, pendingStatesWithMeta.value) &&
        Objects.equals(this.meta, pendingStatesWithMeta.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PendingStatesWithMeta {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
