import java.util.Scanner;

public class UnaryNegation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        int negated = -num;

        System.out.println("Original value: " + num);
        System.out.println("Negated value: " + negated);

    }
}