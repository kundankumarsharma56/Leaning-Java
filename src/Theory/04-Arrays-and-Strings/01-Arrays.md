<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Arrays&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=What%20is%20an%20Array%3F%3BIndex%20starts%20at%200%3BFixed%20size%2C%20homogeneous" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** An array is a fixed-size container object that holds elements of the same data type.

## 🧠 1. What Is It?

An **array** is an object that contains elements of a **similar data type** — a container that holds values of a homogeneous type.

- Array is also called a **static data structure**, because its size must be specified at the time of declaration.
- An array is **index based**: the first element is at index `0`, the second at index `1`, and the last at `n-1`, where `n` is the length.
- In Java an array is treated as an **object** and is stored in **heap** memory.
- It can store primitive values or reference values.

## 🧩 2. Memory Layout

```mermaid
flowchart LR
    subgraph H["🧺 Heap memory"]
        A0["index 0<br/>10"] --- A1["index 1<br/>20"] --- A2["index 2<br/>30"] --- A3["index 3<br/>40"]
    end
    REF["📍 Stack<br/>int[] marks"] --> A0
    style REF fill:#e3f2fd
    style H fill:#fff3e0
```

## 🧾 3. Syntax

```java
int[] marks = new int[5];          // declaration + creation
int[] data  = {10, 20, 30};        // declaration + initialization
```

## 📋 4. Types Of Arrays

| Type | Meaning | Example shape |
|---|---|---|
| **Single dimensional** | A simple linear list | `int[] a = new int[5];` |
| **Two dimensional** | Rows and columns (matrix) | `int[][] a = new int[3][3];` |
| **Multi dimensional** | Array of arrays of arrays | `int[][][] a;` |
| **Jagged** | Rows of different lengths | `int[][] a = new int[3][];` |

## ⚙️ 5. How It Works

```mermaid
flowchart TD
    D["1️⃣ Declare<br/>int[] marks;"] --> C["2️⃣ Create<br/>new int[5] ➜ heap object"]
    C --> I["3️⃣ Initialize<br/>marks[0] = 90;"]
    I --> A["4️⃣ Access<br/>marks[0] • marks.length"]
    style C fill:#fff3e0
    style A fill:#c8e6c9
```

- Every element gets the **default value** of its type when the array is created (`0`, `0.0`, `false`, `null`).
- `length` is a **field**, not a method — written as `marks.length` with no parentheses.

## ⚠️ 6. Limitations Of Arrays

1. **Fixed in size** — once created, the size can neither grow nor shrink, so the size must be known in advance.
2. **Homogeneous only** — an array can hold only one data type. A `Car[]` cannot store a `Bus`, which is a compile-time error. Using an `Object[]` works around this but loses type safety.
3. **No ready-made methods** — arrays are not built on a data structure, so there is no built-in support for searching, sorting or resizing; the code must be written explicitly.

> 📎 These limitations are exactly the reason the **Collections Framework** exists.

## 📌 7. Important Rules

- Index range is `0` to `length - 1`.
- Accessing an index outside that range throws `ArrayIndexOutOfBoundsException` at runtime.
- Arrays are objects, so an uninitialized array reference is `null`.

## ⚠️ 8. Common Mistakes

- Writing `marks.length()` instead of `marks.length`.
- Assuming the size can be changed later.
- Looping up to `length` inclusive instead of exclusive.

## 🔁 9. Quick Revision

> Array = fixed size + homogeneous + index based + heap object. Limitations ➜ Collections.

---

<div align="center">

<a href="../03-Operators-and-Control-Statements/05-Transfer-Statements.md">⬅️ Transfer Statements</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="02-String.md">String ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
