# Top 50 Java 8 Coding Interview Questions

A curated list of Java 8 coding questions commonly asked in backend developer interviews, organized by topic with detailed problem statements and sample input/output.

---

## Streams API

### 1. Find duplicate elements in a list using Streams
Given a list of integers, find all elements that appear more than once.

**Input:** `[2, 4, 5, 1, 2, 3, 5, 6]`
**Output:** `[2, 5]`

---

### 2. Remove duplicates from a list of objects based on a property
Given a list of custom objects, remove duplicates where "duplicate" is defined by a single field (not the whole object).

**Input:**
```
Employee(1, "Alice", "Engineering")
Employee(2, "Bob", "Sales")
Employee(3, "Charlie", "Engineering")
Employee(4, "David", "Sales")
Employee(5, "Eve", "HR")
```
Dedup key: `department`

**Output:**
```
Employee(1, "Alice", "Engineering")
Employee(2, "Bob", "Sales")
Employee(5, "Eve", "HR")
```

---

### 3. Find the second/third highest number in a list using Streams
Given a list of integers, find the Nth highest distinct value.

**Input:** `[10, 20, 20, 30, 40, 5]`, N = 2
**Output:** `30` (highest is 40, second highest is 30)

---

### 4. Sort a list of custom objects by multiple fields
Sort employees first by department, then by name within each department.

**Input:**
```
Employee("Bob", "Sales")
Employee("Alice", "Engineering")
Employee("Charlie", "Engineering")
Employee("David", "Sales")
```
**Output:**
```
Employee("Alice", "Engineering")
Employee("Charlie", "Engineering")
Employee("Bob", "Sales")
Employee("David", "Sales")
```

---

### 5. Group a list of employees by department
Group employees into a `Map<String, List<Employee>>` keyed by department.

**Input:**
```
Employee("Alice", "Engineering")
Employee("Bob", "Sales")
Employee("Charlie", "Engineering")
```
**Output:**
```
{
  "Engineering": [Alice, Charlie],
  "Sales": [Bob]
}
```

---

### 6. Count occurrences of each word in a string/list
Given a sentence, count how many times each word appears.

**Input:** `"the quick brown fox jumps over the lazy dog the fox runs"`
**Output:**
```
{the=3, quick=1, brown=1, fox=2, jumps=1, over=1, lazy=1, dog=1, runs=1}
```

---

### 7. Find the average, sum, max, min of a list of numbers
Given a list of integers, compute all four statistics using Streams.

**Input:** `[10, 20, 30, 40, 50]`
**Output:** `Sum=150, Average=30.0, Max=50, Min=10`

---

### 8. Convert a list of strings to uppercase and join with a delimiter
Given a list of names, convert to uppercase and join with `", "`.

**Input:** `["alice", "bob", "charlie"]`
**Output:** `"ALICE, BOB, CHARLIE"`

---

### 9. Partition a list into two groups based on a condition
Partition a list of numbers into even and odd groups.

**Input:** `[1, 2, 3, 4, 5, 6, 7, 8]`
**Output:**
```
{
  true: [2, 4, 6, 8],
  false: [1, 3, 5, 7]
}
```

---

### 10. Flatten a list of lists (nested lists) using flatMap
Given a `List<List<Integer>>`, flatten it into a single `List<Integer>`.

**Input:** `[[1, 2, 3], [4, 5], [6, 7, 8, 9]]`
**Output:** `[1, 2, 3, 4, 5, 6, 7, 8, 9]`

---

### 11. Find the frequency of characters in a string using Streams
Given a string, count the occurrence of each character.

**Input:** `"programming"`
**Output:** `{p=1, r=2, o=1, g=2, a=1, m=2, i=1, n=1}`

---

### 12. Convert a List<Employee> to Map<Id, Name>
Transform a list of employees into a map of ID to name.

**Input:**
```
Employee(1, "Alice")
Employee(2, "Bob")
```
**Output:** `{1="Alice", 2="Bob"}`

---

### 13. Find employees earning more than the average salary
Given a list of employees with salaries, filter those earning above the average.

**Input:**
```
Alice: 50000
Bob: 70000
Charlie: 90000
David: 40000
```
Average = 62500

**Output:** `[Bob (70000), Charlie (90000)]`

---

### 14. Sort a Map by values using Streams
Given a map of names to scores, sort by score in descending order.

**Input:** `{"Alice"=85, "Bob"=92, "Charlie"=78}`
**Output:** `{"Bob"=92, "Alice"=85, "Charlie"=78}`

---

### 15. Find the first non-repeated character in a string using Streams
Given a string, find the first character that doesn't repeat.

**Input:** `"swiss"`
**Output:** `'w'`

---

## Functional Interfaces & Lambdas

### 16. Implement a custom functional interface and use it with a lambda
Define an interface with a single abstract method (e.g., `Calculator`) and implement it via lambda.

