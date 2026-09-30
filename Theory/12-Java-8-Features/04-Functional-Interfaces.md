<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Functional%20Interfaces&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=One%20abstract%20method%3B%40FunctionalInterface%3BPredicate%20%E2%80%A2%20Function%20%E2%80%A2%20Consumer%20%E2%80%A2%20Supplier" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** An interface with exactly one abstract method — the target type of every lambda.

## 1. What Is It?

A **functional interface** is an interface that contains **exactly one abstract method**. It may also contain any number of `default` and `static` methods. It is the **target type** for a lambda expression.

The optional `@FunctionalInterface` annotation makes the compiler enforce the single-abstract-method rule.

## 2. The Four Predefined Ones

```mermaid
flowchart TD
    F["java.util.function"] --> P["Predicate&lt;T&gt;<br/>test(T) → boolean<br/><i>a condition</i>"]
    F --> C["Consumer&lt;T&gt;<br/>accept(T) → void<br/><i>takes, returns nothing</i>"]
    F --> S["Supplier&lt;T&gt;<br/>get() → T<br/><i>gives, takes nothing</i>"]
    F --> FN["Function&lt;T,R&gt;<br/>apply(T) → R<br/><i>converts T into R</i>"]
    style P fill:#e7eef7
    style C fill:#f7eddd
    style S fill:#e4efe6
    style FN fill:#ede7f4
```

| Interface | Method | Takes | Returns | Typical use |
|---|---|---|---|---|
| `Predicate<T>` | `test()` | 1 value | `boolean` | Filtering |
| `Consumer<T>` | `accept()` | 1 value | nothing | Printing, saving |
| `Supplier<T>` | `get()` | nothing | a value | Generating, lazy creation |
| `Function<T,R>` | `apply()` | 1 value | another value | Mapping, conversion |

## 3. Combining Them

| Helper | Belongs to | Effect |
|---|---|---|
| `and()`, `or()`, `negate()` | `Predicate` | Joins conditions |
| `andThen()` | `Function`, `Consumer` | Runs one, then the next |
| `compose()` | `Function` | Runs the other one first | Two-argument variants also exist: `BiPredicate`, `BiConsumer` and `BiFunction`.

## 4. Syntax

```java
@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

Calculator add = (a, b) -> a + b;
```

## 5. Important Rules

- Exactly **one** abstract method; `default` and `static` methods do not count.
- Methods inherited from `Object`, such as `toString()`, do not count either.
- Older interfaces like `Runnable`, `Callable` and `Comparator` are functional interfaces too.

## 6. In Depth

The single-abstract-method rule exists so the compiler can match a lambda unambiguously to one method signature. Default and static methods do not count against it, and neither do public methods of `Object` such as `equals` or `toString` — which is why `Comparator` remains a functional interface despite declaring `equals`.

`@FunctionalInterface` is optional but valuable: it makes the intent explicit and turns a later accidental second abstract method into a compile error instead of a mysterious break in every caller.

**Primitive specialisations exist for performance.** `IntPredicate`, `IntFunction`, `ToIntFunction`, `IntSupplier` and their `Long` and `Double` siblings avoid boxing an object per element, which matters enormously in a loop or a stream over millions of values.

**Composition is what makes them powerful.** `Predicate` offers `and()`, `or()` and `negate()`; `Function` offers `andThen()` and `compose()`, which differ only in order; `Consumer` offers `andThen()`. Small functions can therefore be built into larger ones without any loop or conditional.

Many interfaces that pre-date Java 8 became functional interfaces automatically — `Runnable`, `Callable`, `Comparator`, `ActionListener` — which is why a lambda can be passed wherever one of them was previously required.

## 7. Quick Revision

> One abstract method = a lambda target. Predicate → boolean, Consumer → void, Supplier → value, Function → conversion.

---

<div align="center">

<a href="03-Lambda-Expressions.md">← Lambda Expressions</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="05-Stream-API.md">Stream API →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
