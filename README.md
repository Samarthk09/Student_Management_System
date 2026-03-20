Student Management System (Spring Boot + MySQL)

Project Overview
This is a Full Stack Student Management System developed using Spring Boot, MySQL, HTML, CSS, and JavaScript. The application allows users to register, login, and manage student records through a simple and responsive web interface.
This project is designed especially for Java Full Stack Fresher Interviews and demonstrates backend + frontend + database integration.

Features
Authentication
	•	User Registration Page
	•	Login Page using Spring Security
	•	Password encryption using BCrypt
	•	Logout functionality

Student Management (CRUD)
	•	Add Student
	•	View All Students
	•	Update Student Details
	•	Delete Student (Soft Delete)

Validation
	•	Backend validation using Spring Boot
	•	Frontend validation using JavaScript

UI Features
	•	Responsive Login Page
	•	Responsive Register Page
	•	Reusable Navigation Bar
	•	Clean and modern UI

Technologies Used
Backend
	•	Java 21
	•	Spring Boot
	•	Spring Security
	•	Spring Data JPA
	•	Hibernate

Frontend
	•	HTML
	•	CSS
	•	JavaScript

Database
	•	MySQL

Tools
	•	IntelliJ IDEA
	•	Git & GitHub
	•	Postman

Project Structure
student-management
│
├── src/main/java/com/student/student_management
│   ├── controller
│   ├── service
│   ├── repository
│   ├── entity
│   ├── security
│   └── StudentManagementApplication.java
│
├── src/main/resources
│   ├── static
│   │   ├── login.html
│   │   ├── register.html
│   │   ├── index.html
│   │   ├── students.html
│   │   ├── add-student.html
│   │   ├── update-student.html
│   │   └── navbar.html
│   │
│   └── application.properties


How to Run This Project

Step 1: Clone the repository
git clone https://github.com/Samarthk09/Student_Management_System
Step 2: Open in IntelliJ IDEA
Open the project as a Maven Project.

Step 3: Configure MySQL Database
Create a database in MySQL:
create database student_management_db;

Update application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/student_management_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

Step 4: Run the Application
Run:
StudentManagementApplication.java

Then open in browser:
http://localhost:8080/login.html


Author
Samarth Kolhe
