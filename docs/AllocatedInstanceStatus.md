# AllocatedInstanceStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clusterType** | **String** | Type of instance that is running. E.g. elasticsearch, kibana | 
**clusterId** | **String** | Identifier for the cluster this instance belongs | 
**clusterName** | **String** | Name of cluster this instance belongs, if available |  [optional]
**instanceName** | **String** | Instance ID of the instance | 
**nodeMemory** | **Integer** | Memory assigned to this instance | 
**healthy** | **Boolean** | Indicates whether the instance is healthy |  [optional]
**clusterHealthy** | **Boolean** | Indicates whether the cluster the instance belongs to is healthy |  [optional]
**instanceConfigurationId** | **String** | The instance configuration id of this instance |  [optional]
**moving** | **Boolean** | Indicates whether the instance is vacating away from this allocator. Note that this is currently not populated when returned from the search endpoint. |  [optional]
**plansInfo** | [**AllocatedInstancePlansInfo**](AllocatedInstancePlansInfo.md) |  |  [optional]
**deploymentId** | **String** | The id of the deployment this cluster belongs to. |  [optional]
