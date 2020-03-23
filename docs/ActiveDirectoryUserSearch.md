# ActiveDirectoryUserSearch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseDn** | **String** | Specifies a container DN to search for users |  [optional]
**scope** | [**ScopeEnum**](#ScopeEnum) | The scope of the user search. Valid values are sub_tree, one_level, or base. one_level only searches objects directly contained in the base_dn. sub_tree searches all objects contained in base_dn. base specifies that the base_dn is the user object, and that it is the only user considered. Defaults to sub_tree. |  [optional]
**filter** | **String** | Specifies the filter to search the directory and match an entry with the username provided by the user. Defaults to (uid&#x3D;{0}). {0} is substituted with the username provided when searching. |  [optional]

<a name="ScopeEnum"></a>
## Enum: ScopeEnum
Name | Value
---- | -----
SUB_TREE | &quot;sub_tree&quot;
ONE_LEVEL | &quot;one_level&quot;
BASE | &quot;base&quot;
