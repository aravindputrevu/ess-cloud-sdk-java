# AllocatorInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**AllocatorHealthStatus**](AllocatorHealthStatus.md) |  |  [optional]
**allocatorId** | **String** | Identifier for this allocator | 
**zoneId** | **String** | Identifier of the zone | 
**hostIp** | **String** | Host IP of this allocator | 
**publicHostname** | **String** | Public hostname of this allocator | 
**capacity** | [**AllocatorCapacity**](AllocatorCapacity.md) |  | 
**settings** | [**AllocatorSettings**](AllocatorSettings.md) |  | 
**instances** | [**List&lt;AllocatedInstanceStatus&gt;**](AllocatedInstanceStatus.md) |  | 
**metadata** | [**List&lt;MetadataItem&gt;**](MetadataItem.md) | Arbitrary metadata associated with this allocator | 
**buildInfo** | [**AllocatorBuildInfo**](AllocatorBuildInfo.md) |  |  [optional]
**features** | **List&lt;String&gt;** | List of features associated with this allocator. Note this is only present for backwards compatibility purposes and is scheduled for removal in the next major version release. |  [optional]
**region** | **String** | The region that this allocator belongs to. Only populated in SaaS or federated ECE. |  [optional]
