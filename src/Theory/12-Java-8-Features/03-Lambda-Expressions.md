<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Lambda%20Expressions&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Anonymous%20functions%3BArrow%20-%3E%20syntax%3BLess%20code%2C%20more%20clarity" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** An anonymous function written as a short expression that can be passed around like data.

## 🧠 1. What Is It?

A **lambda expression** is an anonymous function — a block of code with parameters and a body, but **no name, no return type and no access modifier**. It exists to give a short implementation for a **functional interface**.

## 🧩 2. Anatomy

```mermaid
flowchart LR
    P["(a, b)<br/><i>parameters</i>"] --> AR["-><br/><i>arrow token</i>"] --> B["a + b<br/><i>body</i>"]
    style AR fill:#f89820,color:#fff
```

## 🧾 3. Syntax Forms

```java
() -> System.out.println("Hi");     // no parameter
(x) -> x * x;                       // one parameter
x -> x * x;                         // parentheses optional
(a, b) -> a + b;                    // multiple parameters
(a, b) -> { return a + b; }         // block body needs return
```

## ⚖️ 4. Before And After

```mermaid
flowchart TD
    A["❌ Anonymous inner class<br/>5 lines of boilerplate"] --> B["✅ Lambda expression<br/>1 line"]
    style A fill:#ffe0e0
    style B fill:#c8e6c9
```

## 📌 5. Important Rules

- A lambda can be used **only** with a functional interface — one abstract method.
- Parameter types are usually **inferred**, so they can be omitted.
- Braces and `return` are required only for a multi-statement body.
- A lambda can read **effectively final** local variables from the enclosing scope.
- Inside a lambda, `this` refers to the **enclosing class**, not to the lambda.

## ✅ 6. Advantages

- Far less boilerplate than anonymous inner classes.
- Behaviour can be passed as an argument.
- Enables the Stream API and parallel processing.

## 🔁 7. Quick Revision

> `(parameters) -> body`. A lambda is an implementation of a functional interface, written inline.

---

<div align="center">

<a href="02-Interface-Changes.md">⬅️ Interface Changes</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="04-Functional-Interfaces.md">Functional Interfaces ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
