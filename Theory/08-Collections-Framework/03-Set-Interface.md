<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Set%20Interface&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=No%20duplicates%20allowed%3BHashSet%20%E2%80%A2%20LinkedHashSet%20%E2%80%A2%20TreeSet%3BSorting%20needs%20Comparable" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** An unordered collection that never allows duplicate elements.

## 1. What Is It?

A **Set** is a child interface of `Collection` that does **not allow duplicate** elements. Most implementations do not preserve insertion order.

## 2. Implementations

```mermaid
flowchart TD
    S["Set"] --> H["HashSet<br/>hashtable • unordered • fastest"]
    H --> LH["LinkedHashSet<br/>hashtable + linked list<br/>→ insertion order kept"]
    S --> SS["SortedSet"] --> NS["NavigableSet"] --> T["TreeSet<br/>balanced tree → sorted order"]
    style S fill:#1f3b57,color:#fff
    style T fill:#e4efe6
```

## 3. Comparison

| | HashSet | LinkedHashSet | TreeSet |
|---|---|---|---|
| Underlying structure | Hashtable | Hashtable + linked list | Balanced tree |
| Order | Unpredictable | Insertion order | Sorted (natural or custom) |
| Duplicates | No | No | No |
| `null` allowed | One | One | Throws `NullPointerException` |
| Performance | Fastest | Slightly slower | Slowest (sorting cost) |
| Introduced | 1.2 | 1.4 | 1.2 |

## 4. How Duplicates Are Blocked

```mermaid
flowchart TD
    A["add(element)"] --> B["compute hashCode()"]
    B --> C{"bucket already<br/>has this hash?"}
    C -->|no| D["stored"]
    C -->|yes| E{"equals() says same?"}
    E -->|yes| F["rejected as duplicate"]
    E -->|no| D
    style D fill:#d5e8d6
    style F fill:#f4dada
```

This is exactly why `equals()` and `hashCode()` must be overridden together for custom objects.

## 5. Important Rules

- `TreeSet` elements must be **comparable**, otherwise a `ClassCastException` is thrown at runtime.
- `TreeSet` does not accept `null` because it must compare every element.
- `add()` returns `false` when the element is already present.

## 6. In Depth

A `HashSet` is really a `HashMap` with a constant dummy value, so everything about hashing applies directly to it.

**How a hash lookup works.** The key's `hashCode()` is computed and spread, then reduced to a bucket index. Within that bucket, candidates are compared using `equals()`. With a good hash function, both adding and searching are constant time on average. When many keys collide, the bucket degrades into a list — and since Java 8 a heavily collided bucket is converted into a balanced tree, limiting worst-case lookup to O(log n).

**Resizing.** The default capacity is 16 with a load factor of 0.75, so the table doubles once it is three-quarters full, rehashing every element. Sizing the set correctly up front avoids repeated rehashing when the element count is known.

**This is why the equals/hashCode contract matters.** An object whose `hashCode()` changes after insertion is stored in one bucket and searched for in another, so it appears to vanish from the set even though it is still in memory. Elements used in hash-based collections should therefore be immutable in the fields that define their identity.

`TreeSet` takes a different approach entirely: it maintains a red-black tree ordered by `Comparable` or a supplied `Comparator`, giving sorted iteration and range queries such as `headSet()`, `tailSet()`, `first()` and `ceiling()`, at O(log n) per operation. It rejects `null` because every element must be comparable.

## 7. Quick Revision

> Set = no duplicates. HashSet → fast & unordered, LinkedHashSet → insertion order, TreeSet → sorted.

---

<div align="center">

<a href="02-List-Interface.md">← List Interface</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="04-Map-Interface.md">Map Interface →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
