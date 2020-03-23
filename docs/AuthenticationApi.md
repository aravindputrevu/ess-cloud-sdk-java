# AuthenticationApi

All URIs are relative to *https://{{hostname}}/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createApiKey**](AuthenticationApi.md#createApiKey) | **POST** /users/auth/keys | Create API key
[**deleteApiKey**](AuthenticationApi.md#deleteApiKey) | **DELETE** /users/auth/keys/{api_key_id} | Delete API key
[**deleteApiKeys**](AuthenticationApi.md#deleteApiKeys) | **DELETE** /users/auth/keys | Delete API keys
[**deleteUserApiKey**](AuthenticationApi.md#deleteUserApiKey) | **DELETE** /users/{user_id}/auth/keys/{api_key_id} | Delete an API key for a user
[**deleteUserApiKeys**](AuthenticationApi.md#deleteUserApiKeys) | **DELETE** /users/{user_id}/auth/keys | Delete API keys for a user
[**deleteUsersApiKeys**](AuthenticationApi.md#deleteUsersApiKeys) | **DELETE** /users/auth/keys/_all | Delete API keys of multiple users
[**disableElevatedPermissions**](AuthenticationApi.md#disableElevatedPermissions) | **DELETE** /users/auth/_elevate | Disable elevated permissions
[**enableElevatedPermissions**](AuthenticationApi.md#enableElevatedPermissions) | **POST** /users/auth/_elevate | Enable elevated permissions
[**getApiKey**](AuthenticationApi.md#getApiKey) | **GET** /users/auth/keys/{api_key_id} | Get API key
[**getApiKeys**](AuthenticationApi.md#getApiKeys) | **GET** /users/auth/keys | Get all API keys
[**getAuthenticationInfo**](AuthenticationApi.md#getAuthenticationInfo) | **GET** /users/auth | User authentication information
[**getUserApiKey**](AuthenticationApi.md#getUserApiKey) | **GET** /users/{user_id}/auth/keys/{api_key_id} | Get a user API key
[**getUserApiKeys**](AuthenticationApi.md#getUserApiKeys) | **GET** /users/{user_id}/auth/keys | Get all API keys for a user
[**getUsersApiKeys**](AuthenticationApi.md#getUsersApiKeys) | **GET** /users/auth/keys/_all | Get all API keys for all users
[**login**](AuthenticationApi.md#login) | **POST** /users/auth/_login | Login to ECE
[**methods**](AuthenticationApi.md#methods) | **GET** /users/auth/methods | Available authentication methods
[**reAuthenticate**](AuthenticationApi.md#reAuthenticate) | **POST** /users/auth/reauthenticate | Re-authenticate to generate a token
[**refreshToken**](AuthenticationApi.md#refreshToken) | **POST** /users/auth/_refresh | Refresh authentication token
[**samlCallback**](AuthenticationApi.md#samlCallback) | **POST** /users/auth/saml/_callback | SAML callback
[**samlInit**](AuthenticationApi.md#samlInit) | **GET** /users/auth/saml/_init | Initiate SAML protocol

<a name="createApiKey"></a>
# **createApiKey**
> ApiKeyResponse createApiKey(body)

Create API key

Creates a new API key.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

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

AuthenticationApi apiInstance = new AuthenticationApi();
CreateApiKeyRequest body = new CreateApiKeyRequest(); // CreateApiKeyRequest | The request to create the API key
try {
    ApiKeyResponse result = apiInstance.createApiKey(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#createApiKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateApiKeyRequest**](CreateApiKeyRequest.md)| The request to create the API key |

### Return type

[**ApiKeyResponse**](ApiKeyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="deleteApiKey"></a>
# **deleteApiKey**
> EmptyResponse deleteApiKey(apiKeyId)

Delete API key

Delete or invalidate the API key.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

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

AuthenticationApi apiInstance = new AuthenticationApi();
String apiKeyId = "apiKeyId_example"; // String | The API Key ID.
try {
    EmptyResponse result = apiInstance.deleteApiKey(apiKeyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#deleteApiKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyId** | **String**| The API Key ID. |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteApiKeys"></a>
# **deleteApiKeys**
> EmptyResponse deleteApiKeys(body)

Delete API keys

Delete or invalidate API keys.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

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

AuthenticationApi apiInstance = new AuthenticationApi();
DeleteApiKeysRequest body = new DeleteApiKeysRequest(); // DeleteApiKeysRequest | The request to delete API keys
try {
    EmptyResponse result = apiInstance.deleteApiKeys(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#deleteApiKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteApiKeysRequest**](DeleteApiKeysRequest.md)| The request to delete API keys |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="deleteUserApiKey"></a>
# **deleteUserApiKey**
> EmptyResponse deleteUserApiKey(userId, apiKeyId)

Delete an API key for a user

Delete or invalidate an API key for a user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

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

AuthenticationApi apiInstance = new AuthenticationApi();
String userId = "userId_example"; // String | The user ID.
String apiKeyId = "apiKeyId_example"; // String | The API Key ID.
try {
    EmptyResponse result = apiInstance.deleteUserApiKey(userId, apiKeyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#deleteUserApiKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The user ID. |
 **apiKeyId** | **String**| The API Key ID. |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteUserApiKeys"></a>
# **deleteUserApiKeys**
> EmptyResponse deleteUserApiKeys(userId)

Delete API keys for a user

Delete or invalidate all of the API keys for a user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

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

AuthenticationApi apiInstance = new AuthenticationApi();
String userId = "userId_example"; // String | The user ID.
try {
    EmptyResponse result = apiInstance.deleteUserApiKeys(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#deleteUserApiKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The user ID. |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteUsersApiKeys"></a>
# **deleteUsersApiKeys**
> EmptyResponse deleteUsersApiKeys(body)

Delete API keys of multiple users

Delete or invalidate the API keys for multiple users.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

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

AuthenticationApi apiInstance = new AuthenticationApi();
DeleteUsersApiKeysRequest body = new DeleteUsersApiKeysRequest(); // DeleteUsersApiKeysRequest | The request to delete API keys.
try {
    EmptyResponse result = apiInstance.deleteUsersApiKeys(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#deleteUsersApiKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteUsersApiKeysRequest**](DeleteUsersApiKeysRequest.md)| The request to delete API keys. |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="disableElevatedPermissions"></a>
# **disableElevatedPermissions**
> TokenResponse disableElevatedPermissions()

Disable elevated permissions

Disables elevated permissions for the user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

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

AuthenticationApi apiInstance = new AuthenticationApi();
try {
    TokenResponse result = apiInstance.disableElevatedPermissions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#disableElevatedPermissions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="enableElevatedPermissions"></a>
# **enableElevatedPermissions**
> TokenResponse enableElevatedPermissions(body)

Enable elevated permissions

Enables the elevated permissions for the current user. Elevated permissions allow the user to complete potentially destructive operations on clusters. Elevated permissions are available for a limited period of time and automatically expire if you do not renew them.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

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

AuthenticationApi apiInstance = new AuthenticationApi();
ElevatePermissionsRequest body = new ElevatePermissionsRequest(); // ElevatePermissionsRequest | The request for elevated permissions
try {
    TokenResponse result = apiInstance.enableElevatedPermissions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#enableElevatedPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ElevatePermissionsRequest**](ElevatePermissionsRequest.md)| The request for elevated permissions | [optional]

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="getApiKey"></a>
# **getApiKey**
> ApiKeyResponse getApiKey(apiKeyId)

Get API key

Retrieves the metadata for an API key.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

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

AuthenticationApi apiInstance = new AuthenticationApi();
String apiKeyId = "apiKeyId_example"; // String | The API Key ID.
try {
    ApiKeyResponse result = apiInstance.getApiKey(apiKeyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#getApiKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyId** | **String**| The API Key ID. |

### Return type

[**ApiKeyResponse**](ApiKeyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getApiKeys"></a>
# **getApiKeys**
> ApiKeysResponse getApiKeys()

Get all API keys

Retrieves the metadata for all of the API keys that the user generated.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

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

AuthenticationApi apiInstance = new AuthenticationApi();
try {
    ApiKeysResponse result = apiInstance.getApiKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#getApiKeys");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiKeysResponse**](ApiKeysResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAuthenticationInfo"></a>
# **getAuthenticationInfo**
> AuthenticationInfo getAuthenticationInfo()

User authentication information

Provides authentication information about a user, including elevated permission status and TOTP device availability.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

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

AuthenticationApi apiInstance = new AuthenticationApi();
try {
    AuthenticationInfo result = apiInstance.getAuthenticationInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#getAuthenticationInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuthenticationInfo**](AuthenticationInfo.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUserApiKey"></a>
# **getUserApiKey**
> ApiKeyResponse getUserApiKey(userId, apiKeyId)

Get a user API key

Retrieves the API key metadata for a user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

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

AuthenticationApi apiInstance = new AuthenticationApi();
String userId = "userId_example"; // String | The user ID.
String apiKeyId = "apiKeyId_example"; // String | The API Key ID.
try {
    ApiKeyResponse result = apiInstance.getUserApiKey(userId, apiKeyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#getUserApiKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The user ID. |
 **apiKeyId** | **String**| The API Key ID. |

### Return type

[**ApiKeyResponse**](ApiKeyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUserApiKeys"></a>
# **getUserApiKeys**
> ApiKeysResponse getUserApiKeys(userId)

Get all API keys for a user

Retrieves all of the API key metadata for a user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

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

AuthenticationApi apiInstance = new AuthenticationApi();
String userId = "userId_example"; // String | The user ID.
try {
    ApiKeysResponse result = apiInstance.getUserApiKeys(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#getUserApiKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The user ID. |

### Return type

[**ApiKeysResponse**](ApiKeysResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUsersApiKeys"></a>
# **getUsersApiKeys**
> ApiKeysResponse getUsersApiKeys()

Get all API keys for all users

Retrieves the metadata for all of the API keys for all users.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

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

AuthenticationApi apiInstance = new AuthenticationApi();
try {
    ApiKeysResponse result = apiInstance.getUsersApiKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#getUsersApiKeys");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiKeysResponse**](ApiKeysResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="login"></a>
# **login**
> TokenResponse login(body)

Login to ECE

Authenticates against available users.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

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

AuthenticationApi apiInstance = new AuthenticationApi();
LoginRequest body = new LoginRequest(); // LoginRequest | The login request
try {
    TokenResponse result = apiInstance.login(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#login");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoginRequest**](LoginRequest.md)| The login request |

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="methods"></a>
# **methods**
> AvailableAuthenticationMethods methods()

Available authentication methods

Provides information about available authentication methods.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

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

AuthenticationApi apiInstance = new AuthenticationApi();
try {
    AvailableAuthenticationMethods result = apiInstance.methods();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#methods");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AvailableAuthenticationMethods**](AvailableAuthenticationMethods.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="reAuthenticate"></a>
# **reAuthenticate**
> ReAuthenticationResponse reAuthenticate(body)

Re-authenticate to generate a token

Re-authenticate.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

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

AuthenticationApi apiInstance = new AuthenticationApi();
ReAuthenticationRequest body = new ReAuthenticationRequest(); // ReAuthenticationRequest | The request to reauthenticate
try {
    ReAuthenticationResponse result = apiInstance.reAuthenticate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#reAuthenticate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReAuthenticationRequest**](ReAuthenticationRequest.md)| The request to reauthenticate |

### Return type

[**ReAuthenticationResponse**](ReAuthenticationResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="refreshToken"></a>
# **refreshToken**
> TokenResponse refreshToken()

Refresh authentication token

Issues a new authentication token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

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

AuthenticationApi apiInstance = new AuthenticationApi();
try {
    TokenResponse result = apiInstance.refreshToken();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#refreshToken");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="samlCallback"></a>
# **samlCallback**
> samlCallback(saMLResponse, relayState)

SAML callback

Accepts a callback request from an identity provider and authenticates the user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

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

AuthenticationApi apiInstance = new AuthenticationApi();
String saMLResponse = "saMLResponse_example"; // String | 
String relayState = "relayState_example"; // String | 
try {
    apiInstance.samlCallback(saMLResponse, relayState);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#samlCallback");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **saMLResponse** | **String**|  |
 **relayState** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

<a name="samlInit"></a>
# **samlInit**
> samlInit(state)

Initiate SAML protocol

Calls the authentication cluster to initiate SAML Single Sign-on (Web Browser SSO profile) protocol and redirects the user to the identity provider for authentication. The authentication cluster must be configured prior to initiation.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

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

AuthenticationApi apiInstance = new AuthenticationApi();
String state = "state_example"; // String | An optional relay state that is sent back to the client after the user is authenticated
try {
    apiInstance.samlInit(state);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#samlInit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **String**| An optional relay state that is sent back to the client after the user is authenticated | [optional]

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

