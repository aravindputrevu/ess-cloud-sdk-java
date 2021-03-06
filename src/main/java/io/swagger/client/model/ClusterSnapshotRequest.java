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
 * The settings for a snapshot create request.
 */
@Schema(description = "The settings for a snapshot create request.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ClusterSnapshotRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("repository_name")
  private String repositoryName = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("password")
  private String password = null;

  public ClusterSnapshotRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The optional name for the snapshot
   * @return name
  **/
  @Schema(description = "The optional name for the snapshot")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ClusterSnapshotRequest repositoryName(String repositoryName) {
    this.repositoryName = repositoryName;
    return this;
  }

   /**
   * The optional snapshot repository.  When the repository is unspecified, the default repository is used.
   * @return repositoryName
  **/
  @Schema(description = "The optional snapshot repository.  When the repository is unspecified, the default repository is used.")
  public String getRepositoryName() {
    return repositoryName;
  }

  public void setRepositoryName(String repositoryName) {
    this.repositoryName = repositoryName;
  }

  public ClusterSnapshotRequest username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The optional snapshot repository username.  When the snapshot repository username is unspecified, the default repository username is used.
   * @return username
  **/
  @Schema(description = "The optional snapshot repository username.  When the snapshot repository username is unspecified, the default repository username is used.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public ClusterSnapshotRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The optional snapshot repository password.  When the snapshot repository password is unspecified, the default repository password is used.
   * @return password
  **/
  @Schema(description = "The optional snapshot repository password.  When the snapshot repository password is unspecified, the default repository password is used.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterSnapshotRequest clusterSnapshotRequest = (ClusterSnapshotRequest) o;
    return Objects.equals(this.name, clusterSnapshotRequest.name) &&
        Objects.equals(this.repositoryName, clusterSnapshotRequest.repositoryName) &&
        Objects.equals(this.username, clusterSnapshotRequest.username) &&
        Objects.equals(this.password, clusterSnapshotRequest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, repositoryName, username, password);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterSnapshotRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    repositoryName: ").append(toIndentedString(repositoryName)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
