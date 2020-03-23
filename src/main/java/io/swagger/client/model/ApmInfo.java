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
import io.swagger.client.model.ApmPlansInfo;
import io.swagger.client.model.ApmSettings;
import io.swagger.client.model.ClusterMetadataInfo;
import io.swagger.client.model.ClusterTopologyInfo;
import io.swagger.client.model.ExternalHyperlink;
import io.swagger.client.model.Hyperlink;
import io.swagger.client.model.TargetElasticsearchCluster;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * The overview information for the APM Server.
 */
@Schema(description = "The overview information for the APM Server.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ApmInfo {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("elasticsearch_cluster")
  private TargetElasticsearchCluster elasticsearchCluster = null;

  @SerializedName("deployment_id")
  private String deploymentId = null;

  @SerializedName("healthy")
  private Boolean healthy = null;

  /**
   * APM status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    INITIALIZING("initializing"),
    STOPPING("stopping"),
    STOPPED("stopped"),
    REBOOTING("rebooting"),
    RESTARTING("restarting"),
    RECONFIGURING("reconfiguring"),
    STARTED("started");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("plan_info")
  private ApmPlansInfo planInfo = null;

  @SerializedName("metadata")
  private ClusterMetadataInfo metadata = null;

  @SerializedName("topology")
  private ClusterTopologyInfo topology = null;

  @SerializedName("external_links")
  private List<ExternalHyperlink> externalLinks = new ArrayList<ExternalHyperlink>();

  @SerializedName("links")
  private Map<String, Hyperlink> links = null;

  @SerializedName("settings")
  private ApmSettings settings = null;

  @SerializedName("region")
  private String region = null;

  public ApmInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the APM
   * @return id
  **/
  @Schema(required = true, description = "The id of the APM")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ApmInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the APM
   * @return name
  **/
  @Schema(required = true, description = "The name of the APM")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApmInfo elasticsearchCluster(TargetElasticsearchCluster elasticsearchCluster) {
    this.elasticsearchCluster = elasticsearchCluster;
    return this;
  }

   /**
   * Get elasticsearchCluster
   * @return elasticsearchCluster
  **/
  @Schema(required = true, description = "")
  public TargetElasticsearchCluster getElasticsearchCluster() {
    return elasticsearchCluster;
  }

  public void setElasticsearchCluster(TargetElasticsearchCluster elasticsearchCluster) {
    this.elasticsearchCluster = elasticsearchCluster;
  }

  public ApmInfo deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

   /**
   * The id of the deployment to which this APM Server belongs to.
   * @return deploymentId
  **/
  @Schema(description = "The id of the deployment to which this APM Server belongs to.")
  public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  public ApmInfo healthy(Boolean healthy) {
    this.healthy = healthy;
    return this;
  }

   /**
   * Whether the APM is healthy or not (one or more of the info subsections will have healthy: false)
   * @return healthy
  **/
  @Schema(required = true, description = "Whether the APM is healthy or not (one or more of the info subsections will have healthy: false)")
  public Boolean isHealthy() {
    return healthy;
  }

  public void setHealthy(Boolean healthy) {
    this.healthy = healthy;
  }

   /**
   * APM status
   * @return status
  **/
  @Schema(description = "APM status")
  public StatusEnum getStatus() {
    return status;
  }

  public ApmInfo planInfo(ApmPlansInfo planInfo) {
    this.planInfo = planInfo;
    return this;
  }

   /**
   * Get planInfo
   * @return planInfo
  **/
  @Schema(required = true, description = "")
  public ApmPlansInfo getPlanInfo() {
    return planInfo;
  }

  public void setPlanInfo(ApmPlansInfo planInfo) {
    this.planInfo = planInfo;
  }

  public ApmInfo metadata(ClusterMetadataInfo metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Schema(description = "")
  public ClusterMetadataInfo getMetadata() {
    return metadata;
  }

  public void setMetadata(ClusterMetadataInfo metadata) {
    this.metadata = metadata;
  }

  public ApmInfo topology(ClusterTopologyInfo topology) {
    this.topology = topology;
    return this;
  }

   /**
   * Get topology
   * @return topology
  **/
  @Schema(required = true, description = "")
  public ClusterTopologyInfo getTopology() {
    return topology;
  }

  public void setTopology(ClusterTopologyInfo topology) {
    this.topology = topology;
  }

  public ApmInfo externalLinks(List<ExternalHyperlink> externalLinks) {
    this.externalLinks = externalLinks;
    return this;
  }

  public ApmInfo addExternalLinksItem(ExternalHyperlink externalLinksItem) {
    this.externalLinks.add(externalLinksItem);
    return this;
  }

   /**
   * External resources related to the APM
   * @return externalLinks
  **/
  @Schema(required = true, description = "External resources related to the APM")
  public List<ExternalHyperlink> getExternalLinks() {
    return externalLinks;
  }

  public void setExternalLinks(List<ExternalHyperlink> externalLinks) {
    this.externalLinks = externalLinks;
  }

  public ApmInfo links(Map<String, Hyperlink> links) {
    this.links = links;
    return this;
  }

  public ApmInfo putLinksItem(String key, Hyperlink linksItem) {
    if (this.links == null) {
      this.links = new HashMap<String, Hyperlink>();
    }
    this.links.put(key, linksItem);
    return this;
  }

   /**
   * A map of application-specific operations (which map to &#x27;operationId&#x27;s in the Swagger API) to metadata about that operation
   * @return links
  **/
  @Schema(description = "A map of application-specific operations (which map to 'operationId's in the Swagger API) to metadata about that operation")
  public Map<String, Hyperlink> getLinks() {
    return links;
  }

  public void setLinks(Map<String, Hyperlink> links) {
    this.links = links;
  }

  public ApmInfo settings(ApmSettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @Schema(description = "")
  public ApmSettings getSettings() {
    return settings;
  }

  public void setSettings(ApmSettings settings) {
    this.settings = settings;
  }

  public ApmInfo region(String region) {
    this.region = region;
    return this;
  }

   /**
   * The region that this APM belongs to. Only populated in SaaS or federated ECE.
   * @return region
  **/
  @Schema(description = "The region that this APM belongs to. Only populated in SaaS or federated ECE.")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApmInfo apmInfo = (ApmInfo) o;
    return Objects.equals(this.id, apmInfo.id) &&
        Objects.equals(this.name, apmInfo.name) &&
        Objects.equals(this.elasticsearchCluster, apmInfo.elasticsearchCluster) &&
        Objects.equals(this.deploymentId, apmInfo.deploymentId) &&
        Objects.equals(this.healthy, apmInfo.healthy) &&
        Objects.equals(this.status, apmInfo.status) &&
        Objects.equals(this.planInfo, apmInfo.planInfo) &&
        Objects.equals(this.metadata, apmInfo.metadata) &&
        Objects.equals(this.topology, apmInfo.topology) &&
        Objects.equals(this.externalLinks, apmInfo.externalLinks) &&
        Objects.equals(this.links, apmInfo.links) &&
        Objects.equals(this.settings, apmInfo.settings) &&
        Objects.equals(this.region, apmInfo.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, elasticsearchCluster, deploymentId, healthy, status, planInfo, metadata, topology, externalLinks, links, settings, region);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApmInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    elasticsearchCluster: ").append(toIndentedString(elasticsearchCluster)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    healthy: ").append(toIndentedString(healthy)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    planInfo: ").append(toIndentedString(planInfo)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    topology: ").append(toIndentedString(topology)).append("\n");
    sb.append("    externalLinks: ").append(toIndentedString(externalLinks)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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