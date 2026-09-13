import java.util.Scanner;

public class Labsheet1Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a five-digit number: ");
        int num = sc.nextInt();

        int last = num % 10;
        int first = num / 10000;

        if (first == last)
            System.out.println("First and Last digits are same");
        else
            System.out.println("First and Last digits are not same");
    }
}
