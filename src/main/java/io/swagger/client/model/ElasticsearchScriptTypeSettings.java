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
 * Enables scripting for the specified type and controls other parameters. Store scripts in indexes (&#x60;stored&#x60;), upload in file bundles (&#x60;file&#x60;), or use in API requests (&#x60;inline&#x60;).
 */
@Schema(description = "Enables scripting for the specified type and controls other parameters. Store scripts in indexes (`stored`), upload in file bundles (`file`), or use in API requests (`inline`).")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ElasticsearchScriptTypeSettings {
  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("sandbox_mode")
  private Boolean sandboxMode = null;

  public ElasticsearchScriptTypeSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * If enabled (default: true) then scripts are enabled, either for sandboxing languages (by default), or for all installed languages if &#x27;sandbox_mode&#x27; is disabled (or for 6.x). NOTES: (Corresponds to the parameter &#x27;script.file|stored/indexed|inline&#x27;)
   * @return enabled
  **/
  @Schema(description = "If enabled (default: true) then scripts are enabled, either for sandboxing languages (by default), or for all installed languages if 'sandbox_mode' is disabled (or for 6.x). NOTES: (Corresponds to the parameter 'script.file|stored/indexed|inline')")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public ElasticsearchScriptTypeSettings sandboxMode(Boolean sandboxMode) {
    this.sandboxMode = sandboxMode;
    return this;
  }

   /**
   * If enabled (default: true) and this script type is enabled, then only the sandbox languages are allowed. By default the sandbox languages are painless, expressions and mustache, but this can be restricted via the &#x27;painless_enabled&#x27;, &#x27;mustache_enabled&#x27; &#x27;expression_enabled&#x27; settings.NOTES: Not supported in 6.x. (Corresponds to the parameters &#x27;script.engine.[painless|mustache|expressions].[file|stored|inline]&#x27;)
   * @return sandboxMode
  **/
  @Schema(description = "If enabled (default: true) and this script type is enabled, then only the sandbox languages are allowed. By default the sandbox languages are painless, expressions and mustache, but this can be restricted via the 'painless_enabled', 'mustache_enabled' 'expression_enabled' settings.NOTES: Not supported in 6.x. (Corresponds to the parameters 'script.engine.[painless|mustache|expressions].[file|stored|inline]')")
  public Boolean isSandboxMode() {
    return sandboxMode;
  }

  public void setSandboxMode(Boolean sandboxMode) {
    this.sandboxMode = sandboxMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticsearchScriptTypeSettings elasticsearchScriptTypeSettings = (ElasticsearchScriptTypeSettings) o;
    return Objects.equals(this.enabled, elasticsearchScriptTypeSettings.enabled) &&
        Objects.equals(this.sandboxMode, elasticsearchScriptTypeSettings.sandboxMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, sandboxMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticsearchScriptTypeSettings {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    sandboxMode: ").append(toIndentedString(sandboxMode)).append("\n");
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