<p align="center">
 <img src="./springboot-logo.png" width="140">
</p>

<h1 align="center">Spring Boot Playground 🌿</h1>
<p align="center">my daily dose of java backend magic</p>

<p align="center">
  <img src="https://img.shields.io/badge/java-17-orange">
  <img src="https://img.shields.io/badge/springboot-3.x-brightgreen">
  <img src="https://img.shields.io/badge/rest-api-yellow">
  <img src="https://img.shields.io/badge/jpa-hibernate-blueviolet">
  <img src="https://img.shields.io/badge/mysql-db-blue">
  <img src="https://img.shields.io/badge/maven-build-blue">
</p>

Welcome to my Spring Boot playground — a place where I experiment, break things, fix them again and finally build clean backend services using Java and Spring Boot. This repository grows every time I learn something new: auto-configuration, starters, layered architecture, dependency injection, REST APIs, database integration, validation, exception handling and real deployment.

I follow a clean structure while building projects:

springboot-project/src/main/java/com/shreyash/app  
controller → handles requests  
service → business logic  
repository → database operations  
model & dto → entities and data transfer  
exception → custom errors  
SpringBootApplication.java → application entry point

The heart of the project lives inside application.properties:

server.port=8080  
spring.datasource.url=jdbc:mysql://localhost:3306/springbootdb  
spring.datasource.username=root  
spring.datasource.password=1234  
spring.jpa.hibernate.ddl-auto=update  
spring.jpa.show-sql=true  

Running the project is easy. Inside IDE just run as Spring Boot App.  
From terminal:  
mvn spring-boot:run  
Build jar: mvn clean install  
Run jar: java -jar target/springboot-project.jar  

APIs I practice daily:

GET /api/students → list of students  
GET /api/students/{id} → single student  
POST /api/students → add student  
PUT /api/students/{id} → update student  
DELETE /api/students/{id} → delete student  

Along with CRUD, this repo also contains pagination & sorting, request validation using Bean Validation, centralized exception handling with ControllerAdvice, DTO mapping, logging using SLF4J, and profile based environment configuration.

The goal of this repo is simple — become a solid Java Full Stack Developer by building real production-ready backend systems instead of just writing theory.

crafted with ☕ and patience by  
Shreyash Patil Gawande — frontend dev learning the backend world from Amravati
