# 🚀 BridgeLabz Refresher Training

> A structured backend learning repository covering everything from **SQL** to **Spring Microservices** through daily hands-on practice.

---

## 🏗️ Learning Roadmap

```text
MySQL
   │
   ▼
SQL
   │
   ▼
JDBC
   │
   ▼
Spring Framework
   │
   ▼
Spring Boot
   │
   ▼
Spring Data JPA
   │
   ▼
Spring Security
   │
   ▼
Microservices
```

---

## 🛠️ Tech Stack

- ☕ Java
- 🗄️ MySQL
- 📄 SQL
- 🔌 JDBC
- 🌱 Spring Framework
- 🚀 Spring Boot
- 🗃️ Spring Data JPA
- 🔐 Spring Security
- 🌐 REST APIs
- ☁️ Microservices

---

## 📅 Day-wise Learning

### ✅ Day 1 - SQL Fundamentals
- MySQL Basics
- Database & Table Creation
- DDL, DML, DQL, DCL & TCL Commands
- CRUD Operations
- Basic SQL Queries

---

### ✅ Day 2 - Database Design
- ER Diagram
- Functional Dependency
- Normalization (1NF, 2NF, 3NF, BCNF)
- Indexing
- Composite Index
- EXPLAIN Command

---

### ✅ Day 3 - Advanced SQL
- SQL Joins (INNER JOIN, LEFT JOIN, RIGHT JOIN, FULL JOIN)
- Self Join
- Stored Procedures
- Triggers
- SQL Practice & Assignments

---

### ✅ Day 4 - JDBC Fundamentals
- JDBC Architecture
- JDBC Driver
- Database Connectivity
- Statement vs PreparedStatement
- ResultSet
- CRUD Operations
- Layered Architecture (DAO, Service, Model)

#### 🏥 Mini Project

To apply the concepts learned in JDBC, I developed a complete **Health Clinic Management System** using **Java, JDBC, and MySQL**.

👉 **Project:** [`Health-Clinic-App`](./Health-Clinic-App)

**Key Features**
- Patient CRUD Operations
- Doctor Management
- Appointment Management
- Layered Architecture (DAO, Service, DTO)
- MySQL Database Integration

---

### ✅ Day 5 - Servlet Fundamentals

- Introduction to Servlets
- Servlet Container
- Apache Tomcat Server
- Creating a Basic Servlet
- Deployment of Servlet on Tomcat
- Handling HTTP Requests & Responses
- URL Mapping using `web.xml` / `@WebServlet`

---

### ✅ Day 6 - Spring MVC & Core Concepts

- Introduction to Spring MVC
- MVC Architecture
- Controller and `@Controller`
- REST Controller and `@RestController`
- Inversion of Control (IoC)
- Dependency Injection (DI)
- Spring Container
- Beans and Bean Lifecycle
- Component Scanning
- Request Mapping and HTTP Methods
- Basic REST API Implementation

---

### ✅ Day 7 - Spring Boot & REST API

- Introduction to Spring Boot
- Spring Boot Project Structure
- Spring Boot Application Configuration
- REST API Development
- `@RestController`
- `@RequestMapping`
- `@GetMapping`, `@PostMapping`, `@PatchMapping`
- Request DTO and Response DTO
- Entity and Repository
- Service Layer
- Dependency Injection
- HTTP Request & Response Handling

#### 📱 Mini Project - Contact App

Built a **Contact Management REST API** using **Spring Boot** to implement the concepts covered during Day 7.

👉 **[Open Contact App](./Day-7/ContactApp)**

**Key Features**
- Create Contact
- Get Contact
- Update Contact
- Delete Contact
- Request & Response DTOs
- Layered Architecture
- RESTful API Design

---

### ✅ Day 8 - College Management System: Student Module

- Worked on the **Student Module** of the College Management System
- Student Entity
- Student Request & Response DTOs
- Student Controller
- Student Service Layer
- Student Repository
- CRUD Operations for Students
- Request Validation
- REST API Implementation
- DTO Mapping

---

