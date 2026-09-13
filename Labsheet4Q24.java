class Labsheet4Q24 {
    static int seriesCount;

    void displayFibonacci(int terms) {
        int n = terms;
        int a = 0;
        int b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        seriesCount++;
        System.out.println("\nSeries Count: " + seriesCount);
    }

    public static void main(String[] args) {
        Labsheet4Q24 f = new Labsheet4Q24();
        f.displayFibonacci(10);
    }
}
