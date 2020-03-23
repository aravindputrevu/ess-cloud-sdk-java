# DeploymentResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**refId** | **String** | A locally-unique friendly alias for this Elasticsearch cluster | 
**elasticsearchClusterRefId** | **String** | The Elasticsearch cluster that this resource depends on. |  [optional]
**id** | **String** | A system-unique id for the created resource | 
**kind** | **String** | The kind of resource | 
**region** | **String** | Identifier of the region in which this resource runs. | 
**cloudId** | **String** | An encoded string that provides other Elastic services with the necessary information to connect to this Elasticsearch and Kibana |  [optional]
**credentials** | [**ClusterCredentials**](ClusterCredentials.md) |  |  [optional]
**secretToken** | **String** | Secret token for using a created resource. Only provided on initial create and absent otherwise. |  [optional]
