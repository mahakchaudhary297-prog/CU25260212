class Labsheet4Q3 {
    double radius;
    static double PI = 3.14;

    void calculate() {
        double r = radius;
        double area = PI * r * r;
        double circumference = 2 * PI * r;
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }

    public static void main(String[] args) {
        Labsheet4Q3 c = new Labsheet4Q3();
        c.radius = 7;
        c.calculate();
    }
}
