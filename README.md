# SpringLearning

A Spring Boot application built for learning and exploring the Spring ecosystem.

## Tech Stack

- **Java 17**
- **Spring Boot 4.0.3**
- **Spring Web MVC** – RESTful web services
- **Spring Data JPA** – Data persistence
- **Spring Security** – Authentication & authorization
- **PostgreSQL** – Relational database
- **Lombok** – Boilerplate code reduction
- **Maven** – Build & dependency management

## Prerequisites

- Java 17+
- Maven 3.9+ (or use the included Maven Wrapper)
- PostgreSQL instance running and accessible

## Getting Started

### 1. Clone the repository

```bash
git clone <repository-url>
cd SpringLearning
```

### 2. Configure the database

Update `src/main/resources/application.yaml` with your PostgreSQL connection details:

```yaml
spring:
  application:
    name: SpringLearning
  datasource:
    url: jdbc:postgresql://localhost:5432/your_database
    username: your_username
    password: your_password
  jpa:
    hibernate:
      ddl-auto: update
```

### 3. Build the project

```bash
./mvnw clean install
```

On Windows:

```cmd
mvnw.cmd clean install
```

### 4. Run the application

```bash
./mvnw spring-boot:run
```

On Windows:

```cmd
mvnw.cmd spring-boot:run
```

The application will start on `http://localhost:8080` by default.

## Running Tests

```bash
./mvnw test
```

## License

This project is for learning purposes.

