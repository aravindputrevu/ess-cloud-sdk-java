# InstanceConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for the instance configuration |  [optional]
**name** | **String** | Display name for the instance configuration. | 
**description** | **String** | Optional description for the instance configuration |  [optional]
**instanceType** | **String** | The type of instance (elasticsearch, kibana) | 
**nodeTypes** | **List&lt;String&gt;** | Node types (master, data) for the instance |  [optional]
**discreteSizes** | [**DiscreteSizes**](DiscreteSizes.md) |  | 
**allocatorFilter** | [**QueryContainer**](QueryContainer.md) |  |  [optional]
**storageMultiplier** | **Double** | Settings for the instance storage multiplier |  [optional]
**deletedOn** | [**OffsetDateTime**](OffsetDateTime.md) | Date/time that this instance configuration was marked for deletion |  [optional]
**systemOwned** | **Boolean** | Indicates if a instance configuration is system owned (restricts the set of operations that can be performed on it) |  [optional]
**metadata** | **Object** | Optional arbitrary metadata to associate with this template. |  [optional]
