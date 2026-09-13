class Labsheet4Q6 {
    String brand;
    double mileage;
    static int wheels = 4;

    void display() {
        String br = brand;
        double m = mileage;
        System.out.println("Brand: " + br);
        System.out.println("Mileage: " + m);
        System.out.println("Wheels: " + wheels);
    }

    public static void main(String[] args) {
        Labsheet4Q6 car = new Labsheet4Q6();
        car.brand = "Toyota";
        car.mileage = 15.5;
        car.display();
    }
}
