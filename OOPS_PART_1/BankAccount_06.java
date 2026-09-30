package OOPS_PART_1;

public class BankAccount_06 {
    int accountNumber;
    String accountHolder;
    double balance;

    public BankAccount_06(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    double deposit(double amount) {
        balance += amount;
        return balance;
    }

    double withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return amount;
        } else {
            System.out.println("Insufficient funds for withdrawal of: " + amount);
            return 0;
        }
    }

    void displayBalance() {
        System.out.println("Total balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount_06 ba = new BankAccount_06(10006, "Aman Sai", 450000);
        ba.displayBalance();
        System.out.println("Deposited: " + ba.deposit(900));
        System.out.println("Withdrawn: " + ba.withdraw(80000));
        ba.displayBalance();
    }
}
