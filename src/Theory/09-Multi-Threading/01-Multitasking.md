<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Multitasking&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=Single%20vs%20Multi%20tasking%3BProcess%20based%20vs%20Thread%20based%3BWhy%20threads%20are%20lightweight" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** Executing many tasks at once, either process based or thread based.

## 1. What Is It?

**Single tasking** means executing one task at a time. Much of the processor time is wasted because waiting time is very high and the response is late (example: DOS).

**Multitasking** means executing multiple tasks simultaneously. Processor time is used properly, waiting time drops and the response is faster (example: Windows — just as a student can listen and write at the same time).

## 2. Two Ways To Achieve Multitasking

```mermaid
flowchart TD
    M["Multitasking"] --> P["1. Process based<br/><i>OS level approach</i><br/>each task is independent<br/>with separate memory"]
    M --> T["2. Thread based<br/><i>programmatic approach</i><br/>tasks share the same<br/>memory and resources"]
    P --> P1["Java program + music player<br/>+ browser running together"]
    T --> T1["One program doing<br/>several jobs at once"]
    style M fill:#1f3b57,color:#fff
    style P fill:#e7eef7
    style T fill:#e4efe6
```

| | Process based | Thread based |
|---|---|---|
| Unit | Process (heavyweight) | Thread (lightweight) |
| Memory | Separate for each | Shared within the process |
| Managed by | Operating system | The program / JVM |
| Switching cost | High | Low |

## 3. What Is A Thread?

A **thread** is the smallest independent unit of execution inside a program. Every Java program starts with one thread created by the JVM, called the **main thread**.

## 4. Advantages Of Multithreading

- Reduces waiting time and improves responsiveness.
- Uses the processor efficiently.
- Threads share memory, so they are cheap compared to processes.
- One thread's exception does not necessarily stop the others.

## 5. In Depth

A **process** has its own memory space; a **thread** is a unit of execution inside a process that shares the heap and method area with every other thread, while keeping its own stack, program counter and native stack. That sharing is the whole point: threads communicate cheaply through shared objects. It is also the whole danger, because shared mutable data can be read and written simultaneously.

**Concurrency is not parallelism.** Concurrency means several tasks are in progress and the scheduler interleaves them, which is useful even on a single core because one task can proceed while another waits. Parallelism means several tasks execute at literally the same moment on several cores. Java supports both with the same API.

**Where multithreading helps.** Tasks that spend most of their time waiting — reading files, calling a database, handling network requests — benefit enormously, because waiting threads consume almost no CPU. Tasks that are purely computational scale only up to the number of available cores, and beyond that context switching makes things worse.

**Context switching has a cost.** Saving and restoring thread state, and losing the CPU caches the previous thread had warmed, means that creating thousands of threads reduces throughput. This is why modern Java code uses an `ExecutorService` with a bounded pool rather than creating threads by hand, and why Java 21 introduced virtual threads, which are scheduled by the JVM and are cheap enough to create in very large numbers.

## 6. Quick Revision

> Single tasking wastes the CPU. Multitasking = process based (OS) or thread based (program). Threads share memory and are lightweight.

---

<div align="center">

<a href="../08-Collections-Framework/05-Cursors-and-Sorting.md">← Cursors and Sorting</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="02-Thread-Creation.md">Thread Creation →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
