# ElasticsearchConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | **String** | The version of the Elasticsearch cluster (must be one of the ECE supported versions). Currently cannot be different across the topology (and is generally specified in the globals) |  [optional]
**dockerImage** | **String** | A docker URI that allows overriding of the default docker image specified for this version |  [optional]
**systemSettings** | [**ElasticsearchSystemSettings**](ElasticsearchSystemSettings.md) |  |  [optional]
**userSettingsJson** | **Object** | An arbitrary JSON object allowing cluster owners to set their parameters (only one of this and &#x27;user_settings_yaml&#x27; is allowed), provided they are on the whitelist (&#x27;user_settings_whitelist&#x27;) and not on the blacklist (&#x27;user_settings_blacklist&#x27;). NOTES: (This field together with &#x27;user_settings_override*&#x27; and &#x27;system_settings&#x27; defines the total set of Elasticsearch settings) |  [optional]
**userSettingsYaml** | **String** | An arbitrary YAML object allowing cluster owners to set their parameters (only one of this and &#x27;user_settings_json&#x27; is allowed), provided they are on the whitelist (&#x27;user_settings_whitelist&#x27;) and not on the blacklist (&#x27;user_settings_blacklist&#x27;). NOTES: (This field together with &#x27;user_settings_override*&#x27; and &#x27;system_settings&#x27; defines the total set of Elasticsearch settings) |  [optional]
**userSettingsOverrideJson** | **Object** | An arbitrary JSON object allowing ECE admins owners to set clusters&#x27; parameters (only one of this and &#x27;user_settings_override_yaml&#x27; is allowed), ie in addition to the documented &#x27;system_settings&#x27;. NOTES: (This field together with &#x27;system_settings&#x27; and &#x27;user_settings*&#x27; defines the total set of Elasticsearch settings) |  [optional]
**userSettingsOverrideYaml** | **String** | An arbitrary YAML object allowing ECE admins owners to set clusters&#x27; parameters (only one of this and &#x27;user_settings_override_json&#x27; is allowed), ie in addition to the documented &#x27;system_settings&#x27;. NOTES: (This field together with &#x27;system_settings&#x27; and &#x27;user_settings*&#x27; defines the total set of Elasticsearch settings) |  [optional]
**enabledBuiltInPlugins** | **List&lt;String&gt;** | A list of plugin names from the Elastic-supported subset that are bundled with the version images. NOTES: (Users should consult the Elastic stack objects to see what plugins are available, this is currently only available from the UI) |  [optional]
**userPlugins** | [**List&lt;ElasticsearchUserPlugin&gt;**](ElasticsearchUserPlugin.md) | A list of admin-uploaded plugin objects that are available for this user. |  [optional]
**userBundles** | [**List&lt;ElasticsearchUserBundle&gt;**](ElasticsearchUserBundle.md) | A list of admin-uploaded bundle objects (eg scripts, synonym files) that are available for this user. |  [optional]
**curation** | [**ElasticsearchCuration**](ElasticsearchCuration.md) |  |  [optional]
**nodeAttributes** | **Map&lt;String, String&gt;** | Defines the Elasticsearch node attributes for the instances in the topology |  [optional]
