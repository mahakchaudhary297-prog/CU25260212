class Person {
    String name;

    public void displayName() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    String course;

    public void study() {
        System.out.println(name + " is studying " + course + ".");
    }
}

class Teacher extends Person {
    String subject;

    public void teach() {
        System.out.println(name + " is teaching " + subject + ".");
    }
}

public class Labsheet5Q11 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Aarav Sharma";
        student.course = "Computer Science";

        Teacher teacher = new Teacher();
        teacher.name = "Dr. Radhika Gupta";
        teacher.subject = "Data Structures";

        System.out.println("--- Student Details ---");
        student.displayName();
        student.study();

        System.out.println("\n--- Teacher Details ---");
        teacher.displayName();
        teacher.teach();
    }
}