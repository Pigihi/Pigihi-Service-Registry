# Service Registry for Microservices

### Registered Services
- Customer Service
- Order Service
- Payment Service
- Product Service
- Shop Service
- User Communication Service

## Configuration

Edit the properties of **application.yml** file

```yaml
# Eureka properties
eureka:
  client:
    fetch-registry: false
    register-with-eureka: false

# Server properties
server:
  port: port in which the service registry is to be run (Eg: 8761)
```

## Local Deployment

Service Registry should be started for successful execution of all queries.

### Using Docker

Create docker bridge network: `docker network create -d bridge pigihi-network`

docker-compose can be used to run the application

1. Go to project folder
2. Open terminal and run `docker-compose up`
3. The application can be accessed at localhost:8761 (port 8761 is set in docker-compose)

To run only the application

1.  Go to project folder
2.  Open terminal and run `docker build .`
3.  Run `docker run -p 8761:8761 docker_image_name`
4.  The application can be accessed at localhost:8761

### Using Gradle

1.  Go to project folder
2.  Open terminal and run `./gradlew build`
3.  Run `./gradlew bootRun`

* * *
