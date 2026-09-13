import java.util.Scanner;

public class Labsheet2Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number greater than 0: ");
        double num = scanner.nextDouble();

        int steps = 0;
        double current = num;

        while (current >= 1.0) {
            current /= 2;            steps++;
            System.out.printf("Step %d: %.4f\n", steps, current);
        }

        System.out.println("Total steps taken to reach < 1: " + steps);

        scanner.close();
    }
}
