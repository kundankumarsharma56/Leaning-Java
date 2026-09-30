<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Date%20and%20Time%20API&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=java.time%20package%3BLocalDate%20%E2%80%A2%20LocalTime%20%E2%80%A2%20LocalDateTime%3BImmutable%20and%20thread%20safe" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** An immutable, thread-safe replacement for the old Date and Calendar classes.

## 1. What Is It?

Java 8 introduced the **`java.time`** package to replace the old `java.util.Date` and `Calendar` classes, which were **mutable, not thread safe** and confusing (months started at 0, years counted from 1900).

## 2. Core Classes

```mermaid
flowchart TD
    T["java.time"] --> LD["LocalDate<br/><i>date only</i><br/>2026-09-19"]
    T --> LT["LocalTime<br/><i>time only</i><br/>14:30:00"]
    T --> LDT["LocalDateTime<br/><i>date + time</i>"]
    T --> ZDT["ZonedDateTime<br/><i>date + time + zone</i>"]
    T --> P["Period<br/><i>gap in years/months/days</i>"]
    T --> D["Duration<br/><i>gap in hours/minutes/seconds</i>"]
    style T fill:#1f3b57,color:#fff
```

## 3. Common Operations

| Need | Method |
|---|---|
| Today's date | `LocalDate.now()` |
| A specific date | `LocalDate.of(2026, 9, 19)` |
| Add or subtract | `plusDays()`, `minusMonths()` |
| Compare | `isBefore()`, `isAfter()`, `isEqual()` |
| Gap between dates | `Period.between(d1, d2)` |
| Gap between times | `Duration.between(t1, t2)` |
| Format | `DateTimeFormatter.ofPattern("dd-MM-yyyy")` |

## 4. Why It Is Better

| Old API | New API |
|---|---|
| Mutable | **Immutable** |
| Not thread safe | **Thread safe** |
| Months start at 0 | Months start at 1 |
| One class doing everything | Separate, clearly named classes |
| `SimpleDateFormat` not thread safe | `DateTimeFormatter` is thread safe |

## 5. Important Rules

- Every `java.time` object is immutable, so every operation returns a **new** object.
- `LocalDate` and `LocalTime` carry **no time zone**; use `ZonedDateTime` when a zone matters.

## 6. In Depth

The old API failed for structural reasons, not merely cosmetic ones. `java.util.Date` was mutable, so any method receiving one could change the caller's value; it represented an instant but printed as if it had a time zone; months were zero-based and years counted from 1900; and `SimpleDateFormat` was not thread safe, which caused silent data corruption in server applications where a formatter was shared as a static field.

`java.time`, based on the Joda-Time design, fixes all of this by separating concepts that the old API had merged into one class:

| Concept | Class |
|---|---|
| Date with no time or zone | `LocalDate` |
| Time with no date or zone | `LocalTime` |
| Date and time, no zone | `LocalDateTime` |
| A point on the global timeline | `Instant` |
| Zone-aware date and time | `ZonedDateTime` |
| Date-based amount (years, months, days) | `Period` |
| Time-based amount (hours, minutes, seconds) | `Duration` | Choosing the right type is most of the work. A birth date has no time zone, so `LocalDate` is correct. A server log entry marks a moment on the global timeline, so `Instant` is correct. A meeting that must happen at 9am in a particular city needs `ZonedDateTime`, because daylight saving will shift the underlying instant.

Every object is **immutable**, so `date.plusDays(1)` returns a new object and the original is unchanged — which also makes the whole API thread safe by construction. `DateTimeFormatter` is immutable and thread safe too, so it can safely be a static constant.

## 7. Quick Revision

> `java.time` = immutable + thread safe + clearly separated. `LocalDate`, `LocalTime`, `LocalDateTime`, `Period`, `Duration`.

---

<div align="center">

<a href="07-Optional-Class.md">← Optional Class</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <i>End</i> →

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
