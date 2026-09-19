<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Object%20Class&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=The%20root%20of%20all%20classes%3BtoString%20%E2%80%A2%20equals%20%E2%80%A2%20hashCode%3BInherited%20by%20everything" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** java.lang.Object is the root parent of every class in Java.

## 🧠 1. What Is It?

`java.lang.Object` is the **root class** of the Java class hierarchy. Every class extends it directly or indirectly, which means every object inherits its methods.

## 🧩 2. Hierarchy

```mermaid
flowchart TD
    O["🌳 java.lang.Object"] --> S["String"]
    O --> T["Thread"]
    O --> E["Exception"]
    O --> U["Your own classes"]
    U --> U2["Student, Account, ..."]
    style O fill:#f89820,color:#fff
```

## 📋 3. Methods Of Object

| Method | Purpose |
|---|---|
| `toString()` | Text representation of the object |
| `equals(Object)` | Content comparison (reference comparison by default) |
| `hashCode()` | Integer hash used by hash-based collections |
| `getClass()` | Runtime class information |
| `clone()` | Creates a copy of the object |
| `finalize()` | Called before garbage collection (deprecated) |
| `wait()`, `notify()`, `notifyAll()` | Inter-thread communication |

## ⚖️ 4. equals() and hashCode() Contract

```mermaid
flowchart TD
    A["Two objects are equals()"] --> B["They MUST have the same hashCode()"]
    C["Same hashCode()"] -.->|not guaranteed| D["Objects may still be unequal<br/><i>collision</i>"]
    style B fill:#c8e6c9
    style D fill:#fff3e0
```

Whenever `equals()` is overridden, `hashCode()` must be overridden too, otherwise `HashSet` and `HashMap` behave incorrectly.

## 📌 5. Important Rules

- The default `toString()` prints `className@hexHashCode`.
- The default `equals()` compares **references**, exactly like `==`.
- `String` and the wrapper classes already override `equals()`, `hashCode()` and `toString()`.

## 🔁 6. Quick Revision

> Every class inherits from `Object`. Override `toString()`, and override `equals()` and `hashCode()` together.

---

<div align="center">

<a href="07-Abstract-Classes.md">⬅️ Abstract Classes</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="../07-Packages-Wrapper-Exceptions/README.md">Packages, Wrappers & Exceptions ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
