class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting...");
    }

    public void stop() {
        System.out.println("Vehicle has stopped.");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Car is driving down the road.");
    }
}

class ElectricCar extends Car {
    public void chargeBattery() {
        System.out.println("Electric car is charging its battery...");
    }
}

public class Labsheet5Q9 {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        tesla.start();
        tesla.drive();
        tesla.chargeBattery();
        tesla.stop();
    }
}