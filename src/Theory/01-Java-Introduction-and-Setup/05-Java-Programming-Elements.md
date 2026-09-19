<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Java%20Programming%20Elements&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Package%20%E2%9E%9C%20Import%20%E2%9E%9C%20Class%3BVariables%20store%2C%20methods%20act%3BThe%20structure%20of%20every%20.java%20file" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** A Java file is built from package, import, class, variables and methods — in that order.

## 🧠 1. What Is It?

The fixed set of building blocks that appear inside a `.java` file.

## 🧩 2. Structure Diagram

```mermaid
flowchart TD
    A["📦 package statement<br/><i>at most one, must be first</i>"] --> B["📥 import statements<br/><i>any number, after package</i>"]
    B --> C["🏛️ class<br/><i>the blueprint</i>"]
    C --> D["🔢 variables<br/><i>store data</i>"]
    C --> E["⚡ methods<br/><i>perform actions</i>"]
    style A fill:#e1f5fe
    style B fill:#e8f5e9
    style C fill:#fff3e0
    style D fill:#f3e5f5
    style E fill:#f3e5f5
```

## 📋 3. Element By Element

| Element | Purpose | Rule |
|---|---|---|
| **package** | Groups related classes | Only one, and it must be the first statement |
| **import** | Brings another program's types into this file | Many allowed, always after `package` |
| **class** | The plan that defines program elements | The most important part of the file |
| **variables** | Store data | Any number inside a class |
| **methods** | Hold the business logic | Any number inside a class |

## 🧪 4. Simple Example

```java
package com.kundan.basics;   // 1. package

import java.util.Scanner;    // 2. import

public class Student {       // 3. class
    String name;             // 4. variable

    void display() {         // 5. method
        System.out.println(name);
    }
}
```

## 📌 5. Important Rules

- Order is fixed: **package ➜ import ➜ class**.
- A class may contain zero or many variables and methods.
- Business logic belongs inside methods, never loose inside the class body.

## ⚠️ 6. Common Mistakes

- Writing `import` above `package`.
- Writing more than one `package` statement.

## 🔁 7. Quick Revision

> **package (one) ➜ import (many) ➜ class ➜ { variables + methods }**

---

<div align="center">

<a href="04-Program-Execution-Flow.md">⬅️ Program Execution Flow</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="06-Java-Program-Development.md">Java Program Development ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
