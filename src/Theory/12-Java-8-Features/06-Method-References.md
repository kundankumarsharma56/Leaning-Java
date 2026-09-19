<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:16324f,50:1f4f70,100:33709c&height=150&section=header&text=Method%20References&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=17&duration=3000&pause=900&color=58A6FF&center=true&vCenter=true&width=520&lines=The%20%3A%3A%20operator%3B4%20kinds%20of%20references%3BShorter%20than%20lambdas" />

![Java](https://img.shields.io/badge/Java-Core-C9762A?style=for-the-badge&labelColor=16324f) ![Level](https://img.shields.io/badge/Level-Beginner-2E7D5B?style=for-the-badge&labelColor=16324f) ![Author](https://img.shields.io/badge/Author-Kundan-22506F?style=for-the-badge&labelColor=16324f)

</div>

---

> **In one line:** A shorthand for a lambda that does nothing but call an existing method.

## 1. What Is It?

A **method reference** is a compact alternative to a lambda whose body only calls an existing method. It uses the **`::`** operator.

## 2. Four Forms

```mermaid
flowchart TD
    M["Method reference ::"] --> S["Static method<br/>ClassName::staticMethod"]
    M --> I["Instance method of a<br/>particular object<br/>object::instanceMethod"]
    M --> A["Instance method of an<br/>arbitrary object of a type<br/>ClassName::instanceMethod"]
    M --> C["Constructor reference<br/>ClassName::new"]
    style M fill:#1f3b57,color:#fff
```

## 3. Lambda vs Method Reference

| Lambda | Method reference |
|---|---|
| `x -> Math.abs(x)` | `Math::abs` |
| `s -> System.out.println(s)` | `System.out::println` |
| `s -> s.toUpperCase()` | `String::toUpperCase` |
| `() -> new ArrayList<>()` | `ArrayList::new` |

## 4. Important Rules

- The referenced method's parameters and return type must match the functional interface's abstract method.
- A method reference cannot pass extra arguments or add logic — if anything more is needed, keep the lambda.

## 5. In Depth

A method reference is compiled exactly like the equivalent lambda, so the choice between them is entirely about readability. The rule of thumb: if the lambda body is a single call that simply forwards its parameters, the method reference says the same thing with less noise.

The form that confuses people is the **unbound instance reference**, `String::toUpperCase`. It looks like a call on the class, but it means "for whichever instance is supplied as the first argument, call this method on it", so it matches `Function<String, String>`. Compare it with `System.out::println`, where the receiver is fixed at the moment the reference is created.

**Constructor references** — `ArrayList::new`, `Employee::new` — fit any functional interface whose abstract method has matching parameters, which is what makes them work as factories in `Collectors.toCollection(TreeSet::new)` or `Stream.toArray(String[]::new)`.

The compiler resolves which form is meant from the target type, so the same syntax can mean different things in different contexts. A method reference cannot add logic, reorder arguments or supply extra values; the moment any of that is needed, the lambda is the correct tool.

## 6. Quick Revision

> `::` replaces a lambda that only forwards a call. Four forms: static, bound instance, unbound instance, constructor.

---

<div align="center">

<a href="05-Stream-API.md">← Stream API</a> &nbsp;•&nbsp; <a href="../README.md">Home</a> &nbsp;•&nbsp; <a href="07-Optional-Class.md">Optional Class →</a>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:33709c,100:16324f&height=90&section=footer" width="100%" />

<sub>Core Java Theory Notes • Maintained by <b>Kundan</b></sub>

</div>
