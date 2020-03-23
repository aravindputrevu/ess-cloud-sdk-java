# ApmPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**refId** | **String** | A locally-unique user-specified id for APM | 
**elasticsearchClusterRefId** | **String** | Alias to the Elasticsearch Cluster to attach APM to | 
**displayName** | **String** | The human readable name for the APM cluster (default: takes the name of its Elasticsearch cluster) |  [optional]
**region** | **String** | The region where this resource exists | 
**plan** | [**ApmPlan**](ApmPlan.md) |  | 
**settings** | [**ApmSettings**](ApmSettings.md) |  |  [optional]
