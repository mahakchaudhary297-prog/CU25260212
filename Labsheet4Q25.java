class Labsheet4Q25 {
    static int totalCalls;

    void factorial(int number) {
        int n = number;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        totalCalls++;
        System.out.println("Factorial of " + n + " is " + fact);
    }

    public static void main(String[] args) {
        Labsheet4Q25 f = new Labsheet4Q25();
        f.factorial(5);
        f.factorial(7);
        System.out.println("Total Calls: " + totalCalls);
    }
}
