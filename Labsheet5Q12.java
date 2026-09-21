class Employee {
    String employeeName;
    int employeeId;

    public void displayEmployee() {
        System.out.println("ID: " + employeeId + " | Name: " + employeeName);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    public void writeCode() {
        System.out.println(employeeName + " is writing code in " + programmingLanguage + ".");
    }
}

class Manager extends Employee {
    String department;

    public void conductMeeting() {
        System.out.println(employeeName + " is conducting a meeting for the " + department + " department.");
    }
}

public class Labsheet5Q12 {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.employeeId = 101;
        dev.employeeName = "Rohan Verma";
        dev.programmingLanguage = "Java";

        Manager mgr = new Manager();
        mgr.employeeId = 102;
        mgr.employeeName = "Priya Mehta";
        mgr.department = "IT Operations";

        System.out.println("--- Developer Object ---");
        dev.displayEmployee(); 
        dev.writeCode();       

        System.out.println("\n--- Manager Object ---");
        mgr.displayEmployee(); 
        mgr.conductMeeting();  
    }
}