# SecurityRealmInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier for the security realm | 
**name** | **String** | The friendly name of the security realm | 
**type** | [**TypeEnum**](#TypeEnum) | The type of the security realm | 
**enabled** | **Boolean** | True if the security realm is enabled |  [optional]
**order** | **Integer** | The order the security realm should be evaluated |  [optional]
**urls** | **List&lt;String&gt;** | The URLs associated with the security realm | 

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
NATIVE | &quot;native&quot;
LDAP | &quot;ldap&quot;
SAML | &quot;saml&quot;
ACTIVE_DIRECTORY | &quot;active_directory&quot;
