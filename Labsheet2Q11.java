import java.util.Scanner;

public class Labsheet2Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Theory marks (%): ");
        double theory = scanner.nextDouble();

        System.out.print("Enter Practical marks (%): ");
        double practical = scanner.nextDouble();

        double overall = (theory + practical) / 2.0;

        boolean passes = (theory >= 40 && practical >= 50) || (overall >= 50);

        if (passes) {
            System.out.println("Result: PASSED (Overall: " + overall + "%)");
        } else {
            System.out.println("Result: FAILED (Overall: " + overall + "%)");
        }

        scanner.close();
    }
}
