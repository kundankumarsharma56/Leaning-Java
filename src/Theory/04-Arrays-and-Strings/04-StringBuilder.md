<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=StringBuilder&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Faster%20than%20StringBuffer%3BNot%20thread%20safe%3BSingle-thread%20default%20choice" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** StringBuilder is the non-synchronized, faster version of StringBuffer.

## 🧠 1. What Is It?

`StringBuilder` was introduced in **Java 1.5** and offers exactly the same methods as `StringBuffer`, but **without synchronization**.

## 🧩 2. The Three Compared

```mermaid
flowchart TD
    T["✍️ Handling text"] --> A["String<br/>immutable<br/>thread safe"]
    T --> B["StringBuffer<br/>mutable<br/>synchronized ➜ thread safe<br/><i>slower</i>"]
    T --> C["StringBuilder<br/>mutable<br/>not synchronized<br/><i>fastest</i>"]
    style A fill:#e3f2fd
    style B fill:#fff3e0
    style C fill:#e8f5e9
```

## 📋 3. Comparison Table

| Feature | String | StringBuffer | StringBuilder |
|---|---|---|---|
| Mutable | ❌ No | ✅ Yes | ✅ Yes |
| Thread safe | ✅ Yes (immutable) | ✅ Yes (synchronized) | ❌ No |
| Performance | Slow for edits | Moderate | Fastest |
| Introduced in | 1.0 | 1.0 | 1.5 |
| Stored in pool | ✅ Literals only | ❌ No | ❌ No |

## 🧾 4. Syntax

```java
StringBuilder sb = new StringBuilder("Java");
sb.append(" Notes").reverse();
```

## ✅ 5. Which One To Choose

```mermaid
flowchart TD
    Q1{"Will the text change?"} -->|No| S["Use String"]
    Q1 -->|Yes| Q2{"Shared across threads?"}
    Q2 -->|Yes| B["Use StringBuffer"]
    Q2 -->|No| BD["Use StringBuilder"]
    style S fill:#e3f2fd
    style B fill:#fff3e0
    style BD fill:#c8e6c9
```

## 🔁 6. Quick Revision

> Same API as StringBuffer, minus synchronization. Single thread ➜ StringBuilder; shared threads ➜ StringBuffer.

---

<div align="center">

<a href="03-StringBuffer.md">⬅️ StringBuffer</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="05-Command-Line-Arguments.md">Command Line Arguments ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
