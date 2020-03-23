# ClusterPlanStepInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stepId** | **String** | ID of current step | 
**started** | [**OffsetDateTime**](OffsetDateTime.md) | When the step started (ISO format in UTC) | 
**completed** | [**OffsetDateTime**](OffsetDateTime.md) | When the step completed (ISO format in UTC) |  [optional]
**durationInMillis** | **Long** | The duration of the step in MS |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the step (success, warning, error - warning means something didn&#x27;t go as expected but it was not serious enough to abort the plan) | 
**stage** | [**StageEnum**](#StageEnum) | Current stage that the step is in | 
**infoLog** | [**List&lt;ClusterPlanStepLogMessageInfo&gt;**](ClusterPlanStepLogMessageInfo.md) | Human readable summaries of the step, including messages for each stage of the step | 

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SUCCESS | &quot;success&quot;
WARNING | &quot;warning&quot;
ERROR | &quot;error&quot;
PENDING | &quot;pending&quot;

<a name="StageEnum"></a>
## Enum: StageEnum
Name | Value
---- | -----
STARTING | &quot;starting&quot;
COMPLETED | &quot;completed&quot;
IN_PROGRESS | &quot;in_progress&quot;
