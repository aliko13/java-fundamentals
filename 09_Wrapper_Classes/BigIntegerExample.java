import java.math.BigInteger;

public class BigIntegerExample {
    public static void main(String[] args) {
        BigInteger big1 = new BigInteger("123456789012345678901234567890");
        BigInteger big2 = new BigInteger("987654321098765432109876543210");

        BigInteger sum = big1.add(big2);
        BigInteger prod = big1.multiply(big2);
        BigInteger gcd = big1.gcd(big2);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + prod);
        System.out.println("GCD: " + gcd);
    }
}
