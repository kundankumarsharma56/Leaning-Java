<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=List%20Interface&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=ArrayList%20vs%20LinkedList%3BVector%20and%20Stack%3BInsertion%20order%20preserved" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** An ordered, index-based collection that allows duplicates — ArrayList, LinkedList, Vector and Stack.

## 🧠 1. What Is It?

A **List** is a child interface of `Collection` that keeps **insertion order**, allows **duplicates**, and gives **index based** access.

## 🧩 2. Implementations

```mermaid
flowchart TD
    L["📜 List"] --> A["ArrayList<br/>growable array"]
    L --> LL["LinkedList<br/>doubly linked list"]
    L --> V["Vector<br/>legacy, synchronized"] --> S["Stack<br/>LIFO"]
    style L fill:#203a43,color:#fff
```

## 📋 3. Comparison

| | ArrayList | LinkedList | Vector | Stack |
|---|---|---|---|---|
| Data structure | Growable array | Doubly linked list | Growable array | Vector subclass |
| Best for | Frequent **retrieval** | Frequent **insert/delete** | Legacy thread-safe code | LIFO processing |
| Synchronized | ❌ No | ❌ No | ✅ Yes | ✅ Yes |
| Default capacity | 10 | — | 10 | 10 |
| Growth rule | (current × 3 / 2) + 1 | — | current × 2 | current × 2 |
| Introduced | 1.2 | 1.2 | 1.0 (legacy) | 1.0 (legacy) |

## ⚙️ 4. How ArrayList Grows

```mermaid
flowchart LR
    A["capacity 10<br/>filled"] -->|add one more| B["new capacity<br/>(10 × 3 / 2) + 1 = 16"]
    B --> C["old elements copied<br/>into the new array"]
    style B fill:#fff3e0
```

## 🥞 5. Stack — LIFO

Stack follows the **Last-In-First-Out** principle, with `push()`, `pop()`, `peek()`, `empty()` and `search()`.

```mermaid
flowchart TD
    P["push C"] --> ST["🥞 C ⬅ top<br/>B<br/>A"]
    ST --> PO["pop ➜ removes C first"]
    style ST fill:#fff3e0
```

## 📌 6. Important Rules

- A `List` preserves **insertion order** and permits duplicates and multiple nulls.
- Use `ArrayList` when reading dominates, `LinkedList` when inserting and removing dominates.
- `Vector` and `Stack` are legacy classes kept for backward compatibility.

## 🔁 7. Quick Revision

> List = ordered + indexed + duplicates. ArrayList ➜ read, LinkedList ➜ modify, Vector/Stack ➜ legacy and synchronized.

---

<div align="center">

<a href="01-Collections-Introduction.md">⬅️ Collections Introduction</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="03-Set-Interface.md">Set Interface ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
