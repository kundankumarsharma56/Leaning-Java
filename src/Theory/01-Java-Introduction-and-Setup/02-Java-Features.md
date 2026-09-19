<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Java%20Features&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=8%20Core%20Features%20of%20Java%3BSimple%20%E2%80%A2%20Secure%20%E2%80%A2%20Portable%3BPlatform%20Independent%20by%20Design" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** The eight headline features that made Java the default language for portable, safe, multi-threaded software.

## 1. What Is It?

Features are the built-in strengths of the language that explain *why* Java is chosen for large systems.

## 2. Feature Map

```mermaid
mindmap
  root(( Java Features))
    Simple
    Platform Independent
    Object Oriented
    Secure
    Multi-Threading
    Architectural Neutral
    Portable
    High Performance
    Distributed
```

## 3. Feature By Feature

| # | Feature | Meaning |
|---|---|---|
| 1 | **Simple** | Clean syntax; confusing C++ ideas like pointers and operator overloading were removed |
| 2 | **Platform Independent** | Compiles to bytecode, which runs on any machine that has a JRE |
| 3 | **Object Oriented** | Software is organised as objects that carry both data and behaviour |
| 4 | **Secure** | Code runs inside the JVM with almost no direct interaction with the OS |
| 5 | **Multi-Threading** | Many tasks run at the same time while sharing the same memory |
| 6 | **Architectural Neutral** | Bytecode is tied to no particular CPU architecture |
| 7 | **Portable** | Primitive type sizes are fixed, so behaviour never changes across machines |
| 8 | **High Performance** | The JIT compiler converts hot bytecode into native machine code |
| 9 | **Distributed** | Built-in libraries for TCP/IP make networked programs easy |

## 4. Object Oriented Pillars

```mermaid
flowchart TD
    O["OOP in Java"] --> C["Class"]
    O --> B["Object"]
    O --> I["Inheritance"]
    O --> P["Polymorphism"]
    O --> A["Abstraction"]
    O --> E["Encapsulation"]
    style O fill:#c9762a,color:#fff
```

## 5. Simple Example

```java
// Platform independence in action: the same .class file runs on Windows, Linux and macOS
public class Portable {
    public static void main(String[] args) {
        System.out.println("Same bytecode, any machine");
    }
}
```

## 6. Common Mistakes

- Saying Java is "fully interpreted" — it is compiled to bytecode **and** JIT compiled.
- Assuming "platform independent" means the JVM itself is universal; the JVM is platform **specific**.

## 7. In Depth

The features are not independent marketing points; most of them follow from two design choices.

**Choice 1 — compile to bytecode.** Platform independence, architecture neutrality and portability are all the same property described from different angles. Portability goes further than bytecode alone: Java also fixes the size and range of every primitive type in the language specification, so `int` is 32 bits on every machine. In C the size of `int` depends on the compiler and platform, which is a classic source of code that works on one machine and fails on another.

**Choice 2 — run inside a managed runtime.** Security, automatic garbage collection, and reliable exception handling all exist because the JVM controls execution. Java also removed the language features that cause the most memory corruption in C and C++: pointer arithmetic, manual memory release, and operator overloading.

**Multithreading** was built into the language rather than added as a library, which is why `synchronized` is a keyword and why every object carries a lock. **Distributed** support means the standard library shipped with networking classes from the beginning, so socket and URL handling is part of the platform rather than a third-party dependency.

## 8. Quick Revision

> **Simple, Platform Independent, Object Oriented, Secure, Multi-Threaded, Architectural Neutral, Portable, High Performance, Distributed.**
> Everything traces back to one slogan: **WORA**.

---

<div align="center">

<a href="01-Java-Introduction.md">← Java Introduction</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="03-Java-Installation.md">Java Installation →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
