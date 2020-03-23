# LdapSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier for the security realm | 
**name** | **String** | The friendly name of the security realm | 
**urls** | **List&lt;String&gt;** | The LDAP URLs used to authenticate against, in the format ldap[s]://server:port. Note that ldap and ldaps protocols cannot be mixed together. | 
**bindAnonymously** | **Boolean** | When true, bindDb credentials are ignored | 
**bindType** | [**BindTypeEnum**](#BindTypeEnum) | The type of user binding to apply | 
**groupSearch** | [**LdapGroupSearch**](LdapGroupSearch.md) |  |  [optional]
**userSearch** | [**LdapUserSearch**](LdapUserSearch.md) |  |  [optional]
**userDnTemplates** | **List&lt;String&gt;** | The distinguished name template that replaces the user name with the string {0}. Only used when bind_type is set to &#x27;user_templates&#x27;. |  [optional]
**bindDn** | **String** | The distinguished name of the user that is used to bind to the LDAP and perform searches. Only used when bind_type is set to &#x27;user_search&#x27;. |  [optional]
**bindPassword** | **String** | The user password that is used to bind to the LDAP server. Only used when bind_type is set to &#x27;user_search&#x27;. |  [optional]
**userGroupAttribute** | **String** | Specifies the attribute to examine on the user for group membership. If any &#x27;group_search&#x27; settings are specified, this setting is ignored. Defaults to &#x27;memberOf&#x27;. |  [optional]
**loadBalance** | [**LdapSecurityRealmLoadBalance**](LdapSecurityRealmLoadBalance.md) |  |  [optional]
**certificateUrl** | **String** | The SSL trusted CA certificate bundle URL. The bundle should be a zip file containing a single keystore file &#x27;keystore.ks&#x27; in the directory &#x27;/ldap/:id/truststore&#x27;, where :id is the value of the [id] field. |  [optional]
**certificateUrlTruststorePassword** | **String** | The password to the certificate bundle URL truststore |  [optional]
**certificateUrlTruststoreType** | [**CertificateUrlTruststoreTypeEnum**](#CertificateUrlTruststoreTypeEnum) | The format of the keystore file. Should be jks to use the Java Keystore format or PKCS12 to use PKCS#12 files.  The default is jks. |  [optional]
**roleMappings** | [**LdapSecurityRealmRoleMappingRules**](LdapSecurityRealmRoleMappingRules.md) |  |  [optional]
**enabled** | **Boolean** | When true, enables the security realm |  [optional]
**order** | **Integer** | The order that the security realm is evaluated |  [optional]
**overrideYaml** | **String** | Advanced configuration options in YAML format. Any settings defined here will override any configuration set via the API. |  [optional]

<a name="BindTypeEnum"></a>
## Enum: BindTypeEnum
Name | Value
---- | -----
SEARCH | &quot;user_search&quot;
TEMPLATES | &quot;user_templates&quot;

<a name="CertificateUrlTruststoreTypeEnum"></a>
## Enum: CertificateUrlTruststoreTypeEnum
Name | Value
---- | -----
JKS | &quot;jks&quot;
PKCS12 | &quot;PKCS12&quot;
