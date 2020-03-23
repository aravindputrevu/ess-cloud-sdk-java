# PlatformConfigurationTemplatesApi

All URIs are relative to *https://{{hostname}}/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDeploymentTemplate**](PlatformConfigurationTemplatesApi.md#createDeploymentTemplate) | **POST** /platform/configuration/templates/deployments | Create deployment template
[**deleteDeploymentTemplate**](PlatformConfigurationTemplatesApi.md#deleteDeploymentTemplate) | **DELETE** /platform/configuration/templates/deployments/{template_id} | Delete deployment template
[**getDeploymentTemplate**](PlatformConfigurationTemplatesApi.md#getDeploymentTemplate) | **GET** /platform/configuration/templates/deployments/{template_id} | Get deployment template
[**getDeploymentTemplates**](PlatformConfigurationTemplatesApi.md#getDeploymentTemplates) | **GET** /platform/configuration/templates/deployments | Get deployment templates
[**setDeploymentTemplate**](PlatformConfigurationTemplatesApi.md#setDeploymentTemplate) | **PUT** /platform/configuration/templates/deployments/{template_id} | Set deployment template

<a name="createDeploymentTemplate"></a>
# **createDeploymentTemplate**
> IdResponse createDeploymentTemplate(body)

Create deployment template

Creates a deployment template.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationTemplatesApi;

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

PlatformConfigurationTemplatesApi apiInstance = new PlatformConfigurationTemplatesApi();
DeploymentTemplateInfo body = new DeploymentTemplateInfo(); // DeploymentTemplateInfo | The deployment template definition.
try {
    IdResponse result = apiInstance.createDeploymentTemplate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationTemplatesApi#createDeploymentTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeploymentTemplateInfo**](DeploymentTemplateInfo.md)| The deployment template definition. |

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="deleteDeploymentTemplate"></a>
# **deleteDeploymentTemplate**
> EmptyResponse deleteDeploymentTemplate(templateId)

Delete deployment template

Deletes a deployment template by id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationTemplatesApi;

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

PlatformConfigurationTemplatesApi apiInstance = new PlatformConfigurationTemplatesApi();
String templateId = "templateId_example"; // String | The identifier for the deployment template.
try {
    EmptyResponse result = apiInstance.deleteDeploymentTemplate(templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationTemplatesApi#deleteDeploymentTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **String**| The identifier for the deployment template. |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDeploymentTemplate"></a>
# **getDeploymentTemplate**
> DeploymentTemplateInfo getDeploymentTemplate(templateId, showInstanceConfigurations, stackVersion)

Get deployment template

Retrieves a deployment template by id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationTemplatesApi;

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

PlatformConfigurationTemplatesApi apiInstance = new PlatformConfigurationTemplatesApi();
String templateId = "templateId_example"; // String | The identifier for the deployment template.
Boolean showInstanceConfigurations = true; // Boolean | If true, will return details for each instance configuration referenced by the template.
String stackVersion = "stackVersion_example"; // String | If present, it will cause the returned deployment template to be adapted to return only the elements allowed in that version.
try {
    DeploymentTemplateInfo result = apiInstance.getDeploymentTemplate(templateId, showInstanceConfigurations, stackVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationTemplatesApi#getDeploymentTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **String**| The identifier for the deployment template. |
 **showInstanceConfigurations** | **Boolean**| If true, will return details for each instance configuration referenced by the template. | [optional]
 **stackVersion** | **String**| If present, it will cause the returned deployment template to be adapted to return only the elements allowed in that version. | [optional]

### Return type

[**DeploymentTemplateInfo**](DeploymentTemplateInfo.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDeploymentTemplates"></a>
# **getDeploymentTemplates**
> List&lt;DeploymentTemplateInfo&gt; getDeploymentTemplates(metadata, showInstanceConfigurations, stackVersion, showHidden)

Get deployment templates

Retrieves all deployment templates.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationTemplatesApi;

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

PlatformConfigurationTemplatesApi apiInstance = new PlatformConfigurationTemplatesApi();
String metadata = "metadata_example"; // String | An optional key/value pair in the form of (key:value) that will act as a filter and exclude any templates that do not have a matching metadata item associated.
Boolean showInstanceConfigurations = true; // Boolean | If true, will return details for each instance configuration referenced by the template.
String stackVersion = "stackVersion_example"; // String | If present, it will cause the returned deployment templates to be adapted to return only the elements allowed in that version.
Boolean showHidden = true; // Boolean | If true, templates flagged as hidden will be returned.
try {
    List<DeploymentTemplateInfo> result = apiInstance.getDeploymentTemplates(metadata, showInstanceConfigurations, stackVersion, showHidden);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationTemplatesApi#getDeploymentTemplates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metadata** | **String**| An optional key/value pair in the form of (key:value) that will act as a filter and exclude any templates that do not have a matching metadata item associated. | [optional]
 **showInstanceConfigurations** | **Boolean**| If true, will return details for each instance configuration referenced by the template. | [optional]
 **stackVersion** | **String**| If present, it will cause the returned deployment templates to be adapted to return only the elements allowed in that version. | [optional]
 **showHidden** | **Boolean**| If true, templates flagged as hidden will be returned. | [optional]

### Return type

[**List&lt;DeploymentTemplateInfo&gt;**](DeploymentTemplateInfo.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="setDeploymentTemplate"></a>
# **setDeploymentTemplate**
> IdResponse setDeploymentTemplate(body, templateId, version, createOnly)

Set deployment template

Creates or updates a deployment template.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationTemplatesApi;

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

PlatformConfigurationTemplatesApi apiInstance = new PlatformConfigurationTemplatesApi();
DeploymentTemplateInfo body = new DeploymentTemplateInfo(); // DeploymentTemplateInfo | The deployment template definition.
String templateId = "templateId_example"; // String | The identifier for the deployment template.
Integer version = 56; // Integer | If specified, checks for conflicts against the version of the template (returned in 'x-cloud-resource-version' of the GET request)
Boolean createOnly = true; // Boolean | If true, will fail if the deployment template already exists at the given id
try {
    IdResponse result = apiInstance.setDeploymentTemplate(body, templateId, version, createOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationTemplatesApi#setDeploymentTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeploymentTemplateInfo**](DeploymentTemplateInfo.md)| The deployment template definition. |
 **templateId** | **String**| The identifier for the deployment template. |
 **version** | **Integer**| If specified, checks for conflicts against the version of the template (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) | [optional]
 **createOnly** | **Boolean**| If true, will fail if the deployment template already exists at the given id | [optional]

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

