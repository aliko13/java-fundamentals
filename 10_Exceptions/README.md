# Java Exception Handling

Exception handling allows programs to recover gracefully from runtime errors. Java divides exceptions into:

- ✅ **Checked Exceptions**: must be declared or handled (e.g., `IOException`)
- ❌ **Unchecked Exceptions**: runtime exceptions (e.g., `NullPointerException`)

---

## Files Overview

| File                          | Purpose                                             |
|-------------------------------|-----------------------------------------------------|
| BasicExceptionExample.java    | Try-catch-finally example with `ArithmeticException` |
| CheckedExceptionExample.java  | Handling `FileNotFoundException` (checked)         |
| CustomExceptionExample.java   | Throwing a user-defined exception                  |
| UserAlreadyExistsException.java | The custom exception class definition           |
| MultiCatchExample.java        | Handling multiple exceptions in one catch block   |

---

## Key Concepts

### Try-Catch-Finally

```java
try {
    // code that may throw
} catch (ExceptionType name) {
    // handle exception
} finally {
    // cleanup (optional, always runs)
}
