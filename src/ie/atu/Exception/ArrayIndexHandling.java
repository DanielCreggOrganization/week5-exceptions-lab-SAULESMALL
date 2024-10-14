package ie.atu.Exception;

import java.util.Scanner;

public class ArrayIndexHandling {
    public static void main(String[] args) {
        int[] temperatures = {15, 18, 20, 21, 19, 16, 17}; // Temperatures for each day of the week
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the day number (1-7): ");
            int day = scanner.nextInt() - 1; // Adjusting input for 0-based array

            try {
                System.out.println("The temperature for day " + (day + 1) + " is: " + temperatures[day] + "°C");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid day number! Please enter a number between 1 and 7.");
            }
        }
    }
}
