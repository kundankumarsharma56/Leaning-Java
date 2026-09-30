<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Variables&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=Instance%20%E2%80%A2%20Static%20%E2%80%A2%20Local%3BWho%20shares%20what%3BStack%2C%20heap%20or%20method%20area" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** Instance, static and local variables differ in where they live, when they are created and who shares them.

## 1. What Is It?

Based on **where** a variable is declared and **how** it is shared, Java variables fall into three types.

## 2. Variable Types

```mermaid
flowchart TD
    V["Variables"] --> I["Instance variable<br/><i>one copy per object</i><br/> Heap"]
    V --> S["Static variable<br/><i>one copy per class</i><br/> Method Area"]
    V --> L["Local variable<br/><i>inside a method/block</i><br/> Java Stack"]
    style V fill:#1f3b57,color:#fff
    style I fill:#f7eddd
    style S fill:#e7eef7
    style L fill:#e4efe6
```

## 3. Full Comparison

| | Instance | Static | Local |
|---|---|---|---|
| Declared | Inside a class, outside methods | Inside a class with `static` | Inside a method, block or constructor |
| Copies | One per object | One shared by all objects | One per method call |
| Memory | Heap (with the object) | Method Area | Java Stack |
| Created | When the object is created | When the class is loaded | When the method is called |
| Destroyed | When the object is collected | When the class is unloaded | When the method ends |
| Default value | Yes (0, false, null) | Yes (0, false, null) | None — must be assigned |
| Accessed by | `reference.variable` | `ClassName.variable` | Directly inside its block |

## 4. Syntax

```java
class Demo {
    int instanceVar;             // instance
    static int staticVar;        // static
    void show() {
        int localVar = 10;       // local
    }
}
```

## 5. Important Rules

- A static variable is shared, so a change made through one object is visible to all.
- A local variable **must** be initialized before it is read — there is no default.
- Static members are loaded before any object exists.

## 6. Common Mistakes

- Expecting a local variable to have a default value.
- Accessing an instance variable from a `static` method without an object.

## 7. In Depth

The three kinds of variable differ in their **lifetime**, and that single property explains every other difference between them.

Static variables are initialised once, during class initialisation, and persist until the class is unloaded — effectively for the life of the application. Because they are shared, they are also the easiest way to introduce a concurrency bug: two threads updating the same static counter without synchronisation will lose updates.

Instance variables are created and destroyed with the object, so each instance carries its own state. This is what allows the same method code to behave differently for different objects.

Local variables exist only inside a stack frame. They are the fastest to access, are never visible to other threads, and are subject to definite assignment analysis by the compiler.

Two further points worth knowing:

- **`final` means different things in different places.** A `final` local cannot be reassigned. A `final` field must be assigned exactly once, in its declaration or in the constructor. A `final` reference prevents reassignment but not modification of the referenced object.
- **`static final` constants of primitive or String type are inlined by the compiler.** The value is copied into the calling class's constant pool, so changing the constant requires recompiling the classes that use it, not just the class that declares it.

## 8. Quick Revision

> Instance → per object (heap) • Static → per class (method area) • Local → per call (stack, no default).

---

<div align="center">

<a href="03-Objects.md">← Objects</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="05-Methods.md">Methods →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
