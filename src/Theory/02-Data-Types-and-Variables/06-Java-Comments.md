<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Java%20Comments&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=3%20types%20of%20comments%3B//%20and%20/%2A%20%2A/%20and%20/%2A%2A%20%2A/%3BSkipped%20by%20the%20compiler" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** Single line, multi line and documentation comments are skipped by the compiler.

## 🧠 1. What Is It?

Comments are notes for humans. **Commented code does not participate in compilation or execution** — the compiler skips those lines.

## 🧩 2. Three Types

```mermaid
flowchart TD
    C["💬 Java Comments"] --> S["Single line<br/><code>// text</code>"]
    C --> M["Multi line<br/><code>/* text */</code>"]
    C --> D["Documentation<br/><code>/** text */</code><br/><i>generates API docs</i>"]
    style C fill:#203a43,color:#fff
    style S fill:#e8f5e9
    style M fill:#fff3e0
    style D fill:#e3f2fd
```

## 🧾 3. Syntax

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

## 🧪 4. Simple Example

```java
public class CommentDemo {
    public static void main(String[] args) {
        // print a greeting
        System.out.println("Hello");
        /* System.out.println("skipped"); */
    }
}
```

## 📋 5. When To Use Which

| Type | Best for |
|---|---|
| `//` | A short note on one line |
| `/* */` | Temporarily disabling several lines |
| `/** */` | Public API descriptions processed by the `javadoc` tool |

## ⚠️ 6. Common Mistakes

- Nesting one `/* ... */` inside another — it does not compile.
- Explaining *what* the code does instead of *why* it does it.

## ✅ 7. Best Practices

- Write documentation comments above public classes and methods.
- Delete dead code instead of leaving it commented out forever.

## 🔁 8. Quick Revision

> `//` single line • `/* */` multi line • `/** */` documentation. All are invisible to the compiler.

---

<div align="center">

<a href="05-Java-Coding-Standards.md">⬅️ Java Coding Standards</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="07-Reading-Data-From-Keyboard.md">Reading Data From Keyboard ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
