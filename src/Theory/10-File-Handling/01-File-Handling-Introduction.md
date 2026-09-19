<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=File%20Handling%20Introduction&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Why%20file%20handling%20matters%3BCommon%20file%20operations%3Bjava.io%20package" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** Performing operations such as creating, reading, writing and deleting files.

## 🧠 1. What Is It?

File handling is a crucial part of any programming language. It means performing various operations on a file — reading, writing, editing and more.

Common file handling operations:

- Creating a new file
- Writing data into a file
- Reading data from an existing file
- Deleting a file

Java provides library classes and methods to do this easily. Almost all of them live in the **`java.io`** package, which must be imported before use.

## 🧩 2. Where File Handling Fits

```mermaid
flowchart LR
    P["☕ Java program<br/><i>data in memory</i>"] -->|write| F["📄 File on disk<br/><i>permanent storage</i>"]
    F -->|read| P
    N["Memory is lost when<br/>the program ends"] -.- P
    N2["Files survive after<br/>the program ends"] -.- F
    style P fill:#e3f2fd
    style F fill:#fff3e0
```

## 📋 3. Why It Is Needed

| Reason | Explanation |
|---|---|
| **Persistence** | Data stays available after the program stops |
| **Sharing** | Other programs and people can use the same file |
| **Volume** | Large data sets cannot be typed in each run |
| **Logging and configuration** | Real applications read settings and write logs |

## 🔁 4. Quick Revision

> File handling = create, read, write, delete — all through `java.io`, using streams.

---

<div align="center">

<a href="../09-Multi-Threading/05-Inter-Thread-Communication.md">⬅️ Inter Thread Communication</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="02-Streams.md">Streams ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
