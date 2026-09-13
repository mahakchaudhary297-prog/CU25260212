class Labsheet4Q22 {
    static int totalChecks;

    void checkArmstrong(int number) {
        int n = number;
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp = temp / 10;
        }
        totalChecks++;
        if (sum == n) {
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }
    }

    public static void main(String[] args) {
        Labsheet4Q22 a = new Labsheet4Q22();
        a.checkArmstrong(153);
        a.checkArmstrong(123);
        System.out.println("Total Checks: " + totalChecks);
    }
}
