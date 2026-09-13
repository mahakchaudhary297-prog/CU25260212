public class Labsheet2Q15 {
    public static void main(String[] args) {
        int number = 29;
        int temp = number;
        int count = 0;

        while (temp > 0) {
            count += (temp & 1);
            temp >>= 1;         
        }

        System.out.println("Number of set bits in " + number + " is: " + count);
    }
}
