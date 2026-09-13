import java.util.Random;

public class Labsheet2Q29 {
    public static void main(String[] args) {
        Random random = new Random();
        int attempts = 0;

        while (true) {
            int num = random.nextInt(100) + 1;
            attempts++;
            System.out.println("Generated: " + num);
            if (num % 7 == 0 && num % 13 == 0) {
                System.out.println("Found number divisible by both 7 and 13 (" + num + ") on attempt " + attempts + "!");
                break;
            }
        }
    }
}
