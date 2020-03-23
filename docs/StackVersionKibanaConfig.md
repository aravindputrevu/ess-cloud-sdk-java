# StackVersionKibanaConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | **String** | Version of Kibana |  [optional]
**dockerImage** | **String** | Docker image for the kibana | 
**blacklist** | **List&lt;String&gt;** | List of configuration options that cannot be overridden by user settings | 
**settings** | **Object** | Settings that are applied to all nodes of this type |  [optional]
**capacityConstraints** | [**StackVersionInstanceCapacityConstraint**](StackVersionInstanceCapacityConstraint.md) |  |  [optional]
**compatibleNodeTypes** | **List&lt;String&gt;** | Node types that are compatible with this one |  [optional]
