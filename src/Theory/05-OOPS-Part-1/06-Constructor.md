<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Constructor&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=What%20is%20a%20constructor%3F%3BDefault%20vs%20Parameterized%3BConstructor%20chaining" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** A constructor is a special block that initializes an object at the moment it is created.

## 🧠 1. What Is It?

A **constructor** is a special member used to **initialize an object**. It runs automatically when an object is created with `new`.

## 🧩 2. Rules At A Glance

```mermaid
flowchart TD
    C["🏗️ Constructor"] --> R1["Name = class name"]
    C --> R2["No return type<br/><i>not even void</i>"]
    C --> R3["Runs automatically on new"]
    C --> R4["Can be overloaded"]
    C --> R5["Cannot be static, final or abstract"]
    style C fill:#203a43,color:#fff
```

## 📋 3. Types Of Constructors

| Type | Description |
|---|---|
| **Default constructor** | Added by the compiler when no constructor is written; initializes fields to default values |
| **No-argument constructor** | Written by the developer with an empty parameter list |
| **Parameterized constructor** | Accepts values so each object starts with its own data |

## 🧾 4. Syntax

```java
class Student {
    int rollNo;

    Student() { }                       // no-arg
    Student(int rollNo) {               // parameterized
        this.rollNo = rollNo;
    }
}
```

## 🔗 5. Constructor Chaining

```mermaid
flowchart LR
    A["new Student(101)"] --> B["this() ➜ another constructor<br/>in the same class"]
    B --> C["super() ➜ parent class<br/>constructor"]
    C --> D["✅ object fully initialized"]
    style D fill:#c8e6c9
```

- `this()` calls another constructor of the **same** class.
- `super()` calls the **parent** class constructor.
- Either call must be the **first statement**, and only one of the two can appear.

## ⚖️ 6. Constructor vs Method

| | Constructor | Method |
|---|---|---|
| Name | Same as the class | Any valid identifier |
| Return type | None | Mandatory (`void` if nothing) |
| Invoked | Automatically on `new` | Explicitly by a call |
| Purpose | Initialize the object | Perform an action |
| Inherited | ❌ No | ✅ Yes |

## ⚠️ 7. Common Mistakes

- Writing `void` before a constructor, which turns it into an ordinary method.
- Expecting the default constructor to still exist after writing a parameterized one — it does not.

## 🔁 8. Quick Revision

> Constructor = class name + no return type + runs on `new`. Default vanishes once you write your own.

---

<div align="center">

<a href="05-Methods.md">⬅️ Methods</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="../06-OOPS-Part-2/README.md">OOPS Part 2 ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
