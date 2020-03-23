# ActiveDirectoryGroupSearch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseDn** | **String** | Specifies a container DN to search for groups in which the user has membership |  [optional]
**scope** | [**ScopeEnum**](#ScopeEnum) | Specifies whether the group search should be sub_tree, one_level or base. one_level only searches objects directly contained within the base_dn. The default sub_tree searches all objects contained under base_dn. base specifies that the base_dn is a group object, and that it is the only group considered. |  [optional]

<a name="ScopeEnum"></a>
## Enum: ScopeEnum
Name | Value
---- | -----
SUB_TREE | &quot;sub_tree&quot;
ONE_LEVEL | &quot;one_level&quot;
BASE | &quot;base&quot;
