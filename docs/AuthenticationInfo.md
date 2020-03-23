# AuthenticationInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hasTotpDevice** | **Boolean** | True if the user has an available TOTP device | 
**totpDeviceSource** | [**TotpDeviceSourceEnum**](#TotpDeviceSourceEnum) | The TOTP device source | 
**hasElevatedPermissions** | **Boolean** | True if the user has elevated permissions | 
**elevatedPermissionsExpireAt** | [**OffsetDateTime**](OffsetDateTime.md) | The UTC time when elevated permissions will expire, if the user has elevated permissions |  [optional]

<a name="TotpDeviceSourceEnum"></a>
## Enum: TotpDeviceSourceEnum
Name | Value
---- | -----
NATIVE | &quot;native&quot;
OKTA | &quot;okta&quot;
