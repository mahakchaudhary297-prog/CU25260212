import java.util.Scanner;

public class Labsheet1Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        System.out.print("Enter logical operator (&, |): ");
        char op = sc.next().charAt(0);

        if (op == '&')
            System.out.println("Result: " + (a != 0 && b != 0));
        else if (op == '|')
            System.out.println("Result: " + (a != 0 || b != 0));
        else
            System.out.println("Invalid Operator");
    }
}
