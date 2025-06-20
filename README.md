# 👨‍💼 Java + SQL: Employee Management System

## 🧾 Description
A console-based employee management app in Java using MySQL for persistent storage. Supports adding, viewing, deleting, and updating employee data.

## 💻 Technologies
- Java (JDK 8+)
- JDBC
- MySQL 5.7/8
- Console I/O

## 📦 Setup Instructions
1. Import `employees.sql` into MySQL to create the database and table.
2. Update `DBConnection.java` with your MySQL credentials.
3. Compile all files:
   ```bash
   javac *.java
   ```
4. Run:
   ```bash
   java Main
   ```

## ✨ Features
- Add Employee
- View All Employees
- Delete by ID
- Update Salary

## 🔐 Security Note
This app uses hardcoded DB credentials. For production, use environment variables or a config file.

## 📂 Files Included
- `Main.java`: Main menu
- `DBConnection.java`: DB config
- `Employee.java`: Data model
- `EmployeeDAO.java`: SQL logic
- `employees.sql`: SQL schema