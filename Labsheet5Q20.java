// Interface for Research capabilities
interface Researcher {
    void conductResearch();
}

// Base Class demonstrating Encapsulation
class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    public Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("ID: " + employeeId + " | Name: " + employeeName + " | Base Salary: $" + salary);
    }

    public double calculateSalary() {
        return salary;
    }
}

// Single Inheritance + Interface Implementation
class Teacher extends Employee implements Researcher {
    private String subject;

    public Teacher(int employeeId, String employeeName, double salary, String subject) {
        super(employeeId, employeeName, salary); // Usage of super
        this.subject = subject;
    }

    public void teach() {
        System.out.println(getEmployeeName() + " is teaching " + subject + ".");
    }

    @Override
    public void conductResearch() {
        System.out.println(getEmployeeName() + " is publishing research papers in " + subject + ".");
    }

    @Override
    public double calculateSalary() {
        // Teachers get a 15% academic research allowance added to base salary
        return getSalary() * 1.15;
    }
}

// Multilevel Inheritance (Teacher -> VisitingTeacher)
class VisitingTeacher extends Teacher {
    private int hoursWorked;

    public VisitingTeacher(int employeeId, String employeeName, double hourlyRate, String subject, int hoursWorked) {
        super(employeeId, employeeName, hourlyRate, subject);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        // Salary calculated as hourly rate * hours worked
        return getSalary() * hoursWorked;
    }
}

// Hierarchical Inheritance Branch (Employee -> Admin)
class Admin extends Employee {
    private String department;

    public Admin(int employeeId, String employeeName, double salary, String department) {
        super(employeeId, employeeName, salary);
        this.department = department;
    }

    public void manageDepartment() {
        System.out.println(getEmployeeName() + " is managing operations for the " + department + " department.");
    }
}

public class Labsheet5Q20 {
    public static void main(String[] args) {
        // Teacher object (Single Inheritance + Interface)
        Teacher teacher = new Teacher(101, "Dr. Radhika Gupta", 60000, "Computer Science");

        // VisitingTeacher object (Multilevel Inheritance)
        VisitingTeacher visitingTeacher = new VisitingTeacher(102, "Prof. Amit Patel", 50, "Mathematics", 80);

        // Admin object (Hierarchical Inheritance Branch)
        Admin admin = new Admin(103, "Sunita Sharma", 45000, "Admissions");

        System.out.println("=== Full-Time Teacher Details ===");
        teacher.displayDetails();
        teacher.teach();
        teacher.conductResearch();
        System.out.println("Calculated Total Salary: Rs" + teacher.calculateSalary());

        System.out.println("\n=== Visiting Teacher Details ===");
        visitingTeacher.displayDetails();
        visitingTeacher.teach();
        System.out.println("Calculated Total Salary (" + 80 + " hrs): Rs" + visitingTeacher.calculateSalary());

        System.out.println("\n=== Admin Staff Details ===");
        admin.displayDetails();
        admin.manageDepartment();
        System.out.println("Calculated Total Salary: Rs" + admin.calculateSalary());
    }
}