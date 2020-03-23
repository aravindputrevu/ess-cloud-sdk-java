# PlatformConfigurationSecurityApi

All URIs are relative to *https://{{hostname}}/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createActiveDirectoryConfiguration**](PlatformConfigurationSecurityApi.md#createActiveDirectoryConfiguration) | **POST** /platform/configuration/security/realms/active-directory | Create Active Directory configuration
[**createEnrollmentToken**](PlatformConfigurationSecurityApi.md#createEnrollmentToken) | **POST** /platform/configuration/security/enrollment-tokens | Create enrollment token
[**createLdapConfiguration**](PlatformConfigurationSecurityApi.md#createLdapConfiguration) | **POST** /platform/configuration/security/realms/ldap | Create LDAP configuration
[**createSamlConfiguration**](PlatformConfigurationSecurityApi.md#createSamlConfiguration) | **POST** /platform/configuration/security/realms/saml | Create SAML configuration
[**createSecurityDeployment**](PlatformConfigurationSecurityApi.md#createSecurityDeployment) | **POST** /platform/configuration/security/deployment | Create security deployment
[**deleteActiveDirectoryConfiguration**](PlatformConfigurationSecurityApi.md#deleteActiveDirectoryConfiguration) | **DELETE** /platform/configuration/security/realms/active-directory/{realm_id} | Delete Active Directory configuration
[**deleteEnrollmentToken**](PlatformConfigurationSecurityApi.md#deleteEnrollmentToken) | **DELETE** /platform/configuration/security/enrollment-tokens/{token} | Delete enrollment token
[**deleteLdapConfiguration**](PlatformConfigurationSecurityApi.md#deleteLdapConfiguration) | **DELETE** /platform/configuration/security/realms/ldap/{realm_id} | Delete LDAP configuration
[**deleteSamlConfiguration**](PlatformConfigurationSecurityApi.md#deleteSamlConfiguration) | **DELETE** /platform/configuration/security/realms/saml/{realm_id} | Delete SAML configuration
[**disableSecurityDeployment**](PlatformConfigurationSecurityApi.md#disableSecurityDeployment) | **POST** /platform/configuration/security/deployment/_disable | Disables the security deployment
[**enableSecurityDeployment**](PlatformConfigurationSecurityApi.md#enableSecurityDeployment) | **POST** /platform/configuration/security/deployment/_enable | Enables the security deployment
[**getActiveDirectoryConfiguration**](PlatformConfigurationSecurityApi.md#getActiveDirectoryConfiguration) | **GET** /platform/configuration/security/realms/active-directory/{realm_id} | Get Active Directory configuration
[**getEnrollmentTokens**](PlatformConfigurationSecurityApi.md#getEnrollmentTokens) | **GET** /platform/configuration/security/enrollment-tokens | Get enrollment tokens
[**getLdapConfiguration**](PlatformConfigurationSecurityApi.md#getLdapConfiguration) | **GET** /platform/configuration/security/realms/ldap/{realm_id} | Get LDAP configuration
[**getSamlConfiguration**](PlatformConfigurationSecurityApi.md#getSamlConfiguration) | **GET** /platform/configuration/security/realms/saml/{realm_id} | Get SAML configuration
[**getSecurityDeployment**](PlatformConfigurationSecurityApi.md#getSecurityDeployment) | **GET** /platform/configuration/security/deployment | Get current security deployment
[**getSecurityRealmConfigurations**](PlatformConfigurationSecurityApi.md#getSecurityRealmConfigurations) | **GET** /platform/configuration/security/realms | List security realm configurations
[**getTlsCertificate**](PlatformConfigurationSecurityApi.md#getTlsCertificate) | **GET** /platform/configuration/security/tls/{service_name} | Get TLS certificate
[**reorderSecurityRealms**](PlatformConfigurationSecurityApi.md#reorderSecurityRealms) | **POST** /platform/configuration/security/realms/_reorder | Reorder security realms
[**setTlsCertificate**](PlatformConfigurationSecurityApi.md#setTlsCertificate) | **POST** /platform/configuration/security/tls/{service_name} | Set TLS certificate
[**updateActiveDirectoryConfiguration**](PlatformConfigurationSecurityApi.md#updateActiveDirectoryConfiguration) | **PUT** /platform/configuration/security/realms/active-directory/{realm_id} | Update Active Directory configuration
[**updateLdapConfiguration**](PlatformConfigurationSecurityApi.md#updateLdapConfiguration) | **PUT** /platform/configuration/security/realms/ldap/{realm_id} | Update LDAP configuration
[**updateSamlConfiguration**](PlatformConfigurationSecurityApi.md#updateSamlConfiguration) | **PUT** /platform/configuration/security/realms/saml/{realm_id} | Update SAML configuration

<a name="createActiveDirectoryConfiguration"></a>
# **createActiveDirectoryConfiguration**
> EmptyResponse createActiveDirectoryConfiguration(body)

Create Active Directory configuration

Creates a new Active Directory configuration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationSecurityApi;

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

PlatformConfigurationSecurityApi apiInstance = new PlatformConfigurationSecurityApi();
ActiveDirectorySettings body = new ActiveDirectorySettings(); // ActiveDirectorySettings | The Active Directory configuration
try {
    EmptyResponse result = apiInstance.createActiveDirectoryConfiguration(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationSecurityApi#createActiveDirectoryConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ActiveDirectorySettings**](ActiveDirectorySettings.md)| The Active Directory configuration |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="createEnrollmentToken"></a>
# **createEnrollmentToken**
> RequestEnrollmentTokenReply createEnrollmentToken(body)

Create enrollment token

Creates an enrollment token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationSecurityApi;

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

PlatformConfigurationSecurityApi apiInstance = new PlatformConfigurationSecurityApi();
EnrollmentTokenRequest body = new EnrollmentTokenRequest(); // EnrollmentTokenRequest | Request parameters for the enrollment token
try {
    RequestEnrollmentTokenReply result = apiInstance.createEnrollmentToken(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationSecurityApi#createEnrollmentToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EnrollmentTokenRequest**](EnrollmentTokenRequest.md)| Request parameters for the enrollment token |

### Return type

[**RequestEnrollmentTokenReply**](RequestEnrollmentTokenReply.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="createLdapConfiguration"></a>
# **createLdapConfiguration**
> EmptyResponse createLdapConfiguration(body)

Create LDAP configuration

Creates a new LDAP configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationSecurityApi;

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

PlatformConfigurationSecurityApi apiInstance = new PlatformConfigurationSecurityApi();
LdapSettings body = new LdapSettings(); // LdapSettings | The LDAP configuration
try {
    EmptyResponse result = apiInstance.createLdapConfiguration(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationSecurityApi#createLdapConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LdapSettings**](LdapSettings.md)| The LDAP configuration |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="createSamlConfiguration"></a>
# **createSamlConfiguration**
> EmptyResponse createSamlConfiguration(body)

Create SAML configuration

Creates a new SAML configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationSecurityApi;

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

PlatformConfigurationSecurityApi apiInstance = new PlatformConfigurationSecurityApi();
SamlSettings body = new SamlSettings(); // SamlSettings | The SAML configuration
try {
    EmptyResponse result = apiInstance.createSamlConfiguration(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationSecurityApi#createSamlConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SamlSettings**](SamlSettings.md)| The SAML configuration |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="createSecurityDeployment"></a>
# **createSecurityDeployment**
> IdResponse createSecurityDeployment(body)

Create security deployment

Creates a new security deployment configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationSecurityApi;

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

PlatformConfigurationSecurityApi apiInstance = new PlatformConfigurationSecurityApi();
SecurityDeploymentCreateRequest body = new SecurityDeploymentCreateRequest(); // SecurityDeploymentCreateRequest | The deployment request
try {
    IdResponse result = apiInstance.createSecurityDeployment(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationSecurityApi#createSecurityDeployment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SecurityDeploymentCreateRequest**](SecurityDeploymentCreateRequest.md)| The deployment request |

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="deleteActiveDirectoryConfiguration"></a>
# **deleteActiveDirectoryConfiguration**
> EmptyResponse deleteActiveDirectoryConfiguration(realmId, version)

Delete Active Directory configuration

Deletes a single Active Directory configuration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationSecurityApi;

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

PlatformConfigurationSecurityApi apiInstance = new PlatformConfigurationSecurityApi();
String realmId = "realmId_example"; // String | The Elasticsearch Security realm identifier.
Integer version = 56; // Integer | When specified, checks for conflicts against the version stored in the persistent store (returned in 'x-cloud-resource-version' of the GET request)
try {
    EmptyResponse result = apiInstance.deleteActiveDirectoryConfiguration(realmId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationSecurityApi#deleteActiveDirectoryConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| The Elasticsearch Security realm identifier. |
 **version** | **Integer**| When specified, checks for conflicts against the version stored in the persistent store (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) | [optional]

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteEnrollmentToken"></a>
# **deleteEnrollmentToken**
> EmptyResponse deleteEnrollmentToken(token)

Delete enrollment token

Revokes and deletes the enrollment token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationSecurityApi;

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

PlatformConfigurationSecurityApi apiInstance = new PlatformConfigurationSecurityApi();
String token = "token_example"; // String | The token or token identifier to revoke.
try {
    EmptyResponse result = apiInstance.deleteEnrollmentToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationSecurityApi#deleteEnrollmentToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| The token or token identifier to revoke. |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteLdapConfiguration"></a>
# **deleteLdapConfiguration**
> EmptyResponse deleteLdapConfiguration(realmId, version)

Delete LDAP configuration

Deletes a single LDAP configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationSecurityApi;

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

PlatformConfigurationSecurityApi apiInstance = new PlatformConfigurationSecurityApi();
String realmId = "realmId_example"; // String | The Elasticsearch Security realm identifier.
Integer version = 56; // Integer | When specified, checks for conflicts against the version stored in the persistent store (returned in 'x-cloud-resource-version' of the GET request)
try {
    EmptyResponse result = apiInstance.deleteLdapConfiguration(realmId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationSecurityApi#deleteLdapConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| The Elasticsearch Security realm identifier. |
 **version** | **Integer**| When specified, checks for conflicts against the version stored in the persistent store (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) | [optional]

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteSamlConfiguration"></a>
# **deleteSamlConfiguration**
> EmptyResponse deleteSamlConfiguration(realmId, version)

Delete SAML configuration

Deletes a single SAML configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationSecurityApi;

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

PlatformConfigurationSecurityApi apiInstance = new PlatformConfigurationSecurityApi();
String realmId = "realmId_example"; // String | The Elasticsearch Security realm identifier.
Integer version = 56; // Integer | When specified, checks for conflicts against the version stored in the persistent store (returned in 'x-cloud-resource-version' of the GET request)
try {
    EmptyResponse result = apiInstance.deleteSamlConfiguration(realmId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationSecurityApi#deleteSamlConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| The Elasticsearch Security realm identifier. |
 **version** | **Integer**| When specified, checks for conflicts against the version stored in the persistent store (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) | [optional]

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="disableSecurityDeployment"></a>
# **disableSecurityDeployment**
> EmptyResponse disableSecurityDeployment(version)

Disables the security deployment

Disables the existing security deployment configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationSecurityApi;

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

PlatformConfigurationSecurityApi apiInstance = new PlatformConfigurationSecurityApi();
Integer version = 56; // Integer | When specified, checks for conflicts against the version stored in the persistent store (returned in 'x-cloud-resource-version' of the GET request)
try {
    EmptyResponse result = apiInstance.disableSecurityDeployment(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationSecurityApi#disableSecurityDeployment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **Integer**| When specified, checks for conflicts against the version stored in the persistent store (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) | [optional]

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="enableSecurityDeployment"></a>
# **enableSecurityDeployment**
> EmptyResponse enableSecurityDeployment(version)

Enables the security deployment

Enables the existing security deployment configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationSecurityApi;

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

PlatformConfigurationSecurityApi apiInstance = new PlatformConfigurationSecurityApi();
Integer version = 56; // Integer | When specified, checks for conflicts against the version stored in the persistent store (returned in 'x-cloud-resource-version' of the GET request)
try {
    EmptyResponse result = apiInstance.enableSecurityDeployment(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationSecurityApi#enableSecurityDeployment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **Integer**| When specified, checks for conflicts against the version stored in the persistent store (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) | [optional]

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getActiveDirectoryConfiguration"></a>
# **getActiveDirectoryConfiguration**
> ActiveDirectorySettings getActiveDirectoryConfiguration(realmId)

Get Active Directory configuration

Retrieves a single Active Directory security realm configuration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationSecurityApi;

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

PlatformConfigurationSecurityApi apiInstance = new PlatformConfigurationSecurityApi();
String realmId = "realmId_example"; // String | The Elasticsearch Security realm identifier.
try {
    ActiveDirectorySettings result = apiInstance.getActiveDirectoryConfiguration(realmId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationSecurityApi#getActiveDirectoryConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| The Elasticsearch Security realm identifier. |

### Return type

[**ActiveDirectorySettings**](ActiveDirectorySettings.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getEnrollmentTokens"></a>
# **getEnrollmentTokens**
> ListEnrollmentTokenReply getEnrollmentTokens()

Get enrollment tokens

Retrieves a list of active enrollment tokens.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationSecurityApi;

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

PlatformConfigurationSecurityApi apiInstance = new PlatformConfigurationSecurityApi();
try {
    ListEnrollmentTokenReply result = apiInstance.getEnrollmentTokens();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationSecurityApi#getEnrollmentTokens");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListEnrollmentTokenReply**](ListEnrollmentTokenReply.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getLdapConfiguration"></a>
# **getLdapConfiguration**
> LdapSettings getLdapConfiguration(realmId)

Get LDAP configuration

Retrieves a single LDAP security realm configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationSecurityApi;

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

PlatformConfigurationSecurityApi apiInstance = new PlatformConfigurationSecurityApi();
String realmId = "realmId_example"; // String | The Elasticsearch Security realm identifier.
try {
    LdapSettings result = apiInstance.getLdapConfiguration(realmId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationSecurityApi#getLdapConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| The Elasticsearch Security realm identifier. |

### Return type

[**LdapSettings**](LdapSettings.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSamlConfiguration"></a>
# **getSamlConfiguration**
> SamlSettings getSamlConfiguration(realmId)

Get SAML configuration

Retrieves a single SAML security realm configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationSecurityApi;

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

PlatformConfigurationSecurityApi apiInstance = new PlatformConfigurationSecurityApi();
String realmId = "realmId_example"; // String | The Elasticsearch Security realm identifier.
try {
    SamlSettings result = apiInstance.getSamlConfiguration(realmId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationSecurityApi#getSamlConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| The Elasticsearch Security realm identifier. |

### Return type

[**SamlSettings**](SamlSettings.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSecurityDeployment"></a>
# **getSecurityDeployment**
> SecurityDeployment getSecurityDeployment()

Get current security deployment

Retrieves the current security deployment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationSecurityApi;

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

PlatformConfigurationSecurityApi apiInstance = new PlatformConfigurationSecurityApi();
try {
    SecurityDeployment result = apiInstance.getSecurityDeployment();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationSecurityApi#getSecurityDeployment");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SecurityDeployment**](SecurityDeployment.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSecurityRealmConfigurations"></a>
# **getSecurityRealmConfigurations**
> SecurityRealmInfoList getSecurityRealmConfigurations()

List security realm configurations

Retrieves a list of security realm configurations.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationSecurityApi;

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

PlatformConfigurationSecurityApi apiInstance = new PlatformConfigurationSecurityApi();
try {
    SecurityRealmInfoList result = apiInstance.getSecurityRealmConfigurations();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationSecurityApi#getSecurityRealmConfigurations");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SecurityRealmInfoList**](SecurityRealmInfoList.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTlsCertificate"></a>
# **getTlsCertificate**
> TlsPublicCertChain getTlsCertificate(serviceName)

Get TLS certificate

Retrieves a certificate in the TLS certificate chain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationSecurityApi;

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

PlatformConfigurationSecurityApi apiInstance = new PlatformConfigurationSecurityApi();
String serviceName = "serviceName_example"; // String | The service certificate chain to read.
try {
    TlsPublicCertChain result = apiInstance.getTlsCertificate(serviceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationSecurityApi#getTlsCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceName** | **String**| The service certificate chain to read. | [enum: adminconsole, proxy, ui]

### Return type

[**TlsPublicCertChain**](TlsPublicCertChain.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="reorderSecurityRealms"></a>
# **reorderSecurityRealms**
> EmptyResponse reorderSecurityRealms(body)

Reorder security realms

Reorder security realms.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationSecurityApi;

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

PlatformConfigurationSecurityApi apiInstance = new PlatformConfigurationSecurityApi();
SecurityRealmsReorderRequest body = new SecurityRealmsReorderRequest(); // SecurityRealmsReorderRequest | The reorder request
try {
    EmptyResponse result = apiInstance.reorderSecurityRealms(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationSecurityApi#reorderSecurityRealms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SecurityRealmsReorderRequest**](SecurityRealmsReorderRequest.md)| The reorder request |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="setTlsCertificate"></a>
# **setTlsCertificate**
> EmptyResponse setTlsCertificate(body, serviceName)

Set TLS certificate

Creates or updates the TLS certificate chain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationSecurityApi;

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

PlatformConfigurationSecurityApi apiInstance = new PlatformConfigurationSecurityApi();
String body = "body_example"; // String | New certificate chain: the PEM encoded RSA private key, followed by the server certificate, followed by the CA certificate
String serviceName = "serviceName_example"; // String | The service certificate chain to read.
try {
    EmptyResponse result = apiInstance.setTlsCertificate(body, serviceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationSecurityApi#setTlsCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| New certificate chain: the PEM encoded RSA private key, followed by the server certificate, followed by the CA certificate |
 **serviceName** | **String**| The service certificate chain to read. | [enum: adminconsole, proxy, ui]

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="updateActiveDirectoryConfiguration"></a>
# **updateActiveDirectoryConfiguration**
> EmptyResponse updateActiveDirectoryConfiguration(body, realmId, version)

Update Active Directory configuration

Updates an existing Active Directory configuration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationSecurityApi;

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

PlatformConfigurationSecurityApi apiInstance = new PlatformConfigurationSecurityApi();
ActiveDirectorySettings body = new ActiveDirectorySettings(); // ActiveDirectorySettings | The Active Directory configuration
String realmId = "realmId_example"; // String | The Elasticsearch Security realm identifier.
Integer version = 56; // Integer | When specified, checks for conflicts against the version stored in the persistent store (returned in 'x-cloud-resource-version' of the GET request)
try {
    EmptyResponse result = apiInstance.updateActiveDirectoryConfiguration(body, realmId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationSecurityApi#updateActiveDirectoryConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ActiveDirectorySettings**](ActiveDirectorySettings.md)| The Active Directory configuration |
 **realmId** | **String**| The Elasticsearch Security realm identifier. |
 **version** | **Integer**| When specified, checks for conflicts against the version stored in the persistent store (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) | [optional]

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="updateLdapConfiguration"></a>
# **updateLdapConfiguration**
> EmptyResponse updateLdapConfiguration(body, realmId, version)

Update LDAP configuration

Updates an existing LDAP configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationSecurityApi;

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

PlatformConfigurationSecurityApi apiInstance = new PlatformConfigurationSecurityApi();
LdapSettings body = new LdapSettings(); // LdapSettings | The LDAP configuration
String realmId = "realmId_example"; // String | The Elasticsearch Security realm identifier.
Integer version = 56; // Integer | When specified, checks for conflicts against the version stored in the persistent store (returned in 'x-cloud-resource-version' of the GET request)
try {
    EmptyResponse result = apiInstance.updateLdapConfiguration(body, realmId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationSecurityApi#updateLdapConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LdapSettings**](LdapSettings.md)| The LDAP configuration |
 **realmId** | **String**| The Elasticsearch Security realm identifier. |
 **version** | **Integer**| When specified, checks for conflicts against the version stored in the persistent store (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) | [optional]

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="updateSamlConfiguration"></a>
# **updateSamlConfiguration**
> EmptyResponse updateSamlConfiguration(body, realmId, version)

Update SAML configuration

Updates an existing SAML configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlatformConfigurationSecurityApi;

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

PlatformConfigurationSecurityApi apiInstance = new PlatformConfigurationSecurityApi();
SamlSettings body = new SamlSettings(); // SamlSettings | The SAML configuration
String realmId = "realmId_example"; // String | The Elasticsearch Security realm identifier.
Integer version = 56; // Integer | When specified, checks for conflicts against the version stored in the persistent store (returned in 'x-cloud-resource-version' of the GET request)
try {
    EmptyResponse result = apiInstance.updateSamlConfiguration(body, realmId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformConfigurationSecurityApi#updateSamlConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SamlSettings**](SamlSettings.md)| The SAML configuration |
 **realmId** | **String**| The Elasticsearch Security realm identifier. |
 **version** | **Integer**| When specified, checks for conflicts against the version stored in the persistent store (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) | [optional]

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

