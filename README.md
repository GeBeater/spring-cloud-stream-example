# spring-cloud-stream-example

```bash
docker run -d -p 5672:5672 -p 15672:15672 rabbitmq:3.6.8-management-alpine
```


```bash
curl -v -X POST -H "Content-Type: application/json" -d '{"candidate":"anyCandidate"}' "http://localhost:8080/votes"
```


```bash
curl -v "http://localhost:8030/scores"
```