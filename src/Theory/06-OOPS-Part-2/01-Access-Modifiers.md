<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Access%20Modifiers&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=private%20%E2%80%A2%20default%20%E2%80%A2%20protected%20%E2%80%A2%20public%3BWho%20can%20access%20what%3BAccess%20vs%20non-access%20modifiers" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** Four keywords that decide who can see a class, variable, method or constructor.

## 🧠 1. What Is It?

Access modifiers are keywords used to **set accessibility**. An access modifier restricts the access of a class, constructor, data member or method from another class.

## 🧩 2. Visibility Scope

```mermaid
flowchart TD
    P["🔓 public<br/>visible everywhere"] --> PR["🛡️ protected<br/>same package + all subclasses"]
    PR --> D["📦 default (no keyword)<br/>same package only"]
    D --> PV["🔒 private<br/>same class only"]
    style P fill:#c8e6c9
    style PR fill:#e8f5e9
    style D fill:#fff3e0
    style PV fill:#ffcdd2
```

## 📋 3. Access Matrix

| Access from | private | default | protected | public |
|---|---|---|---|---|
| Same class | ✅ | ✅ | ✅ | ✅ |
| Same package, other class | ❌ | ✅ | ✅ | ✅ |
| Subclass in another package | ❌ | ❌ | ✅ | ✅ |
| Non-subclass in another package | ❌ | ❌ | ❌ | ✅ |

## 🧰 4. Non-Access Modifiers

Java also supports many non-access modifiers: `static`, `final`, `abstract`, `synchronized`, `native`, `volatile`, `transient`, `strictfp`.

| Modifier | Effect |
|---|---|
| `static` | Belongs to the class, not to an object |
| `final` | Value, method or class cannot be changed, overridden or extended |
| `abstract` | No body; must be implemented by a subclass |
| `synchronized` | Only one thread at a time |
| `transient` | Skipped during serialization |
| `volatile` | Always read from main memory |

## 📌 5. Important Rules

- A top-level class can only be `public` or **default**.
- `private` members are not inherited by subclasses.
- `protected` is the only modifier that crosses packages through inheritance.

## 🔁 6. Quick Revision

> private ➜ class • default ➜ package • protected ➜ package + subclasses • public ➜ everywhere.

---

<div align="center">

<a href="../05-OOPS-Part-1/06-Constructor.md">⬅️ Constructor</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="02-Encapsulation.md">Encapsulation ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
