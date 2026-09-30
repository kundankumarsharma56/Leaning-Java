<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Map%20Interface&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=Key%20%E2%9E%9C%20Value%20pairs%3BHashMap%20%E2%80%A2%20TreeMap%20%E2%80%A2%20Hashtable%3BKeys%20unique%2C%20values%20can%20repeat" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** A Map stores key–value pairs with unique keys, outside the Collection hierarchy.

## 1. What Is It?

A **Map** stores data as **key–value pairs**. Keys must be **unique**; values may repeat. A Map is **not** a child of `Collection` — it forms its own branch.

## 2. Structure

```mermaid
flowchart LR
    subgraph MAP["Map"]
        K1["key: 101"] --> V1["value: Kundan"]
        K2["key: 102"] --> V2["value: Ravi"]
        K3["key: 103"] --> V3["value: Kundan"]
    end
    N1["Keys unique"] -.- MAP
    N2["Values can duplicate"] -.- MAP
    style MAP fill:#f7eddd
```

## 3. Implementations

| | HashMap | LinkedHashMap | TreeMap | Hashtable |
|---|---|---|---|---|
| Order | Unordered | Insertion order | Sorted by key | Unordered |
| Structure | Hashtable | Hashtable + linked list | Balanced tree |Hashtable |
| Synchronized | No | No | No | Yes |
| `null` key | One | One | No | No |
| `null` values | Many | Many | Many | No |
| Introduced | 1.2 | 1.4 | 1.2 | 1.0 (legacy) |

> `IdentityHashMap` compares keys with `==` instead of `.equals()`, and `WeakHashMap` lets the garbage collector reclaim keys that are no longer referenced elsewhere.

## 4. Common Operations

| Method | Purpose |
|---|---|
| `put(k, v)` | Adds or replaces a pair |
| `get(k)` | Returns the value, or `null` |
| `remove(k)` | Deletes the pair |
| `containsKey(k)` / `containsValue(v)` | Membership checks |
| `keySet()` | All keys as a Set |
| `values()` | All values as a Collection |
| `entrySet()` | All key–value pairs for iteration |

## 5. Important Rules

- Inserting an existing key **replaces** the old value and returns it.
- A key used in a `HashMap` should have a correct `hashCode()` and `equals()`.
- `TreeMap` keys must be comparable and cannot be `null`.

## 6. In Depth

`Map` is deliberately outside the `Collection` hierarchy because its element is a **pair**, not a single value. The three view methods — `keySet()`, `values()` and `entrySet()` — bridge the two worlds, and they are **views**, not copies: removing from the key set removes the entry from the map itself.

**Iterating with `entrySet()`** is the efficient choice, because using `keySet()` and then calling `get()` for each key performs a second lookup per entry.

**`HashMap` internals** are the same hashing mechanism described for `HashSet`: buckets, a 0.75 load factor, resizing by doubling and tree-ification of heavily collided buckets since Java 8. It permits one `null` key, which it stores in bucket zero.

**`Hashtable` versus `ConcurrentHashMap`.** `Hashtable` synchronises every method on a single lock, so only one thread can touch the map at a time. `ConcurrentHashMap` locks only the affected bucket, allowing genuine parallel reads and writes, and is the correct choice for concurrent code today. `Collections.synchronizedMap()` sits in between, wrapping an existing map with a single lock.

Java 8 added methods that eliminate common boilerplate: `getOrDefault()`, `putIfAbsent()`, `computeIfAbsent()`, `merge()` and `forEach()`. `computeIfAbsent()` is particularly useful for building a map of lists in one line instead of a null check followed by a put.

## 7. Quick Revision

> Map = unique keys → values. HashMap → fast, LinkedHashMap → ordered, TreeMap → sorted, Hashtable → legacy synchronized.

---

<div align="center">

<a href="03-Set-Interface.md">← Set Interface</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="05-Cursors-and-Sorting.md">Cursors and Sorting →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
