# ElasticsearchClusterSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**snapshot** | [**ClusterSnapshotSettings**](ClusterSnapshotSettings.md) |  |  [optional]
**monitoring** | [**ManagedMonitoringSettings**](ManagedMonitoringSettings.md) |  |  [optional]
**metadata** | [**ClusterMetadataSettings**](ClusterMetadataSettings.md) |  |  [optional]
**curation** | [**ClusterCurationSettings**](ClusterCurationSettings.md) |  |  [optional]
**dedicatedMastersThreshold** | **Integer** | Threshold starting from which the number of instances in the cluster results in the introduction of dedicated masters. If the cluster is downscaled to a number of nodes below this one, dedicated masters will be removed. Limit is inclusive. |  [optional]
**ipFiltering** | [**IpFilteringSettings**](IpFilteringSettings.md) |  |  [optional]
**ccs** | [**CrossClusterSearchSettings**](CrossClusterSearchSettings.md) |  |  [optional]
