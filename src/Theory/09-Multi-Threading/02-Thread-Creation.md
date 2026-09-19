<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Thread%20Creation&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=extends%20Thread%3Bimplements%20Runnable%3Bstart%28%29%20vs%20run%28%29" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** A thread is created either by extending Thread or by implementing Runnable.

## 🧠 1. What Is It?

A user defined thread is created in two ways.

## 🧩 2. Two Approaches

```mermaid
flowchart TD
    T["🧵 Creating a thread"] --> A["1️⃣ extends Thread<br/>override run()"]
    T --> B["2️⃣ implements Runnable<br/>override run()<br/>pass it to a Thread object"]
    A --> L["❌ No room left for<br/>another parent class"]
    B --> R["✅ The class can still<br/>extend something else"]
    style B fill:#e8f5e9
    style R fill:#c8e6c9
```

## 🧾 3. Syntax

```java
class MyThread extends Thread {
    public void run() { }
}

class MyTask implements Runnable {
    public void run() { }
}
```

Starting them:

```java
new MyThread().start();
new Thread(new MyTask()).start();
```

## ⚠️ 4. start() vs run()

| Call | What happens |
|---|---|
| `start()` | Registers a **new thread** with the JVM, which then calls `run()` — real multithreading |
| `run()` | Just an ordinary method call on the **current** thread — no new thread at all |

```mermaid
flowchart LR
    S["t.start()"] --> NT["🧵 New thread created"] --> R1["run() executes in parallel"]
    D["t.run()"] --> MT["🧵 Main thread only"] --> R2["run() executes sequentially"]
    style NT fill:#c8e6c9
    style MT fill:#ffe0e0
```

## 📌 5. Important Rules

- `Runnable` is the preferred approach because Java allows only one parent class.
- Calling `start()` twice on the same thread throws `IllegalThreadStateException`.
- Thread priority ranges from `MIN_PRIORITY` 1 to `MAX_PRIORITY` 10, with `NORM_PRIORITY` 5 as the default; priority is only a **hint** to the scheduler.

## 🔁 6. Quick Revision

> Extend `Thread` or implement `Runnable` (preferred). Always call `start()`, never `run()`.

---

<div align="center">

<a href="01-Multitasking.md">⬅️ Multitasking</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="03-Thread-Life-Cycle.md">Thread Life Cycle ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
