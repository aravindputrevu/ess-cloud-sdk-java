# ElasticsearchScriptTypeSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **Boolean** | If enabled (default: true) then scripts are enabled, either for sandboxing languages (by default), or for all installed languages if &#x27;sandbox_mode&#x27; is disabled (or for 6.x). NOTES: (Corresponds to the parameter &#x27;script.file|stored/indexed|inline&#x27;) |  [optional]
**sandboxMode** | **Boolean** | If enabled (default: true) and this script type is enabled, then only the sandbox languages are allowed. By default the sandbox languages are painless, expressions and mustache, but this can be restricted via the &#x27;painless_enabled&#x27;, &#x27;mustache_enabled&#x27; &#x27;expression_enabled&#x27; settings.NOTES: Not supported in 6.x. (Corresponds to the parameters &#x27;script.engine.[painless|mustache|expressions].[file|stored|inline]&#x27;) |  [optional]
