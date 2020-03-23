# ElasticsearchSystemSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scripting** | [**ElasticsearchScriptingUserSettings**](ElasticsearchScriptingUserSettings.md) |  |  [optional]
**reindexWhitelist** | **List&lt;String&gt;** | Limits remote Elasticsearch clusters that can be used as the source for &#x27;_reindex&#x27; API commands |  [optional]
**useDiskThreshold** | **Boolean** | Whether to factor in the available disk space on a node before deciding whether to allocate new shards to that node or actively relocate shards away from the node (default: true). NOTES: (Corresponds to the parameter &#x27;cluster.routing.allocation.disk.threshold_enabled&#x27;) |  [optional]
**autoCreateIndex** | **Boolean** | If true (the default), then any write operation on an index that does not currently exist will create it. NOTES: (Corresponds to the parameter &#x27;action.auto_create_index&#x27;) |  [optional]
**enableCloseIndex** | **Boolean** | Defaults to false on versions &lt;&#x3D; 7.2.0, true otherwise. If false, then the API commands to close indices are disabled. This is important because Elasticsearch does not snapshot or migrate close indices on versions under 7.2.0, therefore standard Elastic Cloud configuration operations will cause irretrievable loss of indices&#x27; data. NOTES: (Corresponds to the parameter &#x27;cluster.indices.close.enable&#x27;) |  [optional]
**destructiveRequiresName** | **Boolean** | If true (default is false) then the index deletion API will not support wildcards or &#x27;_all&#x27;. NOTES: (Corresponds to the parameter &#x27;action.destructive_requires_name&#x27;) |  [optional]
**watcherTriggerEngine** | **String** | The trigger engine for Watcher, defaults to &#x27;scheduler&#x27; - see the xpack documentation for more information. NOTES: (Corresponds to the parameter &#x27;(xpack.)watcher.trigger.schedule.engine&#x27;, depending on version. Ignored from 6.x onwards.) |  [optional]
**defaultShardsPerIndex** | **Integer** | (2.x only - to get the same result in 5.x template mappings must be used) Sets the default number of shards per index, defaulting to 1 if not specified. (Corresponds to the parameter &#x27;index.number_of_shards&#x27; in 2.x, not supported in 5.x) |  [optional]
**monitoringCollectionInterval** | **Integer** | The default interval at which monitoring information from the cluster if collected, if monitoring is enabled. NOTES: (Corresponds to the parameter &#x27;marvel.agent.interval&#x27; in 2.x and &#x27;xpack.monitoring.collection.interval&#x27; in 5.x) |  [optional]
**monitoringHistoryDuration** | **String** | The duration for which monitoring history is stored (format &#x27;(NUMBER)d&#x27; eg &#x27;3d&#x27; for 3 days). NOTES: (&#x27;Corresponds to the parameter xpack.monitoring.history.duration&#x27; in 5.x, defaults to &#x27;7d&#x27;) |  [optional]
