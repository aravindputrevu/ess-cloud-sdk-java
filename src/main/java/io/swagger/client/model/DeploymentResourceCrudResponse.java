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
 * A response returned from the Deployment Resource endpoints
 */
@Schema(description = "A response returned from the Deployment Resource endpoints")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class DeploymentResourceCrudResponse {
  @SerializedName("id")
  private String id = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("ref_id")
  private String refId = null;

  public DeploymentResourceCrudResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the deployment
   * @return id
  **/
  @Schema(required = true, description = "The id of the deployment")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DeploymentResourceCrudResponse kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * The kind of the stateless resource
   * @return kind
  **/
  @Schema(required = true, description = "The kind of the stateless resource")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public DeploymentResourceCrudResponse refId(String refId) {
    this.refId = refId;
    return this;
  }

   /**
   * The reference id of the resource
   * @return refId
  **/
  @Schema(required = true, description = "The reference id of the resource")
  public String getRefId() {
    return refId;
  }

  public void setRefId(String refId) {
    this.refId = refId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentResourceCrudResponse deploymentResourceCrudResponse = (DeploymentResourceCrudResponse) o;
    return Objects.equals(this.id, deploymentResourceCrudResponse.id) &&
        Objects.equals(this.kind, deploymentResourceCrudResponse.kind) &&
        Objects.equals(this.refId, deploymentResourceCrudResponse.refId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, kind, refId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentResourceCrudResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    refId: ").append(toIndentedString(refId)).append("\n");
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
