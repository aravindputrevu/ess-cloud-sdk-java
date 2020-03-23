# AllocatorMoveRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | **String** | The allocator id off which all instances in the cluster should be moved | 
**to** | **List&lt;String&gt;** | An optional list of allocator ids to which the instance(s) should be moved. If not specified then any available allocator can be used (including the current one if it is healthy) |  [optional]
**allocatorDown** | **Boolean** | Tells the infrastructure that all instances on the allocator should be considered as permanently down when deciding how to migrate data to new nodes. If left blank then the system will auto-decide (currently: will treat the allocator as up) |  [optional]
