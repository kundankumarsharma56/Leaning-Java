<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Wrapper%20Classes&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Primitive%20%E2%9E%9C%20Object%3BAutoboxing%20%26%20Unboxing%3BWhy%20collections%20need%20them" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** Wrapper classes convert the eight primitive types into objects so they can be used where objects are required.

## 🧠 1. What Is It?

A **wrapper class** wraps a primitive value inside an object. Collections, generics and many APIs work only with objects, not primitives — wrappers bridge that gap.

## 🧩 2. The Eight Wrappers

```mermaid
flowchart LR
    subgraph PR["Primitive"]
        p1["byte"]:::p
        p2["short"]:::p
        p3["int"]:::p
        p4["long"]:::p
        p5["float"]:::p
        p6["double"]:::p
        p7["char"]:::p
        p8["boolean"]:::p
    end
    subgraph WR["Wrapper class"]
        w1["Byte"]
        w2["Short"]
        w3["Integer"]
        w4["Long"]
        w5["Float"]
        w6["Double"]
        w7["Character"]
        w8["Boolean"]
    end
    PR -->|autoboxing| WR
    WR -->|unboxing| PR
    style PR fill:#e8f5e9
    style WR fill:#e3f2fd
```

| Primitive | Wrapper |
|---|---|
| `byte` | `Byte` |
| `short` | `Short` |
| `int` | **`Integer`** |
| `long` | `Long` |
| `float` | `Float` |
| `double` | `Double` |
| `char` | **`Character`** |
| `boolean` | `Boolean` |

## ⚙️ 3. Autoboxing And Unboxing

| Term | Direction | Example |
|---|---|---|
| **Autoboxing** | primitive ➜ object | `Integer i = 10;` |
| **Unboxing** | object ➜ primitive | `int x = i;` |

Both were introduced in **Java 5** and are performed automatically by the compiler.

## 🧾 4. Useful Methods

| Method | Purpose |
|---|---|
| `Integer.parseInt("25")` | String ➜ primitive int |
| `Integer.valueOf("25")` | String ➜ Integer object |
| `String.valueOf(25)` | Number ➜ String |
| `intValue()`, `doubleValue()` | Object ➜ primitive |
| `Integer.MAX_VALUE` | Type limits as constants |

## 📌 5. Important Rules

- All wrapper classes are **immutable** and **final**.
- They live in `java.lang`, so no import is needed.
- Parsing invalid text throws `NumberFormatException`.
- Wrapper objects must be compared with `.equals()`, not `==`.

## 🔁 6. Quick Revision

> 8 primitives ➜ 8 wrappers. Autoboxing in, unboxing out. Collections store objects, never primitives.

---

<div align="center">

<a href="01-Packages.md">⬅️ Packages</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="03-Exception-Handling.md">Exception Handling ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
