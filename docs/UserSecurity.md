# UserSecurity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**roles** | **List&lt;String&gt;** | The set of roles assigned to a user |  [optional]
**permissions** | **List&lt;String&gt;** | The distinct set of permissions allowed by the user&#x27;s roles. These correspond to operationId values in the OpenAPI definition. |  [optional]
**elevatedPermissions** | [**ElevatedPermissions**](ElevatedPermissions.md) |  |  [optional]
**password** | **String** | The user&#x27;s password. Only used when modifying a user. |  [optional]
**enabled** | **Boolean** | True if the user is enabled |  [optional]
**securityRealm** | [**UserSecurityRealm**](UserSecurityRealm.md) |  |  [optional]
