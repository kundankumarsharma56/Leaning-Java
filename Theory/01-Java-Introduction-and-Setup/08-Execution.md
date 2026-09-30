<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Execution&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=What%20happens%20on%20java%20ClassName%3BBytecode%20%E2%9E%9C%20Machine%20code%3BRuntime%20errors%20live%20here" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** java ClassName starts a JVM, loads the bytecode and runs main.

## 1. What Is It?

Execution is the step where the **JVM** loads the `.class` file, converts bytecode into machine code and produces the result.

## 2. Execution Diagram

```mermaid
sequenceDiagram
    participant U as  You
    participant J as  JVM
    participant C as  Demo.class
    U->>J: java Demo
    J->>C: load bytecode
    J->>J: verify and prepare memory
    J->>J: locate main(String[] args)
    J->>J: convert bytecode → machine code
    J-->>U: output
```

## 3. How It Works

- `java Demo` starts a fresh JVM process.
- The class loader brings `Demo.class` into memory.
- The execution engine (Interpreter + JIT) runs the instructions.
- The JVM allocates memory at the start and de-allocates it when objects are no longer used.

## 4. Simple Example

```bash
java Demo
```

## 5. Important Rules

- Use the **class name only**, with no `.class` extension.
- `main` must be `public static void main(String[] args)` or the JVM cannot start.
- Errors that appear here are **runtime errors**, not compile-time errors.

## 6. Common Mistakes

- Typing `java Demo.class`.
- Case mismatch — `java demo` will not find `Demo.class`.

## 7. In Depth

Execution begins long before the first line of `main` runs. The JVM performs three preparatory stages for every class it touches:

- **Loading** — the class loader reads the `.class` bytes and creates a `Class` object in the Method Area.
- **Linking** — verification checks that the bytecode is well formed and cannot corrupt memory, preparation allocates static fields with default values, and resolution turns symbolic references into direct ones.
- **Initialization** — static variables receive their real values and static blocks run, in the order they appear in the source.

Only then does the JVM invoke `main`. Note that initialization is **lazy**: a class is initialized the first time it is actively used, not when the program starts, which is why a static block in an unused class never runs.

The execution engine begins by **interpreting** bytecode, which starts quickly but runs slowly. A profiling counter tracks how often each method and loop executes, and once a threshold is crossed the **JIT compiler** compiles that code to native instructions and applies optimisations such as inlining and dead-code elimination. This is why a benchmark's first iteration is always far slower than its hundredth.

## 8. Quick Revision

> `java ClassName` → JVM loads bytecode → runs `main` → output.

---

<div align="center">

<a href="07-Compilation.md">← Compilation</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="09-Translators.md">Translators →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
