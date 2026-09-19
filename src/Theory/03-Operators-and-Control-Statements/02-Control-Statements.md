<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Control%20Statements&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Conditional%20%E2%80%A2%20Loop%20%E2%80%A2%20Transfer%3BChange%20the%20default%20flow%3BThe%20map%20of%20flow%20control" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** Control statements decide which part of the code runs, how often, and where control jumps next.

## 🧠 1. What Is It?

By default Java executes statements **in sequence, one after another**. Control statements let us decide whether a specific part of the code will run at all, run repeatedly, or be skipped.

## 🧩 2. The Three Families

```mermaid
flowchart TD
    C["🎛️ Control Statements"] --> S["1️⃣ Selection / Conditional<br/>if • if-else • nested if<br/>if-else-if • switch"]
    C --> L["2️⃣ Loop<br/>for • while • do-while<br/>for-each"]
    C --> T["3️⃣ Jump / Transfer<br/>break • continue • return"]
    style C fill:#203a43,color:#fff
    style S fill:#e3f2fd
    style L fill:#e8f5e9
    style T fill:#fff3e0
```

## ⚙️ 3. Default Flow vs Controlled Flow

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

## 🧪 4. Simple Example

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

## 📋 5. Quick Map

| Family | Members | Purpose |
|---|---|---|
| Conditional | `if`, `if-else`, nested `if`, `if-else-if`, `switch` | Choose a block based on a condition |
| Loop | `for`, `while`, `do-while`, for-each | Repeat a block |
| Transfer | `break`, `continue`, `return` | Move control from one place to another |

## 🔁 6. Quick Revision

> Three families: **decide (conditional), repeat (loop), jump (transfer)**.

---

<div align="center">

<a href="01-Operators.md">⬅️ Operators</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="03-Conditional-Statements.md">Conditional Statements ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
