# CreateElasticsearchClusterRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clusterName** | **String** | The human readable name for the cluster (defaults to the generated cluster id if not specified) |  [optional]
**plan** | [**ElasticsearchClusterPlan**](ElasticsearchClusterPlan.md) |  | 
**settings** | [**ElasticsearchClusterSettings**](ElasticsearchClusterSettings.md) |  |  [optional]
**kibana** | [**CreateKibanaInCreateElasticsearchRequest**](CreateKibanaInCreateElasticsearchRequest.md) |  |  [optional]
**apm** | [**CreateApmInCreateElasticsearchRequest**](CreateApmInCreateElasticsearchRequest.md) |  |  [optional]
