#### Retention rules

Note that all _interval_ URL parameters are ISO 8601 strings delimited by a `_` instead of a `/` as in `2016-06-27_2016-06-28`.

`GET /druid/coordinator/v1/rules`

Returns all rules as JSON objects for all datasources in the cluster including the default datasource.

`GET /druid/coordinator/v1/rules/{dataSourceName}`

Returns all rules for a specified datasource.

`GET /druid/coordinator/v1/rules/{dataSourceName}?full`

Returns all rules for a specified datasource and includes default datasource.

`GET /druid/coordinator/v1/rules/history?interval=<interval>`

Returns audit history of rules for all datasources. Default value of interval can be specified by setting `druid.audit.manager.auditHistoryMillis` (1 week if not configured) in Coordinator `runtime.properties`.

`GET /druid/coordinator/v1/rules/history?count=<n>`

Returns last `n` entries of audit history of rules for all datasources.

`GET /druid/coordinator/v1/rules/{dataSourceName}/history?interval=<interval>`

Returns audit history of rules for a specified datasource. Default value of interval can be specified by setting `druid.audit.manager.auditHistoryMillis` (1 week if not configured) in Coordinator `runtime.properties`.

`GET /druid/coordinator/v1/rules/{dataSourceName}/history?count=<n>`

Returns last `n` entries of audit history of rules for a specified datasource.

`POST /druid/coordinator/v1/rules/{dataSourceName}`

POST with a list of rules in JSON form to update rules.

Optional Header Parameters for auditing the config change can also be specified.

|Header Param Name| Description | Default |
|----------|-------------|---------|
|`X-Druid-Author`| Author making the config change|`""`|
|`X-Druid-Comment`| Comment describing the change being done|`""`|

#### Intervals

Note that all _interval_ URL parameters are ISO 8601 strings delimited by a `_` instead of a `/` as in `2016-06-27_2016-06-28`.

`GET /druid/coordinator/v1/intervals`

Returns all intervals for all datasources with total size and count.

`GET /druid/coordinator/v1/intervals/{interval}`

Returns aggregated total size and count for all intervals that intersect given ISO interval.

`GET /druid/coordinator/v1/intervals/{interval}?simple`

Returns total size and count for each interval within given ISO interval.

`GET /druid/coordinator/v1/intervals/{interval}?full`

Returns total size and count for each datasource for each interval within given ISO interval.

