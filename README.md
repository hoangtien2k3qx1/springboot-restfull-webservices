# SpringBoot-RestFull-WebServices

## Tools and Technologies Used:
- Spring Boot 3.0
- Java 17
- Spring Data JPA
- Hibernate
- MySQL Database
- Maven
- Postman

## Spring Boot Project Architecture

![image](https://github.com/hoangtien2k3qx1/springboot-restfull-webservices/assets/122768076/e5ebeeba-bb94-40f9-bcac-268c7cbb9764)

## application.properties
```java
spring.datasource.url=jdbc:mysql://localhost:3306/user_management
spring.datasource.username=root    
spring.datasource.password=12042003

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update

management.endpoints.web.exposure.include=*
management.info.env.enable=true
management.endpoint.enable=true
management.endpoint.health.show-details=always
management.endpoint.shutdown.enabled=true

info.app.name=Spring Boot Restful Web Services
info.app.description=Spring Boot Restful Web Services Demo
info.app.version=1.0.0
```

## Using package project
- entity
- repository
- service
- controller
- mapper
- exception
- Application

## Tables database MySql
|Field|Type|Null|Key|Default|Extra|
|-----|----|----|---|-------|-----|
|id|bigint|NO|PRI|NULL||
|create_by|varchar(255)|YES||NULL||
|create_date|datetime(6)|YES||NULL||
|last_midified_date|datetime(6)|YES||NULL||
|last_modified_by|varchar(255)|YES||NULL||
|email_address|varchar(255)|NO||NULL||
|first_name|varchar(255)|NO||NULL||
|last_name|varchar(255)|NO||NULL||


## POST User: http://localhost:8080/api/users

![POST User](https://github.com/hoangtien2k3qx1/springboot-restfull-webservices/assets/122768076/c1091a07-78e3-4851-8320-546ef7667418)

## GET One User: http://localhost:8080/api/users/1

![Get User](https://github.com/hoangtien2k3qx1/springboot-restfull-webservices/assets/122768076/0153b42f-3bb3-4a73-8286-d437e28957a0)

## GET All Users: http://localhost:8080/api/users

![Get All Users](https://github.com/hoangtien2k3qx1/springboot-restfull-webservices/assets/122768076/8011f339-ba26-4142-b1a9-7d7087035dae)

## PUT User: http://localhost:8080/api/users/1

![PUT User](https://github.com/hoangtien2k3qx1/springboot-restfull-webservices/assets/122768076/af88175c-18c4-4439-97bd-fb382affabf8)

## DELETE User By Id: http://localhost:8080/api/users/1

![DELETE User](https://github.com/hoangtien2k3qx1/springboot-restfull-webservices/assets/122768076/711fb4b2-43bd-4c25-b156-b9ebd946fd88)




