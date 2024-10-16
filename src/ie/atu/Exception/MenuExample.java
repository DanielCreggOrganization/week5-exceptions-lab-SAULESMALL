package ie.atu.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;
public class MenuExample {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            boolean validInput = false;


            while (!validInput) {
                try{
                    System.out.println("Enter the frist integer: ");
                    int num1 = scanner.nextInt();

                    System.out.println("Enter the second integer: ");
                    int num2 = scanner.nextInt();

                    int result = num1 / num2;
                    System.out.println("Result:" + result);
                    validInput = true;
                }catch (InputMismatchException e){
                    System.out.println("Invalid input. Please enter integers only.");
                    scanner.next();
                }catch (ArithmeticException e){
                    System.out.println("Cannot divide by zero. Please try again.");
                }
            }
        }
    }
}