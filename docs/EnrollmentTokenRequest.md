# EnrollmentTokenRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**roles** | **List&lt;String&gt;** | The additional services for which this enrollment token applies (empty if not specified, ie system services only) |  [optional]
**persistent** | **Boolean** | Whether this token can subsequently to its grant be revoked from the UI | 
**validityInSeconds** | **Integer** | The time in seconds for which this token is valid (defaults to 1 hour). Currently this can only be set for ephemeral (persistent: false) tokens. |  [optional]
