# LicenseInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | **Integer** | Version of the license |  [optional]
**uid** | **String** | Unique identifier of the license | 
**issuer** | **String** | Issuer of the license | 
**issuedTo** | **String** | Entity the license was issued to | 
**issueDateInMillis** | **Long** | When the license was issued, in milliseconds since the Unix epoch | 
**type** | **String** | Type of the license | 
**subscriptionType** | **String** | Type of the license subscription |  [optional]
**signature** | **String** | Digital signature | 
**startDateInMillis** | **Long** | Initial validity of the license, in milliseconds since the Unix epoch | 
**expiryDateInMillis** | **Long** | When the license expires, in milliseconds since the Unix epoch | 
**maxAllocators** | **Integer** | Maximum number of allocators. Empty for version &gt;&#x3D; 3 |  [optional]
**maxRamPerAllocatorMb** | **Integer** | Maximum RAM per allocator in MB. Empty for version &gt;&#x3D; 3 |  [optional]
**maxInstances** | **Integer** | Maximum number of instances. Only present for version 3 |  [optional]
**operationMode** | **String** | Operation mode |  [optional]
**clusterLicenses** | [**List&lt;ClusterLicenseInfo&gt;**](ClusterLicenseInfo.md) | List of cluster licenses |  [optional]
