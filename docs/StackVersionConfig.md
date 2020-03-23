# StackVersionConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | **String** | Stack version |  [optional]
**template** | [**StackVersionTemplateInfo**](StackVersionTemplateInfo.md) |  | 
**elasticsearch** | [**StackVersionElasticsearchConfig**](StackVersionElasticsearchConfig.md) |  | 
**kibana** | [**StackVersionKibanaConfig**](StackVersionKibanaConfig.md) |  | 
**apm** | [**StackVersionApmConfig**](StackVersionApmConfig.md) |  |  [optional]
**appsearch** | [**StackVersionAppSearchConfig**](StackVersionAppSearchConfig.md) |  |  [optional]
**enterprisesearch** | [**StackVersionEnterpriseSearchConfig**](StackVersionEnterpriseSearchConfig.md) |  |  [optional]
**sitesearch** | [**StackVersionSiteSearchConfig**](StackVersionSiteSearchConfig.md) |  |  [optional]
**metadata** | [**StackVersionMetadata**](StackVersionMetadata.md) |  |  [optional]
**deleted** | **Boolean** | Identifies that the Elastic Stack version is marked for deletion |  [optional]
**upgradableTo** | **List&lt;String&gt;** | Stack Versions that this version can upgrade to | 
**minUpgradableFrom** | **String** | The minimum version recommended to upgrade this version. |  [optional]
**whitelisted** | **Boolean** | Whether or not this version is whitelisted. This is only relevant in EC (SaaS) and is not sent in ECE. |  [optional]
**accessible** | **Boolean** | Whether or not this version is accessible by the calling user. This is only relevant in EC (SaaS) and is not sent in ECE. |  [optional]
