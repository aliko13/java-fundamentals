# Java Optional

Java `Optional<T>` is a container object that may or may not contain a non-null value.
It helps avoid `NullPointerException` by encouraging safe, expressive null handling.

---

## Files Overview

| File                          | Concepts Covered                                |
|-------------------------------|--------------------------------------------------|
| OptionalBasicExample.java     | Creating `Optional`, checking presence          |
| OptionalOrElseExample.java    | `orElse`, `orElseGet`, `orElseThrow`            |
| OptionalMapFlatMapExample.java| Nested optionals, `map`, `flatMap` usage        |
| OptionalIfPresentExample.java | `ifPresent`, conditional execution              |

---

## Why Use Optional?

- Prevent null pointer exceptions (`NPE`)
- Improve code readability and intent
- Avoid complex nested `if` checks for null
- Functional-style chaining (e.g., `map`, `flatMap`)

---

## Common Methods

| Method         | Purpose                                       |
|----------------|-----------------------------------------------|
| `Optional.of()` | Wrap non-null values (throws if null)       |
| `Optional.ofNullable()` | Wrap possibly-null values           |
| `isPresent()`  | Check if a value is present                   |
| `ifPresent()`  | Run code if value is present                  |
| `orElse()`     | Provide default if empty                      |
| `orElseGet()`  | Provide lazy-loaded default                   |
| `orElseThrow()`| Throw exception if empty                      |
| `map()`        | Transform value                               |
| `flatMap()`    | Transform nested optionals                    |

---

## How to Run

```bash
javac OptionalBasicExample.java
java OptionalBasicExample

javac OptionalOrElseExample.java
java OptionalOrElseExample

javac OptionalMapFlatMapExample.java
java OptionalMapFlatMapExample

javac OptionalIfPresentExample.java
java OptionalIfPresentExample
