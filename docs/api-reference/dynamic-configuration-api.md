## Coordinator dynamic configuration

See [Coordinator Dynamic Configuration](../configuration/index.md#dynamic-configuration) for details.

Note that all _interval_ URL parameters are ISO 8601 strings delimited by a `_` instead of a `/`
as in `2016-06-27_2016-06-28`.

`GET /druid/coordinator/v1/config`

Retrieves current coordinator dynamic configuration.

`GET /druid/coordinator/v1/config/history?interval={interval}&count={count}`

Retrieves history of changes to overlord dynamic configuration. Accepts `interval` and  `count` query string parameters
to filter by interval and limit the number of results respectively.

`POST /druid/coordinator/v1/config`

Update overlord dynamic worker configuration.


## Overlord dynamic configuration

See [Overlord Dynamic Configuration](../configuration/index.md#overlord-dynamic-configuration) for details.

Note that all _interval_ URL parameters are ISO 8601 strings delimited by a `_` instead of a `/`
as in `2016-06-27_2016-06-28`.

`GET /druid/indexer/v1/worker`

Retrieves current overlord dynamic configuration.

`GET /druid/indexer/v1/worker/history?interval={interval}&count={count}`

Retrieves history of changes to overlord dynamic configuration. Accepts `interval` and  `count` query string parameters
to filter by interval and limit the number of results respectively.

`GET /druid/indexer/v1/workers`

Retrieves a list of all the worker nodes in the cluster along with its metadata.

`GET /druid/indexer/v1/scaling`

Retrieves overlord scaling events if auto-scaling runners are in use.

`POST /druid/indexer/v1/worker`

Update overlord dynamic worker configuration.
