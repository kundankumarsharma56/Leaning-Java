<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Interfaces&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=100%25%20abstraction%3Bimplements%20keyword%3BMultiple%20inheritance%20solution" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** An interface is a pure contract of method declarations that implementing classes must fulfil.

## 1. What Is It?

An **interface** is a blueprint of a class that contains only **abstract methods** (before Java 8) and **constants**. It defines *what* must be done, never *how*.

## 2. Interface Relationships

```mermaid
flowchart TD
    I1["interface Payable"] -.implements.-> C1["class CardPayment"]
    I1 -.implements.-> C2["class UpiPayment"]
    I2["interface Refundable"] -.implements.-> C1
    I3["interface A"] -->|extends| I4["interface B"]
    style I1 fill:#e7eef7
    style I2 fill:#e7eef7
```

A class **implements** an interface; an interface **extends** another interface. A class can implement **many** interfaces, which is how Java supports multiple inheritance.

## 3. Syntax

```java
interface Payable {
    double TAX = 0.18;      // public static final
    void pay();             // public abstract
}

class Card implements Payable {
    public void pay() { }
}
```

## 4. Default Nature Of Members

| Member | Implicit modifiers |
|---|---|
| Variables | `public static final` — constants only |
| Methods (before Java 8) | `public abstract` |
| Java 8 `default` methods | Have a body, can be overridden |
| Java 8 `static` methods | Belong to the interface itself |
| Java 9 `private` methods | Helper code shared inside the interface |

## 5. Important Rules

- An interface cannot be instantiated.
- It has **no constructor**.
- All variables are constants and must be initialized.
- Implementing methods must be declared `public`.

## 6. In Depth

An interface defines a **capability**, and this is what makes it different from a class hierarchy. A class can only have one parent, but it can declare as many capabilities as it genuinely has — `Comparable`, `Serializable`, `Runnable` — none of which say anything about what it *is*.

Interfaces also carry no state, which is how Java gets the useful half of multiple inheritance while avoiding the diamond problem. `default` methods, added in Java 8, extended this to shared **behaviour** without state, so a new method could be added to `List` and `Collection` without breaking the thousands of existing implementations in the wild. Where two interfaces provide the same default method, the implementing class must override it and choose explicitly using `InterfaceName.super.method()`.

Two special forms matter in practice:

- A **functional interface** has exactly one abstract method and can therefore be implemented by a lambda. This is the foundation of the entire Java 8 functional API.
- A **marker interface** such as `Serializable` declares nothing at all; its presence is the information, checked at runtime. Annotations have largely replaced this technique.

Design guidance: keep interfaces small and focused. A class forced to implement methods it has no use for is a sign that one interface is doing several jobs and should be split.

## 7. Quick Revision

> Interface = pure contract, `implements`, constants + abstract methods, and the Java answer to multiple inheritance.

---

<div align="center">

<a href="05-Abstraction.md">← Abstraction</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="07-Abstract-Classes.md">Abstract Classes →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
