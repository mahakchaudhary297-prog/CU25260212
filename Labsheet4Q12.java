class Labsheet4Q12 {
    int marks1;
    int marks2;
    int marks3;
    static String universityName = "COER University";

    void calculateAverage() {
        int m1 = marks1;
        int m2 = marks2;
        int m3 = marks3;
        double avg = (m1 + m2 + m3) / 3.0;
        System.out.println("University: " + universityName);
        System.out.println("Average Marks: " + avg);
    }

    public static void main(String[] args) {
        Labsheet4Q12 s = new Labsheet4Q12();
        s.marks1 = 80;
        s.marks2 = 70;
        s.marks3 = 90;
        s.calculateAverage();
    }
}
