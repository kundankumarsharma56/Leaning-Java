<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Translators&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Interpreter%20vs%20Compiler%3BLine%20by%20line%20or%20all%20at%20once%3BWhere%20the%20assembler%20fits" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** Interpreter, compiler and assembler each convert code from one format to another.

## 🧠 1. What Is It?

A translator converts a program from one format into another format.

## 🧩 2. Types Of Translators

```mermaid
flowchart TD
    T["🔄 Translators"] --> I["🐢 Interpreter<br/>line by line<br/><i>slower</i>"]
    T --> C["🚀 Compiler<br/>all lines at once<br/><i>faster</i>"]
    T --> A["🔩 Assembler<br/>assembly ➜ machine language"]
    style T fill:#203a43,color:#fff
    style I fill:#fff3e0
    style C fill:#e8f5e9
    style A fill:#e3f2fd
```

## 📋 3. Comparison

| | Interpreter | Compiler | Assembler |
|---|---|---|---|
| Converts | One line at a time | The whole program at once | Assembly language |
| Speed | Slow | Fast | — |
| Error reporting | Stops at the first bad line | Reports all errors together | — |
| Output | No separate file | Separate output file | Machine language |

## ⚙️ 4. Where Java Uses Both

```mermaid
flowchart LR
    S["Source .java"] -->|Compiler: javac| B["Bytecode .class"]
    B -->|Interpreter inside JVM| M["Machine code"]
    B -->|JIT compiler for hot code| M
    style B fill:#fff3e0
```

Java is **compiled and interpreted** — `javac` compiles, and the JVM interprets while the JIT compiles the frequently used parts.

## ⚠️ 5. Common Mistakes

- Calling Java "purely compiled" or "purely interpreted"; it is a hybrid.
- Mixing up the JIT (bytecode ➜ native) with `javac` (source ➜ bytecode).

## 🔁 6. Quick Revision

> Interpreter = line by line. Compiler = whole program. Assembler = assembly ➜ machine.
> Java uses a **compiler + interpreter + JIT** model.

---

<div align="center">

<a href="08-Execution.md">⬅️ Execution</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="10-JVM-Architecture.md">JVM Architecture ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
