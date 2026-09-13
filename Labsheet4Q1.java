class Labsheet4Q1 {
    String name;
    int age;
    static int count;

    void display() {
        String localName = name;
        int localAge = age;
        int localCount = count;
        System.out.println("Name: " + localName);
        System.out.println("Age: " + localAge);
        System.out.println("Student Count: " + localCount);
    }
    
    public static void main(String[] args) {
        Labsheet4Q1 s1 = new Labsheet4Q1();
        s1.name = "Mahak";
        s1.age = 20;
        count++;
        s1.display();
    }
}
