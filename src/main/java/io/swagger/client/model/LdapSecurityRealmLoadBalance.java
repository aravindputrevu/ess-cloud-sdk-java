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
 * The load balancing configuration for the Elasticsearch security LDAP realm.
 */
@Schema(description = "The load balancing configuration for the Elasticsearch security LDAP realm.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class LdapSecurityRealmLoadBalance {
  /**
   * The behavior to use when there are multiple LDAP URLs defined
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    FAILOVER("failover"),
    DNS_FAILOVER("dns_failover"),
    ROUND_ROBIN("round_robin"),
    DNS_ROUND_ROBIN("dns_round_robin");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("cache_ttl")
  private String cacheTtl = null;

  public LdapSecurityRealmLoadBalance type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The behavior to use when there are multiple LDAP URLs defined
   * @return type
  **/
  @Schema(required = true, description = "The behavior to use when there are multiple LDAP URLs defined")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public LdapSecurityRealmLoadBalance cacheTtl(String cacheTtl) {
    this.cacheTtl = cacheTtl;
    return this;
  }

   /**
   * When using dns_failover or dns_round_robin as the load balancing type, this setting controls the amount of time to cache DNS lookups. Defaults to 1h.
   * @return cacheTtl
  **/
  @Schema(description = "When using dns_failover or dns_round_robin as the load balancing type, this setting controls the amount of time to cache DNS lookups. Defaults to 1h.")
  public String getCacheTtl() {
    return cacheTtl;
  }

  public void setCacheTtl(String cacheTtl) {
    this.cacheTtl = cacheTtl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LdapSecurityRealmLoadBalance ldapSecurityRealmLoadBalance = (LdapSecurityRealmLoadBalance) o;
    return Objects.equals(this.type, ldapSecurityRealmLoadBalance.type) &&
        Objects.equals(this.cacheTtl, ldapSecurityRealmLoadBalance.cacheTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, cacheTtl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LdapSecurityRealmLoadBalance {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    cacheTtl: ").append(toIndentedString(cacheTtl)).append("\n");
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
