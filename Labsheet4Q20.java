class Labsheet4Q20 {
    double balance;
    static String bankCode = "ICICI123";

    void withdraw(double amount) {
        double withdrawAmount = amount;
        if (withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.println("Withdrawn: " + withdrawAmount);
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String[] args) {
        Labsheet4Q20 acc = new Labsheet4Q20();
        acc.balance = 2000;
        acc.withdraw(1500);
        acc.withdraw(700);
    }
}
