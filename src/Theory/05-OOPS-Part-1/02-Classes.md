<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Classes&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Class%20%3D%20blueprint%3BVariables%20%2B%20Methods%3BNo%20memory%20until%20an%20object%20exists" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** A class is the plan or blueprint that defines what data and behaviour an object will have.

## 🧠 1. What Is It?

A **class** is a plan used to define program elements. Inside a class we write **variables** (data) and **methods** (behaviour). A class is a **logical entity** — it occupies no memory until an object is created from it.

## 🧩 2. Anatomy Of A Class

```mermaid
flowchart TD
    C["🏛️ class Student"] --> V["🔢 Variables<br/>name • rollNo • marks"]
    C --> M["⚡ Methods<br/>display() • calculate()"]
    C --> CO["🏗️ Constructors"]
    C --> B["🧱 Blocks<br/>static & instance"]
    style C fill:#203a43,color:#fff
```

## 🧾 3. Syntax

```java
class Student {
    int rollNo;              // variable
    void display() { }       // method
}
```

## 📋 4. Members Of A Class

| Member | Purpose |
|---|---|
| **Variables** | Store the state of the object |
| **Methods** | Define the behaviour |
| **Constructors** | Initialize a new object |
| **Static block** | Runs once when the class is loaded |
| **Instance block** | Runs each time an object is created |
| **Inner class** | A class inside another class |

## 📌 5. Important Rules

- Only **one public class** per file, and the file name must match it.
- A class name follows the **PascalCase** convention.
- A class is a **logical** entity; an object is a **physical** entity.

## 🔁 6. Quick Revision

> Class = blueprint (logical, no memory). It groups variables, methods, constructors and blocks.

---

<div align="center">

<a href="01-OOPS-Introduction.md">⬅️ OOPS Introduction</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="03-Objects.md">Objects ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
