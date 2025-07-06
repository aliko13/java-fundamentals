# Java Wrapper Classes

Wrapper classes in Java allow primitive types to behave like objects. This is useful for working with collections, generics, parsing, nullability, and more.

---

## Files Overview

| File                            | Description                                        |
|---------------------------------|----------------------------------------------------|
| WrapperBasicsExample.java       | Boxing/unboxing basics                            |
| ParsingExample.java             | `parseXxx()` vs `valueOf()`                       |
| ComparisonExample.java          | Wrapper caching and comparison                    |
| NullHandlingWithWrappers.java   | Auto-unboxing pitfalls                            |
| BigDecimalExample.java          | High-precision decimal arithmetic                 |
| BigIntegerExample.java          | Operations on arbitrarily large integers          |

---

## Primitive to Wrapper Map

| Primitive | Wrapper Class |
|-----------|---------------|
| `int`     | `Integer`     |
| `double`  | `Double`      |
| `boolean` | `Boolean`     |
| `char`    | `Character`   |
| `long`    | `Long`        |
| `float`   | `Float`       |
| `byte`    | `Byte`        |
| `short`   | `Short`       |

---

## BigDecimal vs double

| `double`                              | `BigDecimal`                                    |
|---------------------------------------|-------------------------------------------------|
| Faster, less precise                  | Slower, high-precision                          |
| Imprecise in financial calculations   | Perfect for money calculations (e.g. rounding)  |
| Susceptible to rounding errors        | Controlled rounding using `RoundingMode`        |

```java
BigDecimal price = new BigDecimal("10.25");
BigDecimal tax = new BigDecimal("0.08");
BigDecimal total = price.multiply(tax).setScale(2, RoundingMode.HALF_UP);
```

---

##  BigInteger
Used for values larger than Long.MAX_VALUE

Common in cryptography, factorials, numeric simulations

```java
BigInteger big = new BigInteger("98765432109876543210987654321");
BigInteger result = big.pow(10);
```

---

## How to Run

```bash
javac WrapperBasicsExample.java
java WrapperBasicsExample

javac ParsingExample.java
java ParsingExample

javac ComparisonExample.java
java ComparisonExample

javac NullHandlingWithWrappers.java
java NullHandlingWithWrappers

javac BigDecimalExample.java
java BigDecimalExample

javac BigIntegerExample.java
java BigIntegerExample

