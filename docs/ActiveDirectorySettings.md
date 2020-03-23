# ActiveDirectorySettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier for the security realm | 
**name** | **String** | The friendly name of the security realm | 
**urls** | **List&lt;String&gt;** | The Active Directory URLs used to authenticate against, in the format ldap[s]://server:port. Note that ldap and ldaps protocols cannot be mixed together. | 
**domainName** | **String** | Specifies the domain name of the Active Directory (the forest root domain name). | 
**bindAnonymously** | **Boolean** | When true, bindDb credentials are ignored | 
**groupSearch** | [**ActiveDirectoryGroupSearch**](ActiveDirectoryGroupSearch.md) |  |  [optional]
**userSearch** | [**ActiveDirectoryUserSearch**](ActiveDirectoryUserSearch.md) |  |  [optional]
**bindDn** | **String** | The distinguished name of the user that is used to bind to the Active Directory and perform searches. |  [optional]
**bindPassword** | **String** | The user password that is used to bind to the Active Directory server. |  [optional]
**loadBalance** | [**ActiveDirectorySecurityRealmLoadBalance**](ActiveDirectorySecurityRealmLoadBalance.md) |  |  [optional]
**certificateUrl** | **String** | The SSL trusted CA certificate bundle URL. The bundle should be a zip file containing a single keystore file &#x27;keystore.ks&#x27; in the directory &#x27;/active_directory/:id/truststore&#x27;, where :id is the value of the [id] field. |  [optional]
**certificateUrlTruststorePassword** | **String** | The password to the certificate bundle URL truststore |  [optional]
**certificateUrlTruststoreType** | [**CertificateUrlTruststoreTypeEnum**](#CertificateUrlTruststoreTypeEnum) | The format of the keystore file. Should be jks to use the Java Keystore format or PKCS12 to use PKCS#12 files.  The default is jks. |  [optional]
**roleMappings** | [**ActiveDirectorySecurityRealmRoleMappingRules**](ActiveDirectorySecurityRealmRoleMappingRules.md) |  |  [optional]
**enabled** | **Boolean** | When true, enables the security realm |  [optional]
**order** | **Integer** | The order that the security realm is evaluated |  [optional]
**overrideYaml** | **String** | Advanced configuration options in YAML format. Any settings defined here will override any configuration set via the API. |  [optional]

<a name="CertificateUrlTruststoreTypeEnum"></a>
## Enum: CertificateUrlTruststoreTypeEnum
Name | Value
---- | -----
JKS | &quot;jks&quot;
PKCS12 | &quot;PKCS12&quot;
