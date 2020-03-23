# SamlSecurityRealmRoleMappingRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The type of role mapping rule | 
**roles** | **List&lt;String&gt;** | The roles that are applied when the mapping rule is successfully evaluated | 
**value** | **String** | The value to match when evaluating this rule | 

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
USERNAME | &quot;username&quot;
GROUPS | &quot;groups&quot;
DN | &quot;dn&quot;
