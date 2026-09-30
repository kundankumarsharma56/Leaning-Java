<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Java%20Introduction&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=What%20is%20Java%3F%3BWrite%20Once%2C%20Run%20Anywhere%3BSource%20%E2%9E%9C%20Bytecode%20%E2%9E%9C%20Machine%20Code" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** Java is a platform independent, object oriented programming language that runs anywhere a JVM exists.

## 1. What Is It?

Java is a general purpose, class based, **object oriented** programming language.

| Fact | Detail |
|---|---|
| Created by | James Gosling and his team, 1991, Sun Microsystems |
| Original name | **OAK** — renamed to **Java** in 1995 |
| Current owner | Oracle Corporation (acquired Sun in 2010) |
| Cost | Free and open source |
| Reach | Around 3 billion devices run Java |
| Slogan | **WORA** — Write Once, Run Anywhere |

## 2. Editions of Java

```mermaid
flowchart LR
    J["Java Platform"] --> SE["J2SE / JSE<br/>Standard Edition"]
    J --> EE["J2EE / JEE<br/>Enterprise Edition"]
    J --> ME["J2ME / JME<br/>Micro Edition"]
    SE --> A1["Stand-alone<br/>applications"]
    EE --> A2["Web<br/>applications"]
    ME --> A3["Mobile<br/>applications"]
    style J fill:#c9762a,stroke:#333,color:#fff
    style SE fill:#1f3b57,color:#fff
    style EE fill:#1f3b57,color:#fff
    style ME fill:#1f3b57,color:#fff
```

## 3. Why Do We Need It?

Other languages compile straight to machine code, so a program built on Windows will not run on Linux.
Java compiles to **bytecode** instead, and every platform simply ships its own JVM to run that bytecode.

## 4. What Can We Build With Java?

- Stand-alone (desktop) applications
- Web applications
- Mobile applications
- Games
- Servers
- Databases and much more

## 5. Simple Example

```java
public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Welcome To Kundan Notes");
    }
}
```

## 6. How It Works

```mermaid
flowchart LR
    A["HelloJava.java<br/>source code"] -->|javac| B["HelloJava.class<br/>bytecode"]
    B -->|java| C["JVM"]
    C --> D["Output"]
    style A fill:#e4efe6
    style B fill:#f7eddd
    style C fill:#e7eef7
    style D fill:#ede7f4
```

## 7. Important Rules

- One `public` class per `.java` file and the file name must match the class name.
- Execution always begins at `public static void main(String[] args)`.
- Java is **case sensitive** — `Main` and `main` are different.

## 8. Common Mistakes

- Saving the file with a name different from the public class name.
- Forgetting `static` on `main`, so the JVM cannot find an entry point.
- Confusing **Java** with **JavaScript** — two unrelated languages.

## 9. Best Practices

- Use meaningful, noun-style class names.
- Keep one responsibility per class while learning.
- Read compiler errors from the **first** error downwards.

## 10. In Depth

Java was designed for consumer electronics, where the same program had to run on television set-top boxes, remote controls and other devices that all used different processors. Compiling directly to machine code would have meant maintaining one build per device, so the team introduced an intermediate step: the compiler targets a **virtual** machine instead of a real one, and each real device supplies its own implementation of that virtual machine.

This single decision explains almost everything about the language:

- **Portability** comes from bytecode being a fixed instruction set that no physical CPU executes directly.
- **Security** comes from the JVM standing between the program and the operating system; bytecode is verified before it runs, so a corrupted or hostile class file is rejected rather than executed.
- **Automatic memory management** is possible because the JVM owns the heap and can decide when memory is no longer reachable.
- **Performance** is recovered by the JIT compiler, which watches which methods run often and compiles those into native code at runtime, so long-running Java programs approach the speed of compiled languages.

The trade-off is startup cost and memory overhead: a JVM has to be loaded and warmed up before the program reaches full speed, which is why Java is stronger for long-running server applications than for very short command line utilities.

## 11. Quick Revision

> Java = source code → bytecode (`javac`) → JVM execution.
> Platform independence comes from the **bytecode + JVM** combination, not from the OS.

---

<div align="center">

← <i>Start</i> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="02-Java-Features.md">Java Features →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
