<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Objects&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Object%20%3D%20instance%3BCreated%20with%20new%3BLives%20in%20heap%20memory" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** An object is a real instance of a class, created with new and stored in heap memory.

## 🧠 1. What Is It?

An **object** is a real-world instance created from a class. Creating an object means **allocating memory**, and every object created with `new` is placed inside the **heap** memory of the JVM.

## 🧩 3. Object Creation Flow

```mermaid
flowchart LR
    C["🏛️ class Student<br/><i>blueprint, no memory</i>"] -->|new Student()| O1["🧺 Heap<br/>object 1"]
    C -->|new Student()| O2["🧺 Heap<br/>object 2"]
    R1["📍 Stack: s1"] --> O1
    R2["📍 Stack: s2"] --> O2
    style C fill:#e3f2fd
    style O1 fill:#fff3e0
    style O2 fill:#fff3e0
```

## 🧾 3. Syntax

```java
ClassName reference = new ClassName();
```

Three parts: **declaration** (`Student s`), **instantiation** (`new`), **initialization** (the constructor call).

## 📋 4. Object State, Behaviour, Identity

| Term | Meaning | Example |
|---|---|---|
| **State** | The data held in its variables | `rollNo = 101` |
| **Behaviour** | The methods it can perform | `display()` |
| **Identity** | A unique reference in memory | its heap address |

## 📌 5. Important Rules

- Each object has its **own copy** of instance variables.
- The reference lives in the **stack**; the object lives in the **heap**.
- An object with no reference pointing to it becomes eligible for **garbage collection**.

## ⚠️ 6. Common Mistakes

- Calling an instance method without creating an object.
- Using a reference that is still `null`, which causes `NullPointerException`.

## 🔁 7. Quick Revision

> Class ➜ blueprint • `new` ➜ memory in heap • reference ➜ stack pointer to that object.

---

<div align="center">

<a href="02-Classes.md">⬅️ Classes</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="04-Variables.md">Variables ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
