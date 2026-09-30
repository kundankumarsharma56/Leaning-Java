<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Thread%20Creation&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=extends%20Thread%3Bimplements%20Runnable%3Bstart%28%29%20vs%20run%28%29" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** A thread is created either by extending Thread or by implementing Runnable.

## 1. What Is It?

A user defined thread is created in two ways.

## 2. Two Approaches

```mermaid
flowchart TD
    T["Creating a thread"] --> A["1. extends Thread<br/>override run()"]
    T --> B["2. implements Runnable<br/>override run()<br/>pass it to a Thread object"]
    A --> L["No room left for<br/>another parent class"]
    B --> R["The class can still<br/>extend something else"]
    style B fill:#e4efe6
    style R fill:#d5e8d6
```

## 3. Syntax

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

## 4. start() vs run()

| Call | What happens |
|---|---|
| `start()` | Registers a **new thread** with the JVM, which then calls `run()` — real multithreading |
| `run()` | Just an ordinary method call on the **current** thread — no new thread at all |

```mermaid
flowchart LR
    S["t.start()"] --> NT["New thread created"] --> R1["run() executes in parallel"]
    D["t.run()"] --> MT["Main thread only"] --> R2["run() executes sequentially"]
    style NT fill:#d5e8d6
    style MT fill:#f4dada
```

## 5. Important Rules

- `Runnable` is the preferred approach because Java allows only one parent class.
- Calling `start()` twice on the same thread throws `IllegalThreadStateException`.
- Thread priority ranges from `MIN_PRIORITY` 1 to `MAX_PRIORITY` 10, with `NORM_PRIORITY` 5 as the default; priority is only a **hint** to the scheduler.

## 6. In Depth

Implementing `Runnable` is preferred for reasons deeper than the single-inheritance limit. It separates the **task** from the **worker**, and that separation is what allows the same task object to be submitted to a thread pool, scheduled for later, or executed on the calling thread in a test. Extending `Thread` fuses the two and forces a new thread for every task.

In production code, threads are rarely created directly at all. An `ExecutorService` maintains a pool of reusable worker threads and a queue of pending tasks, which caps resource usage and removes the cost of creating a thread per task.

| Type | Returns a value | Can throw a checked exception |
|---|---|---|
| `Runnable` | No | No |
| `Callable<V>` | Yes | Yes | Submitting a `Callable` returns a `Future`, whose `get()` blocks until the result is available. `CompletableFuture` extends this with non-blocking composition, so several asynchronous steps can be chained without any thread waiting.

Thread **priority** is only a hint and is mapped differently by each operating system, so correctness must never depend on it. Every thread also has a name, useful in logs and stack dumps, and an `UncaughtExceptionHandler`, because an exception escaping `run()` terminates only that thread and would otherwise vanish silently.

## 7. Quick Revision

> Extend `Thread` or implement `Runnable` (preferred). Always call `start()`, never `run()`.

---

<div align="center">

<a href="01-Multitasking.md">← Multitasking</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="03-Thread-Life-Cycle.md">Thread Life Cycle →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
