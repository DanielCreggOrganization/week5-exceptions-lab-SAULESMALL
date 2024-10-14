package ie.atu.Exception;

public class UncheckedExceptionsFix {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String text = null;
        if (text != null) {
            System.out.println(text.length());
        } else {
            System.out.println("Text is null");
        }

        int[] numbers = {1, 2, 3};
        
        if (numbers.length > 5) {
            System.out.println(numbers[5]);
        } else {
            System.out.println("Invalid index");
        }
    }
}