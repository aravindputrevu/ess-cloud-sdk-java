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
import io.swagger.client.model.DeploymentsListingData;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Contains a list of deployments
 */
@Schema(description = "Contains a list of deployments")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class DeploymentsListResponse {
  @SerializedName("deployments")
  private List<DeploymentsListingData> deployments = new ArrayList<DeploymentsListingData>();

  public DeploymentsListResponse deployments(List<DeploymentsListingData> deployments) {
    this.deployments = deployments;
    return this;
  }

  public DeploymentsListResponse addDeploymentsItem(DeploymentsListingData deploymentsItem) {
    this.deployments.add(deploymentsItem);
    return this;
  }

   /**
   * The deployments
   * @return deployments
  **/
  @Schema(required = true, description = "The deployments")
  public List<DeploymentsListingData> getDeployments() {
    return deployments;
  }

  public void setDeployments(List<DeploymentsListingData> deployments) {
    this.deployments = deployments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentsListResponse deploymentsListResponse = (DeploymentsListResponse) o;
    return Objects.equals(this.deployments, deploymentsListResponse.deployments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentsListResponse {\n");
    
    sb.append("    deployments: ").append(toIndentedString(deployments)).append("\n");
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
