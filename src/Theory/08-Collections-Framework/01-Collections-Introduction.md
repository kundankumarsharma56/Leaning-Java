<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Collections%20Introduction&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Why%20collections%20exist%3BArray%20limitations%20solved%3BThe%20full%20hierarchy" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** Collections are growable containers with ready-made methods, built to replace fixed-size arrays.

## 🧠 1. What Is It?

An array represents a group of elements of the **same** data type, and its main advantage is representing many elements with a single variable. But arrays have hard limits:

1. **Fixed in size** — once created, the size cannot grow or shrink, so the size must be known in advance.
2. **Homogeneous only** — a `Car[]` cannot hold a `Bus`; using `Object[]` fixes this but loses type safety.
3. **No ready-made methods** — arrays are not built on a data structure, so every operation must be coded by hand.

**Collections** solve all three: they are **growable in nature**, can hold heterogeneous objects, and are built on standard data structures with ready-made method support.

## ⚖️ 2. Array vs Collection

| | Array | Collection |
|---|---|---|
| Size | Fixed | Growable |
| Data | Homogeneous only | Homogeneous or heterogeneous |
| Memory | Better (stores primitives) | Slightly more (objects only) |
| Performance | Faster | Slightly slower |
| Method support | None | Rich, ready-made |

## 🧩 3. Collections Hierarchy

```mermaid
flowchart TD
    IT["📜 Iterable"] --> C["📜 Collection"]
    C --> L["📜 List<br/><i>ordered, duplicates allowed</i>"]
    C --> S["📜 Set<br/><i>no duplicates</i>"]
    C --> Q["📜 Queue<br/><i>FIFO</i>"]
    L --> L1["ArrayList"]
    L --> L2["LinkedList"]
    L --> L3["Vector"] --> L4["Stack"]
    S --> S1["HashSet"] --> S2["LinkedHashSet"]
    S --> S3["📜 SortedSet"] --> S4["📜 NavigableSet"] --> S5["TreeSet"]
    Q --> Q1["PriorityQueue"]
    Q --> Q2["Deque ➜ ArrayDeque"]
    M["📜 Map<br/><i>key ➜ value, separate root</i>"] --> M1["HashMap"] --> M2["LinkedHashMap"]
    M --> M3["Hashtable"]
    M --> M4["📜 SortedMap ➜ TreeMap"]
    style C fill:#203a43,color:#fff
    style M fill:#f89820,color:#fff
```

> 📎 **Map is not a Collection.** It stores key–value pairs and sits in a separate branch of the framework.

## 📋 4. Core Interfaces

| Interface | Duplicates | Order | Null |
|---|---|---|---|
| **List** | ✅ Allowed | Insertion order kept, index based | Many nulls |
| **Set** | ❌ Not allowed | Usually unordered | One null (most implementations) |
| **Queue** | ✅ Allowed | First-In-First-Out | Depends on implementation |
| **Map** | Keys ❌, values ✅ | Depends on implementation | One null key (HashMap) |

## 🔁 5. Quick Revision

> Collections = growable + heterogeneous + ready-made methods. `Collection` is the root of List/Set/Queue; `Map` stands apart.

---

<div align="center">

<a href="../07-Packages-Wrapper-Exceptions/03-Exception-Handling.md">⬅️ Exception Handling</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="02-List-Interface.md">List Interface ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
