public class MixedAdvanced {
    public static void main(String[] args) {
        int number = 16; 
        boolean isPowerOfFour = (number > 0) && ((number & (number - 1)) == 0) && ((number & 0xAAAAAAAA) == 0);
        System.out.println("Number: " + number);
        System.out.println("Is Power of 4? " + isPowerOfFour);
        int toggledNumber = number ^ (1 << 2);
        System.out.println("Number after toggling 3rd bit (bit index 2): " + toggledNumber);
        System.out.println("\nMultiplication Table for " + toggledNumber + ":");
        for (int i = 1; i <= 20; i++) {
            int product = toggledNumber * i;
            if (product % 48 == 0) {
                System.out.println("Reached product " + product + " (multiple of 48). Stopping loop via break.");
                break;
            }
            if (product % 6 == 0) {
                continue;
            }

            System.out.println(toggledNumber + " x " + i + " = " + product);
        }
    }
}