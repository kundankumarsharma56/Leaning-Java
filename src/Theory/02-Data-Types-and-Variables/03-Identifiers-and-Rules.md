<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Identifiers%20and%20Rules&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=Naming%20things%20in%20Java%3B5%20identifier%20rules%3BValid%20vs%20Invalid%20names" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** An identifier is any name you create — and it must obey five strict rules.

## 1. What Is It?

Every Java component needs a name. Names used for **classes, methods, interfaces and variables** are called **identifiers**.

## 2. Rule Checklist

```mermaid
flowchart TD
    N["Proposed name"] --> R1{"Only a-z A-Z 0-9 $ _ ?"}
    R1 -->|no| X["Invalid"]
    R1 -->|yes| R2{"Does not start with a digit?"}
    R2 -->|no| X
    R2 -->|yes| R3{"Not a reserved word?"}
    R3 -->|no| X
    R3 -->|yes| R4{"No spaces?"}
    R4 -->|no| X
    R4 -->|yes| OK["Valid identifier"]
    style OK fill:#d5e8d6
    style X fill:#f4dada
```

## 3. The Five Rules

| Rule | Description |
|---|---|
| **Rule 1** | Allowed characters only: `a-z`, `A-Z`, `0-9`, `$`, `_` |
| **Rule 2** | Must not start with a digit |
| **Rule 3** | Reserved keywords cannot be used (53 reserved words exist) |
| **Rule 4** | Spaces are not allowed |
| **Rule 5** | Identifiers are **case sensitive** — `foo` and `Foo` are different |

## 4. Valid vs Invalid

| Name | Verdict | Reason |
|---|---|---|
| `name` | valid | letters only |
| `name@` | invalid | `@` is not allowed |
| `age#` | invalid | `#` is not allowed |
| `1age` | invalid | starts with a digit |
| `age2` | valid | digit is not first |
| `_name` | valid | underscore allowed |
| `$name` | valid | dollar allowed |
| `$_amt` | valid | both symbols allowed |
| `int byte = 20;` | invalid | `byte` is a reserved word |
| `int try = 30;` | invalid | `try` is a reserved word |
| `int mobile bill;` | invalid | space not allowed |
| `int mobile_bill;` | valid | underscore instead of space |

## 5. Simple Example

```java
public class IdentifierDemo {
    public static void main(String[] args) {
        int mobile_bill = 400;   // valid
        long phno = 797979799L;  // valid
        System.out.println(mobile_bill + " " + phno);
    }
}
```

## 6. Common Mistakes

- Using `@` or `#` inside names, copied from other languages.
- Assuming `Total` and `total` refer to the same variable.

## 7. In Depth

It helps to separate three ideas that are easy to merge into one.

- **Rules** are enforced by the compiler. Breaking one is a compile error.
- **Conventions** are enforced by teams and tools, not by the compiler. Breaking one still compiles but marks the code as unprofessional.
- **Reserved words** are fixed by the language specification; `true`, `false` and `null` are technically literals rather than keywords, but they are equally unusable as names.

Java identifiers are far more permissive than most developers realise. The specification allows any Unicode letter, so `नाम` or `año` are valid identifiers. This exists to support non-English source code, but in practice teams restrict themselves to ASCII for portability across editors and build systems.

`$` deserves a special note. It is legal, but by convention it is reserved for **machine-generated** code. The compiler itself uses it when naming inner classes (`Outer$Inner.class`) and synthetic members, so using `$` in hand-written code invites confusion.

Some words are **contextual keywords** added in later versions — `var`, `record`, `sealed`, `yield`, `permits`. They are only treated as keywords in the positions where they have a special meaning, precisely so that older code which used them as identifiers continues to compile.

## 8. Quick Revision

> Letters, digits, `$`, `_` only → never start with a digit → never a keyword → never a space → case matters.

---

<div align="center">

<a href="02-Data-Types.md">← Data Types</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="04-Reserved-Words.md">Reserved Words →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
