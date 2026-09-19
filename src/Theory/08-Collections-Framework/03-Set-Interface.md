<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Set%20Interface&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=No%20duplicates%20allowed%3BHashSet%20%E2%80%A2%20LinkedHashSet%20%E2%80%A2%20TreeSet%3BSorting%20needs%20Comparable" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** An unordered collection that never allows duplicate elements.

## 🧠 1. What Is It?

A **Set** is a child interface of `Collection` that does **not allow duplicate** elements. Most implementations do not preserve insertion order.

## 🧩 2. Implementations

```mermaid
flowchart TD
    S["📜 Set"] --> H["HashSet<br/>hashtable • unordered • fastest"]
    H --> LH["LinkedHashSet<br/>hashtable + linked list<br/>➜ insertion order kept"]
    S --> SS["📜 SortedSet"] --> NS["📜 NavigableSet"] --> T["TreeSet<br/>balanced tree ➜ sorted order"]
    style S fill:#203a43,color:#fff
    style T fill:#e8f5e9
```

## 📋 3. Comparison

| | HashSet | LinkedHashSet | TreeSet |
|---|---|---|---|
| Underlying structure | Hashtable | Hashtable + linked list | Balanced tree |
| Order | Unpredictable | Insertion order | Sorted (natural or custom) |
| Duplicates | ❌ | ❌ | ❌ |
| `null` allowed | ✅ One | ✅ One | ❌ Throws `NullPointerException` |
| Performance | Fastest | Slightly slower | Slowest (sorting cost) |
| Introduced | 1.2 | 1.4 | 1.2 |

## ⚙️ 4. How Duplicates Are Blocked

```mermaid
flowchart TD
    A["add(element)"] --> B["compute hashCode()"]
    B --> C{"bucket already<br/>has this hash?"}
    C -->|no| D["✅ stored"]
    C -->|yes| E{"equals() says same?"}
    E -->|yes| F["❌ rejected as duplicate"]
    E -->|no| D
    style D fill:#c8e6c9
    style F fill:#ffcdd2
```

This is exactly why `equals()` and `hashCode()` must be overridden together for custom objects.

## 📌 5. Important Rules

- `TreeSet` elements must be **comparable**, otherwise a `ClassCastException` is thrown at runtime.
- `TreeSet` does not accept `null` because it must compare every element.
- `add()` returns `false` when the element is already present.

## 🔁 6. Quick Revision

> Set = no duplicates. HashSet ➜ fast & unordered, LinkedHashSet ➜ insertion order, TreeSet ➜ sorted.

---

<div align="center">

<a href="02-List-Interface.md">⬅️ List Interface</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="04-Map-Interface.md">Map Interface ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
