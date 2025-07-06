# Java Fundamentals: OOP – Inheritance, Polymorphism, Abstraction

This module demonstrates **core Object-Oriented Programming (OOP)** concepts in Java, separated into clear examples across four subfolders.

---

## 📁 Project Structure

02_OOP_InheritancePolymorphismAbstraction/
├── inheritance/
│ ├── Animal.java
│ ├── Dog.java
│ └── InheritanceDemo.java
│
├── abstraction/
│ ├── Shape.java
│ ├── Circle.java
│ └── AbstractionDemo.java
│
├── interface/
│ ├── Flyable.java
│ ├── Swimmable.java
│ ├── Duck.java
│ └── InterfaceDemo.java
│
└── polymorphism/
├── Employee.java
├── Developer.java
└── PolymorphismDemo.java

---

## 🔍 Concepts Covered

### `inheritance/`
- Superclass and subclass relationship
- Method inheritance and extension
- **Constructor chaining** using `super(...)`

### `abstraction/`
- Abstract classes and abstract methods
- Base method reuse with abstract definitions
- Runtime implementation in concrete subclass

### `interface/`
- Interface creation and implementation
- **Multiple inheritance via interfaces**
- Enforcing behavior contracts (`Flyable`, `Swimmable`)

### `polymorphism/`
- Polymorphic behavior via method overriding
- `instanceof` operator for type checking
- **Upcasting and downcasting**
- Dynamic method dispatch

---

## 🚀 How to Run

1. Make sure the folder is **marked as a source root** in IntelliJ:
    - Right-click the folder (e.g., `inheritance`) → _"Mark Directory as → Sources Root"_

2. Open any `*Demo.java` file and run it.
    - Example: Right-click `InheritanceDemo.java` → **Run**

---

## Sample Outputs

### `inheritance/InheritanceDemo.java`
Animal constructor called
Dog constructor called
Buddy is eating.
Buddy says: Woof!

### `abstraction/AbstractionDemo.java`
This is a red shape.
Area: 78.53981633974483

### `interface/InterfaceDemo.java`
Donald is flying!
Donald is swimming!

### `polymorphism/PolymorphismDemo.java`
Alice is working.
Bob is writing code.
Bob is debugging the system.

---

## Educational Goals

This module is intended to:
- Clarify the **differences and relationships** between inheritance, abstraction, interfaces, and polymorphism.
- Help students **visualize and experiment** with each OOP principle.
- Provide **clean and extendable** examples for personal or classroom use.

---

## Requirements

- Java 8 or higher
- IntelliJ IDEA or any Java IDE
- No external libraries

---
