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
import io.swagger.client.model.DeploymentTemplateInfo;
import io.swagger.client.model.EmptyResponse;
import io.swagger.client.model.IdResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlatformConfigurationTemplatesApi {
    private ApiClient apiClient;

    public PlatformConfigurationTemplatesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PlatformConfigurationTemplatesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createDeploymentTemplate
     * @param body The deployment template definition. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createDeploymentTemplateCall(DeploymentTemplateInfo body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/platform/configuration/templates/deployments";

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
    private com.squareup.okhttp.Call createDeploymentTemplateValidateBeforeCall(DeploymentTemplateInfo body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createDeploymentTemplate(Async)");
        }
        
        com.squareup.okhttp.Call call = createDeploymentTemplateCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create deployment template
     * Creates a deployment template.
     * @param body The deployment template definition. (required)
     * @return IdResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IdResponse createDeploymentTemplate(DeploymentTemplateInfo body) throws ApiException {
        ApiResponse<IdResponse> resp = createDeploymentTemplateWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create deployment template
     * Creates a deployment template.
     * @param body The deployment template definition. (required)
     * @return ApiResponse&lt;IdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<IdResponse> createDeploymentTemplateWithHttpInfo(DeploymentTemplateInfo body) throws ApiException {
        com.squareup.okhttp.Call call = createDeploymentTemplateValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<IdResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create deployment template (asynchronously)
     * Creates a deployment template.
     * @param body The deployment template definition. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createDeploymentTemplateAsync(DeploymentTemplateInfo body, final ApiCallback<IdResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createDeploymentTemplateValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<IdResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteDeploymentTemplate
     * @param templateId The identifier for the deployment template. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteDeploymentTemplateCall(String templateId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/platform/configuration/templates/deployments/{template_id}"
            .replaceAll("\\{" + "template_id" + "\\}", apiClient.escapeString(templateId.toString()));

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
    private com.squareup.okhttp.Call deleteDeploymentTemplateValidateBeforeCall(String templateId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'templateId' is set
        if (templateId == null) {
            throw new ApiException("Missing the required parameter 'templateId' when calling deleteDeploymentTemplate(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteDeploymentTemplateCall(templateId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete deployment template
     * Deletes a deployment template by id.
     * @param templateId The identifier for the deployment template. (required)
     * @return EmptyResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EmptyResponse deleteDeploymentTemplate(String templateId) throws ApiException {
        ApiResponse<EmptyResponse> resp = deleteDeploymentTemplateWithHttpInfo(templateId);
        return resp.getData();
    }

    /**
     * Delete deployment template
     * Deletes a deployment template by id.
     * @param templateId The identifier for the deployment template. (required)
     * @return ApiResponse&lt;EmptyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EmptyResponse> deleteDeploymentTemplateWithHttpInfo(String templateId) throws ApiException {
        com.squareup.okhttp.Call call = deleteDeploymentTemplateValidateBeforeCall(templateId, null, null);
        Type localVarReturnType = new TypeToken<EmptyResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete deployment template (asynchronously)
     * Deletes a deployment template by id.
     * @param templateId The identifier for the deployment template. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteDeploymentTemplateAsync(String templateId, final ApiCallback<EmptyResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteDeploymentTemplateValidateBeforeCall(templateId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EmptyResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDeploymentTemplate
     * @param templateId The identifier for the deployment template. (required)
     * @param showInstanceConfigurations If true, will return details for each instance configuration referenced by the template. (optional)
     * @param stackVersion If present, it will cause the returned deployment template to be adapted to return only the elements allowed in that version. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDeploymentTemplateCall(String templateId, Boolean showInstanceConfigurations, String stackVersion, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/platform/configuration/templates/deployments/{template_id}"
            .replaceAll("\\{" + "template_id" + "\\}", apiClient.escapeString(templateId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (showInstanceConfigurations != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("show_instance_configurations", showInstanceConfigurations));
        if (stackVersion != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("stack_version", stackVersion));

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
    private com.squareup.okhttp.Call getDeploymentTemplateValidateBeforeCall(String templateId, Boolean showInstanceConfigurations, String stackVersion, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'templateId' is set
        if (templateId == null) {
            throw new ApiException("Missing the required parameter 'templateId' when calling getDeploymentTemplate(Async)");
        }
        
        com.squareup.okhttp.Call call = getDeploymentTemplateCall(templateId, showInstanceConfigurations, stackVersion, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get deployment template
     * Retrieves a deployment template by id.
     * @param templateId The identifier for the deployment template. (required)
     * @param showInstanceConfigurations If true, will return details for each instance configuration referenced by the template. (optional)
     * @param stackVersion If present, it will cause the returned deployment template to be adapted to return only the elements allowed in that version. (optional)
     * @return DeploymentTemplateInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeploymentTemplateInfo getDeploymentTemplate(String templateId, Boolean showInstanceConfigurations, String stackVersion) throws ApiException {
        ApiResponse<DeploymentTemplateInfo> resp = getDeploymentTemplateWithHttpInfo(templateId, showInstanceConfigurations, stackVersion);
        return resp.getData();
    }

    /**
     * Get deployment template
     * Retrieves a deployment template by id.
     * @param templateId The identifier for the deployment template. (required)
     * @param showInstanceConfigurations If true, will return details for each instance configuration referenced by the template. (optional)
     * @param stackVersion If present, it will cause the returned deployment template to be adapted to return only the elements allowed in that version. (optional)
     * @return ApiResponse&lt;DeploymentTemplateInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeploymentTemplateInfo> getDeploymentTemplateWithHttpInfo(String templateId, Boolean showInstanceConfigurations, String stackVersion) throws ApiException {
        com.squareup.okhttp.Call call = getDeploymentTemplateValidateBeforeCall(templateId, showInstanceConfigurations, stackVersion, null, null);
        Type localVarReturnType = new TypeToken<DeploymentTemplateInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get deployment template (asynchronously)
     * Retrieves a deployment template by id.
     * @param templateId The identifier for the deployment template. (required)
     * @param showInstanceConfigurations If true, will return details for each instance configuration referenced by the template. (optional)
     * @param stackVersion If present, it will cause the returned deployment template to be adapted to return only the elements allowed in that version. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDeploymentTemplateAsync(String templateId, Boolean showInstanceConfigurations, String stackVersion, final ApiCallback<DeploymentTemplateInfo> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDeploymentTemplateValidateBeforeCall(templateId, showInstanceConfigurations, stackVersion, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeploymentTemplateInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDeploymentTemplates
     * @param metadata An optional key/value pair in the form of (key:value) that will act as a filter and exclude any templates that do not have a matching metadata item associated. (optional)
     * @param showInstanceConfigurations If true, will return details for each instance configuration referenced by the template. (optional)
     * @param stackVersion If present, it will cause the returned deployment templates to be adapted to return only the elements allowed in that version. (optional)
     * @param showHidden If true, templates flagged as hidden will be returned. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDeploymentTemplatesCall(String metadata, Boolean showInstanceConfigurations, String stackVersion, Boolean showHidden, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/platform/configuration/templates/deployments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (metadata != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("metadata", metadata));
        if (showInstanceConfigurations != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("show_instance_configurations", showInstanceConfigurations));
        if (stackVersion != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("stack_version", stackVersion));
        if (showHidden != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("show_hidden", showHidden));

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
    private com.squareup.okhttp.Call getDeploymentTemplatesValidateBeforeCall(String metadata, Boolean showInstanceConfigurations, String stackVersion, Boolean showHidden, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getDeploymentTemplatesCall(metadata, showInstanceConfigurations, stackVersion, showHidden, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get deployment templates
     * Retrieves all deployment templates.
     * @param metadata An optional key/value pair in the form of (key:value) that will act as a filter and exclude any templates that do not have a matching metadata item associated. (optional)
     * @param showInstanceConfigurations If true, will return details for each instance configuration referenced by the template. (optional)
     * @param stackVersion If present, it will cause the returned deployment templates to be adapted to return only the elements allowed in that version. (optional)
     * @param showHidden If true, templates flagged as hidden will be returned. (optional)
     * @return List&lt;DeploymentTemplateInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<DeploymentTemplateInfo> getDeploymentTemplates(String metadata, Boolean showInstanceConfigurations, String stackVersion, Boolean showHidden) throws ApiException {
        ApiResponse<List<DeploymentTemplateInfo>> resp = getDeploymentTemplatesWithHttpInfo(metadata, showInstanceConfigurations, stackVersion, showHidden);
        return resp.getData();
    }

    /**
     * Get deployment templates
     * Retrieves all deployment templates.
     * @param metadata An optional key/value pair in the form of (key:value) that will act as a filter and exclude any templates that do not have a matching metadata item associated. (optional)
     * @param showInstanceConfigurations If true, will return details for each instance configuration referenced by the template. (optional)
     * @param stackVersion If present, it will cause the returned deployment templates to be adapted to return only the elements allowed in that version. (optional)
     * @param showHidden If true, templates flagged as hidden will be returned. (optional)
     * @return ApiResponse&lt;List&lt;DeploymentTemplateInfo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<DeploymentTemplateInfo>> getDeploymentTemplatesWithHttpInfo(String metadata, Boolean showInstanceConfigurations, String stackVersion, Boolean showHidden) throws ApiException {
        com.squareup.okhttp.Call call = getDeploymentTemplatesValidateBeforeCall(metadata, showInstanceConfigurations, stackVersion, showHidden, null, null);
        Type localVarReturnType = new TypeToken<List<DeploymentTemplateInfo>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get deployment templates (asynchronously)
     * Retrieves all deployment templates.
     * @param metadata An optional key/value pair in the form of (key:value) that will act as a filter and exclude any templates that do not have a matching metadata item associated. (optional)
     * @param showInstanceConfigurations If true, will return details for each instance configuration referenced by the template. (optional)
     * @param stackVersion If present, it will cause the returned deployment templates to be adapted to return only the elements allowed in that version. (optional)
     * @param showHidden If true, templates flagged as hidden will be returned. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDeploymentTemplatesAsync(String metadata, Boolean showInstanceConfigurations, String stackVersion, Boolean showHidden, final ApiCallback<List<DeploymentTemplateInfo>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDeploymentTemplatesValidateBeforeCall(metadata, showInstanceConfigurations, stackVersion, showHidden, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<DeploymentTemplateInfo>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for setDeploymentTemplate
     * @param body The deployment template definition. (required)
     * @param templateId The identifier for the deployment template. (required)
     * @param version If specified, checks for conflicts against the version of the template (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) (optional)
     * @param createOnly If true, will fail if the deployment template already exists at the given id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call setDeploymentTemplateCall(DeploymentTemplateInfo body, String templateId, Integer version, Boolean createOnly, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/platform/configuration/templates/deployments/{template_id}"
            .replaceAll("\\{" + "template_id" + "\\}", apiClient.escapeString(templateId.toString()));

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
    private com.squareup.okhttp.Call setDeploymentTemplateValidateBeforeCall(DeploymentTemplateInfo body, String templateId, Integer version, Boolean createOnly, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling setDeploymentTemplate(Async)");
        }
        // verify the required parameter 'templateId' is set
        if (templateId == null) {
            throw new ApiException("Missing the required parameter 'templateId' when calling setDeploymentTemplate(Async)");
        }
        
        com.squareup.okhttp.Call call = setDeploymentTemplateCall(body, templateId, version, createOnly, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Set deployment template
     * Creates or updates a deployment template.
     * @param body The deployment template definition. (required)
     * @param templateId The identifier for the deployment template. (required)
     * @param version If specified, checks for conflicts against the version of the template (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) (optional)
     * @param createOnly If true, will fail if the deployment template already exists at the given id (optional)
     * @return IdResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IdResponse setDeploymentTemplate(DeploymentTemplateInfo body, String templateId, Integer version, Boolean createOnly) throws ApiException {
        ApiResponse<IdResponse> resp = setDeploymentTemplateWithHttpInfo(body, templateId, version, createOnly);
        return resp.getData();
    }

    /**
     * Set deployment template
     * Creates or updates a deployment template.
     * @param body The deployment template definition. (required)
     * @param templateId The identifier for the deployment template. (required)
     * @param version If specified, checks for conflicts against the version of the template (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) (optional)
     * @param createOnly If true, will fail if the deployment template already exists at the given id (optional)
     * @return ApiResponse&lt;IdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<IdResponse> setDeploymentTemplateWithHttpInfo(DeploymentTemplateInfo body, String templateId, Integer version, Boolean createOnly) throws ApiException {
        com.squareup.okhttp.Call call = setDeploymentTemplateValidateBeforeCall(body, templateId, version, createOnly, null, null);
        Type localVarReturnType = new TypeToken<IdResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Set deployment template (asynchronously)
     * Creates or updates a deployment template.
     * @param body The deployment template definition. (required)
     * @param templateId The identifier for the deployment template. (required)
     * @param version If specified, checks for conflicts against the version of the template (returned in &#x27;x-cloud-resource-version&#x27; of the GET request) (optional)
     * @param createOnly If true, will fail if the deployment template already exists at the given id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call setDeploymentTemplateAsync(DeploymentTemplateInfo body, String templateId, Integer version, Boolean createOnly, final ApiCallback<IdResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = setDeploymentTemplateValidateBeforeCall(body, templateId, version, createOnly, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<IdResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
