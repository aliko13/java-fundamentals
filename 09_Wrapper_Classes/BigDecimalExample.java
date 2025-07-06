import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExample {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("10.235");
        BigDecimal b = new BigDecimal("2.10");

        BigDecimal sum = a.add(b);
        BigDecimal diff = a.subtract(b);
        BigDecimal prod = a.multiply(b);
        BigDecimal div = a.divide(b, 3, RoundingMode.HALF_UP);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Division: " + div);
    }
}
