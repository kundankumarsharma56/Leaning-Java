<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Interfaces&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=100%25%20abstraction%3Bimplements%20keyword%3BMultiple%20inheritance%20solution" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** An interface is a pure contract of method declarations that implementing classes must fulfil.

## 🧠 1. What Is It?

An **interface** is a blueprint of a class that contains only **abstract methods** (before Java 8) and **constants**. It defines *what* must be done, never *how*.

## 🧩 2. Interface Relationships

```mermaid
flowchart TD
    I1["📜 interface Payable"] -.implements.-> C1["class CardPayment"]
    I1 -.implements.-> C2["class UpiPayment"]
    I2["📜 interface Refundable"] -.implements.-> C1
    I3["📜 interface A"] -->|extends| I4["📜 interface B"]
    style I1 fill:#e3f2fd
    style I2 fill:#e3f2fd
```

A class **implements** an interface; an interface **extends** another interface. A class can implement **many** interfaces, which is how Java supports multiple inheritance.

## 🧾 3. Syntax

```java
interface Payable {
    double TAX = 0.18;      // public static final
    void pay();             // public abstract
}

class Card implements Payable {
    public void pay() { }
}
```

## 📋 4. Default Nature Of Members

| Member | Implicit modifiers |
|---|---|
| Variables | `public static final` — constants only |
| Methods (before Java 8) | `public abstract` |
| Java 8 `default` methods | Have a body, can be overridden |
| Java 8 `static` methods | Belong to the interface itself |
| Java 9 `private` methods | Helper code shared inside the interface |

## 📌 5. Important Rules

- An interface cannot be instantiated.
- It has **no constructor**.
- All variables are constants and must be initialized.
- Implementing methods must be declared `public`.

## 🔁 6. Quick Revision

> Interface = pure contract, `implements`, constants + abstract methods, and the Java answer to multiple inheritance.

---

<div align="center">

<a href="05-Abstraction.md">⬅️ Abstraction</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="07-Abstract-Classes.md">Abstract Classes ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
