# Interview Demo Project

A Spring Boot demonstration project commonly used during technical interviews. This project showcases basic Spring Boot functionalities including REST APIs, JPA relationships, and database operations.

## 🚀 Features

- REST API endpoints for managing people and invoices
- JPA entity relationships (One-to-Many between Person and Invoice)
- H2 in-memory database with sample data
- Basic CRUD operations
- Lombok for reducing boilerplate code

## 🛠️ Technologies

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- H2 Database
- Lombok
- Maven

## 📋 Prerequisites

- Java JDK 17 or higher
- Maven 3.6 or higher
- Your favorite IDE (IntelliJ IDEA, Eclipse, or VS Code)

## 🔧 Setup & Installation

1. Clone the repository
2. Run `mvn spring-boot:run` in your terminal

## 📝 Interview Task

Review the code in `PersonController.java`. This controller contains basic CRUD operations but needs to be refactored to make it production-ready. Consider how this code would behave in a real-world environment where things don't always go as planned.

### Evaluation Criteria:

- Code quality and organization
- Production readiness
- Best practices implementation
- Understanding of REST principles
- Knowledge of Spring Boot features
- Robustness and reliability
