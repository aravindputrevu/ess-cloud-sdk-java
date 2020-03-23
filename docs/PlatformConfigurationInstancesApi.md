# PlatformConfigurationInstancesApi

All URIs are relative to *https://{{hostname}}/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInstanceConfiguration**](PlatformConfigurationInstancesApi.md#createInstanceConfiguration) | **POST** /platform/configuration/instances | Create instance configuration
[**deleteInstanceConfiguration**](PlatformConfigurationInstancesApi.md#deleteInstanceConfiguration) | **DELETE** /platform/configuration/instances/{id} | Delete a instance configuration
[**getInstanceConfiguration**](PlatformConfigurationInstancesApi.md#getInstanceConfiguration) | **GET** /platform/configuration/instances/{id} | Get instance configuration
[**getInstanceConfigurations**](PlatformConfigurationInstancesApi.md#getInstanceConfigurations) | **GET** /platform/configuration/instances | Get instance configurations
[**setInstanceConfiguration**](PlatformConfigurationInstancesApi.md#setInstanceConfiguration) | **PUT** /platform/configuration/instances/{id} | Set instance configuration

<a name="createInstanceConfiguration"></a>
# **createInstanceConfiguration**
> IdResponse createInstanceConfiguration(body)

Create instance configuration

Create instance configuration and return the auto-generated ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationInstancesApi;

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

PlatformConfigurationInstancesApi apiInstance = new PlatformConfigurationInstancesApi();
InstanceConfiguration body = new InstanceConfiguration(); // InstanceConfiguration | the Instance Configuration
try {
    IdResponse result = apiInstance.createInstanceConfiguration(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationInstancesApi#createInstanceConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InstanceConfiguration**](InstanceConfiguration.md)| the Instance Configuration |

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="deleteInstanceConfiguration"></a>
# **deleteInstanceConfiguration**
> EmptyResponse deleteInstanceConfiguration(id, version)

Delete a instance configuration

Delete the instance configuration with the given id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationInstancesApi;

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

PlatformConfigurationInstancesApi apiInstance = new PlatformConfigurationInstancesApi();
String id = "id_example"; // String | ID of the instance configuration
Integer version = 56; // Integer | If specified, checks for conflicts against the version of the repository configuration (returned in 'x-cloud-resource-version' of the GET request)
try {
    EmptyResponse result = apiInstance.deleteInstanceConfiguration(id, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationInstancesApi#deleteInstanceConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the instance configuration |
 **version** | **Integer**| If specified, checks for conflicts against the version of the repository configuration (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) | [optional]

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInstanceConfiguration"></a>
# **getInstanceConfiguration**
> InstanceConfiguration getInstanceConfiguration(id, showDeleted)

Get instance configuration

Get instance configuration by id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationInstancesApi;

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

PlatformConfigurationInstancesApi apiInstance = new PlatformConfigurationInstancesApi();
String id = "id_example"; // String | ID of the instance configuration
Boolean showDeleted = true; // Boolean | If true, if the instance configuration has been marked for deletion it is still returned. Otherwise, instance configurations marked for deletion generate a 404
try {
    InstanceConfiguration result = apiInstance.getInstanceConfiguration(id, showDeleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationInstancesApi#getInstanceConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the instance configuration |
 **showDeleted** | **Boolean**| If true, if the instance configuration has been marked for deletion it is still returned. Otherwise, instance configurations marked for deletion generate a 404 | [optional]

### Return type

[**InstanceConfiguration**](InstanceConfiguration.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInstanceConfigurations"></a>
# **getInstanceConfigurations**
> List&lt;InstanceConfiguration&gt; getInstanceConfigurations(showDeleted)

Get instance configurations

Get instance configurations.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationInstancesApi;

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

PlatformConfigurationInstancesApi apiInstance = new PlatformConfigurationInstancesApi();
Boolean showDeleted = true; // Boolean | If true, instance configurations marked for deletions are also returned. Otherwise, only instance configurations not marked for deletion are returned
try {
    List<InstanceConfiguration> result = apiInstance.getInstanceConfigurations(showDeleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationInstancesApi#getInstanceConfigurations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **showDeleted** | **Boolean**| If true, instance configurations marked for deletions are also returned. Otherwise, only instance configurations not marked for deletion are returned | [optional]

### Return type

[**List&lt;InstanceConfiguration&gt;**](InstanceConfiguration.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="setInstanceConfiguration"></a>
# **setInstanceConfiguration**
> IdResponse setInstanceConfiguration(body, id, version, createOnly)

Set instance configuration

Creates or updates an instance configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationInstancesApi;

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

PlatformConfigurationInstancesApi apiInstance = new PlatformConfigurationInstancesApi();
InstanceConfiguration body = new InstanceConfiguration(); // InstanceConfiguration | the Instance Configuration
String id = "id_example"; // String | ID of the instance configuration
Integer version = 56; // Integer | If specified, checks for conflicts against the version of the repository configuration (returned in 'x-cloud-resource-version' of the GET request)
Boolean createOnly = true; // Boolean | If true, will fail if an instance configuration already exists at the given id
try {
    IdResponse result = apiInstance.setInstanceConfiguration(body, id, version, createOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationInstancesApi#setInstanceConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InstanceConfiguration**](InstanceConfiguration.md)| the Instance Configuration |
 **id** | **String**| ID of the instance configuration |
 **version** | **Integer**| If specified, checks for conflicts against the version of the repository configuration (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) | [optional]
 **createOnly** | **Boolean**| If true, will fail if an instance configuration already exists at the given id | [optional]

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

