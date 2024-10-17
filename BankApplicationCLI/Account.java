//Represents a bank account

public class Account {
    private String name;
    private String accountNumber;
    private double balance;


    public Account(String name, String accountNumber, double initialDeposit){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount + ". New balance: " + balance);
    }

    public void withdraw(double amount) {
        if ( amount > balance) {
            System.out.println("Insufficient Balance.");
        } else {
            balance = balance-amount;
            System.out.println("Withdrew: " + amount + ". New balance: " + balance);
        }
    }

    public double getBalance() {
            return balance;
    }

    public String getOwner() {
            return name;
    }
    
    public String getAccountNumber() {
            return accountNumber;
    }
}
