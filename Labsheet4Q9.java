class Labsheet4Q9 {
    String brand;
    int RAM;
    static String os = "Windows";

    void display() {
        String b = brand;
        int r = RAM;
        System.out.println("Brand: " + b);
        System.out.println("RAM: " + r + " GB");
        System.out.println("OS: " + os);
    }

    public static void main(String[] args) {
        Labsheet4Q9 l = new Labsheet4Q9();
        l.brand = "Dell";
        l.RAM = 16;
        l.display();
    }
}
