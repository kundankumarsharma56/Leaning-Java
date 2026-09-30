<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Inter%20Thread%20Communication&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=wait%20%E2%80%A2%20notify%20%E2%80%A2%20notifyAll%3BProducer%20and%20Consumer%3BOnly%20inside%20synchronized%20code" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** wait, notify and notifyAll let cooperating threads hand control to each other.

## 1. What Is It?

Inter-thread communication lets one thread **pause** until another thread signals that it may continue. It is provided by three final methods of the `Object` class: `wait()`, `notify()` and `notifyAll()`.

## 2. Producer–Consumer Flow

```mermaid
sequenceDiagram
    participant P as  Producer
    participant Q as  Shared buffer
    participant C as  Consumer
    C->>Q: buffer empty → wait()
    P->>Q: produce an item
    P->>C: notify()
    C->>Q: wakes up and consumes
    C->>P: notify() → produce again
```

## 3. The Three Methods

| Method | Effect |
|---|---|
| `wait()` | Releases the lock and puts the thread in the waiting state |
| `notify()` | Wakes **one** waiting thread |
| `notifyAll()` | Wakes **all** waiting threads |

## 4. Important Rules

- All three are defined in `Object`, not in `Thread`, because the lock belongs to the object.
- They must be called from **inside a synchronized** method or block, otherwise `IllegalMonitorStateException` is thrown.
- A notified thread does not run immediately — it waits to reacquire the lock.

## 5. wait() vs sleep()

| | `wait()` | `sleep()` |
|---|---|---|
| Defined in | `Object` | `Thread` |
| Releases the lock | Yes | No |
| Wakes up when | Notified (or timeout) | Time expires |
| Must be synchronized | Yes | No |

## 6. In Depth

`wait()` and `notify()` are defined on `Object` rather than `Thread` because the coordination is tied to a **monitor**, and every object has one. A thread waits on the monitor of a specific object and is woken by a notification on that same object.

The mechanism must be used with two disciplines:

- **Always wait inside a loop, never inside an `if`.** A thread may wake for reasons other than a matching notification — a spurious wakeup, or another thread that consumed the condition first — so the condition has to be rechecked after waking.
- **Prefer `notifyAll()` to `notify()`** when more than one kind of waiter exists. `notify()` wakes an arbitrary single thread, which may be one whose condition is still false, leaving the genuinely eligible thread asleep.

`wait()` releases the lock, which is essential: a thread that slept while holding the lock would prevent anyone from ever changing the condition it is waiting for. That single difference from `sleep()` is why deadlock-by-sleeping is such a common beginner mistake.

In modern code these primitives are rarely written by hand. `BlockingQueue` implements the producer–consumer pattern completely, blocking on `put()` when full and on `take()` when empty. `CountDownLatch`, `Semaphore`, `CyclicBarrier` and `Condition` cover the other classic coordination problems, and all of them are easier to get right than raw `wait`/`notify`.

## 7. Quick Revision

> `wait()` releases the lock and pauses; `notify()` / `notifyAll()` wake it. Always inside `synchronized`, always from `Object`.

---

<div align="center">

<a href="04-Synchronization.md">← Synchronization</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="../10-File-Handling/README.md">File Handling →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
