# Java Utility Classes

Java provides several core utility classes in the `java.util`, `java.util.Objects`, `java.util.Arrays`, `java.util.Collections`, `java.lang.Math`, and `java.lang.String` packages. These help simplify everyday tasks like data manipulation, validation, formatting, and generation.

---

## Files Overview

| File                           | Utility Class          | Purpose                                 |
|--------------------------------|------------------------|-----------------------------------------|
| ObjectsUtilityExample.java     | `Objects`              | Null checks, equals, defaults           |
| ArraysUtilityExample.java      | `Arrays`               | Sort, fill, search, toString            |
| MathUtilityExample.java        | `Math`                 | Rounding, power, square root, abs       |
| UUIDExample.java               | `UUID`                 | Generate random unique identifiers      |
| CollectionsUtilityExample.java | `Collections`          | Sort, reverse, shuffle, frequency       |
| StringUtilityExample.java      | `String`, `StringBuilder` | Manipulations, joining, trimming     |

---

## Key Concepts

### `Objects`
- `Objects.equals(a, b)` – null-safe comparison
- `Objects.requireNonNull(obj)` – throws NPE if null
- `Objects.toString(obj, default)` – fallback default string

### `Arrays`
- Sort, fill, binarySearch, readable printout via `Arrays.toString()`

### `Math`
- `abs()`, `round()`, `ceil()`, `floor()`, `random()`, `pow()`, `sqrt()`

### `UUID`
- `UUID.randomUUID()` – Generate random globally unique IDs

### `Collections`
- `sort()`, `reverse()`, `shuffle()`, `frequency()` for lists

### `String` + `StringBuilder`
- `trim()`, `substring()`, `toUpperCase()`, `replace()`, `startsWith()`
- `split()`, `join()`, plus building strings efficiently using `StringBuilder`

---

## How to Run

```bash
javac ObjectsUtilityExample.java
java ObjectsUtilityExample

javac ArraysUtilityExample.java
java ArraysUtilityExample

javac MathUtilityExample.java
java MathUtilityExample

javac UUIDExample.java
java UUIDExample

javac CollectionsUtilityExample.java
java CollectionsUtilityExample

javac StringUtilityExample.java
java StringUtilityExample
