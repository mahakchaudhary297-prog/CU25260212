class Labsheet4Q19 {
    int id;
    String name;
    double price;
    static double discountRate = 0.1;

    void calculateFinalPrice() {
        int pid = id;
        String pname = name;
        double p = price;
        double discount = p * discountRate;
        double finalPrice = p - discount;
        System.out.println("Product ID: " + pid);
        System.out.println("Product Name: " + pname);
        System.out.println("Original Price: " + p);
        System.out.println("Final Price after discount: " + finalPrice);
    }

    public static void main(String[] args) {
        Labsheet4Q19 prod = new Labsheet4Q19();
        prod.id = 101;
        prod.name = "Laptop";
        prod.price = 50000;
        prod.calculateFinalPrice();
    }
}
