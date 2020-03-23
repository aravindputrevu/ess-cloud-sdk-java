# ClustersApi

All URIs are relative to *https://{{hostname}}/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchClusters**](ClustersApi.md#searchClusters) | **POST** /clusters/_search | Search clusters

<a name="searchClusters"></a>
# **searchClusters**
> ClustersInfo searchClusters(body)

Search clusters

Retrieves the information for all of the instances that match the specified query.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApi;

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

ClustersApi apiInstance = new ClustersApi();
SearchRequest body = new SearchRequest(); // SearchRequest | (Optional) The search request to execute. NOTE: When not specified, all of the clusters are matched.
try {
    ClustersInfo result = apiInstance.searchClusters(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#searchClusters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchRequest**](SearchRequest.md)| (Optional) The search request to execute. NOTE: When not specified, all of the clusters are matched. | [optional]

### Return type

[**ClustersInfo**](ClustersInfo.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

