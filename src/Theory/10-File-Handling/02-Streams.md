<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Streams&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=Byte%20streams%20vs%20Character%20streams%3BInput%20and%20Output%3BFlow%20of%20data" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** A stream is a flow of data between a program and a source or destination.

## 1. What Is It?

Java performs all file-related operations through **i/o streams**. A stream is a **sequence of data** flowing from a source to a destination — it can be thought of as a pipe carrying bytes or characters.

## 2. Stream Classification

```mermaid
flowchart TD
    S["Streams"] --> B["Byte streams<br/><i>8-bit, binary data</i><br/>images, audio, PDF"]
    S --> C["Character streams<br/><i>16-bit, text data</i><br/>.txt, .csv, .json"]
    B --> BI["InputStream<br/>→ FileInputStream"]
    B --> BO["OutputStream<br/>→ FileOutputStream"]
    C --> CI["Reader<br/>→ FileReader, BufferedReader"]
    C --> CO["Writer<br/>→ FileWriter, BufferedWriter"]
    style S fill:#1f3b57,color:#fff
    style B fill:#e7eef7
    style C fill:#e4efe6
```

## 3. Direction

| Direction | Byte stream root | Character stream root |
|---|---|---|
| **Input** (read into the program) | `InputStream` | `Reader` |
| **Output** (write out of the program) | `OutputStream` | `Writer` |

## 4. Buffered Streams

`BufferedReader` and `BufferedWriter` wrap another stream and keep a memory buffer, so the disk is touched far fewer times. This makes reading and writing significantly faster.

```mermaid
flowchart LR
    F["File"] --> FR["FileReader<br/><i>one character at a time</i>"] --> BR["BufferedReader<br/><i>reads a whole line</i>"] --> P["Program"]
    style BR fill:#d5e8d6
```

## 5. Important Rules

- Use **byte** streams for binary data and **character** streams for text.
- Every stream must be **closed**, ideally with try-with-resources.
- Closing a wrapper stream also closes the stream it wraps.

## 6. In Depth

The stream hierarchy looks large, but it follows one consistent design: the **decorator pattern**. A low-level stream connects to a source, and each wrapper adds one capability. `new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"))` reads bytes from a file, converts them to characters using a specified encoding, and buffers the result — three responsibilities, three classes, composed in one line.

**Why byte and character streams are separate.** A byte is not a character. Text must be decoded using a character set, and different sets encode the same character differently. Reading a UTF-8 file as if it were ASCII produces corrupted output, so encoding should always be specified explicitly rather than relying on the platform default, which varies by machine.

**Why buffering matters so much.** Each unbuffered read is a system call reaching the operating system, and a system call costs thousands of times more than a memory access. A buffer turns thousands of tiny reads into a few large ones, routinely improving throughput by an order of magnitude.

**Flushing versus closing.** Written data sits in the buffer until it is full, flushed or the stream is closed. A program that exits without closing can lose the last portion of its output entirely — a silent failure with no exception.

Other useful wrappers include `DataInputStream` and `DataOutputStream` for primitives in a portable binary format, `ObjectOutputStream` for serialisation, and `PrintWriter` for formatted text.

## 7. Quick Revision

> Stream = flow of data. Byte → InputStream/OutputStream; Character → Reader/Writer; Buffered → faster.

---

<div align="center">

<a href="01-File-Handling-Introduction.md">← File Handling Introduction</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="03-File-Class.md">File Class →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
