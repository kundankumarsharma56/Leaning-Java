<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Methods&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=Methods%20perform%20actions%3BInstance%20vs%20Static%3BParameters%20and%20return%20type" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** A method is a named block of logic that performs an action and optionally returns a value.

## 1. What Is It?

Methods are used to **perform actions**. Application business logic is written inside methods, and a class can have any number of them.

## 2. Method Signature

```mermaid
flowchart LR
    A["public"] --> B["static"] --> C["int"] --> D["add"] --> E["(int a, int b)"]
    A1["access modifier"] -.- A
    B1["non-access modifier"] -.- B
    C1["return type"] -.- C
    D1["method name"] -.- D
    E1["parameter list"] -.- E
    style D fill:#c9762a,color:#fff
```

> The **method signature** is the method name plus its parameter list.

## 3. Syntax

```java
returnType methodName(parameters) {
    // logic
    return value;
}
```

## 4. Types Of Methods

| Type | Called using | Note |
|---|---|---|
| **Instance method** | `reference.method()` | Needs an object |
| **Static method** | `ClassName.method()` | No object required |
| **Abstract method** | Overridden in a subclass | Has no body |
| **Final method** | Normal call | Cannot be overridden |

## 5. Method Overloading

Two or more methods in the same class with the **same name but different parameter lists**.

```mermaid
flowchart TD
    M["add()"] --> M1["add(int, int)"]
    M --> M2["add(double, double)"]
    M --> M3["add(int, int, int)"]
    style M fill:#1f3b57,color:#fff
```

Overloading can differ by **number**, **type** or **order** of parameters. A different **return type alone is not enough**.

## 6. Important Rules

- A method with return type `void` returns nothing.
- Values are passed **by value** in Java; for objects, the copied value is the reference.
- `main` is the special static method the JVM calls first.

## 7. Common Mistakes

- Trying to overload by changing only the return type.
- Calling an instance method directly from `main` without an object.

## 8. In Depth

A method call creates a stack frame holding the parameters, the local variables and the return address. When the method returns, that frame is discarded. Deep or unbounded recursion exhausts the stack and produces `StackOverflowError`, which is a different failure from `OutOfMemoryError` on the heap.

**Overload resolution happens at compile time** and follows a fixed order of preference: exact match, then widening primitive conversion, then autoboxing, then varargs. This ordering explains behaviour that looks arbitrary at first, such as `f(int)` being chosen over `f(Integer)` and `f(Object...)` being chosen last. Ambiguous calls that cannot be resolved by these rules are a compile error.

**Parameter passing is always by value.** For a primitive, the value is copied. For an object, the reference is copied, so the method can mutate the object but cannot redirect the caller's variable.

**Varargs** (`int... values`) is compiled into an array parameter, so a method cannot be overloaded with both `f(int[])` and `f(int...)`. A varargs parameter must be last.

Methods are also the natural unit of design. A method that does one thing, has a name describing that thing, and takes few parameters is far easier to test and reuse than a long method holding several responsibilities.

## 9. Quick Revision

> Method = modifier + return type + name + parameters + body. Overloading = same name, different parameter list.

---

<div align="center">

<a href="04-Variables.md">← Variables</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="06-Constructor.md">Constructor →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
