import java.util.Scanner;

public class Labsheet1Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a > b) {
            if (a > c)
                System.out.println("Largest: " + a);
            else
                System.out.println("Largest: " + c);
        } else {
            if (b > c)
                System.out.println("Largest: " + b);
            else
                System.out.println("Largest: " + c);
        }
    }
}
