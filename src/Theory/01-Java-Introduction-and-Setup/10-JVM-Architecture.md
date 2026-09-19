<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=JVM%20Architecture&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Inside%20the%20Java%20Virtual%20Machine%3BClass%20Loader%20%E2%80%A2%20Memory%20%E2%80%A2%20Engine%3BHeap%2C%20Stack%2C%20Method%20Area" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** The JVM is Class Loader + Runtime Data Areas + Execution Engine, plus the native bridge.

## 🧠 1. What Is It?

**JVM** stands for **Java Virtual Machine**. It is part of the JRE, it cannot be seen with our eyes, and it is responsible for running Java programs, converting bytecode into a machine understandable format, and allocating and releasing memory.

## 🧩 2. JVM Architecture Diagram

```mermaid
flowchart TD
    CF["📦 .class file"] --> CL

    subgraph CL["1️⃣ Class Loader Subsystem"]
        L["Loading"] --> LK["Linking<br/>verify ➜ prepare ➜ resolve"] --> IN["Initialization"]
    end

    CL --> RDA

    subgraph RDA["2️⃣ Runtime Data Areas"]
        MA["🏛️ Method Area<br/><i>class code, static data</i>"]
        HP["🧺 Heap Area<br/><i>objects</i>"]
        JS["📚 Java Stack<br/><i>method execution info</i>"]
        PC["📍 PC Register<br/><i>next line to execute</i>"]
        NS["🔩 Native Stack<br/><i>non-Java execution info</i>"]
    end

    RDA --> EE

    subgraph EE["3️⃣ Execution Engine"]
        IT["🐢 Interpreter"]
        JIT["🚀 JIT Compiler"]
        GC["🧹 Garbage Collector"]
    end

    EE --> NI["🔌 Native Interface"] --> NL["📚 Native Libraries"]
    EE --> OUT["✅ Output"]

    style CF fill:#fff3e0
    style CL fill:#e3f2fd
    style RDA fill:#e8f5e9
    style EE fill:#f3e5f5
    style OUT fill:#c8e6c9
```

## 📋 3. Component Responsibilities

| Component | Responsibility |
|---|---|
| **Class Loader** | Loads the `.class` file into the JVM |
| **Method Area** | Stores class level code, metadata and static data |
| **Heap Area** | Stores all objects |
| **Java Stack** | Stores method execution information (frames, local variables) |
| **PC Register** | Maintains the next instruction to execute |
| **Native Stack** | Maintains non-Java (native) code execution information |
| **Native Interface** | Loads native libraries into the JVM |
| **Native Libraries** | Non-Java libraries needed for native execution |
| **Execution Engine** | Runs the program using the Interpreter and JIT, and provides the result |

## 🧱 4. Memory: Shared vs Per Thread

```mermaid
flowchart LR
    subgraph SH["🔗 Shared by all threads"]
        H["Heap"]
        M["Method Area"]
    end
    subgraph PT["🧵 One per thread"]
        S["Java Stack"]
        P["PC Register"]
        N["Native Stack"]
    end
    style SH fill:#e8f5e9
    style PT fill:#fff3e0
```

## 🧪 5. Simple Example

```java
public class MemoryDemo {
    public static void main(String[] args) {
        int count = 10;                 // local variable ➜ Java Stack
        String name = new String("Kundan"); // object ➜ Heap
        System.out.println(name + " " + count);
    }
}
```

## 📌 6. Important Rules

- Heap and Method Area are shared; Stack, PC Register and Native Stack are per thread.
- Garbage collection cleans the **heap** only, never the stack.
- The JVM itself is platform specific; only bytecode is portable.

## ⚠️ 7. Common Mistakes

- Mixing up JDK, JRE and JVM.
- Expecting objects on the stack — objects always live in the heap.

## ✅ 8. Best Practices

- Map errors to memory areas while debugging: `OutOfMemoryError` points to the heap, `StackOverflowError` points to the Java stack.

## 🔁 9. Quick Revision

> **JVM = Class Loader + Runtime Data Areas + Execution Engine (+ JNI).**
> JDK ⊃ JRE ⊃ JVM.

---

<div align="center">

<a href="09-Translators.md">⬅️ Translators</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="../02-Data-Types-and-Variables/README.md">Data Types and Variables ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
