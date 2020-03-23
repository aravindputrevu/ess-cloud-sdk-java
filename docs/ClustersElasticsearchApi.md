# ClustersElasticsearchApi

All URIs are relative to *https://{{hostname}}/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelEsClusterMonitoring**](ClustersElasticsearchApi.md#cancelEsClusterMonitoring) | **DELETE** /clusters/elasticsearch/{cluster_id}/monitoring | Cancel monitoring
[**cancelEsClusterPendingPlan**](ClustersElasticsearchApi.md#cancelEsClusterPendingPlan) | **DELETE** /clusters/elasticsearch/{cluster_id}/plan/pending | Cancel pending plan
[**createEsCluster**](ClustersElasticsearchApi.md#createEsCluster) | **POST** /clusters/elasticsearch | Create cluster
[**deleteEsCluster**](ClustersElasticsearchApi.md#deleteEsCluster) | **DELETE** /clusters/elasticsearch/{cluster_id} | Delete cluster
[**deleteEsProxyRequests**](ClustersElasticsearchApi.md#deleteEsProxyRequests) | **DELETE** /clusters/elasticsearch/{cluster_id}/proxy/{elasticsearch_path} | Proxies HTTP DELETE request to the cluster
[**generateEsClusterDiagnostics**](ClustersElasticsearchApi.md#generateEsClusterDiagnostics) | **GET** /clusters/elasticsearch/{cluster_id}/support/_generate-diagnostics | Generate diagnostics
[**generateEsClusterLogs**](ClustersElasticsearchApi.md#generateEsClusterLogs) | **GET** /clusters/elasticsearch/{cluster_id}/support/_generate-logs | Generate logs
[**getEsCcsEligibleRemotes**](ClustersElasticsearchApi.md#getEsCcsEligibleRemotes) | **GET** /clusters/elasticsearch/ccs/eligible_remotes | Search clusters that can be used as cross-cluster search remotes
[**getEsCluster**](ClustersElasticsearchApi.md#getEsCluster) | **GET** /clusters/elasticsearch/{cluster_id} | Get cluster
[**getEsClusterCcs**](ClustersElasticsearchApi.md#getEsClusterCcs) | **GET** /clusters/elasticsearch/{cluster_id}/ccs | Get cross-cluster search clusters
[**getEsClusterCcsSettings**](ClustersElasticsearchApi.md#getEsClusterCcsSettings) | **GET** /clusters/elasticsearch/{cluster_id}/ccs/settings | Get remote clusters for cross-cluster search
[**getEsClusterCurationSettings**](ClustersElasticsearchApi.md#getEsClusterCurationSettings) | **GET** /clusters/elasticsearch/{cluster_id}/curation/settings | Get cluster curation settings
[**getEsClusterKeystore**](ClustersElasticsearchApi.md#getEsClusterKeystore) | **GET** /clusters/elasticsearch/{cluster_id}/keystore | Get settings from this cluster&#x27;s keystore
[**getEsClusterMetadataRaw**](ClustersElasticsearchApi.md#getEsClusterMetadataRaw) | **GET** /clusters/elasticsearch/{cluster_id}/metadata/raw | Get cluster metadata
[**getEsClusterMetadataSettings**](ClustersElasticsearchApi.md#getEsClusterMetadataSettings) | **GET** /clusters/elasticsearch/{cluster_id}/metadata/settings | Get cluster metadata settings
[**getEsClusterPendingPlan**](ClustersElasticsearchApi.md#getEsClusterPendingPlan) | **GET** /clusters/elasticsearch/{cluster_id}/plan/pending | Get pending plan
[**getEsClusterPlan**](ClustersElasticsearchApi.md#getEsClusterPlan) | **GET** /clusters/elasticsearch/{cluster_id}/plan | Get plan
[**getEsClusterPlanActivity**](ClustersElasticsearchApi.md#getEsClusterPlanActivity) | **GET** /clusters/elasticsearch/{cluster_id}/plan/activity | Get plan activity
[**getEsClusterSnapshotSettings**](ClustersElasticsearchApi.md#getEsClusterSnapshotSettings) | **GET** /clusters/elasticsearch/{cluster_id}/snapshot/settings | Get cluster snapshot settings
[**getEsClusters**](ClustersElasticsearchApi.md#getEsClusters) | **GET** /clusters/elasticsearch | Get clusters
[**getEsProxyRequests**](ClustersElasticsearchApi.md#getEsProxyRequests) | **GET** /clusters/elasticsearch/{cluster_id}/proxy/{elasticsearch_path} | Proxies HTTP GET request to the cluster
[**migrateEsClusterPlan**](ClustersElasticsearchApi.md#migrateEsClusterPlan) | **POST** /clusters/elasticsearch/{cluster_id}/plan/_migrate | Migrate plan
[**moveEsClusterInstances**](ClustersElasticsearchApi.md#moveEsClusterInstances) | **POST** /clusters/elasticsearch/{cluster_id}/instances/{instance_ids}/_move | Move instances
[**moveEsClusterInstancesAdvanced**](ClustersElasticsearchApi.md#moveEsClusterInstancesAdvanced) | **POST** /clusters/elasticsearch/{cluster_id}/instances/_move | Move instances (advanced)
[**postEsProxyRequests**](ClustersElasticsearchApi.md#postEsProxyRequests) | **POST** /clusters/elasticsearch/{cluster_id}/proxy/{elasticsearch_path} | Proxies HTTP POST request to the cluster
[**putEsProxyRequests**](ClustersElasticsearchApi.md#putEsProxyRequests) | **PUT** /clusters/elasticsearch/{cluster_id}/proxy/{elasticsearch_path} | Proxies HTTP PUT request to the cluster
[**restartEsCluster**](ClustersElasticsearchApi.md#restartEsCluster) | **POST** /clusters/elasticsearch/{cluster_id}/_restart | Restart cluster
[**resyncEsCluster**](ClustersElasticsearchApi.md#resyncEsCluster) | **POST** /clusters/elasticsearch/{cluster_id}/_resync | Resynchronize cluster
[**resyncEsClusters**](ClustersElasticsearchApi.md#resyncEsClusters) | **POST** /clusters/elasticsearch/_resync | Resynchronize clusters
[**searchEsClusters**](ClustersElasticsearchApi.md#searchEsClusters) | **POST** /clusters/elasticsearch/_search | Search clusters
[**setEsClusterCcsSettings**](ClustersElasticsearchApi.md#setEsClusterCcsSettings) | **PUT** /clusters/elasticsearch/{cluster_id}/ccs/settings | Set remote clusters for cross-cluster search
[**setEsClusterInstancesAllSettingsOverrides**](ClustersElasticsearchApi.md#setEsClusterInstancesAllSettingsOverrides) | **PUT** /clusters/elasticsearch/{cluster_id}/instances/settings | Set settings overrides (all instances)
[**setEsClusterInstancesSettingsOverrides**](ClustersElasticsearchApi.md#setEsClusterInstancesSettingsOverrides) | **PUT** /clusters/elasticsearch/{cluster_id}/instances/{instance_ids}/settings | Set settings overrides
[**setEsClusterKeystore**](ClustersElasticsearchApi.md#setEsClusterKeystore) | **PATCH** /clusters/elasticsearch/{cluster_id}/keystore | Add or remove settings from the cluster keystore
[**setEsClusterLegacySecuritySettings**](ClustersElasticsearchApi.md#setEsClusterLegacySecuritySettings) | **PUT** /clusters/elasticsearch/{cluster_id}/settings/security/legacy | Set legacy security settings
[**setEsClusterMetadataRaw**](ClustersElasticsearchApi.md#setEsClusterMetadataRaw) | **POST** /clusters/elasticsearch/{cluster_id}/metadata/raw | Set cluster metadata
[**setEsClusterMonitoring**](ClustersElasticsearchApi.md#setEsClusterMonitoring) | **POST** /clusters/elasticsearch/{cluster_id}/monitoring/{dest_cluster_id} | Set monitoring
[**setEsClusterName**](ClustersElasticsearchApi.md#setEsClusterName) | **PUT** /clusters/elasticsearch/{cluster_id}/metadata/name/{new_name} | Set cluster name
[**shutdownEsCluster**](ClustersElasticsearchApi.md#shutdownEsCluster) | **POST** /clusters/elasticsearch/{cluster_id}/_shutdown | Shut down cluster
[**snapshotEsCluster**](ClustersElasticsearchApi.md#snapshotEsCluster) | **POST** /clusters/elasticsearch/{cluster_id}/_snapshot | Take snapshot
[**startEsClusterInstances**](ClustersElasticsearchApi.md#startEsClusterInstances) | **POST** /clusters/elasticsearch/{cluster_id}/instances/{instance_ids}/_start | Start instances
[**startEsClusterInstancesAll**](ClustersElasticsearchApi.md#startEsClusterInstancesAll) | **POST** /clusters/elasticsearch/{cluster_id}/instances/_start | Start all instances
[**startEsClusterInstancesAllMaintenanceMode**](ClustersElasticsearchApi.md#startEsClusterInstancesAllMaintenanceMode) | **POST** /clusters/elasticsearch/{cluster_id}/instances/maintenance-mode/_start | Start maintenance mode all instances
[**startEsClusterMaintenanceMode**](ClustersElasticsearchApi.md#startEsClusterMaintenanceMode) | **POST** /clusters/elasticsearch/{cluster_id}/instances/{instance_ids}/maintenance-mode/_start | Start maintenance mode
[**stopEsClusterInstances**](ClustersElasticsearchApi.md#stopEsClusterInstances) | **POST** /clusters/elasticsearch/{cluster_id}/instances/{instance_ids}/_stop | Stop instances
[**stopEsClusterInstancesAll**](ClustersElasticsearchApi.md#stopEsClusterInstancesAll) | **POST** /clusters/elasticsearch/{cluster_id}/instances/_stop | Stop all instances
[**stopEsClusterInstancesAllMaintenanceMode**](ClustersElasticsearchApi.md#stopEsClusterInstancesAllMaintenanceMode) | **POST** /clusters/elasticsearch/{cluster_id}/instances/maintenance-mode/_stop | Stop maintenance mode all instances
[**stopEsClusterMaintenanceMode**](ClustersElasticsearchApi.md#stopEsClusterMaintenanceMode) | **POST** /clusters/elasticsearch/{cluster_id}/instances/{instance_ids}/maintenance-mode/_stop | Stop maintenance mode
[**updateEsClusterCurationSettings**](ClustersElasticsearchApi.md#updateEsClusterCurationSettings) | **PUT** /clusters/elasticsearch/{cluster_id}/curation/settings | Update cluster curation settings
[**updateEsClusterMetadataSettings**](ClustersElasticsearchApi.md#updateEsClusterMetadataSettings) | **PATCH** /clusters/elasticsearch/{cluster_id}/metadata/settings | Update cluster metadata settings
[**updateEsClusterPlan**](ClustersElasticsearchApi.md#updateEsClusterPlan) | **POST** /clusters/elasticsearch/{cluster_id}/plan | Update plan
[**updateEsClusterSnapshotSettings**](ClustersElasticsearchApi.md#updateEsClusterSnapshotSettings) | **PATCH** /clusters/elasticsearch/{cluster_id}/snapshot/settings | Update cluster snapshot settings

<a name="cancelEsClusterMonitoring"></a>
# **cancelEsClusterMonitoring**
> EmptyResponse cancelEsClusterMonitoring(clusterId)

Cancel monitoring

Deletes all monitoring destinations for the Elasticsearch cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | Elasticsearch cluster identifier
try {
    EmptyResponse result = apiInstance.cancelEsClusterMonitoring(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#cancelEsClusterMonitoring");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| Elasticsearch cluster identifier |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="cancelEsClusterPendingPlan"></a>
# **cancelEsClusterPendingPlan**
> EmptyResponse cancelEsClusterPendingPlan(clusterId, ignoreMissing, forceDelete)

Cancel pending plan

Cancels the pending plan of the Elasticsearch cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | The Elasticsearch cluster identifier.
Boolean ignoreMissing = true; // Boolean | When `true`, returns successfully, even when plans are pending. The default is `false`.
Boolean forceDelete = true; // Boolean | \"When `true`, deletes the pending plan instead of attempting a graceful cancellation. The default is `false`.
try {
    EmptyResponse result = apiInstance.cancelEsClusterPendingPlan(clusterId, ignoreMissing, forceDelete);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#cancelEsClusterPendingPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Elasticsearch cluster identifier. |
 **ignoreMissing** | **Boolean**| When &#x60;true&#x60;, returns successfully, even when plans are pending. The default is &#x60;false&#x60;. | [optional]
 **forceDelete** | **Boolean**| \&quot;When &#x60;true&#x60;, deletes the pending plan instead of attempting a graceful cancellation. The default is &#x60;false&#x60;. | [optional]

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="createEsCluster"></a>
# **createEsCluster**
> ClusterCrudResponse createEsCluster(body, validateOnly, requestId)

Create cluster

Creates an Elasticsearch cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
CreateElasticsearchClusterRequest body = new CreateElasticsearchClusterRequest(); // CreateElasticsearchClusterRequest | The cluster definition
Boolean validateOnly = true; // Boolean | When `true`, validates the cluster definition without creating the cluster.
String requestId = "requestId_example"; // String | (Optional) The idempotency token. When two create requests share the same `request_id` (minimum size of 32 characters, maximum size of 128 characters), only one cluster is created. The second request returns the information for that cluster, but the password field is blank.
try {
    ClusterCrudResponse result = apiInstance.createEsCluster(body, validateOnly, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#createEsCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateElasticsearchClusterRequest**](CreateElasticsearchClusterRequest.md)| The cluster definition |
 **validateOnly** | **Boolean**| When &#x60;true&#x60;, validates the cluster definition without creating the cluster. | [optional]
 **requestId** | **String**| (Optional) The idempotency token. When two create requests share the same &#x60;request_id&#x60; (minimum size of 32 characters, maximum size of 128 characters), only one cluster is created. The second request returns the information for that cluster, but the password field is blank. | [optional]

### Return type

[**ClusterCrudResponse**](ClusterCrudResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="deleteEsCluster"></a>
# **deleteEsCluster**
> EmptyResponse deleteEsCluster(clusterId)

Delete cluster

Deletes the Elasticsearch cluster. Before you delete the Elasticsearch cluster, you must first successfully issue a &#x60;_shutdown&#x60; command.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | The Elasticsearch cluster identifier.
try {
    EmptyResponse result = apiInstance.deleteEsCluster(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#deleteEsCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Elasticsearch cluster identifier. |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteEsProxyRequests"></a>
# **deleteEsProxyRequests**
> deleteEsProxyRequests(clusterId, xManagementRequest, elasticsearchPath)

Proxies HTTP DELETE request to the cluster

Proxies HTTP DELETE request to the cluster. Requires that HTTP header X-Management-Request be specified. This endpoint is for management use and does not provide high performance.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | Identifier for the Elasticsearch cluster
String xManagementRequest = "xManagementRequest_example"; // String | X-Management-Request header value. Needs to be set to true
String elasticsearchPath = "elasticsearchPath_example"; // String | The URL part to proxy to the Elasticsearch cluster. Example: _search or _cat/indices?v&h=i,tm&s=tm:desc
try {
    apiInstance.deleteEsProxyRequests(clusterId, xManagementRequest, elasticsearchPath);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#deleteEsProxyRequests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| Identifier for the Elasticsearch cluster |
 **xManagementRequest** | **String**| X-Management-Request header value. Needs to be set to true |
 **elasticsearchPath** | **String**| The URL part to proxy to the Elasticsearch cluster. Example: _search or _cat/indices?v&amp;h&#x3D;i,tm&amp;s&#x3D;tm:desc |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="generateEsClusterDiagnostics"></a>
# **generateEsClusterDiagnostics**
> String generateEsClusterDiagnostics(clusterId)

Generate diagnostics

Retrieves a support diagnostic bundle from an active Elasticsearch cluster. To successfully retrieve a support diagnostic bundle, the cluster must be responsive.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | The Elasticsearch cluster identifier.
try {
    String result = apiInstance.generateEsClusterDiagnostics(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#generateEsClusterDiagnostics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Elasticsearch cluster identifier. |

### Return type

**String**

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="generateEsClusterLogs"></a>
# **generateEsClusterLogs**
> String generateEsClusterLogs(clusterId, date)

Generate logs

Retrieves the log file for the Elasticsearch cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | The Elasticsearch cluster identifier.
String date = "date_example"; // String | The log retrieval start date in standard format. For example, `YYYY-MM-DD [THH [:mm] ]`.
try {
    String result = apiInstance.generateEsClusterLogs(clusterId, date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#generateEsClusterLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Elasticsearch cluster identifier. |
 **date** | **String**| The log retrieval start date in standard format. For example, &#x60;YYYY-MM-DD [THH [:mm] ]&#x60;. |

### Return type

**String**

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getEsCcsEligibleRemotes"></a>
# **getEsCcsEligibleRemotes**
> ElasticsearchClustersInfo getEsCcsEligibleRemotes(version, q, ownerId, size)

Search clusters that can be used as cross-cluster search remotes

Retrieves the information for all of the Elasticsearch clusters that can selected as remotes in a given version.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String version = "version_example"; // String | The version of the cross-cluster search cluster that will link with the remote candidates.
String q = "q_example"; // String | (Optional) Cluster name or id prefix to filters the candidates.
String ownerId = "ownerId_example"; // String | (Optional) Returns only clusters filtered by the provided owner id.
Integer size = 56; // Integer | (Optional) Maximum number of clusters to include in the response.
try {
    ElasticsearchClustersInfo result = apiInstance.getEsCcsEligibleRemotes(version, q, ownerId, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#getEsCcsEligibleRemotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| The version of the cross-cluster search cluster that will link with the remote candidates. |
 **q** | **String**| (Optional) Cluster name or id prefix to filters the candidates. | [optional]
 **ownerId** | **String**| (Optional) Returns only clusters filtered by the provided owner id. | [optional]
 **size** | **Integer**| (Optional) Maximum number of clusters to include in the response. | [optional]

### Return type

[**ElasticsearchClustersInfo**](ElasticsearchClustersInfo.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getEsCluster"></a>
# **getEsCluster**
> ElasticsearchClusterInfo getEsCluster(clusterId, showSecurity, showMetadata, showPlans, showPlanLogs, showPlanDefaults, convertLegacyPlans, showSystemAlerts, showSettings, enrichWithTemplate)

Get cluster

Retrieves the Elasticsearch cluster information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | The Elasticsearch cluster identifier.
Boolean showSecurity = true; // Boolean | Includes the Elasticsearch 2.x security information in the response. NOTE: Responses can include a large amount of metadata, as well as credentials.
Boolean showMetadata = true; // Boolean | Includes all of the cluster metadata in the response. NOTE: Responses can include a large amount of metadata, as well as credentials.
Boolean showPlans = true; // Boolean | Includes the active and pending plan information in the response. NOTE: This option can result in large responses.
Boolean showPlanLogs = true; // Boolean | Includes the active, pending, and historical plan information in the attempt log. NOTE: This option can result in large responses.
Boolean showPlanDefaults = true; // Boolean | When plans are shown, includes the default values in the response. NOTE: This option results in large responses.
Boolean convertLegacyPlans = true; // Boolean | When `true`, converts the plans to the 2.0.x format. When `false`, uses the 1.x format. The default is `false`.
Integer showSystemAlerts = 56; // Integer | The number of system alerts to include in the response. For example, the number of forced restarts caused from a limited amount of memory. Only numbers greater than zero return a field. NOTE: Responses can include a large number of system alerts.
Boolean showSettings = true; // Boolean | Includes the cluster settings in the response.
Boolean enrichWithTemplate = true; // Boolean | When plans are shown, includes the missing elements from the applicable deployment template.
try {
    ElasticsearchClusterInfo result = apiInstance.getEsCluster(clusterId, showSecurity, showMetadata, showPlans, showPlanLogs, showPlanDefaults, convertLegacyPlans, showSystemAlerts, showSettings, enrichWithTemplate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#getEsCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Elasticsearch cluster identifier. |
 **showSecurity** | **Boolean**| Includes the Elasticsearch 2.x security information in the response. NOTE: Responses can include a large amount of metadata, as well as credentials. | [optional]
 **showMetadata** | **Boolean**| Includes all of the cluster metadata in the response. NOTE: Responses can include a large amount of metadata, as well as credentials. | [optional]
 **showPlans** | **Boolean**| Includes the active and pending plan information in the response. NOTE: This option can result in large responses. | [optional]
 **showPlanLogs** | **Boolean**| Includes the active, pending, and historical plan information in the attempt log. NOTE: This option can result in large responses. | [optional]
 **showPlanDefaults** | **Boolean**| When plans are shown, includes the default values in the response. NOTE: This option results in large responses. | [optional]
 **convertLegacyPlans** | **Boolean**| When &#x60;true&#x60;, converts the plans to the 2.0.x format. When &#x60;false&#x60;, uses the 1.x format. The default is &#x60;false&#x60;. | [optional]
 **showSystemAlerts** | **Integer**| The number of system alerts to include in the response. For example, the number of forced restarts caused from a limited amount of memory. Only numbers greater than zero return a field. NOTE: Responses can include a large number of system alerts. | [optional]
 **showSettings** | **Boolean**| Includes the cluster settings in the response. | [optional]
 **enrichWithTemplate** | **Boolean**| When plans are shown, includes the missing elements from the applicable deployment template. | [optional]

### Return type

[**ElasticsearchClusterInfo**](ElasticsearchClusterInfo.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getEsClusterCcs"></a>
# **getEsClusterCcs**
> CrossClusterSearchClusters getEsClusterCcs(clusterId)

Get cross-cluster search clusters

Returns the list of cross-cluster search clusters&#x27; IDs for the remote cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | Elasticsearch cluster identifier
try {
    CrossClusterSearchClusters result = apiInstance.getEsClusterCcs(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#getEsClusterCcs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| Elasticsearch cluster identifier |

### Return type

[**CrossClusterSearchClusters**](CrossClusterSearchClusters.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getEsClusterCcsSettings"></a>
# **getEsClusterCcsSettings**
> CrossClusterSearchSettings getEsClusterCcsSettings(clusterId)

Get remote clusters for cross-cluster search

Returns cross-cluster search configuration for the Elasticsearch cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | Elasticsearch cluster identifier
try {
    CrossClusterSearchSettings result = apiInstance.getEsClusterCcsSettings(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#getEsClusterCcsSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| Elasticsearch cluster identifier |

### Return type

[**CrossClusterSearchSettings**](CrossClusterSearchSettings.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getEsClusterCurationSettings"></a>
# **getEsClusterCurationSettings**
> ClusterCurationSettings getEsClusterCurationSettings(clusterId)

Get cluster curation settings

Retrieves cluster curation settings for an Elasticsearch cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | Elasticsearch cluster identifier
try {
    ClusterCurationSettings result = apiInstance.getEsClusterCurationSettings(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#getEsClusterCurationSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| Elasticsearch cluster identifier |

### Return type

[**ClusterCurationSettings**](ClusterCurationSettings.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getEsClusterKeystore"></a>
# **getEsClusterKeystore**
> KeystoreContents getEsClusterKeystore(clusterId)

Get settings from this cluster&#x27;s keystore

Returns the available keys in the keystore.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | The Elasticsearch cluster identifier
try {
    KeystoreContents result = apiInstance.getEsClusterKeystore(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#getEsClusterKeystore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Elasticsearch cluster identifier |

### Return type

[**KeystoreContents**](KeystoreContents.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getEsClusterMetadataRaw"></a>
# **getEsClusterMetadataRaw**
> Object getEsClusterMetadataRaw(clusterId)

Get cluster metadata

Advanced use only. Retrieves the internal cluster metadata, in free-form JSON, for the Elasticsearch cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | Elasticsearch cluster identifier
try {
    Object result = apiInstance.getEsClusterMetadataRaw(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#getEsClusterMetadataRaw");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| Elasticsearch cluster identifier |

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getEsClusterMetadataSettings"></a>
# **getEsClusterMetadataSettings**
> ClusterMetadataSettings getEsClusterMetadataSettings(clusterId)

Get cluster metadata settings

Retrieves a structured version of the cluster metadata as a collection of top-level settings. If a particular setting isn&#x27;t returned, then the free-form JSON endpoint (&#x60;/metadata/raw&#x60;) must be used.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | Elasticsearch cluster identifier
try {
    ClusterMetadataSettings result = apiInstance.getEsClusterMetadataSettings(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#getEsClusterMetadataSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| Elasticsearch cluster identifier |

### Return type

[**ClusterMetadataSettings**](ClusterMetadataSettings.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getEsClusterPendingPlan"></a>
# **getEsClusterPendingPlan**
> ElasticsearchClusterPlan getEsClusterPendingPlan(clusterId, showPlanDefaults, convertLegacyPlans, enrichWithTemplate)

Get pending plan

Retrieves the pending plan of the cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | The Elasticsearch cluster identifier.
Boolean showPlanDefaults = true; // Boolean | When plans are shown, includes the default values in the response. NOTE: This option results in large responses.
Boolean convertLegacyPlans = true; // Boolean | When `true`, converts the plans to the 2.0.x format. When `false`, uses the 1.x format. The default is `false`.
Boolean enrichWithTemplate = true; // Boolean | When plans are shown, includes the missing elements from the applicable deployment template.
try {
    ElasticsearchClusterPlan result = apiInstance.getEsClusterPendingPlan(clusterId, showPlanDefaults, convertLegacyPlans, enrichWithTemplate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#getEsClusterPendingPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Elasticsearch cluster identifier. |
 **showPlanDefaults** | **Boolean**| When plans are shown, includes the default values in the response. NOTE: This option results in large responses. | [optional]
 **convertLegacyPlans** | **Boolean**| When &#x60;true&#x60;, converts the plans to the 2.0.x format. When &#x60;false&#x60;, uses the 1.x format. The default is &#x60;false&#x60;. | [optional]
 **enrichWithTemplate** | **Boolean**| When plans are shown, includes the missing elements from the applicable deployment template. | [optional]

### Return type

[**ElasticsearchClusterPlan**](ElasticsearchClusterPlan.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getEsClusterPlan"></a>
# **getEsClusterPlan**
> ElasticsearchClusterPlan getEsClusterPlan(clusterId, showPlanDefaults, convertLegacyPlans, enrichWithTemplate)

Get plan

Retrieves the active plan of the Elasticsearch cluster. Transient settings are not show by this endpoint. To view the transient settings that have been applied with a specific plan, use the activity endpoint.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | The Elasticsearch cluster identifier.
Boolean showPlanDefaults = true; // Boolean | When plans are shown, includes the default values in the response. NOTE: This option results in large responses.
Boolean convertLegacyPlans = true; // Boolean | When `true`, converts the plans to the 2.0.x format. When `false`, uses the 1.x format. The default is `false`.
Boolean enrichWithTemplate = true; // Boolean | When plans are shown, includes the missing elements from the applicable deployment template.
try {
    ElasticsearchClusterPlan result = apiInstance.getEsClusterPlan(clusterId, showPlanDefaults, convertLegacyPlans, enrichWithTemplate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#getEsClusterPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Elasticsearch cluster identifier. |
 **showPlanDefaults** | **Boolean**| When plans are shown, includes the default values in the response. NOTE: This option results in large responses. | [optional]
 **convertLegacyPlans** | **Boolean**| When &#x60;true&#x60;, converts the plans to the 2.0.x format. When &#x60;false&#x60;, uses the 1.x format. The default is &#x60;false&#x60;. | [optional]
 **enrichWithTemplate** | **Boolean**| When plans are shown, includes the missing elements from the applicable deployment template. | [optional]

### Return type

[**ElasticsearchClusterPlan**](ElasticsearchClusterPlan.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getEsClusterPlanActivity"></a>
# **getEsClusterPlanActivity**
> ElasticsearchClusterPlansInfo getEsClusterPlanActivity(clusterId, showPlanLogs, showPlanDefaults, convertLegacyPlans, enrichWithTemplate)

Get plan activity

Retrieves the active and historical plan information for the Elasticsearch cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | The Elasticsearch cluster identifier.
Boolean showPlanLogs = true; // Boolean | Includes the active, pending, and historical plan information in the attempt log. NOTE: This option can result in large responses.
Boolean showPlanDefaults = true; // Boolean | When plans are shown, includes the default values in the response. NOTE: This option results in large responses.
Boolean convertLegacyPlans = true; // Boolean | When `true`, converts the plans to the 2.0.x format. When `false`, uses the 1.x format. The default is `false`.
Boolean enrichWithTemplate = true; // Boolean | When plans are shown, includes the missing elements from the applicable deployment template.
try {
    ElasticsearchClusterPlansInfo result = apiInstance.getEsClusterPlanActivity(clusterId, showPlanLogs, showPlanDefaults, convertLegacyPlans, enrichWithTemplate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#getEsClusterPlanActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Elasticsearch cluster identifier. |
 **showPlanLogs** | **Boolean**| Includes the active, pending, and historical plan information in the attempt log. NOTE: This option can result in large responses. | [optional]
 **showPlanDefaults** | **Boolean**| When plans are shown, includes the default values in the response. NOTE: This option results in large responses. | [optional]
 **convertLegacyPlans** | **Boolean**| When &#x60;true&#x60;, converts the plans to the 2.0.x format. When &#x60;false&#x60;, uses the 1.x format. The default is &#x60;false&#x60;. | [optional]
 **enrichWithTemplate** | **Boolean**| When plans are shown, includes the missing elements from the applicable deployment template. | [optional]

### Return type

[**ElasticsearchClusterPlansInfo**](ElasticsearchClusterPlansInfo.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getEsClusterSnapshotSettings"></a>
# **getEsClusterSnapshotSettings**
> ClusterSnapshotSettings getEsClusterSnapshotSettings(clusterId)

Get cluster snapshot settings

Gets cluster snapshot settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | Identifier for the Elasticsearch cluster
try {
    ClusterSnapshotSettings result = apiInstance.getEsClusterSnapshotSettings(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#getEsClusterSnapshotSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| Identifier for the Elasticsearch cluster |

### Return type

[**ClusterSnapshotSettings**](ClusterSnapshotSettings.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getEsClusters"></a>
# **getEsClusters**
> ElasticsearchClustersInfo getEsClusters(from, size, q, showSecurity, showMetadata, showPlans, showPlanDefaults, convertLegacyPlans, enrichWithTemplate, showSystemAlerts, showHidden, showSettings)

Get clusters

Retrieves the information for all Elasticsearch clusters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
Integer from = 56; // Integer | The number of clusters to skip.
Integer size = 56; // Integer | Maximum number of clusters to include in the response. For all clusters, use -1. NOTE: This option can result in large responses and is not supported if a query is also specified.
String q = "q_example"; // String | An optional query to filter Elasticsearch clusters by. Maps to an Elasticsearch query_string query.
Boolean showSecurity = true; // Boolean | Includes the Elasticsearch 2.x security information in the response. NOTE: Responses can include a large amount of metadata, as well as credentials.
Boolean showMetadata = true; // Boolean | Includes all of the cluster metadata in the response. NOTE: Responses can include a large amount of metadata, as well as credentials.
Boolean showPlans = true; // Boolean | Includes the active and pending plan information in the response. NOTE: This option can result in large responses.
Boolean showPlanDefaults = true; // Boolean | When plans are shown, includes the default values in the response. NOTE: This option results in large responses.
Boolean convertLegacyPlans = true; // Boolean | When `true`, converts the plans to the 2.0.x format. When `false`, uses the 1.x format. The default is `false`.
Boolean enrichWithTemplate = true; // Boolean | When plans are shown, includes the missing elements from the applicable deployment template.
Integer showSystemAlerts = 56; // Integer | The number of system alerts to include in the response. For example, the number of forced restarts caused from a limited amount of memory. Only numbers greater than zero return a field. NOTE: Responses can include a large number of system alerts.
Boolean showHidden = true; // Boolean | Includes the hidden clusters in the response.
Boolean showSettings = true; // Boolean | Includes the cluster settings in the response.
try {
    ElasticsearchClustersInfo result = apiInstance.getEsClusters(from, size, q, showSecurity, showMetadata, showPlans, showPlanDefaults, convertLegacyPlans, enrichWithTemplate, showSystemAlerts, showHidden, showSettings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#getEsClusters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **Integer**| The number of clusters to skip. | [optional]
 **size** | **Integer**| Maximum number of clusters to include in the response. For all clusters, use -1. NOTE: This option can result in large responses and is not supported if a query is also specified. | [optional]
 **q** | **String**| An optional query to filter Elasticsearch clusters by. Maps to an Elasticsearch query_string query. | [optional]
 **showSecurity** | **Boolean**| Includes the Elasticsearch 2.x security information in the response. NOTE: Responses can include a large amount of metadata, as well as credentials. | [optional]
 **showMetadata** | **Boolean**| Includes all of the cluster metadata in the response. NOTE: Responses can include a large amount of metadata, as well as credentials. | [optional]
 **showPlans** | **Boolean**| Includes the active and pending plan information in the response. NOTE: This option can result in large responses. | [optional]
 **showPlanDefaults** | **Boolean**| When plans are shown, includes the default values in the response. NOTE: This option results in large responses. | [optional]
 **convertLegacyPlans** | **Boolean**| When &#x60;true&#x60;, converts the plans to the 2.0.x format. When &#x60;false&#x60;, uses the 1.x format. The default is &#x60;false&#x60;. | [optional]
 **enrichWithTemplate** | **Boolean**| When plans are shown, includes the missing elements from the applicable deployment template. | [optional]
 **showSystemAlerts** | **Integer**| The number of system alerts to include in the response. For example, the number of forced restarts caused from a limited amount of memory. Only numbers greater than zero return a field. NOTE: Responses can include a large number of system alerts. | [optional]
 **showHidden** | **Boolean**| Includes the hidden clusters in the response. | [optional]
 **showSettings** | **Boolean**| Includes the cluster settings in the response. | [optional]

### Return type

[**ElasticsearchClustersInfo**](ElasticsearchClustersInfo.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getEsProxyRequests"></a>
# **getEsProxyRequests**
> getEsProxyRequests(clusterId, elasticsearchPath, xManagementRequest)

Proxies HTTP GET request to the cluster

Proxies HTTP GET request to the cluster. Requires that HTTP header X-Management-Request be specified. This endpoint is for management use and does not provide high performance.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | Identifier for the Elasticsearch cluster
String elasticsearchPath = "elasticsearchPath_example"; // String | The URL part to proxy to the Elasticsearch cluster. Example: _search or _cat/indices?v&h=i,tm&s=tm:desc
String xManagementRequest = "xManagementRequest_example"; // String | X-Management-Request header value. Needs to be set to true
try {
    apiInstance.getEsProxyRequests(clusterId, elasticsearchPath, xManagementRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#getEsProxyRequests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| Identifier for the Elasticsearch cluster |
 **elasticsearchPath** | **String**| The URL part to proxy to the Elasticsearch cluster. Example: _search or _cat/indices?v&amp;h&#x3D;i,tm&amp;s&#x3D;tm:desc |
 **xManagementRequest** | **String**| X-Management-Request header value. Needs to be set to true |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="migrateEsClusterPlan"></a>
# **migrateEsClusterPlan**
> ClusterPlanMigrationResponse migrateEsClusterPlan(clusterId, template, validateOnly)

Migrate plan

Migrates the configuration of the Elasticsearch cluster to a different template.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | The Elasticsearch cluster identifier.
String template = "template_example"; // String | The ID of the deployment template to migrate to
Boolean validateOnly = true; // Boolean | When true, validates the cluster definition, but does not perform the update
try {
    ClusterPlanMigrationResponse result = apiInstance.migrateEsClusterPlan(clusterId, template, validateOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#migrateEsClusterPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Elasticsearch cluster identifier. |
 **template** | **String**| The ID of the deployment template to migrate to |
 **validateOnly** | **Boolean**| When true, validates the cluster definition, but does not perform the update | [optional]

### Return type

[**ClusterPlanMigrationResponse**](ClusterPlanMigrationResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="moveEsClusterInstances"></a>
# **moveEsClusterInstances**
> ClusterCommandResponse moveEsClusterInstances(clusterId, instanceIds, body, ignoreMissing, forceUpdate, instancesDown, moveOnly, validateOnly)

Move instances

Moves one or more instances in the Elasticsearch cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | The Elasticsearch cluster identifier.
List<String> instanceIds = Arrays.asList("instanceIds_example"); // List<String> | A comma-separated list of instance identifiers.
TransientElasticsearchPlanConfiguration body = new TransientElasticsearchPlanConfiguration(); // TransientElasticsearchPlanConfiguration | Overrides defaults for the move, including setting the configuration of instances specified in the path
Boolean ignoreMissing = true; // Boolean | When `true` and the instance does not exist, proceeds to the next instance, or treats the instance as an error.
Boolean forceUpdate = true; // Boolean | When `true`, cancels and overwrites the pending plans, or treats the instance as an error.
Boolean instancesDown = true; // Boolean | When `true`, the instances specified by `instance_ids` permanently shut down for data migration logic.
Boolean moveOnly = true; // Boolean | When `true`, moves the specified instances and ignores the changes for the cluster state.
Boolean validateOnly = true; // Boolean | When `true`, validates the move request, then returns the calculated plan without applying the plan.
try {
    ClusterCommandResponse result = apiInstance.moveEsClusterInstances(clusterId, instanceIds, body, ignoreMissing, forceUpdate, instancesDown, moveOnly, validateOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#moveEsClusterInstances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Elasticsearch cluster identifier. |
 **instanceIds** | [**List&lt;String&gt;**](String.md)| A comma-separated list of instance identifiers. |
 **body** | [**TransientElasticsearchPlanConfiguration**](TransientElasticsearchPlanConfiguration.md)| Overrides defaults for the move, including setting the configuration of instances specified in the path | [optional]
 **ignoreMissing** | **Boolean**| When &#x60;true&#x60; and the instance does not exist, proceeds to the next instance, or treats the instance as an error. | [optional]
 **forceUpdate** | **Boolean**| When &#x60;true&#x60;, cancels and overwrites the pending plans, or treats the instance as an error. | [optional]
 **instancesDown** | **Boolean**| When &#x60;true&#x60;, the instances specified by &#x60;instance_ids&#x60; permanently shut down for data migration logic. | [optional]
 **moveOnly** | **Boolean**| When &#x60;true&#x60;, moves the specified instances and ignores the changes for the cluster state. | [optional]
 **validateOnly** | **Boolean**| When &#x60;true&#x60;, validates the move request, then returns the calculated plan without applying the plan. | [optional]

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="moveEsClusterInstancesAdvanced"></a>
# **moveEsClusterInstancesAdvanced**
> ClusterCommandResponse moveEsClusterInstancesAdvanced(body, clusterId, forceUpdate, instancesDown, moveOnly, validateOnly)

Move instances (advanced)

Moves one or more instances in the Elasticsearch cluster. The custom configuration settings are posted in the body.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
TransientElasticsearchPlanConfiguration body = new TransientElasticsearchPlanConfiguration(); // TransientElasticsearchPlanConfiguration | Overrides defaults for the move, including setting the configuration of instances specified in the path
String clusterId = "clusterId_example"; // String | The Elasticsearch cluster identifier.
Boolean forceUpdate = true; // Boolean | When `true`, cancels and overwrites the pending plans, or treats the instance as an error.
Boolean instancesDown = true; // Boolean | When `true`, the instances specified by `instance_ids` permanently shut down for data migration logic.
Boolean moveOnly = true; // Boolean | When `true`, moves the instances and ignores the changes for the cluster state.
Boolean validateOnly = true; // Boolean | When `true`, validates the move request, then returns the calculated plan without applying the plan.
try {
    ClusterCommandResponse result = apiInstance.moveEsClusterInstancesAdvanced(body, clusterId, forceUpdate, instancesDown, moveOnly, validateOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#moveEsClusterInstancesAdvanced");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransientElasticsearchPlanConfiguration**](TransientElasticsearchPlanConfiguration.md)| Overrides defaults for the move, including setting the configuration of instances specified in the path |
 **clusterId** | **String**| The Elasticsearch cluster identifier. |
 **forceUpdate** | **Boolean**| When &#x60;true&#x60;, cancels and overwrites the pending plans, or treats the instance as an error. | [optional]
 **instancesDown** | **Boolean**| When &#x60;true&#x60;, the instances specified by &#x60;instance_ids&#x60; permanently shut down for data migration logic. | [optional]
 **moveOnly** | **Boolean**| When &#x60;true&#x60;, moves the instances and ignores the changes for the cluster state. | [optional]
 **validateOnly** | **Boolean**| When &#x60;true&#x60;, validates the move request, then returns the calculated plan without applying the plan. | [optional]

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="postEsProxyRequests"></a>
# **postEsProxyRequests**
> postEsProxyRequests(xManagementRequest, clusterId, elasticsearchPath, body)

Proxies HTTP POST request to the cluster

Proxies HTTP POST request to the cluster. Requires that HTTP header X-Management-Request be specified. This endpoint is for management use and does not provide high performance.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String xManagementRequest = "xManagementRequest_example"; // String | X-Management-Request header value. Needs to be set to true
String clusterId = "clusterId_example"; // String | Identifier for the Elasticsearch cluster
String elasticsearchPath = "elasticsearchPath_example"; // String | The URL part to proxy to the Elasticsearch cluster. Example: _search or _cat/indices?v&h=i,tm&s=tm:desc
String body = "body_example"; // String | The JSON payload to proxy to the Elasticsearch cluster
try {
    apiInstance.postEsProxyRequests(xManagementRequest, clusterId, elasticsearchPath, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#postEsProxyRequests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xManagementRequest** | **String**| X-Management-Request header value. Needs to be set to true |
 **clusterId** | **String**| Identifier for the Elasticsearch cluster |
 **elasticsearchPath** | **String**| The URL part to proxy to the Elasticsearch cluster. Example: _search or _cat/indices?v&amp;h&#x3D;i,tm&amp;s&#x3D;tm:desc |
 **body** | [**String**](String.md)| The JSON payload to proxy to the Elasticsearch cluster | [optional]

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="putEsProxyRequests"></a>
# **putEsProxyRequests**
> putEsProxyRequests(xManagementRequest, clusterId, elasticsearchPath, body)

Proxies HTTP PUT request to the cluster

Proxies HTTP PUT request to the cluster. Requires that HTTP header X-Management-Request be specified. This endpoint is for management use and does not provide high performance.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String xManagementRequest = "xManagementRequest_example"; // String | X-Management-Request header value. Needs to be set to true
String clusterId = "clusterId_example"; // String | Identifier for the Elasticsearch cluster
String elasticsearchPath = "elasticsearchPath_example"; // String | The URL part to proxy to the Elasticsearch cluster. Example: _search or _cat/indices?v&h=i,tm&s=tm:desc
String body = "body_example"; // String | The JSON payload to proxy to the Elasticsearch cluster
try {
    apiInstance.putEsProxyRequests(xManagementRequest, clusterId, elasticsearchPath, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#putEsProxyRequests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xManagementRequest** | **String**| X-Management-Request header value. Needs to be set to true |
 **clusterId** | **String**| Identifier for the Elasticsearch cluster |
 **elasticsearchPath** | **String**| The URL part to proxy to the Elasticsearch cluster. Example: _search or _cat/indices?v&amp;h&#x3D;i,tm&amp;s&#x3D;tm:desc |
 **body** | [**String**](String.md)| The JSON payload to proxy to the Elasticsearch cluster | [optional]

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="restartEsCluster"></a>
# **restartEsCluster**
> ClusterCommandResponse restartEsCluster(clusterId, restoreSnapshot, skipSnapshot, cancelPending, groupAttribute, shardInitWaitTime)

Restart cluster

Restarts the Elasticsearch cluster. When you restart an active cluster, the existing plan is used and a &#x60;cluster_reboot&#x60; is applied. A &#x60;cluster_reboot&#x60; issues an Elasticsearch restart command, then waits for the command to complete. When you restart an inactive cluster, the most recent successful plan is applied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | The Elasticsearch cluster identifier.
Boolean restoreSnapshot = true; // Boolean | When `true` and restoring from a shutdown, restores the cluster from the last available snapshot.
Boolean skipSnapshot = true; // Boolean | When `true`, does not capture a snapshot before restarting the cluster.
Boolean cancelPending = true; // Boolean | When `true`, cancels the pending plans, then restarts the cluster.
String groupAttribute = "groupAttribute_example"; // String | Specifies the properties that divide the instances into groups. To restart all of the instances, use '\\_\\_all\\_\\_'. To restart the instances by logical zone, use '\\_\\_zone\\_\\_'. To restart one instance at a time, use '\\_\\_name\\_\\_', or use a comma-separated list of instance attributes.
Integer shardInitWaitTime = 56; // Integer | The time, in seconds, to wait for shards that show no progress of initializing, before rolling the next group (default: 10 minutes)
try {
    ClusterCommandResponse result = apiInstance.restartEsCluster(clusterId, restoreSnapshot, skipSnapshot, cancelPending, groupAttribute, shardInitWaitTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#restartEsCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Elasticsearch cluster identifier. |
 **restoreSnapshot** | **Boolean**| When &#x60;true&#x60; and restoring from a shutdown, restores the cluster from the last available snapshot. | [optional]
 **skipSnapshot** | **Boolean**| When &#x60;true&#x60;, does not capture a snapshot before restarting the cluster. | [optional]
 **cancelPending** | **Boolean**| When &#x60;true&#x60;, cancels the pending plans, then restarts the cluster. | [optional]
 **groupAttribute** | **String**| Specifies the properties that divide the instances into groups. To restart all of the instances, use &#x27;\\_\\_all\\_\\_&#x27;. To restart the instances by logical zone, use &#x27;\\_\\_zone\\_\\_&#x27;. To restart one instance at a time, use &#x27;\\_\\_name\\_\\_&#x27;, or use a comma-separated list of instance attributes. | [optional]
 **shardInitWaitTime** | **Integer**| The time, in seconds, to wait for shards that show no progress of initializing, before rolling the next group (default: 10 minutes) | [optional]

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="resyncEsCluster"></a>
# **resyncEsCluster**
> EmptyResponse resyncEsCluster(clusterId)

Resynchronize cluster

Immediately resynchronizes the search index and cache for the selected Elasticsearch cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | The Elasticsearch cluster identifier.
try {
    EmptyResponse result = apiInstance.resyncEsCluster(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#resyncEsCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Elasticsearch cluster identifier. |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="resyncEsClusters"></a>
# **resyncEsClusters**
> ModelVersionIndexSynchronizationResults resyncEsClusters(skipMatchingVersion)

Resynchronize clusters

Asynchronously resynchronizes the search index for all Elasticsearch clusters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
Boolean skipMatchingVersion = true; // Boolean | When true, skips the document indexing when the version matches the in-memory copy.
try {
    ModelVersionIndexSynchronizationResults result = apiInstance.resyncEsClusters(skipMatchingVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#resyncEsClusters");
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

<a name="searchEsClusters"></a>
# **searchEsClusters**
> ElasticsearchClustersInfo searchEsClusters(body)

Search clusters

Retrieves the information for all of the Elasticsearch clusters that match the specified query.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
SearchRequest body = new SearchRequest(); // SearchRequest | (Optional) The search request to execute. NOTE: When not specified, all of the clusters are matched.
try {
    ElasticsearchClustersInfo result = apiInstance.searchEsClusters(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#searchEsClusters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchRequest**](SearchRequest.md)| (Optional) The search request to execute. NOTE: When not specified, all of the clusters are matched. | [optional]

### Return type

[**ElasticsearchClustersInfo**](ElasticsearchClustersInfo.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="setEsClusterCcsSettings"></a>
# **setEsClusterCcsSettings**
> EmptyResponse setEsClusterCcsSettings(body, clusterId)

Set remote clusters for cross-cluster search

Overwrites or creates the cross-cluster search configuration for the Elasticsearch cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
CrossClusterSearchSettings body = new CrossClusterSearchSettings(); // CrossClusterSearchSettings | Remote clusters for cross-cluster search
String clusterId = "clusterId_example"; // String | Elasticsearch cluster identifier
try {
    EmptyResponse result = apiInstance.setEsClusterCcsSettings(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#setEsClusterCcsSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CrossClusterSearchSettings**](CrossClusterSearchSettings.md)| Remote clusters for cross-cluster search |
 **clusterId** | **String**| Elasticsearch cluster identifier |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="setEsClusterInstancesAllSettingsOverrides"></a>
# **setEsClusterInstancesAllSettingsOverrides**
> ElasticsearchClusterInstanceSettingsOverrides setEsClusterInstancesAllSettingsOverrides(body, clusterId, restartAfterUpdate)

Set settings overrides (all instances)

Overrides the settings for all of the instances in the Elasticsearch cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
ElasticsearchClusterInstanceSettingsOverrides body = new ElasticsearchClusterInstanceSettingsOverrides(); // ElasticsearchClusterInstanceSettingsOverrides | The settings to override for the instances
String clusterId = "clusterId_example"; // String | The Elasticsearch cluster identifier.
Boolean restartAfterUpdate = true; // Boolean | After overrides are applied, restarts the instances.
try {
    ElasticsearchClusterInstanceSettingsOverrides result = apiInstance.setEsClusterInstancesAllSettingsOverrides(body, clusterId, restartAfterUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#setEsClusterInstancesAllSettingsOverrides");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ElasticsearchClusterInstanceSettingsOverrides**](ElasticsearchClusterInstanceSettingsOverrides.md)| The settings to override for the instances |
 **clusterId** | **String**| The Elasticsearch cluster identifier. |
 **restartAfterUpdate** | **Boolean**| After overrides are applied, restarts the instances. | [optional]

### Return type

[**ElasticsearchClusterInstanceSettingsOverrides**](ElasticsearchClusterInstanceSettingsOverrides.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="setEsClusterInstancesSettingsOverrides"></a>
# **setEsClusterInstancesSettingsOverrides**
> ElasticsearchClusterInstanceSettingsOverrides setEsClusterInstancesSettingsOverrides(body, clusterId, instanceIds, ignoreMissing, restartAfterUpdate)

Set settings overrides

Overrides the settings for the specified instances in the Elasticsearch cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
ElasticsearchClusterInstanceSettingsOverrides body = new ElasticsearchClusterInstanceSettingsOverrides(); // ElasticsearchClusterInstanceSettingsOverrides | The settings to override for the specified instances.
String clusterId = "clusterId_example"; // String | The Elasticsearch cluster identifier.
List<String> instanceIds = Arrays.asList("instanceIds_example"); // List<String> | A comma-separated list of instance identifiers.
Boolean ignoreMissing = true; // Boolean | When `true` and the instance does not exist, proceeds to the next instance, or treats the instance as an error.
Boolean restartAfterUpdate = true; // Boolean | After overrides are applied, restarts the instances.
try {
    ElasticsearchClusterInstanceSettingsOverrides result = apiInstance.setEsClusterInstancesSettingsOverrides(body, clusterId, instanceIds, ignoreMissing, restartAfterUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#setEsClusterInstancesSettingsOverrides");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ElasticsearchClusterInstanceSettingsOverrides**](ElasticsearchClusterInstanceSettingsOverrides.md)| The settings to override for the specified instances. |
 **clusterId** | **String**| The Elasticsearch cluster identifier. |
 **instanceIds** | [**List&lt;String&gt;**](String.md)| A comma-separated list of instance identifiers. |
 **ignoreMissing** | **Boolean**| When &#x60;true&#x60; and the instance does not exist, proceeds to the next instance, or treats the instance as an error. | [optional]
 **restartAfterUpdate** | **Boolean**| After overrides are applied, restarts the instances. | [optional]

### Return type

[**ElasticsearchClusterInstanceSettingsOverrides**](ElasticsearchClusterInstanceSettingsOverrides.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="setEsClusterKeystore"></a>
# **setEsClusterKeystore**
> KeystoreContents setEsClusterKeystore(body, clusterId)

Add or remove settings from the cluster keystore

Adds the specified values to the Elasticsearch keystore, or removes the keys for the unspecified values.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
KeystoreContents body = new KeystoreContents(); // KeystoreContents | Keystore settings to update
String clusterId = "clusterId_example"; // String | Identifier for the Elasticsearch cluster
try {
    KeystoreContents result = apiInstance.setEsClusterKeystore(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#setEsClusterKeystore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**KeystoreContents**](KeystoreContents.md)| Keystore settings to update |
 **clusterId** | **String**| Identifier for the Elasticsearch cluster |

### Return type

[**KeystoreContents**](KeystoreContents.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="setEsClusterLegacySecuritySettings"></a>
# **setEsClusterLegacySecuritySettings**
> LegacySecuritySettings setEsClusterLegacySecuritySettings(body, clusterId)

Set legacy security settings

Sets the legacy Shield security settings for a 2.x Elasticsearch cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
LegacySecuritySettings body = new LegacySecuritySettings(); // LegacySecuritySettings | The legacy security settings
String clusterId = "clusterId_example"; // String | The Elasticsearch cluster identifier.
try {
    LegacySecuritySettings result = apiInstance.setEsClusterLegacySecuritySettings(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#setEsClusterLegacySecuritySettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LegacySecuritySettings**](LegacySecuritySettings.md)| The legacy security settings |
 **clusterId** | **String**| The Elasticsearch cluster identifier. |

### Return type

[**LegacySecuritySettings**](LegacySecuritySettings.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="setEsClusterMetadataRaw"></a>
# **setEsClusterMetadataRaw**
> Object setEsClusterMetadataRaw(body, clusterId, version)

Set cluster metadata

Advanced use only. Sets the internal metadata, in free-form JSON, for the Elasticsearch cluster. Only use the parameter to set the modified JSON that is returned from the get version of the metadata.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String body = "body_example"; // String | The freeform JSON for the cluster (should always be based on the current version retrieved from the GET)
String clusterId = "clusterId_example"; // String | Elasticsearch cluster identifier
Integer version = 56; // Integer | Checks for conflicts against the metadata version, then returns the value in the `x-cloud-resource-version` header.
try {
    Object result = apiInstance.setEsClusterMetadataRaw(body, clusterId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#setEsClusterMetadataRaw");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| The freeform JSON for the cluster (should always be based on the current version retrieved from the GET) |
 **clusterId** | **String**| Elasticsearch cluster identifier |
 **version** | **Integer**| Checks for conflicts against the metadata version, then returns the value in the &#x60;x-cloud-resource-version&#x60; header. | [optional]

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="setEsClusterMonitoring"></a>
# **setEsClusterMonitoring**
> EmptyResponse setEsClusterMonitoring(clusterId, destClusterId)

Set monitoring

Overwrites or creates the monitoring destination for the Elasticsearch cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | Elasticsearch cluster identifier
String destClusterId = "destClusterId_example"; // String | The Elasticsearch cluster identifier for the monitoring destination.
try {
    EmptyResponse result = apiInstance.setEsClusterMonitoring(clusterId, destClusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#setEsClusterMonitoring");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| Elasticsearch cluster identifier |
 **destClusterId** | **String**| The Elasticsearch cluster identifier for the monitoring destination. |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="setEsClusterName"></a>
# **setEsClusterName**
> EmptyResponse setEsClusterName(clusterId, newName)

Set cluster name

Assigns a name to the Elasticsearch cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | Elasticsearch cluster identifier
String newName = "newName_example"; // String | The new name for the cluster.
try {
    EmptyResponse result = apiInstance.setEsClusterName(clusterId, newName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#setEsClusterName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| Elasticsearch cluster identifier |
 **newName** | **String**| The new name for the cluster. |

### Return type

[**EmptyResponse**](EmptyResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="shutdownEsCluster"></a>
# **shutdownEsCluster**
> ClusterCommandResponse shutdownEsCluster(clusterId, skipSnapshot, hide)

Shut down cluster

Shuts down the active Elasticsearch cluster and removes all of the cluster nodes. The cluster plan is retained. WARNING: To avoid data loss, save the data outside of the cluster before you shut the cluster down.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | The Elasticsearch cluster identifier.
Boolean skipSnapshot = true; // Boolean | When `true`, skips the snapshot when the cluster is shut down.
Boolean hide = true; // Boolean | Hides the clusters during shutdown. NOTE: By default, hidden clusters are not listed.
try {
    ClusterCommandResponse result = apiInstance.shutdownEsCluster(clusterId, skipSnapshot, hide);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#shutdownEsCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Elasticsearch cluster identifier. |
 **skipSnapshot** | **Boolean**| When &#x60;true&#x60;, skips the snapshot when the cluster is shut down. | [optional]
 **hide** | **Boolean**| Hides the clusters during shutdown. NOTE: By default, hidden clusters are not listed. | [optional]

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="snapshotEsCluster"></a>
# **snapshotEsCluster**
> ClusterSnapshotResponse snapshotEsCluster(clusterId, body)

Take snapshot

To create a snapshot of the specified Elasticsearch cluster, uses the configured snapshot repository.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | The Elasticsearch cluster identifier.
ClusterSnapshotRequest body = new ClusterSnapshotRequest(); // ClusterSnapshotRequest | Overrides default settings for the snapshot
try {
    ClusterSnapshotResponse result = apiInstance.snapshotEsCluster(clusterId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#snapshotEsCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Elasticsearch cluster identifier. |
 **body** | [**ClusterSnapshotRequest**](ClusterSnapshotRequest.md)| Overrides default settings for the snapshot | [optional]

### Return type

[**ClusterSnapshotResponse**](ClusterSnapshotResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="startEsClusterInstances"></a>
# **startEsClusterInstances**
> ClusterCommandResponse startEsClusterInstances(clusterId, instanceIds, ignoreMissing)

Start instances

Starts the instances in the Elasticsearch cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | The Elasticsearch cluster identifier.
List<String> instanceIds = Arrays.asList("instanceIds_example"); // List<String> | A comma-separated list of instance identifiers.
Boolean ignoreMissing = true; // Boolean | When `true` and the instance does not exist, proceeds to the next instance, or treats the instance as an error.
try {
    ClusterCommandResponse result = apiInstance.startEsClusterInstances(clusterId, instanceIds, ignoreMissing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#startEsClusterInstances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Elasticsearch cluster identifier. |
 **instanceIds** | [**List&lt;String&gt;**](String.md)| A comma-separated list of instance identifiers. |
 **ignoreMissing** | **Boolean**| When &#x60;true&#x60; and the instance does not exist, proceeds to the next instance, or treats the instance as an error. | [optional]

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="startEsClusterInstancesAll"></a>
# **startEsClusterInstancesAll**
> ClusterCommandResponse startEsClusterInstancesAll(clusterId)

Start all instances

Starts all of the instances in the Elasticsearch cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | The Elasticsearch cluster identifier.
try {
    ClusterCommandResponse result = apiInstance.startEsClusterInstancesAll(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#startEsClusterInstancesAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Elasticsearch cluster identifier. |

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="startEsClusterInstancesAllMaintenanceMode"></a>
# **startEsClusterInstancesAllMaintenanceMode**
> ClusterCommandResponse startEsClusterInstancesAllMaintenanceMode(clusterId)

Start maintenance mode all instances

Starts maintenance mode on all of the instances in the Elasticsearch cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | The Elasticsearch cluster identifier.
try {
    ClusterCommandResponse result = apiInstance.startEsClusterInstancesAllMaintenanceMode(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#startEsClusterInstancesAllMaintenanceMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Elasticsearch cluster identifier. |

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="startEsClusterMaintenanceMode"></a>
# **startEsClusterMaintenanceMode**
> ClusterCommandResponse startEsClusterMaintenanceMode(clusterId, instanceIds, ignoreMissing)

Start maintenance mode

Starts maintenance mode on the specified instances in the Elasticsearch cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | The Elasticsearch cluster identifier.
List<String> instanceIds = Arrays.asList("instanceIds_example"); // List<String> | A comma-separated list of instance identifiers.
Boolean ignoreMissing = true; // Boolean | When `true` and the instance does not exist, proceeds to the next instance, or treats the instance as an error.
try {
    ClusterCommandResponse result = apiInstance.startEsClusterMaintenanceMode(clusterId, instanceIds, ignoreMissing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#startEsClusterMaintenanceMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Elasticsearch cluster identifier. |
 **instanceIds** | [**List&lt;String&gt;**](String.md)| A comma-separated list of instance identifiers. |
 **ignoreMissing** | **Boolean**| When &#x60;true&#x60; and the instance does not exist, proceeds to the next instance, or treats the instance as an error. | [optional]

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="stopEsClusterInstances"></a>
# **stopEsClusterInstances**
> ClusterCommandResponse stopEsClusterInstances(clusterId, instanceIds, ignoreMissing)

Stop instances

Stops the instances in the Elasticsearch cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | The Elasticsearch cluster identifier.
List<String> instanceIds = Arrays.asList("instanceIds_example"); // List<String> | A comma-separated list of instance identifiers.
Boolean ignoreMissing = true; // Boolean | When `true` and the instance does not exist, proceeds to the next instance, or treats the instance as an error.
try {
    ClusterCommandResponse result = apiInstance.stopEsClusterInstances(clusterId, instanceIds, ignoreMissing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#stopEsClusterInstances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Elasticsearch cluster identifier. |
 **instanceIds** | [**List&lt;String&gt;**](String.md)| A comma-separated list of instance identifiers. |
 **ignoreMissing** | **Boolean**| When &#x60;true&#x60; and the instance does not exist, proceeds to the next instance, or treats the instance as an error. | [optional]

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="stopEsClusterInstancesAll"></a>
# **stopEsClusterInstancesAll**
> ClusterCommandResponse stopEsClusterInstancesAll(clusterId)

Stop all instances

Stops all of the instances in the Elasticsearch cluster..

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | The Elasticsearch cluster identifier.
try {
    ClusterCommandResponse result = apiInstance.stopEsClusterInstancesAll(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#stopEsClusterInstancesAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Elasticsearch cluster identifier. |

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="stopEsClusterInstancesAllMaintenanceMode"></a>
# **stopEsClusterInstancesAllMaintenanceMode**
> ClusterCommandResponse stopEsClusterInstancesAllMaintenanceMode(clusterId)

Stop maintenance mode all instances

Stops maintenance mode on all of the instances in the Elasticsearch cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | The Elasticsearch cluster identifier.
try {
    ClusterCommandResponse result = apiInstance.stopEsClusterInstancesAllMaintenanceMode(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#stopEsClusterInstancesAllMaintenanceMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Elasticsearch cluster identifier. |

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="stopEsClusterMaintenanceMode"></a>
# **stopEsClusterMaintenanceMode**
> ClusterCommandResponse stopEsClusterMaintenanceMode(clusterId, instanceIds, ignoreMissing)

Stop maintenance mode

Stops maintenance mode on the specified instances in the Elasticsearch cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
String clusterId = "clusterId_example"; // String | The Elasticsearch cluster identifier.
List<String> instanceIds = Arrays.asList("instanceIds_example"); // List<String> | A comma-separated list of instance identifiers.
Boolean ignoreMissing = true; // Boolean | When `true` and the instance does not exist, proceeds to the next instance, or treats the instance as an error.
try {
    ClusterCommandResponse result = apiInstance.stopEsClusterMaintenanceMode(clusterId, instanceIds, ignoreMissing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#stopEsClusterMaintenanceMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| The Elasticsearch cluster identifier. |
 **instanceIds** | [**List&lt;String&gt;**](String.md)| A comma-separated list of instance identifiers. |
 **ignoreMissing** | **Boolean**| When &#x60;true&#x60; and the instance does not exist, proceeds to the next instance, or treats the instance as an error. | [optional]

### Return type

[**ClusterCommandResponse**](ClusterCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateEsClusterCurationSettings"></a>
# **updateEsClusterCurationSettings**
> ClusterCurationSettings updateEsClusterCurationSettings(body, clusterId, version)

Update cluster curation settings

Overrides cluster curation settings for an Elasticsearch cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
ClusterCurationSettings body = new ClusterCurationSettings(); // ClusterCurationSettings | The cluster curation settings including updated values
String clusterId = "clusterId_example"; // String | The Elasticsearch cluster identifier.
Integer version = 56; // Integer | If specified then checks for conflicts against the version of the cluster curation settings (returned in 'x-cloud-resource-version' of the GET request)
try {
    ClusterCurationSettings result = apiInstance.updateEsClusterCurationSettings(body, clusterId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#updateEsClusterCurationSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClusterCurationSettings**](ClusterCurationSettings.md)| The cluster curation settings including updated values |
 **clusterId** | **String**| The Elasticsearch cluster identifier. |
 **version** | **Integer**| If specified then checks for conflicts against the version of the cluster curation settings (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) | [optional]

### Return type

[**ClusterCurationSettings**](ClusterCurationSettings.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="updateEsClusterMetadataSettings"></a>
# **updateEsClusterMetadataSettings**
> ClusterMetadataSettings updateEsClusterMetadataSettings(body, clusterId, version)

Update cluster metadata settings

All changes in the specified object are applied to the metadata object. Omitting existing fields causes the same values to be reapplied. Specifying a &#x60;null&#x60; value reverts the field to the default value, or removes the field when no default value exists.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
ClusterMetadataSettings body = new ClusterMetadataSettings(); // ClusterMetadataSettings | The cluster settings including updated values
String clusterId = "clusterId_example"; // String | Elasticsearch cluster identifier
Integer version = 56; // Integer | Checks for conflicts against the metadata version, then returns the value in the `x-cloud-resource-version` header.
try {
    ClusterMetadataSettings result = apiInstance.updateEsClusterMetadataSettings(body, clusterId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#updateEsClusterMetadataSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClusterMetadataSettings**](ClusterMetadataSettings.md)| The cluster settings including updated values |
 **clusterId** | **String**| Elasticsearch cluster identifier |
 **version** | **Integer**| Checks for conflicts against the metadata version, then returns the value in the &#x60;x-cloud-resource-version&#x60; header. | [optional]

### Return type

[**ClusterMetadataSettings**](ClusterMetadataSettings.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="updateEsClusterPlan"></a>
# **updateEsClusterPlan**
> ClusterCrudResponse updateEsClusterPlan(body, clusterId, validateOnly)

Update plan

Updates the configuration of the Elasticsearch cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
ElasticsearchClusterPlan body = new ElasticsearchClusterPlan(); // ElasticsearchClusterPlan | The update plan definition
String clusterId = "clusterId_example"; // String | The Elasticsearch cluster identifier.
Boolean validateOnly = true; // Boolean | When `true`, validates the cluster definition without performing the update.
try {
    ClusterCrudResponse result = apiInstance.updateEsClusterPlan(body, clusterId, validateOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#updateEsClusterPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ElasticsearchClusterPlan**](ElasticsearchClusterPlan.md)| The update plan definition |
 **clusterId** | **String**| The Elasticsearch cluster identifier. |
 **validateOnly** | **Boolean**| When &#x60;true&#x60;, validates the cluster definition without performing the update. | [optional]

### Return type

[**ClusterCrudResponse**](ClusterCrudResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="updateEsClusterSnapshotSettings"></a>
# **updateEsClusterSnapshotSettings**
> ClusterSnapshotSettings updateEsClusterSnapshotSettings(body, clusterId, version)

Update cluster snapshot settings

Any changes in the PATCHed object will be applied to the snapshot settings object.  PATCHing existing fields will cause same values to be re-applied. PATCHing a value of &#x27;null&#x27; will cause the field to be reverted to its default value or removed if no default value exists.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClustersElasticsearchApi;

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

ClustersElasticsearchApi apiInstance = new ClustersElasticsearchApi();
ClusterSnapshotSettings body = new ClusterSnapshotSettings(); // ClusterSnapshotSettings | The cluster snapshot settings including updated values
String clusterId = "clusterId_example"; // String | Identifier for the Elasticsearch cluster
Integer version = 56; // Integer | If specified then checks for conflicts against the version of the cluster snapshot settings (returned in 'x-cloud-resource-version' of the GET request)
try {
    ClusterSnapshotSettings result = apiInstance.updateEsClusterSnapshotSettings(body, clusterId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersElasticsearchApi#updateEsClusterSnapshotSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClusterSnapshotSettings**](ClusterSnapshotSettings.md)| The cluster snapshot settings including updated values |
 **clusterId** | **String**| Identifier for the Elasticsearch cluster |
 **version** | **Integer**| If specified then checks for conflicts against the version of the cluster snapshot settings (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) | [optional]

### Return type

[**ClusterSnapshotSettings**](ClusterSnapshotSettings.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

