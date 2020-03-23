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
import io.swagger.client.model.SecurityRealmInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * A list of Elasticsearch security realms.
 */
@Schema(description = "A list of Elasticsearch security realms.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class SecurityRealmInfoList {
  @SerializedName("realms")
  private List<SecurityRealmInfo> realms = new ArrayList<SecurityRealmInfo>();

  public SecurityRealmInfoList realms(List<SecurityRealmInfo> realms) {
    this.realms = realms;
    return this;
  }

  public SecurityRealmInfoList addRealmsItem(SecurityRealmInfo realmsItem) {
    this.realms.add(realmsItem);
    return this;
  }

   /**
   * The list of security realms
   * @return realms
  **/
  @Schema(required = true, description = "The list of security realms")
  public List<SecurityRealmInfo> getRealms() {
    return realms;
  }

  public void setRealms(List<SecurityRealmInfo> realms) {
    this.realms = realms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityRealmInfoList securityRealmInfoList = (SecurityRealmInfoList) o;
    return Objects.equals(this.realms, securityRealmInfoList.realms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(realms);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityRealmInfoList {\n");
    
    sb.append("    realms: ").append(toIndentedString(realms)).append("\n");
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
