
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeManager empManager = new EmployeeManager();

        while (true) {

            System.out.println("\n=== Employee Record Management System ===");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Display Employee Count");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int employeeId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Employee Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Department: ");
                    String department = sc.nextLine();

                    System.out.print("Enter Employee Salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();

                    try {
                        Employee employee = new Employee(
                            employeeId, name, age, department, salary
                        );

                        empManager.addEmployee(employee);

                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    empManager.displayEmployees();
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();

                    Employee found = empManager.searchEmployee(searchId);

                    if (found != null) {
                        System.out.println("\nEmployee found!");
                        System.out.println("ID: " + found.getEmployeeId());
                        System.out.println("Name: " + found.getName());
                        System.out.println("Age: " + found.getAge());
                        System.out.println("Department: " + found.getDepartment());
                        System.out.println("Salary: " + found.getSalary());
                    } else {
                        System.out.println("Employee not found");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter new age: ");
                    int newAge = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new department: ");
                    String newDepartment = sc.nextLine();

                    System.out.print("Enter new salary: ");
                    double newSalary = sc.nextDouble();
                    sc.nextLine();

                    empManager.updateEmployee(
                        updateId, newName, newAge,
                        newDepartment, newSalary
                    );
                    break;

                case 5:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = sc.nextInt();

                    empManager.deleteEmployee(deleteId);
                    break;

                case 6:
                    System.out.println(
                        "Total Employees: " + empManager.getEmployeeCount()
                    );
                    break;

                case 7:
                    System.out.println("Exiting the program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

