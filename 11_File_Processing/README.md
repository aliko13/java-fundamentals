# Java File Processing

Java provides two main APIs for file operations:

| API       | Package              | Description                             |
|-----------|----------------------|-----------------------------------------|
| Legacy I/O | `java.io.*`         | Traditional stream-based I/O            |
| NIO       | `java.nio.file.*`    | Modern API for paths, streams, buffers  |

---

## Files Overview

| File                     | Focus Area                             |
|--------------------------|-----------------------------------------|
| LegacyFileIOExample.java | Reading/writing with `File`, `Reader`, `Writer` |
| NioFileExample.java      | Using `Paths`, `Files`, `StandardOpenOption` |
| ReadToListExample.java   | Reading file contents into a `List<String>` |
| ReadToStreamExample.java | Stream-based file processing (e.g., filtering lines) |

---

## Legacy I/O (java.io)

- `FileReader`, `BufferedReader` for reading
- `PrintWriter`, `FileWriter` for writing
- Less efficient for high-performance or parallel use

```java
PrintWriter writer = new PrintWriter("output.txt");
writer.println("Hello");
writer.close();
