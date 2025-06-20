import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDAO dao = new EmployeeDAO();

        while (true) {
            System.out.println("\n== Employee Management ==");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Delete Employee by ID");
            System.out.println("4. Update Employee Salary");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Salary: ");
                    double sal = sc.nextDouble();
                    dao.addEmployee(new Employee(name, dept, sal));
                    break;
                case 2:
                    dao.viewAll();
                    break;
                case 3:
                    System.out.print("Enter ID to delete: ");
                    dao.deleteById(sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    System.out.print("New Salary: ");
                    double newSal = sc.nextDouble();
                    dao.updateSalary(id, newSal);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}