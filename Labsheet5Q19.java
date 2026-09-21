class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void displayEmployee() {
        System.out.println("ID: " + employeeId + " | Name: " + name);
    }
}

interface Programmer {
    void writeCode();
}

interface Researcher {
    void conductResearch();
}

class Developer extends Employee implements Programmer, Researcher {
    public Developer(String name, int employeeId) {
        super(name, employeeId);
    }

    @Override
    public void writeCode() {
        System.out.println(getName() + " is writing algorithmic code.");
    }

    @Override
    public void conductResearch() {
        System.out.println(getName() + " is conducting technical feasibility research.");
    }
}

public class Labsheet5Q19 {
    public static void main(String[] args) {
        Developer dev = new Developer("Siddharth Roy", 301);
        
        dev.displayEmployee();
        dev.writeCode();
        dev.conductResearch();
    }
}