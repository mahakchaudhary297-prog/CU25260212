public class Labsheet2Q24 {
    public static void main(String[] args) {
        int[] numbers = {34, 12, 89, 5, 67, 91, 23};

        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nMaximum Value: " + max);
        System.out.println("Minimum Value: " + min);
    }
}
