# ClusterInstanceMemoryInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instanceCapacity** | **Integer** | The memory capacity in MB of the instance | 
**instanceCapacityPlanned** | **Integer** | The planned memory capacity in MB of the instance (only shown when an override is present) |  [optional]
**memoryPressure** | **Integer** | The % memory pressure of the service if available (60-75% consider increasing capacity, &gt;75% can incur significant performance and stability issues) |  [optional]
**nativeMemoryPressure** | **Integer** | The % native memory pressure of the service if available |  [optional]
