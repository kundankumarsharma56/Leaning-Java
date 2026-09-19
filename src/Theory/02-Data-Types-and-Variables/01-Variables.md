<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Variables&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=What%20is%20a%20variable%3F%3BDeclaration%20%2B%20Initialization%3BLocal%20%E2%80%A2%20Instance%20%E2%80%A2%20Static" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** A variable is a named memory box; declare it with a type, then initialize it with a value.

## 🧠 1. What Is It?

A variable is used to **store data during program execution**. Every variable must be given a **data type** that decides what kind of data it can hold.

## 🧩 2. Two Steps To Use A Variable

```mermaid
flowchart LR
    A["1️⃣ Declaration<br/><code>byte age;</code><br/><i>type + name</i>"] --> B["2️⃣ Initialization<br/><code>age = 20;</code><br/><i>store a value</i>"]
    B --> C["✅ Ready to use<br/><code>byte age = 20;</code>"]
    style A fill:#e3f2fd
    style B fill:#fff3e0
    style C fill:#c8e6c9
```

## 🧾 3. Syntax

```java
dataType variableName;              // declaration
variableName = value;               // initialization
dataType variableName = value;      // both in one line
```

## 🧪 4. Simple Example

```java
public class VariableDemo {
    public static void main(String[] args) {
        int age = 20;
        double salary = 45000.50;
        char grade = 'A';
        String name = "Kundan";
        System.out.println(name + " | " + age + " | " + grade + " | " + salary);
    }
}
```

## 🧱 5. Types Of Variables

```mermaid
flowchart TD
    V["🔢 Variables"] --> L["Local<br/><i>inside a method</i>"]
    V --> I["Instance<br/><i>one copy per object</i>"]
    V --> S["Static<br/><i>one copy per class</i>"]
    style V fill:#203a43,color:#fff
```

| Type | Declared | Stored in | Default value |
|---|---|---|---|
| Local | Inside a method or block | Java Stack | None — must be assigned |
| Instance | Inside a class, outside methods | Heap (with the object) | Type default |
| Static | With the `static` keyword | Method Area | Type default |

## 📌 6. Important Rules

- The type must be written before the name.
- A local variable must be initialized before it is read.
- Names follow the identifier rules and are case sensitive.

## ⚠️ 7. Common Mistakes

- Using a local variable before assigning a value to it.
- Assigning a value that does not fit the type, such as `byte b = 200;`.

## 🔁 8. Quick Revision

> **Declare ➜ Initialize ➜ Use.** Local lives in the stack, instance lives with the object, static lives with the class.

---

<div align="center">

<a href="../01-Java-Introduction-and-Setup/10-JVM-Architecture.md">⬅️ JVM Architecture</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="02-Data-Types.md">Data Types ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
