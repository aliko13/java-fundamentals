# Java Stream API

This module showcases how to use the Java Stream API for modern, functional-style data processing.

---

## Files Overview

| File                      | Concepts Covered                                        |
|---------------------------|----------------------------------------------------------|
| BasicStreamOperations.java| `map`, `filter`, `sorted`, `forEach`                    |
| NumericStreamOperations.java| `distinct`, `mapToInt`, `summaryStatistics`          |
| TerminalOperations.java   | `count`, `anyMatch`, `allMatch`, `findFirst`, `join`    |

---

## Stream API Concepts

- `stream()` – start a stream from a collection
- `map()` – transforms each element
- `filter()` – filters elements by condition
- `sorted()` – sorts elements (natural or custom)
- `forEach()` – applies an action for each element
- `distinct()` – removes duplicates
- `limit(n)` / `skip(n)` – paginate results
- `collect()` – gathers stream into List, Set, etc.
- `reduce()` – reduce to a single value
- `summaryStatistics()` – quick count, sum, min, max, avg

---

## How to Run

```bash
javac BasicStreamOperations.java
java BasicStreamOperations

javac NumericStreamOperations.java
java NumericStreamOperations

javac TerminalOperations.java
java TerminalOperations
