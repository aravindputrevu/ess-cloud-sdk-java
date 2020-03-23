# RestoreSnapshotApiConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**indices** | **List&lt;String&gt;** | The list of indices to restore (supports +ve and -ve selection and wildcarding - see the default Elasticsearch index format documentation) |  [optional]
**rawSettings** | **Object** | This JSON object (merged with the &#x27;indices&#x27; field (if present) is passed untouched into the restore command - see the Elasticsearch &#x27;_snapshot&#x27; documentation for more details on supported formats |  [optional]
