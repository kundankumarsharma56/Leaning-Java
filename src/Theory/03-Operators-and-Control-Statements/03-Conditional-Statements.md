<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Conditional%20Statements&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=if%20%E2%80%A2%20if-else%20%E2%80%A2%20nested%20if%3Bif-else-if%20ladder%3Bswitch%20case" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** if, if-else, nested if, if-else-if and switch pick which block of code runs.

## 🧠 1. What Is It?

Conditional statements execute a group of statements **based on a condition**. They evaluate a **boolean expression** to make the decision.

## 🧩 2. Decision Flow

```mermaid
flowchart TD
    ST["Start"] --> C{"condition"}
    C -->|true| T["✅ true block"]
    C -->|false| F["❌ false block / skip"]
    T --> E["Continue"]
    F --> E
    style T fill:#c8e6c9
    style F fill:#ffcdd2
```

## 1️⃣ 3. Simple if

If the condition is **true** the block runs; if it is **false** the block is ignored.

```java
if (condition) {
    // statements
}
```

```java
int age = 20;
if (age >= 18) {
    System.out.println("Eligible to vote");
}
```

## 2️⃣ 4. if-else

Picks one block out of two.

```mermaid
flowchart LR
    C{"age >= 18 ?"} -->|true| A["print Eligible"]
    C -->|false| B["print Not Eligible"]
    style A fill:#c8e6c9
    style B fill:#ffcdd2
```

```java
int age = 15;
if (age >= 18) {
    System.out.println("Eligible");
} else {
    System.out.println("Not Eligible");
}
```

## 3️⃣ 5. Nested if

Writing an `if` inside another `if`.

```java
int age = 25;
double salary = 150000;
if (age < 30) {
    if (salary > 100000) {
        System.out.println("Eligible");
    }
}
```

## 4️⃣ 6. if-else-if Ladder

Used when a value must be compared with **more than two** conditions. Conditions are checked **top to bottom**; the first match runs, and if nothing matches the final `else` runs.

```mermaid
flowchart TD
    C1{"marks >= 75"} -->|true| D1["Distinction"]
    C1 -->|false| C2{"marks >= 60"}
    C2 -->|true| D2["First Class"]
    C2 -->|false| C3{"marks >= 35"}
    C3 -->|true| D3["Pass"]
    C3 -->|false| D4["Fail"]
    style D1 fill:#c8e6c9
    style D4 fill:#ffcdd2
```

```java
int marks = 62;
if (marks >= 75) {
    System.out.println("Distinction");
} else if (marks >= 60) {
    System.out.println("First Class");
} else if (marks >= 35) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

## 5️⃣ 7. switch Statement

`switch` compares a value and executes one matching case block. It behaves like an `if-else-if` ladder.

Points to remember:

- There can be one or **N** cases.
- Case values must be **unique**.
- A case value must be of the **same type** as the switch expression.
- `break` in each case is **optional**, but without it execution falls through to the next case.

```mermaid
flowchart TD
    S["switch (day)"] --> C1{"case 1"}
    C1 -->|match| B1["Monday ➜ break"]
    C1 -->|no| C2{"case 2"}
    C2 -->|match| B2["Tuesday ➜ break"]
    C2 -->|no| D["default"]
    B1 --> X["Exit switch"]
    B2 --> X
    D --> X
```

```java
int day = 2;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Other day");
}
```

## ⚠️ 8. Common Mistakes

- Using `=` instead of `==` inside the condition.
- Forgetting `break`, which causes unintended fall-through.
- Placing a semicolon right after `if (condition);` so the block always runs.

## ✅ 9. Best Practices

- Always use braces `{ }`, even for a single statement.
- Prefer `switch` over a long ladder when comparing one variable against fixed values.

## 🔁 10. Quick Revision

> `if` ➜ one path • `if-else` ➜ two paths • ladder ➜ many paths • `switch` ➜ many fixed values.

---

<div align="center">

<a href="02-Control-Statements.md">⬅️ Control Statements</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="04-Looping-Statements.md">Looping Statements ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
