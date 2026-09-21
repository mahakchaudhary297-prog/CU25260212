class Student {
    private String name;
    private int rollNo;
    private double marks;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + getName());
        System.out.println("Roll No: " + getRollNo());
        System.out.println("Marks: " + getMarks());
    }
}

public class Labsheet5Q1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        
        // Setting values using setters
        s1.setName("Mahak");
        s1.setRollNo(101);
        s1.setMarks(88.5);

        // Displaying details using displayDetails and individual getters
        s1.displayDetails();
    }
}
