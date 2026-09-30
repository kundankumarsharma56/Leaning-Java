<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Thread%20Life%20Cycle&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=5%20states%20of%20a%20thread%3BWho%20moves%20it%20between%20states%3BDead%20threads%20cannot%20restart" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** A thread moves through New, Runnable, Running, Blocked/Waiting and Dead states.

## 1. What Is It?

From creation to termination a thread passes through a fixed set of states, controlled partly by the program and partly by the **thread scheduler**.

## 2. Life Cycle Diagram

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

## 3. State By State

| State | Meaning |
|---|---|
| **New** | The thread object exists but `start()` has not been called |
| **Runnable** | Ready to run, waiting for the scheduler to pick it |
| **Running** | Currently executing `run()` |
| **Blocked / Waiting** | Temporarily inactive — sleeping, waiting for a lock or waiting for a notification |
| **Dead / Terminated** | `run()` has finished, or the thread was stopped |

## 4. Methods That Change The State

| Method | Effect |
|---|---|
| `start()` | New → Runnable |
| `sleep(ms)` | Running → Waiting for a fixed time, keeps the lock |
| `wait()` | Running → Waiting, **releases** the lock |
| `notify()` / `notifyAll()` | Wakes one or all waiting threads |
| `join()` | Makes the current thread wait until another finishes |
| `yield()` | Hints that the thread is willing to pause |

## 5. Important Rules

- A **dead** thread can never be started again.
- `sleep()` and `join()` throw `InterruptedException`, so they must be handled.
- `sleep()` keeps the lock; `wait()` gives it up — the single most asked difference.

## 6. In Depth

Java's own `Thread.State` enum names six states, which map onto the classic diagram and are worth knowing precisely because a thread dump reports them.

| State | Meaning |
|---|---|
| `NEW` | Created, `start()` not yet called |
| `RUNNABLE` | Eligible to run; may be running or waiting for a CPU |
| `BLOCKED` | Waiting to acquire a monitor lock |
| `WAITING` | Waiting indefinitely after `wait()`, `join()` or `park()` |
| `TIMED_WAITING` | Waiting with a deadline after `sleep(n)` or `wait(n)` |
| `TERMINATED` | `run()` has finished | Note that Java does not distinguish "runnable" from "running"; both appear as `RUNNABLE`, because whether the thread currently holds a CPU is the operating system's business.

**The distinction that matters most** is between `BLOCKED` and `WAITING`. A blocked thread wants a lock someone else holds and will proceed automatically when that lock is released. A waiting thread has voluntarily given up and will only continue when another thread notifies it — which is why a missing `notify()` leaves a thread waiting forever.

`interrupt()` is the cooperative way to ask a thread to stop. It sets a flag, and any thread currently sleeping or waiting throws `InterruptedException`. The thread itself decides how to respond; the old `stop()` and `suspend()` methods were deprecated precisely because they terminated threads at arbitrary points, leaving shared data in a half-modified state.

## 7. Quick Revision

> New → Runnable → Running → (Waiting/Blocked) → Dead. `start()` once, `sleep()` keeps the lock, `wait()` releases it.

---

<div align="center">

<a href="02-Thread-Creation.md">← Thread Creation</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="04-Synchronization.md">Synchronization →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
