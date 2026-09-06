public class SmallestOfFour {
    public static void main(String[] args) {
        int a = 25, b = 12, c = 48, d = 7;

        int smallest = (a < b && a < c && a < d) ? a :
                       (b < c && b < d) ? b :
                       (c < d) ? c : d;

        System.out.println("Numbers: " + a + ", " + b + ", " + c + ", " + d);
        System.out.println("Smallest number is: " + smallest);
    }
}