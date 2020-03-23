# AppSearchInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the App Search | 
**name** | **String** | The name of the App Search | 
**elasticsearchCluster** | [**TargetElasticsearchCluster**](TargetElasticsearchCluster.md) |  | 
**deploymentId** | **String** | The id of the deployment to which this App Search belongs to. |  [optional]
**healthy** | **Boolean** | Whether the App Search is healthy or not (one or more of the info subsections will have healthy: false) | 
**status** | [**StatusEnum**](#StatusEnum) | App Search status |  [optional]
**planInfo** | [**AppSearchPlansInfo**](AppSearchPlansInfo.md) |  | 
**metadata** | [**ClusterMetadataInfo**](ClusterMetadataInfo.md) |  |  [optional]
**topology** | [**ClusterTopologyInfo**](ClusterTopologyInfo.md) |  | 
**externalLinks** | [**List&lt;ExternalHyperlink&gt;**](ExternalHyperlink.md) | External resources related to the App Search | 
**links** | [**Map&lt;String, Hyperlink&gt;**](Hyperlink.md) | A map of application-specific operations (which map to &#x27;operationId&#x27;s in the Swagger API) to metadata about that operation |  [optional]
**settings** | [**AppSearchSettings**](AppSearchSettings.md) |  |  [optional]
**region** | **String** | The region that this App Search belongs to. Only populated in SaaS or federated ECE. |  [optional]

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
