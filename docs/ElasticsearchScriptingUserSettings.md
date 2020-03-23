# ElasticsearchScriptingUserSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**painlessEnabled** | **Boolean** | (5.x+ only) If enabled (the default) then the painless scripting engine is allowed as a sandboxed language. Sandboxed languages are the only ones allowed if &#x27;sandbox_mode&#x27; is set to true. NOTES: (Corresponds to the parameters &#x27;script.engine.painless.[file|stored|inline]&#x27;) |  [optional]
**mustacheEnabled** | **Boolean** | (5.x+ only) If enabled (the default) then the mustache scripting engine is allowed as a sandboxed language. Sandboxed languages are the only ones allowed if &#x27;sandbox_mode&#x27; is set to true. NOTES: (Corresponds to the parameters &#x27;script.engine.mustache.[file|stored|inline]&#x27;) |  [optional]
**expressionsEnabled** | **Boolean** | (5.x+ only) If enabled (the default) then the expressions scripting engine is allowed as a sandboxed language. Sandboxed languages are the only ones allowed if &#x27;sandbox_mode&#x27; is set to true. NOTES: (Corresponds to the parameters &#x27;script.engine.expression.[file|stored|inline]&#x27;) |  [optional]
**stored** | [**ElasticsearchScriptTypeSettings**](ElasticsearchScriptTypeSettings.md) |  |  [optional]
**file** | [**ElasticsearchScriptTypeSettings**](ElasticsearchScriptTypeSettings.md) |  |  [optional]
**inline** | [**ElasticsearchScriptTypeSettings**](ElasticsearchScriptTypeSettings.md) |  |  [optional]
