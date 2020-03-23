# IpFilterRuleset

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ruleset ID |  [optional]
**name** | **String** | Name of the ruleset | 
**description** | **String** | Description of the ruleset |  [optional]
**rules** | [**List&lt;IpFilterRule&gt;**](IpFilterRule.md) | List of rules | 
**associations** | [**List&lt;FilterAssociation&gt;**](FilterAssociation.md) | List of associations. Returned only when include_associations query parameter is true |  [optional]
**totalAssociations** | **Integer** | Total number of associations. This includes associations user doesn&#x27;t have permission to view.Returned only when include_associations query parameter is true |  [optional]
