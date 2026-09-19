<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Command%20Line%20Arguments&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Input%20without%20Scanner%3Bargs%5B%5D%20explained%3BAlways%20String%20type" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** Values passed after the class name arrive in the String[] args parameter of main.

## 🧠 1. What Is It?

Command line arguments are values supplied **while running the program**, which the JVM delivers to the `String[] args` parameter of `main`.

## 🧩 2. Flow

```mermaid
flowchart LR
    CMD["⌨️ java Demo Kundan 25"] --> JVM["⚙️ JVM"]
    JVM --> ARR["📦 args = { \"Kundan\", \"25\" }"]
    ARR --> P["args[0] = Kundan<br/>args[1] = 25"]
    style CMD fill:#e3f2fd
    style ARR fill:#fff3e0
    style P fill:#c8e6c9
```

## 🧾 3. Syntax

```bash
java ClassName value1 value2
```

## 📌 4. Important Rules

- Every argument arrives as a **String**, even a number — convert with `Integer.parseInt(...)`.
- Arguments are separated by **spaces**; use double quotes to keep a phrase together.
- `args.length` gives the count; it is `0`, never `null`, when nothing is passed.
- Indexing starts at `0`, and `args[0]` is the **first argument**, not the class name.

## ⚖️ 5. Command Line Args vs Scanner

| | Command line args | Scanner |
|---|---|---|
| When supplied | Before the program starts | While the program runs |
| Type | Always String | Typed methods available |
| Best for | Configuration, automation | Interactive programs |

## ⚠️ 6. Common Mistakes

- Reading `args[0]` without checking `args.length`, causing `ArrayIndexOutOfBoundsException`.
- Doing arithmetic on `args[0]` directly without parsing it.

## 🔁 7. Quick Revision

> `java Demo a b` ➜ `args[0]="a"`, `args[1]="b"`. Always Strings, always check `args.length` first.

---

<div align="center">

<a href="04-StringBuilder.md">⬅️ StringBuilder</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="../05-OOPS-Part-1/README.md">OOPS Part 1 ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
