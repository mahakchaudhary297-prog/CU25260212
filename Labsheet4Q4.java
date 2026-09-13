class Labsheet4Q4 {
    int empId;
    double salary;
    static String companyName = "TechCorp";

    void display() {
        int id = empId;
        double sal = salary;
        System.out.println("Company: " + companyName);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + sal);
    }

    public static void main(String[] args) {
        Labsheet4Q4 e = new Labsheet4Q4();
        e.empId = 101;
        e.salary = 50000;
        e.display();
    }
}
