# adrixus-microservice-eureka
Microservices that can communicate with each other using eureka

## There are 3 microserivces
- adrixus-customer-service
- adrixus-card-service
- adrixus-account-service

### Database used : PostgreSQL

## Below APIs are created in this microservices

### adrixus-customer-service

`http://localhost:9090/customer/createCustomer - POST`

`http://localhost:9090/getCustomer/{customerId} - GET`

`http://localhost:9090/getCard - GET` (This will be dummy API which will communicate with `adrixus-card-service` microserivce and return dummy Card object.)


### adrixus-account-service

`http://localhost:9092/account/createAccount - POST`

`http://localhost:9092/account/getAccount/{accountId} - GET`

### adrixus-card-service

`http://localhost:9091/card/createCard - POST`

`http://localhost:9091/card/getDummyCard - GET` (It's an dummy API which will be used when customer-service will try to communicate with this microservice)

