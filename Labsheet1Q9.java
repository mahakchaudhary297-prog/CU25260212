import java.util.Scanner;

public class Labsheet1Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        int s1 = sc.nextInt();
        System.out.print("Enter marks of Subject 2: ");
        int s2 = sc.nextInt();
        System.out.print("Enter marks of Subject 3: ");
        int s3 = sc.nextInt();

        int total = s1 + s2 + s3;
        float percentage = total / 3.0f;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (s1 >= 40 && s2 >= 40 && s3 >= 40 && percentage >= 40)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
    }
}
