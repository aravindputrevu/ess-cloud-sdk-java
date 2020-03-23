# PlatformInfrastructureApi

All URIs are relative to *https://{{hostname}}/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBlueprinterBlessing**](PlatformInfrastructureApi.md#addBlueprinterBlessing) | **PUT** /platform/infrastructure/blueprinter/roles/{blueprinter_role_id}/blessings/{runner_id} | Add Blessing
[**createBlueprinterRole**](PlatformInfrastructureApi.md#createBlueprinterRole) | **POST** /platform/infrastructure/blueprinter/roles | Create a role
[**createConfigStoreOption**](PlatformInfrastructureApi.md#createConfigStoreOption) | **POST** /platform/configuration/store/{config_option_id} | Create Config Store Option
[**createProxiesFilteredGroup**](PlatformInfrastructureApi.md#createProxiesFilteredGroup) | **POST** /platform/infrastructure/proxies/filtered-groups | Create filtered group of proxies
[**deleteAllocator**](PlatformInfrastructureApi.md#deleteAllocator) | **DELETE** /platform/infrastructure/allocators/{allocator_id} | Delete allocator
[**deleteAllocatorMetadataItem**](PlatformInfrastructureApi.md#deleteAllocatorMetadataItem) | **DELETE** /platform/infrastructure/allocators/{allocator_id}/metadata/{key} | Delete allocator metadata item
[**deleteBlueprinterRole**](PlatformInfrastructureApi.md#deleteBlueprinterRole) | **DELETE** /platform/infrastructure/blueprinter/roles/{blueprinter_role_id} | Delete role
[**deleteConfigStoreOption**](PlatformInfrastructureApi.md#deleteConfigStoreOption) | **DELETE** /platform/configuration/store/{config_option_id} | Delete Config Store Option by name
[**deleteLicense**](PlatformInfrastructureApi.md#deleteLicense) | **DELETE** /platform/license | Delete license
[**deleteProxiesFilteredGroup**](PlatformInfrastructureApi.md#deleteProxiesFilteredGroup) | **DELETE** /platform/infrastructure/proxies/filtered-groups/{proxies_filtered_group_id} | Delete filtered group of proxies
[**deleteRunner**](PlatformInfrastructureApi.md#deleteRunner) | **DELETE** /platform/infrastructure/runners/{runner_id} | Delete runner
[**getAllocator**](PlatformInfrastructureApi.md#getAllocator) | **GET** /platform/infrastructure/allocators/{allocator_id} | Get allocator
[**getAllocatorMetadata**](PlatformInfrastructureApi.md#getAllocatorMetadata) | **GET** /platform/infrastructure/allocators/{allocator_id}/metadata | Get allocator metadata
[**getAllocatorSettings**](PlatformInfrastructureApi.md#getAllocatorSettings) | **GET** /platform/infrastructure/allocators/{allocator_id}/settings | Get allocator settings
[**getAllocators**](PlatformInfrastructureApi.md#getAllocators) | **GET** /platform/infrastructure/allocators | Get allocators
[**getBlueprinterRole**](PlatformInfrastructureApi.md#getBlueprinterRole) | **GET** /platform/infrastructure/blueprinter/roles/{blueprinter_role_id} | Get role
[**getConfigStoreOption**](PlatformInfrastructureApi.md#getConfigStoreOption) | **GET** /platform/configuration/store/{config_option_id} | Find Config Store Option by name
[**getConstructor**](PlatformInfrastructureApi.md#getConstructor) | **GET** /platform/infrastructure/constructors/{constructor_id} | Get constructor
[**getConstructors**](PlatformInfrastructureApi.md#getConstructors) | **GET** /platform/infrastructure/constructors | Get constructors
[**getLicense**](PlatformInfrastructureApi.md#getLicense) | **GET** /platform/license | Get license
[**getProxies**](PlatformInfrastructureApi.md#getProxies) | **GET** /platform/infrastructure/proxies | Get proxies
[**getProxiesFilteredGroup**](PlatformInfrastructureApi.md#getProxiesFilteredGroup) | **GET** /platform/infrastructure/proxies/filtered-groups/{proxies_filtered_group_id} | Get filtered group of proxies
[**getProxiesFilteredGroupHealth**](PlatformInfrastructureApi.md#getProxiesFilteredGroupHealth) | **GET** /platform/infrastructure/proxies/filtered-groups/{proxies_filtered_group_id}/health | Get health for a filtered group of proxies
[**getProxiesHealth**](PlatformInfrastructureApi.md#getProxiesHealth) | **GET** /platform/infrastructure/proxies/health | Get proxy health
[**getProxiesSettings**](PlatformInfrastructureApi.md#getProxiesSettings) | **GET** /platform/infrastructure/proxies/settings | Get proxies settings
[**getProxy**](PlatformInfrastructureApi.md#getProxy) | **GET** /platform/infrastructure/proxies/{proxy_id} | Get proxy
[**getRunner**](PlatformInfrastructureApi.md#getRunner) | **GET** /platform/infrastructure/runners/{runner_id} | Get runner
[**getRunners**](PlatformInfrastructureApi.md#getRunners) | **GET** /platform/infrastructure/runners | Get runners
[**listBlueprinterRoles**](PlatformInfrastructureApi.md#listBlueprinterRoles) | **GET** /platform/infrastructure/blueprinter/roles | List roles
[**listConfigStoreOption**](PlatformInfrastructureApi.md#listConfigStoreOption) | **GET** /platform/configuration/store | List Config Store Option
[**moveClusters**](PlatformInfrastructureApi.md#moveClusters) | **POST** /platform/infrastructure/allocators/{allocator_id}/clusters/_move | Move clusters
[**moveClustersByType**](PlatformInfrastructureApi.md#moveClustersByType) | **POST** /platform/infrastructure/allocators/{allocator_id}/clusters/{cluster_type}/_move | Move clusters by type
[**putConfigStoreOption**](PlatformInfrastructureApi.md#putConfigStoreOption) | **PUT** /platform/configuration/store/{config_option_id} | Update Config Store Option
[**resyncAllocator**](PlatformInfrastructureApi.md#resyncAllocator) | **POST** /platform/infrastructure/allocators/{allocator_id}/_resync | Resynchronize allocator
[**resyncAllocators**](PlatformInfrastructureApi.md#resyncAllocators) | **POST** /platform/infrastructure/allocators/_resync | Resynchronize allocators
[**resyncConstructor**](PlatformInfrastructureApi.md#resyncConstructor) | **POST** /platform/infrastructure/constructors/{constructor_id}/_resync | Resynchronize constructor
[**resyncConstructors**](PlatformInfrastructureApi.md#resyncConstructors) | **POST** /platform/infrastructure/constructors/_resync | Resynchronize constructors
[**resyncRunner**](PlatformInfrastructureApi.md#resyncRunner) | **POST** /platform/infrastructure/runners/{runner_id}/_resync | Resynchronize runner
[**resyncRunners**](PlatformInfrastructureApi.md#resyncRunners) | **POST** /platform/infrastructure/runners/_resync | Resynchronize runners
[**searchAllocators**](PlatformInfrastructureApi.md#searchAllocators) | **POST** /platform/infrastructure/allocators/_search | Search allocators
[**searchRunners**](PlatformInfrastructureApi.md#searchRunners) | **POST** /platform/infrastructure/runners/_search | Search runners
[**setAllocatorMetadata**](PlatformInfrastructureApi.md#setAllocatorMetadata) | **PUT** /platform/infrastructure/allocators/{allocator_id}/metadata | Set allocator metadata
[**setAllocatorMetadataItem**](PlatformInfrastructureApi.md#setAllocatorMetadataItem) | **PUT** /platform/infrastructure/allocators/{allocator_id}/metadata/{key} | Set allocator metadata item
[**setAllocatorSettings**](PlatformInfrastructureApi.md#setAllocatorSettings) | **PUT** /platform/infrastructure/allocators/{allocator_id}/settings | Set allocator settings
[**setBlueprinterBlessings**](PlatformInfrastructureApi.md#setBlueprinterBlessings) | **PUT** /platform/infrastructure/blueprinter/roles/{blueprinter_role_id}/blessings | Set blessings
[**setLicense**](PlatformInfrastructureApi.md#setLicense) | **PUT** /platform/license | Add or update license
[**setProxiesSettings**](PlatformInfrastructureApi.md#setProxiesSettings) | **PUT** /platform/infrastructure/proxies/settings | Set proxy settings
[**setRunnerRoles**](PlatformInfrastructureApi.md#setRunnerRoles) | **PUT** /platform/infrastructure/runners/{runner_id}/roles | Set runner roles
[**startAllocatorMaintenanceMode**](PlatformInfrastructureApi.md#startAllocatorMaintenanceMode) | **POST** /platform/infrastructure/allocators/{allocator_id}/maintenance-mode/_start | Start maintenance mode
[**startConstructorMaintenanceMode**](PlatformInfrastructureApi.md#startConstructorMaintenanceMode) | **POST** /platform/infrastructure/constructors/{constructor_id}/maintenance-mode/_start | Start maintenance mode
[**stopAllocatorMaintenanceMode**](PlatformInfrastructureApi.md#stopAllocatorMaintenanceMode) | **POST** /platform/infrastructure/allocators/{allocator_id}/maintenance-mode/_stop | Stop maintenance mode
[**stopConstructorMaintenanceMode**](PlatformInfrastructureApi.md#stopConstructorMaintenanceMode) | **POST** /platform/infrastructure/constructors/{constructor_id}/maintenance-mode/_stop | Stop maintenance mode
[**updateAllocatorSettings**](PlatformInfrastructureApi.md#updateAllocatorSettings) | **PATCH** /platform/infrastructure/allocators/{allocator_id}/settings | Update allocator settings
[**updateBlueprinterRole**](PlatformInfrastructureApi.md#updateBlueprinterRole) | **PUT** /platform/infrastructure/blueprinter/roles/{blueprinter_role_id} | Update role
[**updateProxiesFilteredGroup**](PlatformInfrastructureApi.md#updateProxiesFilteredGroup) | **PUT** /platform/infrastructure/proxies/filtered-groups/{proxies_filtered_group_id} | Update filtered group of proxies
[**updateProxiesSettings**](PlatformInfrastructureApi.md#updateProxiesSettings) | **PATCH** /platform/infrastructure/proxies/settings | Update proxy settings

<a name="addBlueprinterBlessing"></a>
# **addBlueprinterBlessing**
> RoleAggregate addBlueprinterBlessing(body, blueprinterRoleId, runnerId, version)

Add Blessing

Add a Blessing for a runner to a role.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
Blessing body = new Blessing(); // Blessing | The blessing to add.
String blueprinterRoleId = "blueprinterRoleId_example"; // String | User-specified Blueprinter role ID.
String runnerId = "runnerId_example"; // String | Runner ID for a blessing associated with a role.
Integer version = 56; // Integer | When specified, checks for conflicts against the version stored in the persistent store (returned in 'x-cloud-resource-version' of the GET request)
try {
    RoleAggregate result = apiInstance.addBlueprinterBlessing(body, blueprinterRoleId, runnerId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#addBlueprinterBlessing");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Blessing**](Blessing.md)| The blessing to add. |
 **blueprinterRoleId** | **String**| User-specified Blueprinter role ID. |
 **runnerId** | **String**| Runner ID for a blessing associated with a role. |
 **version** | **Integer**| When specified, checks for conflicts against the version stored in the persistent store (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) | [optional]

### Return type

[**RoleAggregate**](RoleAggregate.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="createBlueprinterRole"></a>
# **createBlueprinterRole**
> RoleAggregate createBlueprinterRole(body)

Create a role

Create a Blueprinter role.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
RoleAggregateCreateData body = new RoleAggregateCreateData(); // RoleAggregateCreateData | The data you want to use for creating a role.
try {
    RoleAggregate result = apiInstance.createBlueprinterRole(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#createBlueprinterRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RoleAggregateCreateData**](RoleAggregateCreateData.md)| The data you want to use for creating a role. |

### Return type

[**RoleAggregate**](RoleAggregate.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="createConfigStoreOption"></a>
# **createConfigStoreOption**
> ConfigStoreOption createConfigStoreOption(body, configOptionId)

Create Config Store Option

Inserts new Config Store Option.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
ConfigStoreOptionData body = new ConfigStoreOptionData(); // ConfigStoreOptionData | The Config Store Option definition
String configOptionId = "configOptionId_example"; // String | Name of the Config Store Option that you would like to create
try {
    ConfigStoreOption result = apiInstance.createConfigStoreOption(body, configOptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#createConfigStoreOption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConfigStoreOptionData**](ConfigStoreOptionData.md)| The Config Store Option definition |
 **configOptionId** | **String**| Name of the Config Store Option that you would like to create |

### Return type

[**ConfigStoreOption**](ConfigStoreOption.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="createProxiesFilteredGroup"></a>
# **createProxiesFilteredGroup**
> ProxiesFilteredGroup createProxiesFilteredGroup(body)

Create filtered group of proxies

Create the settings for a filtered group of proxies.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
ProxiesFilteredGroup body = new ProxiesFilteredGroup(); // ProxiesFilteredGroup | Data for the filtered group of proxies to create
try {
    ProxiesFilteredGroup result = apiInstance.createProxiesFilteredGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#createProxiesFilteredGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProxiesFilteredGroup**](ProxiesFilteredGroup.md)| Data for the filtered group of proxies to create |

### Return type

[**ProxiesFilteredGroup**](ProxiesFilteredGroup.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="deleteAllocator"></a>
# **deleteAllocator**
> EmptyResponse deleteAllocator(allocatorId, removeInstances)

Delete allocator

Deletes the allocator.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String allocatorId = "allocatorId_example"; // String | The allocator identifier.
Boolean removeInstances = true; // Boolean | Removes the instances from the deleted allocator.
try {
    EmptyResponse result = apiInstance.deleteAllocator(allocatorId, removeInstances);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#deleteAllocator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocatorId** | **String**| The allocator identifier. |
 **removeInstances** | **Boolean**| Removes the instances from the deleted allocator. | [optional]

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteAllocatorMetadataItem"></a>
# **deleteAllocatorMetadataItem**
> List&lt;MetadataItem&gt; deleteAllocatorMetadataItem(allocatorId, key, version)

Delete allocator metadata item

Removes a single item from the allocator metadata.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String allocatorId = "allocatorId_example"; // String | The allocator identifier.
String key = "key_example"; // String | The metadata item key.
Integer version = 56; // Integer | Checks for conflicts against the metadata version, then returns the value in the `x-cloud-resource-version` header.
try {
    List<MetadataItem> result = apiInstance.deleteAllocatorMetadataItem(allocatorId, key, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#deleteAllocatorMetadataItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocatorId** | **String**| The allocator identifier. |
 **key** | **String**| The metadata item key. |
 **version** | **Integer**| Checks for conflicts against the metadata version, then returns the value in the &#x60;x-cloud-resource-version&#x60; header. | [optional]

### Return type

[**List&lt;MetadataItem&gt;**](MetadataItem.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteBlueprinterRole"></a>
# **deleteBlueprinterRole**
> EmptyResponse deleteBlueprinterRole(blueprinterRoleId, version)

Delete role

Delete a role.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String blueprinterRoleId = "blueprinterRoleId_example"; // String | User-specified Blueprinter role ID.
Integer version = 56; // Integer | When specified, checks for conflicts against the version stored in the persistent store (returned in 'x-cloud-resource-version' of the GET request)
try {
    EmptyResponse result = apiInstance.deleteBlueprinterRole(blueprinterRoleId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#deleteBlueprinterRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blueprinterRoleId** | **String**| User-specified Blueprinter role ID. |
 **version** | **Integer**| When specified, checks for conflicts against the version stored in the persistent store (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) | [optional]

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteConfigStoreOption"></a>
# **deleteConfigStoreOption**
> EmptyResponse deleteConfigStoreOption(configOptionId)

Delete Config Store Option by name

Delete Config Store Option by name.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String configOptionId = "configOptionId_example"; // String | Name of the Config Store Option that you would like to delete
try {
    EmptyResponse result = apiInstance.deleteConfigStoreOption(configOptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#deleteConfigStoreOption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configOptionId** | **String**| Name of the Config Store Option that you would like to delete |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteLicense"></a>
# **deleteLicense**
> EmptyResponse deleteLicense()

Delete license

Deletes the license.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
try {
    EmptyResponse result = apiInstance.deleteLicense();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#deleteLicense");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteProxiesFilteredGroup"></a>
# **deleteProxiesFilteredGroup**
> EmptyResponse deleteProxiesFilteredGroup(proxiesFilteredGroupId, version)

Delete filtered group of proxies

Deletes a filtered group of proxies by ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String proxiesFilteredGroupId = "proxiesFilteredGroupId_example"; // String | \"The identifier for the filtered group of proxies
Integer version = 56; // Integer | Checks for conflicts against the metadata version, then returns the value in the `x-cloud-resource-version` header.
try {
    EmptyResponse result = apiInstance.deleteProxiesFilteredGroup(proxiesFilteredGroupId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#deleteProxiesFilteredGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxiesFilteredGroupId** | **String**| \&quot;The identifier for the filtered group of proxies |
 **version** | **Integer**| Checks for conflicts against the metadata version, then returns the value in the &#x60;x-cloud-resource-version&#x60; header. | [optional]

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteRunner"></a>
# **deleteRunner**
> EmptyResponse deleteRunner(runnerId)

Delete runner

Delete a runner by id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String runnerId = "runnerId_example"; // String | The identifier for the runner
try {
    EmptyResponse result = apiInstance.deleteRunner(runnerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#deleteRunner");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runnerId** | **String**| The identifier for the runner |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllocator"></a>
# **getAllocator**
> AllocatorInfo getAllocator(allocatorId)

Get allocator

Retrieves the allocator by the ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String allocatorId = "allocatorId_example"; // String | The allocator identifier.
try {
    AllocatorInfo result = apiInstance.getAllocator(allocatorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#getAllocator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocatorId** | **String**| The allocator identifier. |

### Return type

[**AllocatorInfo**](AllocatorInfo.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllocatorMetadata"></a>
# **getAllocatorMetadata**
> List&lt;MetadataItem&gt; getAllocatorMetadata(allocatorId)

Get allocator metadata

Retrieves the allocator metadata.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String allocatorId = "allocatorId_example"; // String | The allocator identifier.
try {
    List<MetadataItem> result = apiInstance.getAllocatorMetadata(allocatorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#getAllocatorMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocatorId** | **String**| The allocator identifier. |

### Return type

[**List&lt;MetadataItem&gt;**](MetadataItem.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllocatorSettings"></a>
# **getAllocatorSettings**
> AllocatorSettings getAllocatorSettings(allocatorId)

Get allocator settings

Retrieves the allocator override settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String allocatorId = "allocatorId_example"; // String | The allocator identifier.
try {
    AllocatorSettings result = apiInstance.getAllocatorSettings(allocatorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#getAllocatorSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocatorId** | **String**| The allocator identifier. |

### Return type

[**AllocatorSettings**](AllocatorSettings.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllocators"></a>
# **getAllocators**
> AllocatorOverview getAllocators(q, size, from, sort)

Get allocators

Retrieves the information for all of the allocators in the platform.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String q = "q_example"; // String | (Optional) The query that filters the allocators. Maps to an Elasticsearch `query_string` query.
Integer size = 56; // Integer | (Optional) The maximum number of search results to return. Defaults to 100.
Integer from = 56; // Integer | (Optional) The offset from the first result you want to fetch. Defaults to 0.
String sort = "sort_example"; // String | (Optional) An comma-separated array of fields to sort the search results by. Defaults to `allocator_id`.
try {
    AllocatorOverview result = apiInstance.getAllocators(q, size, from, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#getAllocators");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| (Optional) The query that filters the allocators. Maps to an Elasticsearch &#x60;query_string&#x60; query. | [optional]
 **size** | **Integer**| (Optional) The maximum number of search results to return. Defaults to 100. | [optional]
 **from** | **Integer**| (Optional) The offset from the first result you want to fetch. Defaults to 0. | [optional]
 **sort** | **String**| (Optional) An comma-separated array of fields to sort the search results by. Defaults to &#x60;allocator_id&#x60;. | [optional]

### Return type

[**AllocatorOverview**](AllocatorOverview.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBlueprinterRole"></a>
# **getBlueprinterRole**
> RoleAggregate getBlueprinterRole(blueprinterRoleId)

Get role

Retrieve a role.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String blueprinterRoleId = "blueprinterRoleId_example"; // String | User-specified Blueprinter role ID.
try {
    RoleAggregate result = apiInstance.getBlueprinterRole(blueprinterRoleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#getBlueprinterRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blueprinterRoleId** | **String**| User-specified Blueprinter role ID. |

### Return type

[**RoleAggregate**](RoleAggregate.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getConfigStoreOption"></a>
# **getConfigStoreOption**
> ConfigStoreOption getConfigStoreOption(configOptionId)

Find Config Store Option by name

Find Config Store Option by name.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String configOptionId = "configOptionId_example"; // String | Name of the Config Store Option that you would like to find
try {
    ConfigStoreOption result = apiInstance.getConfigStoreOption(configOptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#getConfigStoreOption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configOptionId** | **String**| Name of the Config Store Option that you would like to find |

### Return type

[**ConfigStoreOption**](ConfigStoreOption.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getConstructor"></a>
# **getConstructor**
> ConstructorInfo getConstructor(constructorId)

Get constructor

Retrieves a constructor by id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String constructorId = "constructorId_example"; // String | Identifier for the constructor
try {
    ConstructorInfo result = apiInstance.getConstructor(constructorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#getConstructor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **constructorId** | **String**| Identifier for the constructor |

### Return type

[**ConstructorInfo**](ConstructorInfo.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getConstructors"></a>
# **getConstructors**
> ConstructorOverview getConstructors()

Get constructors

Retrieves an overview of all constructors in an ECE installation.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
try {
    ConstructorOverview result = apiInstance.getConstructors();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#getConstructors");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConstructorOverview**](ConstructorOverview.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getLicense"></a>
# **getLicense**
> LicenseObject getLicense()

Get license

Retrieves the license.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
try {
    LicenseObject result = apiInstance.getLicense();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#getLicense");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LicenseObject**](LicenseObject.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getProxies"></a>
# **getProxies**
> ProxyOverview getProxies()

Get proxies

Retrieves an overview of all proxies.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
try {
    ProxyOverview result = apiInstance.getProxies();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#getProxies");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProxyOverview**](ProxyOverview.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getProxiesFilteredGroup"></a>
# **getProxiesFilteredGroup**
> ProxiesFilteredGroup getProxiesFilteredGroup(proxiesFilteredGroupId)

Get filtered group of proxies

Get data for a filtered group of proxies.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String proxiesFilteredGroupId = "proxiesFilteredGroupId_example"; // String | \"The identifier for the filtered group of proxies
try {
    ProxiesFilteredGroup result = apiInstance.getProxiesFilteredGroup(proxiesFilteredGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#getProxiesFilteredGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxiesFilteredGroupId** | **String**| \&quot;The identifier for the filtered group of proxies |

### Return type

[**ProxiesFilteredGroup**](ProxiesFilteredGroup.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getProxiesFilteredGroupHealth"></a>
# **getProxiesFilteredGroupHealth**
> ProxiesFilteredGroupHealth getProxiesFilteredGroupHealth(proxiesFilteredGroupId, expectStatus)

Get health for a filtered group of proxies

Get the health status of a filtered group of proxies.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String proxiesFilteredGroupId = "proxiesFilteredGroupId_example"; // String | \"The identifier for the filtered group of proxies
String expectStatus = "expectStatus_example"; // String | The expected status
try {
    ProxiesFilteredGroupHealth result = apiInstance.getProxiesFilteredGroupHealth(proxiesFilteredGroupId, expectStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#getProxiesFilteredGroupHealth");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxiesFilteredGroupId** | **String**| \&quot;The identifier for the filtered group of proxies |
 **expectStatus** | **String**| The expected status | [optional]

### Return type

[**ProxiesFilteredGroupHealth**](ProxiesFilteredGroupHealth.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getProxiesHealth"></a>
# **getProxiesHealth**
> ProxiesHealth getProxiesHealth(expectStatus)

Get proxy health

Get the health status of all proxies.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String expectStatus = "expectStatus_example"; // String | The expected status
try {
    ProxiesHealth result = apiInstance.getProxiesHealth(expectStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#getProxiesHealth");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expectStatus** | **String**| The expected status | [optional]

### Return type

[**ProxiesHealth**](ProxiesHealth.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getProxiesSettings"></a>
# **getProxiesSettings**
> ProxiesSettings getProxiesSettings()

Get proxies settings

Retrieves the settings for all proxies.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
try {
    ProxiesSettings result = apiInstance.getProxiesSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#getProxiesSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProxiesSettings**](ProxiesSettings.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getProxy"></a>
# **getProxy**
> ProxyInfo getProxy(proxyId)

Get proxy

Retrieves a single proxy by ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String proxyId = "proxyId_example"; // String | The identifier for the proxy
try {
    ProxyInfo result = apiInstance.getProxy(proxyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#getProxy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxyId** | **String**| The identifier for the proxy |

### Return type

[**ProxyInfo**](ProxyInfo.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getRunner"></a>
# **getRunner**
> RunnerInfo getRunner(runnerId)

Get runner

Retrieves a runner by id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String runnerId = "runnerId_example"; // String | The identifier for the runner
try {
    RunnerInfo result = apiInstance.getRunner(runnerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#getRunner");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runnerId** | **String**| The identifier for the runner |

### Return type

[**RunnerInfo**](RunnerInfo.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getRunners"></a>
# **getRunners**
> RunnerOverview getRunners(q)

Get runners

Retrieves an overview of all runners.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String q = "q_example"; // String | An optional query to filter runners by. Maps to an Elasticsearch query_string query.
try {
    RunnerOverview result = apiInstance.getRunners(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#getRunners");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| An optional query to filter runners by. Maps to an Elasticsearch query_string query. | [optional]

### Return type

[**RunnerOverview**](RunnerOverview.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="listBlueprinterRoles"></a>
# **listBlueprinterRoles**
> RoleAggregates listBlueprinterRoles()

List roles

Retrieve all persisted roles.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
try {
    RoleAggregates result = apiInstance.listBlueprinterRoles();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#listBlueprinterRoles");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RoleAggregates**](RoleAggregates.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="listConfigStoreOption"></a>
# **listConfigStoreOption**
> ConfigStoreOptionList listConfigStoreOption()

List Config Store Option

List all existing Config Store Option.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
try {
    ConfigStoreOptionList result = apiInstance.listConfigStoreOption();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#listConfigStoreOption");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConfigStoreOptionList**](ConfigStoreOptionList.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="moveClusters"></a>
# **moveClusters**
> MoveClustersCommandResponse moveClusters(allocatorId, body, forceUpdate, moveOnly, allocatorDown, validateOnly)

Move clusters

Moves the clusters to a different allocator.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String allocatorId = "allocatorId_example"; // String | The allocator identifier.
MoveClustersRequest body = new MoveClustersRequest(); // MoveClustersRequest | Overrides defaults for the move of each cluster
Boolean forceUpdate = true; // Boolean | When `true`, cancels and overwrites the pending plans, or treats the instance as an error.
Boolean moveOnly = true; // Boolean | When `true`, moves the specified instances and ignores the changes for the cluster state.
Boolean allocatorDown = true; // Boolean | When `true`, considers all instances on the allocator as permanently shut down when deciding how to migrate data to new nodes.When left blank, the system automatically decides. NOTE: The default treats the allocator as up.
Boolean validateOnly = true; // Boolean | When `true`, validates the plan overrides, then returns the plan without performing the move.
try {
    MoveClustersCommandResponse result = apiInstance.moveClusters(allocatorId, body, forceUpdate, moveOnly, allocatorDown, validateOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#moveClusters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocatorId** | **String**| The allocator identifier. |
 **body** | [**MoveClustersRequest**](MoveClustersRequest.md)| Overrides defaults for the move of each cluster | [optional]
 **forceUpdate** | **Boolean**| When &#x60;true&#x60;, cancels and overwrites the pending plans, or treats the instance as an error. | [optional]
 **moveOnly** | **Boolean**| When &#x60;true&#x60;, moves the specified instances and ignores the changes for the cluster state. | [optional]
 **allocatorDown** | **Boolean**| When &#x60;true&#x60;, considers all instances on the allocator as permanently shut down when deciding how to migrate data to new nodes.When left blank, the system automatically decides. NOTE: The default treats the allocator as up. | [optional]
 **validateOnly** | **Boolean**| When &#x60;true&#x60;, validates the plan overrides, then returns the plan without performing the move. | [optional]

### Return type

[**MoveClustersCommandResponse**](MoveClustersCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="moveClustersByType"></a>
# **moveClustersByType**
> MoveClustersCommandResponse moveClustersByType(allocatorId, clusterType, body, forceUpdate, moveOnly, allocatorDown, validateOnly)

Move clusters by type

Moves the clusters, by type, to a different allocator.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String allocatorId = "allocatorId_example"; // String | The allocator identifier.
String clusterType = "clusterType_example"; // String | The cluster types to move off of the allocator. NOTE: When unspecified, all clusters are moved.
MoveClustersRequest body = new MoveClustersRequest(); // MoveClustersRequest | Overrides defaults for the move of each cluster
Boolean forceUpdate = true; // Boolean | When true, cancels and overwrites pending plans, or treats instance as an error
Boolean moveOnly = true; // Boolean | When true, bypasses the cluster state changes, but continues to move the specified instances
Boolean allocatorDown = true; // Boolean | When `true`, considers all instances on the allocator as permanently shut down when deciding how to migrate data to new nodes.When left blank, the system automatically decides. NOTE: The default treats the allocator as up.
Boolean validateOnly = true; // Boolean | When `true`, validates the plan overrides, then returns the plan without performing the move.
try {
    MoveClustersCommandResponse result = apiInstance.moveClustersByType(allocatorId, clusterType, body, forceUpdate, moveOnly, allocatorDown, validateOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#moveClustersByType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocatorId** | **String**| The allocator identifier. |
 **clusterType** | **String**| The cluster types to move off of the allocator. NOTE: When unspecified, all clusters are moved. | [enum: apm, appsearch, elasticsearch, enterprisesearch, kibana, sitesearch]
 **body** | [**MoveClustersRequest**](MoveClustersRequest.md)| Overrides defaults for the move of each cluster | [optional]
 **forceUpdate** | **Boolean**| When true, cancels and overwrites pending plans, or treats instance as an error | [optional]
 **moveOnly** | **Boolean**| When true, bypasses the cluster state changes, but continues to move the specified instances | [optional]
 **allocatorDown** | **Boolean**| When &#x60;true&#x60;, considers all instances on the allocator as permanently shut down when deciding how to migrate data to new nodes.When left blank, the system automatically decides. NOTE: The default treats the allocator as up. | [optional]
 **validateOnly** | **Boolean**| When &#x60;true&#x60;, validates the plan overrides, then returns the plan without performing the move. | [optional]

### Return type

[**MoveClustersCommandResponse**](MoveClustersCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="putConfigStoreOption"></a>
# **putConfigStoreOption**
> ConfigStoreOption putConfigStoreOption(body, configOptionId, version)

Update Config Store Option

Update existing Config Store Option.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
ConfigStoreOptionData body = new ConfigStoreOptionData(); // ConfigStoreOptionData | The Config Store Option definition
String configOptionId = "configOptionId_example"; // String | Name of the Config Store Option that you would like to modify
Integer version = 56; // Integer | If specified then checks for conflicts against the version stored in the persistent store (returned in 'x-cloud-resource-version' of the GET request)
try {
    ConfigStoreOption result = apiInstance.putConfigStoreOption(body, configOptionId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#putConfigStoreOption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConfigStoreOptionData**](ConfigStoreOptionData.md)| The Config Store Option definition |
 **configOptionId** | **String**| Name of the Config Store Option that you would like to modify |
 **version** | **Integer**| If specified then checks for conflicts against the version stored in the persistent store (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) | [optional]

### Return type

[**ConfigStoreOption**](ConfigStoreOption.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="resyncAllocator"></a>
# **resyncAllocator**
> EmptyResponse resyncAllocator(allocatorId)

Resynchronize allocator

Immediately synchronizes the allocator information in the back-end search index and caches.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String allocatorId = "allocatorId_example"; // String | The allocator identifier.
try {
    EmptyResponse result = apiInstance.resyncAllocator(allocatorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#resyncAllocator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocatorId** | **String**| The allocator identifier. |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="resyncAllocators"></a>
# **resyncAllocators**
> ModelVersionIndexSynchronizationResults resyncAllocators(skipMatchingVersion)

Resynchronize allocators

Asynchronously synchronizes all allocator information in the back-end search index.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
Boolean skipMatchingVersion = true; // Boolean | When true, skips the document indexing when the version matches the in-memory copy.
try {
    ModelVersionIndexSynchronizationResults result = apiInstance.resyncAllocators(skipMatchingVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#resyncAllocators");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skipMatchingVersion** | **Boolean**| When true, skips the document indexing when the version matches the in-memory copy. | [optional]

### Return type

[**ModelVersionIndexSynchronizationResults**](ModelVersionIndexSynchronizationResults.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="resyncConstructor"></a>
# **resyncConstructor**
> EmptyResponse resyncConstructor(constructorId)

Resynchronize constructor

Immediately resynchronizes the search index and cache for the selected constructor.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String constructorId = "constructorId_example"; // String | Identifier for the constructor
try {
    EmptyResponse result = apiInstance.resyncConstructor(constructorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#resyncConstructor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **constructorId** | **String**| Identifier for the constructor |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="resyncConstructors"></a>
# **resyncConstructors**
> ModelVersionIndexSynchronizationResults resyncConstructors(skipMatchingVersion)

Resynchronize constructors

Asynchronously synchronizes all constructor information in the back-end search index.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
Boolean skipMatchingVersion = true; // Boolean | When true, skips the document indexing when the version matches the in-memory copy.
try {
    ModelVersionIndexSynchronizationResults result = apiInstance.resyncConstructors(skipMatchingVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#resyncConstructors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skipMatchingVersion** | **Boolean**| When true, skips the document indexing when the version matches the in-memory copy. | [optional]

### Return type

[**ModelVersionIndexSynchronizationResults**](ModelVersionIndexSynchronizationResults.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="resyncRunner"></a>
# **resyncRunner**
> EmptyResponse resyncRunner(runnerId)

Resynchronize runner

Immediately resynchronizes the search index and cache for the selected runner.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String runnerId = "runnerId_example"; // String | The identifier for the runner
try {
    EmptyResponse result = apiInstance.resyncRunner(runnerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#resyncRunner");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runnerId** | **String**| The identifier for the runner |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="resyncRunners"></a>
# **resyncRunners**
> ModelVersionIndexSynchronizationResults resyncRunners(skipMatchingVersion)

Resynchronize runners

Asynchronously synchronizes all runner information in the search index.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
Boolean skipMatchingVersion = true; // Boolean | When true, skips the document indexing when the version matches the in-memory copy.
try {
    ModelVersionIndexSynchronizationResults result = apiInstance.resyncRunners(skipMatchingVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#resyncRunners");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skipMatchingVersion** | **Boolean**| When true, skips the document indexing when the version matches the in-memory copy. | [optional]

### Return type

[**ModelVersionIndexSynchronizationResults**](ModelVersionIndexSynchronizationResults.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="searchAllocators"></a>
# **searchAllocators**
> AllocatorOverview searchAllocators(body)

Search allocators

Retrieves the information for all of the allocators in the platform that match the specified query.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
SearchRequest body = new SearchRequest(); // SearchRequest | The optional search request to execute. If not supplied then all allocators are matched
try {
    AllocatorOverview result = apiInstance.searchAllocators(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#searchAllocators");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchRequest**](SearchRequest.md)| The optional search request to execute. If not supplied then all allocators are matched | [optional]

### Return type

[**AllocatorOverview**](AllocatorOverview.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="searchRunners"></a>
# **searchRunners**
> RunnerOverview searchRunners(body)

Search runners

Retrieves runners that match a given query.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
SearchRequest body = new SearchRequest(); // SearchRequest | The optional search request to execute. If not supplied then all runners are matched.
try {
    RunnerOverview result = apiInstance.searchRunners(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#searchRunners");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchRequest**](SearchRequest.md)| The optional search request to execute. If not supplied then all runners are matched. | [optional]

### Return type

[**RunnerOverview**](RunnerOverview.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="setAllocatorMetadata"></a>
# **setAllocatorMetadata**
> List&lt;MetadataItem&gt; setAllocatorMetadata(body, allocatorId, version)

Set allocator metadata

Sets the allocator metadata.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
MetadataItems body = new MetadataItems(); // MetadataItems | The metadata to update the allocator with
String allocatorId = "allocatorId_example"; // String | The allocator identifier.
Integer version = 56; // Integer | Checks for conflicts against the metadata version, then returns the value in the `x-cloud-resource-version` header.
try {
    List<MetadataItem> result = apiInstance.setAllocatorMetadata(body, allocatorId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#setAllocatorMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MetadataItems**](MetadataItems.md)| The metadata to update the allocator with |
 **allocatorId** | **String**| The allocator identifier. |
 **version** | **Integer**| Checks for conflicts against the metadata version, then returns the value in the &#x60;x-cloud-resource-version&#x60; header. | [optional]

### Return type

[**List&lt;MetadataItem&gt;**](MetadataItem.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="setAllocatorMetadataItem"></a>
# **setAllocatorMetadataItem**
> List&lt;MetadataItem&gt; setAllocatorMetadataItem(body, allocatorId, key, version)

Set allocator metadata item

Adds or updates a single item in the allocator metadata.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
MetadataItemValue body = new MetadataItemValue(); // MetadataItemValue | The value of the metadata item to add or update
String allocatorId = "allocatorId_example"; // String | The allocator identifier.
String key = "key_example"; // String | The metadata item key.
Integer version = 56; // Integer | Checks for conflicts against the metadata version, then returns the value in the `x-cloud-resource-version` header.
try {
    List<MetadataItem> result = apiInstance.setAllocatorMetadataItem(body, allocatorId, key, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#setAllocatorMetadataItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MetadataItemValue**](MetadataItemValue.md)| The value of the metadata item to add or update |
 **allocatorId** | **String**| The allocator identifier. |
 **key** | **String**| The metadata item key. |
 **version** | **Integer**| Checks for conflicts against the metadata version, then returns the value in the &#x60;x-cloud-resource-version&#x60; header. | [optional]

### Return type

[**List&lt;MetadataItem&gt;**](MetadataItem.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="setAllocatorSettings"></a>
# **setAllocatorSettings**
> AllocatorSettings setAllocatorSettings(body, allocatorId, version)

Set allocator settings

Overwrites the allocator settings with the specified settings. WARNING: Any unspecified fields are deleted.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
AllocatorSettings body = new AllocatorSettings(); // AllocatorSettings | The allocator settings to apply
String allocatorId = "allocatorId_example"; // String | The allocator identifier.
Integer version = 56; // Integer | Checks for conflicts against the metadata version, then returns the value in the `x-cloud-resource-version` header.
try {
    AllocatorSettings result = apiInstance.setAllocatorSettings(body, allocatorId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#setAllocatorSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AllocatorSettings**](AllocatorSettings.md)| The allocator settings to apply |
 **allocatorId** | **String**| The allocator identifier. |
 **version** | **Integer**| Checks for conflicts against the metadata version, then returns the value in the &#x60;x-cloud-resource-version&#x60; header. | [optional]

### Return type

[**AllocatorSettings**](AllocatorSettings.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="setBlueprinterBlessings"></a>
# **setBlueprinterBlessings**
> RoleAggregate setBlueprinterBlessings(body, blueprinterRoleId, version)

Set blessings

Set blessings for a role.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
Blessings body = new Blessings(); // Blessings | The blessings to set.
String blueprinterRoleId = "blueprinterRoleId_example"; // String | User-specified Blueprinter role ID.
Integer version = 56; // Integer | When specified, checks for conflicts against the version stored in the persistent store (returned in 'x-cloud-resource-version' of the GET request)
try {
    RoleAggregate result = apiInstance.setBlueprinterBlessings(body, blueprinterRoleId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#setBlueprinterBlessings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Blessings**](Blessings.md)| The blessings to set. |
 **blueprinterRoleId** | **String**| User-specified Blueprinter role ID. |
 **version** | **Integer**| When specified, checks for conflicts against the version stored in the persistent store (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) | [optional]

### Return type

[**RoleAggregate**](RoleAggregate.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="setLicense"></a>
# **setLicense**
> EmptyResponse setLicense(body)

Add or update license

Adds a new or updates an existing license.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
LicenseObject body = new LicenseObject(); // LicenseObject | The license to add or update.
try {
    EmptyResponse result = apiInstance.setLicense(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#setLicense");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LicenseObject**](LicenseObject.md)| The license to add or update. |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="setProxiesSettings"></a>
# **setProxiesSettings**
> ProxiesSettings setProxiesSettings(body, version)

Set proxy settings

Overwrites the proxy settings. All unspecified fields are deleted.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
ProxiesSettings body = new ProxiesSettings(); // ProxiesSettings | The proxy settings to apply
Integer version = 56; // Integer | If specified, checks for conflicts against the version of the settings (returned in 'x-cloud-resource-version' of the GET request)
try {
    ProxiesSettings result = apiInstance.setProxiesSettings(body, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#setProxiesSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProxiesSettings**](ProxiesSettings.md)| The proxy settings to apply |
 **version** | **Integer**| If specified, checks for conflicts against the version of the settings (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) | [optional]

### Return type

[**ProxiesSettings**](ProxiesSettings.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="setRunnerRoles"></a>
# **setRunnerRoles**
> RunnerRolesInfo setRunnerRoles(body, runnerId, bless)

Set runner roles

Set runner roles.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
RunnerRolesInfo body = new RunnerRolesInfo(); // RunnerRolesInfo | The roles for the runner that you want to apply.
String runnerId = "runnerId_example"; // String | The identifier for the runner
Boolean bless = true; // Boolean | Assigns the runner to the roles.
try {
    RunnerRolesInfo result = apiInstance.setRunnerRoles(body, runnerId, bless);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#setRunnerRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RunnerRolesInfo**](RunnerRolesInfo.md)| The roles for the runner that you want to apply. |
 **runnerId** | **String**| The identifier for the runner |
 **bless** | **Boolean**| Assigns the runner to the roles. | [optional]

### Return type

[**RunnerRolesInfo**](RunnerRolesInfo.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="startAllocatorMaintenanceMode"></a>
# **startAllocatorMaintenanceMode**
> EmptyResponse startAllocatorMaintenanceMode(allocatorId)

Start maintenance mode

Starts maintenance mode on the allocator.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String allocatorId = "allocatorId_example"; // String | The allocator identifier.
try {
    EmptyResponse result = apiInstance.startAllocatorMaintenanceMode(allocatorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#startAllocatorMaintenanceMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocatorId** | **String**| The allocator identifier. |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="startConstructorMaintenanceMode"></a>
# **startConstructorMaintenanceMode**
> EmptyResponse startConstructorMaintenanceMode(constructorId)

Start maintenance mode

Start maintenance mode of a constructor. It will stop constructing new plans while continuing with on-going ones.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String constructorId = "constructorId_example"; // String | Identifier for the constructor
try {
    EmptyResponse result = apiInstance.startConstructorMaintenanceMode(constructorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#startConstructorMaintenanceMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **constructorId** | **String**| Identifier for the constructor |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="stopAllocatorMaintenanceMode"></a>
# **stopAllocatorMaintenanceMode**
> EmptyResponse stopAllocatorMaintenanceMode(allocatorId)

Stop maintenance mode

Stops maintenance mode on the allocator.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String allocatorId = "allocatorId_example"; // String | The allocator identifier.
try {
    EmptyResponse result = apiInstance.stopAllocatorMaintenanceMode(allocatorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#stopAllocatorMaintenanceMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocatorId** | **String**| The allocator identifier. |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="stopConstructorMaintenanceMode"></a>
# **stopConstructorMaintenanceMode**
> EmptyResponse stopConstructorMaintenanceMode(constructorId)

Stop maintenance mode

Stop maintenance mode of a constructor. It will resume the construction of submitted plans.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String constructorId = "constructorId_example"; // String | Identifier for the constructor
try {
    EmptyResponse result = apiInstance.stopConstructorMaintenanceMode(constructorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#stopConstructorMaintenanceMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **constructorId** | **String**| Identifier for the constructor |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateAllocatorSettings"></a>
# **updateAllocatorSettings**
> AllocatorSettings updateAllocatorSettings(body, allocatorId, version)

Update allocator settings

Applies the settings as a patch. Only the fields that are referenced in the update are altered.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String body = "body_example"; // String | The allocator settings to update
String allocatorId = "allocatorId_example"; // String | The allocator identifier.
Integer version = 56; // Integer | Checks for conflicts against the metadata version, then returns the value in the `x-cloud-resource-version` header.
try {
    AllocatorSettings result = apiInstance.updateAllocatorSettings(body, allocatorId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#updateAllocatorSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| The allocator settings to update |
 **allocatorId** | **String**| The allocator identifier. |
 **version** | **Integer**| Checks for conflicts against the metadata version, then returns the value in the &#x60;x-cloud-resource-version&#x60; header. | [optional]

### Return type

[**AllocatorSettings**](AllocatorSettings.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="updateBlueprinterRole"></a>
# **updateBlueprinterRole**
> RoleAggregate updateBlueprinterRole(body, blueprinterRoleId, version)

Update role

Update a role.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
Role body = new Role(); // Role | The role update data.
String blueprinterRoleId = "blueprinterRoleId_example"; // String | User-specified Blueprinter role ID.
Integer version = 56; // Integer | When specified, checks for conflicts against the version stored in the persistent store (returned in 'x-cloud-resource-version' of the GET request)
try {
    RoleAggregate result = apiInstance.updateBlueprinterRole(body, blueprinterRoleId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#updateBlueprinterRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Role**](Role.md)| The role update data. |
 **blueprinterRoleId** | **String**| User-specified Blueprinter role ID. |
 **version** | **Integer**| When specified, checks for conflicts against the version stored in the persistent store (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) | [optional]

### Return type

[**RoleAggregate**](RoleAggregate.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="updateProxiesFilteredGroup"></a>
# **updateProxiesFilteredGroup**
> ProxiesFilteredGroup updateProxiesFilteredGroup(body, proxiesFilteredGroupId, version)

Update filtered group of proxies

Update the settings for a filtered group of proxies.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
ProxiesFilteredGroup body = new ProxiesFilteredGroup(); // ProxiesFilteredGroup | Data for the filtered group of proxies to update
String proxiesFilteredGroupId = "proxiesFilteredGroupId_example"; // String | \"The identifier for the filtered group of proxies
Integer version = 56; // Integer | Checks for conflicts against the metadata version, then returns the value in the `x-cloud-resource-version` header.
try {
    ProxiesFilteredGroup result = apiInstance.updateProxiesFilteredGroup(body, proxiesFilteredGroupId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#updateProxiesFilteredGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProxiesFilteredGroup**](ProxiesFilteredGroup.md)| Data for the filtered group of proxies to update |
 **proxiesFilteredGroupId** | **String**| \&quot;The identifier for the filtered group of proxies |
 **version** | **Integer**| Checks for conflicts against the metadata version, then returns the value in the &#x60;x-cloud-resource-version&#x60; header. | [optional]

### Return type

[**ProxiesFilteredGroup**](ProxiesFilteredGroup.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="updateProxiesSettings"></a>
# **updateProxiesSettings**
> ProxiesSettings updateProxiesSettings(body, version)

Update proxy settings

Applies the settings as a patch. Only the fields that are referenced in the update are changed.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformInfrastructureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PlatformInfrastructureApi apiInstance = new PlatformInfrastructureApi();
String body = "body_example"; // String | A JSON to merge with the existing settings
Integer version = 56; // Integer | If specified, checks for conflicts against the version of the repository configuration (returned in 'x-cloud-resource-version' of the GET request)
try {
    ProxiesSettings result = apiInstance.updateProxiesSettings(body, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformInfrastructureApi#updateProxiesSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| A JSON to merge with the existing settings |
 **version** | **Integer**| If specified, checks for conflicts against the version of the repository configuration (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) | [optional]

### Return type

[**ProxiesSettings**](ProxiesSettings.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

