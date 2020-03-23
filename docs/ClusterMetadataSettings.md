# ClusterMetadataSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The display name of the cluster |  [optional]
**ownerId** | **String** | The user id (referencing whatever user database is in use) of the cluster owner |  [optional]
**subscriptionLevel** | **String** | Subscription level of the cluster |  [optional]
**systemOwned** | **Boolean** | Indicates if a cluster is system owned (restricts the set of operations that can be performed on it) |  [optional]
**contactEmail** | **String** | Contact email for the cluster |  [optional]
**hidden** | **Boolean** | Whether or not this cluster is hidden from the normal clusters list |  [optional]
**resources** | [**ClusterMetadataResourcesSettings**](ClusterMetadataResourcesSettings.md) |  |  [optional]
