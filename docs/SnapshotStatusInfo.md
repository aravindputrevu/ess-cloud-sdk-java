# SnapshotStatusInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**healthy** | **Boolean** | Health status of snapshots for this cluster | 
**count** | **Integer** | Number of snapshots stored for this cluster | 
**latestSuccessful** | **Boolean** | Latest snapshot status |  [optional]
**latestStatus** | **String** | Status of the latest snapshot attempt, if any exist. |  [optional]
**scheduledTime** | [**OffsetDateTime**](OffsetDateTime.md) | Scheduled time of next snapshot attempt |  [optional]
**latestEndTime** | [**OffsetDateTime**](OffsetDateTime.md) | The end time of the most recently attempted snapshot |  [optional]
**latestSuccessfulEndTime** | [**OffsetDateTime**](OffsetDateTime.md) | The end time of the most recently successful snapshot |  [optional]
**recentSuccess** | **Boolean** | Indicates whether the cluster has a relatively recent successful snapshot. |  [optional]
