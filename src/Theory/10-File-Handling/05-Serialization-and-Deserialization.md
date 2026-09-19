<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Serialization%20and%20De-Serialization&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Object%20%E2%9E%9C%20bytes%20%E2%9E%9C%20Object%3BSerializable%20marker%20interface%3Btransient%20fields%20skipped" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** Converting an object into a byte stream and rebuilding it later.

## 🧠 1. What Is It?

| Term | Meaning |
|---|---|
| **Serialization** | Converting an **object into a byte stream**, so it can be saved to a file or sent over a network |
| **De-Serialization** | Rebuilding the **object from that byte stream** |

## 🧩 2. The Round Trip

```mermaid
flowchart LR
    O1["🧱 Object in memory"] -->|ObjectOutputStream<br/>writeObject()| B["📦 Byte stream<br/>file / network"]
    B -->|ObjectInputStream<br/>readObject()| O2["🧱 Object restored"]
    style O1 fill:#e8f5e9
    style B fill:#fff3e0
    style O2 fill:#c8e6c9
```

## 🧾 3. Requirements

```java
class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    int rollNo;
    transient String password;   // will NOT be saved
}
```

| Requirement | Detail |
|---|---|
| Marker interface | The class must implement `java.io.Serializable`, which has **no methods** |
| Classes used | `ObjectOutputStream` to write, `ObjectInputStream` to read |
| Version id | `serialVersionUID` keeps old files compatible with a changed class |

## 🚫 4. What Is Not Serialized

| Keyword | Effect |
|---|---|
| `transient` | The field is skipped and restored with its default value |
| `static` | Belongs to the class, so it is never part of the object's state |

## 📌 5. Important Rules

- Every object referenced by a serializable object must itself be serializable, otherwise `NotSerializableException` is thrown.
- De-serialization does **not** call the constructor of the serialized class.
- A mismatched `serialVersionUID` causes `InvalidClassException`.

## ✅ 6. Best Practices

- Declare `serialVersionUID` explicitly in every serializable class.
- Mark passwords and other secrets as `transient`.

## 🔁 7. Quick Revision

> Serializable marker ➜ `writeObject()` turns object into bytes ➜ `readObject()` rebuilds it. `transient` and `static` fields are skipped.

---

<div align="center">

<a href="04-FileReader-and-FileWriter.md">⬅️ FileReader and FileWriter</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="../11-Advanced-Concepts/README.md">Advanced Concepts ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
