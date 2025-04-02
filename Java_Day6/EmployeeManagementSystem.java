interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

abstract class Employee implements Department {
    private int employeeId;
    private String name;
    private int baseSalary;
    private String department;

    public Employee(int employeeId, String name, int baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    @Override
    public void assignDepartment(String dept) {
        this.department = dept;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Department: " + department);
    }

    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    private int bonus;

    public FullTimeEmployee(int id, String name, int baseSalary, int bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private int hourlyRate;

    public PartTimeEmployee(int id, String name, int hourlyRate, int hoursWorked) {
        super(id, name, 0); 
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee(101, "Abhinaya", 30000, 5000);
        emp1.assignDepartment("Software Development");

        Employee emp2 = new PartTimeEmployee(102, "Ravi", 200, 80);
        emp2.assignDepartment("Technical Support");

        Employee[] employees = { emp1, emp2 };

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Calculated Salary: " + emp.calculateSalary());
        }
    }
}
