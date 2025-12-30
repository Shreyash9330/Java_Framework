<p align="center">
  <img src="https://spring.io/images/spring-logo-2022-93b8cdd26b48d2bb7e5b5a8f7a1b4fae.svg" width="120"/>
</p>

<h1 align="center">🌈 Spring Boot Complete Learning Repository</h1>
<p align="center"><b>Build • Learn • Deploy • Repeat</b></p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-orange"/>
  <img src="https://img.shields.io/badge/SpringBoot-3.x-brightgreen"/>
  <img src="https://img.shields.io/badge/Maven-Build-blue"/>
  <img src="https://img.shields.io/badge/REST-API-yellow"/>
  <img src="https://img.shields.io/badge/JPA-Hibernate-purple"/>
  <img src="https://img.shields.io/badge/MySQL-Database-blue"/>
  <img src="https://img.shields.io/badge/Validation-Bean--Validation-red"/>
</p>

This repository captures my complete Spring Boot journey – starting from project setup, auto-configuration and starters to building real-world REST APIs with controller-service-repository architecture, dependency injection using @Autowired, custom configuration with application.properties, request validation using @NotNull, @Size and @Email, centralized exception handling with @ControllerAdvice and @ExceptionHandler, Spring Data JPA repository layer, Hibernate ORM mapping, MySQL database integration, unit testing with @SpringBootTest, Maven build lifecycle, jar packaging, and running applications from the command line.

Main project structure followed in this repository:

springboot-project/src/main/java/com/shreyash/app → controller → service → repository → model → dto → exception → SpringBootApplication.java

Important configuration used in application.properties:

server.port=8080  
spring.datasource.url=jdbc:mysql://localhost:3306/springbootdb  
spring.datasource.username=root  
spring.datasource.password=1234  
spring.jpa.hibernate.ddl-auto=update  
spring.jpa.show-sql=true  
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect  

How to run this project:  
Run inside IDE → Run As → Spring Boot App  
Run using command line → mvn spring-boot:run  
Build jar → mvn clean install  
Run jar → java -jar target/springboot-project.jar  

Sample REST endpoints implemented:

GET /api/students → fetch all students  
GET /api/students/{id} → fetch student by id  
POST /api/students → add new student  
PUT /api/students/{id} → update student  
DELETE /api/students/{id} → delete student  

Extra features added: pagination & sorting using Pageable, request DTO mapping, custom exception classes, global error response format, API validation messages, logging using SLF4J, and environment-based configuration using Spring Profiles.

This repository is created to strengthen my backend fundamentals and prepare myself for Java Full Stack / Web Engineer roles by building production-ready Spring Boot applications.

Author – **Shreyash Patil Gawande**  
Frontend Developer | Java & Spring Boot Learner | Amravati, Maharashtra

