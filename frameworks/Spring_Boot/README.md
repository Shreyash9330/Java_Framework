<p align="center">
  <img src="./springboot-logo.png" width="140">
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

### 🌈 About

This folder represents my complete Spring Boot learning journey where I explore how modern Java backend
applications are built using auto-configuration, layered architecture, REST APIs, JPA with Hibernate,
validation, global exception handling and command-line deployment.

---

### ❓ Why Spring Boot?

- eliminates heavy XML configuration  
- embedded tomcat – no external server setup  
- faster REST API development  
- clean controller → service → repository architecture  
- perfect for microservice-based systems  

---

### 🏗 Architecture

controller → handles requests  
service → business logic  
repository → database operations  
model / dto → entities and data transfer  
exception → custom error handling  
SpringBootApplication.java → application entry point  

---

### 🔄 Execution Flow

1. run SpringBootApplication  
2. spring scans all components  
3. auto-configures required beans  
4. starts embedded tomcat server  
5. maps REST endpoints  
6. handles browser or postman requests  

---

### 📂 Folder Structure

springboot-project/
└── src/
    └── main/
        └── java/
            └── com/
                └── shreyash/
                    └── app/
                        ├── controller
                        ├── service
                        ├── repository
                        ├── model
                        ├── dto
                        ├── exception
                        └── SpringBootApplication.java

---

### ⚙ application.properties

server.port=8080
spring.datasource.url=jdbc:mysql://localhost:3306/springbootdb
spring.datasource.username=root
spring.datasource.password=1234
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

---

### 🔥 Common REST Annotations

- `@RestController`
- `@GetMapping`
- `@PostMapping`
- `@PutMapping`
- `@DeleteMapping`
- `@RequestBody`
- `@PathVariable`

---

### 🛠 How to Run

**Using IDE**  
Run → Spring Boot App  

**Using Command Line**

mvn spring-boot:run
mvn clean install
java -jar target/springboot-project.jar

---

### 🧪 Testing

- `@SpringBootTest`
- JUnit

---

### 🎯 Goal

To build real-world backend applications using Spring Boot  
and become a confident Java Full Stack Developer.

---

**Author : Shreyash Patil Gawande**
