# NestedQuery

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**query** | [**QueryContainer**](QueryContainer.md) |  | 
**path** | **String** | The path to the nested object. | 
**scoreMode** | [**ScoreModeEnum**](#ScoreModeEnum) | Allows to specify how inner children matching affects score of the parent. Refer to the Elasticsearch documentation for details. |  [optional]

<a name="ScoreModeEnum"></a>
## Enum: ScoreModeEnum
Name | Value
---- | -----
AVG | &quot;avg&quot;
SUM | &quot;sum&quot;
MIN | &quot;min&quot;
MAX | &quot;max&quot;
NONE | &quot;none&quot;
