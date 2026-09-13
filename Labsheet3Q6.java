import java.util.Scanner;

public class Labsheet3Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] source = new int[5];
        int[] copy = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < source.length; i++) {
            source[i] = sc.nextInt();
        }

        for (int i = 0; i < source.length; i++) {
            copy[i] = source[i];
        }

        System.out.println("Copied array:");
        for (int num : copy) {
            System.out.print(num + " ");
        }
    }
}
