class Labsheet4Q5 {
    String title;
    String author;
    double price;
    static String publisher = "Pearson";

    void display() {
        String t = title;
        String a = author;
        double p = price;
        System.out.println("Publisher: " + publisher);
        System.out.println("Title: " + t);
        System.out.println("Author: " + a);
        System.out.println("Price: " + p);
    }

    public static void main(String[] args) {
        Labsheet4Q5 b = new Labsheet4Q5();
        b.title = "Java Basics";
        b.author = "John Doe";
        b.price = 299.99;
        b.display();
    }
}
