public class Account {
    private double balance;

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        if (amount > 0.0) {
            balance += amount;
        }
    }

    public void debit(double amount) {
        if (amount > 0.0 && amount <= balance) {
            balance -= amount;
            System.out.println("Debit of " + amount + " successful. Remaining balance: " + balance);
        } else {
            System.out.println("Debit amount exceeded account balance. Balance remains unchanged.");
        }
    }
}
