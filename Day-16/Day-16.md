# Day 16 – Fundoo Notes Application

## 📌 Overview

As part of **Day 16 of the Refresher Training**, I worked on building a **Fundoo Notes Application** using **Spring Boot** and **MySQL**.

The application currently follows a **Monolithic Architecture** and implements core features such as user authentication, JWT-based authorization, notes management, labels, search/filtering, DTO mapping, exception handling, and validation.

> **Note:** Some security restrictions and a few APIs are temporarily relaxed using `permitAll()` for testing and development purposes. These configurations will be secured and finalized as the project progresses.

## 🔗 Project Repository

The complete Fundoo application is available here:

[Fundoo Notes Application](https://github.com/devdipanshu/BridgeLabz-Training/tree/Refresher-Training/Fundoo)

---

# 🚀 Features Implemented

## 1. Project & Database Setup

- Created the Fundoo Notes Spring Boot project.
- Configured MySQL database.
- Created the `fundoo_notes_db` database.
- Implemented layered architecture:
    - Controller
    - Service
    - Repository
    - Entity
    - DTO
    - Mapper
    - Exception
    - Config

---

## 2. User Registration & Login

- Implemented user registration.
- Added password encryption using `BCryptPasswordEncoder`.
- Implemented unique email validation.
- Implemented user login.
- Generated JWT token after successful authentication.
- Added authentication using Spring Security.

---

## 3. JWT Authentication & Authorization

- Implemented JWT-based authentication.
- Created `JwtAuthFilter` for validating JWT tokens.
- Configured `SecurityContextHolder` to store authenticated user information.
- Secured application APIs using JWT.
- Configured public access for authentication endpoints.

> Some APIs are currently configured with `permitAll()` temporarily for testing and development. These restrictions will be finalized before the production-ready version.

---

## 4. Notes CRUD

Implemented core note operations:

- Create notes
- Get all notes
- Get note by ID
- Update notes
- Delete notes

Note properties include:

- Title
- Description
- Pin status
- Archive status
- Delete status
- Color
- Type of note
- Image URL
- Link URL
- Owner

> A few CRUD operations are still under development/testing and will be completed in the upcoming development phase.

---

## 5. Note Ownership

Implemented user-level note ownership.

- Users can access only their own notes.
- Note operations are scoped to the authenticated user.
- Users cannot access another user's notes by manually changing the `noteId`.
- Unauthorized note access returns `404 Not Found`.
- Added ownership validation while performing note operations.

---

## 6. Pin, Archive & Trash

Implemented note state management:

- Pin / Unpin notes
- Archive notes
- Move notes to trash
- Restore notes from trash
- Permanently delete notes

Business rules were implemented for note state transitions.

For example:

- Trashed notes cannot be pinned.
- Archived/trash states are handled separately.
- Notes can be restored from trash.

---

## 7. Labels

Implemented user-specific note labels.

Features include:

- Create labels
- Update labels
- Delete labels
- Get user's labels
- Add labels to notes
- Remove labels from notes

Labels are unique per user, meaning different users can have labels with the same name.

---

## 8. Search & Filtering

Implemented dynamic note searching and filtering using:

- Spring Data JPA Specifications
- `CriteriaBuilder`
- Dynamic predicates

Users can search/filter notes based on:

- Title
- State
- Label

Search results are always restricted to the currently authenticated user.

---

## 9. DTO & Mapper Implementation

Implemented DTO-based API responses instead of directly exposing JPA entities.

### Data Flow

```
Entity
   ↓
Mapper
   ↓
DTO
   ↓
Controller
   ↓
API Response
```

---

# 🔮 Upcoming Development

The Fundoo Notes application is currently under active development. The core monolithic features are being implemented first, followed by advanced backend and distributed-system features.

The following features are planned for the upcoming **1–2 days**:

### 🛡️ Exception Handling

- Implement centralized global exception handling.
- Create custom exception classes for application-specific errors.
- Implement `@RestControllerAdvice` for handling exceptions globally.
- Handle common exceptions such as:
    - Resource Not Found
    - Duplicate Resource
    - Invalid Request
    - Unauthorized Access
    - Validation Errors
- Return proper HTTP status codes.
- Provide structured and meaningful error responses.

### ⚡ Caching

- Implement application-level caching.
- Integrate **Redis** for distributed caching.
- Use Spring Cache annotations:
    - `@Cacheable`
    - `@CachePut`
    - `@CacheEvict`
- Reduce unnecessary database calls and improve response time.

### 📨 Asynchronous Communication

- Implement asynchronous processing.
- Introduce message-based communication.
- Handle background operations asynchronously.
- Reduce blocking operations where applicable.

### ⏰ Reminders

- Implement note reminder functionality.
- Schedule reminder events.
- Process reminders asynchronously.
- Integrate **JMS (Java Message Service)**.
- Implement notification/reminder processing.

### 🤝 Collaboration

- Implement note collaboration functionality.
- Share notes with other users.
- Add and remove collaborators.
- Manage collaborator permissions.
- Implement proper authorization for shared notes.

### 🔐 Security Finalization

- Remove temporary `permitAll()` configurations.
- Secure all protected APIs.
- Finalize JWT authentication and authorization.
- Implement proper resource-level authorization.
- Improve security for collaborative features.

### 🧩 Microservices Architecture

After completing the major monolithic features, the application will be migrated to a **Microservices Architecture**.

Planned services may include:

- User Service
- Notes Service
- Label Service
- Reminder / Notification Service
- Collaboration Service

Additional distributed-system components:

- API Gateway
- Service Discovery
- Inter-service Communication
- Redis Distributed Cache
- Asynchronous Messaging

---

## 🚀 Final Development Roadmap

```text
Monolithic Spring Boot Application
                ↓
          Core CRUD Features
                ↓
       Authentication + JWT
                ↓
    Exception Handling + Validation
                ↓
       Search & Filtering
                ↓
          Redis Caching
                ↓
  Asynchronous Communication
                ↓
        JMS + Reminders
                ↓
         Collaboration
                ↓
       Microservices
                ↓
     API Gateway + Discovery
                ↓
   Distributed Fundoo Application
