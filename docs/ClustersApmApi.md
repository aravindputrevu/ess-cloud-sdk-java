# ClustersApmApi

All URIs are relative to *https://{{hostname}}/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelApmPendingPlan**](ClustersApmApi.md#cancelApmPendingPlan) | **DELETE** /clusters/apm/{cluster_id}/plan/pending | Cancel pending plan
[**createApm**](ClustersApmApi.md#createApm) | **POST** /clusters/apm | Create cluster
[**deleteApm**](ClustersApmApi.md#deleteApm) | **DELETE** /clusters/apm/{cluster_id} | Delete cluster
[**getApmCluster**](ClustersApmApi.md#getApmCluster) | **GET** /clusters/apm/{cluster_id} | Get cluster
[**getApmClusterPlanActivity**](ClustersApmApi.md#getApmClusterPlanActivity) | **GET** /clusters/apm/{cluster_id}/plan/activity | Get plan activity
[**getApmClusters**](ClustersApmApi.md#getApmClusters) | **GET** /clusters/apm | Get clusters
[**getApmMetadataRaw**](ClustersApmApi.md#getApmMetadataRaw) | **GET** /clusters/apm/{cluster_id}/metadata/raw | Get cluster metadata
[**getApmMetadataSettings**](ClustersApmApi.md#getApmMetadataSettings) | **GET** /clusters/apm/{cluster_id}/metadata/settings | Get cluster metadata settings
[**getApmPendingPlan**](ClustersApmApi.md#getApmPendingPlan) | **GET** /clusters/apm/{cluster_id}/plan/pending | Get pending plan
[**getApmPlan**](ClustersApmApi.md#getApmPlan) | **GET** /clusters/apm/{cluster_id}/plan | Get plan
[**moveApmInstances**](ClustersApmApi.md#moveApmInstances) | **POST** /clusters/apm/{cluster_id}/instances/{instance_ids}/_move | Move instances
[**moveApmInstancesAdvanced**](ClustersApmApi.md#moveApmInstancesAdvanced) | **POST** /clusters/apm/{cluster_id}/instances/_move | Move instances (advanced)
[**resetApmSecretToken**](ClustersApmApi.md#resetApmSecretToken) | **POST** /clusters/apm/{cluster_id}/_reset-token | Reset token
[**restartApm**](ClustersApmApi.md#restartApm) | **POST** /clusters/apm/{cluster_id}/_restart | Restart cluster
[**resyncApmCluster**](ClustersApmApi.md#resyncApmCluster) | **POST** /clusters/apm/{cluster_id}/_resync | Resynchronize cluster
[**resyncApmClusters**](ClustersApmApi.md#resyncApmClusters) | **POST** /clusters/apm/_resync | Resynchronize clusters
[**searchApms**](ClustersApmApi.md#searchApms) | **POST** /clusters/apm/_search | Search clusters
[**setApmMetadataRaw**](ClustersApmApi.md#setApmMetadataRaw) | **POST** /clusters/apm/{cluster_id}/metadata/raw | Set cluster metadata
[**setApmName**](ClustersApmApi.md#setApmName) | **PUT** /clusters/apm/{cluster_id}/metadata/name/{new_name} | Set cluster name
[**shutdownApm**](ClustersApmApi.md#shutdownApm) | **POST** /clusters/apm/{cluster_id}/_shutdown | Shut down cluster
[**startApmInstances**](ClustersApmApi.md#startApmInstances) | **POST** /clusters/apm/{cluster_id}/instances/{instance_ids}/_start | Start instances
[**startApmInstancesAll**](ClustersApmApi.md#startApmInstancesAll) | **POST** /clusters/apm/{cluster_id}/instances/_start | Start all instances
[**startApmInstancesAllMaintenanceMode**](ClustersApmApi.md#startApmInstancesAllMaintenanceMode) | **POST** /clusters/apm/{cluster_id}/instances/maintenance-mode/_start | Start maintenance mode all instances
[**startApmMaintenanceMode**](ClustersApmApi.md#startApmMaintenanceMode) | **POST** /clusters/apm/{cluster_id}/instances/{instance_ids}/maintenance-mode/_start | Start maintenance mode
[**stopApmInstances**](ClustersApmApi.md#stopApmInstances) | **POST** /clusters/apm/{cluster_id}/instances/{instance_ids}/_stop | Stop instances
[**stopApmInstancesAll**](ClustersApmApi.md#stopApmInstancesAll) | **POST** /clusters/apm/{cluster_id}/instances/_stop | Stop all instances
[**stopApmInstancesAllMaintenanceMode**](ClustersApmApi.md#stopApmInstancesAllMaintenanceMode) | **POST** /clusters/apm/{cluster_id}/instances/maintenance-mode/_stop | Stop maintenance mode all instances
[**stopApmMaintenanceMode**](ClustersApmApi.md#stopApmMaintenanceMode) | **POST** /clusters/apm/{cluster_id}/instances/{instance_ids}/maintenance-mode/_stop | Stop maintenance mode
[**updateApmMetadataSettings**](ClustersApmApi.md#updateApmMetadataSettings) | **PATCH** /clusters/apm/{cluster_id}/metadata/settings | Update cluster metadata settings
[**updateApmPlan**](ClustersApmApi.md#updateApmPlan) | **POST** /clusters/apm/{cluster_id}/plan | Update plan
[**upgradeApm**](ClustersApmApi.md#upgradeApm) | **POST** /clusters/apm/{cluster_id}/_upgrade | Upgrade cluster

<a name="cancelApmPendingPlan"></a>
# **cancelApmPendingPlan**
> ApmCrudResponse cancelApmPendingPlan(clusterId, ignoreMissing, forceDelete)

Cancel pending plan

Cancels the pending plan of an APM cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
String clusterId = "clusterId_example"; // String | The APM deployment identifier.
Boolean ignoreMissing = true; // Boolean | When `true`, returns successfully, even when plans are pending. The default is `false`.
Boolean forceDelete = true; // Boolean | When `true`, deletes the pending plan instead of attempting a graceful cancellation. The default is `false`.
try {
    ApmCrudResponse result = apiInstance.cancelApmPendingPlan(clusterId, ignoreMissing, forceDelete);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#cancelApmPendingPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The APM deployment identifier. |
 **ignoreMissing** | **Boolean**| When &#x60;true&#x60;, returns successfully, even when plans are pending. The default is &#x60;false&#x60;. | [optional]
 **forceDelete** | **Boolean**| When &#x60;true&#x60;, deletes the pending plan instead of attempting a graceful cancellation. The default is &#x60;false&#x60;. | [optional]

### Return type

[**ApmCrudResponse**](ApmCrudResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="createApm"></a>
# **createApm**
> ApmCrudResponse createApm(body, validateOnly)

Create cluster

Creates an APM cluster for a given Elasticsearch cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
CreateApmRequest body = new CreateApmRequest(); // CreateApmRequest | The cluster definition
Boolean validateOnly = true; // Boolean | When `true`, validates the cluster definition without creating the cluster.
try {
    ApmCrudResponse result = apiInstance.createApm(body, validateOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#createApm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateApmRequest**](CreateApmRequest.md)| The cluster definition |
 **validateOnly** | **Boolean**| When &#x60;true&#x60;, validates the cluster definition without creating the cluster. | [optional]

### Return type

[**ApmCrudResponse**](ApmCrudResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="deleteApm"></a>
# **deleteApm**
> EmptyResponse deleteApm(clusterId)

Delete cluster

Deletes an APM cluster. Requires that you have already successfully issued &#x60;_shutdown&#x60; command against the cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
String clusterId = "clusterId_example"; // String | The APM deployment identifier.
try {
    EmptyResponse result = apiInstance.deleteApm(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#deleteApm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The APM deployment identifier. |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getApmCluster"></a>
# **getApmCluster**
> ApmInfo getApmCluster(clusterId, showMetadata, showPlans, showPlanLogs, showPlanDefaults, showSettings)

Get cluster

Retrieves cluster information for a APM cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
String clusterId = "clusterId_example"; // String | The APM deployment identifier.
Boolean showMetadata = true; // Boolean | Includes all of the cluster metadata in the response. NOTE: Responses can include a large amount of metadata, as well as credentials.
Boolean showPlans = true; // Boolean | Includes the active and pending plan information in the response. NOTE: This option can result in large responses.
Boolean showPlanLogs = true; // Boolean | Includes the active, pending, and historical plan information in the attempt log. NOTE: This option can result in large responses.
Boolean showPlanDefaults = true; // Boolean | When plans are shown, includes the default values in the response. NOTE: This option results in large responses.
Boolean showSettings = true; // Boolean | Includes the cluster settings in the response.
try {
    ApmInfo result = apiInstance.getApmCluster(clusterId, showMetadata, showPlans, showPlanLogs, showPlanDefaults, showSettings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#getApmCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The APM deployment identifier. |
 **showMetadata** | **Boolean**| Includes all of the cluster metadata in the response. NOTE: Responses can include a large amount of metadata, as well as credentials. | [optional]
 **showPlans** | **Boolean**| Includes the active and pending plan information in the response. NOTE: This option can result in large responses. | [optional]
 **showPlanLogs** | **Boolean**| Includes the active, pending, and historical plan information in the attempt log. NOTE: This option can result in large responses. | [optional]
 **showPlanDefaults** | **Boolean**| When plans are shown, includes the default values in the response. NOTE: This option results in large responses. | [optional]
 **showSettings** | **Boolean**| Includes the cluster settings in the response. | [optional]

### Return type

[**ApmInfo**](ApmInfo.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getApmClusterPlanActivity"></a>
# **getApmClusterPlanActivity**
> ApmPlansInfo getApmClusterPlanActivity(clusterId, showPlanLogs, showPlanDefaults)

Get plan activity

Retrieves the current and historical plan information for a APM cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
String clusterId = "clusterId_example"; // String | The APM deployment identifier.
Boolean showPlanLogs = true; // Boolean | Includes the active, pending, and historical plan information in the attempt log. NOTE: This option can result in large responses.
Boolean showPlanDefaults = true; // Boolean | When plans are shown, includes the default values in the response. NOTE: This option results in large responses.
try {
    ApmPlansInfo result = apiInstance.getApmClusterPlanActivity(clusterId, showPlanLogs, showPlanDefaults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#getApmClusterPlanActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The APM deployment identifier. |
 **showPlanLogs** | **Boolean**| Includes the active, pending, and historical plan information in the attempt log. NOTE: This option can result in large responses. | [optional]
 **showPlanDefaults** | **Boolean**| When plans are shown, includes the default values in the response. NOTE: This option results in large responses. | [optional]

### Return type

[**ApmPlansInfo**](ApmPlansInfo.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getApmClusters"></a>
# **getApmClusters**
> ApmsInfo getApmClusters(from, size, q, showMetadata, showPlans, showHidden, showPlanDefaults, showSettings)

Get clusters

Retrieves cluster information for all APM clusters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
Integer from = 56; // Integer | The number of clusters to skip.
Integer size = 56; // Integer | The maximum number of clusters to include in the response. For all clusters, use -1. NOTE: This option can result in large responses.
String q = "q_example"; // String | An optional query to filter APM clusters by. Maps to an Elasticsearch query_string query.
Boolean showMetadata = true; // Boolean | Includes all of the cluster metadata in the response. NOTE: Responses can include a large amount of metadata, as well as credentials.
Boolean showPlans = true; // Boolean | Includes the active and pending plan information in the response. NOTE: This option can result in large responses.
Boolean showHidden = true; // Boolean | Includes the hidden clusters in the response.
Boolean showPlanDefaults = true; // Boolean | When plans are shown, includes the default values in the response. NOTE: This option results in large responses.
Boolean showSettings = true; // Boolean | Includes the cluster settings in the response.
try {
    ApmsInfo result = apiInstance.getApmClusters(from, size, q, showMetadata, showPlans, showHidden, showPlanDefaults, showSettings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#getApmClusters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **Integer**| The number of clusters to skip. | [optional]
 **size** | **Integer**| The maximum number of clusters to include in the response. For all clusters, use -1. NOTE: This option can result in large responses. | [optional]
 **q** | **String**| An optional query to filter APM clusters by. Maps to an Elasticsearch query_string query. | [optional]
 **showMetadata** | **Boolean**| Includes all of the cluster metadata in the response. NOTE: Responses can include a large amount of metadata, as well as credentials. | [optional]
 **showPlans** | **Boolean**| Includes the active and pending plan information in the response. NOTE: This option can result in large responses. | [optional]
 **showHidden** | **Boolean**| Includes the hidden clusters in the response. | [optional]
 **showPlanDefaults** | **Boolean**| When plans are shown, includes the default values in the response. NOTE: This option results in large responses. | [optional]
 **showSettings** | **Boolean**| Includes the cluster settings in the response. | [optional]

### Return type

[**ApmsInfo**](ApmsInfo.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getApmMetadataRaw"></a>
# **getApmMetadataRaw**
> Object getApmMetadataRaw(clusterId)

Get cluster metadata

Advanced use only. Retrieves the internal metadata, in free-form JSON, for the APM instance.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
String clusterId = "clusterId_example"; // String | The APM deployment identifier.
try {
    Object result = apiInstance.getApmMetadataRaw(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#getApmMetadataRaw");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The APM deployment identifier. |

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getApmMetadataSettings"></a>
# **getApmMetadataSettings**
> ClusterMetadataSettings getApmMetadataSettings(clusterId)

Get cluster metadata settings

Retrieves a structured version of the cluster metadata as a collection of top-level settings. If a particular setting isn&#x27;t returned, then the free-form JSON endpoint (&#x60;/metadata/raw&#x60;) must be used.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
String clusterId = "clusterId_example"; // String | The APM deployment identifier.
try {
    ClusterMetadataSettings result = apiInstance.getApmMetadataSettings(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#getApmMetadataSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The APM deployment identifier. |

### Return type

[**ClusterMetadataSettings**](ClusterMetadataSettings.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getApmPendingPlan"></a>
# **getApmPendingPlan**
> ApmPlan getApmPendingPlan(clusterId, showPlanDefaults)

Get pending plan

Retrieves the pending plan of an APM cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
String clusterId = "clusterId_example"; // String | The APM deployment identifier.
Boolean showPlanDefaults = true; // Boolean | When plans are shown, includes the default values in the response. NOTE: This option results in large responses.
try {
    ApmPlan result = apiInstance.getApmPendingPlan(clusterId, showPlanDefaults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#getApmPendingPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The APM deployment identifier. |
 **showPlanDefaults** | **Boolean**| When plans are shown, includes the default values in the response. NOTE: This option results in large responses. | [optional]

### Return type

[**ApmPlan**](ApmPlan.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getApmPlan"></a>
# **getApmPlan**
> ApmPlan getApmPlan(clusterId, showPlanDefaults)

Get plan

Retrieves the active plan of an APM cluster. Transient settings are not show by this endpoint. To view the transient settings that have been applied with a specific plan, use the activity endpoint.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
String clusterId = "clusterId_example"; // String | The APM deployment identifier.
Boolean showPlanDefaults = true; // Boolean | When plans are shown, includes the default values in the response. NOTE: This option results in large responses.
try {
    ApmPlan result = apiInstance.getApmPlan(clusterId, showPlanDefaults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#getApmPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The APM deployment identifier. |
 **showPlanDefaults** | **Boolean**| When plans are shown, includes the default values in the response. NOTE: This option results in large responses. | [optional]

### Return type

[**ApmPlan**](ApmPlan.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="moveApmInstances"></a>
# **moveApmInstances**
> ClusterCommandResponse moveApmInstances(clusterId, instanceIds, body, ignoreMissing, forceUpdate, validateOnly)

Move instances

Moves one or more instances belonging to a Apm cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
String clusterId = "clusterId_example"; // String | The APM deployment identifier.
List<String> instanceIds = Arrays.asList("instanceIds_example"); // List<String> | A comma-separated list of instance identifiers.
TransientApmPlanConfiguration body = new TransientApmPlanConfiguration(); // TransientApmPlanConfiguration | Overrides defaults for the move, including setting the configuration of instances specified in the path
Boolean ignoreMissing = true; // Boolean | When `true` and the instance does not exist, proceeds to the next instance, or treats the instance as an error.
Boolean forceUpdate = true; // Boolean | When `true`, cancels and overwrites the pending plans, or treats the instance as an error.
Boolean validateOnly = true; // Boolean | When `true`, validates the move request, then returns the calculated plan without applying the plan.
try {
    ClusterCommandResponse result = apiInstance.moveApmInstances(clusterId, instanceIds, body, ignoreMissing, forceUpdate, validateOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#moveApmInstances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The APM deployment identifier. |
 **instanceIds** | [**List&lt;String&gt;**](String.md)| A comma-separated list of instance identifiers. |
 **body** | [**TransientApmPlanConfiguration**](TransientApmPlanConfiguration.md)| Overrides defaults for the move, including setting the configuration of instances specified in the path | [optional]
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

<a name="moveApmInstancesAdvanced"></a>
# **moveApmInstancesAdvanced**
> ClusterCommandResponse moveApmInstancesAdvanced(body, clusterId, forceUpdate, validateOnly)

Move instances (advanced)

Moves instances belonging to a Apm cluster, with custom configuration posted in the body.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
TransientApmPlanConfiguration body = new TransientApmPlanConfiguration(); // TransientApmPlanConfiguration | Overrides defaults for the move, including setting the configuration of instances specified in the path
String clusterId = "clusterId_example"; // String | The APM deployment identifier.
Boolean forceUpdate = true; // Boolean | When `true`, cancels and overwrites the pending plans, or treats the instance as an error.
Boolean validateOnly = true; // Boolean | When `true`, validates the move request, then returns the calculated plan without applying the plan.
try {
    ClusterCommandResponse result = apiInstance.moveApmInstancesAdvanced(body, clusterId, forceUpdate, validateOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#moveApmInstancesAdvanced");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransientApmPlanConfiguration**](TransientApmPlanConfiguration.md)| Overrides defaults for the move, including setting the configuration of instances specified in the path |
 **clusterId** | **String**| The APM deployment identifier. |
 **forceUpdate** | **Boolean**| When &#x60;true&#x60;, cancels and overwrites the pending plans, or treats the instance as an error. | [optional]
 **validateOnly** | **Boolean**| When &#x60;true&#x60;, validates the move request, then returns the calculated plan without applying the plan. | [optional]

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="resetApmSecretToken"></a>
# **resetApmSecretToken**
> ApmCrudResponse resetApmSecretToken(clusterId)

Reset token

Resets the secret token for a given APM cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
String clusterId = "clusterId_example"; // String | APM instance identifier
try {
    ApmCrudResponse result = apiInstance.resetApmSecretToken(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#resetApmSecretToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| APM instance identifier |

### Return type

[**ApmCrudResponse**](ApmCrudResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="restartApm"></a>
# **restartApm**
> ClusterCommandResponse restartApm(clusterId, cancelPending)

Restart cluster

Restarts a Apm cluster. If a cluster is active: this command re-applies the existing plan but applies a \&quot;cluster_reboot\&quot;, which issues a Apm restart command and waits for it to complete. If a cluster is inactive: this command starts it up with the most recent successful plan.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
String clusterId = "clusterId_example"; // String | The APM deployment identifier.
Boolean cancelPending = true; // Boolean | When `true`, cancels the pending plans, then restarts the cluster.
try {
    ClusterCommandResponse result = apiInstance.restartApm(clusterId, cancelPending);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#restartApm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The APM deployment identifier. |
 **cancelPending** | **Boolean**| When &#x60;true&#x60;, cancels the pending plans, then restarts the cluster. | [optional]

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="resyncApmCluster"></a>
# **resyncApmCluster**
> EmptyResponse resyncApmCluster(clusterId)

Resynchronize cluster

Immediately resynchronizes the search index and cache for the selected APM cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
String clusterId = "clusterId_example"; // String | The APM cluster identifier.
try {
    EmptyResponse result = apiInstance.resyncApmCluster(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#resyncApmCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The APM cluster identifier. |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="resyncApmClusters"></a>
# **resyncApmClusters**
> ModelVersionIndexSynchronizationResults resyncApmClusters(skipMatchingVersion)

Resynchronize clusters

Asynchronously resynchronizes the search index for all APM clusters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
Boolean skipMatchingVersion = true; // Boolean | When true, skips the document indexing when the version matches the in-memory copy.
try {
    ModelVersionIndexSynchronizationResults result = apiInstance.resyncApmClusters(skipMatchingVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#resyncApmClusters");
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

<a name="searchApms"></a>
# **searchApms**
> ApmsInfo searchApms(body)

Search clusters

Retrieves cluster information for all Apm clusters that match a given query.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
SearchRequest body = new SearchRequest(); // SearchRequest | (Optional) The search request to execute. NOTE: When not specified, all of the clusters are matched.
try {
    ApmsInfo result = apiInstance.searchApms(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#searchApms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchRequest**](SearchRequest.md)| (Optional) The search request to execute. NOTE: When not specified, all of the clusters are matched. | [optional]

### Return type

[**ApmsInfo**](ApmsInfo.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="setApmMetadataRaw"></a>
# **setApmMetadataRaw**
> Object setApmMetadataRaw(body, clusterId, version)

Set cluster metadata

Advanced use only. Sets the internal metadata, in free-form JSON, for the APM instance. Only use the parameters to set the modified JSON that is returned from the get version of the metadata.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
String body = "body_example"; // String | The freeform JSON for the cluster (should always be based on the current version retrieved from the GET)
String clusterId = "clusterId_example"; // String | The APM deployment identifier.
Integer version = 56; // Integer | Checks for conflicts against the metadata version, then returns the value in the `x-cloud-resource-version` header.
try {
    Object result = apiInstance.setApmMetadataRaw(body, clusterId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#setApmMetadataRaw");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| The freeform JSON for the cluster (should always be based on the current version retrieved from the GET) |
 **clusterId** | **String**| The APM deployment identifier. |
 **version** | **Integer**| Checks for conflicts against the metadata version, then returns the value in the &#x60;x-cloud-resource-version&#x60; header. | [optional]

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="setApmName"></a>
# **setApmName**
> EmptyResponse setApmName(clusterId, newName)

Set cluster name

Assigns a name to the APM instance.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
String clusterId = "clusterId_example"; // String | The APM deployment identifier.
String newName = "newName_example"; // String | The new name for the cluster.
try {
    EmptyResponse result = apiInstance.setApmName(clusterId, newName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#setApmName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The APM deployment identifier. |
 **newName** | **String**| The new name for the cluster. |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="shutdownApm"></a>
# **shutdownApm**
> ClusterCommandResponse shutdownApm(clusterId, hide)

Shut down cluster

Shuts down a running cluster and removes all nodes belonging to the cluster. The cluster definition is retained. Warning: this will lose all cluster data that is not saved in a snapshot repository.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
String clusterId = "clusterId_example"; // String | The APM deployment identifier.
Boolean hide = true; // Boolean | Hides the clusters during shutdown. NOTE: By default, hidden clusters are not listed.
try {
    ClusterCommandResponse result = apiInstance.shutdownApm(clusterId, hide);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#shutdownApm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The APM deployment identifier. |
 **hide** | **Boolean**| Hides the clusters during shutdown. NOTE: By default, hidden clusters are not listed. | [optional]

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="startApmInstances"></a>
# **startApmInstances**
> ClusterCommandResponse startApmInstances(clusterId, instanceIds, ignoreMissing)

Start instances

Starts the instances belonging to a Apm cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
String clusterId = "clusterId_example"; // String | The APM deployment identifier.
List<String> instanceIds = Arrays.asList("instanceIds_example"); // List<String> | A comma-separated list of instance identifiers.
Boolean ignoreMissing = true; // Boolean | When `true` and the instance does not exist, proceeds to the next instance, or treats the instance as an error.
try {
    ClusterCommandResponse result = apiInstance.startApmInstances(clusterId, instanceIds, ignoreMissing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#startApmInstances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The APM deployment identifier. |
 **instanceIds** | [**List&lt;String&gt;**](String.md)| A comma-separated list of instance identifiers. |
 **ignoreMissing** | **Boolean**| When &#x60;true&#x60; and the instance does not exist, proceeds to the next instance, or treats the instance as an error. | [optional]

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="startApmInstancesAll"></a>
# **startApmInstancesAll**
> ClusterCommandResponse startApmInstancesAll(clusterId)

Start all instances

Starts all the instances belonging to a Apm cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
String clusterId = "clusterId_example"; // String | The APM deployment identifier.
try {
    ClusterCommandResponse result = apiInstance.startApmInstancesAll(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#startApmInstancesAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The APM deployment identifier. |

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="startApmInstancesAllMaintenanceMode"></a>
# **startApmInstancesAllMaintenanceMode**
> ClusterCommandResponse startApmInstancesAllMaintenanceMode(clusterId)

Start maintenance mode all instances

Starts maintenance mode of all instances belonging to a Apm cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
String clusterId = "clusterId_example"; // String | The APM deployment identifier.
try {
    ClusterCommandResponse result = apiInstance.startApmInstancesAllMaintenanceMode(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#startApmInstancesAllMaintenanceMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The APM deployment identifier. |

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="startApmMaintenanceMode"></a>
# **startApmMaintenanceMode**
> ClusterCommandResponse startApmMaintenanceMode(clusterId, instanceIds, ignoreMissing)

Start maintenance mode

Starts maintenance mode of instances belonging to a Apm cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
String clusterId = "clusterId_example"; // String | The APM deployment identifier.
List<String> instanceIds = Arrays.asList("instanceIds_example"); // List<String> | A comma-separated list of instance identifiers.
Boolean ignoreMissing = true; // Boolean | When `true` and the instance does not exist, proceeds to the next instance, or treats the instance as an error.
try {
    ClusterCommandResponse result = apiInstance.startApmMaintenanceMode(clusterId, instanceIds, ignoreMissing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#startApmMaintenanceMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The APM deployment identifier. |
 **instanceIds** | [**List&lt;String&gt;**](String.md)| A comma-separated list of instance identifiers. |
 **ignoreMissing** | **Boolean**| When &#x60;true&#x60; and the instance does not exist, proceeds to the next instance, or treats the instance as an error. | [optional]

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="stopApmInstances"></a>
# **stopApmInstances**
> ClusterCommandResponse stopApmInstances(clusterId, instanceIds, ignoreMissing)

Stop instances

Stops the instances belonging to a Apm cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
String clusterId = "clusterId_example"; // String | The APM deployment identifier.
List<String> instanceIds = Arrays.asList("instanceIds_example"); // List<String> | A comma-separated list of instance identifiers.
Boolean ignoreMissing = true; // Boolean | When `true` and the instance does not exist, proceeds to the next instance, or treats the instance as an error.
try {
    ClusterCommandResponse result = apiInstance.stopApmInstances(clusterId, instanceIds, ignoreMissing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#stopApmInstances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The APM deployment identifier. |
 **instanceIds** | [**List&lt;String&gt;**](String.md)| A comma-separated list of instance identifiers. |
 **ignoreMissing** | **Boolean**| When &#x60;true&#x60; and the instance does not exist, proceeds to the next instance, or treats the instance as an error. | [optional]

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="stopApmInstancesAll"></a>
# **stopApmInstancesAll**
> ClusterCommandResponse stopApmInstancesAll(clusterId)

Stop all instances

Stops all the instances belonging to a Apm cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
String clusterId = "clusterId_example"; // String | The APM deployment identifier.
try {
    ClusterCommandResponse result = apiInstance.stopApmInstancesAll(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#stopApmInstancesAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The APM deployment identifier. |

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="stopApmInstancesAllMaintenanceMode"></a>
# **stopApmInstancesAllMaintenanceMode**
> ClusterCommandResponse stopApmInstancesAllMaintenanceMode(clusterId)

Stop maintenance mode all instances

Stops maintenance mode of all instances belonging to a Apm cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
String clusterId = "clusterId_example"; // String | The APM deployment identifier.
try {
    ClusterCommandResponse result = apiInstance.stopApmInstancesAllMaintenanceMode(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#stopApmInstancesAllMaintenanceMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The APM deployment identifier. |

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="stopApmMaintenanceMode"></a>
# **stopApmMaintenanceMode**
> ClusterCommandResponse stopApmMaintenanceMode(clusterId, instanceIds, ignoreMissing)

Stop maintenance mode

Stops maintenance mode of instances belonging to a Apm cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
String clusterId = "clusterId_example"; // String | The APM deployment identifier.
List<String> instanceIds = Arrays.asList("instanceIds_example"); // List<String> | A comma-separated list of instance identifiers.
Boolean ignoreMissing = true; // Boolean | When `true` and the instance does not exist, proceeds to the next instance, or treats the instance as an error.
try {
    ClusterCommandResponse result = apiInstance.stopApmMaintenanceMode(clusterId, instanceIds, ignoreMissing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#stopApmMaintenanceMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The APM deployment identifier. |
 **instanceIds** | [**List&lt;String&gt;**](String.md)| A comma-separated list of instance identifiers. |
 **ignoreMissing** | **Boolean**| When &#x60;true&#x60; and the instance does not exist, proceeds to the next instance, or treats the instance as an error. | [optional]

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateApmMetadataSettings"></a>
# **updateApmMetadataSettings**
> ClusterMetadataSettings updateApmMetadataSettings(body, clusterId, version)

Update cluster metadata settings

All changes in the specified object are applied to the metadata object. Omitting existing fields causes the same values to be reapplied.Specifying a &#x60;null&#x60; value reverts the field to the default value, or removes the field when no default value exists.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
ClusterMetadataSettings body = new ClusterMetadataSettings(); // ClusterMetadataSettings | The cluster settings including updated values
String clusterId = "clusterId_example"; // String | The APM deployment identifier.
Integer version = 56; // Integer | Checks for conflicts against the metadata version, then returns the value in the `x-cloud-resource-version` header.
try {
    ClusterMetadataSettings result = apiInstance.updateApmMetadataSettings(body, clusterId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#updateApmMetadataSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClusterMetadataSettings**](ClusterMetadataSettings.md)| The cluster settings including updated values |
 **clusterId** | **String**| The APM deployment identifier. |
 **version** | **Integer**| Checks for conflicts against the metadata version, then returns the value in the &#x60;x-cloud-resource-version&#x60; header. | [optional]

### Return type

[**ClusterMetadataSettings**](ClusterMetadataSettings.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="updateApmPlan"></a>
# **updateApmPlan**
> ApmCrudResponse updateApmPlan(body, clusterId, validateOnly)

Update plan

Updates the configuration of an existing Apm cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
ApmPlan body = new ApmPlan(); // ApmPlan | The update plan definition
String clusterId = "clusterId_example"; // String | The APM deployment identifier.
Boolean validateOnly = true; // Boolean | When `true`, validates the cluster definition without performing the update.
try {
    ApmCrudResponse result = apiInstance.updateApmPlan(body, clusterId, validateOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#updateApmPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApmPlan**](ApmPlan.md)| The update plan definition |
 **clusterId** | **String**| The APM deployment identifier. |
 **validateOnly** | **Boolean**| When &#x60;true&#x60;, validates the cluster definition without performing the update. | [optional]

### Return type

[**ApmCrudResponse**](ApmCrudResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="upgradeApm"></a>
# **upgradeApm**
> ClusterUpgradeInfo upgradeApm(clusterId, validateOnly)

Upgrade cluster

Upgrades a running cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersApmApi;

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

ClustersApmApi apiInstance = new ClustersApmApi();
String clusterId = "clusterId_example"; // String | The APM deployment identifier.
Boolean validateOnly = true; // Boolean | When `true`, returns the update version without performing the upgrade
try {
    ClusterUpgradeInfo result = apiInstance.upgradeApm(clusterId, validateOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApmApi#upgradeApm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The APM deployment identifier. |
 **validateOnly** | **Boolean**| When &#x60;true&#x60;, returns the update version without performing the upgrade | [optional]

### Return type

[**ClusterUpgradeInfo**](ClusterUpgradeInfo.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

