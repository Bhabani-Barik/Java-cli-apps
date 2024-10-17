//Represents command-line interface for the banking application

import java.util.Scanner;

public class BankingCLI {
    private static Bank bank = new Bank(100); // Allows up to 100 accounts

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;

        while(true){
            System.out.println("Enter command (create, deposit, withdraw, view, exit):");
            command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "create":
                    createAccount(scanner);
                    break;
                case "deposit":
                    deposit(scanner);
                    break;
                case "withdraw":
                    withdraw(scanner);
                    break;
                case "view":
                    viewAccount(scanner);
                    break;
                case "exit":
                    System.out.println("Exiting the application.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Unknown command. Please try again.");
            }
        }
    }
    private static void createAccount(Scanner scanner) {
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter initial deposit: ");
        double initialDeposit = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        bank.createAccount(name, accountNumber, initialDeposit);
    }

    private static void deposit(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        Account account = bank.getAccount(accountNumber);
        if (account != null) {
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void withdraw(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        Account account = bank.getAccount(accountNumber);
        if (account != null) {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void viewAccount(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        Account account = bank.getAccount(accountNumber);
        if (account != null) {
            System.out.println("Account Holder: " + account.getOwner());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
}