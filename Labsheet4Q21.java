class Labsheet4Q21 {
    static int countChecks;

    void checkPalindrome(int number) {
        int n = number;
        int reversed = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp = temp / 10;
        }
        countChecks++;
        if (n == reversed) {
            System.out.println(n + " is a Palindrome");
        } else {
            System.out.println(n + " is not a Palindrome");
        }
    }

    public static void main(String[] args) {
        Labsheet4Q21 p = new Labsheet4Q21();
        p.checkPalindrome(121);
        p.checkPalindrome(123);
        System.out.println("Total Checks: " + countChecks);
    }
}
