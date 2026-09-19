<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Inter%20Thread%20Communication&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=wait%20%E2%80%A2%20notify%20%E2%80%A2%20notifyAll%3BProducer%20and%20Consumer%3BOnly%20inside%20synchronized%20code" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** wait, notify and notifyAll let cooperating threads hand control to each other.

## 🧠 1. What Is It?

Inter-thread communication lets one thread **pause** until another thread signals that it may continue. It is provided by three final methods of the `Object` class: `wait()`, `notify()` and `notifyAll()`.

## 🧩 2. Producer–Consumer Flow

```mermaid
sequenceDiagram
    participant P as 🏭 Producer
    participant Q as 📦 Shared buffer
    participant C as 🛒 Consumer
    C->>Q: buffer empty ➜ wait()
    P->>Q: produce an item
    P->>C: notify()
    C->>Q: wakes up and consumes
    C->>P: notify() ➜ produce again
```

## 📋 3. The Three Methods

| Method | Effect |
|---|---|
| `wait()` | Releases the lock and puts the thread in the waiting state |
| `notify()` | Wakes **one** waiting thread |
| `notifyAll()` | Wakes **all** waiting threads |

## 📌 4. Important Rules

- All three are defined in `Object`, not in `Thread`, because the lock belongs to the object.
- They must be called from **inside a synchronized** method or block, otherwise `IllegalMonitorStateException` is thrown.
- A notified thread does not run immediately — it waits to reacquire the lock.

## ⚖️ 5. wait() vs sleep()

| | `wait()` | `sleep()` |
|---|---|---|
| Defined in | `Object` | `Thread` |
| Releases the lock | ✅ Yes | ❌ No |
| Wakes up when | Notified (or timeout) | Time expires |
| Must be synchronized | ✅ Yes | ❌ No |

## 🔁 6. Quick Revision

> `wait()` releases the lock and pauses; `notify()` / `notifyAll()` wake it. Always inside `synchronized`, always from `Object`.

---

<div align="center">

<a href="04-Synchronization.md">⬅️ Synchronization</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="../10-File-Handling/README.md">File Handling ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
