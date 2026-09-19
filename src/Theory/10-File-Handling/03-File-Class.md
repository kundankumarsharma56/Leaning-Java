<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=File%20Class&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=File%20%3D%20path%2C%20not%20content%3BcreateNewFile%20%E2%80%A2%20delete%20%E2%80%A2%20exists%3BDirectories%20too" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** The File class represents a file or directory path and describes it without reading its content.

## 🧠 1. What Is It?

`java.io.File` is an abstract representation of a **file or directory path name**. Creating a `File` object does **not** create a file on disk — it only points at a location.

## 🧩 2. What A File Object Can Do

```mermaid
flowchart TD
    F["📄 File object<br/><i>a path, not the content</i>"] --> C["createNewFile()"]
    F --> D["delete()"]
    F --> E["exists()"]
    F --> N["getName() • getPath()"]
    F --> L["length() • canRead() • canWrite()"]
    F --> M["mkdir() • list()"]
    style F fill:#fff3e0
```

## 📋 3. Common Methods

| Method | Purpose |
|---|---|
| `createNewFile()` | Creates an empty file; returns `false` if it already exists |
| `exists()` | Checks whether the file or folder is present |
| `getName()` / `getAbsolutePath()` | Name and full path |
| `length()` | Size in bytes |
| `delete()` | Deletes the file or empty directory |
| `mkdir()` / `mkdirs()` | Creates a directory, or a whole path of them |
| `list()` / `listFiles()` | Contents of a directory |
| `isFile()` / `isDirectory()` | Type check |
| `canRead()` / `canWrite()` | Permission check |

## 🧾 4. Syntax

```java
File f = new File("data.txt");
```

## 📌 5. Important Rules

- `new File(...)` never touches the disk; only methods like `createNewFile()` do.
- Most of these methods throw `IOException`, so they need exception handling.
- `delete()` fails silently by returning `false` — always check the result.

## 🔁 6. Quick Revision

> `File` = a path handle. Use it to create, inspect, list and delete — not to read content.

---

<div align="center">

<a href="02-Streams.md">⬅️ Streams</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="04-FileReader-and-FileWriter.md">FileReader and FileWriter ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
