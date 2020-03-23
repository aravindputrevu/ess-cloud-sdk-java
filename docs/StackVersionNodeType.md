# StackVersionNodeType

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodeType** | **String** | Type of the node (master, data, ...) | 
**name** | **String** | Name of the node type | 
**description** | **String** | Description of the node type | 
**settings** | **Object** | Settings that are applied to all nodes of this type |  [optional]
**capacityConstraints** | [**StackVersionInstanceCapacityConstraint**](StackVersionInstanceCapacityConstraint.md) |  |  [optional]
**compatibleNodeTypes** | **List&lt;String&gt;** | Node types that are compatible with this one |  [optional]
**mandatory** | **Boolean** | Flag to specify a node type is mandatory in a cluster&#x27;s plan |  [optional]
