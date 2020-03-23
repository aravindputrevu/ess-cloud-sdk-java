# ClusterCrudResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**elasticsearchClusterId** | **String** | For an operation creating or updating an Elasticsearch cluster, the Id of that cluster |  [optional]
**kibanaClusterId** | **String** | For an operation creating or updating a Kibana cluster, the Id of that cluster |  [optional]
**apmId** | **String** | For an operation creating or updating an APM, the Id of that cluster |  [optional]
**cloudId** | **String** | An encoded string that provides other Elastic services with the necessary information to connect to this Elasticsearch and Kibana |  [optional]
**credentials** | [**ClusterCredentials**](ClusterCredentials.md) |  |  [optional]
**diagnostics** | **Object** | If the endpoint is called with URL param &#x27;validate_only&#x3D;true&#x27;, then this contains advanced debug info (the internal plan representation) |  [optional]
**kibana** | [**ClusterCrudResponse**](ClusterCrudResponse.md) |  |  [optional]
**apm** | [**ApmCrudResponse**](ApmCrudResponse.md) |  |  [optional]
