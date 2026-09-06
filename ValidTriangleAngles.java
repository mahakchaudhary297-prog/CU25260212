import java.util.Scanner;

public class ValidTriangleAngles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter angle 1: ");
        double a1 = scanner.nextDouble();
        System.out.print("Enter angle 2: ");
        double a2 = scanner.nextDouble();
        System.out.print("Enter angle 3: ");
        double a3 = scanner.nextDouble();

        if (a1 > 0 && a2 > 0 && a3 > 0 && (a1 + a2 + a3 == 180)) {
            System.out.println("Valid Triangle: The angles form a valid triangle.");
        } else {
            System.out.println("Invalid Triangle: Angles must be positive and sum up to exactly 180 degrees.");
        }

    }
}