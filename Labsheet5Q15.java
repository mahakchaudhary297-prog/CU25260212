class Shape {
    public void calculateArea() {
        System.out.println("Area calculation not defined for general shape.");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.printf("Circle Area (radius = %.2f): %.2f%n", radius, area);
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        double area = length * width;
        System.out.println("Rectangle Area (" + length + " x " + width + "): " + area);
    }
}

public class Labsheet5Q15 {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        circle.calculateArea();
        rectangle.calculateArea();
    }
}