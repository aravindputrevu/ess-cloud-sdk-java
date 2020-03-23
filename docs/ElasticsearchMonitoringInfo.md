# ElasticsearchMonitoringInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**healthy** | **Boolean** | Whether the Monitoring configuration has been successfully applied | 
**lastModified** | [**OffsetDateTime**](OffsetDateTime.md) | The time the monitoring configuration was last changed | 
**lastUpdateStatus** | **String** | The status message from the last update (successful or not) | 
**sourceClusterIds** | **List&lt;String&gt;** | The list of clusters Ids from which this cluster is currently receiving monitoring data | 
**destinationClusterIds** | **List&lt;String&gt;** | The list of clusters Ids to which this cluster is currently sending monitoring data | 
