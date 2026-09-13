class Labsheet4Q17 {
    String name;
    int marks;
    static int passingMarks = 40;

    void assignGrade() {
        String n = name;
        int m = marks;
        if (m >= passingMarks) {
            System.out.println(n + " has passed with marks: " + m);
        } else {
            System.out.println(n + " has failed with marks: " + m);
        }
    }

    public static void main(String[] args) {
        Labsheet4Q17 sg = new Labsheet4Q17();
        sg.name = "Anita";
        sg.marks = 55;
        sg.assignGrade();
    }
}
