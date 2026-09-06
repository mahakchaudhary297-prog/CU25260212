import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal amount (P): ");
        double principal = scanner.nextDouble();
        System.out.print("Enter annual Rate of interest (R in %): ");
        double rate = scanner.nextDouble();
        System.out.print("Enter Time period (T in years): ");
        double time = scanner.nextDouble();

        double amount = principal * Math.pow(1 + (rate / 100), time);
        double compoundInterest = amount - principal;

        System.out.printf("Total Amount: %.2f\n", amount);
        System.out.printf("Compound Interest: %.2f\n", compoundInterest);
            }
}