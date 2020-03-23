# KibanaClusterTopologyElement

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**memoryPerNode** | **Integer** | The memory capacity in MB for each node of this type built in each zone. |  [optional]
**nodeCountPerZone** | **Integer** | The number of nodes of this type that are allocated within each zone (i.e. total capacity per zone &#x3D; &#x60;node_count_per_zone&#x60; * &#x60;memory_per_node&#x60; in MB). |  [optional]
**allocatorFilter** | **Object** | DEPRECATED: Scheduled for removal in a future version of the API.  Controls the allocation strategy of this node type using a simplified version of the Elasticsearch filter DSL (together with &#x27;node_configuration&#x27;) |  [optional]
**nodeConfiguration** | **String** | DEPRECATED: Scheduled for removal in a future version of the API.  Controls the allocation strategy of this node type by pointing to the names of pre-registered allocator settings. Unless otherwise specified for this deployment, should be omitted. |  [optional]
**instanceConfigurationId** | **String** | Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the id of an existing instance configuration. |  [optional]
**size** | [**TopologySize**](TopologySize.md) |  |  [optional]
**zoneCount** | **Integer** | number of zones in which nodes will be placed |  [optional]
**kibana** | [**KibanaConfiguration**](KibanaConfiguration.md) |  |  [optional]
