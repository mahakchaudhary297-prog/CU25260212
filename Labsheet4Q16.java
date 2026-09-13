class Labsheet4Q16 {
    int a;
    int b;
    int c;
    static String type = "Triangle";

    void checkValidity() {
        int x = a;
        int y = b;
        int z = c;
        if (x + y > z && y + z > x && x + z > y) {
            System.out.println("Valid " + type);
        } else {
            System.out.println("Invalid " + type);
        }
    }

    public static void main(String[] args) {
        Labsheet4Q16 tri = new Labsheet4Q16();
        tri.a = 3;
        tri.b = 4;
        tri.c = 5;
        tri.checkValidity();
    }
}
