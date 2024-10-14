package ie.atu.Exception;

public class NullPointerException {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        String text = null;
        System.out.println(text.length());
    }
}
