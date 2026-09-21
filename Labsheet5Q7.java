class Animal {
    public void eat() {
        System.out.println("Animal eats food.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks loud.");
    }
}

class Puppy extends Dog {
    public void play() {
        System.out.println("Puppy plays with a ball.");
    }
}

public class Labsheet5Q7 {
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy();
        myPuppy.eat();
        myPuppy.bark();
        myPuppy.play();
    }
}