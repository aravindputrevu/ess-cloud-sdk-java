# MatchQuery

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**query** | **String** | The text/numeric/date to query for. | 
**operator** | **String** | The operator flag can be set to or or and to control the boolean clauses (defaults to or). |  [optional]
**minimumShouldMatch** | **Integer** | The minimum number of optional should clauses to match. |  [optional]
**analyzer** | **String** | The analyzer that will be used to perform the analysis process on the text. Defaults to the analyzer that was used to index the field. |  [optional]
