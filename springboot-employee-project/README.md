# Employee Management REST API

This project is a Spring Boot REST API for managing employees. It provides CRUD (Create, Read, Update, Delete) operations for employee records.

## Features

- Add a new employee
- Retrieve all employees
- Retrieve an employee by ID
- Update an existing employee's details
- Delete an employee

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven
- Lombok
- Git

## Prerequisites

- JDK 8 or higher
- Maven
- An IDE (e.g., IntelliJ IDEA, Eclipse)

## Setup Instructions

1. **Clone the repository**:

   ```bash
   git clone <repository-url>
   ```

2. **Navigate to the project directory**:

   ```bash
   cd springboot_project
   ```

3. **Build the project**:

   ```bash
   mvn clean install
   ```

4. **Run the application**:

   ```bash
   mvn spring-boot:run
   ```

5. **Access the application**:
   - The API will be available at: `http://localhost:8080/api/employees`

## Endpoints

### Add a New Employee

- **URL**: `POST /api/employees/add`
- **Request Body**:
  ```json
  {
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com",
    "birthday": "1990-01-01"
  }
  ```
- **Response**: `201 Created`

### Get All Employees

- **URL**: `GET /api/employees/list`
- **Response**: `200 OK`

### Get Employee by ID

- **URL**: `GET /api/employees/{id}`
- **Response**: `200 OK`

### Update Employee

- **URL**: `PUT /api/employees/{id}`
- **Request Body**:
  ```json
  {
    "firstName": "Jane",
    "lastName": "Smith",
    "email": "jane.smith@example.com",
    "birthday": "1985-05-15"
  }
  ```
- **Response**: `200 OK`

### Delete Employee

- **URL**: `DELETE /api/employees/{id}`
- **Response**: `200 OK`

## Database Configuration

The application uses PostgreSQL database. You can configure your own database in the `application.properties` file:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/employee_management_database
spring.datasource.username=********
spring.datasource.password=****
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update
```

## Custom Exception Handling

The application handles `ResourceNotFoundException` for cases where an employee is not found by ID.
