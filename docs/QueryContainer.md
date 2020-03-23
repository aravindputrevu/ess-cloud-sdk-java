# QueryContainer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**match** | [**Map&lt;String, MatchQuery&gt;**](MatchQuery.md) |  |  [optional]
**matchAll** | [**MatchAllQuery**](MatchAllQuery.md) |  |  [optional]
**matchNone** | [**MatchNoneQuery**](MatchNoneQuery.md) |  |  [optional]
**term** | [**Map&lt;String, TermQuery&gt;**](TermQuery.md) |  |  [optional]
**bool** | [**BoolQuery**](BoolQuery.md) |  |  [optional]
**queryString** | [**QueryStringQuery**](QueryStringQuery.md) |  |  [optional]
**nested** | [**NestedQuery**](NestedQuery.md) |  |  [optional]
**prefix** | [**Map&lt;String, PrefixQuery&gt;**](PrefixQuery.md) |  |  [optional]
**exists** | [**ExistsQuery**](ExistsQuery.md) |  |  [optional]
**range** | [**Map&lt;String, RangeQuery&gt;**](RangeQuery.md) |  |  [optional]
