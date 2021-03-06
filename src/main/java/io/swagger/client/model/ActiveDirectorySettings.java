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
import io.swagger.client.model.ActiveDirectoryGroupSearch;
import io.swagger.client.model.ActiveDirectorySecurityRealmLoadBalance;
import io.swagger.client.model.ActiveDirectorySecurityRealmRoleMappingRules;
import io.swagger.client.model.ActiveDirectoryUserSearch;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Elasticsearch Security Active Directory realm configuration
 */
@Schema(description = "Elasticsearch Security Active Directory realm configuration")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ActiveDirectorySettings {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("urls")
  private List<String> urls = new ArrayList<String>();

  @SerializedName("domain_name")
  private String domainName = null;

  @SerializedName("bind_anonymously")
  private Boolean bindAnonymously = null;

  @SerializedName("group_search")
  private ActiveDirectoryGroupSearch groupSearch = null;

  @SerializedName("user_search")
  private ActiveDirectoryUserSearch userSearch = null;

  @SerializedName("bind_dn")
  private String bindDn = null;

  @SerializedName("bind_password")
  private String bindPassword = null;

  @SerializedName("load_balance")
  private ActiveDirectorySecurityRealmLoadBalance loadBalance = null;

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
  private ActiveDirectorySecurityRealmRoleMappingRules roleMappings = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("order")
  private Integer order = null;

  @SerializedName("override_yaml")
  private String overrideYaml = null;

  public ActiveDirectorySettings id(String id) {
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

  public ActiveDirectorySettings name(String name) {
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

  public ActiveDirectorySettings urls(List<String> urls) {
    this.urls = urls;
    return this;
  }

  public ActiveDirectorySettings addUrlsItem(String urlsItem) {
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * The Active Directory URLs used to authenticate against, in the format ldap[s]://server:port. Note that ldap and ldaps protocols cannot be mixed together.
   * @return urls
  **/
  @Schema(required = true, description = "The Active Directory URLs used to authenticate against, in the format ldap[s]://server:port. Note that ldap and ldaps protocols cannot be mixed together.")
  public List<String> getUrls() {
    return urls;
  }

  public void setUrls(List<String> urls) {
    this.urls = urls;
  }

  public ActiveDirectorySettings domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

   /**
   * Specifies the domain name of the Active Directory (the forest root domain name).
   * @return domainName
  **/
  @Schema(required = true, description = "Specifies the domain name of the Active Directory (the forest root domain name).")
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  public ActiveDirectorySettings bindAnonymously(Boolean bindAnonymously) {
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

  public ActiveDirectorySettings groupSearch(ActiveDirectoryGroupSearch groupSearch) {
    this.groupSearch = groupSearch;
    return this;
  }

   /**
   * Get groupSearch
   * @return groupSearch
  **/
  @Schema(description = "")
  public ActiveDirectoryGroupSearch getGroupSearch() {
    return groupSearch;
  }

  public void setGroupSearch(ActiveDirectoryGroupSearch groupSearch) {
    this.groupSearch = groupSearch;
  }

  public ActiveDirectorySettings userSearch(ActiveDirectoryUserSearch userSearch) {
    this.userSearch = userSearch;
    return this;
  }

   /**
   * Get userSearch
   * @return userSearch
  **/
  @Schema(description = "")
  public ActiveDirectoryUserSearch getUserSearch() {
    return userSearch;
  }

  public void setUserSearch(ActiveDirectoryUserSearch userSearch) {
    this.userSearch = userSearch;
  }

  public ActiveDirectorySettings bindDn(String bindDn) {
    this.bindDn = bindDn;
    return this;
  }

   /**
   * The distinguished name of the user that is used to bind to the Active Directory and perform searches.
   * @return bindDn
  **/
  @Schema(description = "The distinguished name of the user that is used to bind to the Active Directory and perform searches.")
  public String getBindDn() {
    return bindDn;
  }

  public void setBindDn(String bindDn) {
    this.bindDn = bindDn;
  }

  public ActiveDirectorySettings bindPassword(String bindPassword) {
    this.bindPassword = bindPassword;
    return this;
  }

   /**
   * The user password that is used to bind to the Active Directory server.
   * @return bindPassword
  **/
  @Schema(description = "The user password that is used to bind to the Active Directory server.")
  public String getBindPassword() {
    return bindPassword;
  }

  public void setBindPassword(String bindPassword) {
    this.bindPassword = bindPassword;
  }

  public ActiveDirectorySettings loadBalance(ActiveDirectorySecurityRealmLoadBalance loadBalance) {
    this.loadBalance = loadBalance;
    return this;
  }

   /**
   * Get loadBalance
   * @return loadBalance
  **/
  @Schema(description = "")
  public ActiveDirectorySecurityRealmLoadBalance getLoadBalance() {
    return loadBalance;
  }

  public void setLoadBalance(ActiveDirectorySecurityRealmLoadBalance loadBalance) {
    this.loadBalance = loadBalance;
  }

  public ActiveDirectorySettings certificateUrl(String certificateUrl) {
    this.certificateUrl = certificateUrl;
    return this;
  }

   /**
   * The SSL trusted CA certificate bundle URL. The bundle should be a zip file containing a single keystore file &#x27;keystore.ks&#x27; in the directory &#x27;/active_directory/:id/truststore&#x27;, where :id is the value of the [id] field.
   * @return certificateUrl
  **/
  @Schema(description = "The SSL trusted CA certificate bundle URL. The bundle should be a zip file containing a single keystore file 'keystore.ks' in the directory '/active_directory/:id/truststore', where :id is the value of the [id] field.")
  public String getCertificateUrl() {
    return certificateUrl;
  }

  public void setCertificateUrl(String certificateUrl) {
    this.certificateUrl = certificateUrl;
  }

  public ActiveDirectorySettings certificateUrlTruststorePassword(String certificateUrlTruststorePassword) {
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

  public ActiveDirectorySettings certificateUrlTruststoreType(CertificateUrlTruststoreTypeEnum certificateUrlTruststoreType) {
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

  public ActiveDirectorySettings roleMappings(ActiveDirectorySecurityRealmRoleMappingRules roleMappings) {
    this.roleMappings = roleMappings;
    return this;
  }

   /**
   * Get roleMappings
   * @return roleMappings
  **/
  @Schema(description = "")
  public ActiveDirectorySecurityRealmRoleMappingRules getRoleMappings() {
    return roleMappings;
  }

  public void setRoleMappings(ActiveDirectorySecurityRealmRoleMappingRules roleMappings) {
    this.roleMappings = roleMappings;
  }

  public ActiveDirectorySettings enabled(Boolean enabled) {
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

  public ActiveDirectorySettings order(Integer order) {
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

  public ActiveDirectorySettings overrideYaml(String overrideYaml) {
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
    ActiveDirectorySettings activeDirectorySettings = (ActiveDirectorySettings) o;
    return Objects.equals(this.id, activeDirectorySettings.id) &&
        Objects.equals(this.name, activeDirectorySettings.name) &&
        Objects.equals(this.urls, activeDirectorySettings.urls) &&
        Objects.equals(this.domainName, activeDirectorySettings.domainName) &&
        Objects.equals(this.bindAnonymously, activeDirectorySettings.bindAnonymously) &&
        Objects.equals(this.groupSearch, activeDirectorySettings.groupSearch) &&
        Objects.equals(this.userSearch, activeDirectorySettings.userSearch) &&
        Objects.equals(this.bindDn, activeDirectorySettings.bindDn) &&
        Objects.equals(this.bindPassword, activeDirectorySettings.bindPassword) &&
        Objects.equals(this.loadBalance, activeDirectorySettings.loadBalance) &&
        Objects.equals(this.certificateUrl, activeDirectorySettings.certificateUrl) &&
        Objects.equals(this.certificateUrlTruststorePassword, activeDirectorySettings.certificateUrlTruststorePassword) &&
        Objects.equals(this.certificateUrlTruststoreType, activeDirectorySettings.certificateUrlTruststoreType) &&
        Objects.equals(this.roleMappings, activeDirectorySettings.roleMappings) &&
        Objects.equals(this.enabled, activeDirectorySettings.enabled) &&
        Objects.equals(this.order, activeDirectorySettings.order) &&
        Objects.equals(this.overrideYaml, activeDirectorySettings.overrideYaml);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, urls, domainName, bindAnonymously, groupSearch, userSearch, bindDn, bindPassword, loadBalance, certificateUrl, certificateUrlTruststorePassword, certificateUrlTruststoreType, roleMappings, enabled, order, overrideYaml);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActiveDirectorySettings {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    bindAnonymously: ").append(toIndentedString(bindAnonymously)).append("\n");
    sb.append("    groupSearch: ").append(toIndentedString(groupSearch)).append("\n");
    sb.append("    userSearch: ").append(toIndentedString(userSearch)).append("\n");
    sb.append("    bindDn: ").append(toIndentedString(bindDn)).append("\n");
    sb.append("    bindPassword: ").append(toIndentedString(bindPassword)).append("\n");
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
