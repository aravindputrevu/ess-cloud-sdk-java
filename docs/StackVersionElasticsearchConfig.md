# StackVersionElasticsearchConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dockerImage** | **String** | Docker image for the Elasticsearch | 
**plugins** | **List&lt;String&gt;** | List of available plugins | 
**defaultPlugins** | **List&lt;String&gt;** | List of default plugins | 
**blacklist** | **List&lt;String&gt;** | List of configuration options that cannot be overridden by user settings | 
**nodeTypes** | [**List&lt;StackVersionNodeType&gt;**](StackVersionNodeType.md) | Node types that are supported by this stack version |  [optional]
**settings** | **Object** | Settings that are applied to all nodes of this type |  [optional]
**capacityConstraints** | [**StackVersionInstanceCapacityConstraint**](StackVersionInstanceCapacityConstraint.md) |  |  [optional]
**compatibleNodeTypes** | **List&lt;String&gt;** | Node types that are compatible with this one |  [optional]
