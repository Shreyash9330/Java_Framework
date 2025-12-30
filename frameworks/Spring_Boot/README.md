<p align="center">
  <img src="./springboot-logo.png" width="130">
</p>

<h1 align="center">🌿 Spring Boot Playground</h1>
<p align="center">build fast • break less • deploy smart</p>

<p align="center">
  <img src="https://img.shields.io/badge/java-17-orange">
  <img src="https://img.shields.io/badge/springboot-3.x-brightgreen">
  <img src="https://img.shields.io/badge/rest-api-yellow">
  <img src="https://img.shields.io/badge/jpa-hibernate-blueviolet">
  <img src="https://img.shields.io/badge/mysql-db-blue">
  <img src="https://img.shields.io/badge/maven-build-blue">
</p>

---

### 🌈 About This Section

This folder contains my complete Spring Boot learning journey where I explore how modern Java backend
applications are created using auto-configuration, layered architecture, REST APIs, JPA, validation,
exception handling and command-line deployment.

---

### ❓ Why Spring Boot?

- no heavy xml, no boilerplate  
- embedded tomcat – no server setup  
- faster rest api development  
- clean controller → service → repository structure  
- perfect for microservices  

---

### 🏗 Architecture Overview

controller → handles requests  
service → business logic  
repository → database operations  
model / dto → entities and data transfer  
exception → custom errors  
SpringBootApplication.java → application entry point  

---

### 🔄 Execution Flow

1. run SpringBootApplication  
2. spring scans all components  
3. auto configures beans  
4. starts embedded tomcat  
5. maps all rest apis  
6. handles browser / postman request  

---

### 📂 Folder Structure



springboot-project/
└── src/main/java/com/shreyash/app/
├── controller
├── service
├── repository
├── model
├── dto
├── exception
└── SpringBootApplication.java

---

## ⚙ application.properties

server.port=8080
spring.datasource.url=jdbc:mysql://localhost:3306/springbootdb
spring.datasource.username=root
spring.datasource.password=1234
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

---

## 🔥 Common REST Annotations

- `@RestController`
- `@GetMapping`
- `@PostMapping`
- `@PutMapping`
- `@DeleteMapping`
- `@RequestBody`
- `@PathVariable`

---

## 🛠 How to Run

**Using IDE**

Run → Spring Boot App

**Using Command Line**


---

## 🧪 Testing

- `@SpringBootTest`
- JUnit testing

---

## 🎯 Goal

To build real-world backend applications using Spring Boot
and become a confident Java Full Stack Developer.

---

**Author : Shreyash Patil Gawande**

