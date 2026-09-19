<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Command%20Line%20Arguments&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=Input%20without%20Scanner%3Bargs%5B%5D%20explained%3BAlways%20String%20type" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** Values passed after the class name arrive in the String[] args parameter of main.

## 1. What Is It?

Command line arguments are values supplied **while running the program**, which the JVM delivers to the `String[] args` parameter of `main`.

## 2. Flow

```mermaid
flowchart LR
    CMD["⌨ java Demo Kundan 25"] --> JVM["JVM"]
    JVM --> ARR["args = { \"Kundan\", \"25\" }"]
    ARR --> P["args[0] = Kundan<br/>args[1] = 25"]
    style CMD fill:#e7eef7
    style ARR fill:#f7eddd
    style P fill:#d5e8d6
```

## 3. Syntax

```bash
java ClassName value1 value2
```

## 4. Important Rules

- Every argument arrives as a **String**, even a number — convert with `Integer.parseInt(...)`.
- Arguments are separated by **spaces**; use double quotes to keep a phrase together.
- `args.length` gives the count; it is `0`, never `null`, when nothing is passed.
- Indexing starts at `0`, and `args[0]` is the **first argument**, not the class name.

## 5. Command Line Args vs Scanner

| | Command line args | Scanner |
|---|---|---|
| When supplied | Before the program starts | While the program runs |
| Type | Always String | Typed methods available |
| Best for | Configuration, automation | Interactive programs |

## 6. Common Mistakes

- Reading `args[0]` without checking `args.length`, causing `ArrayIndexOutOfBoundsException`.
- Doing arithmetic on `args[0]` directly without parsing it.

## 7. In Depth

The JVM parses the command line, splits it on whitespace, and hands the remaining tokens to `main` as a `String[]`. Everything before the class name belongs to the JVM rather than to the program: `-Xmx512m` sets heap size and `-Dkey=value` defines a system property, neither of which appears in `args`.

This gives a program two distinct channels of external configuration:

| Channel | Read with | Suited to |
|---|---|---|
| Command line arguments | `args[]` | Values that change on every run, such as a file name |
| System properties | `System.getProperty("key")` | Settings that tune the environment |
| Environment variables | `System.getenv("KEY")` | Machine-level configuration such as credentials or paths | Because arguments arrive as text, validation belongs at the very start of `main`: check `args.length` first, then parse, and fail with a clear usage message rather than an `ArrayIndexOutOfBoundsException` or `NumberFormatException`. Real command line tools use a library such as picocli or Apache Commons CLI to handle flags, defaults and help text, but the underlying mechanism is exactly this array.

## 8. Quick Revision

> `java Demo a b` → `args[0]="a"`, `args[1]="b"`. Always Strings, always check `args.length` first.

---

<div align="center">

<a href="04-StringBuilder.md">← StringBuilder</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="../05-OOPS-Part-1/README.md">OOPS Part 1 →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
