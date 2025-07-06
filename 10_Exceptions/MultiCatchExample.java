public class MultiCatchExample {
    public static void main(String[] args) {
        String number = null;

        try {
            int length = number.length();  // NullPointerException
            int parsed = Integer.parseInt("abc");  // NumberFormatException
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Caught exception: " + e.getClass().getSimpleName());
        }
    }
}
