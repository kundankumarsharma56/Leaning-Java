<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Packages&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Why%20packages%20exist%3BBuilt-in%20vs%20User-defined%3Bimport%20and%20naming%20conflicts" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** A package is a group of related classes, interfaces and sub-packages organised by functionality.

## 🧠 1. What Is It?

In small projects all Java files have unique names, so a single folder is fine. In huge projects with many files, storing everything in one folder becomes disorganised, and two files with the same name cannot live in the same folder — this causes a **naming conflict**.

A **package** solves this: it is a group of related classes, interfaces and sub-packages grouped by their functionality.

## 🧩 2. Types Of Packages

```mermaid
flowchart TD
    P["📦 Packages"] --> B["Predefined / Built-in<br/>ship with the JDK"]
    P --> U["User-defined<br/>created by the developer"]
    B --> B1["java.lang ➜ core classes, auto-imported"]
    B --> B2["java.util ➜ collections, Scanner, Date"]
    B --> B3["java.io ➜ file and stream handling"]
    B --> B4["java.sql ➜ database access"]
    U --> U1["com.kundan.service"]
    style P fill:#203a43,color:#fff
```

## 🧾 3. Syntax

```java
package com.kundan.service;   // declaring
import java.util.Scanner;     // using another package
import java.util.*;           // importing everything
```

## 📌 4. Important Rules

- At most **one** `package` statement per file, and it must be the **first** statement.
- `import` statements come after `package` and before the class.
- `java.lang` is imported automatically.
- The folder structure on disk must match the package name.
- A fully qualified name such as `java.util.List` can be used instead of an import.

## ✅ 5. Advantages

| Benefit | Explanation |
|---|---|
| **No naming conflicts** | Two classes with the same name can live in different packages |
| **Organisation** | Related classes stay together |
| **Access control** | The `default` and `protected` levels are package-based |
| **Reusability** | A package can be shared across projects |

## ⚠️ 6. Common Mistakes

- Writing `import` above `package`.
- Using uppercase letters in package names.
- Assuming `import java.util.*;` also imports sub-packages — it does not.

## 🔁 7. Quick Revision

> Package = folder of related types. One `package` statement, many `import` statements, `java.lang` is free.

---

<div align="center">

<a href="../06-OOPS-Part-2/08-Object-Class.md">⬅️ Object Class</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="02-Wrapper-Classes.md">Wrapper Classes ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
