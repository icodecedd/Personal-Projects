package cedrickMariano;
import java.util.Scanner; // java package used to prompt users to input data.

public class Calculator {

    public static void Operation(String operation) {
	// initialization of new Scanner
	Scanner scan = new Scanner(System.in);

	// prompts user to input the first number
        System.out.print("\nEnter Number 1: ");
        double numOne = scan.nextDouble();

	// prompts user to input the second number
        System.out.print("Enter Number 2: ");
        double numTwo = scan.nextDouble();
        
        double result = 0.0;

	// an if-else ladder for identifying which operation to use
        if (operation.equals("addition")) {
            result = numOne + numTwo;
            System.out.println("Addition: " + result);
        } else if (operation.equals("subtraction")) {
            result = numOne - numTwo;
            System.out.println("Subtraction: " + result);
        } else if (operation.equals("multiplication")) {
            result = numOne * numTwo;
            System.out.println("Multiplication: " + result);
        } else if (operation.equals("division")) {
            if (numTwo == 0) {
                System.out.println("Cannot divide by 0");
            } 
            else {
                result = numOne / numTwo;
                System.out.println("Division: " + result);
            }
        } else {
            System.out.println("Invalid operation");
        }
    }

    // a method for the exit calculator animation 
    public static void exitCalculator() {
        for (int count = 5; count > 0; count--) {
            System.out.println("Closing Calculator in [" + count + "]");
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

	// a header layout for the calculator simulator   
        System.out.println("───────────────────────────────");
        System.out.println("Welcome to Calculator Simulator");
        System.out.println("───────────────────────────────");
        System.out.println("Available Options:\n");
        System.out.println("[1] Addition");
        System.out.println("[2] Subtraction");
        System.out.println("[3] Multiplication");
        System.out.println("[4] Division");
        System.out.println("[5] Exit");

        int option = 0;

	// prompts the user to choose which option/operation to use
        while (option != 5) {
            System.out.print("Choose Option: ");
            option = scan.nextInt();
            switch (option) {
                case 1:
                    Operation("addition");
                    break;
                case 2:
                    Operation("subtraction");
                    break;
                case 3:
                    Operation("multiplication");
                    break;
                case 4:
                    Operation("division");
                    break;
                case 5:
                    exitCalculator();
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
        scan.close(); // close the scanner
    }
}
