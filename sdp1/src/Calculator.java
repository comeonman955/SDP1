import java.util.Scanner;

public class Calculator {


    public int add(int a, int b) {
        return a + b;
    }


    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Calculator calculator = new Calculator();


        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();


        System.out.println("Choose an operation: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");


        int choice = scanner.nextInt();


        if (choice == 1) {
            int result = calculator.add(num1, num2);
            System.out.println("The result of addition is: " + result);
        } else if (choice == 2) {
            int result = calculator.subtract(num1, num2);
            System.out.println("The result of subtraction is: " + result);
        } else {
            System.out.println("Invalid choice! Please select 1 or 2.");
        }


        scanner.close();
    }
}
