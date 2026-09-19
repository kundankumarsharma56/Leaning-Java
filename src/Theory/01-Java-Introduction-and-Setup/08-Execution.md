<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Execution&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=What%20happens%20on%20java%20ClassName%3BBytecode%20%E2%9E%9C%20Machine%20code%3BRuntime%20errors%20live%20here" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** java ClassName starts a JVM, loads the bytecode and runs main.

## 🧠 1. What Is It?

Execution is the step where the **JVM** loads the `.class` file, converts bytecode into machine code and produces the result.

## 🧩 2. Execution Diagram

```mermaid
sequenceDiagram
    participant U as 👨‍💻 You
    participant J as ⚙️ JVM
    participant C as 📦 Demo.class
    U->>J: java Demo
    J->>C: load bytecode
    J->>J: verify and prepare memory
    J->>J: locate main(String[] args)
    J->>J: convert bytecode ➜ machine code
    J-->>U: ✅ output
```

## ⚙️ 3. How It Works

- `java Demo` starts a fresh JVM process.
- The class loader brings `Demo.class` into memory.
- The execution engine (Interpreter + JIT) runs the instructions.
- The JVM allocates memory at the start and de-allocates it when objects are no longer used.

## 🧪 4. Simple Example

```bash
java Demo
```

## 📌 5. Important Rules

- Use the **class name only**, with no `.class` extension.
- `main` must be `public static void main(String[] args)` or the JVM cannot start.
- Errors that appear here are **runtime errors**, not compile-time errors.

## ⚠️ 6. Common Mistakes

- Typing `java Demo.class`.
- Case mismatch — `java demo` will not find `Demo.class`.

## 🔁 7. Quick Revision

> `java ClassName` ➜ JVM loads bytecode ➜ runs `main` ➜ output.

---

<div align="center">

<a href="07-Compilation.md">⬅️ Compilation</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="09-Translators.md">Translators ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
