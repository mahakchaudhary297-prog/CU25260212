class Labsheet4Q23 {
    static int totalPrimeChecks;

    void checkPrime(int number) {
        int n = number;
        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        totalPrimeChecks++;
        if (isPrime) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is not Prime");
        }
    }

    public static void main(String[] args) {
        Labsheet4Q23 pc = new Labsheet4Q23();
        pc.checkPrime(7);
        pc.checkPrime(10);
        System.out.println("Total Prime Checks: " + totalPrimeChecks);
    }
}
