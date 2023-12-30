# Billet Payment with Quarkus 

An API that gets any bill information and pay that, with celcoin API

### Used Technologies

* [Java](https://www.java.com/en/)
* [Docker](https://www.docker.com/)
* [Quarkus](https://pt.quarkus.io/)

## Dependencies and required versions

* Java - Version: 17
* Maven - Version: 3.8.2
* Quarkus - Version: 3.6.4
* Docker - Version: 24.0.7

### Getting started

* on Dev mode

```shell script
./mvnw compile quarkus:dev
```

or

```shell script
mvn compile quarkus:dev
```

* on Native mode

```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

and then

```shell
./target/pix-mercado-pago-api-1.0-SNAPSHOT-runner
```

## How to run tests

```shell
./mvnw verify
```

or 

```shell
mvn verify
```

## Routes

```http request
GET /api/v1/token
```

return:

```json
{
  "access_token": "eyJhbGciOi",
  "expires_in": 2400,
  "token_type": "bearer"
}
```

```http request
POST /api/v1/consult
```

body:

```json
{
  "barCode": {
    "type": 0,
    "digitable": "code_bar_of_your_bill"
  }
}
```

```http request
POST /api/v1/payment
```

body:

```json
{
  "cpfCnpj": "payer_cnpj",
  "billData": {
    "value": 1500.0,
    "originalValue": 1500.0,
    "valueWithDiscount": 0,
    "valueWithAdditional": 0
  },
  "barCode": {
    "type": 2,
    "digitable": "code_bar_of_your_bill"
  },
  "dueDate": "2023-12-31T00:00:00Z",
  "transactionIdAuthorize": 821559050
}
```
