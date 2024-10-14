package ie.atu.Exception;

import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionHandling {
    public static void main(String[] args) {
        try {
            try (FileReader reader = new FileReader("example.txt")) {
            }
            System.out.println("File opened successfully");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}