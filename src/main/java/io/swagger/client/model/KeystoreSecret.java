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
 * The value that you configure for the Elasticsearch keystore secret.
 */
@Schema(description = "The value that you configure for the Elasticsearch keystore secret.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class KeystoreSecret {
  @SerializedName("value")
  private Object value = null;

  @SerializedName("as_file")
  private Boolean asFile = null;

  public KeystoreSecret value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore. NOTE: When the keystore secret is unspecified, it is removed.
   * @return value
  **/
  @Schema(description = "Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore. NOTE: When the keystore secret is unspecified, it is removed.")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public KeystoreSecret asFile(Boolean asFile) {
    this.asFile = asFile;
    return this;
  }

   /**
   * Stores the keystore secret as a file. The default is false, which stores the keystore secret as string when value is a plain string, or true when value is an object.
   * @return asFile
  **/
  @Schema(description = "Stores the keystore secret as a file. The default is false, which stores the keystore secret as string when value is a plain string, or true when value is an object.")
  public Boolean isAsFile() {
    return asFile;
  }

  public void setAsFile(Boolean asFile) {
    this.asFile = asFile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeystoreSecret keystoreSecret = (KeystoreSecret) o;
    return Objects.equals(this.value, keystoreSecret.value) &&
        Objects.equals(this.asFile, keystoreSecret.asFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, asFile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeystoreSecret {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    asFile: ").append(toIndentedString(asFile)).append("\n");
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
