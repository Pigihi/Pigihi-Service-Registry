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
In Linux,

1. Open terminal and run `docker-compose up`
2. The application can be accessed at localhost:8761 (port 8761 is set in docker-compose)
