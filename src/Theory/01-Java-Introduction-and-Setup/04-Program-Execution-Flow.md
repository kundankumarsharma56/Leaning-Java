<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Program%20Execution%20Flow&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Write%20%E2%9E%9C%20Compile%20%E2%9E%9C%20Execute%3B.java%20%E2%9E%9C%20.class%20%E2%9E%9C%20Output%3BBytecode%20is%20the%20bridge" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** Write .java, compile it into .class bytecode, then let the JVM turn bytecode into machine code.

## 🧠 1. What Is It?

The three-step journey every Java program takes from typed text to a running process.

## 🧩 2. Execution Flow Diagram

```mermaid
flowchart LR
    A["👨‍💻 Step 1<br/>Write source code<br/><b>Demo.java</b>"] --> B["🔧 Step 2<br/>Compile with javac<br/><b>Demo.class</b> bytecode"]
    B --> C["⚙️ Step 3<br/>JVM converts bytecode<br/>into machine code"]
    C --> D["🖨️ Output on screen"]
    style A fill:#e8f5e9
    style B fill:#fff3e0
    style C fill:#e3f2fd
    style D fill:#f3e5f5
```

## ⚙️ 3. How It Works

| Step | Command | Input | Output |
|---|---|---|---|
| Write | any editor / IDE | your logic | `Demo.java` |
| Compile | `javac Demo.java` | source code | `Demo.class` (bytecode) |
| Execute | `java Demo` | bytecode | machine code ➜ result |

## 🧪 4. Simple Example

```java
public class Demo {
    public static void main(String[] args) {
        System.out.println("Execution flow demo");
    }
}
```

```bash
javac Demo.java   # produces Demo.class
java Demo         # prints: Execution flow demo
```

## 📌 5. Important Rules

- Compilation needs the **file name** with extension; execution needs the **class name** without extension.
- A `.class` file is produced for every class in the source file.
- If compilation fails, no `.class` file is created, so execution cannot even start.

## ⚠️ 6. Common Mistakes

- Running `java Demo.java`-style commands with the old workflow habits, or `java Demo.class`.
- Expecting the `.class` file to contain machine code — it contains bytecode.

## 🔁 7. Quick Revision

> `.java` --javac--> `.class` --JVM--> machine code --> output.

---

<div align="center">

<a href="03-Java-Installation.md">⬅️ Java Installation</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="05-Java-Programming-Elements.md">Java Programming Elements ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
