<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Encapsulation&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Data%20hiding%20in%20practice%3Bprivate%20fields%20%2B%20public%20methods%3BThe%20POJO%20/%20JavaBean%20idea" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** Binding data and methods together while hiding the data behind private fields and public getters and setters.

## 🧠 1. What Is It?

**Encapsulation** means binding data (variables) and the code acting on that data (methods) into a single unit, and **hiding the data** from the outside world.

It is achieved by:

1. Declaring all variables as `private`.
2. Providing `public` **getter** and **setter** methods to read and write them.

## 🧩 2. The Capsule Picture

```mermaid
flowchart TD
    subgraph CLASS["💊 class Account"]
        D["🔒 private double balance"]
        G["🔓 public getBalance()"]
        S["🔓 public setBalance()"]
        G --- D
        S --- D
    end
    OUT["🌍 Outside code"] -->|allowed| G
    OUT -->|allowed| S
    OUT -.->|blocked| D
    style D fill:#ffcdd2
    style CLASS fill:#e8f5e9
```

## 🧾 3. Syntax

```java
class Account {
    private double balance;

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
}
```

## ✅ 4. Advantages

| Benefit | Explanation |
|---|---|
| **Data hiding** | The internal state cannot be touched directly |
| **Control** | A setter can validate before storing a value |
| **Read-only / write-only** | Provide only a getter, or only a setter |
| **Flexibility** | The internal representation can change without breaking callers |
| **Reusability** | Encapsulated classes are easy to move between projects |

## ⚖️ 5. Encapsulation vs Abstraction

| Encapsulation | Abstraction |
|---|---|
| Hides the **data** | Hides the **implementation** |
| Achieved with access modifiers | Achieved with abstract classes and interfaces |
| Answers "how is the data protected?" | Answers "what does it do?" |

## 🔁 6. Quick Revision

> private variables + public getters/setters = encapsulation (data hiding).

---

<div align="center">

<a href="01-Access-Modifiers.md">⬅️ Access Modifiers</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="03-Inheritance.md">Inheritance ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
