# DeploymentsApi

All URIs are relative to *https://{{hostname}}/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelDeploymentResourcePendingPlan**](DeploymentsApi.md#cancelDeploymentResourcePendingPlan) | **DELETE** /deployments/{deployment_id}/{resource_kind}/{ref_id}/plan/pending | Cancel resource pending plan
[**createDeployment**](DeploymentsApi.md#createDeployment) | **POST** /deployments | Create Deployment
[**createDeploymentNote**](DeploymentsApi.md#createDeploymentNote) | **POST** /deployments/{deployment_id}/notes | Create deployment note
[**deleteDeployment**](DeploymentsApi.md#deleteDeployment) | **DELETE** /deployments/{deployment_id} | Delete Deployment
[**deleteDeploymentNote**](DeploymentsApi.md#deleteDeploymentNote) | **DELETE** /deployments/{deployment_id}/notes/{note_id} | Delete deployment note
[**deleteDeploymentStatelessResource**](DeploymentsApi.md#deleteDeploymentStatelessResource) | **DELETE** /deployments/{deployment_id}/{stateless_resource_kind}/{ref_id} | Delete Stateless Resource from Deployment
[**getDeployment**](DeploymentsApi.md#getDeployment) | **GET** /deployments/{deployment_id} | Get Deployment
[**getDeploymentApmResourceInfo**](DeploymentsApi.md#getDeploymentApmResourceInfo) | **GET** /deployments/{deployment_id}/apm/{ref_id} | Get Deployment APM Resource Info
[**getDeploymentAppsearchResourceInfo**](DeploymentsApi.md#getDeploymentAppsearchResourceInfo) | **GET** /deployments/{deployment_id}/appsearch/{ref_id} | Get Deployment App Search Resource Info
[**getDeploymentEsResourceInfo**](DeploymentsApi.md#getDeploymentEsResourceInfo) | **GET** /deployments/{deployment_id}/elasticsearch/{ref_id} | Get Deployment Elasticsearch Resource Info
[**getDeploymentKibResourceInfo**](DeploymentsApi.md#getDeploymentKibResourceInfo) | **GET** /deployments/{deployment_id}/kibana/{ref_id} | Get Deployment Kibana Resource Info
[**getDeploymentNote**](DeploymentsApi.md#getDeploymentNote) | **GET** /deployments/{deployment_id}/notes/{note_id} | Get a deployment note
[**getDeploymentNotes**](DeploymentsApi.md#getDeploymentNotes) | **GET** /deployments/{deployment_id}/notes | Get deployment notes
[**listDeployments**](DeploymentsApi.md#listDeployments) | **GET** /deployments | List Deployments
[**restartDeploymentEsResource**](DeploymentsApi.md#restartDeploymentEsResource) | **POST** /deployments/{deployment_id}/elasticsearch/{ref_id}/_restart | Restart Deployment Elasticsearch Resource
[**restartDeploymentStatelessResource**](DeploymentsApi.md#restartDeploymentStatelessResource) | **POST** /deployments/{deployment_id}/{stateless_resource_kind}/{ref_id}/_restart | Restart Deployment Stateless Resource
[**restoreDeployment**](DeploymentsApi.md#restoreDeployment) | **POST** /deployments/{deployment_id}/_restore | Restores a shutdown Deployment
[**restoreDeploymentResource**](DeploymentsApi.md#restoreDeploymentResource) | **POST** /deployments/{deployment_id}/{resource_kind}/{ref_id}/_restore | Restores a shutdown resource
[**resyncDeployment**](DeploymentsApi.md#resyncDeployment) | **POST** /deployments/{deployment_id}/_resync | Resynchronize Deployment
[**resyncDeployments**](DeploymentsApi.md#resyncDeployments) | **POST** /deployments/_resync | Resynchronize Deployments
[**searchDeployments**](DeploymentsApi.md#searchDeployments) | **POST** /deployments/_search | Search Deployments
[**setDeploymentResourceRawMetadata**](DeploymentsApi.md#setDeploymentResourceRawMetadata) | **POST** /deployments/{deployment_id}/{resource_kind}/{ref_id}/metadata/raw | Set a Deployment&#x27;s resource metadata
[**shutdownDeployment**](DeploymentsApi.md#shutdownDeployment) | **POST** /deployments/{deployment_id}/_shutdown | Shuts down Deployment
[**shutdownDeploymentEsResource**](DeploymentsApi.md#shutdownDeploymentEsResource) | **POST** /deployments/{deployment_id}/elasticsearch/{ref_id}/_shutdown | Shutdown Deployment Elasticsearch Resource
[**shutdownDeploymentStatelessResource**](DeploymentsApi.md#shutdownDeploymentStatelessResource) | **POST** /deployments/{deployment_id}/{stateless_resource_kind}/{ref_id}/_shutdown | Shutdown Deployment Stateless Resource
[**startDeploymentResourceInstances**](DeploymentsApi.md#startDeploymentResourceInstances) | **POST** /deployments/{deployment_id}/{resource_kind}/{ref_id}/instances/{instance_ids}/_start | Start instances
[**startDeploymentResourceInstancesAll**](DeploymentsApi.md#startDeploymentResourceInstancesAll) | **POST** /deployments/{deployment_id}/{resource_kind}/{ref_id}/instances/_start | Start all instances
[**startDeploymentResourceInstancesAllMaintenanceMode**](DeploymentsApi.md#startDeploymentResourceInstancesAllMaintenanceMode) | **POST** /deployments/{deployment_id}/{resource_kind}/{ref_id}/instances/maintenance-mode/_start | Start maintenance mode (all instances)
[**startDeploymentResourceMaintenanceMode**](DeploymentsApi.md#startDeploymentResourceMaintenanceMode) | **POST** /deployments/{deployment_id}/{resource_kind}/{ref_id}/instances/{instance_ids}/maintenance-mode/_start | Start maintenance mode
[**stopDeploymentResourceInstances**](DeploymentsApi.md#stopDeploymentResourceInstances) | **POST** /deployments/{deployment_id}/{resource_kind}/{ref_id}/instances/{instance_ids}/_stop | Stop of instances
[**stopDeploymentResourceInstancesAll**](DeploymentsApi.md#stopDeploymentResourceInstancesAll) | **POST** /deployments/{deployment_id}/{resource_kind}/{ref_id}/instances/_stop | Stop all instances
[**stopDeploymentResourceInstancesAllMaintenanceMode**](DeploymentsApi.md#stopDeploymentResourceInstancesAllMaintenanceMode) | **POST** /deployments/{deployment_id}/{resource_kind}/{ref_id}/instances/maintenance-mode/_stop | Stop maintenance mode (all instances)
[**stopDeploymentResourceMaintenanceMode**](DeploymentsApi.md#stopDeploymentResourceMaintenanceMode) | **POST** /deployments/{deployment_id}/{resource_kind}/{ref_id}/instances/{instance_ids}/maintenance-mode/_stop | Stop maintenance mode
[**updateDeployment**](DeploymentsApi.md#updateDeployment) | **PUT** /deployments/{deployment_id} | Update Deployment
[**updateDeploymentNote**](DeploymentsApi.md#updateDeploymentNote) | **PUT** /deployments/{deployment_id}/notes/{note_id} | Update deployment note
[**upgradeDeploymentStatelessResource**](DeploymentsApi.md#upgradeDeploymentStatelessResource) | **POST** /deployments/{deployment_id}/{stateless_resource_kind}/{ref_id}/_upgrade | Upgrade Kibana, APM, AppSearch inside Deployment

<a name="cancelDeploymentResourcePendingPlan"></a>
# **cancelDeploymentResourcePendingPlan**
> DeploymentResourceCrudResponse cancelDeploymentResourcePendingPlan(deploymentId, resourceKind, refId, forceDelete, ignoreMissing)

Cancel resource pending plan

Cancels the pending plan of a Resource belonging to a given Deployment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentId = "deploymentId_example"; // String | Identifier for the Deployment
String resourceKind = "resourceKind_example"; // String | The kind of resource
String refId = "refId_example"; // String | User-specified RefId for the Resource
Boolean forceDelete = true; // Boolean | When `true`, deletes the pending plan instead of attempting a graceful cancellation. The default is `false`.
Boolean ignoreMissing = true; // Boolean | When `true`, returns successfully, even when plans are missing. The default is `false`.
try {
    DeploymentResourceCrudResponse result = apiInstance.cancelDeploymentResourcePendingPlan(deploymentId, resourceKind, refId, forceDelete, ignoreMissing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#cancelDeploymentResourcePendingPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifier for the Deployment |
 **resourceKind** | **String**| The kind of resource | [enum: elasticsearch, kibana, apm, appsearch]
 **refId** | **String**| User-specified RefId for the Resource |
 **forceDelete** | **Boolean**| When &#x60;true&#x60;, deletes the pending plan instead of attempting a graceful cancellation. The default is &#x60;false&#x60;. | [optional]
 **ignoreMissing** | **Boolean**| When &#x60;true&#x60;, returns successfully, even when plans are missing. The default is &#x60;false&#x60;. | [optional]

### Return type

[**DeploymentResourceCrudResponse**](DeploymentResourceCrudResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="createDeployment"></a>
# **createDeployment**
> DeploymentCreateResponse createDeployment(body, requestId, validateOnly)

Create Deployment

Creates a Deployment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
DeploymentCreateRequest body = new DeploymentCreateRequest(); // DeploymentCreateRequest | The deployment definition
String requestId = "requestId_example"; // String | An optional idempotency token - if two create requests share the same request_id token (min size 32 characters, max 128) then only one deployment will be created, the second request will return the info of that deployment (in the same format described below, but with blanks for auth-related fields)
Boolean validateOnly = true; // Boolean | If true, will just validate the Deployment definition but will not perform the creation
try {
    DeploymentCreateResponse result = apiInstance.createDeployment(body, requestId, validateOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#createDeployment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeploymentCreateRequest**](DeploymentCreateRequest.md)| The deployment definition |
 **requestId** | **String**| An optional idempotency token - if two create requests share the same request_id token (min size 32 characters, max 128) then only one deployment will be created, the second request will return the info of that deployment (in the same format described below, but with blanks for auth-related fields) | [optional]
 **validateOnly** | **Boolean**| If true, will just validate the Deployment definition but will not perform the creation | [optional]

### Return type

[**DeploymentCreateResponse**](DeploymentCreateResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="createDeploymentNote"></a>
# **createDeploymentNote**
> Notes createDeploymentNote(body, deploymentId, version)

Create deployment note

Create note for the running deployment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
Note body = new Note(); // Note | New deployment note
String deploymentId = "deploymentId_example"; // String | Identifier for the deployment
Integer version = 56; // Integer | If specified then checks for conflicts against the version of the deployment note
try {
    Notes result = apiInstance.createDeploymentNote(body, deploymentId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#createDeploymentNote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Note**](Note.md)| New deployment note |
 **deploymentId** | **String**| Identifier for the deployment |
 **version** | **Integer**| If specified then checks for conflicts against the version of the deployment note | [optional]

### Return type

[**Notes**](Notes.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="deleteDeployment"></a>
# **deleteDeployment**
> DeploymentDeleteResponse deleteDeployment(deploymentId)

Delete Deployment

Deletes a Deployment and all its resources.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentId = "deploymentId_example"; // String | Identifier for the Deployment
try {
    DeploymentDeleteResponse result = apiInstance.deleteDeployment(deploymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#deleteDeployment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifier for the Deployment |

### Return type

[**DeploymentDeleteResponse**](DeploymentDeleteResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteDeploymentNote"></a>
# **deleteDeploymentNote**
> Notes deleteDeploymentNote(deploymentId, noteId, version)

Delete deployment note

Delete note for the running deployment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentId = "deploymentId_example"; // String | Identifier for the deployment
String noteId = "noteId_example"; // String | Identifier of the note to be deleted
Integer version = 56; // Integer | If specified then checks for conflicts against the version of the deployment note
try {
    Notes result = apiInstance.deleteDeploymentNote(deploymentId, noteId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#deleteDeploymentNote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifier for the deployment |
 **noteId** | **String**| Identifier of the note to be deleted |
 **version** | **Integer**| If specified then checks for conflicts against the version of the deployment note | [optional]

### Return type

[**Notes**](Notes.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteDeploymentStatelessResource"></a>
# **deleteDeploymentStatelessResource**
> DeploymentResourceCrudResponse deleteDeploymentStatelessResource(deploymentId, statelessResourceKind, refId)

Delete Stateless Resource from Deployment

Delete Stateless Resource belonging to a given Deployment. Deployment must be shutdown already.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentId = "deploymentId_example"; // String | Identifier for the Deployment
String statelessResourceKind = "statelessResourceKind_example"; // String | The kind of stateless resource
String refId = "refId_example"; // String | User-specified RefId for the Resource
try {
    DeploymentResourceCrudResponse result = apiInstance.deleteDeploymentStatelessResource(deploymentId, statelessResourceKind, refId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#deleteDeploymentStatelessResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifier for the Deployment |
 **statelessResourceKind** | **String**| The kind of stateless resource | [enum: kibana, apm, appsearch]
 **refId** | **String**| User-specified RefId for the Resource |

### Return type

[**DeploymentResourceCrudResponse**](DeploymentResourceCrudResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDeployment"></a>
# **getDeployment**
> DeploymentGetResponse getDeployment(deploymentId, showSecurity, showMetadata, showPlans, showPlanLogs, showPlanHistory, showPlanDefaults, convertLegacyPlans, showSystemAlerts, showSettings, enrichWithTemplate)

Get Deployment

Retrieves information about a Deployment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentId = "deploymentId_example"; // String | Identifier for the Deployment
Boolean showSecurity = true; // Boolean | Whether to include the Elasticsearch 2.x security information in the response - can be large per cluster and also include credentials
Boolean showMetadata = true; // Boolean | Whether to include the full cluster metadata in the response - can be large per cluster and also include credentials
Boolean showPlans = true; // Boolean | Whether to include the full current and pending plan information in the response - can be large per cluster
Boolean showPlanLogs = true; // Boolean | Whether to include with the current and pending plan information the attempt log - can be very large per cluster
Boolean showPlanHistory = true; // Boolean | Whether to include with the current and pending plan information the plan history- can be very large per cluster
Boolean showPlanDefaults = true; // Boolean | If showing plans, whether to show values that are left at their default value (less readable but more informative)
Boolean convertLegacyPlans = true; // Boolean | If showing plans, whether to leave pre-2.0.0 plans in their legacy format (the default), or whether to update them to 2.0.x+ format (if 'true')
Integer showSystemAlerts = 56; // Integer | Number of system alerts (such as forced restarts due to memory limits) to be included in the response - can be large per cluster. Negative numbers or 0 will not return field.
Boolean showSettings = true; // Boolean | Whether to show cluster settings in the response.
Boolean enrichWithTemplate = true; // Boolean | If showing plans, whether to enrich the plan by including the missing elements from the deployment template it is based on
try {
    DeploymentGetResponse result = apiInstance.getDeployment(deploymentId, showSecurity, showMetadata, showPlans, showPlanLogs, showPlanHistory, showPlanDefaults, convertLegacyPlans, showSystemAlerts, showSettings, enrichWithTemplate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#getDeployment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifier for the Deployment |
 **showSecurity** | **Boolean**| Whether to include the Elasticsearch 2.x security information in the response - can be large per cluster and also include credentials | [optional]
 **showMetadata** | **Boolean**| Whether to include the full cluster metadata in the response - can be large per cluster and also include credentials | [optional]
 **showPlans** | **Boolean**| Whether to include the full current and pending plan information in the response - can be large per cluster | [optional]
 **showPlanLogs** | **Boolean**| Whether to include with the current and pending plan information the attempt log - can be very large per cluster | [optional]
 **showPlanHistory** | **Boolean**| Whether to include with the current and pending plan information the plan history- can be very large per cluster | [optional]
 **showPlanDefaults** | **Boolean**| If showing plans, whether to show values that are left at their default value (less readable but more informative) | [optional]
 **convertLegacyPlans** | **Boolean**| If showing plans, whether to leave pre-2.0.0 plans in their legacy format (the default), or whether to update them to 2.0.x+ format (if &#x27;true&#x27;) | [optional]
 **showSystemAlerts** | **Integer**| Number of system alerts (such as forced restarts due to memory limits) to be included in the response - can be large per cluster. Negative numbers or 0 will not return field. | [optional]
 **showSettings** | **Boolean**| Whether to show cluster settings in the response. | [optional]
 **enrichWithTemplate** | **Boolean**| If showing plans, whether to enrich the plan by including the missing elements from the deployment template it is based on | [optional]

### Return type

[**DeploymentGetResponse**](DeploymentGetResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDeploymentApmResourceInfo"></a>
# **getDeploymentApmResourceInfo**
> ApmResourceInfo getDeploymentApmResourceInfo(deploymentId, refId, showMetadata, showPlans, showPlanLogs, showPlanHistory, showPlanDefaults, showSettings)

Get Deployment APM Resource Info

Get info about an APM Resource belonging to a given Deployment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentId = "deploymentId_example"; // String | Identifier for the Deployment
String refId = "refId_example"; // String | User-specified RefId for the Resource
Boolean showMetadata = true; // Boolean | Whether to include the full cluster metadata in the response - can be large per cluster and also include credentials
Boolean showPlans = true; // Boolean | Whether to include the full current and pending plan information in the response - can be large per cluster
Boolean showPlanLogs = true; // Boolean | Whether to include with the current and pending plan information the attempt log - can be very large per cluster
Boolean showPlanHistory = true; // Boolean | Whether to include with the current and pending plan information the plan history- can be very large per cluster
Boolean showPlanDefaults = true; // Boolean | If showing plans, whether to show values that are left at their default value (less readable but more informative)
Boolean showSettings = true; // Boolean | Whether to show cluster settings in the response.
try {
    ApmResourceInfo result = apiInstance.getDeploymentApmResourceInfo(deploymentId, refId, showMetadata, showPlans, showPlanLogs, showPlanHistory, showPlanDefaults, showSettings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#getDeploymentApmResourceInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifier for the Deployment |
 **refId** | **String**| User-specified RefId for the Resource |
 **showMetadata** | **Boolean**| Whether to include the full cluster metadata in the response - can be large per cluster and also include credentials | [optional]
 **showPlans** | **Boolean**| Whether to include the full current and pending plan information in the response - can be large per cluster | [optional]
 **showPlanLogs** | **Boolean**| Whether to include with the current and pending plan information the attempt log - can be very large per cluster | [optional]
 **showPlanHistory** | **Boolean**| Whether to include with the current and pending plan information the plan history- can be very large per cluster | [optional]
 **showPlanDefaults** | **Boolean**| If showing plans, whether to show values that are left at their default value (less readable but more informative) | [optional]
 **showSettings** | **Boolean**| Whether to show cluster settings in the response. | [optional]

### Return type

[**ApmResourceInfo**](ApmResourceInfo.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDeploymentAppsearchResourceInfo"></a>
# **getDeploymentAppsearchResourceInfo**
> AppSearchResourceInfo getDeploymentAppsearchResourceInfo(deploymentId, refId, showMetadata, showPlans, showPlanLogs, showPlanHistory, showPlanDefaults, showSettings)

Get Deployment App Search Resource Info

Get info about an App Search Resource belonging to a given Deployment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentId = "deploymentId_example"; // String | Identifier for the Deployment
String refId = "refId_example"; // String | User-specified RefId for the Resource
Boolean showMetadata = true; // Boolean | Whether to include the full cluster metadata in the response - can be large per cluster and also include credentials
Boolean showPlans = true; // Boolean | Whether to include the full current and pending plan information in the response - can be large per cluster
Boolean showPlanLogs = true; // Boolean | Whether to include with the current and pending plan information the attempt log - can be very large per cluster
Boolean showPlanHistory = true; // Boolean | Whether to include with the current and pending plan information the plan history- can be very large per cluster
Boolean showPlanDefaults = true; // Boolean | If showing plans, whether to show values that are left at their default value (less readable but more informative)
Boolean showSettings = true; // Boolean | Whether to show cluster settings in the response.
try {
    AppSearchResourceInfo result = apiInstance.getDeploymentAppsearchResourceInfo(deploymentId, refId, showMetadata, showPlans, showPlanLogs, showPlanHistory, showPlanDefaults, showSettings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#getDeploymentAppsearchResourceInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifier for the Deployment |
 **refId** | **String**| User-specified RefId for the Resource |
 **showMetadata** | **Boolean**| Whether to include the full cluster metadata in the response - can be large per cluster and also include credentials | [optional]
 **showPlans** | **Boolean**| Whether to include the full current and pending plan information in the response - can be large per cluster | [optional]
 **showPlanLogs** | **Boolean**| Whether to include with the current and pending plan information the attempt log - can be very large per cluster | [optional]
 **showPlanHistory** | **Boolean**| Whether to include with the current and pending plan information the plan history- can be very large per cluster | [optional]
 **showPlanDefaults** | **Boolean**| If showing plans, whether to show values that are left at their default value (less readable but more informative) | [optional]
 **showSettings** | **Boolean**| Whether to show cluster settings in the response. | [optional]

### Return type

[**AppSearchResourceInfo**](AppSearchResourceInfo.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDeploymentEsResourceInfo"></a>
# **getDeploymentEsResourceInfo**
> ElasticsearchResourceInfo getDeploymentEsResourceInfo(deploymentId, refId, showSecurity, showMetadata, showPlans, showPlanLogs, showPlanHistory, showPlanDefaults, convertLegacyPlans, showSystemAlerts, showSettings, enrichWithTemplate)

Get Deployment Elasticsearch Resource Info

Get info about an Elasticsearch Resource belonging to a given Deployment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentId = "deploymentId_example"; // String | Identifier for the Deployment
String refId = "refId_example"; // String | User-specified RefId for the Resource
Boolean showSecurity = true; // Boolean | Whether to include the Elasticsearch 2.x security information in the response - can be large per cluster and also include credentials
Boolean showMetadata = true; // Boolean | Whether to include the full cluster metadata in the response - can be large per cluster and also include credentials
Boolean showPlans = true; // Boolean | Whether to include the full current and pending plan information in the response - can be large per cluster
Boolean showPlanLogs = true; // Boolean | Whether to include with the current and pending plan information the attempt log - can be very large per cluster
Boolean showPlanHistory = true; // Boolean | Whether to include with the current and pending plan information the plan history- can be very large per cluster
Boolean showPlanDefaults = true; // Boolean | If showing plans, whether to show values that are left at their default value (less readable but more informative)
Boolean convertLegacyPlans = true; // Boolean | If showing plans, whether to leave pre-2.0.0 plans in their legacy format (the default), or whether to update them to 2.0.x+ format (if 'true')
Integer showSystemAlerts = 56; // Integer | Number of system alerts (such as forced restarts due to memory limits) to be included in the response - can be large per cluster. Negative numbers or 0 will not return field.
Boolean showSettings = true; // Boolean | Whether to show cluster settings in the response.
Boolean enrichWithTemplate = true; // Boolean | If showing plans, whether to enrich the plan by including the missing elements from the deployment template it is based on
try {
    ElasticsearchResourceInfo result = apiInstance.getDeploymentEsResourceInfo(deploymentId, refId, showSecurity, showMetadata, showPlans, showPlanLogs, showPlanHistory, showPlanDefaults, convertLegacyPlans, showSystemAlerts, showSettings, enrichWithTemplate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#getDeploymentEsResourceInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifier for the Deployment |
 **refId** | **String**| User-specified RefId for the Resource |
 **showSecurity** | **Boolean**| Whether to include the Elasticsearch 2.x security information in the response - can be large per cluster and also include credentials | [optional]
 **showMetadata** | **Boolean**| Whether to include the full cluster metadata in the response - can be large per cluster and also include credentials | [optional]
 **showPlans** | **Boolean**| Whether to include the full current and pending plan information in the response - can be large per cluster | [optional]
 **showPlanLogs** | **Boolean**| Whether to include with the current and pending plan information the attempt log - can be very large per cluster | [optional]
 **showPlanHistory** | **Boolean**| Whether to include with the current and pending plan information the plan history- can be very large per cluster | [optional]
 **showPlanDefaults** | **Boolean**| If showing plans, whether to show values that are left at their default value (less readable but more informative) | [optional]
 **convertLegacyPlans** | **Boolean**| If showing plans, whether to leave pre-2.0.0 plans in their legacy format (the default), or whether to update them to 2.0.x+ format (if &#x27;true&#x27;) | [optional]
 **showSystemAlerts** | **Integer**| Number of system alerts (such as forced restarts due to memory limits) to be included in the response - can be large per cluster. Negative numbers or 0 will not return field. | [optional]
 **showSettings** | **Boolean**| Whether to show cluster settings in the response. | [optional]
 **enrichWithTemplate** | **Boolean**| If showing plans, whether to enrich the plan by including the missing elements from the deployment template it is based on | [optional]

### Return type

[**ElasticsearchResourceInfo**](ElasticsearchResourceInfo.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDeploymentKibResourceInfo"></a>
# **getDeploymentKibResourceInfo**
> KibanaResourceInfo getDeploymentKibResourceInfo(deploymentId, refId, showMetadata, showPlans, showPlanLogs, showPlanHistory, showPlanDefaults, convertLegacyPlans, showSettings)

Get Deployment Kibana Resource Info

Get info about an Kibana Resource belonging to a given Deployment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentId = "deploymentId_example"; // String | Identifier for the Deployment
String refId = "refId_example"; // String | User-specified RefId for the Resource
Boolean showMetadata = true; // Boolean | Whether to include the full cluster metadata in the response - can be large per cluster and also include credentials
Boolean showPlans = true; // Boolean | Whether to include the full current and pending plan information in the response - can be large per cluster
Boolean showPlanLogs = true; // Boolean | Whether to include with the current and pending plan information the attempt log - can be very large per cluster
Boolean showPlanHistory = true; // Boolean | Whether to include with the current and pending plan information the plan history- can be very large per cluster
Boolean showPlanDefaults = true; // Boolean | If showing plans, whether to show values that are left at their default value (less readable but more informative)
Boolean convertLegacyPlans = true; // Boolean | If showing plans, whether to leave pre-2.0.0 plans in their legacy format (the default), or whether to update them to 2.0.x+ format (if 'true')
Boolean showSettings = true; // Boolean | Whether to show cluster settings in the response.
try {
    KibanaResourceInfo result = apiInstance.getDeploymentKibResourceInfo(deploymentId, refId, showMetadata, showPlans, showPlanLogs, showPlanHistory, showPlanDefaults, convertLegacyPlans, showSettings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#getDeploymentKibResourceInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifier for the Deployment |
 **refId** | **String**| User-specified RefId for the Resource |
 **showMetadata** | **Boolean**| Whether to include the full cluster metadata in the response - can be large per cluster and also include credentials | [optional]
 **showPlans** | **Boolean**| Whether to include the full current and pending plan information in the response - can be large per cluster | [optional]
 **showPlanLogs** | **Boolean**| Whether to include with the current and pending plan information the attempt log - can be very large per cluster | [optional]
 **showPlanHistory** | **Boolean**| Whether to include with the current and pending plan information the plan history- can be very large per cluster | [optional]
 **showPlanDefaults** | **Boolean**| If showing plans, whether to show values that are left at their default value (less readable but more informative) | [optional]
 **convertLegacyPlans** | **Boolean**| If showing plans, whether to leave pre-2.0.0 plans in their legacy format (the default), or whether to update them to 2.0.x+ format (if &#x27;true&#x27;) | [optional]
 **showSettings** | **Boolean**| Whether to show cluster settings in the response. | [optional]

### Return type

[**KibanaResourceInfo**](KibanaResourceInfo.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDeploymentNote"></a>
# **getDeploymentNote**
> Note getDeploymentNote(deploymentId, noteId)

Get a deployment note

Gets a deployment note.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentId = "deploymentId_example"; // String | Identifier for the deployment
String noteId = "noteId_example"; // String | Identifier of the note to be fetched
try {
    Note result = apiInstance.getDeploymentNote(deploymentId, noteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#getDeploymentNote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifier for the deployment |
 **noteId** | **String**| Identifier of the note to be fetched |

### Return type

[**Note**](Note.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDeploymentNotes"></a>
# **getDeploymentNotes**
> Notes getDeploymentNotes(deploymentId)

Get deployment notes

Get deployment notes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentId = "deploymentId_example"; // String | Identifier for the deployment
try {
    Notes result = apiInstance.getDeploymentNotes(deploymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#getDeploymentNotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifier for the deployment |

### Return type

[**Notes**](Notes.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="listDeployments"></a>
# **listDeployments**
> DeploymentsListResponse listDeployments()

List Deployments

List Deployments.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
try {
    DeploymentsListResponse result = apiInstance.listDeployments();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#listDeployments");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DeploymentsListResponse**](DeploymentsListResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="restartDeploymentEsResource"></a>
# **restartDeploymentEsResource**
> DeploymentResourceCommandResponse restartDeploymentEsResource(deploymentId, refId, restoreSnapshot, skipSnapshot, cancelPending, groupAttribute, shardInitWaitTime)

Restart Deployment Elasticsearch Resource

Restarts an Elasticsearch Resource. If a Resource is active: this command re-applies the existing plan but applies a \&quot;cluster_reboot\&quot;, which issues a restart command and waits for it to complete. If a Resource is inactive: this command starts it up with the most recent successful plan.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentId = "deploymentId_example"; // String | Identifier for the Deployment
String refId = "refId_example"; // String | User-specified RefId for the Resource
Boolean restoreSnapshot = true; // Boolean | If restoring from shutdown and true (the default), then will restore the cluster from the last snapshot (if available)
Boolean skipSnapshot = true; // Boolean | If true, will not take a snapshot of the cluster before restarting
Boolean cancelPending = true; // Boolean | If true, will cancel any pending plans before restarting (else will error)
String groupAttribute = "groupAttribute_example"; // String | Indicates the property or properties used to divide the list of instances to restart in groups. Valid options are: '\\_\\_all\\_\\_' (restart all at once), '\\_\\_zone\\_\\_' by logical zone, '\\_\\_name\\_\\_' one instance at the time, or a comma-separated list of attributes of the instances
Long shardInitWaitTime = 789L; // Long | The time, in seconds, to wait for shards that show no progress of initializing, before rolling the next group (default: 10 minutes)
try {
    DeploymentResourceCommandResponse result = apiInstance.restartDeploymentEsResource(deploymentId, refId, restoreSnapshot, skipSnapshot, cancelPending, groupAttribute, shardInitWaitTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#restartDeploymentEsResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifier for the Deployment |
 **refId** | **String**| User-specified RefId for the Resource |
 **restoreSnapshot** | **Boolean**| If restoring from shutdown and true (the default), then will restore the cluster from the last snapshot (if available) | [optional]
 **skipSnapshot** | **Boolean**| If true, will not take a snapshot of the cluster before restarting | [optional]
 **cancelPending** | **Boolean**| If true, will cancel any pending plans before restarting (else will error) | [optional]
 **groupAttribute** | **String**| Indicates the property or properties used to divide the list of instances to restart in groups. Valid options are: &#x27;\\_\\_all\\_\\_&#x27; (restart all at once), &#x27;\\_\\_zone\\_\\_&#x27; by logical zone, &#x27;\\_\\_name\\_\\_&#x27; one instance at the time, or a comma-separated list of attributes of the instances | [optional]
 **shardInitWaitTime** | **Long**| The time, in seconds, to wait for shards that show no progress of initializing, before rolling the next group (default: 10 minutes) | [optional]

### Return type

[**DeploymentResourceCommandResponse**](DeploymentResourceCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="restartDeploymentStatelessResource"></a>
# **restartDeploymentStatelessResource**
> DeploymentResourceCommandResponse restartDeploymentStatelessResource(deploymentId, statelessResourceKind, refId, cancelPending)

Restart Deployment Stateless Resource

Restarts an Stateless Resource. If a Resource is active: this command re-applies the existing plan but applies a \&quot;cluster_reboot\&quot;, which issues a restart command and waits for it to complete. If a Resource is inactive: this command starts it up with the most recent successful plan.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentId = "deploymentId_example"; // String | Identifier for the Deployment
String statelessResourceKind = "statelessResourceKind_example"; // String | The kind of stateless resource
String refId = "refId_example"; // String | User-specified RefId for the Resource
Boolean cancelPending = true; // Boolean | If true, will cancel any pending plans before restarting (else will error)
try {
    DeploymentResourceCommandResponse result = apiInstance.restartDeploymentStatelessResource(deploymentId, statelessResourceKind, refId, cancelPending);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#restartDeploymentStatelessResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifier for the Deployment |
 **statelessResourceKind** | **String**| The kind of stateless resource | [enum: kibana, apm, appsearch]
 **refId** | **String**| User-specified RefId for the Resource |
 **cancelPending** | **Boolean**| If true, will cancel any pending plans before restarting (else will error) | [optional]

### Return type

[**DeploymentResourceCommandResponse**](DeploymentResourceCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="restoreDeployment"></a>
# **restoreDeployment**
> DeploymentRestoreResponse restoreDeployment(deploymentId, restoreSnapshot)

Restores a shutdown Deployment

Restores all resources in a Deployment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentId = "deploymentId_example"; // String | Identifier for the Deployment
Boolean restoreSnapshot = true; // Boolean | Whether or not to restore a snapshot for those resources that allow it.
try {
    DeploymentRestoreResponse result = apiInstance.restoreDeployment(deploymentId, restoreSnapshot);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#restoreDeployment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifier for the Deployment |
 **restoreSnapshot** | **Boolean**| Whether or not to restore a snapshot for those resources that allow it. | [optional]

### Return type

[**DeploymentRestoreResponse**](DeploymentRestoreResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="restoreDeploymentResource"></a>
# **restoreDeploymentResource**
> DeploymentResourceCrudResponse restoreDeploymentResource(deploymentId, resourceKind, refId, restoreSnapshot)

Restores a shutdown resource

Restores a shutdown resource belonging to a given Deployment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentId = "deploymentId_example"; // String | Identifier for the Deployment
String resourceKind = "resourceKind_example"; // String | The kind of resource
String refId = "refId_example"; // String | User-specified RefId for the Resource
Boolean restoreSnapshot = true; // Boolean | Whether or not to restore a snapshot for those resources that allow it.
try {
    DeploymentResourceCrudResponse result = apiInstance.restoreDeploymentResource(deploymentId, resourceKind, refId, restoreSnapshot);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#restoreDeploymentResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifier for the Deployment |
 **resourceKind** | **String**| The kind of resource | [enum: elasticsearch, kibana, apm, appsearch]
 **refId** | **String**| User-specified RefId for the Resource |
 **restoreSnapshot** | **Boolean**| Whether or not to restore a snapshot for those resources that allow it. | [optional]

### Return type

[**DeploymentResourceCrudResponse**](DeploymentResourceCrudResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="resyncDeployment"></a>
# **resyncDeployment**
> IndexSynchronizationResults resyncDeployment(deploymentId)

Resynchronize Deployment

Immediately resynchronizes the search index for the selected deployment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentId = "deploymentId_example"; // String | Identifier for the deployment
try {
    IndexSynchronizationResults result = apiInstance.resyncDeployment(deploymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#resyncDeployment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifier for the deployment |

### Return type

[**IndexSynchronizationResults**](IndexSynchronizationResults.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="resyncDeployments"></a>
# **resyncDeployments**
> IndexSynchronizationResults resyncDeployments()

Resynchronize Deployments

Resynchronizes the search index for all the deployments.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
try {
    IndexSynchronizationResults result = apiInstance.resyncDeployments();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#resyncDeployments");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IndexSynchronizationResults**](IndexSynchronizationResults.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="searchDeployments"></a>
# **searchDeployments**
> DeploymentsSearchResponse searchDeployments(body)

Search Deployments

Retrieves the information for all of the Deployments that match the specified query.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
SearchRequest body = new SearchRequest(); // SearchRequest | (Optional) The search request to execute. NOTE: When not specified, all of the deployments are matched.
try {
    DeploymentsSearchResponse result = apiInstance.searchDeployments(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#searchDeployments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchRequest**](SearchRequest.md)| (Optional) The search request to execute. NOTE: When not specified, all of the deployments are matched. | [optional]

### Return type

[**DeploymentsSearchResponse**](DeploymentsSearchResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="setDeploymentResourceRawMetadata"></a>
# **setDeploymentResourceRawMetadata**
> String setDeploymentResourceRawMetadata(body, deploymentId, resourceKind, refId, version)

Set a Deployment&#x27;s resource metadata

Advanced use only. Sets the internal metadata, in free-form JSON, for the resource. Only use the parameter to set the modified JSON that is returned from the get version of the metadata.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
String body = "body_example"; // String | The freeform JSON for the cluster (should always be based on the current version retrieved from the GET)
String deploymentId = "deploymentId_example"; // String | Identifier for the Deployment
String resourceKind = "resourceKind_example"; // String | The kind of resource
String refId = "refId_example"; // String | User-specified RefId for the Resource
Integer version = 56; // Integer | If specified, checks for conflicts against the metadata version (returned in 'x-cloud-resource-version' of the GET request)
try {
    String result = apiInstance.setDeploymentResourceRawMetadata(body, deploymentId, resourceKind, refId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#setDeploymentResourceRawMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| The freeform JSON for the cluster (should always be based on the current version retrieved from the GET) |
 **deploymentId** | **String**| Identifier for the Deployment |
 **resourceKind** | **String**| The kind of resource | [enum: elasticsearch, kibana, apm, appsearch]
 **refId** | **String**| User-specified RefId for the Resource |
 **version** | **Integer**| If specified, checks for conflicts against the metadata version (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) | [optional]

### Return type

**String**

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="shutdownDeployment"></a>
# **shutdownDeployment**
> DeploymentShutdownResponse shutdownDeployment(deploymentId, hide, skipSnapshot)

Shuts down Deployment

Shuts down all resources in a Deployment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentId = "deploymentId_example"; // String | Identifier for the Deployment
Boolean hide = true; // Boolean | Whether or not to hide the deployment and its resources
Boolean skipSnapshot = true; // Boolean | Whether or not to skip snapshots before shutting down the resources
try {
    DeploymentShutdownResponse result = apiInstance.shutdownDeployment(deploymentId, hide, skipSnapshot);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#shutdownDeployment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifier for the Deployment |
 **hide** | **Boolean**| Whether or not to hide the deployment and its resources | [optional]
 **skipSnapshot** | **Boolean**| Whether or not to skip snapshots before shutting down the resources | [optional]

### Return type

[**DeploymentShutdownResponse**](DeploymentShutdownResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="shutdownDeploymentEsResource"></a>
# **shutdownDeploymentEsResource**
> DeploymentResourceCommandResponse shutdownDeploymentEsResource(deploymentId, refId, hide, skipSnapshot)

Shutdown Deployment Elasticsearch Resource

Shutdown Elasticsearch Resource belonging to a given Deployment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentId = "deploymentId_example"; // String | Identifier for the Deployment
String refId = "refId_example"; // String | User-specified RefId for the Resource
Boolean hide = true; // Boolean | Hide cluster on shutdown. Hidden clusters are not listed by default
Boolean skipSnapshot = true; // Boolean | If true, will skip taking a snapshot of the cluster before shutting the cluster down (if even possible)
try {
    DeploymentResourceCommandResponse result = apiInstance.shutdownDeploymentEsResource(deploymentId, refId, hide, skipSnapshot);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#shutdownDeploymentEsResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifier for the Deployment |
 **refId** | **String**| User-specified RefId for the Resource |
 **hide** | **Boolean**| Hide cluster on shutdown. Hidden clusters are not listed by default | [optional]
 **skipSnapshot** | **Boolean**| If true, will skip taking a snapshot of the cluster before shutting the cluster down (if even possible) | [optional]

### Return type

[**DeploymentResourceCommandResponse**](DeploymentResourceCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="shutdownDeploymentStatelessResource"></a>
# **shutdownDeploymentStatelessResource**
> DeploymentResourceCommandResponse shutdownDeploymentStatelessResource(deploymentId, statelessResourceKind, refId, hide, skipSnapshot)

Shutdown Deployment Stateless Resource

Shutdown Stateless Resource belonging to a given Deployment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentId = "deploymentId_example"; // String | Identifier for the Deployment
String statelessResourceKind = "statelessResourceKind_example"; // String | The kind of stateless resource
String refId = "refId_example"; // String | User-specified RefId for the Resource
Boolean hide = true; // Boolean | Hide cluster on shutdown. Hidden clusters are not listed by default
Boolean skipSnapshot = true; // Boolean | If true, will skip taking a snapshot of the cluster before shutting the cluster down (if even possible)
try {
    DeploymentResourceCommandResponse result = apiInstance.shutdownDeploymentStatelessResource(deploymentId, statelessResourceKind, refId, hide, skipSnapshot);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#shutdownDeploymentStatelessResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifier for the Deployment |
 **statelessResourceKind** | **String**| The kind of stateless resource | [enum: kibana, apm, appsearch]
 **refId** | **String**| User-specified RefId for the Resource |
 **hide** | **Boolean**| Hide cluster on shutdown. Hidden clusters are not listed by default | [optional]
 **skipSnapshot** | **Boolean**| If true, will skip taking a snapshot of the cluster before shutting the cluster down (if even possible) | [optional]

### Return type

[**DeploymentResourceCommandResponse**](DeploymentResourceCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="startDeploymentResourceInstances"></a>
# **startDeploymentResourceInstances**
> DeploymentResourceCommandResponse startDeploymentResourceInstances(deploymentId, resourceKind, refId, instanceIds, ignoreMissing)

Start instances

Starts instances belonging to a Deployment Resource.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentId = "deploymentId_example"; // String | Identifier for the Deployment
String resourceKind = "resourceKind_example"; // String | The kind of resource (one of elasticsearch, kibana or apm)
String refId = "refId_example"; // String | User-specified RefId for the Resource
List<String> instanceIds = Arrays.asList("instanceIds_example"); // List<String> | Comma-delimited list of instance identifiers of the Resource
Boolean ignoreMissing = true; // Boolean | If true and the instance does not exist then quietly proceed to the next instance, otherwise treated as an error
try {
    DeploymentResourceCommandResponse result = apiInstance.startDeploymentResourceInstances(deploymentId, resourceKind, refId, instanceIds, ignoreMissing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#startDeploymentResourceInstances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifier for the Deployment |
 **resourceKind** | **String**| The kind of resource (one of elasticsearch, kibana or apm) |
 **refId** | **String**| User-specified RefId for the Resource |
 **instanceIds** | [**List&lt;String&gt;**](String.md)| Comma-delimited list of instance identifiers of the Resource |
 **ignoreMissing** | **Boolean**| If true and the instance does not exist then quietly proceed to the next instance, otherwise treated as an error | [optional]

### Return type

[**DeploymentResourceCommandResponse**](DeploymentResourceCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="startDeploymentResourceInstancesAll"></a>
# **startDeploymentResourceInstancesAll**
> DeploymentResourceCommandResponse startDeploymentResourceInstancesAll(deploymentId, resourceKind, refId)

Start all instances

Starts all instances belonging to a Deployment Resource.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentId = "deploymentId_example"; // String | Identifier for the Deployment
String resourceKind = "resourceKind_example"; // String | The kind of resource (one of elasticsearch, kibana or apm)
String refId = "refId_example"; // String | User-specified RefId for the Resource
try {
    DeploymentResourceCommandResponse result = apiInstance.startDeploymentResourceInstancesAll(deploymentId, resourceKind, refId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#startDeploymentResourceInstancesAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifier for the Deployment |
 **resourceKind** | **String**| The kind of resource (one of elasticsearch, kibana or apm) |
 **refId** | **String**| User-specified RefId for the Resource |

### Return type

[**DeploymentResourceCommandResponse**](DeploymentResourceCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="startDeploymentResourceInstancesAllMaintenanceMode"></a>
# **startDeploymentResourceInstancesAllMaintenanceMode**
> DeploymentResourceCommandResponse startDeploymentResourceInstancesAllMaintenanceMode(deploymentId, resourceKind, refId)

Start maintenance mode (all instances)

Starts maintenance mode of all instances belonging to a Resource.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentId = "deploymentId_example"; // String | Identifier for the Deployment
String resourceKind = "resourceKind_example"; // String | The kind of resource (one of elasticsearch, kibana or apm)
String refId = "refId_example"; // String | User-specified RefId for the Resource
try {
    DeploymentResourceCommandResponse result = apiInstance.startDeploymentResourceInstancesAllMaintenanceMode(deploymentId, resourceKind, refId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#startDeploymentResourceInstancesAllMaintenanceMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifier for the Deployment |
 **resourceKind** | **String**| The kind of resource (one of elasticsearch, kibana or apm) |
 **refId** | **String**| User-specified RefId for the Resource |

### Return type

[**DeploymentResourceCommandResponse**](DeploymentResourceCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="startDeploymentResourceMaintenanceMode"></a>
# **startDeploymentResourceMaintenanceMode**
> DeploymentResourceCommandResponse startDeploymentResourceMaintenanceMode(deploymentId, resourceKind, refId, instanceIds, ignoreMissing)

Start maintenance mode

Starts maintenance mode of instances belonging to a Deployment Resource.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentId = "deploymentId_example"; // String | Identifier for the Deployment
String resourceKind = "resourceKind_example"; // String | The kind of resource (one of elasticsearch, kibana or apm)
String refId = "refId_example"; // String | User-specified RefId for the Resource
List<String> instanceIds = Arrays.asList("instanceIds_example"); // List<String> | Comma-delimited list of instance identifiers of the Resource
Boolean ignoreMissing = true; // Boolean | If true and the instance does not exist then quietly proceed to the next instance, otherwise treated as an error
try {
    DeploymentResourceCommandResponse result = apiInstance.startDeploymentResourceMaintenanceMode(deploymentId, resourceKind, refId, instanceIds, ignoreMissing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#startDeploymentResourceMaintenanceMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifier for the Deployment |
 **resourceKind** | **String**| The kind of resource (one of elasticsearch, kibana or apm) |
 **refId** | **String**| User-specified RefId for the Resource |
 **instanceIds** | [**List&lt;String&gt;**](String.md)| Comma-delimited list of instance identifiers of the Resource |
 **ignoreMissing** | **Boolean**| If true and the instance does not exist then quietly proceed to the next instance, otherwise treated as an error | [optional]

### Return type

[**DeploymentResourceCommandResponse**](DeploymentResourceCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="stopDeploymentResourceInstances"></a>
# **stopDeploymentResourceInstances**
> DeploymentResourceCommandResponse stopDeploymentResourceInstances(deploymentId, resourceKind, refId, instanceIds, ignoreMissing)

Stop of instances

Stops instances belonging to a Deployment Resource.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentId = "deploymentId_example"; // String | Identifier for the Deployment
String resourceKind = "resourceKind_example"; // String | The kind of resource (one of elasticsearch, kibana or apm)
String refId = "refId_example"; // String | User-specified RefId for the Resource
List<String> instanceIds = Arrays.asList("instanceIds_example"); // List<String> | Comma-delimited list of instance identifiers of the Resource
Boolean ignoreMissing = true; // Boolean | If true and the instance does not exist then quietly proceed to the next instance, otherwise treated as an error
try {
    DeploymentResourceCommandResponse result = apiInstance.stopDeploymentResourceInstances(deploymentId, resourceKind, refId, instanceIds, ignoreMissing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#stopDeploymentResourceInstances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifier for the Deployment |
 **resourceKind** | **String**| The kind of resource (one of elasticsearch, kibana or apm) |
 **refId** | **String**| User-specified RefId for the Resource |
 **instanceIds** | [**List&lt;String&gt;**](String.md)| Comma-delimited list of instance identifiers of the Resource |
 **ignoreMissing** | **Boolean**| If true and the instance does not exist then quietly proceed to the next instance, otherwise treated as an error | [optional]

### Return type

[**DeploymentResourceCommandResponse**](DeploymentResourceCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="stopDeploymentResourceInstancesAll"></a>
# **stopDeploymentResourceInstancesAll**
> DeploymentResourceCommandResponse stopDeploymentResourceInstancesAll(deploymentId, resourceKind, refId)

Stop all instances

Stops all instances belonging to a Deployment Resource.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentId = "deploymentId_example"; // String | Identifier for the Deployment
String resourceKind = "resourceKind_example"; // String | The kind of resource (one of elasticsearch, kibana or apm)
String refId = "refId_example"; // String | User-specified RefId for the Resource
try {
    DeploymentResourceCommandResponse result = apiInstance.stopDeploymentResourceInstancesAll(deploymentId, resourceKind, refId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#stopDeploymentResourceInstancesAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifier for the Deployment |
 **resourceKind** | **String**| The kind of resource (one of elasticsearch, kibana or apm) |
 **refId** | **String**| User-specified RefId for the Resource |

### Return type

[**DeploymentResourceCommandResponse**](DeploymentResourceCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="stopDeploymentResourceInstancesAllMaintenanceMode"></a>
# **stopDeploymentResourceInstancesAllMaintenanceMode**
> DeploymentResourceCommandResponse stopDeploymentResourceInstancesAllMaintenanceMode(deploymentId, resourceKind, refId)

Stop maintenance mode (all instances)

Stops maintenance mode of all instances belonging to a Deployment Resource.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentId = "deploymentId_example"; // String | Identifier for the Deployment
String resourceKind = "resourceKind_example"; // String | The kind of resource (one of elasticsearch, kibana or apm)
String refId = "refId_example"; // String | User-specified RefId for the Resource
try {
    DeploymentResourceCommandResponse result = apiInstance.stopDeploymentResourceInstancesAllMaintenanceMode(deploymentId, resourceKind, refId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#stopDeploymentResourceInstancesAllMaintenanceMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifier for the Deployment |
 **resourceKind** | **String**| The kind of resource (one of elasticsearch, kibana or apm) |
 **refId** | **String**| User-specified RefId for the Resource |

### Return type

[**DeploymentResourceCommandResponse**](DeploymentResourceCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="stopDeploymentResourceMaintenanceMode"></a>
# **stopDeploymentResourceMaintenanceMode**
> DeploymentResourceCommandResponse stopDeploymentResourceMaintenanceMode(deploymentId, resourceKind, refId, instanceIds, ignoreMissing)

Stop maintenance mode

Stops maintenance mode of instances belonging to a Deployment Resource.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentId = "deploymentId_example"; // String | Identifier for the Deployment
String resourceKind = "resourceKind_example"; // String | The kind of resource (one of elasticsearch, kibana or apm)
String refId = "refId_example"; // String | User-specified RefId for the Resource
List<String> instanceIds = Arrays.asList("instanceIds_example"); // List<String> | Comma-delimited list of instance identifiers of the Resource
Boolean ignoreMissing = true; // Boolean | If true and the instance does not exist then quietly proceed to the next instance, otherwise treated as an error
try {
    DeploymentResourceCommandResponse result = apiInstance.stopDeploymentResourceMaintenanceMode(deploymentId, resourceKind, refId, instanceIds, ignoreMissing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#stopDeploymentResourceMaintenanceMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifier for the Deployment |
 **resourceKind** | **String**| The kind of resource (one of elasticsearch, kibana or apm) |
 **refId** | **String**| User-specified RefId for the Resource |
 **instanceIds** | [**List&lt;String&gt;**](String.md)| Comma-delimited list of instance identifiers of the Resource |
 **ignoreMissing** | **Boolean**| If true and the instance does not exist then quietly proceed to the next instance, otherwise treated as an error | [optional]

### Return type

[**DeploymentResourceCommandResponse**](DeploymentResourceCommandResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateDeployment"></a>
# **updateDeployment**
> DeploymentUpdateResponse updateDeployment(body, deploymentId, hidePrunedOrphans, skipSnapshot, validateOnly, version)

Update Deployment

Updates a Deployment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
DeploymentUpdateRequest body = new DeploymentUpdateRequest(); // DeploymentUpdateRequest | The deployment definition
String deploymentId = "deploymentId_example"; // String | Identifier for the Deployment
Boolean hidePrunedOrphans = true; // Boolean | Whether or not to hide orphaned resources that were shut down (relevant if prune on the request is true)
Boolean skipSnapshot = true; // Boolean | Whether or not to skip snapshots before shutting down orphaned resources (relevant if prune on the request is true)
Boolean validateOnly = true; // Boolean | If true, will just validate the Deployment definition but will not perform the update
Integer version = 56; // Integer | If specified then checks for conflicts against the version stored in the persistent store (returned in 'x-cloud-resource-version' of the GET request)
try {
    DeploymentUpdateResponse result = apiInstance.updateDeployment(body, deploymentId, hidePrunedOrphans, skipSnapshot, validateOnly, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#updateDeployment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeploymentUpdateRequest**](DeploymentUpdateRequest.md)| The deployment definition |
 **deploymentId** | **String**| Identifier for the Deployment |
 **hidePrunedOrphans** | **Boolean**| Whether or not to hide orphaned resources that were shut down (relevant if prune on the request is true) | [optional]
 **skipSnapshot** | **Boolean**| Whether or not to skip snapshots before shutting down orphaned resources (relevant if prune on the request is true) | [optional]
 **validateOnly** | **Boolean**| If true, will just validate the Deployment definition but will not perform the update | [optional]
 **version** | **Integer**| If specified then checks for conflicts against the version stored in the persistent store (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) | [optional]

### Return type

[**DeploymentUpdateResponse**](DeploymentUpdateResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="updateDeploymentNote"></a>
# **updateDeploymentNote**
> Note updateDeploymentNote(body, deploymentId, noteId, version)

Update deployment note

Update note for the running deployment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
Note body = new Note(); // Note | New content for deployment note
String deploymentId = "deploymentId_example"; // String | Identifier for the deployment
String noteId = "noteId_example"; // String | Identifier of the note to be updated
Integer version = 56; // Integer | If specified then checks for conflicts against the version of the deployment note
try {
    Note result = apiInstance.updateDeploymentNote(body, deploymentId, noteId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#updateDeploymentNote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Note**](Note.md)| New content for deployment note |
 **deploymentId** | **String**| Identifier for the deployment |
 **noteId** | **String**| Identifier of the note to be updated |
 **version** | **Integer**| If specified then checks for conflicts against the version of the deployment note | [optional]

### Return type

[**Note**](Note.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="upgradeDeploymentStatelessResource"></a>
# **upgradeDeploymentStatelessResource**
> DeploymentResourceUpgradeResponse upgradeDeploymentStatelessResource(deploymentId, statelessResourceKind, refId, validateOnly)

Upgrade Kibana, APM, AppSearch inside Deployment

Upgrades a running cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

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

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentId = "deploymentId_example"; // String | Identifier for the Deployment
String statelessResourceKind = "statelessResourceKind_example"; // String | The kind of stateless resource
String refId = "refId_example"; // String | User-specified RefId for the Resource
Boolean validateOnly = true; // Boolean | When `true`, returns the update version without performing the upgrade
try {
    DeploymentResourceUpgradeResponse result = apiInstance.upgradeDeploymentStatelessResource(deploymentId, statelessResourceKind, refId, validateOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#upgradeDeploymentStatelessResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifier for the Deployment |
 **statelessResourceKind** | **String**| The kind of stateless resource | [enum: kibana, apm, appsearch]
 **refId** | **String**| User-specified RefId for the Resource |
 **validateOnly** | **Boolean**| When &#x60;true&#x60;, returns the update version without performing the upgrade | [optional]

### Return type

[**DeploymentResourceUpgradeResponse**](DeploymentResourceUpgradeResponse.md)

### Authorization

[apiKey](../README.md#apiKey)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

