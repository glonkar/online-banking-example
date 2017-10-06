* run minkube
  `minikube start` 
  And `eval $(minikube docker-env)` to work with the local docker daemon 
* `kubectl create -f namespace-kafka.yaml` 
   The new namespace should show in the list when issuing `kubectl get namespace`
   `kubectl config set-context kafka --namespace=kafka-cluster --user=cluster-admin`
   `kubectl config use-context kafka`
* Run zookeeper service
* Run zookeeper cluster
kubectl create -f mongo-cash.yaml 
kubectl create -f cash-service.yaml 



Ref: https://github.com/ramhiser/kafka-kubernetes

