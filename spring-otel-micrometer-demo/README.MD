#Steps to Execute the project
Requirement
1. Docker Desktop
2. JDK 21

#Serevices
1. Otel Collector - To collect Observation and foward to backend systems (this could be replaced by Grafana agent)
2. Prometheus - To fetch metrics from Otel Collector
3. Grafana - To Visulize Open Telemetry data

Spring Boot 3.2

#Steps to start (here assumed that command is run from spring-otel-micrometer-demo directory)

1. First build the image (better way to include build with in docker compose)
cd spring_otel_mcrometer-demo and run below commands

docker build -t webservice1 -f DockerfileWebService1 .
docker run --rm -d -p 0.0.0.0:8080:8080 webservice1:latest

docker build -t webservice2 -f DockerfileWebService2 .
docker run --rm -d -p 0.0.0.0:8081:8081 webservice2:latest

2. cd <WORKSPACE_DIR>/spring_otel_mcrometer-demo/docker
docker compose -f docker-compose.yaml up -d