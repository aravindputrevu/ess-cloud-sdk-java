# AppSearchConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | **String** | The version of the AppSearch cluster (must be one of the ECE supported versions, and won&#x27;t work unless it matches the Elasticsearch version. Leave blank to auto-detect version.) |  [optional]
**dockerImage** | **String** | A docker URI that allows overriding of the default docker image specified for this version |  [optional]
**systemSettings** | [**AppSearchSystemSettings**](AppSearchSystemSettings.md) |  |  [optional]
**userSettingsJson** | **Object** | An arbitrary JSON object allowing (non-admin) cluster owners to set their parameters (only one of this and &#x27;user_settings_yaml&#x27; is allowed), provided they are on the whitelist (&#x27;user_settings_whitelist&#x27;) and not on the blacklist (&#x27;user_settings_blacklist&#x27;). (This field together with &#x27;user_settings_override*&#x27; and &#x27;system_settings&#x27; defines the total set of AppSearch settings) |  [optional]
**userSettingsYaml** | **String** | An arbitrary YAML object allowing (non-admin) cluster owners to set their parameters (only one of this and &#x27;user_settings_json&#x27; is allowed), provided they are on the whitelist (&#x27;user_settings_whitelist&#x27;) and not on the blacklist (&#x27;user_settings_blacklist&#x27;). (These field together with &#x27;user_settings_override*&#x27; and &#x27;system_settings&#x27; defines the total set of AppSearch settings) |  [optional]
**userSettingsOverrideJson** | **Object** | An arbitrary JSON object allowing ECE admins owners to set clusters&#x27; parameters (only one of this and &#x27;user_settings_override_yaml&#x27; is allowed), ie in addition to the documented &#x27;system_settings&#x27;. (This field together with &#x27;system_settings&#x27; and &#x27;user_settings*&#x27; defines the total set of AppSearch settings) |  [optional]
**userSettingsOverrideYaml** | **String** | An arbitrary YAML object allowing ECE admins owners to set clusters&#x27; parameters (only one of this and &#x27;user_settings_override_json&#x27; is allowed), ie in addition to the documented &#x27;system_settings&#x27;. (This field together with &#x27;system_settings&#x27; and &#x27;user_settings*&#x27; defines the total set of AppSearch settings) |  [optional]
