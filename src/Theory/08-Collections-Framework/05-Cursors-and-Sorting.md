<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Cursors%20and%20Sorting&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Iterator%20%E2%80%A2%20ListIterator%20%E2%80%A2%20Enumeration%3BComparable%20vs%20Comparator%3BNatural%20vs%20custom%20sorting" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** Iterator, ListIterator and Enumeration walk a collection; Comparable and Comparator sort it.

## 🧠 1. What Is It?

**Cursors** are objects used to retrieve elements from a collection one at a time. **Comparable** and **Comparator** define how elements are ordered.

## 🧩 2. The Three Cursors

```mermaid
flowchart TD
    C["🧭 Cursors"] --> E["Enumeration<br/><i>legacy, Vector only</i><br/>read only, forward"]
    C --> I["Iterator<br/><i>any Collection</i><br/>forward + remove"]
    C --> L["ListIterator<br/><i>List only</i><br/>both directions + add/set"]
    style C fill:#203a43,color:#fff
    style L fill:#e8f5e9
```

| | Enumeration | Iterator | ListIterator |
|---|---|---|---|
| Applies to | Legacy classes (Vector) | Any Collection | List only |
| Direction | Forward | Forward | Forward and backward |
| Can remove | ❌ | ✅ | ✅ |
| Can add / replace | ❌ | ❌ | ✅ |
| Methods | `hasMoreElements()`, `nextElement()` | `hasNext()`, `next()`, `remove()` | plus `hasPrevious()`, `previous()`, `add()`, `set()` |
| Obtained from | `v.elements()` | `c.iterator()` | `list.listIterator()` |

## ⚖️ 3. Comparable vs Comparator

| | Comparable | Comparator |
|---|---|---|
| Package | `java.lang` | `java.util` |
| Method | `compareTo(Object)` | `compare(Object, Object)` |
| Sorting type | **Natural / default** order | **Custom** order |
| Where written | Inside the class itself | In a separate class or lambda |
| Number of orders | Only one | Many, one per Comparator |
| Used by | `Collections.sort(list)`, `TreeSet`, `TreeMap` | `Collections.sort(list, comparator)` |

```mermaid
flowchart LR
    A["Need one natural order<br/>e.g. sort students by roll number"] --> B["Implement Comparable"]
    C["Need several orders<br/>by name, by marks, by age"] --> D["Write Comparators"]
    style B fill:#e3f2fd
    style D fill:#e8f5e9
```

## 🧾 4. Return Value Meaning

| Result | Meaning |
|---|---|
| Negative | First object comes **before** the second |
| Zero | Both are considered **equal** |
| Positive | First object comes **after** the second |

## 🧰 5. The Collections Utility Class

`java.util.Collections` provides static helpers: `sort()`, `reverse()`, `shuffle()`, `max()`, `min()`, `binarySearch()`, `unmodifiableList()` and `synchronizedList()`.

## 📌 6. Important Rules

- Modifying a collection while iterating it throws `ConcurrentModificationException` — remove through the iterator instead.
- `TreeSet` and `TreeMap` rely on `Comparable` unless a `Comparator` is supplied at construction.

## 🔁 7. Quick Revision

> Enumeration (legacy) ➜ Iterator (universal) ➜ ListIterator (List, two-way). Comparable = one natural order; Comparator = many custom orders.

---

<div align="center">

<a href="04-Map-Interface.md">⬅️ Map Interface</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="../09-Multi-Threading/README.md">Multi-Threading ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
