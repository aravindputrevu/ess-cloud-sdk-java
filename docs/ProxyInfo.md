# ProxyInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**proxyId** | **String** | The proxy identifier | 
**runnerId** | **String** | Identifier of the runner for the proxy |  [optional]
**hostIp** | **String** | IP of the host the proxy runs on | 
**publicHostname** | **String** | Public hostname of the host the proxy runs on | 
**metadata** | **Object** | Arbitrary metadata associated with the proxy | 
**healthy** | **Boolean** | Specifies if the proxy is healthy | 
**zone** | **String** | The zone. |  [optional]
**allocations** | [**List&lt;ProxyAllocationInfo&gt;**](ProxyAllocationInfo.md) | Allocation information by type. | 
