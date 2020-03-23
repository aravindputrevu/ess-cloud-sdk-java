# ClusterMetadataInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | **Integer** | The resource version number of the cluster metadata | 
**lastModified** | [**OffsetDateTime**](OffsetDateTime.md) | The most recent time the cluster metadata was changed (ISO format in UTC) | 
**endpoint** | **String** | The DNS name of the cluster endpoint, if available |  [optional]
**cloudId** | **String** | The cloud ID, an encoded string that provides other Elastic services with the necessary information to connect to this Elasticsearch and Kibana (only present if both exist) |  [optional]
**raw** | **Object** | An unstructured JSON representation of the public and internal state (can be filtered out via URL parameter). The contents and structure of the &#x60;raw&#x60; field can change at any time.  |  [optional]
**ports** | [**ClusterMetadataPortInfo**](ClusterMetadataPortInfo.md) |  |  [optional]
