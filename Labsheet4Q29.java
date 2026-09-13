class Labsheet4Q29 {
    String name;
    double salary;
    static String organization = "Hindustan Corp";

    void compareSalary(Labsheet4Q29 other) {
        String n1 = name;
        double s1 = salary;
        String n2 = other.name;
        double s2 = other.salary;
        System.out.println("Organization: " + organization);
        if (s1 > s2) {
            System.out.println(n1 + " has a higher salary than " + n2);
        } else if (s1 < s2) {
            System.out.println(n2 + " has a higher salary than " + n1);
        } else {
            System.out.println(n1 + " and " + n2 + " have equal salaries");
        }
    }

    public static void main(String[] args) {
        Labsheet4Q29 e1 = new Labsheet4Q29();
        e1.name = "Muskan";
        e1.salary = 50000;
        Labsheet4Q29 e2 = new Labsheet4Q29();
        e2.name = "Ravi";
        e2.salary = 60000;
        e1.compareSalary(e2);
    }
}
