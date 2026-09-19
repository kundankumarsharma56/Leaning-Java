<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Serialization%20and%20De-Serialization&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=Object%20%E2%9E%9C%20bytes%20%E2%9E%9C%20Object%3BSerializable%20marker%20interface%3Btransient%20fields%20skipped" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** Converting an object into a byte stream and rebuilding it later.

## 1. What Is It?

| Term | Meaning |
|---|---|
| **Serialization** | Converting an **object into a byte stream**, so it can be saved to a file or sent over a network |
| **De-Serialization** | Rebuilding the **object from that byte stream** |

## 2. The Round Trip

```mermaid
flowchart LR
    O1["Object in memory"] -->|ObjectOutputStream<br/>writeObject()| B["Byte stream<br/>file / network"]
    B -->|ObjectInputStream<br/>readObject()| O2["Object restored"]
    style O1 fill:#e4efe6
    style B fill:#f7eddd
    style O2 fill:#d5e8d6
```

## 3. Requirements

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

## 4. What Is Not Serialized

| Keyword | Effect |
|---|---|
| `transient` | The field is skipped and restored with its default value |
| `static` | Belongs to the class, so it is never part of the object's state |

## 5. Important Rules

- Every object referenced by a serializable object must itself be serializable, otherwise `NotSerializableException` is thrown.
- De-serialization does **not** call the constructor of the serialized class.
- A mismatched `serialVersionUID` causes `InvalidClassException`.

## 6. Best Practices

- Declare `serialVersionUID` explicitly in every serializable class.
- Mark passwords and other secrets as `transient`.

## 7. In Depth

Serialisation writes an object **graph**, not a single object. Every reachable object is written once, with later references recorded as back-pointers, so shared objects stay shared and cycles do not cause infinite recursion when the graph is restored.

**De-serialisation does not call the constructor** of the serialised class, which means constructor validation is bypassed entirely. A crafted byte stream can therefore produce an object in a state the class would never normally allow. Combined with the fact that reading untrusted serialised data can trigger code in the classes being instantiated, this makes Java serialisation a well-known security risk, and the reason most modern systems exchange **JSON** or another explicit text format instead.

**`serialVersionUID` is the compatibility contract.** If it is not declared, the compiler generates one from the class's structure, so almost any change to the class — even adding a method — changes it and old files stop loading with `InvalidClassException`. Declaring it explicitly lets a class evolve: adding a field is tolerated and arrives as `null` or zero on old data.

**`transient` marks what must not be written**: passwords, cached values, open connections, and any field whose class is not serialisable. Static fields belong to the class, not the instance, so they are never part of the stream.

Custom control is available through `writeObject()` and `readObject()`, or by implementing `Externalizable` for complete control over the format. `readResolve()` is the mechanism that protects a singleton from being duplicated by de-serialisation.

## 8. Quick Revision

> Serializable marker → `writeObject()` turns object into bytes → `readObject()` rebuilds it. `transient` and `static` fields are skipped.

---

<div align="center">

<a href="04-FileReader-and-FileWriter.md">← FileReader and FileWriter</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="../11-Advanced-Concepts/README.md">Advanced Concepts →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
