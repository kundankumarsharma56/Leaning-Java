<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Exception%20Handling&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=try%20%E2%80%A2%20catch%20%E2%80%A2%20finally%3BChecked%20vs%20Unchecked%3Bthrow%20vs%20throws" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** Exceptions are runtime problems that can be caught and handled so the program keeps running.

## 1. What Is It?

An **exception** is an abnormal condition that disturbs the normal flow of a program at runtime. Exception handling lets the program deal with the problem and continue instead of terminating abruptly.

## 2. Exception Hierarchy

```mermaid
flowchart TD
    T["Throwable"] --> E["Exception"]
    T --> ER["Error<br/><i>not meant to be handled</i><br/>StackOverflowError, OutOfMemoryError"]
    E --> C["Checked exceptions<br/><i>compile-time</i><br/>IOException, SQLException,<br/>ClassNotFoundException"]
    E --> U["Unchecked exceptions<br/>RuntimeException"]
    U --> U1["ArithmeticException"]
    U --> U2["NullPointerException"]
    U --> U3["ArrayIndexOutOfBoundsException"]
    U --> U4["NumberFormatException"]
    style ER fill:#f4dada
    style C fill:#f7eddd
    style U fill:#e7eef7
```

## 3. Checked vs Unchecked

| | Checked | Unchecked |
|---|---|---|
| Detected at | Compile time | Runtime |
| Must be handled | Yes — `try-catch` or `throws` | Optional |
| Parent | `Exception` | `RuntimeException` |
| Caused by | External factors (file, network, DB) | Programming mistakes |

## 4. The Five Keywords

| Keyword | Purpose |
|---|---|
| `try` | Wraps the risky code |
| `catch` | Handles a specific exception type |
| `finally` | Always runs — used for cleanup |
| `throw` | Throws one exception object manually |
| `throws` | Declares that a method may throw an exception |

```java
try {
    // risky code
} catch (ArithmeticException e) {
    // handle it
} finally {
    // always executed
}
```

## 5. Execution Flow

```mermaid
flowchart TD
    T["try block"] --> Q{"Exception raised?"}
    Q -->|No| F["finally block"]
    Q -->|Yes| M{"Matching catch?"}
    M -->|Yes| C["catch block runs"] --> F
    M -->|No| J["JVM default handler<br/>→ program terminates"] --> F
    F --> N["Program continues"]
    style C fill:#d5e8d6
    style J fill:#f4dada
```

## 6. Important Rules

- One `try` can have multiple `catch` blocks, ordered **child class first, parent last**.
- `finally` executes whether or not an exception occurs.
- `throw` takes an **object**; `throws` takes **class names**.
- An overriding method cannot throw broader checked exceptions than the parent.

## 7. Custom Exceptions

Extend `Exception` for a checked custom exception, or `RuntimeException` for an unchecked one.

```java
class InvalidAgeException extends RuntimeException {
    InvalidAgeException(String msg) { super(msg); }
}
```

## 8. Common Mistakes

- Catching a parent exception before its child, which is a compile error.
- Swallowing exceptions with an empty `catch` block.
- Using exceptions for normal flow control.

## 9. Best Practices

- Catch the most specific exception possible.
- Use `finally` or try-with-resources to close files and connections.
- Always log or communicate the failure rather than hiding it.

## 10. In Depth

An exception is an object carrying a type, a message and a **stack trace** recorded at the moment it was created. When it is thrown, the JVM unwinds the stack frame by frame looking for a matching handler; if none exists, the default handler prints the trace and the thread terminates.

**The checked versus unchecked distinction is a design decision**, not a technical one. Checked exceptions represent conditions a correct program should anticipate and recover from — a missing file, a dropped connection. Unchecked exceptions represent programming errors, where the right fix is to correct the code rather than to catch anything. Catching `NullPointerException` almost always hides a bug.

**Errors are a third category.** `OutOfMemoryError` and `StackOverflowError` signal that the JVM itself is in trouble; catching them rarely helps, because nothing the program does next is reliable.

Modern features that matter:

- **try-with-resources** (Java 7) closes anything implementing `AutoCloseable` automatically, in reverse order, even when an exception occurs. It replaced the error-prone pattern of closing inside `finally`, and it correctly reports suppressed exceptions.
- **Multi-catch** — `catch (IOException | SQLException e)` — removes duplicated handling blocks.
- **Exception chaining** — `throw new ServiceException("...", cause)` — preserves the original stack trace while presenting a meaningful abstraction to the caller.

Two rules that cause real damage when ignored: never swallow an exception in an empty `catch`, and never `return` from a `finally` block, because it discards both the original return value and any in-flight exception.

## 11. Quick Revision

> `try` risky → `catch` handle → `finally` cleanup. Checked = compiler forces you; unchecked = your own bug.

---

<div align="center">

<a href="02-Wrapper-Classes.md">← Wrapper Classes</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="../08-Collections-Framework/README.md">Collections Framework →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
