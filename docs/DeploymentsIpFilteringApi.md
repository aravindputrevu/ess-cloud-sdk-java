# DeploymentsIpFilteringApi

All URIs are relative to *https://{{hostname}}/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIpFilterRuleset**](DeploymentsIpFilteringApi.md#createIpFilterRuleset) | **POST** /deployments/ip-filtering/rulesets | Create a ruleset
[**createIpFilterRulesetAssociation**](DeploymentsIpFilteringApi.md#createIpFilterRulesetAssociation) | **POST** /deployments/ip-filtering/rulesets/{ruleset_id}/associations | Create ruleset association
[**deleteIpFilterRuleset**](DeploymentsIpFilteringApi.md#deleteIpFilterRuleset) | **DELETE** /deployments/ip-filtering/rulesets/{ruleset_id} | Delete a ruleset
[**deleteIpFilterRulesetAssociation**](DeploymentsIpFilteringApi.md#deleteIpFilterRulesetAssociation) | **DELETE** /deployments/ip-filtering/rulesets/{ruleset_id}/associations/{association_type}/{associated_entity_id} | Delete ruleset association
[**getIpFilterDeploymentRulesetAssociations**](DeploymentsIpFilteringApi.md#getIpFilterDeploymentRulesetAssociations) | **GET** /deployments/ip-filtering/associations/{association_type}/{associated_entity_id}/rulesets | Get associated rulesets
[**getIpFilterRuleset**](DeploymentsIpFilteringApi.md#getIpFilterRuleset) | **GET** /deployments/ip-filtering/rulesets/{ruleset_id} | Get a ruleset
[**getIpFilterRulesetDeploymentAssociations**](DeploymentsIpFilteringApi.md#getIpFilterRulesetDeploymentAssociations) | **GET** /deployments/ip-filtering/rulesets/{ruleset_id}/associations | Get associated deployments
[**getIpFilterRulesets**](DeploymentsIpFilteringApi.md#getIpFilterRulesets) | **GET** /deployments/ip-filtering/rulesets | Get all rulesets
[**updateIpFilterRuleset**](DeploymentsIpFilteringApi.md#updateIpFilterRuleset) | **PUT** /deployments/ip-filtering/rulesets/{ruleset_id} | Updates a ruleset

<a name="createIpFilterRuleset"></a>
# **createIpFilterRuleset**
> RuleSetResponse createIpFilterRuleset(body)

Create a ruleset

Creates a ruleset that combines a set of rules.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsIpFilteringApi;

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

DeploymentsIpFilteringApi apiInstance = new DeploymentsIpFilteringApi();
IpFilterRuleset body = new IpFilterRuleset(); // IpFilterRuleset | The ruleset definition
try {
    RuleSetResponse result = apiInstance.createIpFilterRuleset(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsIpFilteringApi#createIpFilterRuleset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IpFilterRuleset**](IpFilterRuleset.md)| The ruleset definition |

### Return type

[**RuleSetResponse**](RuleSetResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="createIpFilterRulesetAssociation"></a>
# **createIpFilterRulesetAssociation**
> EmptyResponse createIpFilterRulesetAssociation(body, rulesetId)

Create ruleset association

Applies the ruleset to the specified deployment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsIpFilteringApi;

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

DeploymentsIpFilteringApi apiInstance = new DeploymentsIpFilteringApi();
FilterAssociation body = new FilterAssociation(); // FilterAssociation | Mandatory ruleset association description
String rulesetId = "rulesetId_example"; // String | Mandatory ruleset ID
try {
    EmptyResponse result = apiInstance.createIpFilterRulesetAssociation(body, rulesetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsIpFilteringApi#createIpFilterRulesetAssociation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FilterAssociation**](FilterAssociation.md)| Mandatory ruleset association description |
 **rulesetId** | **String**| Mandatory ruleset ID |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="deleteIpFilterRuleset"></a>
# **deleteIpFilterRuleset**
> EmptyResponse deleteIpFilterRuleset(rulesetId, ignoreAssociations)

Delete a ruleset

Deletes the ruleset by ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsIpFilteringApi;

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

DeploymentsIpFilteringApi apiInstance = new DeploymentsIpFilteringApi();
String rulesetId = "rulesetId_example"; // String | The mandatory ruleset ID
Boolean ignoreAssociations = true; // Boolean | When true, ignores the associations and deletes the rule set. When false, recognizes the associations, which prevents the deletion of the rule set.
try {
    EmptyResponse result = apiInstance.deleteIpFilterRuleset(rulesetId, ignoreAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsIpFilteringApi#deleteIpFilterRuleset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rulesetId** | **String**| The mandatory ruleset ID |
 **ignoreAssociations** | **Boolean**| When true, ignores the associations and deletes the rule set. When false, recognizes the associations, which prevents the deletion of the rule set. | [optional]

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteIpFilterRulesetAssociation"></a>
# **deleteIpFilterRulesetAssociation**
> EmptyResponse deleteIpFilterRulesetAssociation(rulesetId, associationType, associatedEntityId)

Delete ruleset association

Deletes the traffic rules in the ruleset from the deployment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsIpFilteringApi;

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

DeploymentsIpFilteringApi apiInstance = new DeploymentsIpFilteringApi();
String rulesetId = "rulesetId_example"; // String | Mandatory ruleset ID
String associationType = "associationType_example"; // String | Mandatory association type ID
String associatedEntityId = "associatedEntityId_example"; // String | Mandatory associated entity ID
try {
    EmptyResponse result = apiInstance.deleteIpFilterRulesetAssociation(rulesetId, associationType, associatedEntityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsIpFilteringApi#deleteIpFilterRulesetAssociation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rulesetId** | **String**| Mandatory ruleset ID |
 **associationType** | **String**| Mandatory association type ID |
 **associatedEntityId** | **String**| Mandatory associated entity ID |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getIpFilterDeploymentRulesetAssociations"></a>
# **getIpFilterDeploymentRulesetAssociations**
> IpFilteringSettings getIpFilterDeploymentRulesetAssociations(associationType, associatedEntityId)

Get associated rulesets

Retrieves the rulesets associated with a deployment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsIpFilteringApi;

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

DeploymentsIpFilteringApi apiInstance = new DeploymentsIpFilteringApi();
String associationType = "associationType_example"; // String | Mandatory association type ID
String associatedEntityId = "associatedEntityId_example"; // String | Mandatory associated entity ID
try {
    IpFilteringSettings result = apiInstance.getIpFilterDeploymentRulesetAssociations(associationType, associatedEntityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsIpFilteringApi#getIpFilterDeploymentRulesetAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **associationType** | **String**| Mandatory association type ID |
 **associatedEntityId** | **String**| Mandatory associated entity ID |

### Return type

[**IpFilteringSettings**](IpFilteringSettings.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getIpFilterRuleset"></a>
# **getIpFilterRuleset**
> IpFilterRuleset getIpFilterRuleset(rulesetId, includeAssociations)

Get a ruleset

Retrieves the ruleset by ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsIpFilteringApi;

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

DeploymentsIpFilteringApi apiInstance = new DeploymentsIpFilteringApi();
String rulesetId = "rulesetId_example"; // String | The mandatory ruleset ID
Boolean includeAssociations = true; // Boolean | Retrieves a list of resources that are associated to the specified ruleset.
try {
    IpFilterRuleset result = apiInstance.getIpFilterRuleset(rulesetId, includeAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsIpFilteringApi#getIpFilterRuleset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rulesetId** | **String**| The mandatory ruleset ID |
 **includeAssociations** | **Boolean**| Retrieves a list of resources that are associated to the specified ruleset. | [optional]

### Return type

[**IpFilterRuleset**](IpFilterRuleset.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getIpFilterRulesetDeploymentAssociations"></a>
# **getIpFilterRulesetDeploymentAssociations**
> RulesetAssociations getIpFilterRulesetDeploymentAssociations(rulesetId)

Get associated deployments

Retrieves a list of deployments that are associated to the specified ruleset.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsIpFilteringApi;

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

DeploymentsIpFilteringApi apiInstance = new DeploymentsIpFilteringApi();
String rulesetId = "rulesetId_example"; // String | Mandatory ruleset ID
try {
    RulesetAssociations result = apiInstance.getIpFilterRulesetDeploymentAssociations(rulesetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsIpFilteringApi#getIpFilterRulesetDeploymentAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rulesetId** | **String**| Mandatory ruleset ID |

### Return type

[**RulesetAssociations**](RulesetAssociations.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getIpFilterRulesets"></a>
# **getIpFilterRulesets**
> IpFilterRulesets getIpFilterRulesets(includeAssociations)

Get all rulesets

Retrieves all of the user rulesets.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsIpFilteringApi;

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

DeploymentsIpFilteringApi apiInstance = new DeploymentsIpFilteringApi();
Boolean includeAssociations = true; // Boolean | Retrieves a list of resources that are associated to the specified ruleset.
try {
    IpFilterRulesets result = apiInstance.getIpFilterRulesets(includeAssociations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsIpFilteringApi#getIpFilterRulesets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeAssociations** | **Boolean**| Retrieves a list of resources that are associated to the specified ruleset. | [optional]

### Return type

[**IpFilterRulesets**](IpFilterRulesets.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateIpFilterRuleset"></a>
# **updateIpFilterRuleset**
> RuleSetResponse updateIpFilterRuleset(body, rulesetId)

Updates a ruleset

Updates the ruleset with the definition.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsIpFilteringApi;

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

DeploymentsIpFilteringApi apiInstance = new DeploymentsIpFilteringApi();
IpFilterRuleset body = new IpFilterRuleset(); // IpFilterRuleset | The ruleset definition
String rulesetId = "rulesetId_example"; // String | The mandatory ruleset ID
try {
    RuleSetResponse result = apiInstance.updateIpFilterRuleset(body, rulesetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsIpFilteringApi#updateIpFilterRuleset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IpFilterRuleset**](IpFilterRuleset.md)| The ruleset definition |
 **rulesetId** | **String**| The mandatory ruleset ID |

### Return type

[**RuleSetResponse**](RuleSetResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

