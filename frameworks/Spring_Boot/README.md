# 🌱 Spring Boot Framework

Spring Boot is a framework built on top of the Spring Framework that helps developers create
standalone, production-ready Java applications quickly with minimal configuration.

Instead of writing complex Spring XML and configuration, Spring Boot provides auto-configuration
and embedded servers.

---

## ❓ Why Spring Boot?

- Eliminates complex XML configuration  
- Provides embedded Tomcat / Jetty  
- Auto configuration of Spring components  
- Faster application development  
- Microservices ready  
- Easy REST API development  

---

## 🏗 Spring Boot Architecture

- Controller  
- Service  
- Repository  
- Model / Entity  
- DTO  
- Configuration  
- Exception Handling  

---

## 🔄 Spring Boot Execution Flow

1. Run `SpringBootApplication.java`
2. Spring Boot auto scans components
3. Auto-configures beans
4. Starts embedded Tomcat server
5. Maps REST APIs
6. Handles HTTP requests
7. Returns response

---

## 📂 Project Structure

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

