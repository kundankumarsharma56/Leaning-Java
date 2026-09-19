<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Optional%20Class&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Say%20goodbye%20to%20null%20checks%3BisPresent%20%E2%80%A2%20orElse%20%E2%80%A2%20map%3BA%20container%20for%20a%20maybe-value" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** A container object that may or may not hold a value, designed to avoid NullPointerException.

## 🧠 1. What Is It?

`java.util.Optional<T>` is a **container object** that may or may not contain a non-null value. It makes the possibility of "no value" explicit in the type, instead of silently returning `null`.

## 🧩 2. The Idea

```mermaid
flowchart LR
    M["🔍 findUser(id)"] --> O{"Optional&lt;User&gt;"}
    O -->|value present| P["get() / orElse()<br/>➜ the user"]
    O -->|empty| E["orElse(default)<br/>orElseThrow()"]
    style O fill:#fff3e0
    style P fill:#c8e6c9
    style E fill:#e3f2fd
```

## 📋 3. Creating And Using

| Method | Purpose |
|---|---|
| `Optional.of(value)` | Wraps a non-null value; throws if it is null |
| `Optional.ofNullable(value)` | Wraps a value that may be null |
| `Optional.empty()` | An empty container |
| `isPresent()` / `isEmpty()` | Checks for a value |
| `get()` | Returns the value — throws if empty |
| `orElse(default)` | Value, or a fallback |
| `orElseGet(supplier)` | Value, or a lazily created fallback |
| `orElseThrow()` | Value, or a chosen exception |
| `ifPresent(consumer)` | Runs an action only when a value exists |
| `map()` / `filter()` | Transforms or tests the contained value |

## ⚠️ 4. Common Mistakes

- Calling `get()` without checking, which reintroduces the very crash Optional was designed to prevent.
- Using `Optional` for fields or method parameters — it is intended mainly for **return types**.

## 🔁 5. Quick Revision

> `Optional` makes "maybe no value" explicit. Prefer `orElse` / `ifPresent` over `get()`.

---

<div align="center">

<a href="06-Method-References.md">⬅️ Method References</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="08-Date-and-Time-API.md">Date and Time API ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
