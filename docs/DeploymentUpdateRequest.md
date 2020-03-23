# DeploymentUpdateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | A new name for the deployment, otherwise stays the same. |  [optional]
**pruneOrphans** | **Boolean** | Whether or not to prune orphan resources that are no longer mentioned in this request. Note that resourcesare tracked by ref_id, and if a resource&#x27;s ref_id is changed, any previous running resources created with that previousref_id are considered to be orphaned as well. | 
**resources** | [**DeploymentUpdateResources**](DeploymentUpdateResources.md) |  |  [optional]
**metadata** | [**DeploymentUpdateMetadata**](DeploymentUpdateMetadata.md) |  |  [optional]
