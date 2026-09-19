<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Arrays&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=What%20is%20an%20Array%3F%3BIndex%20starts%20at%200%3BFixed%20size%2C%20homogeneous" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** An array is a fixed-size container object that holds elements of the same data type.

## 1. What Is It?

An **array** is an object that contains elements of a **similar data type** — a container that holds values of a homogeneous type.

- Array is also called a **static data structure**, because its size must be specified at the time of declaration.
- An array is **index based**: the first element is at index `0`, the second at index `1`, and the last at `n-1`, where `n` is the length.
- In Java an array is treated as an **object** and is stored in **heap** memory.
- It can store primitive values or reference values.

## 2. Memory Layout

```mermaid
flowchart LR
    subgraph H["Heap memory"]
        A0["index 0<br/>10"] --- A1["index 1<br/>20"] --- A2["index 2<br/>30"] --- A3["index 3<br/>40"]
    end
    REF["Stack<br/>int[] marks"] --> A0
    style REF fill:#e7eef7
    style H fill:#f7eddd
```

## 3. Syntax

```java
int[] marks = new int[5];          // declaration + creation
int[] data  = {10, 20, 30};        // declaration + initialization
```

## 4. Types Of Arrays

| Type | Meaning | Example shape |
|---|---|---|
| **Single dimensional** | A simple linear list | `int[] a = new int[5];` |
| **Two dimensional** | Rows and columns (matrix) | `int[][] a = new int[3][3];` |
| **Multi dimensional** | Array of arrays of arrays | `int[][][] a;` |
| **Jagged** | Rows of different lengths | `int[][] a = new int[3][];` |

## 5. How It Works

```mermaid
flowchart TD
    D["1. Declare<br/>int[] marks;"] --> C["2. Create<br/>new int[5] → heap object"]
    C --> I["3. Initialize<br/>marks[0] = 90;"]
    I --> A["4. Access<br/>marks[0] • marks.length"]
    style C fill:#f7eddd
    style A fill:#d5e8d6
```

- Every element gets the **default value** of its type when the array is created (`0`, `0.0`, `false`, `null`).
- `length` is a **field**, not a method — written as `marks.length` with no parentheses.

## 6. Limitations Of Arrays

1. **Fixed in size** — once created, the size can neither grow nor shrink, so the size must be known in advance.
2. **Homogeneous only** — an array can hold only one data type. A `Car[]` cannot store a `Bus`, which is a compile-time error. Using an `Object[]` works around this but loses type safety.
3. **No ready-made methods** — arrays are not built on a data structure, so there is no built-in support for searching, sorting or resizing; the code must be written explicitly.

> These limitations are exactly the reason the **Collections Framework** exists.

## 7. Important Rules

- Index range is `0` to `length - 1`.
- Accessing an index outside that range throws `ArrayIndexOutOfBoundsException` at runtime.
- Arrays are objects, so an uninitialized array reference is `null`.

## 8. Common Mistakes

- Writing `marks.length()` instead of `marks.length`.
- Assuming the size can be changed later.
- Looping up to `length` inclusive instead of exclusive.

## 9. In Depth

An array is a genuine object, which has several consequences that are easy to miss.

- `marks.length` is a **final field** written into the object header when the array is created, which is why it has no parentheses and cannot be changed.
- Array references are stored on the stack while the data lives on the heap, so passing an array to a method passes the address. The method can therefore modify the caller's data, even though Java is strictly pass-by-value.
- Arrays are **covariant**: `Object[] objects = new String[3];` compiles. This is convenient but unsafe, because storing an `Integer` into that array compiles and then fails at runtime with `ArrayStoreException`. Generics were deliberately made invariant to avoid repeating this mistake.

A **two-dimensional array in Java is an array of arrays**, not a contiguous matrix. `new int[3][4]` creates one outer array holding three references, each pointing to a separate four-element array. That is why rows can have different lengths (a jagged array) and why `a[1] = new int[10];` is legal.

The standard library supplies the operations arrays lack: `Arrays.sort()`, `Arrays.toString()`, `Arrays.copyOf()`, `Arrays.fill()`, `Arrays.equals()` and `System.arraycopy()`. Note that `toString()` on an array prints the type and hash code, so `Arrays.toString()` is required to see the contents, and for nested arrays `Arrays.deepToString()`.

## 10. Quick Revision

> Array = fixed size + homogeneous + index based + heap object. Limitations → Collections.

---

<div align="center">

<a href="../03-Operators-and-Control-Statements/05-Transfer-Statements.md">← Transfer Statements</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="02-String.md">String →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
