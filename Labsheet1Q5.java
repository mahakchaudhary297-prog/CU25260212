import java.util.Scanner;

public class Labsheet1Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a floating-point number: ");
        float f = sc.nextFloat();

        int i = (int) f;
        System.out.println("Original float: " + f);
        System.out.println("Converted integer: " + i);
    }
}
