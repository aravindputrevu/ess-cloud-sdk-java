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
import io.swagger.client.model.ApmSubInfo;
import io.swagger.client.model.AppSearchSubInfo;
import io.swagger.client.model.ClusterMetadataInfo;
import io.swagger.client.model.ClusterSystemAlert;
import io.swagger.client.model.ClusterTopologyInfo;
import io.swagger.client.model.CrossClusterSearchInfo;
import io.swagger.client.model.ElasticsearchClusterPlansInfo;
import io.swagger.client.model.ElasticsearchClusterSecurityInfo;
import io.swagger.client.model.ElasticsearchClusterSettings;
import io.swagger.client.model.ElasticsearchInfo;
import io.swagger.client.model.ElasticsearchMonitoringInfo;
import io.swagger.client.model.ExternalHyperlink;
import io.swagger.client.model.Hyperlink;
import io.swagger.client.model.KibanaSubClusterInfo;
import io.swagger.client.model.SnapshotStatusInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * The information for an Elasticsearch cluster.
 */
@Schema(description = "The information for an Elasticsearch cluster.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class ElasticsearchClusterInfo {
  @SerializedName("cluster_id")
  private String clusterId = null;

  @SerializedName("cluster_name")
  private String clusterName = null;

  @SerializedName("deployment_id")
  private String deploymentId = null;

  @SerializedName("healthy")
  private Boolean healthy = null;

  /**
   * Cluster status
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
  private ElasticsearchClusterPlansInfo planInfo = null;

  @SerializedName("elasticsearch")
  private ElasticsearchInfo elasticsearch = null;

  @SerializedName("metadata")
  private ClusterMetadataInfo metadata = null;

  @SerializedName("topology")
  private ClusterTopologyInfo topology = null;

  @SerializedName("system_alerts")
  private List<ClusterSystemAlert> systemAlerts = null;

  @SerializedName("associated_kibana_clusters")
  private List<KibanaSubClusterInfo> associatedKibanaClusters = new ArrayList<KibanaSubClusterInfo>();

  @SerializedName("associated_apm_clusters")
  private List<ApmSubInfo> associatedApmClusters = new ArrayList<ApmSubInfo>();

  @SerializedName("associated_appsearch_clusters")
  private List<AppSearchSubInfo> associatedAppsearchClusters = new ArrayList<AppSearchSubInfo>();

  @SerializedName("security")
  private ElasticsearchClusterSecurityInfo security = null;

  @SerializedName("elasticsearch_monitoring_info")
  private ElasticsearchMonitoringInfo elasticsearchMonitoringInfo = null;

  @SerializedName("snapshots")
  private SnapshotStatusInfo snapshots = null;

  @SerializedName("external_links")
  private List<ExternalHyperlink> externalLinks = new ArrayList<ExternalHyperlink>();

  @SerializedName("links")
  private Map<String, Hyperlink> links = null;

  @SerializedName("settings")
  private ElasticsearchClusterSettings settings = null;

  @SerializedName("region")
  private String region = null;

  @SerializedName("locked")
  private Boolean locked = null;

  @SerializedName("ccs")
  private CrossClusterSearchInfo ccs = null;

  public ElasticsearchClusterInfo clusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * The id of the cluster
   * @return clusterId
  **/
  @Schema(required = true, description = "The id of the cluster")
  public String getClusterId() {
    return clusterId;
  }

  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  public ElasticsearchClusterInfo clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

   /**
   * The name of the cluster
   * @return clusterName
  **/
  @Schema(required = true, description = "The name of the cluster")
  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public ElasticsearchClusterInfo deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

   /**
   * The id of the deployment to which this Elasticsearch belongs to.
   * @return deploymentId
  **/
  @Schema(description = "The id of the deployment to which this Elasticsearch belongs to.")
  public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  public ElasticsearchClusterInfo healthy(Boolean healthy) {
    this.healthy = healthy;
    return this;
  }

   /**
   * Whether the cluster is healthy or not (one or more of the info subsections will have healthy: false)
   * @return healthy
  **/
  @Schema(required = true, description = "Whether the cluster is healthy or not (one or more of the info subsections will have healthy: false)")
  public Boolean isHealthy() {
    return healthy;
  }

  public void setHealthy(Boolean healthy) {
    this.healthy = healthy;
  }

   /**
   * Cluster status
   * @return status
  **/
  @Schema(description = "Cluster status")
  public StatusEnum getStatus() {
    return status;
  }

  public ElasticsearchClusterInfo planInfo(ElasticsearchClusterPlansInfo planInfo) {
    this.planInfo = planInfo;
    return this;
  }

   /**
   * Get planInfo
   * @return planInfo
  **/
  @Schema(required = true, description = "")
  public ElasticsearchClusterPlansInfo getPlanInfo() {
    return planInfo;
  }

  public void setPlanInfo(ElasticsearchClusterPlansInfo planInfo) {
    this.planInfo = planInfo;
  }

  public ElasticsearchClusterInfo elasticsearch(ElasticsearchInfo elasticsearch) {
    this.elasticsearch = elasticsearch;
    return this;
  }

   /**
   * Get elasticsearch
   * @return elasticsearch
  **/
  @Schema(required = true, description = "")
  public ElasticsearchInfo getElasticsearch() {
    return elasticsearch;
  }

  public void setElasticsearch(ElasticsearchInfo elasticsearch) {
    this.elasticsearch = elasticsearch;
  }

  public ElasticsearchClusterInfo metadata(ClusterMetadataInfo metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Schema(required = true, description = "")
  public ClusterMetadataInfo getMetadata() {
    return metadata;
  }

  public void setMetadata(ClusterMetadataInfo metadata) {
    this.metadata = metadata;
  }

  public ElasticsearchClusterInfo topology(ClusterTopologyInfo topology) {
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

  public ElasticsearchClusterInfo systemAlerts(List<ClusterSystemAlert> systemAlerts) {
    this.systemAlerts = systemAlerts;
    return this;
  }

  public ElasticsearchClusterInfo addSystemAlertsItem(ClusterSystemAlert systemAlertsItem) {
    if (this.systemAlerts == null) {
      this.systemAlerts = new ArrayList<ClusterSystemAlert>();
    }
    this.systemAlerts.add(systemAlertsItem);
    return this;
  }

   /**
   * List of cluster system alerts
   * @return systemAlerts
  **/
  @Schema(description = "List of cluster system alerts")
  public List<ClusterSystemAlert> getSystemAlerts() {
    return systemAlerts;
  }

  public void setSystemAlerts(List<ClusterSystemAlert> systemAlerts) {
    this.systemAlerts = systemAlerts;
  }

  public ElasticsearchClusterInfo associatedKibanaClusters(List<KibanaSubClusterInfo> associatedKibanaClusters) {
    this.associatedKibanaClusters = associatedKibanaClusters;
    return this;
  }

  public ElasticsearchClusterInfo addAssociatedKibanaClustersItem(KibanaSubClusterInfo associatedKibanaClustersItem) {
    this.associatedKibanaClusters.add(associatedKibanaClustersItem);
    return this;
  }

   /**
   * Get associatedKibanaClusters
   * @return associatedKibanaClusters
  **/
  @Schema(required = true, description = "")
  public List<KibanaSubClusterInfo> getAssociatedKibanaClusters() {
    return associatedKibanaClusters;
  }

  public void setAssociatedKibanaClusters(List<KibanaSubClusterInfo> associatedKibanaClusters) {
    this.associatedKibanaClusters = associatedKibanaClusters;
  }

  public ElasticsearchClusterInfo associatedApmClusters(List<ApmSubInfo> associatedApmClusters) {
    this.associatedApmClusters = associatedApmClusters;
    return this;
  }

  public ElasticsearchClusterInfo addAssociatedApmClustersItem(ApmSubInfo associatedApmClustersItem) {
    this.associatedApmClusters.add(associatedApmClustersItem);
    return this;
  }

   /**
   * Get associatedApmClusters
   * @return associatedApmClusters
  **/
  @Schema(required = true, description = "")
  public List<ApmSubInfo> getAssociatedApmClusters() {
    return associatedApmClusters;
  }

  public void setAssociatedApmClusters(List<ApmSubInfo> associatedApmClusters) {
    this.associatedApmClusters = associatedApmClusters;
  }

  public ElasticsearchClusterInfo associatedAppsearchClusters(List<AppSearchSubInfo> associatedAppsearchClusters) {
    this.associatedAppsearchClusters = associatedAppsearchClusters;
    return this;
  }

  public ElasticsearchClusterInfo addAssociatedAppsearchClustersItem(AppSearchSubInfo associatedAppsearchClustersItem) {
    this.associatedAppsearchClusters.add(associatedAppsearchClustersItem);
    return this;
  }

   /**
   * Get associatedAppsearchClusters
   * @return associatedAppsearchClusters
  **/
  @Schema(required = true, description = "")
  public List<AppSearchSubInfo> getAssociatedAppsearchClusters() {
    return associatedAppsearchClusters;
  }

  public void setAssociatedAppsearchClusters(List<AppSearchSubInfo> associatedAppsearchClusters) {
    this.associatedAppsearchClusters = associatedAppsearchClusters;
  }

  public ElasticsearchClusterInfo security(ElasticsearchClusterSecurityInfo security) {
    this.security = security;
    return this;
  }

   /**
   * Get security
   * @return security
  **/
  @Schema(description = "")
  public ElasticsearchClusterSecurityInfo getSecurity() {
    return security;
  }

  public void setSecurity(ElasticsearchClusterSecurityInfo security) {
    this.security = security;
  }

  public ElasticsearchClusterInfo elasticsearchMonitoringInfo(ElasticsearchMonitoringInfo elasticsearchMonitoringInfo) {
    this.elasticsearchMonitoringInfo = elasticsearchMonitoringInfo;
    return this;
  }

   /**
   * Get elasticsearchMonitoringInfo
   * @return elasticsearchMonitoringInfo
  **/
  @Schema(description = "")
  public ElasticsearchMonitoringInfo getElasticsearchMonitoringInfo() {
    return elasticsearchMonitoringInfo;
  }

  public void setElasticsearchMonitoringInfo(ElasticsearchMonitoringInfo elasticsearchMonitoringInfo) {
    this.elasticsearchMonitoringInfo = elasticsearchMonitoringInfo;
  }

  public ElasticsearchClusterInfo snapshots(SnapshotStatusInfo snapshots) {
    this.snapshots = snapshots;
    return this;
  }

   /**
   * Get snapshots
   * @return snapshots
  **/
  @Schema(required = true, description = "")
  public SnapshotStatusInfo getSnapshots() {
    return snapshots;
  }

  public void setSnapshots(SnapshotStatusInfo snapshots) {
    this.snapshots = snapshots;
  }

  public ElasticsearchClusterInfo externalLinks(List<ExternalHyperlink> externalLinks) {
    this.externalLinks = externalLinks;
    return this;
  }

  public ElasticsearchClusterInfo addExternalLinksItem(ExternalHyperlink externalLinksItem) {
    this.externalLinks.add(externalLinksItem);
    return this;
  }

   /**
   * External resources related to the cluster
   * @return externalLinks
  **/
  @Schema(required = true, description = "External resources related to the cluster")
  public List<ExternalHyperlink> getExternalLinks() {
    return externalLinks;
  }

  public void setExternalLinks(List<ExternalHyperlink> externalLinks) {
    this.externalLinks = externalLinks;
  }

  public ElasticsearchClusterInfo links(Map<String, Hyperlink> links) {
    this.links = links;
    return this;
  }

  public ElasticsearchClusterInfo putLinksItem(String key, Hyperlink linksItem) {
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

  public ElasticsearchClusterInfo settings(ElasticsearchClusterSettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @Schema(description = "")
  public ElasticsearchClusterSettings getSettings() {
    return settings;
  }

  public void setSettings(ElasticsearchClusterSettings settings) {
    this.settings = settings;
  }

  public ElasticsearchClusterInfo region(String region) {
    this.region = region;
    return this;
  }

   /**
   * The region that this cluster belongs to. Only populated in SaaS or federated ECE.
   * @return region
  **/
  @Schema(description = "The region that this cluster belongs to. Only populated in SaaS or federated ECE.")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public ElasticsearchClusterInfo locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * Whether or not this cluster is locked. Only populated in SaaS.
   * @return locked
  **/
  @Schema(description = "Whether or not this cluster is locked. Only populated in SaaS.")
  public Boolean isLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public ElasticsearchClusterInfo ccs(CrossClusterSearchInfo ccs) {
    this.ccs = ccs;
    return this;
  }

   /**
   * Get ccs
   * @return ccs
  **/
  @Schema(description = "")
  public CrossClusterSearchInfo getCcs() {
    return ccs;
  }

  public void setCcs(CrossClusterSearchInfo ccs) {
    this.ccs = ccs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticsearchClusterInfo elasticsearchClusterInfo = (ElasticsearchClusterInfo) o;
    return Objects.equals(this.clusterId, elasticsearchClusterInfo.clusterId) &&
        Objects.equals(this.clusterName, elasticsearchClusterInfo.clusterName) &&
        Objects.equals(this.deploymentId, elasticsearchClusterInfo.deploymentId) &&
        Objects.equals(this.healthy, elasticsearchClusterInfo.healthy) &&
        Objects.equals(this.status, elasticsearchClusterInfo.status) &&
        Objects.equals(this.planInfo, elasticsearchClusterInfo.planInfo) &&
        Objects.equals(this.elasticsearch, elasticsearchClusterInfo.elasticsearch) &&
        Objects.equals(this.metadata, elasticsearchClusterInfo.metadata) &&
        Objects.equals(this.topology, elasticsearchClusterInfo.topology) &&
        Objects.equals(this.systemAlerts, elasticsearchClusterInfo.systemAlerts) &&
        Objects.equals(this.associatedKibanaClusters, elasticsearchClusterInfo.associatedKibanaClusters) &&
        Objects.equals(this.associatedApmClusters, elasticsearchClusterInfo.associatedApmClusters) &&
        Objects.equals(this.associatedAppsearchClusters, elasticsearchClusterInfo.associatedAppsearchClusters) &&
        Objects.equals(this.security, elasticsearchClusterInfo.security) &&
        Objects.equals(this.elasticsearchMonitoringInfo, elasticsearchClusterInfo.elasticsearchMonitoringInfo) &&
        Objects.equals(this.snapshots, elasticsearchClusterInfo.snapshots) &&
        Objects.equals(this.externalLinks, elasticsearchClusterInfo.externalLinks) &&
        Objects.equals(this.links, elasticsearchClusterInfo.links) &&
        Objects.equals(this.settings, elasticsearchClusterInfo.settings) &&
        Objects.equals(this.region, elasticsearchClusterInfo.region) &&
        Objects.equals(this.locked, elasticsearchClusterInfo.locked) &&
        Objects.equals(this.ccs, elasticsearchClusterInfo.ccs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, clusterName, deploymentId, healthy, status, planInfo, elasticsearch, metadata, topology, systemAlerts, associatedKibanaClusters, associatedApmClusters, associatedAppsearchClusters, security, elasticsearchMonitoringInfo, snapshots, externalLinks, links, settings, region, locked, ccs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticsearchClusterInfo {\n");
    
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    healthy: ").append(toIndentedString(healthy)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    planInfo: ").append(toIndentedString(planInfo)).append("\n");
    sb.append("    elasticsearch: ").append(toIndentedString(elasticsearch)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    topology: ").append(toIndentedString(topology)).append("\n");
    sb.append("    systemAlerts: ").append(toIndentedString(systemAlerts)).append("\n");
    sb.append("    associatedKibanaClusters: ").append(toIndentedString(associatedKibanaClusters)).append("\n");
    sb.append("    associatedApmClusters: ").append(toIndentedString(associatedApmClusters)).append("\n");
    sb.append("    associatedAppsearchClusters: ").append(toIndentedString(associatedAppsearchClusters)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
    sb.append("    elasticsearchMonitoringInfo: ").append(toIndentedString(elasticsearchMonitoringInfo)).append("\n");
    sb.append("    snapshots: ").append(toIndentedString(snapshots)).append("\n");
    sb.append("    externalLinks: ").append(toIndentedString(externalLinks)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    ccs: ").append(toIndentedString(ccs)).append("\n");
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
