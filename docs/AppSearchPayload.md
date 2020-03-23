# AppSearchPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**refId** | **String** | A locally-unique user-specified id for AppSearch | 
**elasticsearchClusterRefId** | **String** | Alias to the Elasticsearch Cluster to attach AppSearch to | 
**displayName** | **String** | The human readable name for the AppSearch cluster (default: takes the name of its Elasticsearch cluster) |  [optional]
**region** | **String** | The region where this resource exists | 
**plan** | [**AppSearchPlan**](AppSearchPlan.md) |  | 
**settings** | [**AppSearchSettings**](AppSearchSettings.md) |  |  [optional]
