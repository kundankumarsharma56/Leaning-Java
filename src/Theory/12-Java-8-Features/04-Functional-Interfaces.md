<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Functional%20Interfaces&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=One%20abstract%20method%3B%40FunctionalInterface%3BPredicate%20%E2%80%A2%20Function%20%E2%80%A2%20Consumer%20%E2%80%A2%20Supplier" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** An interface with exactly one abstract method — the target type of every lambda.

## 🧠 1. What Is It?

A **functional interface** is an interface that contains **exactly one abstract method**. It may also contain any number of `default` and `static` methods. It is the **target type** for a lambda expression.

The optional `@FunctionalInterface` annotation makes the compiler enforce the single-abstract-method rule.

## 🧩 2. The Four Predefined Ones

```mermaid
flowchart TD
    F["📜 java.util.function"] --> P["Predicate&lt;T&gt;<br/>test(T) ➜ boolean<br/><i>a condition</i>"]
    F --> C["Consumer&lt;T&gt;<br/>accept(T) ➜ void<br/><i>takes, returns nothing</i>"]
    F --> S["Supplier&lt;T&gt;<br/>get() ➜ T<br/><i>gives, takes nothing</i>"]
    F --> FN["Function&lt;T,R&gt;<br/>apply(T) ➜ R<br/><i>converts T into R</i>"]
    style P fill:#e3f2fd
    style C fill:#fff3e0
    style S fill:#e8f5e9
    style FN fill:#f3e5f5
```

| Interface | Method | Takes | Returns | Typical use |
|---|---|---|---|---|
| `Predicate<T>` | `test()` | 1 value | `boolean` | Filtering |
| `Consumer<T>` | `accept()` | 1 value | nothing | Printing, saving |
| `Supplier<T>` | `get()` | nothing | a value | Generating, lazy creation |
| `Function<T,R>` | `apply()` | 1 value | another value | Mapping, conversion |

## 🔗 3. Combining Them

| Helper | Belongs to | Effect |
|---|---|---|
| `and()`, `or()`, `negate()` | `Predicate` | Joins conditions |
| `andThen()` | `Function`, `Consumer` | Runs one, then the next |
| `compose()` | `Function` | Runs the other one first |

Two-argument variants also exist: `BiPredicate`, `BiConsumer` and `BiFunction`.

## 🧾 4. Syntax

```java
@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

Calculator add = (a, b) -> a + b;
```

## 📌 5. Important Rules

- Exactly **one** abstract method; `default` and `static` methods do not count.
- Methods inherited from `Object`, such as `toString()`, do not count either.
- Older interfaces like `Runnable`, `Callable` and `Comparator` are functional interfaces too.

## 🔁 6. Quick Revision

> One abstract method = a lambda target. Predicate ➜ boolean, Consumer ➜ void, Supplier ➜ value, Function ➜ conversion.

---

<div align="center">

<a href="03-Lambda-Expressions.md">⬅️ Lambda Expressions</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="05-Stream-API.md">Stream API ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
