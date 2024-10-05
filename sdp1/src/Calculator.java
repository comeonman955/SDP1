import java.util.Scanner;

public class Calculator {

    private Operation operation; // Dependency on Operation interface

    public Calculator(Operation operation) {
        this.operation = operation;
    }

    public int executeOperation(int a, int b) {
        return operation.perform(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Display options to the user
        System.out.println("Choose an operation: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        // Get the user's choice
        int choice = scanner.nextInt();

        Operation operation = null;

        // Create a corresponding operation object based on user input
        switch (choice) {
            case 1:
                operation = new Addition();
                break;
            case 2:
                operation = new Subtraction();
                break;
            case 3:
                operation = new Multiplication();
                break;
            case 4:
                operation = new Division();
                break;
            default:
                System.out.println("Invalid choice! Please select between 1 and 4.");
                System.exit(0);
        }

        // Perform the chosen operation
        Calculator calculator = new Calculator(operation);
        int result = calculator.executeOperation(num1, num2);
        System.out.println("The result is: " + result);

        // Close the scanner object
        scanner.close();
    }
}

