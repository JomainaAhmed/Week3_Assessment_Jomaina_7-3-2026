# Advanced Java Assessments (Week 3)

# Week 3 – Student Management System (SMS)

## Description
The **Student Management System** is a Spring Boot REST API designed to manage student records securely.  
It supports advanced features such as **file upload, pagination, caching, security, and monitoring**.

## Technologies Used
- Spring Boot
- Spring Data JPA
- Spring Security
- Spring Cache
- Multipart File Upload
- Spring Boot Actuator
- PostgreSQL

## Student Entity

| Field | Description |
|------|------|
| id | Student ID |
| name | Student name |
| email | Email |
| course | Course enrolled |
| marks | Student marks |
| profileImage | Stored as binary |
| assignmentFile | Stored as binary |

## Features

### CRUD Operations
- Create student
- Retrieve student by ID
- Retrieve all students
- Update student details
- Delete student

### Pagination and Sorting
Retrieve student records in paginated and sorted format.

### File Handling
- Upload student profile image
- Upload student assignment file
- Download stored files

### Security Features
- Spring Security Basic Authentication
- Password encryption
- Role-based authorization

### Roles
- ADMIN
- USER

### Method-Level Security
- `@PreAuthorize`
- `@PostAuthorize`

### Additional Features
- Spring Cache for optimized performance
- CORS configuration
- Spring Boot Actuator for application monitoring

---

# How to Run the Projects

## Clone the Repository
```bash
git clone https://github.com/your-username/repository-name.git
```

## Navigate to the Project
```
cd repository-name
```

## Build the Project
```
mvn clean install
```

## Run the Application
```
mvn spring-boot:run
```
