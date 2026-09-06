import java.util.Scanner;

public class FactorsDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        System.out.println("Factors of " + number + " are:");

        if (number <= 0) {
            System.out.println("Please enter a number greater than 0.");
        } else {
            int i = 1;
            do {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
                i++;
            } while (i <= number);
            System.out.println();
        }

        scanner.close();
    }
}