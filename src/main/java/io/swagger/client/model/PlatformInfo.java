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
import io.swagger.client.model.PlatformServiceInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Information about the platform.
 */
@Schema(description = "Information about the platform.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class PlatformInfo {
  @SerializedName("version")
  private String version = null;

  @SerializedName("services")
  private List<PlatformServiceInfo> services = null;

  @SerializedName("phone_home_enabled")
  private Boolean phoneHomeEnabled = null;

  @SerializedName("eula_accepted")
  private Boolean eulaAccepted = null;

  public PlatformInfo version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Platform version
   * @return version
  **/
  @Schema(description = "Platform version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public PlatformInfo services(List<PlatformServiceInfo> services) {
    this.services = services;
    return this;
  }

  public PlatformInfo addServicesItem(PlatformServiceInfo servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<PlatformServiceInfo>();
    }
    this.services.add(servicesItem);
    return this;
  }

   /**
   * Get services
   * @return services
  **/
  @Schema(description = "")
  public List<PlatformServiceInfo> getServices() {
    return services;
  }

  public void setServices(List<PlatformServiceInfo> services) {
    this.services = services;
  }

  public PlatformInfo phoneHomeEnabled(Boolean phoneHomeEnabled) {
    this.phoneHomeEnabled = phoneHomeEnabled;
    return this;
  }

   /**
   * Is the phone-home service, which returns anonymized usage statistics to Elastic, enabled
   * @return phoneHomeEnabled
  **/
  @Schema(description = "Is the phone-home service, which returns anonymized usage statistics to Elastic, enabled")
  public Boolean isPhoneHomeEnabled() {
    return phoneHomeEnabled;
  }

  public void setPhoneHomeEnabled(Boolean phoneHomeEnabled) {
    this.phoneHomeEnabled = phoneHomeEnabled;
  }

  public PlatformInfo eulaAccepted(Boolean eulaAccepted) {
    this.eulaAccepted = eulaAccepted;
    return this;
  }

   /**
   * Indicates if the End User License Agreement been accepted
   * @return eulaAccepted
  **/
  @Schema(description = "Indicates if the End User License Agreement been accepted")
  public Boolean isEulaAccepted() {
    return eulaAccepted;
  }

  public void setEulaAccepted(Boolean eulaAccepted) {
    this.eulaAccepted = eulaAccepted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatformInfo platformInfo = (PlatformInfo) o;
    return Objects.equals(this.version, platformInfo.version) &&
        Objects.equals(this.services, platformInfo.services) &&
        Objects.equals(this.phoneHomeEnabled, platformInfo.phoneHomeEnabled) &&
        Objects.equals(this.eulaAccepted, platformInfo.eulaAccepted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, services, phoneHomeEnabled, eulaAccepted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatformInfo {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    phoneHomeEnabled: ").append(toIndentedString(phoneHomeEnabled)).append("\n");
    sb.append("    eulaAccepted: ").append(toIndentedString(eulaAccepted)).append("\n");
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