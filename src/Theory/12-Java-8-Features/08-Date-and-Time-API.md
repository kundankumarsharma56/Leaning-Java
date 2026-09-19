<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=150&section=header&text=Date%20and%20Time%20API&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=00E5FF&center=true&vCenter=true&width=520&lines=java.time%20package%3BLocalDate%20%E2%80%A2%20LocalTime%20%E2%80%A2%20LocalDateTime%3BImmutable%20and%20thread%20safe" />

![Java](https://img.shields.io/badge/Java-Core-orange?style=for-the-badge&logo=openjdk&logoColor=white) ![Level](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge&logo=openjdk&logoColor=white) ![Author](https://img.shields.io/badge/Author-Kundan-blue?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

---

> **In one line:** An immutable, thread-safe replacement for the old Date and Calendar classes.

## 🧠 1. What Is It?

Java 8 introduced the **`java.time`** package to replace the old `java.util.Date` and `Calendar` classes, which were **mutable, not thread safe** and confusing (months started at 0, years counted from 1900).

## 🧩 2. Core Classes

```mermaid
flowchart TD
    T["📅 java.time"] --> LD["LocalDate<br/><i>date only</i><br/>2026-09-19"]
    T --> LT["LocalTime<br/><i>time only</i><br/>14:30:00"]
    T --> LDT["LocalDateTime<br/><i>date + time</i>"]
    T --> ZDT["ZonedDateTime<br/><i>date + time + zone</i>"]
    T --> P["Period<br/><i>gap in years/months/days</i>"]
    T --> D["Duration<br/><i>gap in hours/minutes/seconds</i>"]
    style T fill:#203a43,color:#fff
```

## 📋 3. Common Operations

| Need | Method |
|---|---|
| Today's date | `LocalDate.now()` |
| A specific date | `LocalDate.of(2026, 9, 19)` |
| Add or subtract | `plusDays()`, `minusMonths()` |
| Compare | `isBefore()`, `isAfter()`, `isEqual()` |
| Gap between dates | `Period.between(d1, d2)` |
| Gap between times | `Duration.between(t1, t2)` |
| Format | `DateTimeFormatter.ofPattern("dd-MM-yyyy")` |

## ✅ 4. Why It Is Better

| Old API | New API |
|---|---|
| Mutable | **Immutable** |
| Not thread safe | **Thread safe** |
| Months start at 0 | Months start at 1 |
| One class doing everything | Separate, clearly named classes |
| `SimpleDateFormat` not thread safe | `DateTimeFormatter` is thread safe |

## 📌 5. Important Rules

- Every `java.time` object is immutable, so every operation returns a **new** object.
- `LocalDate` and `LocalTime` carry **no time zone**; use `ZonedDateTime` when a zone matters.

## 🔁 6. Quick Revision

> `java.time` = immutable + thread safe + clearly separated. `LocalDate`, `LocalTime`, `LocalDateTime`, `Period`, `Duration`.

---

<div align="center">

<a href="07-Optional-Class.md">⬅️ Optional Class</a> &nbsp;•&nbsp; <a href="../README.md">🏠 Home</a> &nbsp;•&nbsp; <i>End</i> ➡️

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,100:0f2027&height=90&section=footer" width="100%" />

<sub>📘 Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
