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
