<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Multitasking&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Single%20vs%20Multi%20tasking%3BProcess%20based%20vs%20Thread%20based%3BWhy%20threads%20are%20lightweight" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** Executing many tasks at once, either process based or thread based.

## 🧠 1. What Is It?

**Single tasking** means executing one task at a time. Much of the processor time is wasted because waiting time is very high and the response is late (example: DOS).

**Multitasking** means executing multiple tasks simultaneously. Processor time is used properly, waiting time drops and the response is faster (example: Windows — just as a student can listen and write at the same time).

## 🧩 2. Two Ways To Achieve Multitasking

```mermaid
flowchart TD
    M["⚡ Multitasking"] --> P["1️⃣ Process based<br/><i>OS level approach</i><br/>each task is independent<br/>with separate memory"]
    M --> T["2️⃣ Thread based<br/><i>programmatic approach</i><br/>tasks share the same<br/>memory and resources"]
    P --> P1["Java program + music player<br/>+ browser running together"]
    T --> T1["One program doing<br/>several jobs at once"]
    style M fill:#203a43,color:#fff
    style P fill:#e3f2fd
    style T fill:#e8f5e9
```

| | Process based | Thread based |
|---|---|---|
| Unit | Process (heavyweight) | Thread (lightweight) |
| Memory | Separate for each | Shared within the process |
| Managed by | Operating system | The program / JVM |
| Switching cost | High | Low |

## 🧵 3. What Is A Thread?

A **thread** is the smallest independent unit of execution inside a program. Every Java program starts with one thread created by the JVM, called the **main thread**.

## ✅ 4. Advantages Of Multithreading

- Reduces waiting time and improves responsiveness.
- Uses the processor efficiently.
- Threads share memory, so they are cheap compared to processes.
- One thread's exception does not necessarily stop the others.

## 🔁 5. Quick Revision

> Single tasking wastes the CPU. Multitasking = process based (OS) or thread based (program). Threads share memory and are lightweight.

---

<div align="center">

<a href="../08-Collections-Framework/05-Cursors-and-Sorting.md">⬅️ Cursors and Sorting</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="02-Thread-Creation.md">Thread Creation ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
