class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: Rs" + amount + " | New Balance: Rs" + balance);
        } else {
            System.out.println("Error: Deposit amount must be greater than 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be greater than 0.");
        } else if (amount > balance) {
            System.out.println("Error: Insufficient funds. Current balance: Rs" + balance);
        } else {
            balance -= amount;
            System.out.println("Successfully withdrew: Rs" + amount + " | Remaining Balance: Rs" + balance);
        }
    }
}

public class Labsheet5Q2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber("ACC-987654");
        account.setAccountHolder("Mahak");

        account.deposit(500.0);    
        account.deposit(-50.0);   
        account.withdraw(200.0);
        account.withdraw(400.0);  
    }
}