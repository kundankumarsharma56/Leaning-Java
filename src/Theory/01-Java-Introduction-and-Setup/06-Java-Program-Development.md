<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Java%20Program%20Development&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Your%20first%20Java%20program%3BEditor%20%E2%9E%9C%20javac%20%E2%9E%9C%20java%3BSix%20steps%20to%20output" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** The six practical steps from opening an editor to seeing your first output.

## 🧠 1. What Is It?

The hands-on routine for building and running a program without any IDE.

## 🧩 2. Development Flow

```mermaid
flowchart TD
    S1["1️⃣ Open a text editor<br/>Notepad / Notepad++ / EditPlus"] --> S2["2️⃣ Write the program"]
    S2 --> S3["3️⃣ Save as <b>Welcome.java</b>"]
    S3 --> S4["4️⃣ Open command prompt<br/>cd to that folder"]
    S4 --> S5["5️⃣ Compile<br/><code>javac Welcome.java</code>"]
    S5 -->|.class created| S6["6️⃣ Run<br/><code>java Welcome</code>"]
    S5 -->|errors| S2
    S6 --> OUT["✅ Welcome To Kundan Notes"]
    style OUT fill:#c8e6c9
```

## 🧪 3. Simple Example

```java
public class Welcome {
    public static void main(String[] args) {
        System.out.println("Welcome To Kundan Notes");
    }
}
```

```bash
javac Welcome.java
java Welcome
```

## 📌 4. Important Rules

- File name **must** be `Welcome.java` because `Welcome` is public.
- Compile with the extension, run without it.
- Seeing `Welcome.class` in the folder is proof that compilation succeeded.

## ⚠️ 5. Common Mistakes

- Saving the file as `Welcome.java.txt` from Notepad.
- Running `java` from a different directory than the `.class` file.

## ✅ 6. Best Practices

- Learn the command line version first, then move to an IDE.
- In real projects an IDE (Eclipse, IntelliJ IDEA, VS Code) handles these steps for you.

## 🔁 7. Quick Revision

> Write ➜ save as `ClassName.java` ➜ `javac ClassName.java` ➜ `java ClassName`.

---

<div align="center">

<a href="05-Java-Programming-Elements.md">⬅️ Java Programming Elements</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="07-Compilation.md">Compilation ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
