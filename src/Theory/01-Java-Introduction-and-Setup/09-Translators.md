<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Translators&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=Interpreter%20vs%20Compiler%3BLine%20by%20line%20or%20all%20at%20once%3BWhere%20the%20assembler%20fits" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** Interpreter, compiler and assembler each convert code from one format to another.

## 1. What Is It?

A translator converts a program from one format into another format.

## 2. Types Of Translators

```mermaid
flowchart TD
    T["Translators"] --> I["Interpreter<br/>line by line<br/><i>slower</i>"]
    T --> C["Compiler<br/>all lines at once<br/><i>faster</i>"]
    T --> A["Assembler<br/>assembly → machine language"]
    style T fill:#1f3b57,color:#fff
    style I fill:#f7eddd
    style C fill:#e4efe6
    style A fill:#e7eef7
```

## 3. Comparison

| | Interpreter | Compiler | Assembler |
|---|---|---|---|
| Converts | One line at a time | The whole program at once | Assembly language |
| Speed | Slow | Fast | — |
| Error reporting | Stops at the first bad line | Reports all errors together | — |
| Output | No separate file | Separate output file | Machine language |

## 4. Where Java Uses Both

```mermaid
flowchart LR
    S["Source .java"] -->|Compiler: javac| B["Bytecode .class"]
    B -->|Interpreter inside JVM| M["Machine code"]
    B -->|JIT compiler for hot code| M
    style B fill:#f7eddd
```

Java is **compiled and interpreted** — `javac` compiles, and the JVM interprets while the JIT compiles the frequently used parts.

## 5. Common Mistakes

- Calling Java "purely compiled" or "purely interpreted"; it is a hybrid.
- Mixing up the JIT (bytecode → native) with `javac` (source → bytecode).

## 6. In Depth

The compiler-versus-interpreter distinction is about **when** translation happens, not about which is better.

A compiler translates the entire program before execution, so translation cost is paid once and the running program is fast, but any change requires recompiling. An interpreter translates and executes one statement at a time, so a change takes effect immediately and errors are reported the moment the bad line is reached, but the same line inside a loop is retranslated on every pass.

Java deliberately takes both. `javac` performs **ahead-of-time** compilation to bytecode, which catches type errors early and produces a compact portable artifact. The JVM then interprets that bytecode, and the **JIT** performs **just-in-time** compilation of the parts that run frequently.

The advantage of JIT over ahead-of-time compilation is information: the JIT knows the actual processor, the real data and which branches are actually taken, so it can optimise for the observed behaviour and de-optimise if that behaviour later changes. An assembler occupies a different level entirely — it maps assembly mnemonics one-to-one onto machine instructions and performs no analysis.

## 7. Quick Revision

> Interpreter = line by line. Compiler = whole program. Assembler = assembly → machine.
> Java uses a **compiler + interpreter + JIT** model.

---

<div align="center">

<a href="08-Execution.md">← Execution</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="10-JVM-Architecture.md">JVM Architecture →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
