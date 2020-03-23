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
/**
 * Hyperlink
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class Hyperlink {
  @SerializedName("need_elevated_permissions")
  private Boolean needElevatedPermissions = null;

  public Hyperlink needElevatedPermissions(Boolean needElevatedPermissions) {
    this.needElevatedPermissions = needElevatedPermissions;
    return this;
  }

   /**
   * Whether the operation requires elevated permissions (when the field is present, elevated permissions are required).
   * @return needElevatedPermissions
  **/
  @Schema(description = "Whether the operation requires elevated permissions (when the field is present, elevated permissions are required).")
  public Boolean isNeedElevatedPermissions() {
    return needElevatedPermissions;
  }

  public void setNeedElevatedPermissions(Boolean needElevatedPermissions) {
    this.needElevatedPermissions = needElevatedPermissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hyperlink hyperlink = (Hyperlink) o;
    return Objects.equals(this.needElevatedPermissions, hyperlink.needElevatedPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(needElevatedPermissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hyperlink {\n");
    
    sb.append("    needElevatedPermissions: ").append(toIndentedString(needElevatedPermissions)).append("\n");
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
