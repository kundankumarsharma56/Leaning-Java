<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Thread%20Life%20Cycle&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=5%20states%20of%20a%20thread%3BWho%20moves%20it%20between%20states%3BDead%20threads%20cannot%20restart" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** A thread moves through New, Runnable, Running, Blocked/Waiting and Dead states.

## 🧠 1. What Is It?

From creation to termination a thread passes through a fixed set of states, controlled partly by the program and partly by the **thread scheduler**.

## 🧩 2. Life Cycle Diagram

```mermaid
stateDiagram-v2
    [*] --> New: object created
    New --> Runnable: start()
    Runnable --> Running: scheduler picks it
    Running --> Runnable: yield() / time slice ends
    Running --> Waiting: sleep() • wait() • join()
    Waiting --> Runnable: time over • notify() • joined thread ends
    Running --> Blocked: waiting for a lock
    Blocked --> Runnable: lock acquired
    Running --> Dead: run() completes
    Dead --> [*]
```

## 📋 3. State By State

| State | Meaning |
|---|---|
| **New** | The thread object exists but `start()` has not been called |
| **Runnable** | Ready to run, waiting for the scheduler to pick it |
| **Running** | Currently executing `run()` |
| **Blocked / Waiting** | Temporarily inactive — sleeping, waiting for a lock or waiting for a notification |
| **Dead / Terminated** | `run()` has finished, or the thread was stopped |

## 🧰 4. Methods That Change The State

| Method | Effect |
|---|---|
| `start()` | New ➜ Runnable |
| `sleep(ms)` | Running ➜ Waiting for a fixed time, keeps the lock |
| `wait()` | Running ➜ Waiting, **releases** the lock |
| `notify()` / `notifyAll()` | Wakes one or all waiting threads |
| `join()` | Makes the current thread wait until another finishes |
| `yield()` | Hints that the thread is willing to pause |

## 📌 5. Important Rules

- A **dead** thread can never be started again.
- `sleep()` and `join()` throw `InterruptedException`, so they must be handled.
- `sleep()` keeps the lock; `wait()` gives it up — the single most asked difference.

## 🔁 6. Quick Revision

> New ➜ Runnable ➜ Running ➜ (Waiting/Blocked) ➜ Dead. `start()` once, `sleep()` keeps the lock, `wait()` releases it.

---

<div align="center">

<a href="02-Thread-Creation.md">⬅️ Thread Creation</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="04-Synchronization.md">Synchronization ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
