package cedrickMariano;
import java.util.Scanner;
public class BankingSystem {
    // using "static" to make them accessible across classes and methods
    static Scanner scan = new Scanner(System.in);
    static double balance = 0;
    static boolean isContinue = true;

    // a method for checking the current balance
    public static void checkBalance(){
        System.out.printf("Your account balance is: %.2f\n", balance);
    }
    // a method for depositing money in the bank
    public static void bankDeposit(){
        System.out.print("Enter deposit amount (minimum ₱1): ");
        double deposit = scan.nextDouble();
        if (deposit < 1) {
            System.out.println("Invalid deposit! Please enter an amount greater than ₱0");
        }
        else if (deposit > 0){
            balance += deposit;
            System.out.printf("Successfully deposited ₱%.2f into your account!\n", deposit);
        }
        else {
            System.out.println("Invalid input! Please enter a valid number for the deposit");
        }
    }
    // a method for withdrawing certain amount of money
    public static void bankWithdrawal(){
        System.out.print("Amount to withdraw: ");
        double withdraw = scan.nextDouble();
        if (withdraw > 0 && withdraw <= balance) {
            balance -= withdraw;
            System.out.printf("Successfully withdrew ₱%.2f from your account!\n", withdraw);
        } else if (withdraw <= 0) {
            System.out.println("Transaction failed: Withdrawal amount must be greater than ₱0");
        } else
            System.out.printf("Transaction failed: Insufficient balance to withdraw ₱%.2f\n", withdraw);
    }
    // a method for exiting the program
    public static void exitBankingSystem(){
        System.out.println("Exiting the system...");
    }
    // a method for asking the user to continue or not
    public static void continueBankingSystem() {
        while (true) {
            System.out.print("Do you wish to continue? (Y/N): ");
            char answer = scan.next().charAt(0);
            if (answer == 'Y' || answer == 'y') {
                isContinue = true;
                break;
            } else if (answer == 'N' || answer == 'n') {
                exitBankingSystem();
                isContinue = false;
                break;
            } else {
                System.out.println("Invalid input! Please enter 'Y' for Yes or 'N' for No");
            }
        }
    }
    // this serves as the entry point of the program
    public static void main(String[] args){
        System.out.println("Welcome to Banking System");
        System.out.println("[1] Deposit");
        System.out.println("[2] Withdrawal");
        System.out.println("[3] Check Balance");
        System.out.println("[4] Exit");
        int choice;
        while (isContinue) {
            System.out.print("Choice: ");
            try {
                choice = scan.nextInt();
                if (choice == 1) {
                    bankDeposit();
                    continueBankingSystem();
                } else if (choice == 2) {
                    bankWithdrawal();
                    continueBankingSystem();
                } else if (choice == 3) {
                    checkBalance();
                    continueBankingSystem();
                } else if (choice == 4) {
                    exitBankingSystem();
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a number between 1 and 4");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scan.next(); // clear the invalid input
            }
        }
        scan.close();
    }
}
