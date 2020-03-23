# RestoreSnapshotConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**repositoryName** | **String** | If specified, contains the name of the snapshot repository - else will default to the Elastic Cloud system repo (&#x27;found-snapshots&#x27;) |  [optional]
**snapshotName** | **String** | The name of the snapshot to restore. Use &#x27;\\_\\_latest_success\\_\\_&#x27; to get the most recent snapshot from the specified repository | 
**repositoryConfig** | [**RestoreSnapshotRepoConfiguration**](RestoreSnapshotRepoConfiguration.md) |  |  [optional]
**restorePayload** | [**RestoreSnapshotApiConfiguration**](RestoreSnapshotApiConfiguration.md) |  |  [optional]
**strategy** | [**StrategyEnum**](#StrategyEnum) | The restore strategy to use. Defaults to a full restore. Partial restore will attempt to restore unavailable indices only |  [optional]
**sourceClusterId** | **String** | If specified, contains the name of the source cluster id. Do not send this if you are sending repository_config |  [optional]

<a name="StrategyEnum"></a>
## Enum: StrategyEnum
Name | Value
---- | -----
PARTIAL | &quot;partial&quot;
FULL | &quot;full&quot;
RECOVERY | &quot;recovery&quot;
