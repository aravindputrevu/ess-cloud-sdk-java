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
import io.swagger.client.model.ElasticsearchScriptTypeSettings;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Controls the languages supported by the Elasticsearch cluster, such as Painless, Mustache, and Expressions. Controls how the languages are used, such as file, index, and inline. TIP: For complex configurations, leave these blank and configure these settings in the user YAML or JSON.
 */
@Schema(description = "Controls the languages supported by the Elasticsearch cluster, such as Painless, Mustache, and Expressions. Controls how the languages are used, such as file, index, and inline. TIP: For complex configurations, leave these blank and configure these settings in the user YAML or JSON.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ElasticsearchScriptingUserSettings {
  @SerializedName("painless_enabled")
  private Boolean painlessEnabled = null;

  @SerializedName("mustache_enabled")
  private Boolean mustacheEnabled = null;

  @SerializedName("expressions_enabled")
  private Boolean expressionsEnabled = null;

  @SerializedName("stored")
  private ElasticsearchScriptTypeSettings stored = null;

  @SerializedName("file")
  private ElasticsearchScriptTypeSettings file = null;

  @SerializedName("inline")
  private ElasticsearchScriptTypeSettings inline = null;

  public ElasticsearchScriptingUserSettings painlessEnabled(Boolean painlessEnabled) {
    this.painlessEnabled = painlessEnabled;
    return this;
  }

   /**
   * (5.x+ only) If enabled (the default) then the painless scripting engine is allowed as a sandboxed language. Sandboxed languages are the only ones allowed if &#x27;sandbox_mode&#x27; is set to true. NOTES: (Corresponds to the parameters &#x27;script.engine.painless.[file|stored|inline]&#x27;)
   * @return painlessEnabled
  **/
  @Schema(description = "(5.x+ only) If enabled (the default) then the painless scripting engine is allowed as a sandboxed language. Sandboxed languages are the only ones allowed if 'sandbox_mode' is set to true. NOTES: (Corresponds to the parameters 'script.engine.painless.[file|stored|inline]')")
  public Boolean isPainlessEnabled() {
    return painlessEnabled;
  }

  public void setPainlessEnabled(Boolean painlessEnabled) {
    this.painlessEnabled = painlessEnabled;
  }

  public ElasticsearchScriptingUserSettings mustacheEnabled(Boolean mustacheEnabled) {
    this.mustacheEnabled = mustacheEnabled;
    return this;
  }

   /**
   * (5.x+ only) If enabled (the default) then the mustache scripting engine is allowed as a sandboxed language. Sandboxed languages are the only ones allowed if &#x27;sandbox_mode&#x27; is set to true. NOTES: (Corresponds to the parameters &#x27;script.engine.mustache.[file|stored|inline]&#x27;)
   * @return mustacheEnabled
  **/
  @Schema(description = "(5.x+ only) If enabled (the default) then the mustache scripting engine is allowed as a sandboxed language. Sandboxed languages are the only ones allowed if 'sandbox_mode' is set to true. NOTES: (Corresponds to the parameters 'script.engine.mustache.[file|stored|inline]')")
  public Boolean isMustacheEnabled() {
    return mustacheEnabled;
  }

  public void setMustacheEnabled(Boolean mustacheEnabled) {
    this.mustacheEnabled = mustacheEnabled;
  }

  public ElasticsearchScriptingUserSettings expressionsEnabled(Boolean expressionsEnabled) {
    this.expressionsEnabled = expressionsEnabled;
    return this;
  }

   /**
   * (5.x+ only) If enabled (the default) then the expressions scripting engine is allowed as a sandboxed language. Sandboxed languages are the only ones allowed if &#x27;sandbox_mode&#x27; is set to true. NOTES: (Corresponds to the parameters &#x27;script.engine.expression.[file|stored|inline]&#x27;)
   * @return expressionsEnabled
  **/
  @Schema(description = "(5.x+ only) If enabled (the default) then the expressions scripting engine is allowed as a sandboxed language. Sandboxed languages are the only ones allowed if 'sandbox_mode' is set to true. NOTES: (Corresponds to the parameters 'script.engine.expression.[file|stored|inline]')")
  public Boolean isExpressionsEnabled() {
    return expressionsEnabled;
  }

  public void setExpressionsEnabled(Boolean expressionsEnabled) {
    this.expressionsEnabled = expressionsEnabled;
  }

  public ElasticsearchScriptingUserSettings stored(ElasticsearchScriptTypeSettings stored) {
    this.stored = stored;
    return this;
  }

   /**
   * Get stored
   * @return stored
  **/
  @Schema(description = "")
  public ElasticsearchScriptTypeSettings getStored() {
    return stored;
  }

  public void setStored(ElasticsearchScriptTypeSettings stored) {
    this.stored = stored;
  }

  public ElasticsearchScriptingUserSettings file(ElasticsearchScriptTypeSettings file) {
    this.file = file;
    return this;
  }

   /**
   * Get file
   * @return file
  **/
  @Schema(description = "")
  public ElasticsearchScriptTypeSettings getFile() {
    return file;
  }

  public void setFile(ElasticsearchScriptTypeSettings file) {
    this.file = file;
  }

  public ElasticsearchScriptingUserSettings inline(ElasticsearchScriptTypeSettings inline) {
    this.inline = inline;
    return this;
  }

   /**
   * Get inline
   * @return inline
  **/
  @Schema(description = "")
  public ElasticsearchScriptTypeSettings getInline() {
    return inline;
  }

  public void setInline(ElasticsearchScriptTypeSettings inline) {
    this.inline = inline;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticsearchScriptingUserSettings elasticsearchScriptingUserSettings = (ElasticsearchScriptingUserSettings) o;
    return Objects.equals(this.painlessEnabled, elasticsearchScriptingUserSettings.painlessEnabled) &&
        Objects.equals(this.mustacheEnabled, elasticsearchScriptingUserSettings.mustacheEnabled) &&
        Objects.equals(this.expressionsEnabled, elasticsearchScriptingUserSettings.expressionsEnabled) &&
        Objects.equals(this.stored, elasticsearchScriptingUserSettings.stored) &&
        Objects.equals(this.file, elasticsearchScriptingUserSettings.file) &&
        Objects.equals(this.inline, elasticsearchScriptingUserSettings.inline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(painlessEnabled, mustacheEnabled, expressionsEnabled, stored, file, inline);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticsearchScriptingUserSettings {\n");
    
    sb.append("    painlessEnabled: ").append(toIndentedString(painlessEnabled)).append("\n");
    sb.append("    mustacheEnabled: ").append(toIndentedString(mustacheEnabled)).append("\n");
    sb.append("    expressionsEnabled: ").append(toIndentedString(expressionsEnabled)).append("\n");
    sb.append("    stored: ").append(toIndentedString(stored)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    inline: ").append(toIndentedString(inline)).append("\n");
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
