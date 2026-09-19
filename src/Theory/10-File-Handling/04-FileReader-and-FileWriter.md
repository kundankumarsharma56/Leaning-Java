<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=FileReader%20and%20FileWriter&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=Reading%20text%20files%3BWriting%20text%20files%3BAppend%20vs%20overwrite" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** Character stream classes that read from and write to text files.

## 1. What Is It?

`FileReader` and `FileWriter` are **character stream** classes used to read and write **text** files.

## 2. Read And Write Flow

```mermaid
flowchart LR
    subgraph W["Writing"]
        P1["Program"] --> FW["FileWriter"] --> F1["File"]
    end
    subgraph R["Reading"]
        F2["File"] --> FR["FileReader"] --> BR["BufferedReader"] --> P2["Program"]
    end
    style W fill:#e4efe6
    style R fill:#e7eef7
```

## 3. Syntax

```java
FileWriter fw = new FileWriter("data.txt");        // overwrite
FileWriter fa = new FileWriter("data.txt", true);  // append

FileReader fr = new FileReader("data.txt");
BufferedReader br = new BufferedReader(fr);
```

## 4. Key Methods

| Class | Method | Purpose |
|---|---|---|
| `FileWriter` | `write(String)` | Writes text |
| `FileWriter` | `flush()` | Pushes buffered data to disk |
| `FileWriter` | `close()` | Flushes and releases the file |
| `FileReader` | `read()` | Reads one character, returns `-1` at the end |
| `BufferedReader` | `readLine()` | Reads a whole line, returns `null` at the end |

## 5. Important Rules

- `new FileWriter(file)` **erases** existing content unless the second argument is `true`.
- If the file does not exist, `FileWriter` creates it.
- Forgetting `close()` or `flush()` can leave the file empty.
- Reading a missing file throws `FileNotFoundException`.

## 6. Best Practices

- Wrap `FileReader` in a `BufferedReader` for line-by-line reading.
- Use try-with-resources so streams close automatically.

## 7. In Depth

`FileReader` and `FileWriter` are convenience classes, and their convenience hides one real problem: neither lets you specify a **character encoding**. They use the platform default, so a file written correctly on one machine can be read as nonsense on another. The explicit and portable form is `new InputStreamReader(new FileInputStream(f), StandardCharsets.UTF_8)`, or in modern code `Files.newBufferedReader(path, StandardCharsets.UTF_8)`.

**Reading a file is a tiny state machine.** `read()` returns an `int` rather than a `char` so that it can use `-1` to signal end of stream, and `readLine()` returns `null` for the same reason. Both values should be tested explicitly; treating `-1` as a character produces the classic garbage character at the end of the output.

**Writing has a buffering contract.** Characters are held until the buffer fills, `flush()` is called, or the stream is closed. For log-like output where every line must be visible immediately, `PrintWriter` can be constructed with auto-flush.

**Appending versus overwriting** is decided by a single boolean, and forgetting it is one of the more destructive beginner mistakes, because opening a file for writing truncates it before anything is written.

For anything beyond a few kilobytes of text, the concise modern forms are `Files.readAllLines()`, `Files.lines()` — which returns a lazy stream suitable for very large files — and `Files.write()`.

## 8. Quick Revision

> `FileWriter` writes (append flag matters), `FileReader` + `BufferedReader` reads lines. Always close.

---

<div align="center">

<a href="03-File-Class.md">← File Class</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="05-Serialization-and-Deserialization.md">Serialization and De-Serialization →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
