# ElasticsearchPlanControlConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timeout** | **Long** | The total timeout in seconds after which the plan is cancelled even if it is not complete. Defaults to 4x the max memory capacity per node (in MB). NOTES: (eg a 3 zone cluster with 2 nodes of 2048 each would have a timeout of 4*2048&#x3D;8192 seconds) |  [optional]
**calmWaitTime** | **Long** | This timeout determines how long to give a cluster after it responds to API calls before performing actual operations on it. It defaults to 5s |  [optional]
**moveInstances** | [**List&lt;InstanceMoveRequest&gt;**](InstanceMoveRequest.md) |  |  [optional]
**moveAllocators** | [**List&lt;AllocatorMoveRequest&gt;**](AllocatorMoveRequest.md) |  |  [optional]
**moveOnly** | **Boolean** | If true (default: false) only move_instances and move_allocators instructions will be executed, all other changes will be ignored |  [optional]
**reallocateInstances** | **Boolean** | If true (default: false) does not allow re-using any existing instances currently in the cluster, ie even unchanged instances will be re-created |  [optional]
**preferredAllocators** | **List&lt;String&gt;** | List of allocators on which instances are placed if possible (if not possible/not specified then any available allocator with space is used) |  [optional]
**skipSnapshot** | **Boolean** | If true (default: false), does not take (or require) a successful snapshot to be taken before performing any potentially destructive changes to this cluster |  [optional]
**maxSnapshotAttempts** | **Integer** | If taking a snapshot (ie unless &#x27;skip_snapshots&#x27;: true) then will retry on failure at most this number of times (default: 5) |  [optional]
**maxSnapshotAge** | **Long** | When you take a snapshot and &#x27;skip_snapshots&#x27; is false, specifies the maximum age in seconds of the most recent snapshot before a new snapshot is created. Default is 300 |  [optional]
**extendedMaintenance** | **Boolean** | If true (default false), does not clear the maintenance flag (which prevents its API from being accessed except by the constructor) on new instances added until after a snapshot has been restored, otherwise, the maintenance flag is cleared once the new instances successfully join the new cluster |  [optional]
**clusterReboot** | [**ClusterRebootEnum**](#ClusterRebootEnum) | Set to &#x27;forced&#x27; to force a reboot as part of the upgrade plan. NOTES: (ie taking an existing plan and leaving it alone except for setting &#x27;transient.plan_configuration.cluster_reboot&#x27;: &#x27;forced&#x27; will reboot the cluster) |  [optional]
**overrideFailsafe** | **Boolean** | If false (the default) then the plan will fail out if it believes the requested sequence of operations can result in data loss - this flag will override some of these restraints |  [optional]
**skipDataMigration** | **Boolean** | If true (default: false) then the plan will not wait for data to be migrated from old instances to new instances before continuing the plan (potentially deleting the old instances and losing data) |  [optional]
**skipUpgradeChecker** | **Boolean** | If false, the cluster is checked for issues that should be resolved before migration (eg contains old Lucene segments), if true this is bypassed |  [optional]
**skipPostUpgradeSteps** | **Boolean** | If false (the default), the cluster will run (currently) 2.x-&gt;5.x operations for any plan change ending with a 5.x cluster (eg apply a cluster license, ensure Monitoring is configured) |  [optional]
**skipSnapshotPostMajorUpgrade** | **Boolean** | If false (the default), the cluster will perform a snapshot after a major version upgrade takes place |  [optional]

<a name="ClusterRebootEnum"></a>
## Enum: ClusterRebootEnum
Name | Value
---- | -----
FORCED | &quot;forced&quot;
