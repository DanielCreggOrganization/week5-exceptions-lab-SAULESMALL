package ie.atu.Exception;

import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second number: ");
            int num2 = scanner.nextInt();

            try {
                int result = num1 / num2;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero!");
            } finally {
                System.out.println("Calculation completed.");
            }
        }
    }
}
