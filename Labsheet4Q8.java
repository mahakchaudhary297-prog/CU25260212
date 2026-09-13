class Labsheet4Q8 {
    String color;
    String type;
    static String manufacturer = "Reynolds";

    void display() {
        String c = color;
        String t = type;
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Color: " + c);
        System.out.println("Type: " + t);
    }

    public static void main(String[] args) {
        Labsheet4Q8 pen = new Labsheet4Q8();
        pen.color = "Blue";
        pen.type = "Ballpoint";
        pen.display();
    }
}
