# SecurityDeployment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clusterId** | **String** | The identifier for the security deployment cluster | 
**name** | **String** | The name of the security deployment cluster | 
**version** | **String** | The version of the Elasticsearch cluster |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The current status of the cluster | 
**hasPendingPlan** | **Boolean** | True if a pending plan is in progress | 
**isHealthy** | **Boolean** | True if the cluster is healthy | 
**isEnabled** | **Boolean** | True if the security cluster is currently enabled | 

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
