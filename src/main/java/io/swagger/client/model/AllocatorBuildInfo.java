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
 * Information about the build that is running on the allocator.
 */
@Schema(description = "Information about the build that is running on the allocator.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class AllocatorBuildInfo {
  @SerializedName("commit_hash")
  private String commitHash = null;

  @SerializedName("version")
  private String version = null;

  public AllocatorBuildInfo commitHash(String commitHash) {
    this.commitHash = commitHash;
    return this;
  }

   /**
   * Git commit hash
   * @return commitHash
  **/
  @Schema(description = "Git commit hash")
  public String getCommitHash() {
    return commitHash;
  }

  public void setCommitHash(String commitHash) {
    this.commitHash = commitHash;
  }

  public AllocatorBuildInfo version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Version of the artifact
   * @return version
  **/
  @Schema(description = "Version of the artifact")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllocatorBuildInfo allocatorBuildInfo = (AllocatorBuildInfo) o;
    return Objects.equals(this.commitHash, allocatorBuildInfo.commitHash) &&
        Objects.equals(this.version, allocatorBuildInfo.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commitHash, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocatorBuildInfo {\n");
    
    sb.append("    commitHash: ").append(toIndentedString(commitHash)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
