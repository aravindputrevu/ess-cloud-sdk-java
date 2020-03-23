/*
 * Elastic Cloud API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.BasicFailedReply;
import io.swagger.client.model.EmptyResponse;
import io.swagger.client.model.IdResponse;
import io.swagger.client.model.InstanceConfiguration;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlatformConfigurationInstancesApi {
    private ApiClient apiClient;

    public PlatformConfigurationInstancesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PlatformConfigurationInstancesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createInstanceConfiguration
     * @param body the Instance Configuration (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createInstanceConfigurationCall(InstanceConfiguration body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/platform/configuration/instances";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "*/*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey", "basicAuth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createInstanceConfigurationValidateBeforeCall(InstanceConfiguration body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createInstanceConfiguration(Async)");
        }
        
        com.squareup.okhttp.Call call = createInstanceConfigurationCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create instance configuration
     * Create instance configuration and return the auto-generated ID.
     * @param body the Instance Configuration (required)
     * @return IdResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IdResponse createInstanceConfiguration(InstanceConfiguration body) throws ApiException {
        ApiResponse<IdResponse> resp = createInstanceConfigurationWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create instance configuration
     * Create instance configuration and return the auto-generated ID.
     * @param body the Instance Configuration (required)
     * @return ApiResponse&lt;IdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<IdResponse> createInstanceConfigurationWithHttpInfo(InstanceConfiguration body) throws ApiException {
        com.squareup.okhttp.Call call = createInstanceConfigurationValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<IdResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create instance configuration (asynchronously)
     * Create instance configuration and return the auto-generated ID.
     * @param body the Instance Configuration (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createInstanceConfigurationAsync(InstanceConfiguration body, final ApiCallback<IdResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createInstanceConfigurationValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<IdResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteInstanceConfiguration
     * @param id ID of the instance configuration (required)
     * @param version If specified, checks for conflicts against the version of the repository configuration (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteInstanceConfigurationCall(String id, Integer version, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/platform/configuration/instances/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (version != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("version", version));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey", "basicAuth" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteInstanceConfigurationValidateBeforeCall(String id, Integer version, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteInstanceConfiguration(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteInstanceConfigurationCall(id, version, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete a instance configuration
     * Delete the instance configuration with the given id.
     * @param id ID of the instance configuration (required)
     * @param version If specified, checks for conflicts against the version of the repository configuration (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) (optional)
     * @return EmptyResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EmptyResponse deleteInstanceConfiguration(String id, Integer version) throws ApiException {
        ApiResponse<EmptyResponse> resp = deleteInstanceConfigurationWithHttpInfo(id, version);
        return resp.getData();
    }

    /**
     * Delete a instance configuration
     * Delete the instance configuration with the given id.
     * @param id ID of the instance configuration (required)
     * @param version If specified, checks for conflicts against the version of the repository configuration (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) (optional)
     * @return ApiResponse&lt;EmptyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EmptyResponse> deleteInstanceConfigurationWithHttpInfo(String id, Integer version) throws ApiException {
        com.squareup.okhttp.Call call = deleteInstanceConfigurationValidateBeforeCall(id, version, null, null);
        Type localVarReturnType = new TypeToken<EmptyResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete a instance configuration (asynchronously)
     * Delete the instance configuration with the given id.
     * @param id ID of the instance configuration (required)
     * @param version If specified, checks for conflicts against the version of the repository configuration (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteInstanceConfigurationAsync(String id, Integer version, final ApiCallback<EmptyResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteInstanceConfigurationValidateBeforeCall(id, version, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EmptyResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getInstanceConfiguration
     * @param id ID of the instance configuration (required)
     * @param showDeleted If true, if the instance configuration has been marked for deletion it is still returned. Otherwise, instance configurations marked for deletion generate a 404 (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getInstanceConfigurationCall(String id, Boolean showDeleted, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/platform/configuration/instances/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (showDeleted != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("show_deleted", showDeleted));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey", "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getInstanceConfigurationValidateBeforeCall(String id, Boolean showDeleted, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getInstanceConfiguration(Async)");
        }
        
        com.squareup.okhttp.Call call = getInstanceConfigurationCall(id, showDeleted, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get instance configuration
     * Get instance configuration by id.
     * @param id ID of the instance configuration (required)
     * @param showDeleted If true, if the instance configuration has been marked for deletion it is still returned. Otherwise, instance configurations marked for deletion generate a 404 (optional)
     * @return InstanceConfiguration
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InstanceConfiguration getInstanceConfiguration(String id, Boolean showDeleted) throws ApiException {
        ApiResponse<InstanceConfiguration> resp = getInstanceConfigurationWithHttpInfo(id, showDeleted);
        return resp.getData();
    }

    /**
     * Get instance configuration
     * Get instance configuration by id.
     * @param id ID of the instance configuration (required)
     * @param showDeleted If true, if the instance configuration has been marked for deletion it is still returned. Otherwise, instance configurations marked for deletion generate a 404 (optional)
     * @return ApiResponse&lt;InstanceConfiguration&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InstanceConfiguration> getInstanceConfigurationWithHttpInfo(String id, Boolean showDeleted) throws ApiException {
        com.squareup.okhttp.Call call = getInstanceConfigurationValidateBeforeCall(id, showDeleted, null, null);
        Type localVarReturnType = new TypeToken<InstanceConfiguration>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get instance configuration (asynchronously)
     * Get instance configuration by id.
     * @param id ID of the instance configuration (required)
     * @param showDeleted If true, if the instance configuration has been marked for deletion it is still returned. Otherwise, instance configurations marked for deletion generate a 404 (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getInstanceConfigurationAsync(String id, Boolean showDeleted, final ApiCallback<InstanceConfiguration> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getInstanceConfigurationValidateBeforeCall(id, showDeleted, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InstanceConfiguration>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getInstanceConfigurations
     * @param showDeleted If true, instance configurations marked for deletions are also returned. Otherwise, only instance configurations not marked for deletion are returned (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getInstanceConfigurationsCall(Boolean showDeleted, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/platform/configuration/instances";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (showDeleted != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("show_deleted", showDeleted));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey", "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getInstanceConfigurationsValidateBeforeCall(Boolean showDeleted, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getInstanceConfigurationsCall(showDeleted, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get instance configurations
     * Get instance configurations.
     * @param showDeleted If true, instance configurations marked for deletions are also returned. Otherwise, only instance configurations not marked for deletion are returned (optional)
     * @return List&lt;InstanceConfiguration&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<InstanceConfiguration> getInstanceConfigurations(Boolean showDeleted) throws ApiException {
        ApiResponse<List<InstanceConfiguration>> resp = getInstanceConfigurationsWithHttpInfo(showDeleted);
        return resp.getData();
    }

    /**
     * Get instance configurations
     * Get instance configurations.
     * @param showDeleted If true, instance configurations marked for deletions are also returned. Otherwise, only instance configurations not marked for deletion are returned (optional)
     * @return ApiResponse&lt;List&lt;InstanceConfiguration&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<InstanceConfiguration>> getInstanceConfigurationsWithHttpInfo(Boolean showDeleted) throws ApiException {
        com.squareup.okhttp.Call call = getInstanceConfigurationsValidateBeforeCall(showDeleted, null, null);
        Type localVarReturnType = new TypeToken<List<InstanceConfiguration>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get instance configurations (asynchronously)
     * Get instance configurations.
     * @param showDeleted If true, instance configurations marked for deletions are also returned. Otherwise, only instance configurations not marked for deletion are returned (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getInstanceConfigurationsAsync(Boolean showDeleted, final ApiCallback<List<InstanceConfiguration>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getInstanceConfigurationsValidateBeforeCall(showDeleted, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<InstanceConfiguration>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for setInstanceConfiguration
     * @param body the Instance Configuration (required)
     * @param id ID of the instance configuration (required)
     * @param version If specified, checks for conflicts against the version of the repository configuration (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) (optional)
     * @param createOnly If true, will fail if an instance configuration already exists at the given id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call setInstanceConfigurationCall(InstanceConfiguration body, String id, Integer version, Boolean createOnly, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/platform/configuration/instances/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (version != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("version", version));
        if (createOnly != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("create_only", createOnly));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "*/*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey", "basicAuth" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call setInstanceConfigurationValidateBeforeCall(InstanceConfiguration body, String id, Integer version, Boolean createOnly, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling setInstanceConfiguration(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling setInstanceConfiguration(Async)");
        }
        
        com.squareup.okhttp.Call call = setInstanceConfigurationCall(body, id, version, createOnly, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Set instance configuration
     * Creates or updates an instance configuration.
     * @param body the Instance Configuration (required)
     * @param id ID of the instance configuration (required)
     * @param version If specified, checks for conflicts against the version of the repository configuration (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) (optional)
     * @param createOnly If true, will fail if an instance configuration already exists at the given id (optional)
     * @return IdResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IdResponse setInstanceConfiguration(InstanceConfiguration body, String id, Integer version, Boolean createOnly) throws ApiException {
        ApiResponse<IdResponse> resp = setInstanceConfigurationWithHttpInfo(body, id, version, createOnly);
        return resp.getData();
    }

    /**
     * Set instance configuration
     * Creates or updates an instance configuration.
     * @param body the Instance Configuration (required)
     * @param id ID of the instance configuration (required)
     * @param version If specified, checks for conflicts against the version of the repository configuration (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) (optional)
     * @param createOnly If true, will fail if an instance configuration already exists at the given id (optional)
     * @return ApiResponse&lt;IdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<IdResponse> setInstanceConfigurationWithHttpInfo(InstanceConfiguration body, String id, Integer version, Boolean createOnly) throws ApiException {
        com.squareup.okhttp.Call call = setInstanceConfigurationValidateBeforeCall(body, id, version, createOnly, null, null);
        Type localVarReturnType = new TypeToken<IdResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Set instance configuration (asynchronously)
     * Creates or updates an instance configuration.
     * @param body the Instance Configuration (required)
     * @param id ID of the instance configuration (required)
     * @param version If specified, checks for conflicts against the version of the repository configuration (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) (optional)
     * @param createOnly If true, will fail if an instance configuration already exists at the given id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call setInstanceConfigurationAsync(InstanceConfiguration body, String id, Integer version, Boolean createOnly, final ApiCallback<IdResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = setInstanceConfigurationValidateBeforeCall(body, id, version, createOnly, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<IdResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
