# ApmSystemSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**elasticsearchUrl** | **String** | Optionally override the URL to which to send data (for advanced users only, if unspecified the system selects an internal URL) |  [optional]
**kibanaUrl** | **String** | Optionally override the URL to which to send data (for advanced users only, if unspecified the system selects an internal URL) |  [optional]
**elasticsearchUsername** | **String** | Optionally override the account within APM - defaults to a system account that always exists (if specified, the password must also be specified) |  [optional]
**elasticsearchPassword** | **String** | Optionally override the account within APM - defaults to a system account that always exists (if specified, the username must also be specified) |  [optional]
**secretToken** | **String** | Optionally override the secret token within APM - defaults to the previously existing secretToken |  [optional]
**debugEnabled** | **Boolean** | Optionally enable debug mode for APM servers - defaults false |  [optional]
