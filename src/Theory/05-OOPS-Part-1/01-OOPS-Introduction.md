<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=OOPS%20Introduction&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Procedure%20vs%20Object%20Oriented%3BWhy%20OOP%20gives%20security%3BThe%20six%20OOP%20principles" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** Object oriented programming organises software as objects that carry data and behaviour.

## 🧠 1. What Is It?

Programming languages are divided into two types:

| Type | Built from | Examples |
|---|---|---|
| **Procedure Oriented (POP)** | Functions and procedures | C, COBOL, Pascal |
| **Object Oriented (OOP)** | Classes and objects | Java, C#, Python |

Any language that follows the OOP principles is called an OOP language.

## ⚠️ 2. Problems With Procedure Oriented Programming

- Adding functionality means writing more and more functions.
- Maintaining and managing a large number of functions is difficult.
- Data is **exposed globally**.
- There is **no security** for the data.

## 🧩 3. OOP Principles

```mermaid
mindmap
  root((🎯 OOPS))
    Class
    Object
    Inheritance
    Polymorphism
    Abstraction
    Encapsulation
```

| Principle | One-line meaning |
|---|---|
| **Class** | The blueprint or plan |
| **Object** | A real instance built from the blueprint |
| **Inheritance** | Reusing the properties of one class in another |
| **Polymorphism** | One name behaving in many forms |
| **Abstraction** | Showing what it does, hiding how it does it |
| **Encapsulation** | Binding data and methods together and protecting the data |

## ⚖️ 4. POP vs OOP

```mermaid
flowchart LR
    subgraph POP["❌ Procedure Oriented"]
        D1["🌐 Global data"] --- F1["function1"]
        D1 --- F2["function2"]
        D1 --- F3["function3"]
    end
    subgraph OOP["✅ Object Oriented"]
        O1["🔒 Object A<br/>data + methods"] --- O2["🔒 Object B<br/>data + methods"]
    end
    style POP fill:#ffe0e0
    style OOP fill:#e8f5e9
```

| Aspect | POP | OOP |
|---|---|---|
| Building block | Function | Object |
| Data access | Global, open | Controlled by the object |
| Security | None | Data is protected |
| Reuse | Copy the function | Inheritance |
| Maintenance | Hard as it grows | Modular and easier |

## 🔁 5. Quick Revision

> OOP organises software as objects that hold **data + behaviour**, giving security, reuse and easier maintenance.

---

<div align="center">

<a href="../04-Arrays-and-Strings/05-Command-Line-Arguments.md">⬅️ Command Line Arguments</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="02-Classes.md">Classes ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
