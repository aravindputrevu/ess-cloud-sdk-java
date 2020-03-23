# LdapSecurityRealmRoleMappingRule

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
USER_DN | &quot;user_dn&quot;
GROUP_DN | &quot;group_dn&quot;
