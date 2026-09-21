class Vehicle {
    public void start() {
        System.out.println("Vehicle ignition turned on.");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Car is driving on wheels.");
    }
}

interface Electric {
    void chargeBattery();
}

class ElectricCar extends Car implements Electric {
    @Override
    public void chargeBattery() {
        System.out.println("Electric car battery is fast-charging...");
    }
}

public class Labsheet5Q18 {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        tesla.start();         
        tesla.drive();         
        tesla.chargeBattery();
    }
}