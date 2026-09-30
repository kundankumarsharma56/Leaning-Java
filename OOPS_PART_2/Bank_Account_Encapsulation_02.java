package OOPS_PART_2;

public class Bank_Account_Encapsulation_02 {
    private final int accountNumber;
    private String accountHolder;
    private double balance;

    public Bank_Account_Encapsulation_02(int accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        }
    }

    public int getAccountNumber() {
        return accountNumber;
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

    public double depositAmount(double deposit_Amount) {
        if (deposit_Amount > 0) {
            this.balance += deposit_Amount;
        }
        return this.balance;
    }

    public double withdrawalAmount(double withdrawal_Amount) {
        if (withdrawal_Amount > 0 && withdrawal_Amount <= this.balance) {
            this.balance -= withdrawal_Amount;
        }
        return this.balance;
    }

    public void displayAccountDetails() {
        System.out.println("--- Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
        System.out.println();
    }

    public static void main(String[] args) {
        Bank_Account_Encapsulation_02 bankAccount = new Bank_Account_Encapsulation_02(1010, "Aman", 1000.0);
        bankAccount.displayAccountDetails();

        bankAccount.depositAmount(500);
        bankAccount.withdrawalAmount(200);

        bankAccount.displayAccountDetails();
    }
}
