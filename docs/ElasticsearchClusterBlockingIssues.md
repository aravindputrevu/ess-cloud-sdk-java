# ElasticsearchClusterBlockingIssues

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**healthy** | **Boolean** | Whether the cluster has issues (false) or not (true) |  [optional]
**clusterLevel** | [**List&lt;ElasticsearchClusterBlockingIssueElement&gt;**](ElasticsearchClusterBlockingIssueElement.md) | A list of issues that affect availability of entire cluster |  [optional]
**indexLevel** | [**List&lt;ElasticsearchClusterBlockingIssueElement&gt;**](ElasticsearchClusterBlockingIssueElement.md) | A list of issues that affect availability of the cluster&#x27;s indices |  [optional]
