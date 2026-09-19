<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Polymorphism&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Overloading%20vs%20Overriding%3BCompile-time%20vs%20Runtime%3BDynamic%20method%20dispatch" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** One name, many forms — achieved by overloading at compile time and overriding at runtime.

## 🧠 1. What Is It?

**Polymorphism** means "many forms" — the same method name behaving differently depending on the context.

## 🧩 2. Two Types

```mermaid
flowchart TD
    P["🎭 Polymorphism"] --> C["Compile-time<br/>(Static binding)<br/><b>Method Overloading</b>"]
    P --> R["Runtime<br/>(Dynamic binding)<br/><b>Method Overriding</b>"]
    style P fill:#203a43,color:#fff
    style C fill:#e3f2fd
    style R fill:#e8f5e9
```

## 📋 3. Overloading vs Overriding

| Feature | Overloading | Overriding |
|---|---|---|
| Where | Same class | Parent and child class |
| Parameters | Must differ | Must be identical |
| Return type | Can differ | Same or covariant |
| Binding | Compile time (static) | Runtime (dynamic) |
| Access modifier | Anything | Cannot be more restrictive than the parent |
| `static` / `private` / `final` methods | Can be overloaded | ❌ Cannot be overridden |

## ⚙️ 4. Dynamic Method Dispatch

```mermaid
flowchart LR
    R["Parent p = new Child();"] --> D{"Which method runs?"}
    D --> A["Decided at RUNTIME<br/>by the OBJECT type ➜ Child"]
    N["Variables, however,<br/>are decided by the<br/>REFERENCE type ➜ Parent"]
    style A fill:#c8e6c9
    style N fill:#fff3e0
```

A parent reference can point to a child object. The **method** that runs comes from the object, while a **variable** accessed comes from the reference type.

## 🧾 5. Syntax

```java
class Parent { void show() { } }
class Child extends Parent {
    @Override
    void show() { }        // overriding
}
```

## 📌 6. Rules For Overriding

- The method signature must match exactly.
- The access level cannot be reduced.
- The child cannot throw broader **checked** exceptions.
- `static`, `final` and `private` methods cannot be overridden.

## ⚠️ 7. Common Mistakes

- Calling a redefined `static` method "overriding" — it is **method hiding**.
- Changing only the return type and expecting overloading.

## 🔁 8. Quick Revision

> Overloading = same class, different parameters, compile time. Overriding = parent/child, same signature, runtime.

---

<div align="center">

<a href="03-Inheritance.md">⬅️ Inheritance</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="05-Abstraction.md">Abstraction ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
