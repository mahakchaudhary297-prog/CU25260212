import java.util.Scanner;

public class Labsheet2Q23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int original = number;
        int reversed = 0;
        int temp = Math.abs(number);
        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        if (number >= 0 && original == reversed) {
            System.out.println(number + " is a Palindrome.");
        } else {
            System.out.println(number + " is NOT a Palindrome.");
        }

        scanner.close();
    }
}
