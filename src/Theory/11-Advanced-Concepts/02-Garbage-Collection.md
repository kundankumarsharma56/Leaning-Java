<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Garbage%20Collection&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Automatic%20memory%20cleanup%3BWhen%20an%20object%20becomes%20eligible%3BHeap%20generations" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** The JVM automatically reclaims heap memory occupied by objects that are no longer referenced.

## 🧠 1. What Is It?

**Garbage collection** is the automatic process by which the JVM finds objects that are no longer used and frees the **heap** memory they occupy. In languages like C the programmer must free memory manually; in Java the **Garbage Collector**, a daemon thread, does it.

## 🧩 3. When Does An Object Become Eligible?

```mermaid
flowchart TD
    O["🧱 Object in heap"] --> R1["Reference set to null"]
    O --> R2["Reference reassigned<br/>to another object"]
    O --> R3["Object created inside a method<br/>➜ method ends"]
    O --> R4["Island of isolation<br/>objects referencing only each other"]
    R1 --> E["♻️ Eligible for GC"]
    R2 --> E
    R3 --> E
    R4 --> E
    style E fill:#c8e6c9
```

## 🧱 3. Heap Generations

```mermaid
flowchart LR
    subgraph HEAP["🧺 Heap"]
        Y["Young generation<br/>Eden + Survivor S0/S1<br/><i>Minor GC, frequent</i>"] --> O2["Old / Tenured generation<br/><i>Major GC, rare</i>"]
    end
    M["Metaspace<br/><i>class metadata</i>"]
    style Y fill:#e8f5e9
    style O2 fill:#fff3e0
```

New objects are born in the **Young** generation. Objects that survive several collections are promoted to the **Old** generation.

## 📋 4. Requesting Collection

| Call | Effect |
|---|---|
| `System.gc()` | **Requests** collection — the JVM may ignore it |
| `Runtime.getRuntime().gc()` | Same request, different entry point |
| `finalize()` | Called before an object is collected; deprecated and unreliable |

## 📌 5. Important Rules

- Garbage collection is **never guaranteed** at a specific moment.
- It cleans the **heap only** — never the stack.
- A memory leak in Java means keeping unwanted references alive, not failing to free memory.

## ✅ 6. Best Practices

- Set long-lived references to `null` when they are genuinely finished.
- Close streams, connections and resources explicitly instead of relying on the collector.

## 🔁 7. Quick Revision

> Unreferenced heap objects ➜ eligible ➜ collected by a daemon thread. `System.gc()` only requests, never forces.

---

<div align="center">

<a href="01-Generics.md">⬅️ Generics</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="03-Reflection-API.md">Reflection API ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
