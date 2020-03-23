# ContainerConfigHostConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**extraHosts** | **List&lt;String&gt;** | Ports that are exposed by the container. | 
**networkMode** | **String** |  Sets the networking mode for the container. |  [optional]
**cpuPeriod** | **Integer** | The length of a CPU period in microsecond |  [optional]
**restartPolicy** | [**RestartPolicy**](RestartPolicy.md) |  |  [optional]
**portBindings** | [**Map&lt;String, PortBinding&gt;**](PortBinding.md) | Map of ports that should be exposed on the host. | 
**binds** | **List&lt;String&gt;** | Volume bindings for the container. | 
**privileged** | **Boolean** | List of environment variables on the form KEY&#x3D;value | 
