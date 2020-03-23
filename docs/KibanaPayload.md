# KibanaPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**refId** | **String** | A locally-unique user-specified id for Kibana | 
**elasticsearchClusterRefId** | **String** | Alias to the Elasticsearch Cluster to attach Kibana to | 
**displayName** | **String** | The human readable name for the Kibana cluster (default: takes the name of its Elasticsearch cluster) |  [optional]
**region** | **String** | The region where this resource exists | 
**plan** | [**KibanaClusterPlan**](KibanaClusterPlan.md) |  | 
**settings** | [**KibanaClusterSettings**](KibanaClusterSettings.md) |  |  [optional]
