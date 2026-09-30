<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Reserved%20Words&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=53%20reserved%20words%3BKeywords%20%E2%80%A2%20Literals%20%E2%80%A2%20Unused%3BWhy%20they%20matter" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** Java's 53 keywords are permanently reserved and can never be used as identifiers.

## 1. What Is It?

Reserved words are names already claimed by the language. Java has **53** of them.

## 2. Classification

```mermaid
flowchart TD
    R["53 Reserved Words"] --> K["50 Keywords"]
    R --> L["3 Reserved Literals<br/>true • false • null"]
    K --> U["2 Unused Keywords<br/>goto • const"]
    style R fill:#1f3b57,color:#fff
    style L fill:#f7eddd
    style U fill:#f4dada
```

## 3. Grouped By Purpose

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

## 4. Simple Example

```java
public class KeywordDemo {
    public static void main(String[] args) {
        final int LIMIT = 100;   // final, int are keywords
        boolean active = true;   // true is a reserved literal
        System.out.println(LIMIT + " " + active);
    }
}
```

## 5. Important Rules

- All reserved words are written in **lowercase**.
- `goto` and `const` are reserved but have no function in Java.
- Reserved words can never be used as identifiers.

## 6. Common Mistakes

- Naming a variable `class`, `new` or `for`.
- Writing `True` or `NULL` — Java uses `true`, `false` and `null` in lowercase.

## 7. In Depth

The list of 53 reserved words has stayed almost unchanged since Java 1.0, and that stability is deliberate: adding a new keyword would break every existing program that used it as an identifier. This is why later language features avoided new keywords wherever possible.

Two words are reserved but do nothing. `goto` and `const` were reserved so that a program could not use them as identifiers, keeping the door open for future use and producing a clear error message for developers arriving from C and C++ rather than a confusing one.

Later features were added using three techniques that avoid claiming new keywords:

- **Existing keywords reused in a new position** — `default` inside an interface (Java 8), `static` inside an interface.
- **Contextual keywords** — `var` (Java 10), `record` and `yield` (Java 14), `sealed` and `permits` (Java 17). These are keywords only where they can have no other meaning, so a variable named `var` still compiles.
- **Annotations and symbols** rather than words — `@Override`, `->`, `::`.

Reserved words are also case sensitive. `Public` and `New` are perfectly legal identifiers, which is exactly why they must never be used.

## 8. Quick Revision

> **53 reserved = 50 keywords + 3 literals**, all lowercase, none usable as names.

---

<div align="center">

<a href="03-Identifiers-and-Rules.md">← Identifiers and Rules</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="05-Java-Coding-Standards.md">Java Coding Standards →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
