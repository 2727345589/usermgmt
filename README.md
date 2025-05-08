# User Management System

## Project Overview
This is a user management system based on Spring Boot, providing user information management functionality.

## Technology Stack
- Spring Boot 3.4.5
- Java 17
- Spring Data JPA
- SQLite Database
- Lombok

## Project Structure
```
usermgmt/
├── .mvn/
├── src/
│   ├── main/
│   │   ├── java/com/ibm/usermgmt/  # Main code directory
│   │   │   ├── UsermgmtApplication.java  # Main class
│   │   │   ├── controllers/  # Controller layer
│   │   │   │   └── UserController.java
│   │   │   ├── daos/  # Data access layer
│   │   │   │   └── UserRepository.java
│   │   │   ├── entity/  # Entity classes
│   │   │   │   └── User.java
│   │   │   └── services/  # Service layer
│   │   │       ├── UserService.java
│   │   │       └── impl/
│   │   │           └── UserServiceImpl.java
│   │   └── resources/  # Configuration files
│   └── test/  # Test code
├──.gitattributes
├──.gitignore
│   └── test/                       # Test code
├── .gitattributes
├── .gitignore
├── identifier.sqlite               # SQLite database file
├── mvnw
├── mvnw.cmd
├── pom.xml                         # Maven configuration file
└── users.db                        # SQLite database file
```

## Quick Start Guide
1. Ensure Java 17 and Maven are installed
2. Clone the project
3. Run `mvn spring-boot:run`
4. Access `http://localhost:8080`

## API Reference
1. Add user
   - POST /api/v1/users
2. Get single user
   - GET /api/v1/users/{id}
![usermgmt1.png](picture%2Fusermgmt1.png)
![usermgmt2.png](picture%2Fusermgmt2.png)
![usermgmt3.png](picture%2Fusermgmt3.png)