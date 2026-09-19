<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=StringBuffer&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Mutable%20strings%3BThread-safe%20by%20design%3BCapacity%20grows%20automatically" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** StringBuffer is a mutable, synchronized and thread-safe alternative to String.

## 🧠 1. What Is It?

`StringBuffer` is a **mutable** sequence of characters. Unlike `String`, its content can be modified **without creating a new object**.

## 🧩 2. String vs StringBuffer

```mermaid
flowchart LR
    subgraph S["String — immutable"]
        S1["\"Java\""] --> S2["new object \"JavaSE\""]
    end
    subgraph B["StringBuffer — mutable"]
        B1["\"Java\""] -->|append| B1
    end
    style S fill:#ffe0e0
    style B fill:#e8f5e9
```

## ⚙️ 3. How It Works

- Internally it holds a character array with a **capacity**.
- Default capacity is **16** characters.
- When the content exceeds the capacity, the new capacity becomes **(old capacity × 2) + 2**.
- All its methods are **synchronized**, which makes it **thread safe** but slightly slower.

## 🧾 4. Syntax

```java
StringBuffer sb = new StringBuffer("Java");
sb.append(" Notes");
```

## 📋 5. Common Methods

| Method | Purpose |
|---|---|
| `append(x)` | Adds at the end |
| `insert(index, x)` | Inserts at a position |
| `delete(start, end)` | Removes a range |
| `replace(start, end, str)` | Replaces a range |
| `reverse()` | Reverses the content |
| `capacity()` | Current capacity |
| `length()` | Current number of characters |

## 📌 6. Important Rules

- Content changes happen **in place** — no new object is created.
- `StringBuffer` has no String constant pool.
- Use it when the same text is modified many times.

## 🔁 7. Quick Revision

> StringBuffer = mutable + synchronized + thread safe. Capacity 16, grows as (n × 2) + 2.

---

<div align="center">

<a href="02-String.md">⬅️ String</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="04-StringBuilder.md">StringBuilder ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
