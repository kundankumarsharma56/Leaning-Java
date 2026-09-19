<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Inner%20Classes&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=4%20types%20of%20inner%20classes%3BMember%20%E2%80%A2%20Static%20%E2%80%A2%20Local%20%E2%80%A2%20Anonymous%3BWhy%20nest%20a%20class%3F" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** A class declared inside another class, used to logically group code that is used in only one place.

## 🧠 1. What Is It?

An **inner class** is a class defined inside another class. It is used when a class is meaningful only in the context of its outer class, and it can access the outer class members — including `private` ones.

## 🧩 2. Four Types

```mermaid
flowchart TD
    I["🏛️ Nested classes"] --> M["Member inner class<br/><i>non-static, inside the class body</i>"]
    I --> S["Static nested class<br/><i>declared static</i>"]
    I --> L["Local inner class<br/><i>inside a method</i>"]
    I --> A["Anonymous inner class<br/><i>no name, declared and used at once</i>"]
    style I fill:#203a43,color:#fff
```

## 📋 3. Comparison

| Type | Declared | Needs an outer object? | Can access outer instance members? |
|---|---|---|---|
| **Member inner** | Inside the class body | ✅ Yes | ✅ Yes |
| **Static nested** | Inside the class body with `static` | ❌ No | Only static members |
| **Local inner** | Inside a method or block | ✅ Yes | Yes, plus effectively final local variables |
| **Anonymous** | At the point of use | Depends | ✅ Yes |

## 🧾 4. Syntax

```java
class Outer {
    class Inner { }                 // member inner
    static class Nested { }         // static nested
    void show() {
        class Local { }             // local inner
    }
}
```

An **anonymous** inner class implements an interface or extends a class on the spot:

```java
Runnable r = new Runnable() {
    public void run() { }
};
```

## ✅ 5. Advantages

- Groups classes that are used only in one place, improving readability.
- Gives access to the outer class's private data.
- Anonymous classes make short event handlers and callbacks concise.

## 📌 6. Important Rules

- A member inner class is created as `outer.new Inner()`.
- A static nested class is created as `new Outer.Nested()`.
- An anonymous class cannot have a constructor, because it has no name.
- From Java 8, a **lambda expression** replaces most anonymous classes that implement a functional interface.

## 🔁 7. Quick Revision

> Member (needs outer object) • Static nested (does not) • Local (inside a method) • Anonymous (nameless, one-time use).

---

<div align="center">

<a href="03-Reflection-API.md">⬅️ Reflection API</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="../12-Java-8-Features/README.md">Java 8 Features ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
