public class BasicExceptionExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block always runs.");
        }
    }

    public static int divide(int a, int b) {
        return a / b; // Can throw ArithmeticException
    }
}
