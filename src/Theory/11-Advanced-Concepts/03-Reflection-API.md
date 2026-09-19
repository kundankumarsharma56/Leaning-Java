<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Reflection%20API&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Inspect%20classes%20at%20runtime%3BgetClass%20%E2%80%A2%20Class.forName%3BPowerful%20but%20slow" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** Inspecting and manipulating classes, methods and fields at runtime.

## 🧠 1. What Is It?

The **Reflection API** lets a program inspect and modify classes, interfaces, constructors, methods and fields **at runtime**, even without knowing their names at compile time. It lives in the `java.lang.reflect` package.

## 🧩 2. How It Works

```mermaid
flowchart LR
    C["📦 .class file<br/>loaded by the class loader"] --> M["🪞 Class object<br/><i>metadata</i>"]
    M --> F["getFields()"]
    M --> ME["getMethods()"]
    M --> CO["getConstructors()"]
    M --> IN["newInstance() ➜ create an object"]
    style M fill:#fff3e0
```

## 🧾 3. Three Ways To Reach The Class Object

```java
Class<?> c1 = obj.getClass();
Class<?> c2 = Student.class;
Class<?> c3 = Class.forName("com.kundan.Student");
```

## 📋 4. What Reflection Can Do

| Capability | Method family |
|---|---|
| List methods | `getMethods()`, `getDeclaredMethods()` |
| List fields | `getFields()`, `getDeclaredFields()` |
| List constructors | `getConstructors()` |
| Create objects | `getDeclaredConstructor().newInstance()` |
| Call a method by name | `invoke()` |
| Access private members | `setAccessible(true)` |

## 🌍 5. Where It Is Used

Frameworks rely on reflection constantly: **Spring** for dependency injection, **Hibernate** for mapping fields to columns, **JUnit** for finding test methods, and IDEs for auto-completion.

## ⚠️ 6. Drawbacks

- **Slower** than direct calls because checks happen at runtime.
- **Breaks encapsulation** by reaching private members.
- Errors surface at runtime instead of compile time, and refactoring can silently break name-based lookups.

## 🔁 7. Quick Revision

> Reflection = read and use class metadata at runtime. It powers frameworks, but it is slow and bypasses encapsulation.

---

<div align="center">

<a href="02-Garbage-Collection.md">⬅️ Garbage Collection</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="04-Inner-Classes.md">Inner Classes ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
