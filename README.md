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

### ✅ Day 13 - Employee Payroll App: Employee, Department & Payroll Modules

#### 👨‍💼 Employee Payroll Management System

Continued development of the **Employee Payroll Management System** with JPA relationships, Department & Payroll modules, and JWT-based authentication.

### 🗃️ JPA Relationship Implementation

- Implemented `Employee`, `Department`, and `Payroll` relationships
- Worked with bidirectional `@OneToMany` and `@ManyToOne` mappings
- Resolved JPA relationship and cascading issues
- Fixed entity persistence and relationship handling

### 🏢 Department & Payroll Modules

- Implemented Department Controller, Service, DTO, and Mapper
- Implemented Payroll Controller, Service, DTO, and Mapper
- Integrated Employee–Department and Employee–Payroll relationships
- Implemented Department and Payroll API operations

### 🔐 Spring Security & JWT

- Implemented `SecurityFilterChain`
- Configured authentication and protected endpoints
- Implemented JWT generation and validation
- Created Login API
- Implemented authentication logic using `AuthenticationManager`

### 🚧 Next Steps

- Implement JWT Authentication Filter
- Implement Role-Based Authorization
- Add centralized exception handling
- Add request validation
- Implement payroll salary calculation logic

---

### ✅ Day 14 - Employee Payroll App: Security & Business Logic

#### 👨‍💼 Employee Payroll Management System

Completed the major implementation of the **Employee Payroll Management System** with complete Spring Security integration, role-based access control, transactional business operations, and additional Employee management features.

### 🔐 Spring Security & JWT

- Fully implemented **Spring Security**
- Implemented **JWT-based authentication**
- Implemented JWT authentication filter
- Configured `SecurityFilterChain`
- Secured all protected REST API endpoints
- Configured authentication and authorization flow
- Implemented **Role-Based Access Control (RBAC)**
- Added role-based endpoint authorization for:
    - `EMPLOYEE`
    - `MANAGER`
    - `ADMIN`
- Restricted API operations based on employee roles
- Configured public and protected endpoints

### 👨‍💼 Employee Module Enhancements

- Added additional Employee management operations
- Implemented role-based restrictions for Employee operations
- Improved Employee service-layer business logic
- Integrated security checks with Employee operations
- Improved API access control and endpoint security

### 🏢 Department & Payroll

- Completed integration between Employee, Department, and Payroll modules
- Implemented required business operations
- Maintained proper JPA entity relationships
- Improved persistence and relationship handling

### 🔄 Transaction Management

- Applied `@Transactional` at required service-layer operations
- Ensured multiple database operations execute atomically
- Improved data consistency
- Added rollback support for failed business operations
- Used transactions where multiple related entities are modified together

### 🏗️ Architecture & Code Quality

- Followed layered architecture
- Maintained separation of Controller, Service, Repository, Entity, DTO, Mapper, and Security layers
- Improved business logic organization
- Secured APIs according to application roles
- Improved overall project structure and maintainability

### 🚀 Project Status

The major implementation of the **Employee Payroll Management System is now almost complete**, including:

- ✅ Employee Module
- ✅ Department Module
- ✅ Payroll Module
- ✅ JPA Relationships
- ✅ DTO & Mapper Layer
- ✅ Exception Handling
- ✅ Spring Security
- ✅ JWT Authentication
- ✅ JWT Authentication Filter
- ✅ Role-Based Authorization
- ✅ Secure REST APIs
- ✅ Transaction Management
- ✅ Employee Business Operations

### 🚧 Next Steps

- Complete remaining edge cases and validations
- Add comprehensive unit and integration testing
- Improve API documentation
- Refactor and optimize code where required
- Final project testing and cleanup

---

### ✅ Day 15 - Employee Payroll App: Exception Handling, Profiling & API Validation

#### 👨‍💼 Employee Payroll Management System

Focused on improving the overall stability, structure, security, and reliability of the **Employee Payroll Management System** before moving towards the next project.

### ⚠️ Exception Handling

- Implemented and improved centralized **Exception Handling**
- Added custom exceptions wherever required
- Improved error handling across Service and Controller layers
- Standardized API error responses
- Improved handling of invalid requests and business-level exceptions

### 📊 Application Profiling

- Added **Application Profiling** to analyze application behavior
- Reviewed application structure and execution flow
- Identified areas for improvement and optimization
- Improved overall code organization and maintainability

### 🏗️ Project Structure Improvement

- Refactored the existing project structure
- Improved separation of responsibilities across application layers
- Organized Controller, Service, Repository, DTO, Mapper, Security, and Exception components
- Improved code readability and maintainability
- Cleaned up unnecessary or redundant implementation

### 🔐 Security & API Validation

- Tested all REST API endpoints using **Postman** to ensure they are working as expected
- Verified JWT-based authentication flow
- Verified **Role-Based Access Control (RBAC)** for:
  - `EMPLOYEE`
  - `MANAGER`
  - `ADMIN`
