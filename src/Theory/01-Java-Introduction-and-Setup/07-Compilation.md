<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Compilation&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=What%20javac%20really%20does%3BSource%20code%20%E2%9E%9C%20Bytecode%3BSyntax%20errors%20stop%20here" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** javac checks syntax and converts source code into platform independent bytecode.

## 🧠 1. What Is It?

Compilation is the step where the **java compiler (`javac`)** converts human readable source code into bytecode.

## 🧩 2. Compilation Diagram

```mermaid
flowchart LR
    A["📄 Demo.java"] --> B{"🔧 javac"}
    B -->|syntax correct| C["📦 Demo.class<br/>bytecode"]
    B -->|syntax error| D["❌ Compile-time error<br/>no .class produced"]
    style C fill:#c8e6c9
    style D fill:#ffcdd2
```

## ⚙️ 3. How It Works

1. `javac` reads the `.java` file.
2. It checks syntax, types and naming rules.
3. If everything is valid it writes one `.class` file per class.
4. That bytecode is **platform independent** — it belongs to no CPU.

## 🧪 4. Simple Example

```bash
javac Demo.java
```

```java
public class Demo {
    public static void main(String[] args) {
        System.out.println("Compiled successfully");
    }
}
```

## 📌 5. Important Rules

- `javac` needs the full file name with the `.java` extension.
- Errors reported at this stage are called **compile-time errors**.
- No `.class` file means the program never reaches the JVM.

## ⚠️ 6. Common Mistakes

- Missing semicolons, unmatched braces, or a misspelled class name.
- Assuming a compiled program is correct — compilation checks **syntax**, not **logic**.

## 🔁 7. Quick Revision

> `javac FileName.java` ➜ bytecode `.class`. Compile-time errors live here.

---

<div align="center">

<a href="06-Java-Program-Development.md">⬅️ Java Program Development</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="08-Execution.md">Execution ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
