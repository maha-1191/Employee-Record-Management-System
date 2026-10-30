
public class EmployeeManager {

    private Employee[] employees = new Employee[100];
    private int count = 0;

    // Add Employee
    public void addEmployee(Employee employee) {

        if (employee == null) {
            System.out.println("Invalid employee");
            return;
        }

        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == employee.getEmployeeId()) {
                System.out.println("Employee already exists");
                return;
            }
        }

        if (count == employees.length) {
            System.out.println("Employee storage is full");
            return;
        }

        employees[count] = employee;
        count++;

        System.out.println("Employee added successfully");
    }

    // Display All Employees
    public void displayEmployees() {

        if (count == 0) {
            System.out.println("No employees to display");
            return;
        }

        for (int i = 0; i < count; i++) {

            System.out.println("\nEmployee ID: " + employees[i].getEmployeeId());
            System.out.println("Employee Name: " + employees[i].getName());
            System.out.println("Employee Age: " + employees[i].getAge());
            System.out.println("Employee Department: " + employees[i].getDepartment());
            System.out.println("Employee Salary: " + employees[i].getSalary());
        }
    }

    // Search Employee
    public Employee searchEmployee(int employeeId) {

        for (int i = 0; i < count; i++) {

            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }

        return null;
    }

    // Update Employee
    public void updateEmployee(int employeeId, String name, int age,
                               String department, double salary) {

        for (int i = 0; i < count; i++) {

            if (employees[i].getEmployeeId() == employeeId) {

                if (name == null || name.isBlank()) {
                    System.out.println("Name cannot be empty");
                    return;
                }

                if (department == null || department.isBlank()) {
                    System.out.println("Department cannot be empty");
                    return;
                }

                if (age <= 0) {
                    System.out.println("Age must be greater than 0");
                    return;
                }

                if (salary <= 0) {
                    System.out.println("Salary must be a positive value");
                    return;
                }

                employees[i].setName(name);
                employees[i].setAge(age);
                employees[i].setDepartment(department);
                employees[i].setSalary(salary);

                System.out.println("Employee updated successfully");
                return;
            }
        }

        System.out.println("Employee not found");
    }

    // Delete Employee
    public void deleteEmployee(int employeeId) {

        for (int i = 0; i < count; i++) {

            if (employees[i].getEmployeeId() == employeeId) {

                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }

                employees[count - 1] = null;
                count--;

                System.out.println("Employee deleted successfully");
                return;
            }
        }

        System.out.println("Employee not found");
    }

    // Get Employee Count
    public int getEmployeeCount() {
        return count;
    }
}

 