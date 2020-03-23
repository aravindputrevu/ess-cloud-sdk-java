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
import org.threeten.bp.OffsetDateTime;
/**
 * A container for information about the source of a change.
 */
@Schema(description = "A container for information about the source of a change.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ChangeSourceInfo {
  @SerializedName("facilitator")
  private String facilitator = null;

  @SerializedName("action")
  private String action = null;

  @SerializedName("date")
  private OffsetDateTime date = null;

  @SerializedName("user_id")
  private String userId = null;

  @SerializedName("admin_id")
  private String adminId = null;

  @SerializedName("remote_addresses")
  private List<String> remoteAddresses = null;

  public ChangeSourceInfo facilitator(String facilitator) {
    this.facilitator = facilitator;
    return this;
  }

   /**
   * The service where the change originated from
   * @return facilitator
  **/
  @Schema(required = true, description = "The service where the change originated from")
  public String getFacilitator() {
    return facilitator;
  }

  public void setFacilitator(String facilitator) {
    this.facilitator = facilitator;
  }

  public ChangeSourceInfo action(String action) {
    this.action = action;
    return this;
  }

   /**
   * The type of plan change that was initiated
   * @return action
  **/
  @Schema(required = true, description = "The type of plan change that was initiated")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public ChangeSourceInfo date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * The time the change was initiated
   * @return date
  **/
  @Schema(required = true, description = "The time the change was initiated")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public ChangeSourceInfo userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The user that requested the change
   * @return userId
  **/
  @Schema(description = "The user that requested the change")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public ChangeSourceInfo adminId(String adminId) {
    this.adminId = adminId;
    return this;
  }

   /**
   * The admin user that requested the change
   * @return adminId
  **/
  @Schema(description = "The admin user that requested the change")
  public String getAdminId() {
    return adminId;
  }

  public void setAdminId(String adminId) {
    this.adminId = adminId;
  }

  public ChangeSourceInfo remoteAddresses(List<String> remoteAddresses) {
    this.remoteAddresses = remoteAddresses;
    return this;
  }

  public ChangeSourceInfo addRemoteAddressesItem(String remoteAddressesItem) {
    if (this.remoteAddresses == null) {
      this.remoteAddresses = new ArrayList<String>();
    }
    this.remoteAddresses.add(remoteAddressesItem);
    return this;
  }

   /**
   * The host addresses of the user that originated the change
   * @return remoteAddresses
  **/
  @Schema(description = "The host addresses of the user that originated the change")
  public List<String> getRemoteAddresses() {
    return remoteAddresses;
  }

  public void setRemoteAddresses(List<String> remoteAddresses) {
    this.remoteAddresses = remoteAddresses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeSourceInfo changeSourceInfo = (ChangeSourceInfo) o;
    return Objects.equals(this.facilitator, changeSourceInfo.facilitator) &&
        Objects.equals(this.action, changeSourceInfo.action) &&
        Objects.equals(this.date, changeSourceInfo.date) &&
        Objects.equals(this.userId, changeSourceInfo.userId) &&
        Objects.equals(this.adminId, changeSourceInfo.adminId) &&
        Objects.equals(this.remoteAddresses, changeSourceInfo.remoteAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facilitator, action, date, userId, adminId, remoteAddresses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeSourceInfo {\n");
    
    sb.append("    facilitator: ").append(toIndentedString(facilitator)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    adminId: ").append(toIndentedString(adminId)).append("\n");
    sb.append("    remoteAddresses: ").append(toIndentedString(remoteAddresses)).append("\n");
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
