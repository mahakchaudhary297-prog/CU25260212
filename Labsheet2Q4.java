import java.util.Scanner;

public class Labsheet2Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int visitors = 0;

        System.out.print("Enter initial number of visitors currently inside: ");
        visitors = scanner.nextInt();

        System.out.print("How many new visitors entered? ");
        int entering = scanner.nextInt();
        for (int i = 0; i < entering; i++) {
            System.out.println("Visitor entered. Current count before update: " + visitors++);
        }

        System.out.print("How many visitors left? ");
        int leaving = scanner.nextInt();
        for (int i = 0; i < leaving; i++) 
            System.out.println("Visitor left. Updated count immediately: " + --visitors);
        }

        System.out.println("Final store count: " + visitors);
           }
}
