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
 * Information about a configuration that creates a Kibana instance or APM Server.
 */
@Schema(description = "Information about a configuration that creates a Kibana instance or APM Server.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ClusterInstanceConfigurationInfo {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  /**
   * The resource type of the instance configuration
   */
  @JsonAdapter(ResourceEnum.Adapter.class)
  public enum ResourceEnum {
    MEMORY("memory"),
    STORAGE("storage");

    private String value;

    ResourceEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ResourceEnum fromValue(String text) {
      for (ResourceEnum b : ResourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ResourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResourceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ResourceEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("resource")
  private ResourceEnum resource = null;

  public ClusterInstanceConfigurationInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the configuration used to create the instance
   * @return id
  **/
  @Schema(description = "The id of the configuration used to create the instance")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ClusterInstanceConfigurationInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the configuration used to create the instance
   * @return name
  **/
  @Schema(description = "The name of the configuration used to create the instance")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ClusterInstanceConfigurationInfo resource(ResourceEnum resource) {
    this.resource = resource;
    return this;
  }

   /**
   * The resource type of the instance configuration
   * @return resource
  **/
  @Schema(description = "The resource type of the instance configuration")
  public ResourceEnum getResource() {
    return resource;
  }

  public void setResource(ResourceEnum resource) {
    this.resource = resource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterInstanceConfigurationInfo clusterInstanceConfigurationInfo = (ClusterInstanceConfigurationInfo) o;
    return Objects.equals(this.id, clusterInstanceConfigurationInfo.id) &&
        Objects.equals(this.name, clusterInstanceConfigurationInfo.name) &&
        Objects.equals(this.resource, clusterInstanceConfigurationInfo.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, resource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterInstanceConfigurationInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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