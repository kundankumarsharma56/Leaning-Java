<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Inheritance&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Parent%20and%20child%20classes%3Bextends%20keyword%3BTypes%20of%20inheritance" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** Taking the properties of one class into another class to reuse code.

## 🧠 1. What Is It?

**Inheritance** means taking the properties of one class into another class. The class that gives its properties is the **parent / super / base** class, and the class that receives them is the **child / sub / derived** class. It is achieved with the `extends` keyword.

## 🧩 2. Types Of Inheritance

```mermaid
flowchart TD
    subgraph S["Single"]
        A1["A"] --> B1["B"]
    end
    subgraph M["Multilevel"]
        A2["A"] --> B2["B"] --> C2["C"]
    end
    subgraph H["Hierarchical"]
        A3["A"] --> B3["B"]
        A3 --> C3["C"]
    end
    subgraph X["❌ Multiple (classes)"]
        A4["A"] --> C4["C"]
        B4["B"] --> C4
    end
    style X fill:#ffe0e0
```

| Type | Supported by classes? | Note |
|---|---|---|
| Single | ✅ | One parent, one child |
| Multilevel | ✅ | A chain of classes |
| Hierarchical | ✅ | One parent, many children |
| **Multiple** | ❌ | Not supported for classes — causes the **diamond problem**; use **interfaces** instead |
| Hybrid | ❌ (via classes) | Possible only through interfaces |

## 🧾 3. Syntax

```java
class Parent { }
class Child extends Parent { }
```

## ⚙️ 4. What Is And Is Not Inherited

| Member | Inherited? |
|---|---|
| public and protected members | ✅ Yes |
| default members (same package) | ✅ Yes |
| private members | ❌ No |
| Constructors | ❌ No (but called with `super()`) |

## 🔑 5. The super Keyword

| Usage | Meaning |
|---|---|
| `super.variable` | Parent class variable |
| `super.method()` | Parent class method |
| `super()` | Parent class constructor — must be the first statement |

## 📌 6. Important Rules

- Java supports **only single inheritance** for classes.
- Every class implicitly extends `java.lang.Object`.
- A `final` class cannot be extended.

## ✅ 7. Advantages

- Code **reusability** — write once in the parent, use in every child.
- Enables **method overriding**, and therefore runtime polymorphism.

## 🔁 8. Quick Revision

> `extends` = IS-A relationship. Single, multilevel and hierarchical are allowed; multiple inheritance only via interfaces.

---

<div align="center">

<a href="02-Encapsulation.md">⬅️ Encapsulation</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="04-Polymorphism.md">Polymorphism ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
