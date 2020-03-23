# StackVersionSiteSearchConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | **String** | Version of SiteSearch |  [optional]
**dockerImage** | **String** | Docker image for the SiteSearch | 
**blacklist** | **List&lt;String&gt;** | List of configuration options that cannot be overridden by user settings | 
**settings** | **Object** | Settings that are applied to all nodes of this type |  [optional]
**capacityConstraints** | [**StackVersionInstanceCapacityConstraint**](StackVersionInstanceCapacityConstraint.md) |  |  [optional]
**compatibleNodeTypes** | **List&lt;String&gt;** | Node types that are compatible with this one |  [optional]
**nodeTypes** | [**List&lt;StackVersionNodeType&gt;**](StackVersionNodeType.md) | Node types that are supported by this stack version |  [optional]
