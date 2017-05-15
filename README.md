# spring-cloud-stream-example

## Service ports

* port 8080 voting-box-service
* port 8030 voting-score-service
* port 5672 rabbitmq
* port 15672 rabbitmq admin interface (login with guest:guest)


```bash
docker run -d -p 5672:5672 -p 15672:15672 rabbitmq:3.6.8-management-alpine
```


```bash
curl -v -X POST -H "Content-Type: application/json" -d '{"candidate":"anyCandidate"}' "http://localhost:8080/votes"
```


```bash
curl -v "http://localhost:8030/scores"
```