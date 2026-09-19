<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=JVM%20Architecture&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=Inside%20the%20Java%20Virtual%20Machine%3BClass%20Loader%20%E2%80%A2%20Memory%20%E2%80%A2%20Engine%3BHeap%2C%20Stack%2C%20Method%20Area" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** The JVM is Class Loader + Runtime Data Areas + Execution Engine, plus the native bridge.

## 1. What Is It?

**JVM** stands for **Java Virtual Machine**. It is part of the JRE, it cannot be seen with our eyes, and it is responsible for running Java programs, converting bytecode into a machine understandable format, and allocating and releasing memory.

## 2. JVM Architecture Diagram

```mermaid
flowchart TD
    CF[".class file"] --> CL

    subgraph CL["1. Class Loader Subsystem"]
        L["Loading"] --> LK["Linking<br/>verify → prepare → resolve"] --> IN["Initialization"]
    end

    CL --> RDA

    subgraph RDA["2. Runtime Data Areas"]
        MA["Method Area<br/><i>class code, static data</i>"]
        HP["Heap Area<br/><i>objects</i>"]
        JS["Java Stack<br/><i>method execution info</i>"]
        PC["PC Register<br/><i>next line to execute</i>"]
        NS["Native Stack<br/><i>non-Java execution info</i>"]
    end

    RDA --> EE

    subgraph EE["3. Execution Engine"]
        IT["Interpreter"]
        JIT["JIT Compiler"]
        GC["Garbage Collector"]
    end

    EE --> NI["Native Interface"] --> NL["Native Libraries"]
    EE --> OUT["Output"]

    style CF fill:#f7eddd
    style CL fill:#e7eef7
    style RDA fill:#e4efe6
    style EE fill:#ede7f4
    style OUT fill:#d5e8d6
```

## 3. Component Responsibilities

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

## 4. Memory: Shared vs Per Thread

```mermaid
flowchart LR
    subgraph SH["Shared by all threads"]
        H["Heap"]
        M["Method Area"]
    end
    subgraph PT["One per thread"]
        S["Java Stack"]
        P["PC Register"]
        N["Native Stack"]
    end
    style SH fill:#e4efe6
    style PT fill:#f7eddd
```

## 5. Simple Example

```java
public class MemoryDemo {
    public static void main(String[] args) {
        int count = 10;                 // local variable → Java Stack
        String name = new String("Kundan"); // object → Heap
        System.out.println(name + " " + count);
    }
}
```

## 6. Important Rules

- Heap and Method Area are shared; Stack, PC Register and Native Stack are per thread.
- Garbage collection cleans the **heap** only, never the stack.
- The JVM itself is platform specific; only bytecode is portable.

## 7. Common Mistakes

- Mixing up JDK, JRE and JVM.
- Expecting objects on the stack — objects always live in the heap.

## 8. Best Practices

- Map errors to memory areas while debugging: `OutOfMemoryError` points to the heap, `StackOverflowError` points to the Java stack.

## 9. In Depth

The JVM is best understood as three cooperating systems, and most runtime errors map directly onto one of its memory areas.

**Class loaders work in a delegation hierarchy.** The Bootstrap loader handles core classes from the JDK, the Platform (formerly Extension) loader handles platform modules, and the Application loader handles classes from the classpath. Each loader first delegates to its parent and only loads the class itself if the parent cannot. This ordering is a security feature: user code cannot replace `java.lang.String` with its own version, because the Bootstrap loader always answers first.

**Memory areas map to errors.**

| Area | Typical error | Meaning |
|---|---|---|
| Heap | `OutOfMemoryError: Java heap space` | Too many live objects, or a leak keeping them reachable |
| Method Area / Metaspace | `OutOfMemoryError: Metaspace` | Too many loaded classes, common in servers that redeploy applications |
| Java Stack | `StackOverflowError` | Recursion that never terminates |

**The execution engine balances speed and startup.** Interpreting begins immediately; the JIT compiles hot code later. The garbage collector runs alongside, reclaiming unreachable heap objects. Modern JVMs offer several collectors — G1 by default, ZGC and Shenandoah for very low pause times — and they differ only in how they trade throughput against pause duration, never in the program's semantics.

## 10. Quick Revision

> **JVM = Class Loader + Runtime Data Areas + Execution Engine (+ JNI).**
> JDK ⊃ JRE ⊃ JVM.

---

<div align="center">

<a href="09-Translators.md">← Translators</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="../02-Data-Types-and-Variables/README.md">Data Types and Variables →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
