# CommentsApi

All URIs are relative to *https://{{hostname}}/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createComment**](CommentsApi.md#createComment) | **POST** /comments/{resource_type}/{resource_id} | Create a Comment
[**deleteComment**](CommentsApi.md#deleteComment) | **DELETE** /comments/{resource_type}/{resource_id}/{comment_id} | Delete Comment
[**getComment**](CommentsApi.md#getComment) | **GET** /comments/{resource_type}/{resource_id}/{comment_id} | Get Comment
[**listComment**](CommentsApi.md#listComment) | **GET** /comments/{resource_type}/{resource_id} | List Comments
[**updateComment**](CommentsApi.md#updateComment) | **PUT** /comments/{resource_type}/{resource_id}/{comment_id} | Update Comment

<a name="createComment"></a>
# **createComment**
> Comment createComment(body, resourceType, resourceId)

Create a Comment

Creates a comment for the given Resource.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CommentsApi;

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

CommentsApi apiInstance = new CommentsApi();
CommentCreateRequest body = new CommentCreateRequest(); // CommentCreateRequest | Data for comment creation
String resourceType = "resourceType_example"; // String | The kind of Resource that a Comment belongs to. Should be one of [elasticsearch, kibana, apm, appsearch, enterprisesearch, sitesearch, allocator, constructor, runner, proxy].
String resourceId = "resourceId_example"; // String | Id of the Resource that a Comment belongs to.
try {
    Comment result = apiInstance.createComment(body, resourceType, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#createComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CommentCreateRequest**](CommentCreateRequest.md)| Data for comment creation |
 **resourceType** | **String**| The kind of Resource that a Comment belongs to. Should be one of [elasticsearch, kibana, apm, appsearch, enterprisesearch, sitesearch, allocator, constructor, runner, proxy]. |
 **resourceId** | **String**| Id of the Resource that a Comment belongs to. |

### Return type

[**Comment**](Comment.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="deleteComment"></a>
# **deleteComment**
> EmptyResponse deleteComment(resourceType, resourceId, commentId, version)

Delete Comment

Deletes a Comment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CommentsApi;

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

CommentsApi apiInstance = new CommentsApi();
String resourceType = "resourceType_example"; // String | The kind of Resource that a Comment belongs to. Should be one of [elasticsearch, kibana, apm, appsearch, enterprisesearch, sitesearch, allocator, constructor, runner, proxy].
String resourceId = "resourceId_example"; // String | Id of the Resource that a Comment belongs to.
String commentId = "commentId_example"; // String | Id of a Comment
Integer version = 56; // Integer | If specified then checks for conflicts against the version stored in the persistent store (returned in 'x-cloud-resource-version' of the GET request)
try {
    EmptyResponse result = apiInstance.deleteComment(resourceType, resourceId, commentId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#deleteComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceType** | **String**| The kind of Resource that a Comment belongs to. Should be one of [elasticsearch, kibana, apm, appsearch, enterprisesearch, sitesearch, allocator, constructor, runner, proxy]. |
 **resourceId** | **String**| Id of the Resource that a Comment belongs to. |
 **commentId** | **String**| Id of a Comment |
 **version** | **Integer**| If specified then checks for conflicts against the version stored in the persistent store (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) | [optional]

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getComment"></a>
# **getComment**
> Comment getComment(resourceType, resourceId, commentId)

Get Comment

Retrieves a Comment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CommentsApi;

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

CommentsApi apiInstance = new CommentsApi();
String resourceType = "resourceType_example"; // String | The kind of Resource that a Comment belongs to. Should be one of [elasticsearch, kibana, apm, appsearch, enterprisesearch, sitesearch, allocator, constructor, runner, proxy].
String resourceId = "resourceId_example"; // String | Id of the Resource that a Comment belongs to.
String commentId = "commentId_example"; // String | Id of a Comment
try {
    Comment result = apiInstance.getComment(resourceType, resourceId, commentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#getComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceType** | **String**| The kind of Resource that a Comment belongs to. Should be one of [elasticsearch, kibana, apm, appsearch, enterprisesearch, sitesearch, allocator, constructor, runner, proxy]. |
 **resourceId** | **String**| Id of the Resource that a Comment belongs to. |
 **commentId** | **String**| Id of a Comment |

### Return type

[**Comment**](Comment.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="listComment"></a>
# **listComment**
> CommentsWithMetas listComment(resourceType, resourceId)

List Comments

Retrieves all the comments for a given Resource, in reverse modified time order.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CommentsApi;

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

CommentsApi apiInstance = new CommentsApi();
String resourceType = "resourceType_example"; // String | The kind of Resource that a Comment belongs to. Should be one of [elasticsearch, kibana, apm, appsearch, enterprisesearch, sitesearch, allocator, constructor, runner, proxy].
String resourceId = "resourceId_example"; // String | Id of the Resource that a Comment belongs to.
try {
    CommentsWithMetas result = apiInstance.listComment(resourceType, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#listComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceType** | **String**| The kind of Resource that a Comment belongs to. Should be one of [elasticsearch, kibana, apm, appsearch, enterprisesearch, sitesearch, allocator, constructor, runner, proxy]. |
 **resourceId** | **String**| Id of the Resource that a Comment belongs to. |

### Return type

[**CommentsWithMetas**](CommentsWithMetas.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateComment"></a>
# **updateComment**
> Comment updateComment(body, resourceType, resourceId, commentId, version)

Update Comment

Updates a Comment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CommentsApi;

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

CommentsApi apiInstance = new CommentsApi();
CommentUpdateRequest body = new CommentUpdateRequest(); // CommentUpdateRequest | The Comment update data.
String resourceType = "resourceType_example"; // String | The kind of Resource that a Comment belongs to. Should be one of [elasticsearch, kibana, apm, appsearch, enterprisesearch, sitesearch, allocator, constructor, runner, proxy].
String resourceId = "resourceId_example"; // String | Id of the Resource that a Comment belongs to.
String commentId = "commentId_example"; // String | Id of a Comment
Integer version = 56; // Integer | If specified then checks for conflicts against the version stored in the persistent store (returned in 'x-cloud-resource-version' of the GET request)
try {
    Comment result = apiInstance.updateComment(body, resourceType, resourceId, commentId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#updateComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CommentUpdateRequest**](CommentUpdateRequest.md)| The Comment update data. |
 **resourceType** | **String**| The kind of Resource that a Comment belongs to. Should be one of [elasticsearch, kibana, apm, appsearch, enterprisesearch, sitesearch, allocator, constructor, runner, proxy]. |
 **resourceId** | **String**| Id of the Resource that a Comment belongs to. |
 **commentId** | **String**| Id of a Comment |
 **version** | **Integer**| If specified then checks for conflicts against the version stored in the persistent store (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) | [optional]

### Return type

[**Comment**](Comment.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

