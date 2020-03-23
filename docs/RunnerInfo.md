# RunnerInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runnerId** | **String** | The runner identifier | 
**runnerName** | **String** | The runner name |  [optional]
**zone** | **String** | Identifier of the zone |  [optional]
**tags** | **Map&lt;String, String&gt;** | Meta data of the runner, like image ID or processor architecture |  [optional]
**features** | **Map&lt;String, Boolean&gt;** | State of features of the runner |  [optional]
**buildInfo** | [**RunnerBuildInfo**](RunnerBuildInfo.md) |  |  [optional]
**hostIp** | **String** | Host IP for the runner | 
**publicHostname** | **String** | Public hostname for the runner | 
**containers** | [**List&lt;RunnerContainerInfo&gt;**](RunnerContainerInfo.md) | Containers for the runner | 
**roles** | [**List&lt;RunnerRoleInfo&gt;**](RunnerRoleInfo.md) | Roles for the runner | 
**connected** | **Boolean** | Specifies if the runner is connected | 
**healthy** | **Boolean** | Specifies if the runner is healthy | 
