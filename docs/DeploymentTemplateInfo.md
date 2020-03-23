# DeploymentTemplateInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique identifier for the template. |  [optional]
**name** | **String** | A human readable name for the template. | 
**description** | **String** | An optional description for the template. |  [optional]
**clusterTemplate** | [**DeploymentTemplateDefinitionRequest**](DeploymentTemplateDefinitionRequest.md) |  |  [optional]
**systemOwned** | **Boolean** | Whether or not if this is system owned template. |  [optional]
**source** | [**ChangeSourceInfo**](ChangeSourceInfo.md) |  |  [optional]
**metadata** | [**List&lt;MetadataItem&gt;**](MetadataItem.md) | Optional arbitrary metadata to associate with this template. |  [optional]
**instanceConfigurations** | [**List&lt;InstanceConfiguration&gt;**](InstanceConfiguration.md) | Optional list of instance configurations used in the cluster template. |  [optional]
**order** | **Integer** | Determines the order in which this template should be returned when listed. Templates are returned in ascending order. If not specified, then the template willbe appended to the end of the list. |  [optional]
**hidden** | **Boolean** | Whether or not the deployment template is hidden by default. |  [optional]
**minVersion** | **String** | Minimum stack version required by this template, if any. |  [optional]
