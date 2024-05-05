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
cd ./docker
docker compose -f docker-compose.yaml up -d