# SamlSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier for the security realm | 
**name** | **String** | The friendly name of the security realm | 
**idp** | [**SamlIdpSettings**](SamlIdpSettings.md) |  | 
**sp** | [**SamlSpSettings**](SamlSpSettings.md) |  | 
**attributes** | [**SamlAttributeSettings**](SamlAttributeSettings.md) |  | 
**roleMappings** | [**SamlSecurityRealmRoleMappingRules**](SamlSecurityRealmRoleMappingRules.md) |  |  [optional]
**enabled** | **Boolean** | When true, enables the security realm |  [optional]
**order** | **Integer** | The order that the security realm is evaluated |  [optional]
**forceAuthn** | **Boolean** | Specifies whether to set the ForceAuthn attribute when requesting that the IdP authenticate the current user. If set to true, the IdP is required to verify the user&#x27;s identity, irrespective of any existing sessions they might have. |  [optional]
**signingCertificateUrl** | **String** | The SAML signing certificate bundle URL. The bundle should be a zip file containing &#x27;signing.key&#x27; and &#x27;signing.pem&#x27; files in the directory &#x27;/saml/:id&#x27;, where :id is the value of the [id] field. |  [optional]
**signingCertificateUrlPassword** | **String** | The password to the signing certificate bundle |  [optional]
**signingSamlMessages** | **List&lt;String&gt;** | A list of SAML message types that should be signed. Each element in the list should be the local name of a SAML XML Element. Supported element types are AuthnRequest, LogoutRequest and LogoutResponse. Only valid if a signing certificate is also specified. |  [optional]
**encryptionCertificateUrl** | **String** | The SAML encryption certificate bundle URL. The bundle should be a zip file containing &#x27;encryption.key&#x27; and &#x27;encryption.pem&#x27; files in the directory &#x27;/saml/:id&#x27;, where :id is the value of the [id] field. |  [optional]
**encryptionCertificateUrlPassword** | **String** | The password to the encryption certificate bundle |  [optional]
**sslCertificateUrl** | **String** | The SSL trusted CA certificate bundle URL. The bundle should be a zip file containing a single keystore file &#x27;keystore.ks&#x27; in the directory &#x27;/saml/:id/truststore&#x27;, where :id is the value of the [id] field. |  [optional]
**sslCertificateUrlTruststorePassword** | **String** | The password to the SSL certificate bundle URL truststore |  [optional]
**sslCertificateUrlTruststoreType** | [**SslCertificateUrlTruststoreTypeEnum**](#SslCertificateUrlTruststoreTypeEnum) | The format of the keystore file. Should be jks to use the Java Keystore format or PKCS12 to use PKCS#12 files. The default is jks. |  [optional]
**overrideYaml** | **String** | Advanced configuration options in YAML format. Any settings defined here will override any configuration set via the API. |  [optional]

<a name="SslCertificateUrlTruststoreTypeEnum"></a>
## Enum: SslCertificateUrlTruststoreTypeEnum
Name | Value
---- | -----
JKS | &quot;jks&quot;
PKCS12 | &quot;PKCS12&quot;
