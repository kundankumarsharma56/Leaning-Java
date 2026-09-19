<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Streams&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Byte%20streams%20vs%20Character%20streams%3BInput%20and%20Output%3BFlow%20of%20data" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** A stream is a flow of data between a program and a source or destination.

## 🧠 1. What Is It?

Java performs all file-related operations through **i/o streams**. A stream is a **sequence of data** flowing from a source to a destination — it can be thought of as a pipe carrying bytes or characters.

## 🧩 2. Stream Classification

```mermaid
flowchart TD
    S["🌊 Streams"] --> B["Byte streams<br/><i>8-bit, binary data</i><br/>images, audio, PDF"]
    S --> C["Character streams<br/><i>16-bit, text data</i><br/>.txt, .csv, .json"]
    B --> BI["InputStream<br/>➜ FileInputStream"]
    B --> BO["OutputStream<br/>➜ FileOutputStream"]
    C --> CI["Reader<br/>➜ FileReader, BufferedReader"]
    C --> CO["Writer<br/>➜ FileWriter, BufferedWriter"]
    style S fill:#203a43,color:#fff
    style B fill:#e3f2fd
    style C fill:#e8f5e9
```

## 📋 3. Direction

| Direction | Byte stream root | Character stream root |
|---|---|---|
| **Input** (read into the program) | `InputStream` | `Reader` |
| **Output** (write out of the program) | `OutputStream` | `Writer` |

## ⚙️ 4. Buffered Streams

`BufferedReader` and `BufferedWriter` wrap another stream and keep a memory buffer, so the disk is touched far fewer times. This makes reading and writing significantly faster.

```mermaid
flowchart LR
    F["📄 File"] --> FR["FileReader<br/><i>one character at a time</i>"] --> BR["BufferedReader<br/><i>reads a whole line</i>"] --> P["☕ Program"]
    style BR fill:#c8e6c9
```

## 📌 5. Important Rules

- Use **byte** streams for binary data and **character** streams for text.
- Every stream must be **closed**, ideally with try-with-resources.
- Closing a wrapper stream also closes the stream it wraps.

## 🔁 6. Quick Revision

> Stream = flow of data. Byte ➜ InputStream/OutputStream; Character ➜ Reader/Writer; Buffered ➜ faster.

---

<div align="center">

<a href="01-File-Handling-Introduction.md">⬅️ File Handling Introduction</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="03-File-Class.md">File Class ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