### ✅ Day 9 - College Management System: Faculty Module

- Worked on the **Faculty Module** of the College Management System
- Faculty Entity
- Faculty Request & Response DTOs
- Faculty Controller
- Faculty Service Layer
- Faculty Repository
- CRUD Operations for Faculty
- Request Validation
- REST API Implementation
- DTO Mapping

---

### ✅ Day 10 - Exception Handling & Employee Payroll App Structure

#### 🎓 College Management System

- Implemented Exception Handling in the existing College Management System
- Created custom exceptions
- Defined exception handling structure
- Improved API error handling and response management

👉 **[Open College Management System](./Day-9/CollegeManagementSystem)**

#### 👨‍💼 Employee Payroll App

- Defined the project structure for the Employee Payroll App
- Designed the layered architecture
- Planned Controller, Service, Repository, Entity, DTO, and Exception layers
- Project implementation will start from Day 11

---

### ✅ Day 11 - Contact App Enhancement

#### 📱 Contact App

Continued development of the **Contact Management REST API** and enhanced the application with important backend features.

### 🔐 Transaction Management
- Implemented `@Transactional`
- Applied transaction management at the service layer
- Improved data consistency and rollback handling

### 📝 Logging
- Implemented application logging using SLF4J
- Added logs for important operations and errors
- Used appropriate log levels for debugging

### ⚠️ Exception Handling
- Implemented centralized exception handling
- Created custom exceptions
- Improved API error responses and error messages

👉 **[Open Contact App](./Day-11/ContactApp)**

---

### ✅ Day 12 - Employee Payroll App: Employee Module

#### 👨‍💼 Employee Payroll Management System

Started the implementation of a **Spring Boot based Employee Payroll Management System** with a focus on clean architecture, JPA entity relationships, DTO-based API design, and scalable project structure.

### 🏗️ Project Architecture

- Designed a **Layered Architecture** with Controller, Service, Repository, Entity, DTO, Mapper, and Exception layers
- Structured the application for maintainability and future feature expansion
- Followed separation of concerns across different application layers

### 🗃️ JPA Entity Design

- Designed `Employee`, `Department`, and `Payroll` entities
- Implemented **bidirectional `@OneToMany` and `@ManyToOne` relationships**
- Established the Employee–Department relationship
- Established the Employee–Payroll relationship
- Added `Role` enum with `EMPLOYEE`, `MANAGER`, and `ADMIN` roles
- Designed the entity structure keeping future **role-based access control** in mind

### 📦 DTO & Mapping

- Created **Employee Request DTO** for incoming API requests
- Created **Employee Response DTO** for API responses
- Implemented a dedicated **Employee Mapper**
- Separated API models from persistence entities

### 👨‍💼 Employee Module

- Created `EmployeeRepository` using Spring Data JPA
- Implemented `EmployeeService` for business logic
- Created `EmployeeController` for REST API endpoints
- Implemented the basic Employee CRUD flow
- Integrated DTO mapping between Controller, Service, and Entity layers

### 🔐 Security Preparation

- Designed the Employee role structure for upcoming **Spring Security integration**
- Planned role-based authorization using `EMPLOYEE`, `MANAGER`, and `ADMIN`
- Prepared the project structure for future **JWT-based authentication and authorization**

### 🚧 Next Steps

- Complete Department Module
- Implement Payroll Module and salary calculation logic
- Add request validation and centralized exception handling
- Implement Spring Security
- Add JWT Authentication
- Implement Role-Based Authorization

---

### 🚧 Day 13
> In Progress...
>
> Content will be updated after the completion of Day 13 training.

---

## 📂 Repository Structure

```text
BridgeLabz-Refresher-Training/
│
├── Day-1/
├── Day-2/
├── Day-3/
├── ...
└── README.md
```

---

## 🎯 Goal

This repository documents my complete **BridgeLabz Refresher Training** journey with daily hands-on practice, assignments, and implementation of backend development concepts from **SQL** to **Spring Microservices**.

⭐ Feel free to explore the day-wise folders to track my learning progress.