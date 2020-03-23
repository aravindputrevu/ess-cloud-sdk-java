# LdapSecurityRealmLoadBalance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The behavior to use when there are multiple LDAP URLs defined | 
**cacheTtl** | **String** | When using dns_failover or dns_round_robin as the load balancing type, this setting controls the amount of time to cache DNS lookups. Defaults to 1h. |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
FAILOVER | &quot;failover&quot;
DNS_FAILOVER | &quot;dns_failover&quot;
ROUND_ROBIN | &quot;round_robin&quot;
DNS_ROUND_ROBIN | &quot;dns_round_robin&quot;
