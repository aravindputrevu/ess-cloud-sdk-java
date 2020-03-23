# TransientElasticsearchPlanConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**strategy** | [**PlanStrategy**](PlanStrategy.md) |  |  [optional]
**planConfiguration** | [**ElasticsearchPlanControlConfiguration**](ElasticsearchPlanControlConfiguration.md) |  |  [optional]
**restoreSnapshot** | [**RestoreSnapshotConfiguration**](RestoreSnapshotConfiguration.md) |  |  [optional]
**clusterSettingsJson** | **Object** | If specified, contains transient settings to be applied to an Elasticsearch cluster during changes, default values shown below applied. These can be overridden by specifying them in the map (or null to unset). Additional settings can also be set. Settings will be cleared after the plan has finished. If not specified, no settings will be applied. NOTE: These settings are only explicitly cleared for 5.x+ clusters, they must be hand-reset to their defaults in 2.x- (or a cluster reboot will clear them). - indices.store.throttle.max_bytes_per_sec: 150Mb - indices.recovery.max_bytes_per_sec: 150Mb - cluster.routing.allocation.cluster_concurrent_rebalance: 10 - cluster.routing.allocation.node_initial_primaries_recoveries: 8 - cluster.routing.allocation.node_concurrent_incoming_recoveries: 8  |  [optional]
