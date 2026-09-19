<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Reserved%20Words&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=53%20reserved%20words%3BKeywords%20%E2%80%A2%20Literals%20%E2%80%A2%20Unused%3BWhy%20they%20matter" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** Java's 53 keywords are permanently reserved and can never be used as identifiers.

## 🧠 1. What Is It?

Reserved words are names already claimed by the language. Java has **53** of them.

## 🧩 2. Classification

```mermaid
flowchart TD
    R["🔒 53 Reserved Words"] --> K["50 Keywords"]
    R --> L["3 Reserved Literals<br/>true • false • null"]
    K --> U["2 Unused Keywords<br/>goto • const"]
    style R fill:#203a43,color:#fff
    style L fill:#fff3e0
    style U fill:#ffcdd2
```

## 📋 3. Grouped By Purpose

| Group | Words |
|---|---|
| **Data types** | `byte` `short` `int` `long` `float` `double` `char` `boolean` |
| **Flow control** | `if` `else` `switch` `case` `default` `for` `while` `do` `break` `continue` `return` |
| **Access modifiers** | `public` `private` `protected` |
| **Other modifiers** | `static` `final` `abstract` `synchronized` `native` `strictfp` `transient` `volatile` |
| **Class related** | `class` `interface` `extends` `implements` `package` `import` `new` `instanceof` `super` `this` |
| **Exception handling** | `try` `catch` `finally` `throw` `throws` |
| **Return type** | `void` |
| **Enum** | `enum` |
| **Reserved literals** | `true` `false` `null` |
| **Unused** | `goto` `const` |

## 🧪 4. Simple Example

```java
public class KeywordDemo {
    public static void main(String[] args) {
        final int LIMIT = 100;   // final, int are keywords
        boolean active = true;   // true is a reserved literal
        System.out.println(LIMIT + " " + active);
    }
}
```

## 📌 5. Important Rules

- All reserved words are written in **lowercase**.
- `goto` and `const` are reserved but have no function in Java.
- Reserved words can never be used as identifiers.

## ⚠️ 6. Common Mistakes

- Naming a variable `class`, `new` or `for`.
- Writing `True` or `NULL` — Java uses `true`, `false` and `null` in lowercase.

## 🔁 7. Quick Revision

> **53 reserved = 50 keywords + 3 literals**, all lowercase, none usable as names.

---

<div align="center">

<a href="03-Identifiers-and-Rules.md">⬅️ Identifiers and Rules</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="05-Java-Coding-Standards.md">Java Coding Standards ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
