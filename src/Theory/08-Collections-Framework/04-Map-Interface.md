<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Map%20Interface&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Key%20%E2%9E%9C%20Value%20pairs%3BHashMap%20%E2%80%A2%20TreeMap%20%E2%80%A2%20Hashtable%3BKeys%20unique%2C%20values%20can%20repeat" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** A Map stores key–value pairs with unique keys, outside the Collection hierarchy.

## 🧠 1. What Is It?

A **Map** stores data as **key–value pairs**. Keys must be **unique**; values may repeat. A Map is **not** a child of `Collection` — it forms its own branch.

## 🧩 2. Structure

```mermaid
flowchart LR
    subgraph MAP["🗺️ Map"]
        K1["key: 101"] --> V1["value: Kundan"]
        K2["key: 102"] --> V2["value: Ravi"]
        K3["key: 103"] --> V3["value: Kundan"]
    end
    N1["🔑 Keys unique"] -.- MAP
    N2["💎 Values can duplicate"] -.- MAP
    style MAP fill:#fff3e0
```

## 📋 3. Implementations

| | HashMap | LinkedHashMap | TreeMap | Hashtable |
|---|---|---|---|---|
| Order | Unordered | Insertion order | Sorted by key | Unordered |
| Structure | Hashtable | Hashtable + linked list | Balanced tree |Hashtable |
| Synchronized | ❌ No | ❌ No | ❌ No | ✅ Yes |
| `null` key | ✅ One | ✅ One | ❌ No | ❌ No |
| `null` values | ✅ Many | ✅ Many | ✅ Many | ❌ No |
| Introduced | 1.2 | 1.4 | 1.2 | 1.0 (legacy) |

> `IdentityHashMap` compares keys with `==` instead of `.equals()`, and `WeakHashMap` lets the garbage collector reclaim keys that are no longer referenced elsewhere.

## ⚙️ 4. Common Operations

| Method | Purpose |
|---|---|
| `put(k, v)` | Adds or replaces a pair |
| `get(k)` | Returns the value, or `null` |
| `remove(k)` | Deletes the pair |
| `containsKey(k)` / `containsValue(v)` | Membership checks |
| `keySet()` | All keys as a Set |
| `values()` | All values as a Collection |
| `entrySet()` | All key–value pairs for iteration |

## 📌 5. Important Rules

- Inserting an existing key **replaces** the old value and returns it.
- A key used in a `HashMap` should have a correct `hashCode()` and `equals()`.
- `TreeMap` keys must be comparable and cannot be `null`.

## 🔁 6. Quick Revision

> Map = unique keys ➜ values. HashMap ➜ fast, LinkedHashMap ➜ ordered, TreeMap ➜ sorted, Hashtable ➜ legacy synchronized.

---

<div align="center">

<a href="03-Set-Interface.md">⬅️ Set Interface</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="05-Cursors-and-Sorting.md">Cursors and Sorting ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
