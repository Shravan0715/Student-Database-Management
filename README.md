# Student Database Management System using Java Spring Framework

## 📖 Project Overview

This project is a **Student Database Management System** built using the **Java Spring Framework**. The application enables efficient management of student records by providing CRUD (Create, Read, Update, Delete) operations. It is integrated with **MySQL** for persistent data storage and tested extensively using **Postman**.

---

## 🛠️ Key Features

### 1️⃣ CRUD Operations:
- **Add Student**: Create new student records.
- **Fetch Students**: Retrieve all student records or specific details based on attributes (e.g., ID, name, mobile).
- **Update Student**: Modify existing student details using both PUT and PATCH methods.
- **Delete Student**: Remove student records from the database securely.

### 2️⃣ REST API Endpoints:
- `@PostMapping("/students")`: Add a new student.
- `@GetMapping("/students")`: Fetch all students.
- `@GetMapping("/students/{id}")`: Fetch student details by ID.
- `@GetMapping("/students/name/{name}")`: Fetch students by name.
- `@GetMapping("/students/mobile/{mobile}")`: Fetch students by mobile number.
- `@DeleteMapping("/students/{id}")`: Delete a student by ID.
- `@PutMapping("/students")`: Update complete student details.
- `@PatchMapping("/students/{id}")`: Partially update student details.

---

## ⚙️ Technical Stack

### Backend:
- **Java**: Core language for application logic.
- **Spring Boot**: Simplifies application development and setup.
- **Spring Framework**: Manages dependency injection and application context.
- **Spring Data JPA**: For seamless database interaction.

### Database:
- **MySQL**: Relational database for persistent data storage.

### Tools:
- **Postman**: For API testing and debugging.
- **Maven**: Dependency management and project build tool.

---

## 🔧 Implementation Details

### 1. Configuration Class:
- Set up MySQL database connections and JPA configurations.

### 2. Controller Class:
- Contains RESTful API endpoints for CRUD operations.

### 3. Service Class:
- Handles business logic and interacts with DAO layer.

### 4. DAO (Data Access Object):
- Uses Spring Data JPA to perform database operations.

### 5. Testing:
- Verified all endpoints using Postman for seamless integration and functionality.

---

## 🚀 How to Run the Project

### Clone the Repository:
```bash
git clone <repository_url>
```

### Navigate to the Project Directory:
```bash
cd <project_directory>
```

### Configure the MySQL Database:
- Update the `application.properties` file with your MySQL database credentials:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### Build the Project:
```bash
mvn clean install
```

### Run the Application:
```bash
mvn spring-boot:run
```

### Access the Application:
- API endpoints can be tested via Postman or accessed at `http://localhost:8080`.

---

## 🌟 Outcomes
- Gained expertise in REST API development with Java Spring Framework.
- Successfully integrated MySQL for robust and persistent data storage.
- Enhanced understanding of scalable and modular application design.

---

## 📂 Folder Structure
```
project-directory/
|
├── src/main/java/com/example
│   ├── config/        # Configuration classes
│   ├── controller/    # Controller classes
│   ├── dao/           # Data Access Objects
│   ├── model/         # Entity classes
│   ├── service/       # Business logic
|
├── src/main/resources
│   ├── application.properties  # Application configuration
│   └── data.sql                # Initial test data (if any)
|
├── pom.xml          # Maven dependencies
└── README.md        # Project documentation
```

---

## 🌐 GitHub Repository
The full source code for this project is available here: [GitHub Repository](https://github.com/Shravan0715)

---

## 📞 Contact
Feel free to reach out for collaboration or queries:
- **Email**: [shravangalagali573@gmail.com](mailto:shravangalagali573@gmail.com)
- **LinkedIn**: [Shravan S. Galagali](https://www.linkedin.com/in/shravan-s-galagali-15559a226/)

---

Thank you for exploring the project! 😊

