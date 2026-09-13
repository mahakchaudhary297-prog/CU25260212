public class Labsheet2Q17 {
    public static void main(String[] args) {
        int number = 10; 
        int shift = 2;
        int rotated = (number << shift) | (number >>> (Integer.SIZE - shift));

        System.out.println("Original Number: " + number);
        System.out.println("Left Rotated by 2 positions: " + rotated);
    }
}
