<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Abstract%20Classes&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=abstract%20keyword%3BCannot%20be%20instantiated%3BAbstract%20class%20vs%20Interface" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** A partially completed class that mixes abstract methods with ready-made behaviour.

## 1. What Is It?

An **abstract class** is declared with the `abstract` keyword. It may contain **abstract methods** (declared without a body) as well as **concrete methods** (with a body). It **cannot be instantiated** — it exists to be extended.

## 2. Structure

```mermaid
flowchart TD
    A["abstract class Shape"] --> M1["abstract void draw();<br/><i>no body → child must implement</i>"]
    A --> M2["void info() { ... }<br/><i>ready-made behaviour</i>"]
    A --> M3["constructor, variables,<br/>static & final methods"]
    A -->|extends| C["class Circle<br/>must override draw()"]
    style A fill:#f7eddd
    style C fill:#e4efe6
```

## 3. Syntax

```java
abstract class Shape {
    abstract void draw();
    void info() { }
}
```

## 4. Important Rules

- If a class has even one abstract method, the class **must** be declared abstract.
- An abstract class can exist **without** any abstract method.
- A child class must override every abstract method, or be declared abstract itself.
- Abstract classes **can** have constructors, instance variables and static methods.
- `abstract` cannot be combined with `final`, `static` or `private`.

## 5. Abstract Class vs Interface

| Feature | Abstract class | Interface |
|---|---|---|
| Abstraction | 0% to 100% (partial) | 100% (by design) |
| Methods | Abstract + concrete | Abstract, plus default/static from Java 8 |
| Variables | Any kind | `public static final` only |
| Constructor | Yes | No |
| Inheritance | `extends` — only one | `implements` — many |
| Access modifiers | Any | Members are implicitly public |
| Use when | Classes share common state and code | Unrelated classes share a capability |

## 6. In Depth

The choice between an abstract class and an interface is about **what is being shared**.

Use an **abstract class** when subclasses share state and implementation as well as a contract — common fields, a constructor that establishes invariants, or a template method that fixes an algorithm's skeleton while leaving specific steps abstract. The template method pattern is the classic reason abstract classes exist: the parent controls the sequence, the child supplies the details.

Use an **interface** when unrelated classes share only a capability, when several implementations must be possible for classes that already have a parent, or when the type will be implemented by a lambda.

Since Java 8 the technical gap has narrowed, because interfaces can carry `default` implementations. Three real differences remain: an abstract class can hold **state**, can have a **constructor**, and can use the full range of **access modifiers**, while a class may extend only one of them.

A common and effective pattern combines both: publish an interface as the public type, and provide an abstract skeletal class that implements the tedious parts. `AbstractList` and `AbstractMap` in the JDK follow exactly this approach, letting an implementer supply a few methods and inherit the rest.

## 7. Quick Revision

> Abstract class = partial abstraction + shared code + single inheritance. Interface = full contract + multiple inheritance.

---

<div align="center">

<a href="06-Interfaces.md">← Interfaces</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="08-Object-Class.md">Object Class →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
