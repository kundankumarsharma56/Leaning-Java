<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=String&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=String%20is%20immutable%3BString%20pool%20explained%3B%3D%3D%20vs%20equals%28%29" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** String is an immutable sequence of characters and a predefined class in java.lang.

## 🧠 1. What Is It?

`String` is a **predefined class** available in the `java.lang` package, used to store a **group of characters**. Because every Java class can act as a data type, `String` is used as a reference data type. Double quotes are mandatory for String values.

## 🔒 2. Immutability

A String object **cannot be changed** once created. Any operation that looks like a change actually creates a **new object**.

```mermaid
flowchart LR
    A["s = \"Java\""] -->|s.concat(\" 8\")| B["new object: \"Java 8\""]
    A -.->|original unchanged| A2["\"Java\" still in memory"]
    style A fill:#e3f2fd
    style B fill:#c8e6c9
```

## 🧩 3. String Constant Pool

```mermaid
flowchart TD
    subgraph HEAP["🧺 Heap"]
        subgraph SCP["📚 String Constant Pool"]
            P1["\"Kundan\""]
        end
        O1["new String(\"Kundan\")<br/><i>separate object</i>"]
    end
    R1["s1"] --> P1
    R2["s2"] --> P1
    R3["s3"] --> O1
    style SCP fill:#fff3e0
```

| Creation style | Where it lives | Reused? |
|---|---|---|
| `String s = "Kundan";` | String Constant Pool | ✅ Yes, if the same literal already exists |
| `String s = new String("Kundan");` | Heap, outside the pool | ❌ Always a new object |

## ⚖️ 4. == vs equals()

| Comparison | Compares | Use for |
|---|---|---|
| `==` | **Reference** (memory address) | Checking whether two variables point to the same object |
| `.equals()` | **Content** (characters) | Checking whether the text is the same |

## 📋 5. Frequently Used Methods

| Method | Purpose |
|---|---|
| `length()` | Number of characters |
| `charAt(int)` | Character at an index |
| `substring(int, int)` | Part of the String |
| `indexOf(String)` | Position of a sub-string |
| `toUpperCase()` / `toLowerCase()` | Case conversion |
| `trim()` | Removes leading and trailing spaces |
| `replace(a, b)` | Replaces characters |
| `split(String)` | Breaks into an array |
| `concat(String)` | Joins two Strings |
| `equals()` / `equalsIgnoreCase()` | Content comparison |

## 📌 6. Important Rules

- `String` is **final** and immutable, which makes it thread-safe and safe as a map key.
- String literals are pooled; `new String(...)` bypasses the pool.
- `+` on Strings creates a new object every time, so it is costly inside loops.

## ⚠️ 7. Common Mistakes

- Comparing text with `==` instead of `.equals()`.
- Expecting `s.toUpperCase();` to change `s` — the result must be reassigned.
- Building large text with `+` in a loop instead of `StringBuffer` / `StringBuilder`.

## 🔁 8. Quick Revision

> String = immutable + pooled + final. Compare content with `.equals()`, never with `==`.

---

<div align="center">

<a href="01-Arrays.md">⬅️ Arrays</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="03-StringBuffer.md">StringBuffer ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
