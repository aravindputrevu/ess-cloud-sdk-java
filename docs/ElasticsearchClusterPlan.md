# ElasticsearchClusterPlan

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**zoneCount** | **Integer** | DEPRECATED: Scheduled for removal in a future version of the API. Please use &#x60;cluster_topology.zone_count&#x60; instead.  The default number of zones in which data nodes will be placed, if not specified in the per topology settings |  [optional]
**tiebreakerOverride** | **Boolean** | DEPRECATED: Scheduled for removal in a future version of the API.  Whether to add a tiebreaker node in an unused zone (defaults to auto-decide based on topology). If master nodes are specified then this cannot be left blank, you must explicitly decide true or false. |  [optional]
**tiebreakerTopology** | [**TiebreakerTopologyElement**](TiebreakerTopologyElement.md) |  |  [optional]
**clusterTopology** | [**List&lt;ElasticsearchClusterTopologyElement&gt;**](ElasticsearchClusterTopologyElement.md) |  | 
**elasticsearch** | [**ElasticsearchConfiguration**](ElasticsearchConfiguration.md) |  | 
**deploymentTemplate** | [**DeploymentTemplateReference**](DeploymentTemplateReference.md) |  |  [optional]
**_transient** | [**TransientElasticsearchPlanConfiguration**](TransientElasticsearchPlanConfiguration.md) |  |  [optional]
