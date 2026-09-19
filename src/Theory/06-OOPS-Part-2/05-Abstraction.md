<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Abstraction&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Hide%20implementation%3BAbstract%20class%20or%20Interface%3BWhat%20vs%20How" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** Showing only what a component does while hiding how it does it.

## 🧠 1. What Is It?

**Abstraction** is the process of showing only the **essential features** and hiding the **implementation details**. The user knows *what* a method does, not *how* it does it.

## 🧩 2. Everyday Picture

```mermaid
flowchart LR
    U["👤 Driver"] --> I["🚗 Steering, brake, accelerator<br/><i>what you see</i>"]
    I -.->|hidden| E["⚙️ Engine, gearbox, fuel injection<br/><i>how it works</i>"]
    style I fill:#c8e6c9
    style E fill:#ffe0e0
```

## 🛠️ 3. How Java Achieves It

| Way | Abstraction level |
|---|---|
| **Abstract class** | Partial (0% to 100%) |
| **Interface** | Full (100% by design) |

## 🧾 4. Syntax

```java
abstract class Shape {
    abstract void draw();       // what, not how
}
```

## ✅ 5. Advantages

- Reduces complexity for the caller.
- The implementation can change freely without breaking callers.
- Enforces a **contract** that every implementing class must follow.
- Increases security by exposing only what is needed.

## ⚖️ 6. Abstraction vs Encapsulation

| Abstraction | Encapsulation |
|---|---|
| Hides implementation | Hides data |
| Design level concern | Implementation level concern |
| Abstract classes and interfaces | Access modifiers, getters and setters |

## 🔁 7. Quick Revision

> Abstraction = show **what**, hide **how**. Abstract class = partial, interface = full.

---

<div align="center">

<a href="04-Polymorphism.md">⬅️ Polymorphism</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="06-Interfaces.md">Interfaces ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
