# KibanaPlanControlConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timeout** | **Long** | The total timeout in seconds after which the plan is cancelled even if it is not complete. Defaults to 4x the max memory capacity per node (in MB) |  [optional]
**calmWaitTime** | **Long** | This timeout determines how long to give a cluster after it responds to API calls before performing actual operations on it. It defaults to 5s |  [optional]
**moveInstances** | [**List&lt;InstanceMoveRequest&gt;**](InstanceMoveRequest.md) |  |  [optional]
**moveAllocators** | [**List&lt;AllocatorMoveRequest&gt;**](AllocatorMoveRequest.md) |  |  [optional]
**reallocateInstances** | **Boolean** | If true (default: false) does not allow re-using any existing instances currently in the cluster, ie even unchanged instances will be re-created |  [optional]
**preferredAllocators** | **List&lt;String&gt;** | List of allocators on which instances are placed if possible (if not possible/not specified then any available allocator with space is used) |  [optional]
**extendedMaintenance** | **Boolean** | If true (default false), does not clear the maintenance flag (which prevents its API from being accessed except by the constructor) on new instances added until after a snapshot has been restored, otherwise, the maintenance flag is cleared once the new instances successfully join the new cluster |  [optional]
**clusterReboot** | [**ClusterRebootEnum**](#ClusterRebootEnum) | Set to &#x27;forced&#x27; to force a reboot as part of the upgrade plan |  [optional]

<a name="ClusterRebootEnum"></a>
## Enum: ClusterRebootEnum
Name | Value
---- | -----
FORCED | &quot;forced&quot;
