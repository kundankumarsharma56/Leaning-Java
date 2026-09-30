<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Classes&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=Class%20%3D%20blueprint%3BVariables%20%2B%20Methods%3BNo%20memory%20until%20an%20object%20exists" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** A class is the plan or blueprint that defines what data and behaviour an object will have.

## 1. What Is It?

A **class** is a plan used to define program elements. Inside a class we write **variables** (data) and **methods** (behaviour). A class is a **logical entity** — it occupies no memory until an object is created from it.

## 2. Anatomy Of A Class

```mermaid
flowchart TD
    C["class Student"] --> V["Variables<br/>name • rollNo • marks"]
    C --> M["Methods<br/>display() • calculate()"]
    C --> CO["Constructors"]
    C --> B["Blocks<br/>static & instance"]
    style C fill:#1f3b57,color:#fff
```

## 3. Syntax

```java
class Student {
    int rollNo;              // variable
    void display() { }       // method
}
```

## 4. Members Of A Class

| Member | Purpose |
|---|---|
| **Variables** | Store the state of the object |
| **Methods** | Define the behaviour |
| **Constructors** | Initialize a new object |
| **Static block** | Runs once when the class is loaded |
| **Instance block** | Runs each time an object is created |
| **Inner class** | A class inside another class |

## 5. Important Rules

- Only **one public class** per file, and the file name must match it.
- A class name follows the **PascalCase** convention.
- A class is a **logical** entity; an object is a **physical** entity.

## 6. In Depth

A class is both a compile-time construct and a runtime entity. At compile time it defines types and checks member access. At runtime the JVM creates one `Class` object in the Method Area the first time the class is actively used, holding its metadata, static fields and method bytecode.

That loading happens in a fixed order, which explains why initialisation code behaves the way it does:

1. Static variables receive default values, then static initialisers and static blocks run **once**, in source order, when the class is first used.
2. On every `new`, instance variables receive default values, instance initialiser blocks run, and then the constructor body executes.

A class also defines a **type**, and a type is not the same thing as an implementation. A variable's declared type decides which members the compiler will allow; the object's actual class decides which overridden method runs. Keeping that distinction clear removes most confusion around polymorphism later.

Modern Java adds specialised class forms for common cases: `record` for immutable data carriers with generated constructor, accessors, `equals`, `hashCode` and `toString`; `enum` for a fixed set of instances; and `sealed` classes for restricting which classes may extend a type.

## 7. Quick Revision

> Class = blueprint (logical, no memory). It groups variables, methods, constructors and blocks.

---

<div align="center">

<a href="01-OOPS-Introduction.md">← OOPS Introduction</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="03-Objects.md">Objects →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