- Ensured protected endpoints cannot be accessed without valid authentication
- Verified role-based restrictions for protected operations
- Verified public and secured endpoint configuration
- Validated **Employee, Department, and Payroll APIs**
- Verified successful, invalid, unauthorized, and restricted request scenarios
- Ensured the overall API flow is working correctly with the implemented security configuration

### 📋 Next Project Preparation

Along with completing the Employee Payroll App improvements, started preparation for the upcoming **Fundoo App**, which will be implemented from **Day 16**.

- Performed **Requirement Analysis** for the Fundoo App
- Identified major application modules and features
- Analyzed the expected application workflow
- Planned the core backend functionality
- Designed the initial application architecture
- Identified required entities and relationships
- Planned the API structure and application layers
- Prepared the initial project structure for development
- Planned Controller, Service, Repository, Entity, DTO, Mapper, Exception, and Security layers

---

### 🚀 Day 16 - Fundoo Notes Application

#### 📝 Fundoo Notes Application

Started development of the **Fundoo Notes Application** using **Spring Boot** and **MySQL**.

* Implemented the initial **Monolithic Architecture**
* Configured MySQL database and project structure
* Implemented User Registration and Login
* Implemented **JWT-based Authentication & Authorization**
* Implemented Notes CRUD operations
* Implemented Note Ownership
* Added Pin, Archive and Trash functionality
* Implemented Labels and Label-Note association
* Added Search & Filtering using JPA Specifications
* Implemented DTO and Mapper layers
* Added validation and initial Exception Handling structure
* Implemented layered architecture with Controller, Service, Repository, Entity, DTO, Mapper, Exception, and Security layers

📂 **Project:** [Fundoo Notes Application](https://github.com/devdipanshu/BridgeLabz-Training/tree/Refresher-Training/Fundoo)

---

### ⚡ Day 17 - Fundoo App: Redis Caching & RabbitMQ

#### 💾 Redis Cache Implementation

Implemented **Redis Caching** in the Fundoo Notes Application to improve performance and reduce unnecessary database calls.

* Integrated **Redis** with Spring Boot
* Used **Memurai** as the Redis-compatible service
* Implemented Spring Cache
* Used `@Cacheable` for caching frequently accessed data
* Used `@CacheEvict` for cache invalidation
* Configured cache TTL
* Configured Redis serialization
* Verified cache hit and cache miss behavior

#### 📨 RabbitMQ Implementation

Implemented **RabbitMQ** for asynchronous message communication.

* Configured RabbitMQ with Spring Boot
* Implemented Producer and Consumer
* Configured Exchange, Queue, and Binding
* Implemented message publishing and consumption
* Configured RabbitMQ using **Docker**
* Created and managed RabbitMQ container
* Used RabbitMQ Management UI to monitor queues and exchanges

📂 **Project:** [Fundoo Notes Application](https://github.com/devdipanshu/BridgeLabz-Training/tree/Refresher-Training/Fundoo)

---

### 🔄 Day 18 - Fundoo App: Bug Fixing, New APIs & Microservices Revision

#### 🐞 Bug Fixing & API Improvements

Continued improving the Fundoo Notes Application by identifying existing issues and implementing additional APIs.

* Identified and fixed bugs in the existing application
* Improved existing endpoint behavior
* Added new REST API endpoints
* Implemented required Service and Repository logic
* Verified updated and newly added APIs using **Postman**

#### 🧩 Microservices Architecture Revision

Revised the concepts required to migrate the current **Monolithic Fundoo Application** to **Microservices Architecture**.

* Revised Monolith to Microservices migration strategy
* Studied how to divide the application into independent services
* Revised **API Gateway** concepts
* Understood API Gateway request routing
* Revised **JWT Security in Microservices**
* Studied authentication and authorization flow across services
* Revised **Service Discovery**
* Revised **Database per Service**
* Studied synchronous and asynchronous inter-service communication
* Revised the role of **RabbitMQ** in Microservices Architecture

📂 **Project:** [Fundoo Notes Application](https://github.com/devdipanshu/BridgeLabz-Training/tree/Refresher-Training/Fundoo)

---

### 🔮 Upcoming Development

The next phase of the **Fundoo Notes Application** will focus on moving from the current **Monolithic Architecture** towards a **Microservices Architecture**.

Planned development includes:

* Implement centralized **Exception Handling**
* Divide Fundoo into independent microservices
* Implement **API Gateway**
* Configure **Service Discovery**
* Implement JWT-based security across microservices
* Implement inter-service communication
* Integrate RabbitMQ where required
* Configure independent databases for services
* Dockerize microservices
* Continue implementing remaining Fundoo features

---

### 🚧 Day 19

> In Progress...
>
> Content will be updated after the completion of Day 19 training.

---

## 📂 Repository Structure

```text
BridgeLabz-Refresher-Training/
│
├── Day-1/
├── Day-2/
├── Day-3/
├── ...
├── Day-16/
├── Day-17/
├── Day-18/
└── README.md
```

---

## 🎯 Goal

This repository documents my complete **BridgeLabz Refresher Training** journey with daily hands-on practice, assignments, and implementation of backend development concepts from **SQL to Spring Microservices**.

⭐ Feel free to explore the day-wise folders to track my learning progress.
