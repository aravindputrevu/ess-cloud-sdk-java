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
import io.swagger.client.model.ActiveDirectorySecurityRealmRoleMappingRule;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Elasticsearch Security Active Directory role mapping rule set
 */
@Schema(description = "Elasticsearch Security Active Directory role mapping rule set")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ActiveDirectorySecurityRealmRoleMappingRules {
  @SerializedName("default_roles")
  private List<String> defaultRoles = new ArrayList<String>();

  @SerializedName("rules")
  private List<ActiveDirectorySecurityRealmRoleMappingRule> rules = new ArrayList<ActiveDirectorySecurityRealmRoleMappingRule>();

  public ActiveDirectorySecurityRealmRoleMappingRules defaultRoles(List<String> defaultRoles) {
    this.defaultRoles = defaultRoles;
    return this;
  }

  public ActiveDirectorySecurityRealmRoleMappingRules addDefaultRolesItem(String defaultRolesItem) {
    this.defaultRoles.add(defaultRolesItem);
    return this;
  }

   /**
   * The default roles applied to all users
   * @return defaultRoles
  **/
  @Schema(required = true, description = "The default roles applied to all users")
  public List<String> getDefaultRoles() {
    return defaultRoles;
  }

  public void setDefaultRoles(List<String> defaultRoles) {
    this.defaultRoles = defaultRoles;
  }

  public ActiveDirectorySecurityRealmRoleMappingRules rules(List<ActiveDirectorySecurityRealmRoleMappingRule> rules) {
    this.rules = rules;
    return this;
  }

  public ActiveDirectorySecurityRealmRoleMappingRules addRulesItem(ActiveDirectorySecurityRealmRoleMappingRule rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * The role mapping rules to evaluate
   * @return rules
  **/
  @Schema(required = true, description = "The role mapping rules to evaluate")
  public List<ActiveDirectorySecurityRealmRoleMappingRule> getRules() {
    return rules;
  }

  public void setRules(List<ActiveDirectorySecurityRealmRoleMappingRule> rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActiveDirectorySecurityRealmRoleMappingRules activeDirectorySecurityRealmRoleMappingRules = (ActiveDirectorySecurityRealmRoleMappingRules) o;
    return Objects.equals(this.defaultRoles, activeDirectorySecurityRealmRoleMappingRules.defaultRoles) &&
        Objects.equals(this.rules, activeDirectorySecurityRealmRoleMappingRules.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultRoles, rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActiveDirectorySecurityRealmRoleMappingRules {\n");
    
    sb.append("    defaultRoles: ").append(toIndentedString(defaultRoles)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
