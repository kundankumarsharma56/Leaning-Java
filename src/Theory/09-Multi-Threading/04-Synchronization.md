<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Synchronization&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Data%20inconsistency%20problem%3Bsynchronized%20keyword%3BDeadlock%20explained" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** Locking shared data so that only one thread can modify it at a time.

## 🧠 1. What Is It?

When several threads act on the same object at the same time, a **data inconsistency problem** occurs — one thread reads a value while another is still changing it.

**Thread synchronization** solves this: only **one thread at a time** is allowed inside the protected code, using a **lock (monitor)** that every object carries.

## 🧩 2. The Problem And The Fix

```mermaid
flowchart TD
    subgraph BAD["❌ Without synchronization"]
        T1["Thread 1 reads balance 1000"] --> W["Both withdraw 800"]
        T2["Thread 2 reads balance 1000"] --> W
        W --> R1["Wrong result"]
    end
    subgraph GOOD["✅ With synchronization"]
        S1["Thread 1 acquires the lock"] --> S2["updates ➜ releases the lock"]
        S2 --> S3["Thread 2 acquires the lock"] --> S4["Correct result"]
    end
    style BAD fill:#ffe0e0
    style GOOD fill:#e8f5e9
```

## 🧾 3. Two Forms

| Form | Scope of the lock |
|---|---|
| **Synchronized method** | The whole method is protected |
| **Synchronized block** | Only the critical lines are protected — better performance |

```java
synchronized void withdraw() { }

synchronized (this) { }
```

## 📋 4. Types Of Lock

| Type | Lock held on |
|---|---|
| Instance method | The **object** |
| Static method | The **class** object |

## 💀 5. Deadlock

Deadlock happens when two threads hold one lock each and wait forever for the other's lock.

```mermaid
flowchart LR
    T1["🧵 Thread 1<br/>holds Lock A"] -->|waits for| LB["🔒 Lock B"]
    T2["🧵 Thread 2<br/>holds Lock B"] -->|waits for| LA["🔒 Lock A"]
    LB --- T2
    LA --- T1
    style T1 fill:#ffcdd2
    style T2 fill:#ffcdd2
```

**Avoiding it:** always acquire locks in the same order, keep synchronized regions small, and prefer timeout-based locking.

## 👻 6. Daemon Threads

A **daemon thread** is a background service thread, such as the garbage collector. The JVM exits as soon as only daemon threads remain, and `setDaemon(true)` must be called **before** `start()`.

## 📌 7. Important Rules

- Synchronization costs performance, so protect only the critical section.
- `synchronized` cannot be applied to variables or constructors.

## 🔁 8. Quick Revision

> Shared data + many threads ➜ inconsistency. `synchronized` gives one-thread-at-a-time access. Circular waiting ➜ deadlock.

---

<div align="center">

<a href="03-Thread-Life-Cycle.md">⬅️ Thread Life Cycle</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="05-Inter-Thread-Communication.md">Inter Thread Communication ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
