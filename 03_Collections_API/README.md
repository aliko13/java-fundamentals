# Java Collections API (Detailed)

This module demonstrates Java's core Collection APIs with focused examples and performance comparisons.

---

## 📚 Files Overview

| File                  | Collection Used       | Description                                  |
|-----------------------|------------------------|----------------------------------------------|
| ArrayListExample.java | ArrayList              | Ordered list with duplicates and fast access |
| LinkedListExample.java| LinkedList             | Double-ended list, efficient for inserts     |
| HashSetExample.java   | HashSet                | Unordered, unique values only                |
| HashMapExample.java   | HashMap                | Key-value storage, fast lookup               |
| ListComparison.java   | ArrayList vs LinkedList| Performance and access comparison            |

---

## 🔹 List: ArrayList vs LinkedList

| Feature              | ArrayList               | LinkedList              |
|----------------------|-------------------------|-------------------------|
| Backed by            | Dynamic array           | Doubly-linked list      |
| Random access        | ✅ Fast (O(1))           | ❌ Slow (O(n))          |
| Insert/delete middle | ❌ Slow (O(n))           | ✅ Fast (O(1))          |
| Memory overhead      | ✅ Low                   | ❌ Higher               |
| Nulls allowed        | ✅ Yes                   | ✅ Yes                  |
| Thread-safe          | ❌ No                    | ❌ No                   |
| Best use case        | Frequent access         | Frequent insert/remove  |

📂 **Example**: `ListExample.java` and `ListComparison.java`

---

## 🔸 Set: HashSet

| Feature               | HashSet                |
|-----------------------|------------------------|
| Duplicate elements    | ❌ Not allowed          |
| Order guaranteed?     | ❌ No                   |
| Null values allowed   | ✅ Yes (only one)       |
| Backed by             | Hash table             |
| Performance           | ✅ Fast (add/search)    |
| Thread-safe           | ❌ No                   |
| Best use case         | Storing unique values  |

📂 **Example**: `HashSetExample.java`

---

## 🔹 Map: HashMap

| Feature               | HashMap                |
|-----------------------|------------------------|
| Key uniqueness        | ✅ Required             |
| Null keys             | ✅ One null key allowed |
| Null values           | ✅ Multiple allowed     |
| Order guaranteed?     | ❌ No                   |
| Duplicate values      | ✅ Yes                  |
| Performance           | ✅ Very fast lookup     |
| Thread-safe           | ❌ No                   |
| Best use case         | Key-value relationships|

📂 **Example**: `HashMapExample.java`

---

## 🧪 How to Run

```bash
javac ArrayListExample.java
java ArrayListExample

javac LinkedListExample.java
java LinkedListExample

javac HashSetExample.java
java HashSetExample

javac HashMapExample.java
java HashMapExample

javac ListComparison.java
java ListComparison
