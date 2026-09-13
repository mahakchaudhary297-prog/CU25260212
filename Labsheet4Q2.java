class Labsheet4Q2 {
    int length;
    int breadth;
    static String shapeName = "Rectangle";

    void area() {
        int l = length;
        int b = breadth;
        int area = l * b;
        System.out.println("Shape: " + shapeName);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        Labsheet4Q2 r = new Labsheet4Q2();
        r.length = 10;
        r.breadth = 5;
        r.area();
    }
}
