# KibanaClusterInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clusterId** | **String** | The id of the cluster | 
**clusterName** | **String** | The name of the cluster | 
**elasticsearchCluster** | [**TargetElasticsearchCluster**](TargetElasticsearchCluster.md) |  | 
**deploymentId** | **String** | The id of the deployment to which this Kibana Server belongs to. |  [optional]
**healthy** | **Boolean** | Whether the cluster is healthy or not (one or more of the info subsections will have healthy: false) | 
**status** | [**StatusEnum**](#StatusEnum) | Cluster status |  [optional]
**planInfo** | [**KibanaClusterPlansInfo**](KibanaClusterPlansInfo.md) |  | 
**metadata** | [**ClusterMetadataInfo**](ClusterMetadataInfo.md) |  | 
**topology** | [**ClusterTopologyInfo**](ClusterTopologyInfo.md) |  | 
**externalLinks** | [**List&lt;ExternalHyperlink&gt;**](ExternalHyperlink.md) | External resources related to the cluster | 
**links** | [**Map&lt;String, Hyperlink&gt;**](Hyperlink.md) | A map of application-specific operations (which map to &#x27;operationId&#x27;s in the Swagger API) to metadata about that operation |  [optional]
**settings** | [**KibanaClusterSettings**](KibanaClusterSettings.md) |  |  [optional]
**region** | **String** | The region that this cluster belongs to. Only populated in SaaS or federated ECE. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
INITIALIZING | &quot;initializing&quot;
STOPPING | &quot;stopping&quot;
STOPPED | &quot;stopped&quot;
REBOOTING | &quot;rebooting&quot;
RESTARTING | &quot;restarting&quot;
RECONFIGURING | &quot;reconfiguring&quot;
STARTED | &quot;started&quot;
