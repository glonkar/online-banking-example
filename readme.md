# online banking example

My attempt to build a complete solution using

* SpringBoot microservices with reactive streams
* Kafka to implement CQRS
* OAuth2 security
* Angular 4 front end
* A backend for the front end using NodeJS
* All deployed in local kubernetes cluster (minikube)
* Instructions on how to deploy on AWS

To use local docker daemon within minikube, `eval $(minikube docker-env)`

To run kafka locally and test producer and consumer on console:

* Run `bin/zookeeper-server-start.sh config/zookeeper.properties`
      `bin/kafka-server-start.sh config/server.properties`
      `bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test --from-beginning`
      `bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic baeldung --from-beginning`


The application comprises of following microservices:


1. CardsService
2. CashService
3. MortgageService
4. CustomerService

# Cash Service

To build docker image of cashservice
`docker build -t achalise/cash-service:0.0.1 .`

Create a spring boot starter project with start.spring.io selecting reactive web and reactive MongoDB options.



Order to run:

1. zookeeper-services.yaml
2. zookeeper-cluster.yaml
3. kafka-service.yaml
4. kafka-cluster.yaml
5. mongo-cash.yaml
6. cash-service.yaml
7. gateway-service.yaml
