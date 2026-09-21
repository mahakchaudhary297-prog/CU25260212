class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    // Salary validation inside setter
    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Error: Salary cannot be negative (Rs" + salary + ").");
        } else if (salary > 1000000) {
            System.out.println("Error: Salary cannot exceed 1,000,000 (Rs" + salary + ").");
        } else {
            this.salary = salary;
            System.out.println("Salary successfully updated to: Rs" + salary);
        }
    }

    public void displayDetails() {
        System.out.println("ID: " + employeeId + " | Name: " + employeeName + " | Salary: Rs" + salary);
    }
}

public class Labsheet5Q3 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmployeeId(201);
        emp.setEmployeeName("Priya Mehta");

        System.out.println("--- Testing Valid Salary ---");
        emp.setSalary(75000.0);
        emp.displayDetails();

        System.out.println("\n--- Testing Invalid Salaries ---");
        emp.setSalary(-5000.0);      
        emp.setSalary(1200000.0);    
    }
}