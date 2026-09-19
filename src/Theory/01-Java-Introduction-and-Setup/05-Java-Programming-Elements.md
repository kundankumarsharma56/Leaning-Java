<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Java%20Programming%20Elements&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=Package%20%E2%9E%9C%20Import%20%E2%9E%9C%20Class%3BVariables%20store%2C%20methods%20act%3BThe%20structure%20of%20every%20.java%20file" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** A Java file is built from package, import, class, variables and methods — in that order.

## 1. What Is It?

The fixed set of building blocks that appear inside a `.java` file.

## 2. Structure Diagram

```mermaid
flowchart TD
    A["package statement<br/><i>at most one, must be first</i>"] --> B["import statements<br/><i>any number, after package</i>"]
    B --> C["class<br/><i>the blueprint</i>"]
    C --> D["variables<br/><i>store data</i>"]
    C --> E["methods<br/><i>perform actions</i>"]
    style A fill:#e7eef7
    style B fill:#e4efe6
    style C fill:#f7eddd
    style D fill:#ede7f4
    style E fill:#ede7f4
```

## 3. Element By Element

| Element | Purpose | Rule |
|---|---|---|
| **package** | Groups related classes | Only one, and it must be the first statement |
| **import** | Brings another program's types into this file | Many allowed, always after `package` |
| **class** | The plan that defines program elements | The most important part of the file |
| **variables** | Store data | Any number inside a class |
| **methods** | Hold the business logic | Any number inside a class |

## 4. Simple Example

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

## 5. Important Rules

- Order is fixed: **package → import → class**.
- A class may contain zero or many variables and methods.
- Business logic belongs inside methods, never loose inside the class body.

## 6. Common Mistakes

- Writing `import` above `package`.
- Writing more than one `package` statement.

## 7. In Depth

The fixed order of `package`, `import` and class declarations is not an arbitrary style rule; it reflects how the compiler resolves names. The package statement establishes the **namespace** the file belongs to, imports then bring **external names** into scope, and only after both are known can the compiler resolve the type names used inside the class body.

A few consequences worth knowing:

- A file may contain several classes, but only one may be `public`, because the class loader locates a public class by its file name.
- Anything not inside a class cannot exist in Java. There are no free-standing functions or global variables — this is what "everything is inside a class" means in practice.
- `import` does not copy or load any code. It is purely a compile-time shorthand that lets you write `Scanner` instead of `java.util.Scanner`. The class is loaded by the JVM only when it is first used.
- A **static import** (`import static java.lang.Math.sqrt;`) brings in a static member rather than a type, allowing `sqrt(x)` instead of `Math.sqrt(x)`. It should be used sparingly, because it hides where the method comes from.

## 8. Quick Revision

> **package (one) → import (many) → class → { variables + methods }**

---

<div align="center">

<a href="04-Program-Execution-Flow.md">← Program Execution Flow</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="06-Java-Program-Development.md">Java Program Development →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
