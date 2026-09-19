<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Abstract%20Classes&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=abstract%20keyword%3BCannot%20be%20instantiated%3BAbstract%20class%20vs%20Interface" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** A partially completed class that mixes abstract methods with ready-made behaviour.

## 🧠 1. What Is It?

An **abstract class** is declared with the `abstract` keyword. It may contain **abstract methods** (declared without a body) as well as **concrete methods** (with a body). It **cannot be instantiated** — it exists to be extended.

## 🧩 2. Structure

```mermaid
flowchart TD
    A["🏛️ abstract class Shape"] --> M1["abstract void draw();<br/><i>no body ➜ child must implement</i>"]
    A --> M2["void info() { ... }<br/><i>ready-made behaviour</i>"]
    A --> M3["constructor, variables,<br/>static & final methods"]
    A -->|extends| C["class Circle<br/>must override draw()"]
    style A fill:#fff3e0
    style C fill:#e8f5e9
```

## 🧾 3. Syntax

```java
abstract class Shape {
    abstract void draw();
    void info() { }
}
```

## 📌 4. Important Rules

- If a class has even one abstract method, the class **must** be declared abstract.
- An abstract class can exist **without** any abstract method.
- A child class must override every abstract method, or be declared abstract itself.
- Abstract classes **can** have constructors, instance variables and static methods.
- `abstract` cannot be combined with `final`, `static` or `private`.

## ⚖️ 5. Abstract Class vs Interface

| Feature | Abstract class | Interface |
|---|---|---|
| Abstraction | 0% to 100% (partial) | 100% (by design) |
| Methods | Abstract + concrete | Abstract, plus default/static from Java 8 |
| Variables | Any kind | `public static final` only |
| Constructor | ✅ Yes | ❌ No |
| Inheritance | `extends` — only one | `implements` — many |
| Access modifiers | Any | Members are implicitly public |
| Use when | Classes share common state and code | Unrelated classes share a capability |

## 🔁 6. Quick Revision

> Abstract class = partial abstraction + shared code + single inheritance. Interface = full contract + multiple inheritance.

---

<div align="center">

<a href="06-Interfaces.md">⬅️ Interfaces</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="08-Object-Class.md">Object Class ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
