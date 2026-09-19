<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Looping%20Statements&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=for%20%E2%80%A2%20while%20%E2%80%A2%20do-while%3BEntry%20vs%20Exit%20control%3BNested%20and%20for-each%20loops" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** for, while, do-while and for-each repeat a block while a condition stays true.

## 🧠 1. What Is It?

A loop repeats a block of statements until the condition becomes false, or until every element of a collection has been visited. Instead of writing one print statement ten times, a loop does it once.

## 🧩 2. Loop Family

```mermaid
flowchart TD
    L["🔁 Loops"] --> F["for<br/><i>known count</i>"]
    L --> W["while<br/><i>entry control</i>"]
    L --> D["do-while<br/><i>exit control</i>"]
    L --> E["for-each<br/><i>arrays / collections</i>"]
    style L fill:#203a43,color:#fff
```

## 1️⃣ 3. while — Entry Control

The condition is checked **before** the body runs, so the body may run **zero** times.

```mermaid
flowchart TD
    S["Start"] --> C{"condition?"}
    C -->|true| B["body"] --> U["update"] --> C
    C -->|false| X["Exit"]
    style X fill:#ffcdd2
```

```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

## 2️⃣ 4. do-while — Exit Control

The body runs **first**, then the condition is checked, so the body always runs **at least once**.

```mermaid
flowchart TD
    S["Start"] --> B["body"] --> C{"condition?"}
    C -->|true| B
    C -->|false| X["Exit"]
    style B fill:#e8f5e9
```

```java
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

## 3️⃣ 5. for Loop

A `for` loop needs four parts:

| Part | Purpose | Optional? |
|---|---|---|
| **Initialization** | Sets the starting value, runs only once | Yes |
| **Condition** | Checked every pass; loop continues while true | Yes — omitting it makes the loop infinite |
| **Statement** | The loop body | — |
| **Increment / Decrement** | Moves the counter forward or backward | Yes |

```mermaid
flowchart LR
    I["1️⃣ init<br/>int i = 1"] --> C{"2️⃣ condition<br/>i <= 5"}
    C -->|true| B["3️⃣ body"] --> U["4️⃣ i++"] --> C
    C -->|false| X["Exit"]
```

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

## 4️⃣ 6. Nested for Loop

Writing a loop inside another loop.

```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.print(j + " ");
    }
    System.out.println();
}
```

## 5️⃣ 7. for-each (Enhanced for)

Introduced in Java 5.0, it walks through every element of an array or collection without an index.

```java
int[] numbers = {10, 20, 30};
for (int n : numbers) {
    System.out.println(n);
}
```

## 📋 8. while vs do-while vs for

| | while | do-while | for |
|---|---|---|---|
| Condition checked | Before the body | After the body | Before the body |
| Minimum runs | 0 | 1 | 0 |
| Control type | Entry | Exit | Entry |
| Best for | Unknown count | Run at least once | Known count |

## ⚠️ 9. Common Mistakes

- Forgetting the increment, which creates an infinite loop.
- Putting a semicolon after `for (...)` or `while (...)`.
- Off-by-one errors: `i <= n` versus `i < n`.

## ✅ 10. Best Practices

- Keep the loop variable scoped inside the `for` header.
- Use for-each when the index is not needed.

## 🔁 11. Quick Revision

> `while` = entry control, `do-while` = exit control (runs at least once), `for` = counted loop, for-each = element walk.

---

<div align="center">

<a href="03-Conditional-Statements.md">⬅️ Conditional Statements</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="05-Transfer-Statements.md">Transfer Statements ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
