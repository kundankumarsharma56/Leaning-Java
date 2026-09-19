<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=StringBuilder&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=Faster%20than%20StringBuffer%3BNot%20thread%20safe%3BSingle-thread%20default%20choice" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** StringBuilder is the non-synchronized, faster version of StringBuffer.

## 1. What Is It?

`StringBuilder` was introduced in **Java 1.5** and offers exactly the same methods as `StringBuffer`, but **without synchronization**.

## 2. The Three Compared

```mermaid
flowchart TD
    T["Handling text"] --> A["String<br/>immutable<br/>thread safe"]
    T --> B["StringBuffer<br/>mutable<br/>synchronized → thread safe<br/><i>slower</i>"]
    T --> C["StringBuilder<br/>mutable<br/>not synchronized<br/><i>fastest</i>"]
    style A fill:#e7eef7
    style B fill:#f7eddd
    style C fill:#e4efe6
```

## 3. Comparison Table

| Feature | String | StringBuffer | StringBuilder |
|---|---|---|---|
| Mutable | No | Yes | Yes |
| Thread safe | Yes (immutable) | Yes (synchronized) | No |
| Performance | Slow for edits | Moderate | Fastest |
| Introduced in | 1.0 | 1.0 | 1.5 |
| Stored in pool | Literals only | No | No |

## 4. Syntax

```java
StringBuilder sb = new StringBuilder("Java");
sb.append("Notes").reverse();
```

## 5. Which One To Choose

```mermaid
flowchart TD
    Q1{"Will the text change?"} -->|No| S["Use String"]
    Q1 -->|Yes| Q2{"Shared across threads?"}
    Q2 -->|Yes| B["Use StringBuffer"]
    Q2 -->|No| BD["Use StringBuilder"]
    style S fill:#e7eef7
    style B fill:#f7eddd
    style BD fill:#d5e8d6
```

## 6. In Depth

`StringBuilder` and `StringBuffer` share a common package-private parent, `AbstractStringBuilder`, which contains all the real logic. The two subclasses differ only in whether their methods carry the `synchronized` modifier, so the behaviour is otherwise identical and switching between them requires no other change.

The performance gap is smaller than it once was, because the JVM can often eliminate uncontended locks through escape analysis and lock elision, but `StringBuilder` remains the correct default because it communicates intent: this buffer belongs to one thread.

Method chaining works because every mutating method returns `this`, allowing `sb.append(a).append(b).reverse()`. This is a small example of the fluent interface pattern used throughout the modern Java libraries.

Two practical notes: `toString()` copies the characters into a new immutable String, so it should be called once at the end rather than inside a loop; and `setLength(0)` reuses an existing builder without allocating a new one, which is useful in tight loops.

## 7. Quick Revision

> Same API as StringBuffer, minus synchronization. Single thread → StringBuilder; shared threads → StringBuffer.

---

<div align="center">

<a href="03-StringBuffer.md">← StringBuffer</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="05-Command-Line-Arguments.md">Command Line Arguments →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
