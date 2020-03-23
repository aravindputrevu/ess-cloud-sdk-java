# PlatformConfigurationSnapshotsApi

All URIs are relative to *https://{{hostname}}/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteSnapshotRepository**](PlatformConfigurationSnapshotsApi.md#deleteSnapshotRepository) | **DELETE** /platform/configuration/snapshots/repositories/{repository_name} | Delete snapshot repository
[**getSnapshotRepositories**](PlatformConfigurationSnapshotsApi.md#getSnapshotRepositories) | **GET** /platform/configuration/snapshots/repositories | Get snapshot repositories
[**getSnapshotRepository**](PlatformConfigurationSnapshotsApi.md#getSnapshotRepository) | **GET** /platform/configuration/snapshots/repositories/{repository_name} | Get snapshot repository
[**setSnapshotRepository**](PlatformConfigurationSnapshotsApi.md#setSnapshotRepository) | **PUT** /platform/configuration/snapshots/repositories/{repository_name} | Set snapshot repository

<a name="deleteSnapshotRepository"></a>
# **deleteSnapshotRepository**
> EmptyResponse deleteSnapshotRepository(repositoryName)

Delete snapshot repository

Deletes the snapshot repository configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationSnapshotsApi;

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

PlatformConfigurationSnapshotsApi apiInstance = new PlatformConfigurationSnapshotsApi();
String repositoryName = "repositoryName_example"; // String | The name of the snapshot repository configuration.
try {
    EmptyResponse result = apiInstance.deleteSnapshotRepository(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationSnapshotsApi#deleteSnapshotRepository");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| The name of the snapshot repository configuration. |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSnapshotRepositories"></a>
# **getSnapshotRepositories**
> RepositoryConfigs getSnapshotRepositories()

Get snapshot repositories

Retrieves a list of available snapshot repository configurations. To access the configuration contents, you must have privileged permissions.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationSnapshotsApi;

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

PlatformConfigurationSnapshotsApi apiInstance = new PlatformConfigurationSnapshotsApi();
try {
    RepositoryConfigs result = apiInstance.getSnapshotRepositories();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationSnapshotsApi#getSnapshotRepositories");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RepositoryConfigs**](RepositoryConfigs.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSnapshotRepository"></a>
# **getSnapshotRepository**
> RepositoryConfig getSnapshotRepository(repositoryName)

Get snapshot repository

Retrieves the snapshot repository configuration. To access the configuration contents, you must have privileged permissions.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationSnapshotsApi;

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

PlatformConfigurationSnapshotsApi apiInstance = new PlatformConfigurationSnapshotsApi();
String repositoryName = "repositoryName_example"; // String | The name of the snapshot repository configuration.
try {
    RepositoryConfig result = apiInstance.getSnapshotRepository(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationSnapshotsApi#getSnapshotRepository");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| The name of the snapshot repository configuration. |

### Return type

[**RepositoryConfig**](RepositoryConfig.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="setSnapshotRepository"></a>
# **setSnapshotRepository**
> RepositoryConfig setSnapshotRepository(body, repositoryName, version)

Set snapshot repository

Creates or updates the snapshot repository configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationSnapshotsApi;

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

PlatformConfigurationSnapshotsApi apiInstance = new PlatformConfigurationSnapshotsApi();
SnapshotRepositoryConfiguration body = new SnapshotRepositoryConfiguration(); // SnapshotRepositoryConfiguration | The Elasticsearch snapshot repository configuration
String repositoryName = "repositoryName_example"; // String | The name of the snapshot repository configuration.
Integer version = 56; // Integer | Checks for conflicts against the metadata version, then returns the value in the `x-cloud-resource-version` header.
try {
    RepositoryConfig result = apiInstance.setSnapshotRepository(body, repositoryName, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationSnapshotsApi#setSnapshotRepository");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SnapshotRepositoryConfiguration**](SnapshotRepositoryConfiguration.md)| The Elasticsearch snapshot repository configuration |
 **repositoryName** | **String**| The name of the snapshot repository configuration. |
 **version** | **Integer**| Checks for conflicts against the metadata version, then returns the value in the &#x60;x-cloud-resource-version&#x60; header. | [optional]

### Return type

[**RepositoryConfig**](RepositoryConfig.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

