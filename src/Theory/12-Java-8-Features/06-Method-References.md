<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Method%20References&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=The%20%3A%3A%20operator%3B4%20kinds%20of%20references%3BShorter%20than%20lambdas" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** A shorthand for a lambda that does nothing but call an existing method.

## 🧠 1. What Is It?

A **method reference** is a compact alternative to a lambda whose body only calls an existing method. It uses the **`::`** operator.

## 🧩 2. Four Forms

```mermaid
flowchart TD
    M["⚡ Method reference ::"] --> S["Static method<br/>ClassName::staticMethod"]
    M --> I["Instance method of a<br/>particular object<br/>object::instanceMethod"]
    M --> A["Instance method of an<br/>arbitrary object of a type<br/>ClassName::instanceMethod"]
    M --> C["Constructor reference<br/>ClassName::new"]
    style M fill:#203a43,color:#fff
```

## 📋 3. Lambda vs Method Reference

| Lambda | Method reference |
|---|---|
| `x -> Math.abs(x)` | `Math::abs` |
| `s -> System.out.println(s)` | `System.out::println` |
| `s -> s.toUpperCase()` | `String::toUpperCase` |
| `() -> new ArrayList<>()` | `ArrayList::new` |

## 📌 4. Important Rules

- The referenced method's parameters and return type must match the functional interface's abstract method.
- A method reference cannot pass extra arguments or add logic — if anything more is needed, keep the lambda.

## 🔁 5. Quick Revision

> `::` replaces a lambda that only forwards a call. Four forms: static, bound instance, unbound instance, constructor.

---

<div align="center">

<a href="05-Stream-API.md">⬅️ Stream API</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="07-Optional-Class.md">Optional Class ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
