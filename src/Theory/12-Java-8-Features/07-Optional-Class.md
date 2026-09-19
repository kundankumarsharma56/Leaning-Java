<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Optional%20Class&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=Say%20goodbye%20to%20null%20checks%3BisPresent%20%E2%80%A2%20orElse%20%E2%80%A2%20map%3BA%20container%20for%20a%20maybe-value" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** A container object that may or may not hold a value, designed to avoid NullPointerException.

## 1. What Is It?

`java.util.Optional<T>` is a **container object** that may or may not contain a non-null value. It makes the possibility of "no value" explicit in the type, instead of silently returning `null`.

## 2. The Idea

```mermaid
flowchart LR
    M["findUser(id)"] --> O{"Optional&lt;User&gt;"}
    O -->|value present| P["get() / orElse()<br/>→ the user"]
    O -->|empty| E["orElse(default)<br/>orElseThrow()"]
    style O fill:#f7eddd
    style P fill:#d5e8d6
    style E fill:#e7eef7
```

## 3. Creating And Using

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

## 4. Common Mistakes

- Calling `get()` without checking, which reintroduces the very crash Optional was designed to prevent.
- Using `Optional` for fields or method parameters — it is intended mainly for **return types**.

## 5. In Depth

`Optional` exists to make the **absence of a value part of the type**. A method returning `Optional<User>` tells every caller, at compile time, that there may be no user — information a plain `null` return never conveys.

The real gain comes from the **functional methods**, not from `isPresent()`. Writing `opt.map(User::getAddress).map(Address::getCity).orElse("Unknown")` replaces a chain of nested null checks, and returns an empty Optional at whatever point the chain breaks. Using `isPresent()` followed by `get()` simply reproduces the null check with more words.

`orElse()` and `orElseGet()` differ in an important way: the argument to `orElse()` is evaluated **always**, even when a value is present, while `orElseGet()` takes a supplier and evaluates it only when needed. If the fallback is expensive or has side effects, that distinction matters.

`Optional` was designed specifically as a **return type**. It is deliberately not serialisable, so it is a poor choice for fields, and using it as a parameter forces every caller to wrap arguments. Collections should return an empty collection rather than an `Optional` of one. Used as intended, it eliminates a whole class of null-related bugs; used everywhere, it adds ceremony without benefit.

## 6. Quick Revision

> `Optional` makes "maybe no value" explicit. Prefer `orElse` / `ifPresent` over `get()`.

---

<div align="center">

<a href="06-Method-References.md">← Method References</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="08-Date-and-Time-API.md">Date and Time API →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
