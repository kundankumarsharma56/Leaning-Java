<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=FileReader%20and%20FileWriter&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Reading%20text%20files%3BWriting%20text%20files%3BAppend%20vs%20overwrite" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** Character stream classes that read from and write to text files.

## 🧠 1. What Is It?

`FileReader` and `FileWriter` are **character stream** classes used to read and write **text** files.

## 🧩 2. Read And Write Flow

```mermaid
flowchart LR
    subgraph W["✍️ Writing"]
        P1["☕ Program"] --> FW["FileWriter"] --> F1["📄 File"]
    end
    subgraph R["📖 Reading"]
        F2["📄 File"] --> FR["FileReader"] --> BR["BufferedReader"] --> P2["☕ Program"]
    end
    style W fill:#e8f5e9
    style R fill:#e3f2fd
```

## 🧾 3. Syntax

```java
FileWriter fw = new FileWriter("data.txt");        // overwrite
FileWriter fa = new FileWriter("data.txt", true);  // append

FileReader fr = new FileReader("data.txt");
BufferedReader br = new BufferedReader(fr);
```

## 📋 4. Key Methods

| Class | Method | Purpose |
|---|---|---|
| `FileWriter` | `write(String)` | Writes text |
| `FileWriter` | `flush()` | Pushes buffered data to disk |
| `FileWriter` | `close()` | Flushes and releases the file |
| `FileReader` | `read()` | Reads one character, returns `-1` at the end |
| `BufferedReader` | `readLine()` | Reads a whole line, returns `null` at the end |

## 📌 5. Important Rules

- `new FileWriter(file)` **erases** existing content unless the second argument is `true`.
- If the file does not exist, `FileWriter` creates it.
- Forgetting `close()` or `flush()` can leave the file empty.
- Reading a missing file throws `FileNotFoundException`.

## ✅ 6. Best Practices

- Wrap `FileReader` in a `BufferedReader` for line-by-line reading.
- Use try-with-resources so streams close automatically.

## 🔁 7. Quick Revision

> `FileWriter` writes (append flag matters), `FileReader` + `BufferedReader` reads lines. Always close.

---

<div align="center">

<a href="03-File-Class.md">⬅️ File Class</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="05-Serialization-and-Deserialization.md">Serialization and De-Serialization ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
