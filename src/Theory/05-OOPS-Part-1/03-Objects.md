<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Objects&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=Object%20%3D%20instance%3BCreated%20with%20new%3BLives%20in%20heap%20memory" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** An object is a real instance of a class, created with new and stored in heap memory.

## 1. What Is It?

An **object** is a real-world instance created from a class. Creating an object means **allocating memory**, and every object created with `new` is placed inside the **heap** memory of the JVM.

## 2. Object Creation Flow

```mermaid
flowchart LR
    C["class Student<br/><i>blueprint, no memory</i>"] -->|new Student()| O1["Heap<br/>object 1"]
    C -->|new Student()| O2["Heap<br/>object 2"]
    R1["Stack: s1"] --> O1
    R2["Stack: s2"] --> O2
    style C fill:#e7eef7
    style O1 fill:#f7eddd
    style O2 fill:#f7eddd
```

## 3. Syntax

```java
ClassName reference = new ClassName();
```

Three parts: **declaration** (`Student s`), **instantiation** (`new`), **initialization** (the constructor call).

## 4. Object State, Behaviour, Identity

| Term | Meaning | Example |
|---|---|---|
| **State** | The data held in its variables | `rollNo = 101` |
| **Behaviour** | The methods it can perform | `display()` |
| **Identity** | A unique reference in memory | its heap address |

## 5. Important Rules

- Each object has its **own copy** of instance variables.
- The reference lives in the **stack**; the object lives in the **heap**.
- An object with no reference pointing to it becomes eligible for **garbage collection**.

## 6. Common Mistakes

- Calling an instance method without creating an object.
- Using a reference that is still `null`, which causes `NullPointerException`.

## 7. In Depth

Creating an object with `new` involves more than allocation. The JVM reserves heap space, writes the object header (which holds the class pointer, hash code and locking information), sets every field to its default value, runs instance initialisers and the constructor chain from `Object` downwards, and finally returns the reference.

**Reference semantics** are the single most important consequence. Assigning one reference to another copies the address, so both names see the same object. Passing an object to a method passes a copy of the reference, which means the method can modify the object's fields but cannot make the caller's variable point somewhere else. This is why Java is accurately described as pass-by-value, where the value passed for objects happens to be a reference.

**Object lifetime** is governed by reachability, not scope. An object survives for as long as some live reference can reach it, and becomes eligible for garbage collection the moment the last one disappears. Returning an object from a method therefore keeps it alive even though the method's frame is gone.

**Equality** has two meanings: `==` compares references, while `equals()` compares content if the class overrides it. Objects that override `equals()` must override `hashCode()` too, or they will behave incorrectly in hash-based collections.

## 8. Quick Revision

> Class → blueprint • `new` → memory in heap • reference → stack pointer to that object.

---

<div align="center">

<a href="02-Classes.md">← Classes</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="04-Variables.md">Variables →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
