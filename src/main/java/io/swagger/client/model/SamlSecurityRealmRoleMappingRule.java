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
 * The mapping rule for the Elasticsearch security SAML role.
 */
@Schema(description = "The mapping rule for the Elasticsearch security SAML role.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class SamlSecurityRealmRoleMappingRule {
  /**
   * The type of role mapping rule
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    USERNAME("username"),
    GROUPS("groups"),
    DN("dn");

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

  @SerializedName("roles")
  private List<String> roles = new ArrayList<String>();

  @SerializedName("value")
  private String value = null;

  public SamlSecurityRealmRoleMappingRule type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of role mapping rule
   * @return type
  **/
  @Schema(required = true, description = "The type of role mapping rule")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public SamlSecurityRealmRoleMappingRule roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public SamlSecurityRealmRoleMappingRule addRolesItem(String rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * The roles that are applied when the mapping rule is successfully evaluated
   * @return roles
  **/
  @Schema(required = true, description = "The roles that are applied when the mapping rule is successfully evaluated")
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public SamlSecurityRealmRoleMappingRule value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value to match when evaluating this rule
   * @return value
  **/
  @Schema(required = true, description = "The value to match when evaluating this rule")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SamlSecurityRealmRoleMappingRule samlSecurityRealmRoleMappingRule = (SamlSecurityRealmRoleMappingRule) o;
    return Objects.equals(this.type, samlSecurityRealmRoleMappingRule.type) &&
        Objects.equals(this.roles, samlSecurityRealmRoleMappingRule.roles) &&
        Objects.equals(this.value, samlSecurityRealmRoleMappingRule.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, roles, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlSecurityRealmRoleMappingRule {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
