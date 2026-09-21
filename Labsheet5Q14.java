class Employee {
    double baseSalary = 50000;

    public void calculateSalary() {
        System.out.println("Base Employee Salary: Rs" + baseSalary);
    }
}

class Manager extends Employee {
    double bonus = 15000;

    @Override
    public void calculateSalary() {
        double totalSalary = baseSalary + bonus;
        System.out.println("Manager Salary (Base + Bonus): Rs" + totalSalary);
    }
}

public class Labsheet5Q14 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Manager mgr = new Manager();

        System.out.print("Executing Parent method: ");
        emp.calculateSalary();

        System.out.print("Executing Overridden Child method: ");
        mgr.calculateSalary();
    }
}