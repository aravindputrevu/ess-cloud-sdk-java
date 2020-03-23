# QueryStringQuery

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**query** | **String** | The actual query to be parsed. | 
**defaultField** | **String** | The default field for query terms if no prefix field is specified. |  [optional]
**analyzer** | **String** | The analyzer used to analyze each term of the query when creating composite queries. |  [optional]
**defaultOperator** | **String** | The default operator used if no explicit operator is specified. |  [optional]
**allowLeadingWildcard** | **Boolean** | When set, * or ? are allowed as the first character. Defaults to false. |  [optional]
