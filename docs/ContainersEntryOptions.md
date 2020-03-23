# ContainersEntryOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **Boolean** | Whether this allocation is active and should be created. | 
**auths** | [**List&lt;ContainersEntryOptionsAuth&gt;**](ContainersEntryOptionsAuth.md) | ZooKeeper Auths associated with this allocation | 
**acls** | [**List&lt;ContainersEntryOptionsACL&gt;**](ContainersEntryOptionsACL.md) | ZooKeeper ACLs associated with this allocation | 
**runnersSecret** | **String** | Secret shared between the runners that have containers in this container set allocated. |  [optional]
**containerSetSecret** | **String** | Secret shared between the containers that are part of this container set. |  [optional]
**enabledByNamedFeatureFlag** | **String** | A named feature flag to check whether this container is enabled or not  |  [optional]
**overrides** | [**ContainersEntryOptionsOverrides**](ContainersEntryOptionsOverrides.md) |  |  [optional]
