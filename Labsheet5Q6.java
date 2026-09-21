class Employee {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void displayManager() {
        System.out.println("Manager Name: " + getName());
        System.out.println("Salary: Rs" + getSalary());
        System.out.println("Department: " + getDepartment());
    }
}

public class Labsheet5Q6 {
    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.setName("Vikram Malhotra");
        mgr.setSalary(95000.0);
        mgr.setDepartment("Engineering");
        mgr.displayManager();
    }
}