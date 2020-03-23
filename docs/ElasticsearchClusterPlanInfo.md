# ElasticsearchClusterPlanInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**planAttemptId** | **String** | A UUID for each plan attempt |  [optional]
**planAttemptName** | **String** | A human readable name for each plan attempt, only populated when retrieving plan histories |  [optional]
**healthy** | **Boolean** | Either the plan ended successfully, or is not yet completed (and no errors have occurred) | 
**attemptStartTime** | [**OffsetDateTime**](OffsetDateTime.md) | When this plan attempt (ie to apply the plan to the cluster) started (ISO format in UTC) | 
**attemptEndTime** | [**OffsetDateTime**](OffsetDateTime.md) | If this plan completed or failed (ie is not pending), when the attempt ended (ISO format in UTC) |  [optional]
**planEndTime** | [**OffsetDateTime**](OffsetDateTime.md) | If this plan is not current or pending, when the plan was no longer active (ISO format in UTC) |  [optional]
**plan** | [**ElasticsearchClusterPlan**](ElasticsearchClusterPlan.md) |  |  [optional]
**planAttemptLog** | [**List&lt;ClusterPlanStepInfo&gt;**](ClusterPlanStepInfo.md) |  | 
**source** | [**ChangeSourceInfo**](ChangeSourceInfo.md) |  |  [optional]
