# KeystoreSecret

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **Object** | Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore. NOTE: When the keystore secret is unspecified, it is removed. |  [optional]
**asFile** | **Boolean** | Stores the keystore secret as a file. The default is false, which stores the keystore secret as string when value is a plain string, or true when value is an object. |  [optional]
