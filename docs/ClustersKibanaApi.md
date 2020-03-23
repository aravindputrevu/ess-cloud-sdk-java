# ClustersKibanaApi

All URIs are relative to *https://{{hostname}}/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelKibanaClusterPendingPlan**](ClustersKibanaApi.md#cancelKibanaClusterPendingPlan) | **DELETE** /clusters/kibana/{cluster_id}/plan/pending | Cancel pending plan
[**createKibanaCluster**](ClustersKibanaApi.md#createKibanaCluster) | **POST** /clusters/kibana | Create cluster
[**deleteKibProxyRequests**](ClustersKibanaApi.md#deleteKibProxyRequests) | **DELETE** /clusters/kibana/{cluster_id}/proxy/{kibana_path} | Proxy HTTP DELETE request
[**deleteKibanaCluster**](ClustersKibanaApi.md#deleteKibanaCluster) | **DELETE** /clusters/kibana/{cluster_id} | Delete cluster
[**getKibProxyRequests**](ClustersKibanaApi.md#getKibProxyRequests) | **GET** /clusters/kibana/{cluster_id}/proxy/{kibana_path} | Proxy HTTP GET request
[**getKibanaCluster**](ClustersKibanaApi.md#getKibanaCluster) | **GET** /clusters/kibana/{cluster_id} | Get cluster
[**getKibanaClusterMetadataRaw**](ClustersKibanaApi.md#getKibanaClusterMetadataRaw) | **GET** /clusters/kibana/{cluster_id}/metadata/raw | Get cluster metadata
[**getKibanaClusterMetadataSettings**](ClustersKibanaApi.md#getKibanaClusterMetadataSettings) | **GET** /clusters/kibana/{cluster_id}/metadata/settings | Get cluster metadata settings
[**getKibanaClusterPendingPlan**](ClustersKibanaApi.md#getKibanaClusterPendingPlan) | **GET** /clusters/kibana/{cluster_id}/plan/pending | Get pending plan
[**getKibanaClusterPlan**](ClustersKibanaApi.md#getKibanaClusterPlan) | **GET** /clusters/kibana/{cluster_id}/plan | Get plan
[**getKibanaClusterPlanActivity**](ClustersKibanaApi.md#getKibanaClusterPlanActivity) | **GET** /clusters/kibana/{cluster_id}/plan/activity | Get plan activity
[**getKibanaClusters**](ClustersKibanaApi.md#getKibanaClusters) | **GET** /clusters/kibana | Get clusters
[**moveKibanaClusterInstances**](ClustersKibanaApi.md#moveKibanaClusterInstances) | **POST** /clusters/kibana/{cluster_id}/instances/{instance_ids}/_move | Move instances
[**moveKibanaClusterInstancesAdvanced**](ClustersKibanaApi.md#moveKibanaClusterInstancesAdvanced) | **POST** /clusters/kibana/{cluster_id}/instances/_move | Move instances (advanced)
[**postKibProxyRequests**](ClustersKibanaApi.md#postKibProxyRequests) | **POST** /clusters/kibana/{cluster_id}/proxy/{kibana_path} | Proxy HTTP POST request
[**putKibProxyRequests**](ClustersKibanaApi.md#putKibProxyRequests) | **PUT** /clusters/kibana/{cluster_id}/proxy/{kibana_path} | Proxy HTTP PUT request
[**restartKibanaCluster**](ClustersKibanaApi.md#restartKibanaCluster) | **POST** /clusters/kibana/{cluster_id}/_restart | Restart cluster
[**resyncKibanaCluster**](ClustersKibanaApi.md#resyncKibanaCluster) | **POST** /clusters/kibana/{cluster_id}/_resync | Resynchronize cluster
[**resyncKibanaClusters**](ClustersKibanaApi.md#resyncKibanaClusters) | **POST** /clusters/kibana/_resync | Resynchronize clusters
[**searchKibanaClusters**](ClustersKibanaApi.md#searchKibanaClusters) | **POST** /clusters/kibana/_search | Search clusters
[**setKibanaClusterMetadataRaw**](ClustersKibanaApi.md#setKibanaClusterMetadataRaw) | **POST** /clusters/kibana/{cluster_id}/metadata/raw | Set cluster metadata
[**setKibanaClusterName**](ClustersKibanaApi.md#setKibanaClusterName) | **PUT** /clusters/kibana/{cluster_id}/metadata/name/{new_name} | Set cluster name
[**shutdownKibanaCluster**](ClustersKibanaApi.md#shutdownKibanaCluster) | **POST** /clusters/kibana/{cluster_id}/_shutdown | Shut down cluster
[**startKibanaClusterInstances**](ClustersKibanaApi.md#startKibanaClusterInstances) | **POST** /clusters/kibana/{cluster_id}/instances/{instance_ids}/_start | Start instances
[**startKibanaClusterInstancesAll**](ClustersKibanaApi.md#startKibanaClusterInstancesAll) | **POST** /clusters/kibana/{cluster_id}/instances/_start | Start all instances
[**startKibanaClusterInstancesAllMaintenanceMode**](ClustersKibanaApi.md#startKibanaClusterInstancesAllMaintenanceMode) | **POST** /clusters/kibana/{cluster_id}/instances/maintenance-mode/_start | Start maintenance mode all instances
[**startKibanaClusterMaintenanceMode**](ClustersKibanaApi.md#startKibanaClusterMaintenanceMode) | **POST** /clusters/kibana/{cluster_id}/instances/{instance_ids}/maintenance-mode/_start | Start maintenance mode
[**stopKibanaClusterInstances**](ClustersKibanaApi.md#stopKibanaClusterInstances) | **POST** /clusters/kibana/{cluster_id}/instances/{instance_ids}/_stop | Stop instances
[**stopKibanaClusterInstancesAll**](ClustersKibanaApi.md#stopKibanaClusterInstancesAll) | **POST** /clusters/kibana/{cluster_id}/instances/_stop | Stop all instances
[**stopKibanaClusterInstancesAllMaintenanceMode**](ClustersKibanaApi.md#stopKibanaClusterInstancesAllMaintenanceMode) | **POST** /clusters/kibana/{cluster_id}/instances/maintenance-mode/_stop | Stop maintenance mode all instances
[**stopKibanaClusterMaintenanceMode**](ClustersKibanaApi.md#stopKibanaClusterMaintenanceMode) | **POST** /clusters/kibana/{cluster_id}/instances/{instance_ids}/maintenance-mode/_stop | Stop maintenance mode
[**updateKibanaClusterMetadataSettings**](ClustersKibanaApi.md#updateKibanaClusterMetadataSettings) | **PATCH** /clusters/kibana/{cluster_id}/metadata/settings | Update cluster metadata settings
[**updateKibanaClusterPlan**](ClustersKibanaApi.md#updateKibanaClusterPlan) | **POST** /clusters/kibana/{cluster_id}/plan | Update plan
[**upgradeKibanaCluster**](ClustersKibanaApi.md#upgradeKibanaCluster) | **POST** /clusters/kibana/{cluster_id}/_upgrade | Upgrade cluster

<a name="cancelKibanaClusterPendingPlan"></a>
# **cancelKibanaClusterPendingPlan**
> EmptyResponse cancelKibanaClusterPendingPlan(clusterId, ignoreMissing, forceDelete)

Cancel pending plan

Cancels the pending plan of the Kibana instance.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
String clusterId = "clusterId_example"; // String | The Kibana deployment identifier.
Boolean ignoreMissing = true; // Boolean | When `true`, returns successfully, even when plans are pending. The default is `false`.
Boolean forceDelete = true; // Boolean | When `true`, deletes the pending plan instead of attempting a graceful cancellation. The default is `false`.
try {
    EmptyResponse result = apiInstance.cancelKibanaClusterPendingPlan(clusterId, ignoreMissing, forceDelete);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#cancelKibanaClusterPendingPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Kibana deployment identifier. |
 **ignoreMissing** | **Boolean**| When &#x60;true&#x60;, returns successfully, even when plans are pending. The default is &#x60;false&#x60;. | [optional]
 **forceDelete** | **Boolean**| When &#x60;true&#x60;, deletes the pending plan instead of attempting a graceful cancellation. The default is &#x60;false&#x60;. | [optional]

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="createKibanaCluster"></a>
# **createKibanaCluster**
> ClusterCrudResponse createKibanaCluster(body, validateOnly)

Create cluster

Creates a Kibana instance for the Elasticsearch cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
CreateKibanaRequest body = new CreateKibanaRequest(); // CreateKibanaRequest | The cluster definition
Boolean validateOnly = true; // Boolean | When `true`, validates the cluster definition without creating the cluster.
try {
    ClusterCrudResponse result = apiInstance.createKibanaCluster(body, validateOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#createKibanaCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateKibanaRequest**](CreateKibanaRequest.md)| The cluster definition |
 **validateOnly** | **Boolean**| When &#x60;true&#x60;, validates the cluster definition without creating the cluster. | [optional]

### Return type

[**ClusterCrudResponse**](ClusterCrudResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="deleteKibProxyRequests"></a>
# **deleteKibProxyRequests**
> deleteKibProxyRequests(clusterId, xManagementRequest, kibanaPath)

Proxy HTTP DELETE request

Proxies the HTTP DELETE request to the cluster. You must specify the &#x60;X-Management-Request&#x60; HTTP header. NOTE: Use this endpoint for management purposes. It does not provide high performance.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
String clusterId = "clusterId_example"; // String | The Kibana deployment identifier
String xManagementRequest = "xManagementRequest_example"; // String | When set to `true`, includes the X-Management-Request header value.
String kibanaPath = "kibanaPath_example"; // String | The URL part to proxy to the Kibana cluster. Example: /api/spaces/space or /api/upgrade_assistant/status
try {
    apiInstance.deleteKibProxyRequests(clusterId, xManagementRequest, kibanaPath);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#deleteKibProxyRequests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Kibana deployment identifier |
 **xManagementRequest** | **String**| When set to &#x60;true&#x60;, includes the X-Management-Request header value. |
 **kibanaPath** | **String**| The URL part to proxy to the Kibana cluster. Example: /api/spaces/space or /api/upgrade_assistant/status |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteKibanaCluster"></a>
# **deleteKibanaCluster**
> EmptyResponse deleteKibanaCluster(clusterId)

Delete cluster

Deletes the Kibana instance. Before you delete the Kibana instance, you must first successfully issue a &#x60;_shutdown&#x60; command.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
String clusterId = "clusterId_example"; // String | The Kibana deployment identifier.
try {
    EmptyResponse result = apiInstance.deleteKibanaCluster(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#deleteKibanaCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Kibana deployment identifier. |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getKibProxyRequests"></a>
# **getKibProxyRequests**
> getKibProxyRequests(clusterId, kibanaPath, xManagementRequest)

Proxy HTTP GET request

Proxies the HTTP GET request to the cluster. You must specify the &#x60;X-Management-Request&#x60; HTTP header. NOTE: Use this endpoint for management purposes. It does not provide high performance.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
String clusterId = "clusterId_example"; // String | The Kibana deployment identifier
String kibanaPath = "kibanaPath_example"; // String | The URL part to proxy to the Kibana cluster. Example: /api/spaces/space or /api/upgrade_assistant/status
String xManagementRequest = "xManagementRequest_example"; // String | When set to `true`, includes the X-Management-Request header value.
try {
    apiInstance.getKibProxyRequests(clusterId, kibanaPath, xManagementRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#getKibProxyRequests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Kibana deployment identifier |
 **kibanaPath** | **String**| The URL part to proxy to the Kibana cluster. Example: /api/spaces/space or /api/upgrade_assistant/status |
 **xManagementRequest** | **String**| When set to &#x60;true&#x60;, includes the X-Management-Request header value. |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getKibanaCluster"></a>
# **getKibanaCluster**
> KibanaClusterInfo getKibanaCluster(clusterId, showMetadata, showPlans, showPlanLogs, showPlanDefaults, showSettings, convertLegacyPlans)

Get cluster

Retrieves the Kibana instance information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
String clusterId = "clusterId_example"; // String | The Kibana deployment identifier.
Boolean showMetadata = true; // Boolean | Includes all of the cluster metadata in the response. NOTE: Responses can include a large amount of metadata, as well as credentials.
Boolean showPlans = true; // Boolean | Includes the active and pending plan information in the response. NOTE: This option can result in large responses.
Boolean showPlanLogs = true; // Boolean | Includes the active, pending, and historical plan information in the attempt log. NOTE: This option can result in large responses.
Boolean showPlanDefaults = true; // Boolean | When plans are shown, includes the default values in the response. NOTE: This option results in large responses.
Boolean showSettings = true; // Boolean | Includes the cluster settings in the response.
Boolean convertLegacyPlans = true; // Boolean | When `true`, converts the plans to the 2.0.x format. When `false`, uses the 1.x format. The default is `false`.
try {
    KibanaClusterInfo result = apiInstance.getKibanaCluster(clusterId, showMetadata, showPlans, showPlanLogs, showPlanDefaults, showSettings, convertLegacyPlans);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#getKibanaCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Kibana deployment identifier. |
 **showMetadata** | **Boolean**| Includes all of the cluster metadata in the response. NOTE: Responses can include a large amount of metadata, as well as credentials. | [optional]
 **showPlans** | **Boolean**| Includes the active and pending plan information in the response. NOTE: This option can result in large responses. | [optional]
 **showPlanLogs** | **Boolean**| Includes the active, pending, and historical plan information in the attempt log. NOTE: This option can result in large responses. | [optional]
 **showPlanDefaults** | **Boolean**| When plans are shown, includes the default values in the response. NOTE: This option results in large responses. | [optional]
 **showSettings** | **Boolean**| Includes the cluster settings in the response. | [optional]
 **convertLegacyPlans** | **Boolean**| When &#x60;true&#x60;, converts the plans to the 2.0.x format. When &#x60;false&#x60;, uses the 1.x format. The default is &#x60;false&#x60;. | [optional]

### Return type

[**KibanaClusterInfo**](KibanaClusterInfo.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getKibanaClusterMetadataRaw"></a>
# **getKibanaClusterMetadataRaw**
> Object getKibanaClusterMetadataRaw(clusterId)

Get cluster metadata

Advanced use only. Retrieves the internal metadata, in free-form JSON, for the Kibana instance.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
String clusterId = "clusterId_example"; // String | The Kibana deployment identifier.
try {
    Object result = apiInstance.getKibanaClusterMetadataRaw(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#getKibanaClusterMetadataRaw");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Kibana deployment identifier. |

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getKibanaClusterMetadataSettings"></a>
# **getKibanaClusterMetadataSettings**
> ClusterMetadataSettings getKibanaClusterMetadataSettings(clusterId)

Get cluster metadata settings

Retrieves a structured version of the cluster metadata as a collection of top-level settings. If a particular setting isn&#x27;t returned, then the free-form JSON endpoint (&#x60;/metadata/raw&#x60;) must be used.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
String clusterId = "clusterId_example"; // String | The Kibana deployment identifier.
try {
    ClusterMetadataSettings result = apiInstance.getKibanaClusterMetadataSettings(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#getKibanaClusterMetadataSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Kibana deployment identifier. |

### Return type

[**ClusterMetadataSettings**](ClusterMetadataSettings.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getKibanaClusterPendingPlan"></a>
# **getKibanaClusterPendingPlan**
> KibanaClusterPlan getKibanaClusterPendingPlan(clusterId, showPlanDefaults, convertLegacyPlans)

Get pending plan

Retrieves the pending plan of the Kibana instance.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
String clusterId = "clusterId_example"; // String | The Kibana deployment identifier.
Boolean showPlanDefaults = true; // Boolean | When plans are shown, includes the default values in the response. NOTE: This option results in large responses.
Boolean convertLegacyPlans = true; // Boolean | When `true`, converts the plans to the 2.0.x format. When `false`, uses the 1.x format. The default is `false`.
try {
    KibanaClusterPlan result = apiInstance.getKibanaClusterPendingPlan(clusterId, showPlanDefaults, convertLegacyPlans);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#getKibanaClusterPendingPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Kibana deployment identifier. |
 **showPlanDefaults** | **Boolean**| When plans are shown, includes the default values in the response. NOTE: This option results in large responses. | [optional]
 **convertLegacyPlans** | **Boolean**| When &#x60;true&#x60;, converts the plans to the 2.0.x format. When &#x60;false&#x60;, uses the 1.x format. The default is &#x60;false&#x60;. | [optional]

### Return type

[**KibanaClusterPlan**](KibanaClusterPlan.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getKibanaClusterPlan"></a>
# **getKibanaClusterPlan**
> KibanaClusterPlan getKibanaClusterPlan(clusterId, showPlanDefaults, convertLegacyPlans)

Get plan

Retrieves the active plan of the Kibana instance. Transient settings are not show by this endpoint. To view the transient settings that have been applied with a specific plan, use the activity endpoint.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
String clusterId = "clusterId_example"; // String | The Kibana deployment identifier.
Boolean showPlanDefaults = true; // Boolean | When plans are shown, includes the default values in the response. NOTE: This option results in large responses.
Boolean convertLegacyPlans = true; // Boolean | When `true`, converts the plans to the 2.0.x format. When `false`, uses the 1.x format. The default is `false`.
try {
    KibanaClusterPlan result = apiInstance.getKibanaClusterPlan(clusterId, showPlanDefaults, convertLegacyPlans);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#getKibanaClusterPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Kibana deployment identifier. |
 **showPlanDefaults** | **Boolean**| When plans are shown, includes the default values in the response. NOTE: This option results in large responses. | [optional]
 **convertLegacyPlans** | **Boolean**| When &#x60;true&#x60;, converts the plans to the 2.0.x format. When &#x60;false&#x60;, uses the 1.x format. The default is &#x60;false&#x60;. | [optional]

### Return type

[**KibanaClusterPlan**](KibanaClusterPlan.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getKibanaClusterPlanActivity"></a>
# **getKibanaClusterPlanActivity**
> KibanaClusterPlansInfo getKibanaClusterPlanActivity(clusterId, showPlanLogs, showPlanDefaults, convertLegacyPlans)

Get plan activity

Retrieves the active and historical plan information for the Kibana instance.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
String clusterId = "clusterId_example"; // String | The Kibana deployment identifier.
Boolean showPlanLogs = true; // Boolean | Includes the active, pending, and historical plan information in the attempt log. NOTE: This option can result in large responses.
Boolean showPlanDefaults = true; // Boolean | When plans are shown, includes the default values in the response. NOTE: This option results in large responses.
Boolean convertLegacyPlans = true; // Boolean | When `true`, converts the plans to the 2.0.x format. When `false`, uses the 1.x format. The default is `false`.
try {
    KibanaClusterPlansInfo result = apiInstance.getKibanaClusterPlanActivity(clusterId, showPlanLogs, showPlanDefaults, convertLegacyPlans);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#getKibanaClusterPlanActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Kibana deployment identifier. |
 **showPlanLogs** | **Boolean**| Includes the active, pending, and historical plan information in the attempt log. NOTE: This option can result in large responses. | [optional]
 **showPlanDefaults** | **Boolean**| When plans are shown, includes the default values in the response. NOTE: This option results in large responses. | [optional]
 **convertLegacyPlans** | **Boolean**| When &#x60;true&#x60;, converts the plans to the 2.0.x format. When &#x60;false&#x60;, uses the 1.x format. The default is &#x60;false&#x60;. | [optional]

### Return type

[**KibanaClusterPlansInfo**](KibanaClusterPlansInfo.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getKibanaClusters"></a>
# **getKibanaClusters**
> KibanaClustersInfo getKibanaClusters(from, size, q, showMetadata, showPlans, showHidden, showPlanDefaults, showSettings)

Get clusters

Retrieves the information for all Kibana instances.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
Integer from = 56; // Integer | The number of clusters to skip.
Integer size = 56; // Integer | The maximum number of clusters to include in the response. For all clusters, use -1. NOTE: This option can result in large responses.
String q = "q_example"; // String | An optional query to filter Kibana clusters by. Maps to an Elasticsearch query_string query.
Boolean showMetadata = true; // Boolean | Includes all of the cluster metadata in the response. NOTE: Responses can include a large amount of metadata, as well as credentials.
Boolean showPlans = true; // Boolean | Includes the active and pending plan information in the response. NOTE: This option can result in large responses.
Boolean showHidden = true; // Boolean | Includes the hidden clusters in the response.
Boolean showPlanDefaults = true; // Boolean | When plans are shown, includes the default values in the response. NOTE: This option results in large responses.
Boolean showSettings = true; // Boolean | Includes the cluster settings in the response.
try {
    KibanaClustersInfo result = apiInstance.getKibanaClusters(from, size, q, showMetadata, showPlans, showHidden, showPlanDefaults, showSettings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#getKibanaClusters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **Integer**| The number of clusters to skip. | [optional]
 **size** | **Integer**| The maximum number of clusters to include in the response. For all clusters, use -1. NOTE: This option can result in large responses. | [optional]
 **q** | **String**| An optional query to filter Kibana clusters by. Maps to an Elasticsearch query_string query. | [optional]
 **showMetadata** | **Boolean**| Includes all of the cluster metadata in the response. NOTE: Responses can include a large amount of metadata, as well as credentials. | [optional]
 **showPlans** | **Boolean**| Includes the active and pending plan information in the response. NOTE: This option can result in large responses. | [optional]
 **showHidden** | **Boolean**| Includes the hidden clusters in the response. | [optional]
 **showPlanDefaults** | **Boolean**| When plans are shown, includes the default values in the response. NOTE: This option results in large responses. | [optional]
 **showSettings** | **Boolean**| Includes the cluster settings in the response. | [optional]

### Return type

[**KibanaClustersInfo**](KibanaClustersInfo.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="moveKibanaClusterInstances"></a>
# **moveKibanaClusterInstances**
> ClusterCommandResponse moveKibanaClusterInstances(clusterId, instanceIds, body, ignoreMissing, forceUpdate, validateOnly)

Move instances

Moves one or more Kibana instances.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
String clusterId = "clusterId_example"; // String | The Kibana deployment identifier.
List<String> instanceIds = Arrays.asList("instanceIds_example"); // List<String> | A comma-separated list of instance identifiers.
TransientKibanaPlanConfiguration body = new TransientKibanaPlanConfiguration(); // TransientKibanaPlanConfiguration | Overrides defaults for the move, including setting the configuration of instances specified in the path
Boolean ignoreMissing = true; // Boolean | When `true` and the instance does not exist, proceeds to the next instance, or treats the instance as an error.
Boolean forceUpdate = true; // Boolean | When `true`, cancels and overwrites the pending plans, or treats the instance as an error.
Boolean validateOnly = true; // Boolean | When `true`, validates the move request, then returns the calculated plan without applying the plan.
try {
    ClusterCommandResponse result = apiInstance.moveKibanaClusterInstances(clusterId, instanceIds, body, ignoreMissing, forceUpdate, validateOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#moveKibanaClusterInstances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Kibana deployment identifier. |
 **instanceIds** | [**List&lt;String&gt;**](String.md)| A comma-separated list of instance identifiers. |
 **body** | [**TransientKibanaPlanConfiguration**](TransientKibanaPlanConfiguration.md)| Overrides defaults for the move, including setting the configuration of instances specified in the path | [optional]
 **ignoreMissing** | **Boolean**| When &#x60;true&#x60; and the instance does not exist, proceeds to the next instance, or treats the instance as an error. | [optional]
 **forceUpdate** | **Boolean**| When &#x60;true&#x60;, cancels and overwrites the pending plans, or treats the instance as an error. | [optional]
 **validateOnly** | **Boolean**| When &#x60;true&#x60;, validates the move request, then returns the calculated plan without applying the plan. | [optional]

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="moveKibanaClusterInstancesAdvanced"></a>
# **moveKibanaClusterInstancesAdvanced**
> ClusterCommandResponse moveKibanaClusterInstancesAdvanced(body, clusterId, forceUpdate, validateOnly)

Move instances (advanced)

Moves one or more Kibana instances. The custom configuration settings are posted in the body.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
TransientKibanaPlanConfiguration body = new TransientKibanaPlanConfiguration(); // TransientKibanaPlanConfiguration | Overrides defaults for the move, including setting the configuration of instances specified in the path
String clusterId = "clusterId_example"; // String | The Kibana deployment identifier.
Boolean forceUpdate = true; // Boolean | When `true`, cancels and overwrites the pending plans, or treats the instance as an error.
Boolean validateOnly = true; // Boolean | When `true`, validates the move request, then returns the calculated plan without applying the plan.
try {
    ClusterCommandResponse result = apiInstance.moveKibanaClusterInstancesAdvanced(body, clusterId, forceUpdate, validateOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#moveKibanaClusterInstancesAdvanced");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransientKibanaPlanConfiguration**](TransientKibanaPlanConfiguration.md)| Overrides defaults for the move, including setting the configuration of instances specified in the path |
 **clusterId** | **String**| The Kibana deployment identifier. |
 **forceUpdate** | **Boolean**| When &#x60;true&#x60;, cancels and overwrites the pending plans, or treats the instance as an error. | [optional]
 **validateOnly** | **Boolean**| When &#x60;true&#x60;, validates the move request, then returns the calculated plan without applying the plan. | [optional]

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="postKibProxyRequests"></a>
# **postKibProxyRequests**
> postKibProxyRequests(xManagementRequest, clusterId, kibanaPath, body)

Proxy HTTP POST request

Proxies the HTTP POST request to the cluster. You must specify the &#x60;X-Management-Request&#x60; HTTP header. NOTE: Use this endpoint for management purposes. It does not provide high performance.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
String xManagementRequest = "xManagementRequest_example"; // String | When set to `true`, includes the X-Management-Request header value.
String clusterId = "clusterId_example"; // String | The Kibana deployment identifier
String kibanaPath = "kibanaPath_example"; // String | The URL part to proxy to the Kibana cluster. Example: /api/spaces/space or /api/upgrade_assistant/status
String body = "body_example"; // String | The JSON payload that is used to proxy the Kibana deployment.
try {
    apiInstance.postKibProxyRequests(xManagementRequest, clusterId, kibanaPath, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#postKibProxyRequests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xManagementRequest** | **String**| When set to &#x60;true&#x60;, includes the X-Management-Request header value. |
 **clusterId** | **String**| The Kibana deployment identifier |
 **kibanaPath** | **String**| The URL part to proxy to the Kibana cluster. Example: /api/spaces/space or /api/upgrade_assistant/status |
 **body** | [**String**](String.md)| The JSON payload that is used to proxy the Kibana deployment. | [optional]

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="putKibProxyRequests"></a>
# **putKibProxyRequests**
> putKibProxyRequests(xManagementRequest, clusterId, kibanaPath, body)

Proxy HTTP PUT request

Proxies the HTTP PUT request to the cluster. You must specify the &#x60;X-Management-Request&#x60; HTTP header. NOTE: Use this endpoint for management purposes. It does not provide high performance.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
String xManagementRequest = "xManagementRequest_example"; // String | When set to `true`, includes the X-Management-Request header value.
String clusterId = "clusterId_example"; // String | The Kibana deployment identifier
String kibanaPath = "kibanaPath_example"; // String | The URL part to proxy to the Kibana cluster. Example: /api/spaces/space or /api/upgrade_assistant/status
String body = "body_example"; // String | The JSON payload that is used to proxy the Kibana deployment.
try {
    apiInstance.putKibProxyRequests(xManagementRequest, clusterId, kibanaPath, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#putKibProxyRequests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xManagementRequest** | **String**| When set to &#x60;true&#x60;, includes the X-Management-Request header value. |
 **clusterId** | **String**| The Kibana deployment identifier |
 **kibanaPath** | **String**| The URL part to proxy to the Kibana cluster. Example: /api/spaces/space or /api/upgrade_assistant/status |
 **body** | [**String**](String.md)| The JSON payload that is used to proxy the Kibana deployment. | [optional]

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="restartKibanaCluster"></a>
# **restartKibanaCluster**
> ClusterCommandResponse restartKibanaCluster(clusterId, cancelPending)

Restart cluster

Restarts the Kibana instance. When you restart an active instance, the existing plan is used and a &#x60;cluster_reboot&#x60; is applied. A &#x60;cluster_reboot&#x60; issues a Kibana restart command, then waits for the command to complete. When you restart an inactive instance, the most recent successful plan is applied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
String clusterId = "clusterId_example"; // String | The Kibana deployment identifier.
Boolean cancelPending = true; // Boolean | When `true`, cancels the pending plans, then restarts the cluster.
try {
    ClusterCommandResponse result = apiInstance.restartKibanaCluster(clusterId, cancelPending);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#restartKibanaCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Kibana deployment identifier. |
 **cancelPending** | **Boolean**| When &#x60;true&#x60;, cancels the pending plans, then restarts the cluster. | [optional]

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="resyncKibanaCluster"></a>
# **resyncKibanaCluster**
> EmptyResponse resyncKibanaCluster(clusterId)

Resynchronize cluster

Immediately resynchronizes the search index and cache for the selected Kibana instance.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
String clusterId = "clusterId_example"; // String | The Kibana instance identifier.
try {
    EmptyResponse result = apiInstance.resyncKibanaCluster(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#resyncKibanaCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Kibana instance identifier. |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="resyncKibanaClusters"></a>
# **resyncKibanaClusters**
> ModelVersionIndexSynchronizationResults resyncKibanaClusters(skipMatchingVersion)

Resynchronize clusters

Asynchronously resynchronizes the search index for all Kibana instances.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
Boolean skipMatchingVersion = true; // Boolean | When true, skips the document indexing when the version matches the in-memory copy.
try {
    ModelVersionIndexSynchronizationResults result = apiInstance.resyncKibanaClusters(skipMatchingVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#resyncKibanaClusters");
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

<a name="searchKibanaClusters"></a>
# **searchKibanaClusters**
> KibanaClustersInfo searchKibanaClusters(body)

Search clusters

Retrieves the information for all of the Kibana instances that match the specified query.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
SearchRequest body = new SearchRequest(); // SearchRequest | (Optional) The search request to execute. NOTE: When not specified, all of the clusters are matched.
try {
    KibanaClustersInfo result = apiInstance.searchKibanaClusters(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#searchKibanaClusters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchRequest**](SearchRequest.md)| (Optional) The search request to execute. NOTE: When not specified, all of the clusters are matched. | [optional]

### Return type

[**KibanaClustersInfo**](KibanaClustersInfo.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="setKibanaClusterMetadataRaw"></a>
# **setKibanaClusterMetadataRaw**
> Object setKibanaClusterMetadataRaw(body, clusterId, version)

Set cluster metadata

Advanced use only. Sets the internal metadata, in free-form JSON, for the Kibana instance. Only use the parameter to set the modified JSON that is returned from the get version of the metadata.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
String body = "body_example"; // String | The freeform JSON for the cluster (should always be based on the current version retrieved from the GET)
String clusterId = "clusterId_example"; // String | The Kibana deployment identifier.
Integer version = 56; // Integer | Checks for conflicts against the metadata version, then returns the value in the `x-cloud-resource-version` header.
try {
    Object result = apiInstance.setKibanaClusterMetadataRaw(body, clusterId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#setKibanaClusterMetadataRaw");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| The freeform JSON for the cluster (should always be based on the current version retrieved from the GET) |
 **clusterId** | **String**| The Kibana deployment identifier. |
 **version** | **Integer**| Checks for conflicts against the metadata version, then returns the value in the &#x60;x-cloud-resource-version&#x60; header. | [optional]

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="setKibanaClusterName"></a>
# **setKibanaClusterName**
> EmptyResponse setKibanaClusterName(clusterId, newName)

Set cluster name

Assigns a name to the Kibana instance.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
String clusterId = "clusterId_example"; // String | The Kibana deployment identifier.
String newName = "newName_example"; // String | The new name for the cluster.
try {
    EmptyResponse result = apiInstance.setKibanaClusterName(clusterId, newName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#setKibanaClusterName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Kibana deployment identifier. |
 **newName** | **String**| The new name for the cluster. |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="shutdownKibanaCluster"></a>
# **shutdownKibanaCluster**
> ClusterCommandResponse shutdownKibanaCluster(clusterId, hide)

Shut down cluster

Shuts down the active Kibana instance and removes all of the instance nodes. The instance definition is retained. WARNING: To avoid data loss, save the snapshot repository before you shut down the instance.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
String clusterId = "clusterId_example"; // String | The Kibana deployment identifier.
Boolean hide = true; // Boolean | Hides the clusters during shutdown. NOTE: By default, hidden clusters are not listed.
try {
    ClusterCommandResponse result = apiInstance.shutdownKibanaCluster(clusterId, hide);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#shutdownKibanaCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Kibana deployment identifier. |
 **hide** | **Boolean**| Hides the clusters during shutdown. NOTE: By default, hidden clusters are not listed. | [optional]

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="startKibanaClusterInstances"></a>
# **startKibanaClusterInstances**
> ClusterCommandResponse startKibanaClusterInstances(clusterId, instanceIds, ignoreMissing)

Start instances

Starts the specified Kibana instances.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
String clusterId = "clusterId_example"; // String | The Kibana deployment identifier.
List<String> instanceIds = Arrays.asList("instanceIds_example"); // List<String> | A comma-separated list of instance identifiers.
Boolean ignoreMissing = true; // Boolean | When `true` and the instance does not exist, proceeds to the next instance, or treats the instance as an error.
try {
    ClusterCommandResponse result = apiInstance.startKibanaClusterInstances(clusterId, instanceIds, ignoreMissing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#startKibanaClusterInstances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Kibana deployment identifier. |
 **instanceIds** | [**List&lt;String&gt;**](String.md)| A comma-separated list of instance identifiers. |
 **ignoreMissing** | **Boolean**| When &#x60;true&#x60; and the instance does not exist, proceeds to the next instance, or treats the instance as an error. | [optional]

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="startKibanaClusterInstancesAll"></a>
# **startKibanaClusterInstancesAll**
> ClusterCommandResponse startKibanaClusterInstancesAll(clusterId)

Start all instances

Starts all of the Kibana instances.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
String clusterId = "clusterId_example"; // String | The Kibana deployment identifier.
try {
    ClusterCommandResponse result = apiInstance.startKibanaClusterInstancesAll(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#startKibanaClusterInstancesAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Kibana deployment identifier. |

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="startKibanaClusterInstancesAllMaintenanceMode"></a>
# **startKibanaClusterInstancesAllMaintenanceMode**
> ClusterCommandResponse startKibanaClusterInstancesAllMaintenanceMode(clusterId)

Start maintenance mode all instances

Starts maintenance mode on all of the Kibana instances.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
String clusterId = "clusterId_example"; // String | The Kibana deployment identifier.
try {
    ClusterCommandResponse result = apiInstance.startKibanaClusterInstancesAllMaintenanceMode(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#startKibanaClusterInstancesAllMaintenanceMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Kibana deployment identifier. |

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="startKibanaClusterMaintenanceMode"></a>
# **startKibanaClusterMaintenanceMode**
> ClusterCommandResponse startKibanaClusterMaintenanceMode(clusterId, instanceIds, ignoreMissing)

Start maintenance mode

Starts maintenance mode on the specified Kibana instances.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
String clusterId = "clusterId_example"; // String | The Kibana deployment identifier.
List<String> instanceIds = Arrays.asList("instanceIds_example"); // List<String> | A comma-separated list of instance identifiers.
Boolean ignoreMissing = true; // Boolean | When `true` and the instance does not exist, proceeds to the next instance, or treats the instance as an error.
try {
    ClusterCommandResponse result = apiInstance.startKibanaClusterMaintenanceMode(clusterId, instanceIds, ignoreMissing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#startKibanaClusterMaintenanceMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Kibana deployment identifier. |
 **instanceIds** | [**List&lt;String&gt;**](String.md)| A comma-separated list of instance identifiers. |
 **ignoreMissing** | **Boolean**| When &#x60;true&#x60; and the instance does not exist, proceeds to the next instance, or treats the instance as an error. | [optional]

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="stopKibanaClusterInstances"></a>
# **stopKibanaClusterInstances**
> ClusterCommandResponse stopKibanaClusterInstances(clusterId, instanceIds, ignoreMissing)

Stop instances

Stops the specified Kibana instances.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
String clusterId = "clusterId_example"; // String | The Kibana deployment identifier.
List<String> instanceIds = Arrays.asList("instanceIds_example"); // List<String> | A comma-separated list of instance identifiers.
Boolean ignoreMissing = true; // Boolean | When `true` and the instance does not exist, proceeds to the next instance, or treats the instance as an error.
try {
    ClusterCommandResponse result = apiInstance.stopKibanaClusterInstances(clusterId, instanceIds, ignoreMissing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#stopKibanaClusterInstances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Kibana deployment identifier. |
 **instanceIds** | [**List&lt;String&gt;**](String.md)| A comma-separated list of instance identifiers. |
 **ignoreMissing** | **Boolean**| When &#x60;true&#x60; and the instance does not exist, proceeds to the next instance, or treats the instance as an error. | [optional]

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="stopKibanaClusterInstancesAll"></a>
# **stopKibanaClusterInstancesAll**
> ClusterCommandResponse stopKibanaClusterInstancesAll(clusterId)

Stop all instances

Stops all of the Kibana instances.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
String clusterId = "clusterId_example"; // String | The Kibana deployment identifier.
try {
    ClusterCommandResponse result = apiInstance.stopKibanaClusterInstancesAll(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#stopKibanaClusterInstancesAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Kibana deployment identifier. |

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="stopKibanaClusterInstancesAllMaintenanceMode"></a>
# **stopKibanaClusterInstancesAllMaintenanceMode**
> ClusterCommandResponse stopKibanaClusterInstancesAllMaintenanceMode(clusterId)

Stop maintenance mode all instances

Stops maintenance mode on all of the Kibana instances.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
String clusterId = "clusterId_example"; // String | The Kibana deployment identifier.
try {
    ClusterCommandResponse result = apiInstance.stopKibanaClusterInstancesAllMaintenanceMode(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#stopKibanaClusterInstancesAllMaintenanceMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Kibana deployment identifier. |

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="stopKibanaClusterMaintenanceMode"></a>
# **stopKibanaClusterMaintenanceMode**
> ClusterCommandResponse stopKibanaClusterMaintenanceMode(clusterId, instanceIds, ignoreMissing)

Stop maintenance mode

Stops maintenance mode on the specified Kibana instances.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
String clusterId = "clusterId_example"; // String | The Kibana deployment identifier.
List<String> instanceIds = Arrays.asList("instanceIds_example"); // List<String> | A comma-separated list of instance identifiers.
Boolean ignoreMissing = true; // Boolean | When `true` and the instance does not exist, proceeds to the next instance, or treats the instance as an error.
try {
    ClusterCommandResponse result = apiInstance.stopKibanaClusterMaintenanceMode(clusterId, instanceIds, ignoreMissing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#stopKibanaClusterMaintenanceMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Kibana deployment identifier. |
 **instanceIds** | [**List&lt;String&gt;**](String.md)| A comma-separated list of instance identifiers. |
 **ignoreMissing** | **Boolean**| When &#x60;true&#x60; and the instance does not exist, proceeds to the next instance, or treats the instance as an error. | [optional]

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateKibanaClusterMetadataSettings"></a>
# **updateKibanaClusterMetadataSettings**
> ClusterMetadataSettings updateKibanaClusterMetadataSettings(body, clusterId, version)

Update cluster metadata settings

All changes in the specified object are applied to the metadata object. Omitting existing fields causes the same values to be reapplied. Specifying a &#x60;null&#x60; value reverts the field to the default value, or removes the field when no default value exists.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
ClusterMetadataSettings body = new ClusterMetadataSettings(); // ClusterMetadataSettings | The cluster settings including updated values
String clusterId = "clusterId_example"; // String | The Kibana deployment identifier.
Integer version = 56; // Integer | Checks for conflicts against the metadata version, then returns the value in the `x-cloud-resource-version` header.
try {
    ClusterMetadataSettings result = apiInstance.updateKibanaClusterMetadataSettings(body, clusterId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#updateKibanaClusterMetadataSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClusterMetadataSettings**](ClusterMetadataSettings.md)| The cluster settings including updated values |
 **clusterId** | **String**| The Kibana deployment identifier. |
 **version** | **Integer**| Checks for conflicts against the metadata version, then returns the value in the &#x60;x-cloud-resource-version&#x60; header. | [optional]

### Return type

[**ClusterMetadataSettings**](ClusterMetadataSettings.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="updateKibanaClusterPlan"></a>
# **updateKibanaClusterPlan**
> ClusterCrudResponse updateKibanaClusterPlan(body, clusterId, validateOnly)

Update plan

Updates the configuration of the Kibana instance.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
KibanaClusterPlan body = new KibanaClusterPlan(); // KibanaClusterPlan | The update plan definition
String clusterId = "clusterId_example"; // String | The Kibana deployment identifier.
Boolean validateOnly = true; // Boolean | When `true`, validates the cluster definition without performing the update.
try {
    ClusterCrudResponse result = apiInstance.updateKibanaClusterPlan(body, clusterId, validateOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#updateKibanaClusterPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**KibanaClusterPlan**](KibanaClusterPlan.md)| The update plan definition |
 **clusterId** | **String**| The Kibana deployment identifier. |
 **validateOnly** | **Boolean**| When &#x60;true&#x60;, validates the cluster definition without performing the update. | [optional]

### Return type

[**ClusterCrudResponse**](ClusterCrudResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="upgradeKibanaCluster"></a>
# **upgradeKibanaCluster**
> ClusterUpgradeInfo upgradeKibanaCluster(clusterId, validateOnly)

Upgrade cluster

Upgrades an active Kibana instance.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersKibanaApi;

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

ClustersKibanaApi apiInstance = new ClustersKibanaApi();
String clusterId = "clusterId_example"; // String | The Kibana deployment identifier.
Boolean validateOnly = true; // Boolean | When `true`, returns the update version without performing the upgrade
try {
    ClusterUpgradeInfo result = apiInstance.upgradeKibanaCluster(clusterId, validateOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersKibanaApi#upgradeKibanaCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Kibana deployment identifier. |
 **validateOnly** | **Boolean**| When &#x60;true&#x60;, returns the update version without performing the upgrade | [optional]

### Return type

[**ClusterUpgradeInfo**](ClusterUpgradeInfo.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

