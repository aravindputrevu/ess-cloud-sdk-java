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
 * The overview for the Elasticsearch security realm.
 */
@Schema(description = "The overview for the Elasticsearch security realm.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class SecurityRealmInfo {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  /**
   * The type of the security realm
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NATIVE("native"),
    LDAP("ldap"),
    SAML("saml"),
    ACTIVE_DIRECTORY("active_directory");

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

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("order")
  private Integer order = null;

  @SerializedName("urls")
  private List<String> urls = new ArrayList<String>();

  public SecurityRealmInfo id(String id) {
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

  public SecurityRealmInfo name(String name) {
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

  public SecurityRealmInfo type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the security realm
   * @return type
  **/
  @Schema(required = true, description = "The type of the security realm")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public SecurityRealmInfo enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * True if the security realm is enabled
   * @return enabled
  **/
  @Schema(description = "True if the security realm is enabled")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public SecurityRealmInfo order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * The order the security realm should be evaluated
   * @return order
  **/
  @Schema(description = "The order the security realm should be evaluated")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public SecurityRealmInfo urls(List<String> urls) {
    this.urls = urls;
    return this;
  }

  public SecurityRealmInfo addUrlsItem(String urlsItem) {
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * The URLs associated with the security realm
   * @return urls
  **/
  @Schema(required = true, description = "The URLs associated with the security realm")
  public List<String> getUrls() {
    return urls;
  }

  public void setUrls(List<String> urls) {
    this.urls = urls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityRealmInfo securityRealmInfo = (SecurityRealmInfo) o;
    return Objects.equals(this.id, securityRealmInfo.id) &&
        Objects.equals(this.name, securityRealmInfo.name) &&
        Objects.equals(this.type, securityRealmInfo.type) &&
        Objects.equals(this.enabled, securityRealmInfo.enabled) &&
        Objects.equals(this.order, securityRealmInfo.order) &&
        Objects.equals(this.urls, securityRealmInfo.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, enabled, order, urls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityRealmInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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
