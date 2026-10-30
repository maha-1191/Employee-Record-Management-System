
public class Employee {

    private int employeeId;
    private String name;
    private int age;
    private String department;
    private double salary;

    // Constructor
    public Employee(int employeeId, String name, int age,
                    String department, double salary) {

        if (employeeId <= 0) {
            throw new IllegalArgumentException("Invalid employee ID");
        }
        this.employeeId = employeeId;

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;

        if (age <= 0) {
            throw new IllegalArgumentException("Invalid age");
        }
        this.age = age;

        if (department == null || department.isBlank()) {
            throw new IllegalArgumentException("Invalid department");
        }
        this.department = department;

        if (salary <= 0) {
            throw new IllegalArgumentException("Invalid salary");
        }
        this.salary = salary;
    }

    // Getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setName(String name) {
        if (name == null || name.isBlank()) {
            System.out.println("Invalid name");
            return;
        }
        this.name = name;
    }

    public void setDepartment(String department) {
        if (department == null || department.isBlank()) {
            System.out.println("Invalid department");
            return;
        }
        this.department = department;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary");
        }
    }
}


