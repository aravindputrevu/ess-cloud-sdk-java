# ClusterSnapshotSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**repositoryName** | **String** | Deprecated: ECE snapshot repository name, please use [repository] instead |  [optional]
**repository** | [**ClusterSnapshotRepositoryInfo**](ClusterSnapshotRepositoryInfo.md) |  |  [optional]
**interval** | **String** | Interval between snapshots, with the format &#x27;length unit&#x27; (space is optional), where unit can be one of: d (day), h (hour), min (minute). Default is 30 minutes |  [optional]
**pendingInterval** | **String** | Interval between snapshot progress checks, with the format &#x27;length unit&#x27; (space is optional), where unit can be one of: d (day), h (hour), min (minute). Default is 1 minute |  [optional]
**waitTimeAfterSnapshotting** | **String** | The time to wait between snapshot phases (snapshot, purge), with the format &#x27;length unit&#x27; (space is optional), where unit can be one of: d (day), h (hour), min (minute). Default is 10 minutes |  [optional]
**enabled** | **Boolean** | Indicates if Snapshotting is enabled |  [optional]
**suspended** | **List&lt;String&gt;** | List of temporary snapshot suspensions |  [optional]
**retention** | [**ClusterSnapshotRetention**](ClusterSnapshotRetention.md) |  |  [optional]
