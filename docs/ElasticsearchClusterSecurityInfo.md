# ElasticsearchClusterSecurityInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | **Integer** | The resource version number of the security settings | 
**lastModified** | [**OffsetDateTime**](OffsetDateTime.md) | The most recent time the security settings were changed (ISO format in UTC) | 
**users** | [**List&lt;ElasticsearchClusterUser&gt;**](ElasticsearchClusterUser.md) |  | 
**roles** | **Object** | An arbitrarily nested JSON object mapping roles to sets of resources and permissions - see the Elasticsearch security documentation for more details on roles | 
**usersRoles** | [**List&lt;ElasticsearchClusterRole&gt;**](ElasticsearchClusterRole.md) |  | 
