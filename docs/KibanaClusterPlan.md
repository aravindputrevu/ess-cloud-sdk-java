# KibanaClusterPlan

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**zoneCount** | **Integer** | DEPRECATED: Scheduled for removal in a future version of the API. Please use &#x60;cluster_topology.zone_count&#x60; instead.  The number of zones in which data nodes will be placed, if not specified in the per topology settings |  [optional]
**clusterTopology** | [**List&lt;KibanaClusterTopologyElement&gt;**](KibanaClusterTopologyElement.md) |  |  [optional]
**kibana** | [**KibanaConfiguration**](KibanaConfiguration.md) |  | 
**_transient** | [**TransientKibanaPlanConfiguration**](TransientKibanaPlanConfiguration.md) |  |  [optional]
