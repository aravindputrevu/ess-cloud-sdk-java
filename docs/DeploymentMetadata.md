# DeploymentMetadata

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ownerId** | **String** | The user id (referencing whatever user database is in use) of the deployment owner |  [optional]
**systemOwned** | **Boolean** | Indicates if a deployment is system owned (restricts the set of operations that can be performed on it) |  [optional]
**hidden** | **Boolean** | Whether or not this deployment is hidden from the normal deployment list |  [optional]
**subscriptionLevel** | **String** | Subscription level of the cluster |  [optional]
**lastModified** | [**OffsetDateTime**](OffsetDateTime.md) | The most recent time the cluster metadata was changed (ISO format in UTC) | 
