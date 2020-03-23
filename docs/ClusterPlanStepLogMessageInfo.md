# ClusterPlanStepLogMessageInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp marking on info log of step | 
**deltaInMillis** | **Long** | Time in milliseconds since previous log message |  [optional]
**stage** | [**StageEnum**](#StageEnum) | Stage that info log message takes place in | 
**message** | **String** | Human readable log message | 

<a name="StageEnum"></a>
## Enum: StageEnum
Name | Value
---- | -----
STARTING | &quot;starting&quot;
COMPLETED | &quot;completed&quot;
IN_PROGRESS | &quot;in_progress&quot;
