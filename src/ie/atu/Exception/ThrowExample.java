package ie.atu.Exception;

public class ThrowExample {
    public static void main(String[] args) {
        try {
            processData(); // May throw Exception
        } catch (Exception e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
    }

    public static void processData() throws Exception {
        throw new Exception("An error occurred while processing data.");
    }
}
