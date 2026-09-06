public class SkipPerfectSquares {
    public static void main(String[] args) {
        System.out.println("Numbers 1 to 50 (excluding perfect squares):");

        for (int i = 1; i <= 50; i++) {
            double sqrt = Math.sqrt(i);
            if (sqrt == Math.floor(sqrt)) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}