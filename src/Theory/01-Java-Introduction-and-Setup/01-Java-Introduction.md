<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Java%20Introduction&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=What%20is%20Java%3F%3BWrite%20Once%2C%20Run%20Anywhere%3BSource%20%E2%9E%9C%20Bytecode%20%E2%9E%9C%20Machine%20Code" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** Java is a platform independent, object oriented programming language that runs anywhere a JVM exists.

## 🧠 1. What Is It?

Java is a general purpose, class based, **object oriented** programming language.

| Fact | Detail |
|---|---|
| Created by | James Gosling and his team, 1991, Sun Microsystems |
| Original name | **OAK** — renamed to **Java** in 1995 |
| Current owner | Oracle Corporation (acquired Sun in 2010) |
| Cost | Free and open source |
| Reach | Around 3 billion devices run Java |
| Slogan | **WORA** — Write Once, Run Anywhere |

## 🧩 2. Editions of Java

```mermaid
flowchart LR
    J["☕ Java Platform"] --> SE["J2SE / JSE<br/>Standard Edition"]
    J --> EE["J2EE / JEE<br/>Enterprise Edition"]
    J --> ME["J2ME / JME<br/>Micro Edition"]
    SE --> A1["Stand-alone<br/>applications"]
    EE --> A2["Web<br/>applications"]
    ME --> A3["Mobile<br/>applications"]
    style J fill:#f89820,stroke:#333,color:#fff
    style SE fill:#203a43,color:#fff
    style EE fill:#203a43,color:#fff
    style ME fill:#203a43,color:#fff
```

## ❓ 3. Why Do We Need It?

Other languages compile straight to machine code, so a program built on Windows will not run on Linux.
Java compiles to **bytecode** instead, and every platform simply ships its own JVM to run that bytecode.

## 🛠️ 4. What Can We Build With Java?

- Stand-alone (desktop) applications
- Web applications
- Mobile applications
- Games
- Servers
- Databases and much more

## 🧪 5. Simple Example

```java
public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Welcome To Kundan Notes");
    }
}
```

## ⚙️ 6. How It Works

```mermaid
flowchart LR
    A["📄 HelloJava.java<br/>source code"] -->|javac| B["📦 HelloJava.class<br/>bytecode"]
    B -->|java| C["🖥️ JVM"]
    C --> D["✅ Output"]
    style A fill:#e8f5e9
    style B fill:#fff3e0
    style C fill:#e3f2fd
    style D fill:#f3e5f5
```

## 📌 7. Important Rules

- One `public` class per `.java` file and the file name must match the class name.
- Execution always begins at `public static void main(String[] args)`.
- Java is **case sensitive** — `Main` and `main` are different.

## ⚠️ 8. Common Mistakes

- Saving the file with a name different from the public class name.
- Forgetting `static` on `main`, so the JVM cannot find an entry point.
- Confusing **Java** with **JavaScript** — two unrelated languages.

## ✅ 9. Best Practices

- Use meaningful, noun-style class names.
- Keep one responsibility per class while learning.
- Read compiler errors from the **first** error downwards.

## 🔁 10. Quick Revision

> Java = source code ➜ bytecode (`javac`) ➜ JVM execution.
> Platform independence comes from the **bytecode + JVM** combination, not from the OS.

---

<div align="center">

⬅️ <i>Start</i> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="02-Java-Features.md">Java Features ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
