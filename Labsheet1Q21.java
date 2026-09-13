import java.util.Scanner;

public class Labsheet1Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three angles: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a + b + c == 180)
            System.out.println("Valid Triangle");
        else
            System.out.println("Not a Valid Triangle");
    }
}
