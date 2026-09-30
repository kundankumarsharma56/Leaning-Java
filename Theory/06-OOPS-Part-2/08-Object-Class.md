<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Object%20Class&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=The%20root%20of%20all%20classes%3BtoString%20%E2%80%A2%20equals%20%E2%80%A2%20hashCode%3BInherited%20by%20everything" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** java.lang.Object is the root parent of every class in Java.

## 1. What Is It?

`java.lang.Object` is the **root class** of the Java class hierarchy. Every class extends it directly or indirectly, which means every object inherits its methods.

## 2. Hierarchy

```mermaid
flowchart TD
    O["java.lang.Object"] --> S["String"]
    O --> T["Thread"]
    O --> E["Exception"]
    O --> U["Your own classes"]
    U --> U2["Student, Account, ..."]
    style O fill:#c9762a,color:#fff
```

## 3. Methods Of Object

| Method | Purpose |
|---|---|
| `toString()` | Text representation of the object |
| `equals(Object)` | Content comparison (reference comparison by default) |
| `hashCode()` | Integer hash used by hash-based collections |
| `getClass()` | Runtime class information |
| `clone()` | Creates a copy of the object |
| `finalize()` | Called before garbage collection (deprecated) |
| `wait()`, `notify()`, `notifyAll()` | Inter-thread communication |

## 4. equals() and hashCode() Contract

```mermaid
flowchart TD
    A["Two objects are equals()"] --> B["They MUST have the same hashCode()"]
    C["Same hashCode()"] -.->|not guaranteed| D["Objects may still be unequal<br/><i>collision</i>"]
    style B fill:#d5e8d6
    style D fill:#f7eddd
```

Whenever `equals()` is overridden, `hashCode()` must be overridden too, otherwise `HashSet` and `HashMap` behave incorrectly.

## 5. Important Rules

- The default `toString()` prints `className@hexHashCode`.
- The default `equals()` compares **references**, exactly like `==`.
- `String` and the wrapper classes already override `equals()`, `hashCode()` and `toString()`.

## 6. In Depth

`Object` is what makes a single, universal type system possible: every reference can be assigned to `Object`, which is why collections, reflection and serialisation can work with any type at all.

**`equals()` has a contract**, and hash-based collections rely on it. It must be reflexive, symmetric, transitive, consistent, and never equal to `null`. A frequent mistake is writing `equals(MyType other)`, which overloads rather than overrides, so the collection keeps calling the inherited reference comparison and the object appears to vanish from a `HashSet`.

**`hashCode()` must agree with `equals()`.** Equal objects must produce equal hash codes; unequal objects may collide, and a collision only costs performance. Mutating a field used in `hashCode()` after inserting the object into a `HashMap` effectively loses the entry, which is why immutable keys are strongly preferred.

**`toString()`** exists to make debugging and logging useful; the default `ClassName@1b6d3586` tells you almost nothing.

**`clone()` is best avoided.** It requires implementing `Cloneable`, performs a shallow copy by default, and bypasses constructors. A copy constructor or a static factory method is clearer and safer. `finalize()` is deprecated for similar reasons: it was unreliable and could resurrect objects; `try-with-resources` and cleaners replace it.

The remaining methods — `wait()`, `notify()`, `notifyAll()` and `getClass()` — are on `Object` because locking and type metadata apply to every object in the JVM.

## 7. Quick Revision

> Every class inherits from `Object`. Override `toString()`, and override `equals()` and `hashCode()` together.

---

<div align="center">

<a href="07-Abstract-Classes.md">← Abstract Classes</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="../07-Packages-Wrapper-Exceptions/README.md">Packages, Wrappers & Exceptions →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
