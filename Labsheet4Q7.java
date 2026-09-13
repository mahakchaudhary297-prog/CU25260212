class Labsheet4Q7 {
    int accountNumber;
    double balance;
    static String bankName = "SBI";

    void deposit(double amount) {
        double depositAmount = amount;
        balance += depositAmount;
        System.out.println("Deposited: " + depositAmount);
        System.out.println("New Balance: " + balance);
    }

    public static void main(String[] args) {
        Labsheet4Q7 acc = new Labsheet4Q7();
        acc.accountNumber = 12345;
        acc.balance = 1000;
        acc.deposit(500);
    }
}
