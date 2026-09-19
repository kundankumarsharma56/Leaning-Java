<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Generics&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Type%20safety%20at%20compile%20time%3B%3CT%3E%20type%20parameter%3BBounded%20types%20and%20wildcards" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** Generics let a class, interface or method take the data type as a parameter, giving compile-time type safety.

## 🧠 1. What Is It?

**Generics** were introduced in **Java 1.5**. Generic programming lets a programmer create classes, interfaces and methods in which the **type of data is specified as a parameter**.

Generics provide **type safety** — the assurance that an operation is being performed on the right type of data.

> Before generics, generalized classes were written using `Object` references, because `Object` is the super class of everything. That approach did **not** ensure type safety.

## 🧩 2. Before And After

```mermaid
flowchart LR
    subgraph OLD["❌ Without generics"]
        A["List stores Object"] --> B["Cast on every read"] --> C["ClassCastException<br/>at RUNTIME"]
    end
    subgraph NEW["✅ With generics"]
        D["List&lt;String&gt;"] --> E["No cast needed"] --> F["Wrong type rejected<br/>at COMPILE time"]
    end
    style OLD fill:#ffe0e0
    style NEW fill:#e8f5e9
```

## 🧾 3. Syntax

```java
class Box<T> {          // T = type parameter
    private T value;
    public T get() { return value; }
}

Box<String> b = new Box<>();   // diamond notation
```

Multiple type parameters are allowed, for example `class Pair<K, V>`.

## 📋 4. Conventional Type Letters

| Letter | Meaning |
|---|---|
| `T` | Type |
| `E` | Element (used by collections) |
| `K` | Key |
| `V` | Value |
| `N` | Number |

## 🧰 5. Bounded Types And Wildcards

| Form | Meaning |
|---|---|
| `<T extends Number>` | T must be Number or a subclass — **upper bound** |
| `<?>` | Unknown type — accepts anything |
| `<? extends T>` | T or any subtype — read safely |
| `<? super T>` | T or any supertype — write safely |

## ⚙️ 6. Type Erasure

At compile time the generic type is checked and then **erased**; the bytecode works with plain `Object` plus casts. This keeps generics compatible with older Java versions, but it also means generic type information is not available at runtime.

## ✅ 7. Advantages

- Compile-time type checking instead of runtime failures.
- No explicit casting.
- Reusable code that works for many types.

## 🔁 8. Quick Revision

> Generics = type as a parameter ➜ type safety, no casting, errors caught at compile time. Diamond `<>` creates the object.

---

<div align="center">

<a href="../10-File-Handling/05-Serialization-and-Deserialization.md">⬅️ Serialization and De-Serialization</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="02-Garbage-Collection.md">Garbage Collection ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
