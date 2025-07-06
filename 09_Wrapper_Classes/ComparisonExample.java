public class ComparisonExample {
    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;
        Integer c = 128;
        Integer d = 128;

        System.out.println("a == b: " + (a == b));  // true (cached range)
        System.out.println("c == d: " + (c == d));  // false (new objects)
        System.out.println("c.equals(d): " + c.equals(d));  // true

        Double x = 10.5;
        Double y = 10.5;
        System.out.println("x.equals(y): " + x.equals(y));
    }
}
