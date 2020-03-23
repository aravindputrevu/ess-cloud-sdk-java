# ClusterInstanceInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instanceName** | **String** | Whether the instance is healthy (ie started and running) | 
**instanceConfiguration** | [**ClusterInstanceConfigurationInfo**](ClusterInstanceConfigurationInfo.md) |  |  [optional]
**serviceVersion** | **String** | The version of the service that the instance is running (eg Elasticsearch or Kibana), if available |  [optional]
**serviceId** | **String** | The service-specific (eg Elasticsearch) id of the node, if available |  [optional]
**healthy** | **Boolean** | Whether the instance is healthy (ie started and running) | 
**containerStarted** | **Boolean** | Whether the container has started (does not tell you anything about the service -ie Elasticsearch- running inside the container) | 
**serviceRunning** | **Boolean** | Whether the service launched inside the container -ie Elasticsearch- is actually running | 
**maintenanceMode** | **Boolean** | Whether the service is is maintenance mode (meaning that the proxy is not routing external traffic to it) | 
**zone** | **String** | The zone in which this instance is being allocated |  [optional]
**allocatorId** | **String** | The id of the allocator on which this instance is running (if the container is started or starting) |  [optional]
**memory** | [**ClusterInstanceMemoryInfo**](ClusterInstanceMemoryInfo.md) |  |  [optional]
**disk** | [**ClusterInstanceDiskInfo**](ClusterInstanceDiskInfo.md) |  |  [optional]
**serviceRoles** | **List&lt;String&gt;** | List of roles assigned to the service running in the instance. Currently only populated for Elasticsearch, with possible values: master,data,ingest,ml |  [optional]
