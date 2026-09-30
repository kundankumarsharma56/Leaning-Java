<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=String&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=String%20is%20immutable%3BString%20pool%20explained%3B%3D%3D%20vs%20equals%28%29" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** String is an immutable sequence of characters and a predefined class in java.lang.

## 1. What Is It?

`String` is a **predefined class** available in the `java.lang` package, used to store a **group of characters**. Because every Java class can act as a data type, `String` is used as a reference data type. Double quotes are mandatory for String values.

## 2. Immutability

A String object **cannot be changed** once created. Any operation that looks like a change actually creates a **new object**.

```mermaid
flowchart LR
    A["s = \"Java\""] -->|s.concat(\" 8\")| B["new object: \"Java 8\""]
    A -.->|original unchanged| A2["\"Java\" still in memory"]
    style A fill:#e7eef7
    style B fill:#d5e8d6
```

## 3. String Constant Pool

```mermaid
flowchart TD
    subgraph HEAP["Heap"]
        subgraph SCP["String Constant Pool"]
            P1["\"Kundan\""]
        end
        O1["new String(\"Kundan\")<br/><i>separate object</i>"]
    end
    R1["s1"] --> P1
    R2["s2"] --> P1
    R3["s3"] --> O1
    style SCP fill:#f7eddd
```

| Creation style | Where it lives | Reused? |
|---|---|---|
| `String s = "Kundan";` | String Constant Pool | Yes, if the same literal already exists |
| `String s = new String("Kundan");` | Heap, outside the pool | Always a new object |

## 4. == vs equals()

| Comparison | Compares | Use for |
|---|---|---|
| `==` | **Reference** (memory address) | Checking whether two variables point to the same object |
| `.equals()` | **Content** (characters) | Checking whether the text is the same |

## 5. Frequently Used Methods

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

## 6. Important Rules

- `String` is **final** and immutable, which makes it thread-safe and safe as a map key.
- String literals are pooled; `new String(...)` bypasses the pool.
- `+` on Strings creates a new object every time, so it is costly inside loops.

## 7. Common Mistakes

- Comparing text with `==` instead of `.equals()`.
- Expecting `s.toUpperCase();` to change `s` — the result must be reassigned.
- Building large text with `+` in a loop instead of `StringBuffer` / `StringBuilder`.

## 8. In Depth

Immutability is a design decision with concrete benefits, not an inconvenience.

- **Safe sharing.** Because the content can never change, many references can point at one object, which is what makes the constant pool possible and saves substantial memory in real applications.
- **Safe as a hash key.** A `HashMap` stores an entry in a bucket based on the key's hash code. If a key could change after insertion, its hash would no longer match its bucket and the entry would become unreachable. `String` caches its hash code precisely because it can never change.
- **Thread safety without locks.** An immutable object can be read by any number of threads with no synchronisation.
- **Security.** File paths, URLs and credentials are passed as Strings; if they were mutable, a value could be validated and then modified before use.

**The constant pool and `intern()`.** Literals are placed in the pool at class loading and reused. `new String("abc")` deliberately creates a separate object; calling `intern()` on it returns the pooled instance instead. Since Java 7 the pool lives in the heap rather than in PermGen, so pooled strings are garbage collected like any other object.

**Concatenation in a loop.** Each `+` on Strings creates a new object, so concatenating inside a loop produces quadratic work. The compiler optimises a single expression like `a + b + c` into a `StringBuilder` chain, but it cannot do that across loop iterations — which is why the explicit builder is required there.

`compareTo()` returns the difference in the first mismatching character and defines the natural, lexicographic order used by `Collections.sort()` and `TreeSet`.

## 9. Quick Revision

> String = immutable + pooled + final. Compare content with `.equals()`, never with `==`.

---

<div align="center">

<a href="01-Arrays.md">← Arrays</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="03-StringBuffer.md">StringBuffer →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
