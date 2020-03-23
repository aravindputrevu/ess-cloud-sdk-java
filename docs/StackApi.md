# StackApi

All URIs are relative to *https://{{hostname}}/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteVersionStack**](StackApi.md#deleteVersionStack) | **DELETE** /stack/versions/{version} | Delete stack version
[**getInstanceTypes**](StackApi.md#getInstanceTypes) | **GET** /stack/instance-types | Get instance types
[**getVersionStack**](StackApi.md#getVersionStack) | **GET** /stack/versions/{version} | Get stack version
[**getVersionStacks**](StackApi.md#getVersionStacks) | **GET** /stack/versions | Get stack versions
[**updateStackPacks**](StackApi.md#updateStackPacks) | **POST** /stack/versions | Upload stack pack
[**updateVersionStack**](StackApi.md#updateVersionStack) | **PUT** /stack/versions/{version} | Update stack version

<a name="deleteVersionStack"></a>
# **deleteVersionStack**
> EmptyResponse deleteVersionStack(version)

Delete stack version

Uses the &#x60;deleted&#x60; flag, which removes only that version of the Elastic Stack from the list of available versions. To restore the version, send an update request. For more information, see the PUT request.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StackApi;

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

StackApi apiInstance = new StackApi();
String version = "version_example"; // String | The Elastic Stack version. For example, `5.3.1` or `5.0.0-RC4`.
try {
    EmptyResponse result = apiInstance.deleteVersionStack(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StackApi#deleteVersionStack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| The Elastic Stack version. For example, &#x60;5.3.1&#x60; or &#x60;5.0.0-RC4&#x60;. |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInstanceTypes"></a>
# **getInstanceTypes**
> List&lt;InstanceTypeResource&gt; getInstanceTypes()

Get instance types

Retrieves a list of all instance types.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StackApi;

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

StackApi apiInstance = new StackApi();
try {
    List<InstanceTypeResource> result = apiInstance.getInstanceTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StackApi#getInstanceTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;InstanceTypeResource&gt;**](InstanceTypeResource.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getVersionStack"></a>
# **getVersionStack**
> StackVersionConfig getVersionStack(version)

Get stack version

Retrieves the Elastic Stack version and template.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StackApi;

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

StackApi apiInstance = new StackApi();
String version = "version_example"; // String | The Elastic Stack version. For example, `5.3.1` or `5.0.0-RC4`.
try {
    StackVersionConfig result = apiInstance.getVersionStack(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StackApi#getVersionStack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| The Elastic Stack version. For example, &#x60;5.3.1&#x60; or &#x60;5.0.0-RC4&#x60;. |

### Return type

[**StackVersionConfig**](StackVersionConfig.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getVersionStacks"></a>
# **getVersionStacks**
> StackVersionConfigs getVersionStacks(showDeleted, showUnusable)

Get stack versions

By default, retrieves only the available Elastic Stack versions. To retrieve all of the Elastic Stack versions, use the &#x60;show_deleted parameter&#x60;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StackApi;

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

StackApi apiInstance = new StackApi();
Boolean showDeleted = true; // Boolean | Whether to show deleted stack versions or not
Boolean showUnusable = true; // Boolean | Whether to show versions that are unusable by the authenticated user
try {
    StackVersionConfigs result = apiInstance.getVersionStacks(showDeleted, showUnusable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StackApi#getVersionStacks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **showDeleted** | **Boolean**| Whether to show deleted stack versions or not | [optional]
 **showUnusable** | **Boolean**| Whether to show versions that are unusable by the authenticated user | [optional]

### Return type

[**StackVersionConfigs**](StackVersionConfigs.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateStackPacks"></a>
# **updateStackPacks**
> StackVersionArchiveProcessingResult updateStackPacks(file)

Upload stack pack

Creates or updates an Elastic Stack pack and template. The endpoint supports &#x60;multipart/form-data&#x60; requests, as well as &#x60;application/zip&#x60; and &#x60;application/octet-stream&#x60; requests with a binary body. The maximum size of the payload is 1Mb. When the archive contains an Elastic Stack configuration that is available through the API, the configuration and template are overwritten.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StackApi;

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

StackApi apiInstance = new StackApi();
File file = new File("file_example"); // File | 
try {
    StackVersionArchiveProcessingResult result = apiInstance.updateStackPacks(file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StackApi#updateStackPacks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**|  |

### Return type

[**StackVersionArchiveProcessingResult**](StackVersionArchiveProcessingResult.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

<a name="updateVersionStack"></a>
# **updateVersionStack**
> StackVersionConfig updateVersionStack(body, version)

Update stack version

Updates the Elastic Stack version configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StackApi;

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

StackApi apiInstance = new StackApi();
StackVersionConfigPost body = new StackVersionConfigPost(); // StackVersionConfigPost | Elastic Stack configuration object
String version = "version_example"; // String | The Elastic Stack version. For example, `5.3.1` or `5.0.0-RC4`.
try {
    StackVersionConfig result = apiInstance.updateVersionStack(body, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StackApi#updateVersionStack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StackVersionConfigPost**](StackVersionConfigPost.md)| Elastic Stack configuration object |
 **version** | **String**| The Elastic Stack version. For example, &#x60;5.3.1&#x60; or &#x60;5.0.0-RC4&#x60;. |

### Return type

[**StackVersionConfig**](StackVersionConfig.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

