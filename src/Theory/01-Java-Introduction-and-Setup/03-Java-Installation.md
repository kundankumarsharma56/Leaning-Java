<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Java%20Installation&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Install%20the%20JDK%3BSet%20the%20PATH%20variable%3BVerify%20with%20java%20-version" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** Install the JDK, set the PATH to the bin folder, then verify with java -version.

## 🧠 1. What Is It?

Environment setup means installing Java software and telling the operating system where its tools live.

## 🧩 2. Setup Flow

```mermaid
flowchart TD
    A["⬇️ Step 1<br/>Download & install JDK"] --> B["📁 Two folders appear<br/>JDK and JRE"]
    B --> C["⚙️ Step 2<br/>Set PATH to the JDK bin folder"]
    C --> D["🔍 Step 3<br/>Verify: java -version"]
    D -->|version shown| E["✅ Setup successful"]
    D -->|command not recognised| F["❌ Fix the PATH and retry"]
    style E fill:#c8e6c9
    style F fill:#ffcdd2
```

## ⚙️ 3. Step By Step

**Step 1 — Install**
Download the JDK and run the installer. After installation you will see a **JDK** folder and a **JRE** folder.

**Step 2 — Set PATH (Windows)**
`Environment Variables ➜ System Variables ➜ Edit Path ➜ add the JDK bin directory`

```
Path = C:\Program Files\Java\jdk-21\bin
```

**Step 3 — Verify**

```bash
java -version
javac -version
```

## 🧱 4. JDK vs JRE vs JVM

```mermaid
flowchart LR
    subgraph JDK["🧰 JDK — develop"]
        subgraph JRE["📚 JRE — run"]
            JVM["⚙️ JVM — execute"]
        end
        T["javac, jar, javadoc, debugger"]
    end
    style JDK fill:#e3f2fd
    style JRE fill:#fff3e0
    style JVM fill:#f89820,color:#fff
```

| Term | Responsibility |
|---|---|
| **JDK** | Set of tools used to **develop** Java programs |
| **JRE** | Provides the platform required to **run** Java programs |
| **JVM** | Handles **execution**, memory allocation and de-allocation |

## ⚠️ 5. Common Mistakes

- Pointing PATH at the JDK folder instead of the **bin** folder inside it.
- Forgetting to reopen the command prompt after editing PATH.
- Installing only a JRE and then wondering why `javac` is missing.

## ✅ 6. Best Practices

- Keep one primary JDK version per machine while learning.
- Verify both `java` and `javac` — the second one proves the JDK, not just the JRE, is on PATH.

## 🔁 7. Quick Revision

> Install JDK ➜ set PATH to `...\jdk\bin` ➜ verify with `java -version`.
> **JDK ⊃ JRE ⊃ JVM.**

---

<div align="center">

<a href="02-Java-Features.md">⬅️ Java Features</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="04-Program-Execution-Flow.md">Program Execution Flow ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
