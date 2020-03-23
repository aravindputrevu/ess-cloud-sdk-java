# RollingStrategyConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupBy** | **String** | Specifies the grouping attribute to use when rolling several instances. Instances that share the same value for the provided attribute key are rolled together as a unit. Examples that make sense to use are &#x27;\\_\\_all\\_\\_&#x27; (roll all instances as a single unit), &#x27;logical_zone_name&#x27; (roll instances by zone), &#x27;\\_\\_name\\_\\_&#x27; (roll one instance at a time, the default if not specified). Note that &#x27;\\_\\_all\\_\\_&#x27; is required when performing a major version upgrade |  [optional]
**allowInlineResize** | **Boolean** | Whether we allow changing the capacity of instances (default false). This is currently implemented by stopping, re-creating then starting the affected instance on its associated allocator when performing the changes. NOTES: This requires a round-trip through the allocation infrastructure of the active constructor, as it has to reserve the target capacity without over-committing |  [optional]
**skipSyncedFlush** | **Boolean** | Whether to skip attempting to do a synced flush on the filesystem of the container (default: false), which is less safe but may be required if the container is unhealthy |  [optional]
**shardInitWaitTime** | **Long** | The time, in seconds, to wait for shards that show no progress of initializing before rolling the next group (default: 10 minutes) |  [optional]
