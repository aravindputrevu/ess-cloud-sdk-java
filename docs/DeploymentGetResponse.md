# DeploymentGetResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | A randomly-generated id of this Deployment | 
**name** | **String** | The name of this deployment | 
**healthy** | **Boolean** | Whether the deployment is overall healthy or not (one or more of the resource info subsections will have healthy: false) | 
**resources** | [**DeploymentResources**](DeploymentResources.md) |  | 
**settings** | [**DeploymentSettings**](DeploymentSettings.md) |  |  [optional]
**metadata** | [**DeploymentMetadata**](DeploymentMetadata.md) |  |  [optional]
