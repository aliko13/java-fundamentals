public class NullHandlingWithWrappers {
    public static void main(String[] args) {
        Integer number = null;

        try {
            int value = number;  // throws NullPointerException (auto-unboxing)
            System.out.println("Value: " + value);
        } catch (NullPointerException e) {
            System.out.println("Caught NPE when unboxing null Integer");
        }

        // Safe fallback
        int safeValue = number != null ? number : 0;
        System.out.println("Safe value: " + safeValue);
    }
}
