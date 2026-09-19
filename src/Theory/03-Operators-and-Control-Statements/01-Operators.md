<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Operators&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=Arithmetic%20%E2%80%A2%20Relational%20%E2%80%A2%20Logical%3BAssignment%20%E2%80%A2%20Ternary%20%E2%80%A2%20Misc%3BPrecedence%20decides%20the%20order" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** Symbols that tell the compiler to perform arithmetic, comparison, logical or assignment work.

## 🧠 1. What Is It?

An operator is a **symbol that tells the compiler to perform some operation**. Java provides a rich set of operators for every kind of work, and they are an essential part of every expression.

## 🧩 2. Operator Categories

```mermaid
flowchart TD
    O["➕ Java Operators"] --> A["Arithmetic<br/>+ - * / %"]
    O --> R["Relational<br/>== != > < >= <="]
    O --> L["Logical<br/>&& || !"]
    O --> AS["Assignment<br/>= += -= *= /="]
    O --> C["Conditional / Ternary<br/>? :"]
    O --> M["Misc<br/>new • instanceof • dot(.)"]
    style O fill:#203a43,color:#fff
```

## ➕ 3. Arithmetic Operators

| Operator | Meaning | Example (`a=10, b=3`) | Result |
|---|---|---|---|
| `+` | Addition | `a + b` | 13 |
| `-` | Subtraction | `a - b` | 7 |
| `*` | Multiplication | `a * b` | 30 |
| `/` | Division | `a / b` | 3 |
| `%` | Modulus (remainder) | `a % b` | 1 |

## 🔼 4. Increment And Decrement

```mermaid
flowchart LR
    PRE["++a — Pre<br/>increment first,<br/>then use the value"] --> V1["value used = new value"]
    POST["a++ — Post<br/>use the value first,<br/>then increment"] --> V2["value used = old value"]
    style PRE fill:#e8f5e9
    style POST fill:#fff3e0
```

Facts about `++` and `--`:

- Can be applied to **variables only**.
- Nesting the two operators is not allowed.
- Cannot be applied to `final` variables.
- Cannot be applied to `boolean`.

## 🔍 5. Relational Operators

| Operator | Meaning |
|---|---|
| `==` | equal to |
| `!=` | not equal to |
| `>` | greater than |
| `<` | less than |
| `>=` | greater than or equal to |
| `<=` | less than or equal to |

## 🔗 6. Logical Operators

With `a = true` and `b = false`:

| Operator | Name | `a op b` |
|---|---|---|
| `&&` | logical AND | `false` |
| `\|\|` | logical OR | `true` |
| `!` | logical NOT | `!a` is `false` |

## 📝 7. Assignment Operators

| Operator | Meaning |
|---|---|
| `=` | assign |
| `+=` | add and assign |
| `-=` | subtract and assign |
| `*=` | multiply and assign |
| `/=` | divide and assign |
| `%=` | modulus and assign |

## ❓ 8. Conditional (Ternary) Operator

It works with three operands and is a short alternative to `if-else`.

```java
expr1 ? expr2 : expr3
```

```java
int a = 10, b = 20;
int max = (a > b) ? a : b;   // 20
```

## 🧰 9. Misc Operators

| Operator | Purpose |
|---|---|
| `new` | Creates an object; the object is placed in the **heap** memory of the JVM |
| `instanceof` | Tests whether a reference belongs to a given class or interface; returns `true` / `false` |
| `.` (dot) | Accesses members — `reference.variable`, `reference.method()`, `ClassName.method()` — and identifies a class inside a package, such as `java.lang.String` |

```java
String company = "Kundan Notes";
System.out.println(company instanceof String);   // true
```

## 🧪 10. Simple Example

```java
public class OperatorDemo {
    public static void main(String[] args) {
        int a = 10, b = 3;
        System.out.println(a + b);        // 13
        System.out.println(a % b);        // 1
        System.out.println(a > b);        // true
        System.out.println(a > b && b > 0); // true
    }
}
```

## ⚙️ 11. Precedence Flow

```mermaid
flowchart TD
    E["Expression: 10 + 5 * 2"] --> S1["Step 1: 5 * 2 = 10<br/><i>* has higher precedence</i>"]
    S1 --> S2["Step 2: 10 + 10 = 20"]
    S2 --> R["✅ Result = 20"]
    style R fill:#c8e6c9
```

Precedence from high to low: postfix `++ --` ➜ unary `++ -- + - !` ➜ `* / %` ➜ `+ -` ➜ relational ➜ equality ➜ `&&` ➜ `||` ➜ `?:` ➜ assignment.

## ⚠️ 12. Common Mistakes

- Confusing `=` (assign) with `==` (compare).
- Reading `2 + 3 * 4` strictly left to right — the answer is 14, not 20.
- Using `==` to compare String contents instead of `.equals()`.

## ✅ 13. Best Practices

- Add parentheses to make intent obvious even when precedence already handles it.

## 🔁 14. Quick Revision

> Operator = symbol, operand = value, expression = both together. Precedence picks the order, parentheses override it.

---

<div align="center">

<a href="../02-Data-Types-and-Variables/07-Reading-Data-From-Keyboard.md">⬅️ Reading Data From Keyboard</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <a href="02-Control-Statements.md">Control Statements ➡️</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
