import java.sql.*;
import java.util.*;

public class EmployeeDAO {
    Connection conn = DBConnection.getConnection();

    public void addEmployee(Employee emp) {
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO employees (name, department, salary) VALUES (?, ?, ?)");
            ps.setString(1, emp.getName());
            ps.setString(2, emp.getDepartment());
            ps.setDouble(3, emp.getSalary());
            ps.executeUpdate();
            System.out.println("Employee added.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewAll() {
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
            while (rs.next()) {
                System.out.printf("ID: %d | Name: %s | Dept: %s | Salary: %.2f\n",
                    rs.getInt("id"), rs.getString("name"),
                    rs.getString("department"), rs.getDouble("salary"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteById(int id) {
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM employees WHERE id=?");
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            if (rows > 0) System.out.println("Employee deleted.");
            else System.out.println("Employee not found.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateSalary(int id, double newSalary) {
        try {
            PreparedStatement ps = conn.prepareStatement("UPDATE employees SET salary=? WHERE id=?");
            ps.setDouble(1, newSalary);
            ps.setInt(2, id);
            int rows = ps.executeUpdate();
            if (rows > 0) System.out.println("Salary updated.");
            else System.out.println("Employee not found.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}