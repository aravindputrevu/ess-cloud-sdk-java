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
import io.swagger.client.model.LdapGroupSearch;
import io.swagger.client.model.LdapSecurityRealmLoadBalance;
import io.swagger.client.model.LdapSecurityRealmRoleMappingRules;
import io.swagger.client.model.LdapUserSearch;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * The configuration for the Elasticsearch security LDAP realm.
 */
@Schema(description = "The configuration for the Elasticsearch security LDAP realm.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class LdapSettings {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("urls")
  private List<String> urls = new ArrayList<String>();

  @SerializedName("bind_anonymously")
  private Boolean bindAnonymously = null;

  /**
   * The type of user binding to apply
   */
  @JsonAdapter(BindTypeEnum.Adapter.class)
  public enum BindTypeEnum {
    SEARCH("user_search"),
    TEMPLATES("user_templates");

    private String value;

    BindTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static BindTypeEnum fromValue(String text) {
      for (BindTypeEnum b : BindTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<BindTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BindTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BindTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BindTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("bind_type")
  private BindTypeEnum bindType = null;

  @SerializedName("group_search")
  private LdapGroupSearch groupSearch = null;

  @SerializedName("user_search")
  private LdapUserSearch userSearch = null;

  @SerializedName("user_dn_templates")
  private List<String> userDnTemplates = null;

  @SerializedName("bind_dn")
  private String bindDn = null;

  @SerializedName("bind_password")
  private String bindPassword = null;

  @SerializedName("user_group_attribute")
  private String userGroupAttribute = null;

  @SerializedName("load_balance")
  private LdapSecurityRealmLoadBalance loadBalance = null;

  @SerializedName("certificate_url")
  private String certificateUrl = null;

  @SerializedName("certificate_url_truststore_password")
  private String certificateUrlTruststorePassword = null;

  /**
   * The format of the keystore file. Should be jks to use the Java Keystore format or PKCS12 to use PKCS#12 files.  The default is jks.
   */
  @JsonAdapter(CertificateUrlTruststoreTypeEnum.Adapter.class)
  public enum CertificateUrlTruststoreTypeEnum {
    JKS("jks"),
    PKCS12("PKCS12");

    private String value;

    CertificateUrlTruststoreTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CertificateUrlTruststoreTypeEnum fromValue(String text) {
      for (CertificateUrlTruststoreTypeEnum b : CertificateUrlTruststoreTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CertificateUrlTruststoreTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CertificateUrlTruststoreTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CertificateUrlTruststoreTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CertificateUrlTruststoreTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("certificate_url_truststore_type")
  private CertificateUrlTruststoreTypeEnum certificateUrlTruststoreType = null;

  @SerializedName("role_mappings")
  private LdapSecurityRealmRoleMappingRules roleMappings = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("order")
  private Integer order = null;

  @SerializedName("override_yaml")
  private String overrideYaml = null;

  public LdapSettings id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier for the security realm
   * @return id
  **/
  @Schema(required = true, description = "The identifier for the security realm")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LdapSettings name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The friendly name of the security realm
   * @return name
  **/
  @Schema(required = true, description = "The friendly name of the security realm")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LdapSettings urls(List<String> urls) {
    this.urls = urls;
    return this;
  }

  public LdapSettings addUrlsItem(String urlsItem) {
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * The LDAP URLs used to authenticate against, in the format ldap[s]://server:port. Note that ldap and ldaps protocols cannot be mixed together.
   * @return urls
  **/
  @Schema(required = true, description = "The LDAP URLs used to authenticate against, in the format ldap[s]://server:port. Note that ldap and ldaps protocols cannot be mixed together.")
  public List<String> getUrls() {
    return urls;
  }

  public void setUrls(List<String> urls) {
    this.urls = urls;
  }

  public LdapSettings bindAnonymously(Boolean bindAnonymously) {
    this.bindAnonymously = bindAnonymously;
    return this;
  }

   /**
   * When true, bindDb credentials are ignored
   * @return bindAnonymously
  **/
  @Schema(required = true, description = "When true, bindDb credentials are ignored")
  public Boolean isBindAnonymously() {
    return bindAnonymously;
  }

  public void setBindAnonymously(Boolean bindAnonymously) {
    this.bindAnonymously = bindAnonymously;
  }

  public LdapSettings bindType(BindTypeEnum bindType) {
    this.bindType = bindType;
    return this;
  }

   /**
   * The type of user binding to apply
   * @return bindType
  **/
  @Schema(required = true, description = "The type of user binding to apply")
  public BindTypeEnum getBindType() {
    return bindType;
  }

  public void setBindType(BindTypeEnum bindType) {
    this.bindType = bindType;
  }

  public LdapSettings groupSearch(LdapGroupSearch groupSearch) {
    this.groupSearch = groupSearch;
    return this;
  }

   /**
   * Get groupSearch
   * @return groupSearch
  **/
  @Schema(description = "")
  public LdapGroupSearch getGroupSearch() {
    return groupSearch;
  }

  public void setGroupSearch(LdapGroupSearch groupSearch) {
    this.groupSearch = groupSearch;
  }

  public LdapSettings userSearch(LdapUserSearch userSearch) {
    this.userSearch = userSearch;
    return this;
  }

   /**
   * Get userSearch
   * @return userSearch
  **/
  @Schema(description = "")
  public LdapUserSearch getUserSearch() {
    return userSearch;
  }

  public void setUserSearch(LdapUserSearch userSearch) {
    this.userSearch = userSearch;
  }

  public LdapSettings userDnTemplates(List<String> userDnTemplates) {
    this.userDnTemplates = userDnTemplates;
    return this;
  }

  public LdapSettings addUserDnTemplatesItem(String userDnTemplatesItem) {
    if (this.userDnTemplates == null) {
      this.userDnTemplates = new ArrayList<String>();
    }
    this.userDnTemplates.add(userDnTemplatesItem);
    return this;
  }

   /**
   * The distinguished name template that replaces the user name with the string {0}. Only used when bind_type is set to &#x27;user_templates&#x27;.
   * @return userDnTemplates
  **/
  @Schema(description = "The distinguished name template that replaces the user name with the string {0}. Only used when bind_type is set to 'user_templates'.")
  public List<String> getUserDnTemplates() {
    return userDnTemplates;
  }

  public void setUserDnTemplates(List<String> userDnTemplates) {
    this.userDnTemplates = userDnTemplates;
  }

  public LdapSettings bindDn(String bindDn) {
    this.bindDn = bindDn;
    return this;
  }

   /**
   * The distinguished name of the user that is used to bind to the LDAP and perform searches. Only used when bind_type is set to &#x27;user_search&#x27;.
   * @return bindDn
  **/
  @Schema(description = "The distinguished name of the user that is used to bind to the LDAP and perform searches. Only used when bind_type is set to 'user_search'.")
  public String getBindDn() {
    return bindDn;
  }

  public void setBindDn(String bindDn) {
    this.bindDn = bindDn;
  }

  public LdapSettings bindPassword(String bindPassword) {
    this.bindPassword = bindPassword;
    return this;
  }

   /**
   * The user password that is used to bind to the LDAP server. Only used when bind_type is set to &#x27;user_search&#x27;.
   * @return bindPassword
  **/
  @Schema(description = "The user password that is used to bind to the LDAP server. Only used when bind_type is set to 'user_search'.")
  public String getBindPassword() {
    return bindPassword;
  }

  public void setBindPassword(String bindPassword) {
    this.bindPassword = bindPassword;
  }

  public LdapSettings userGroupAttribute(String userGroupAttribute) {
    this.userGroupAttribute = userGroupAttribute;
    return this;
  }

   /**
   * Specifies the attribute to examine on the user for group membership. If any &#x27;group_search&#x27; settings are specified, this setting is ignored. Defaults to &#x27;memberOf&#x27;.
   * @return userGroupAttribute
  **/
  @Schema(description = "Specifies the attribute to examine on the user for group membership. If any 'group_search' settings are specified, this setting is ignored. Defaults to 'memberOf'.")
  public String getUserGroupAttribute() {
    return userGroupAttribute;
  }

  public void setUserGroupAttribute(String userGroupAttribute) {
    this.userGroupAttribute = userGroupAttribute;
  }

  public LdapSettings loadBalance(LdapSecurityRealmLoadBalance loadBalance) {
    this.loadBalance = loadBalance;
    return this;
  }

   /**
   * Get loadBalance
   * @return loadBalance
  **/
  @Schema(description = "")
  public LdapSecurityRealmLoadBalance getLoadBalance() {
    return loadBalance;
  }

  public void setLoadBalance(LdapSecurityRealmLoadBalance loadBalance) {
    this.loadBalance = loadBalance;
  }

  public LdapSettings certificateUrl(String certificateUrl) {
    this.certificateUrl = certificateUrl;
    return this;
  }

   /**
   * The SSL trusted CA certificate bundle URL. The bundle should be a zip file containing a single keystore file &#x27;keystore.ks&#x27; in the directory &#x27;/ldap/:id/truststore&#x27;, where :id is the value of the [id] field.
   * @return certificateUrl
  **/
  @Schema(description = "The SSL trusted CA certificate bundle URL. The bundle should be a zip file containing a single keystore file 'keystore.ks' in the directory '/ldap/:id/truststore', where :id is the value of the [id] field.")
  public String getCertificateUrl() {
    return certificateUrl;
  }

  public void setCertificateUrl(String certificateUrl) {
    this.certificateUrl = certificateUrl;
  }

  public LdapSettings certificateUrlTruststorePassword(String certificateUrlTruststorePassword) {
    this.certificateUrlTruststorePassword = certificateUrlTruststorePassword;
    return this;
  }

   /**
   * The password to the certificate bundle URL truststore
   * @return certificateUrlTruststorePassword
  **/
  @Schema(description = "The password to the certificate bundle URL truststore")
  public String getCertificateUrlTruststorePassword() {
    return certificateUrlTruststorePassword;
  }

  public void setCertificateUrlTruststorePassword(String certificateUrlTruststorePassword) {
    this.certificateUrlTruststorePassword = certificateUrlTruststorePassword;
  }

  public LdapSettings certificateUrlTruststoreType(CertificateUrlTruststoreTypeEnum certificateUrlTruststoreType) {
    this.certificateUrlTruststoreType = certificateUrlTruststoreType;
    return this;
  }

   /**
   * The format of the keystore file. Should be jks to use the Java Keystore format or PKCS12 to use PKCS#12 files.  The default is jks.
   * @return certificateUrlTruststoreType
  **/
  @Schema(description = "The format of the keystore file. Should be jks to use the Java Keystore format or PKCS12 to use PKCS#12 files.  The default is jks.")
  public CertificateUrlTruststoreTypeEnum getCertificateUrlTruststoreType() {
    return certificateUrlTruststoreType;
  }

  public void setCertificateUrlTruststoreType(CertificateUrlTruststoreTypeEnum certificateUrlTruststoreType) {
    this.certificateUrlTruststoreType = certificateUrlTruststoreType;
  }

  public LdapSettings roleMappings(LdapSecurityRealmRoleMappingRules roleMappings) {
    this.roleMappings = roleMappings;
    return this;
  }

   /**
   * Get roleMappings
   * @return roleMappings
  **/
  @Schema(description = "")
  public LdapSecurityRealmRoleMappingRules getRoleMappings() {
    return roleMappings;
  }

  public void setRoleMappings(LdapSecurityRealmRoleMappingRules roleMappings) {
    this.roleMappings = roleMappings;
  }

  public LdapSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * When true, enables the security realm
   * @return enabled
  **/
  @Schema(description = "When true, enables the security realm")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public LdapSettings order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * The order that the security realm is evaluated
   * @return order
  **/
  @Schema(description = "The order that the security realm is evaluated")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public LdapSettings overrideYaml(String overrideYaml) {
    this.overrideYaml = overrideYaml;
    return this;
  }

   /**
   * Advanced configuration options in YAML format. Any settings defined here will override any configuration set via the API.
   * @return overrideYaml
  **/
  @Schema(description = "Advanced configuration options in YAML format. Any settings defined here will override any configuration set via the API.")
  public String getOverrideYaml() {
    return overrideYaml;
  }

  public void setOverrideYaml(String overrideYaml) {
    this.overrideYaml = overrideYaml;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LdapSettings ldapSettings = (LdapSettings) o;
    return Objects.equals(this.id, ldapSettings.id) &&
        Objects.equals(this.name, ldapSettings.name) &&
        Objects.equals(this.urls, ldapSettings.urls) &&
        Objects.equals(this.bindAnonymously, ldapSettings.bindAnonymously) &&
        Objects.equals(this.bindType, ldapSettings.bindType) &&
        Objects.equals(this.groupSearch, ldapSettings.groupSearch) &&
        Objects.equals(this.userSearch, ldapSettings.userSearch) &&
        Objects.equals(this.userDnTemplates, ldapSettings.userDnTemplates) &&
        Objects.equals(this.bindDn, ldapSettings.bindDn) &&
        Objects.equals(this.bindPassword, ldapSettings.bindPassword) &&
        Objects.equals(this.userGroupAttribute, ldapSettings.userGroupAttribute) &&
        Objects.equals(this.loadBalance, ldapSettings.loadBalance) &&
        Objects.equals(this.certificateUrl, ldapSettings.certificateUrl) &&
        Objects.equals(this.certificateUrlTruststorePassword, ldapSettings.certificateUrlTruststorePassword) &&
        Objects.equals(this.certificateUrlTruststoreType, ldapSettings.certificateUrlTruststoreType) &&
        Objects.equals(this.roleMappings, ldapSettings.roleMappings) &&
        Objects.equals(this.enabled, ldapSettings.enabled) &&
        Objects.equals(this.order, ldapSettings.order) &&
        Objects.equals(this.overrideYaml, ldapSettings.overrideYaml);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, urls, bindAnonymously, bindType, groupSearch, userSearch, userDnTemplates, bindDn, bindPassword, userGroupAttribute, loadBalance, certificateUrl, certificateUrlTruststorePassword, certificateUrlTruststoreType, roleMappings, enabled, order, overrideYaml);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LdapSettings {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    bindAnonymously: ").append(toIndentedString(bindAnonymously)).append("\n");
    sb.append("    bindType: ").append(toIndentedString(bindType)).append("\n");
    sb.append("    groupSearch: ").append(toIndentedString(groupSearch)).append("\n");
    sb.append("    userSearch: ").append(toIndentedString(userSearch)).append("\n");
    sb.append("    userDnTemplates: ").append(toIndentedString(userDnTemplates)).append("\n");
    sb.append("    bindDn: ").append(toIndentedString(bindDn)).append("\n");
    sb.append("    bindPassword: ").append(toIndentedString(bindPassword)).append("\n");
    sb.append("    userGroupAttribute: ").append(toIndentedString(userGroupAttribute)).append("\n");
    sb.append("    loadBalance: ").append(toIndentedString(loadBalance)).append("\n");
    sb.append("    certificateUrl: ").append(toIndentedString(certificateUrl)).append("\n");
    sb.append("    certificateUrlTruststorePassword: ").append(toIndentedString(certificateUrlTruststorePassword)).append("\n");
    sb.append("    certificateUrlTruststoreType: ").append(toIndentedString(certificateUrlTruststoreType)).append("\n");
    sb.append("    roleMappings: ").append(toIndentedString(roleMappings)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    overrideYaml: ").append(toIndentedString(overrideYaml)).append("\n");
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
