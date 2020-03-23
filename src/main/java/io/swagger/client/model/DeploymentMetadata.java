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
import org.threeten.bp.OffsetDateTime;
/**
 * Additional information about the current deployment object.
 */
@Schema(description = "Additional information about the current deployment object.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class DeploymentMetadata {
  @SerializedName("owner_id")
  private String ownerId = null;

  @SerializedName("system_owned")
  private Boolean systemOwned = null;

  @SerializedName("hidden")
  private Boolean hidden = null;

  @SerializedName("subscription_level")
  private String subscriptionLevel = null;

  @SerializedName("last_modified")
  private OffsetDateTime lastModified = null;

  public DeploymentMetadata ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * The user id (referencing whatever user database is in use) of the deployment owner
   * @return ownerId
  **/
  @Schema(description = "The user id (referencing whatever user database is in use) of the deployment owner")
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public DeploymentMetadata systemOwned(Boolean systemOwned) {
    this.systemOwned = systemOwned;
    return this;
  }

   /**
   * Indicates if a deployment is system owned (restricts the set of operations that can be performed on it)
   * @return systemOwned
  **/
  @Schema(description = "Indicates if a deployment is system owned (restricts the set of operations that can be performed on it)")
  public Boolean isSystemOwned() {
    return systemOwned;
  }

  public void setSystemOwned(Boolean systemOwned) {
    this.systemOwned = systemOwned;
  }

   /**
   * Whether or not this deployment is hidden from the normal deployment list
   * @return hidden
  **/
  @Schema(description = "Whether or not this deployment is hidden from the normal deployment list")
  public Boolean isHidden() {
    return hidden;
  }

   /**
   * Subscription level of the cluster
   * @return subscriptionLevel
  **/
  @Schema(description = "Subscription level of the cluster")
  public String getSubscriptionLevel() {
    return subscriptionLevel;
  }

  public DeploymentMetadata lastModified(OffsetDateTime lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * The most recent time the cluster metadata was changed (ISO format in UTC)
   * @return lastModified
  **/
  @Schema(required = true, description = "The most recent time the cluster metadata was changed (ISO format in UTC)")
  public OffsetDateTime getLastModified() {
    return lastModified;
  }

  public void setLastModified(OffsetDateTime lastModified) {
    this.lastModified = lastModified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentMetadata deploymentMetadata = (DeploymentMetadata) o;
    return Objects.equals(this.ownerId, deploymentMetadata.ownerId) &&
        Objects.equals(this.systemOwned, deploymentMetadata.systemOwned) &&
        Objects.equals(this.hidden, deploymentMetadata.hidden) &&
        Objects.equals(this.subscriptionLevel, deploymentMetadata.subscriptionLevel) &&
        Objects.equals(this.lastModified, deploymentMetadata.lastModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerId, systemOwned, hidden, subscriptionLevel, lastModified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentMetadata {\n");
    
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    systemOwned: ").append(toIndentedString(systemOwned)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    subscriptionLevel: ").append(toIndentedString(subscriptionLevel)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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