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
 * The re-authentication response body
 */
@Schema(description = "The re-authentication response body")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ReAuthenticationResponse {
  @SerializedName("security_token")
  private String securityToken = null;

  public ReAuthenticationResponse securityToken(String securityToken) {
    this.securityToken = securityToken;
    return this;
  }

   /**
   * The security token part of the Create API key request
   * @return securityToken
  **/
  @Schema(required = true, description = "The security token part of the Create API key request")
  public String getSecurityToken() {
    return securityToken;
  }

  public void setSecurityToken(String securityToken) {
    this.securityToken = securityToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReAuthenticationResponse reAuthenticationResponse = (ReAuthenticationResponse) o;
    return Objects.equals(this.securityToken, reAuthenticationResponse.securityToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReAuthenticationResponse {\n");
    
    sb.append("    securityToken: ").append(toIndentedString(securityToken)).append("\n");
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
