# ElasticsearchNodeType

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**master** | **Boolean** | Defines whether this node can be elected master (default: true) |  [optional]
**data** | **Boolean** | Defines whether this node can hold data (default: true) |  [optional]
**ingest** | **Boolean** | Defines whether this node can run an ingest pipeline (default: true) |  [optional]
**ml** | **Boolean** | Defines whether this node can run ml jobs, valid only for versions 5.4.0 or greater (default: false) |  [optional]