**Input:** `Calculator add = (a, b) -> a + b;` called with `(5, 3)`
**Output:** `8`

---

### 17. Difference between Function, BiFunction, Supplier, Consumer, Predicate
Write short code demonstrating each interface.

**Input/Output example (Predicate):**
```java
Predicate<Integer> isEven = n -> n % 2 == 0;
isEven.test(4); // true
isEven.test(5); // false
```

---

### 18. Chain multiple Predicates using and(), or(), negate()
Combine two predicates to check if a number is even AND positive.

**Input:** `-4`
**Output:** `false` (fails "positive" check even though it's even)

---

### 19. Compose functions using Function.andThen() and compose()
Given `Function<Integer,Integer> multiplyBy2` and `addThree`, chain them.

**Input:** `5` with `multiplyBy2.andThen(addThree)`
**Output:** `13` (5 * 2 = 10, 10 + 3 = 13)

---

### 20. Use Supplier to implement lazy initialization
Only create an expensive object when actually needed.

**Input:** `Supplier<Connection> lazyConn = () -> createExpensiveConnection();`
**Output:** Connection is not created until `.get()` is called.

---

### 21. Use BiFunction to add two numbers / combine two objects
Combine a first name and last name into a full name.

**Input:** `("John", "Doe")`
**Output:** `"John Doe"`

---

### 22. Write a Comparator using lambda vs anonymous class vs method reference
Sort a list of strings by length, three different ways producing the same result.

**Input:** `["banana", "kiwi", "apple", "fig"]`
**Output:** `["fig", "kiwi", "apple", "banana"]`

---

## Method References

### 23. Convert a lambda expression to a method reference (all 4 types)
Demonstrate static, instance (particular object), instance (arbitrary object), and constructor references.

**Input:** `list.forEach(s -> System.out.println(s));`
**Output (as method reference):** `list.forEach(System.out::println);`

---

### 24. Use constructor reference to create objects from a Stream of data
Convert a list of names into a list of `Employee` objects using `Employee::new`.

**Input:** `["Alice", "Bob"]`
**Output:** `[Employee("Alice"), Employee("Bob")]`

---

### 25. Sort a list using method reference
Sort a list of strings case-insensitively.

**Input:** `["banana", "Apple", "cherry"]`
**Output:** `["Apple", "banana", "cherry"]`

---

### 26. Use method reference in forEach to print elements
Print all elements of a list using `System.out::println`.

**Input:** `[1, 2, 3]`
**Output:**
```
1
2
3
```

---

## Optional

### 27. Use Optional to avoid NullPointerException in a chain of method calls
Given `Employee -> Address -> City`, safely get the city name even if any link is null.

**Input:** `Employee` with `null` address
**Output:** `"Unknown City"` (fallback value, no NPE thrown)

---

### 28. Difference between Optional.of(), Optional.ofNullable(), Optional.empty()
Show behavior of all three with null and non-null values.

**Input:** `Optional.of(null)`
**Output:** Throws `NullPointerException`

**Input:** `Optional.ofNullable(null)`
**Output:** `Optional.empty` (no exception)

---

### 29. Use Optional.map() and Optional.flatMap() in a real scenario
Given `Optional<String>`, transform to its length safely.

**Input:** `Optional.of("hello")`
**Output:** `Optional[5]`

---

### 30. Use Optional.orElse() vs orElseGet() vs orElseThrow()
Demonstrate the difference, especially eager vs. lazy evaluation of the default value.

**Input:** `Optional.empty()` with `orElseThrow(() -> new RuntimeException("Not found"))`
**Output:** Throws `RuntimeException: Not found`

---

### 31. Chain multiple Optionals (nested object null-check simplification)
Simplify a deeply nested null-check chain (`if (a != null && a.getB() != null && ...)`) using Optional chaining.

**Input:** `Person -> Optional<Address> -> Optional<String> zipCode`
**Output:** `"Unknown"` if any level is absent, otherwise the actual zip code

---

### 32. Filter an Optional value using Optional.filter()
Given an `Optional<Integer>`, only proceed if the value is positive.

**Input:** `Optional.of(-5)` with `.filter(n -> n > 0)`
**Output:** `Optional.empty`

---

### 33. Return Optional<Employee> from a repository method and consume it safely
Simulate a `findById()` method returning `Optional<Employee>` and consuming the result without null checks.

**Input:** `findById(99)` (non-existent ID)
**Output:** `"Employee not found"` (via `orElse`/`orElseThrow`)

---

## Collectors

### 34. Use Collectors.joining() with prefix, suffix, and delimiter
Join a list of names into a formatted string.

**Input:** `["Alice", "Bob", "Charlie"]`
**Output:** `"[Alice, Bob, Charlie]"`

---

### 35. Use Collectors.groupingBy() with a downstream collector
Group employees by department and count how many are in each.

**Input:**
```
Alice - Engineering
Bob - Sales
Charlie - Engineering
```
**Output:** `{Engineering=2, Sales=1}`

---

### 36. Use Collectors.toSet(), toList(), toMap() with merge function
Convert a list of employees to a `Map<Department, Employee>`, handling duplicate departments with a merge function.

**Input:** Two employees both in "Sales"
**Output:** Only one retained per department (based on merge function logic, e.g., keep first)

---

### 37. Implement a custom Collector from scratch
Build a `Collector` that concatenates strings with custom logic (without using `Collectors.joining()`).

**Input:** `["a", "b", "c"]`
**Output:** `"a-b-c"`

---

### 38. Group employees by department and get count per department
(Similar to Q35, standalone version.)

**Input:**
```
Engineering: Alice, Charlie, Eve
Sales: Bob, David
```
**Output:** `{Engineering=3, Sales=2}`

---

### 39. Group employees by department and find the highest-paid employee in each
Combine `groupingBy` with `Collectors.maxBy()`.

**Input:**
```
Engineering: Alice(50000), Charlie(90000)
Sales: Bob(70000), David(40000)
```
**Output:** `{Engineering=Charlie(90000), Sales=Bob(70000)}`

---

### 40. Use Collectors.summarizingInt() / IntSummaryStatistics
Get count, sum, min, max, and average of salaries in one call.

**Input:** `[50000, 70000, 90000, 40000]`
**Output:** `count=4, sum=250000, min=40000, max=90000, average=62500.0`

---

## Date/Time API

### 41. Calculate the difference between two dates using Period and Duration
Find the difference in years/months/days between two `LocalDate`s.

**Input:** `2020-01-15` to `2024-07-11`
**Output:** `4 years, 5 months, 27 days`

---

### 42. Convert LocalDate to LocalDateTime and to Instant
Show the conversion chain with proper time zone handling.

**Input:** `LocalDate.of(2026, 7, 11)`
**Output:** `LocalDateTime: 2026-07-11T00:00`, `Instant: 2026-07-11T00:00:00Z` (UTC, depending on zone)

---

### 43. Format a LocalDate using DateTimeFormatter
Format a date as `dd-MM-yyyy`.

**Input:** `LocalDate.of(2026, 7, 11)`
**Output:** `"11-07-2026"`

---

### 44. Check if a given year is a leap year using LocalDate
Use `Year.isLeap()` or `LocalDate.isLeapYear()`.

**Input:** `2024`
**Output:** `true`

**Input:** `2023`
**Output:** `false`

---

### 45. Find the day of the week for a given date
Given a date, return the corresponding day name.

**Input:** `LocalDate.of(2026, 7, 11)`
**Output:** `"SATURDAY"`

---

## Default & Static Methods, Misc

### 46. Interface with default method + diamond problem resolution
Two interfaces both define a default method with the same signature; a class implements both and must override to resolve the conflict.

**Input:** `InterfaceA.greet()` returns `"Hello from A"`, `InterfaceB.greet()` returns `"Hello from B"`
**Output:** Class must explicitly override `greet()` (e.g., calling `InterfaceA.super.greet()`) or it won't compile.

---

### 47. Use Stream.iterate() and Stream.generate() for infinite streams
Generate the first 10 Fibonacci numbers using `Stream.iterate()`.

**Input:** `limit = 10`
**Output:** `[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]`

---

### 48. Use parallel streams to process a large list
Sum a large list of numbers using `parallelStream()`, and explain when NOT to use it (e.g., small lists, I/O-bound tasks, or operations with shared mutable state).

**Input:** List of 10 million integers
**Output:** Correct sum, potentially faster than sequential for large, CPU-bound, stateless operations — but not always faster for small data due to thread overhead.

---

### 49. Use Collectors.reducing() vs Stream.reduce()
Implement sum of employee salaries using both approaches.

**Input:** `[50000, 70000, 90000]`
**Output:** `210000` (both approaches produce the same result, different mechanisms)

---

### 50. Combine Streams + Optional + Collectors in a real-world use case
Find the department with the highest average salary.

**Input:**
```
Engineering: Alice(50000), Charlie(90000)
Sales: Bob(70000), David(40000)
```
Engineering avg = 70000, Sales avg = 55000

**Output:** `Optional["Engineering"]`

---

## How to use this list

Work through these in batches of 5-8 questions at a time. For each:
1. Attempt the solution independently first.
2. Review using the structured format: **Definition → Internals → Why → Real Usage → Common Mistakes → Code → Complexity → Follow-up Questions**.
3. Pay attention to edge cases and input constraints (value ranges, nulls, empty collections) — these often separate a "passes most tests" solution from an interview-ready one.
