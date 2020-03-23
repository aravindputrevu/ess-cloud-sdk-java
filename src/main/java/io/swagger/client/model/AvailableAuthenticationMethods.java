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
 * Specifies the authentication methods that are enabled on the Elasticsearch cluster. NOTE: When all fields are &#x60;false&#x60;, only the Platform admin and Platform viewer are available.
 */
@Schema(description = "Specifies the authentication methods that are enabled on the Elasticsearch cluster. NOTE: When all fields are `false`, only the Platform admin and Platform viewer are available.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class AvailableAuthenticationMethods {
  @SerializedName("password")
  private Boolean password = null;

  @SerializedName("saml")
  private Boolean saml = null;

  public AvailableAuthenticationMethods password(Boolean password) {
    this.password = password;
    return this;
  }

   /**
   * Indicates that username and password authentication is available.
   * @return password
  **/
  @Schema(required = true, description = "Indicates that username and password authentication is available.")
  public Boolean isPassword() {
    return password;
  }

  public void setPassword(Boolean password) {
    this.password = password;
  }

  public AvailableAuthenticationMethods saml(Boolean saml) {
    this.saml = saml;
    return this;
  }

   /**
   * Indicates that SAML single sign-on authentication is available.
   * @return saml
  **/
  @Schema(required = true, description = "Indicates that SAML single sign-on authentication is available.")
  public Boolean isSaml() {
    return saml;
  }

  public void setSaml(Boolean saml) {
    this.saml = saml;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableAuthenticationMethods availableAuthenticationMethods = (AvailableAuthenticationMethods) o;
    return Objects.equals(this.password, availableAuthenticationMethods.password) &&
        Objects.equals(this.saml, availableAuthenticationMethods.saml);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, saml);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableAuthenticationMethods {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    saml: ").append(toIndentedString(saml)).append("\n");
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