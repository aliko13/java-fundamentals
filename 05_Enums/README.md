# Java Enums

This module demonstrates how to use Enums in Java for clean and type-safe representations of fixed sets of constants such as roles, statuses, or codes.

---

## Files Overview

| File                          | Purpose                                               |
|-------------------------------|-------------------------------------------------------|
| `UserRoleEnum.java`           | Enum to define user roles                            |
| `OrderStatusEnum.java`        | Enum for order state management                      |
| `HttpStatus.java`             | Enum with fields and constructor (code + message)    |
| `User.java`                   | Uses `UserRoleEnum` for access control               |
| `Order.java`                  | Demonstrates order status transitions using enums    |
| `EnumRunner.java`             | Main class to test all enum usage                    |

---

## Enum Concepts Covered

- **Basic enum definition** – List of constants (`ADMIN`, `VIEWER`, etc.)
- **Enum in classes** – Used for logic branching like `switch-case`
- **Enum with fields** – Add values like `code`, `message`
- **Enum iteration** – Loop through `Enum.values()`
- **Type safety** – Prevents invalid values, unlike raw strings or ints

---

## How to Run

```bash
javac *.java
java EnumRunner
