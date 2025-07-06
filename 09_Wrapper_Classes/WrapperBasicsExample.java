public class WrapperBasicsExample {
    public static void main(String[] args) {
        int primitiveInt = 42;
        Integer wrapperInt = Integer.valueOf(primitiveInt);  // Boxing
        int unboxed = wrapperInt.intValue();                // Unboxing

        Double wrapperDouble = Double.valueOf("3.14");       // String to Wrapper
        Boolean wrapperBool = Boolean.valueOf("true");

        System.out.println("Boxed int: " + wrapperInt);
        System.out.println("Unboxed int: " + unboxed);
        System.out.println("Double: " + wrapperDouble);
        System.out.println("Boolean: " + wrapperBool);
    }
}
