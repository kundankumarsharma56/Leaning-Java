<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Java%20Comments&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=3%20types%20of%20comments%3B//%20and%20/%2A%20%2A/%20and%20/%2A%2A%20%2A/%3BSkipped%20by%20the%20compiler" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** Single line, multi line and documentation comments are skipped by the compiler.

## 1. What Is It?

Comments are notes for humans. **Commented code does not participate in compilation or execution** — the compiler skips those lines.

## 2. Three Types

```mermaid
flowchart TD
    C["Java Comments"] --> S["Single line<br/><code>// text</code>"]
    C --> M["Multi line<br/><code>/* text */</code>"]
    C --> D["Documentation<br/><code>/** text */</code><br/><i>generates API docs</i>"]
    style C fill:#1f3b57,color:#fff
    style S fill:#e4efe6
    style M fill:#f7eddd
    style D fill:#e7eef7
```

## 3. Syntax

```java
// this is a single line comment

/*
   this is a
   multi line comment
*/

/**
 * This is a documentation comment.
 * @author kundan
 */
```

## 4. Simple Example

```java
public class CommentDemo {
    public static void main(String[] args) {
        // print a greeting
        System.out.println("Hello");
        /* System.out.println("skipped"); */
    }
}
```

## 5. When To Use Which

| Type | Best for |
|---|---|
| `//` | A short note on one line |
| `/* */` | Temporarily disabling several lines |
| `/** */` | Public API descriptions processed by the `javadoc` tool |

## 6. Common Mistakes

- Nesting one `/* ... */` inside another — it does not compile.
- Explaining *what* the code does instead of *why* it does it.

## 7. Best Practices

- Write documentation comments above public classes and methods.
- Delete dead code instead of leaving it commented out forever.

## 8. In Depth

Comments are removed by the compiler during lexical analysis, so they never appear in the `.class` file and cost nothing at runtime. There is one exception in spirit: **annotations** look like metadata for humans but are real language constructs that can survive into the bytecode and be read at runtime by frameworks.

**Documentation comments** are the most valuable of the three because they feed the `javadoc` tool, which generates the HTML API documentation that the entire Java standard library ships with. Their standard tags describe a method's contract:

| Tag | Describes |
|---|---|
| `@param` | One parameter and its meaning |
| `@return` | What the method gives back |
| `@throws` | When an exception is raised |
| `@author`, `@since`, `@deprecated` | Ownership, version history, replacement advice | A practical principle: comments should explain **why**, not **what**. A comment repeating the code adds noise and quickly becomes wrong, because the code changes and the comment does not. Comments that justify a decision, warn about a non-obvious constraint or record a business rule remain useful for years.

Commented-out code is the one form worth eliminating entirely. Version control already remembers every deleted line, so keeping dead code in the file only creates doubt about whether it still matters.

## 9. Quick Revision

> `//` single line • `/* */` multi line • `/** */` documentation. All are invisible to the compiler.

---

<div align="center">

<a href="05-Java-Coding-Standards.md">← Java Coding Standards</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="07-Reading-Data-From-Keyboard.md">Reading Data From Keyboard →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
