# ClusterSystemAlert

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp marking the system alert | 
**instanceName** | **String** | Instance that caused the system alert | 
**alertType** | [**AlertTypeEnum**](#AlertTypeEnum) | Type of system alert | 
**url** | **String** | The URL related to the event. Only applicable for alert_type: heap_dump |  [optional]
**exitCode** | **Integer** | The exit_code related to the event. Only applicable for alert_type: slain |  [optional]

<a name="AlertTypeEnum"></a>
## Enum: AlertTypeEnum
Name | Value
---- | -----
AUTOMATIC_RESTART | &quot;automatic_restart&quot;
HEAP_DUMP | &quot;heap_dump&quot;
UNKNOWN_EVENT | &quot;unknown_event&quot;
