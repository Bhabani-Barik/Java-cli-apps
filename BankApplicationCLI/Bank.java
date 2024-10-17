// Manages accounts and transactions

public class Bank {
    private Account[] accounts;
    private int accountCount;

    public Bank(int maxAccounts) {
        accounts = new Account[maxAccounts];
        accountCount = 0;
    }

    public void createAccount(String name, String accountNumber, double initialDeposit) {
        if (accountCount < accounts.length) {
            accounts[accountCount] = new Account(name, accountNumber, initialDeposit);
            System.out.println("Account created successfully for " + name);
            accountCount++;
        } else {
            System.out.println("Cannot create account: maximum accounts limit reached.");
        }
    }

    public Account getAccount(String accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        return null; // Account not found
    }
    
}