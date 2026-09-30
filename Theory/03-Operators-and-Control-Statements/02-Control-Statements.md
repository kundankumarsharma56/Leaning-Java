<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Control%20Statements&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=Conditional%20%E2%80%A2%20Loop%20%E2%80%A2%20Transfer%3BChange%20the%20default%20flow%3BThe%20map%20of%20flow%20control" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** Control statements decide which part of the code runs, how often, and where control jumps next.

## 1. What Is It?

By default Java executes statements **in sequence, one after another**. Control statements let us decide whether a specific part of the code will run at all, run repeatedly, or be skipped.

## 2. The Three Families

```mermaid
flowchart TD
    C["Control Statements"] --> S["1. Selection / Conditional<br/>if • if-else • nested if<br/>if-else-if • switch"]
    C --> L["2. Loop<br/>for • while • do-while<br/>for-each"]
    C --> T["3. Jump / Transfer<br/>break • continue • return"]
    style C fill:#1f3b57,color:#fff
    style S fill:#e7eef7
    style L fill:#e4efe6
    style T fill:#f7eddd
```

## 3. Default Flow vs Controlled Flow

```mermaid
flowchart LR
    subgraph DEF["Default: sequential"]
        A1["Statement 1"] --> A2["Statement 2"] --> A3["Statement 3"]
    end
    subgraph CTRL["With control statements"]
        B1["Statement 1"] --> B2{"condition?"}
        B2 -->|true| B3["Block A"]
        B2 -->|false| B4["Block B"]
        B3 --> B5["Continue"]
        B4 --> B5
    end
```

## 4. Simple Example

```java
public class ControlDemo {
    public static void main(String[] args) {
        int marks = 72;
        if (marks >= 35) {          // conditional
            System.out.println("Pass");
        }
        for (int i = 1; i <= 3; i++) {   // loop
            if (i == 2) continue;        // transfer
            System.out.println(i);
        }
    }
}
```

## 5. Quick Map

| Family | Members | Purpose |
|---|---|---|
| Conditional | `if`, `if-else`, nested `if`, `if-else-if`, `switch` | Choose a block based on a condition |
| Loop | `for`, `while`, `do-while`, for-each | Repeat a block |
| Transfer | `break`, `continue`, `return` | Move control from one place to another |

## 6. In Depth

Every control statement in Java is built from two primitives that the bytecode actually contains: a **conditional jump** and an **unconditional jump**. An `if` compiles to a comparison plus a jump over the block; a `while` loop compiles to a condition, a body and a jump back to the condition. Recognising this explains why a loop and a recursive method can express the same thing, and why `break` and `continue` cost nothing at runtime.

Structured programming, which Java follows, restricts those jumps to a few disciplined shapes — sequence, selection and iteration — because unrestricted jumping produces code that cannot be reasoned about. This is precisely why `goto` is reserved but unusable.

Two rules the compiler enforces around control flow are worth knowing:

- **Definite assignment.** A local variable must be assigned on every path that reaches its use. If it is assigned only inside an `if` with no `else`, the compiler rejects the later read.
- **Unreachable code.** Statements that can never execute, such as code after an unconditional `return` in the same block, are a compile error rather than a warning.

The condition in every Java control statement must be a **boolean**. Unlike C, a number or a reference cannot stand in for a condition, which eliminates the classic bug of writing `if (x = 5)` instead of `if (x == 5)`.

## 7. Quick Revision

> Three families: **decide (conditional), repeat (loop), jump (transfer)**.

---

<div align="center">

<a href="01-Operators.md">← Operators</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="03-Conditional-Statements.md">Conditional Statements →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
