import java.util.Scanner;

public class RainfallAccumulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalRainfall = 0.0;

        for (int day = 1; day <= 7; day++) {
            System.out.print("Enter rainfall for Day " + day + " (in mm): ");
            double dailyRain = scanner.nextDouble();
            totalRainfall += dailyRain; // Compound addition operator
        }

        System.out.printf("Total rainfall for 7 days: %.2f mm\n", totalRainfall);

        scanner.close();
    }
}