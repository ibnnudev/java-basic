import java.util.Scanner;

public class Bank {
    static Scanner scanner = new Scanner(System.in);
    static double balance = 0;

    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            printMenu();
            int choice = getIntInput("Enter your choice (1-4): ");

            switch (choice) {
                case 1 -> showBalance();
                case 2 -> deposit();
                case 3 -> withdraw();
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
        }

        scanner.close();
    }

    static void printMenu() {
        System.out.println("********************************");
        System.out.println("BANKING APPLICATION");
        System.out.println("********************************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("********************************");
    }

    static int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    static double getDoubleInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.print("Please enter a valid amount: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    static void showBalance() {
        System.out.printf("Your current balance is: $%.2f%n", balance);
    }

    static void deposit() {
        double amount = getDoubleInput("Enter amount to deposit: ");
        if (amount > 0) {
            balance += amount;
            printTransaction("deposited", amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    static void withdraw() {
        double amount = getDoubleInput("Enter amount to withdraw: ");
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            printTransaction("withdrew", amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    static void printTransaction(String action, double amount) {
        System.out.printf("Successfully %s $%.2f%n", action, amount);
        System.out.printf("Current balance: $%.2f%n", balance);
    }
}