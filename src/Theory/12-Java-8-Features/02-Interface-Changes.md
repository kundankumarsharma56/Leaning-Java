<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Interface%20Changes&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=default%20methods%3Bstatic%20methods%3BBackward%20compatibility%20solved" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** From Java 8 an interface can carry default and static methods with real bodies.

## 🧠 1. What Is It?

Before Java 8 an interface could hold only abstract methods and constants. Adding a new method to a published interface **broke every implementing class**. Java 8 fixed this with two new kinds of interface methods.

## 🧩 2. Interface Members By Version

```mermaid
flowchart TD
    I["📜 Interface"] --> A["abstract methods<br/><i>always</i>"]
    I --> C["constants<br/>public static final"]
    I --> D["default methods<br/><i>Java 8 — has a body,<br/>inherited, can be overridden</i>"]
    I --> S["static methods<br/><i>Java 8 — called on the<br/>interface itself</i>"]
    I --> P["private methods<br/><i>Java 9 — shared helper code</i>"]
    style D fill:#e8f5e9
    style S fill:#e3f2fd
```

## 🧾 3. Syntax

```java
interface Vehicle {
    void start();                                  // abstract
    default void horn() { }                        // default
    static int wheels() { return 4; }              // static
}
```

## 📋 4. default vs static

| | `default` method | `static` method |
|---|---|---|
| Inherited by implementing classes | ✅ Yes | ❌ No |
| Can be overridden | ✅ Yes | ❌ No |
| Called using | An object reference | The interface name |
| Purpose | Add behaviour without breaking existing code | Utility helpers tied to the interface |

## ⚠️ 5. The Diamond Problem

If a class implements two interfaces that both provide the same `default` method, the compiler forces the class to **override it** and choose, using `InterfaceName.super.method()`.

## 📌 6. Important Rules

- An interface with `default` methods is still an interface — it cannot hold state.
- A class inheriting a class method and an interface `default` method always prefers the **class** method.

## 🔁 7. Quick Revision

> `default` = inherited body that can be overridden; `static` = interface-level utility. Both keep old code from breaking.

---

<div align="center">

<a href="01-Java-8-Introduction.md">⬅️ Java 8 Introduction</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="03-Lambda-Expressions.md">Lambda Expressions ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
