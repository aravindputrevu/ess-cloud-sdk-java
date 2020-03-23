# LdapGroupSearch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseDn** | **String** | Specifies a container DN to search for groups in which the user has membership |  [optional]
**scope** | [**ScopeEnum**](#ScopeEnum) | Specifies whether the group search should be sub_tree, one_level or base. one_level only searches objects directly contained within the base_dn. The default sub_tree searches all objects contained under base_dn. base specifies that the base_dn is a group object, and that it is the only group considered. |  [optional]
**filter** | **String** | Specifies a filter to search for a group. When unspecified, the security realm searches for group, groupOfNames, groupOfUniqueNames, or posixGroup with the attributes member, memberOf, or memberUid. Any instance of {0} in the filter is replaced by the user attribute defined in user_attribute. |  [optional]
**userAttribute** | **String** | Specifies the user attribute that is fetched and provided as a parameter to the filter. When unspecified, the user DN is passed to the filter. |  [optional]

<a name="ScopeEnum"></a>
## Enum: ScopeEnum
Name | Value
---- | -----
SUB_TREE | &quot;sub_tree&quot;
ONE_LEVEL | &quot;one_level&quot;
BASE | &quot;base&quot;
