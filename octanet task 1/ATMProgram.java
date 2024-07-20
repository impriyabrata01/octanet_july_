import java.util.Scanner;

public class ATMProgram {
    // Initialize balance to 0
    private static double balance = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Display menu
        System.out.println("Welcome to MyBank ATM!");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        // User input
        int choice;
        do {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdrawMoney();
                    break;
                case 3:
                    depositMoney();
                    break;
                case 4:
                    System.out.println("Thank you for using MyBank ATM visit again");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    break;
            }
        } while (choice != 4);
    }

    // Method to check account balance
    private static void checkBalance() {
        System.out.println("Your current balance: $" + balance);
    }

    // Method to withdraw money
    private static void withdrawMoney() {
        System.out.print("Enter amount to withdraw: $");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal canceled.");
        } else {
            balance -= amount;
            System.out.println("$" + amount + " has been withdrawn. Remaining balance: $" + balance);
        }
    }

    // Method to deposit money
    private static void depositMoney() {
        System.out.print("Enter amount to deposit: $");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
        } else {
            balance += amount;
            System.out.println("$" + amount + " has been deposited. New balance: $" + balance);
        }
    }
}
