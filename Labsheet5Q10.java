class Animal {
    public void eat() {
        System.out.println("This animal is eating food.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog says: Woof!");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("Cat says: Meow!");
    }
}

public class Labsheet5Q10 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("--- Dog Object ---");
        dog.eat();  
        dog.bark();

        System.out.println("\n--- Cat Object ---");
        cat.eat();  
        cat.meow();
    }
}