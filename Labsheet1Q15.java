import java.util.Scanner;

public class Labsheet1Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int original = num;
        int d1 = num % 10;
        num /= 10;
        int d2 = num % 10;
        num /= 10;
        int d3 = num;

        int sum = (d1*d1*d1) + (d2*d2*d2) + (d3*d3*d3);

        if (sum == original)
            System.out.println(original + " is an Armstrong number");
        else
            System.out.println(original + " is not an Armstrong number");
    }
}
