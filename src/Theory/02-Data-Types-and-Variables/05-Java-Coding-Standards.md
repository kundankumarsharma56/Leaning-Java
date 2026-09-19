<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Java%20Coding%20Standards&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Java%20naming%20conventions%3BPascalCase%20%E2%80%A2%20camelCase%3BNot%20mandatory%2C%20but%20expected" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** Naming conventions for classes, interfaces, variables, methods, constants and packages.

## 🧠 1. What Is It?

Java follows fixed naming standards for its own predefined packages, classes and methods, and recommends that every Java developer follow the same conventions. Following them is **not mandatory but highly recommended**.

## 🧩 2. Convention Map

```mermaid
flowchart TD
    C["📐 Java Naming Conventions"]
    C --> A["Class / Interface<br/><b>PascalCase</b><br/>StudentDetails"]
    C --> B["Variable / Method<br/><b>camelCase</b><br/>mobileNumber, getName()"]
    C --> D["Constant<br/><b>UPPER_SNAKE</b><br/>MAX_LIMIT"]
    C --> E["Package<br/><b>lowercase.dots</b><br/>com.kundan.app"]
    style C fill:#203a43,color:#fff
    style A fill:#e3f2fd
    style B fill:#e8f5e9
    style D fill:#fff3e0
    style E fill:#f3e5f5
```

## 📋 3. Convention Table

| Element | Rule | Example |
|---|---|---|
| **Class** | Any number of words, no spaces; first letter of every word in uppercase | `EmployeeDetails` |
| **Interface** | Same rules as a class | `Printable` |
| **Variable** | Start with lowercase; from the second word onwards capitalise the first letter | `mobileNumber` |
| **Method** | Same as a variable, but written with parentheses | `calculateSalary()` |
| **Constant** | All characters uppercase; separate multiple words with `_` | `MAX_USER_COUNT` |
| **Package** | Lowercase only; separate words with a dot | `com.kundan.service` |

> 📎 **Note:** Variables and methods share the same convention. The difference is that methods carry `( )`.

## 🧪 4. Simple Example

```java
package com.kundan.demo;

public class EmployeeDetails {
    static final int MAX_LIMIT = 100;   // constant
    String employeeName;                // variable

    void printEmployeeName() {          // method
        System.out.println(employeeName);
    }
}
```

## ⚠️ 5. Common Mistakes

- Writing class names in lowercase, such as `employee`.
- Using underscores inside normal variable names instead of camelCase.
- Using uppercase letters in package names.

## ✅ 6. Best Practices

- Use nouns for classes, verbs for methods.
- Pick descriptive names: `totalAmount` beats `ta`.

## 🔁 7. Quick Revision

> Class ➜ `PascalCase` • variable/method ➜ `camelCase` • constant ➜ `UPPER_SNAKE_CASE` • package ➜ `all.lowercase`.

---

<div align="center">

<a href="04-Reserved-Words.md">⬅️ Reserved Words</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="06-Java-Comments.md">Java Comments ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
