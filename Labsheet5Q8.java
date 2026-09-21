class Person {
    String name;

    public void displayName() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int employeeId;

    public void displayEmployee() {
        displayName(); 
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    String department;

    public void displayManager() {
        displayEmployee(); 
        System.out.println("Department: " + department);
    }
}

public class Labsheet5Q8 {
    public static void main(String[] args) {
        Manager mgr = new Manager();
        
        mgr.name = "Muskan";  
        mgr.employeeId = 1008;       
        mgr.department = "IT Security";
        mgr.displayManager();
    }
}