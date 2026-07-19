# Java Streams – 30 High-Frequency Coding Problems

Extracted questions from the interview notes sheet, expanded into full problem
statements, each paired with a sample input dataset and the expected output
so you can test your own solutions against a known answer.

## Employee Model

```java
class Employee {
    int id;
    String name;
    String department;
    double salary;
    boolean active;
    String email;
}
```

## Sample Dataset (used for every problem below)

| id | name    | department | salary | active | email          |
|----|---------|------------|--------|--------|----------------|
| 1  | Alice   | Engineering| 60000  | true   | alice@co.com   |
| 2  | Bob     | Engineering| 55000  | true   | bob@co.com     |
| 3  | Charlie | Finance    | 70000  | false  | charlie@co.com |
| 4  | David   | Finance    | 45000  | true   | david@co.com   |
| 5  | Eve     | HR         | 50000  | true   | eve@co.com     |
| 6  | Frank   | HR         | 50000  | false  | null           |
| 7  | Grace   | Engineering| 60000  | true   | grace@co.com   |
| 8  | Alice   | Marketing  | 40000  | true   | alice2@co.com  |

---

### 1. Employee Names
**Question:** Given a list of `Employee` objects, extract just the `name`
field from every employee into a `List<String>`, preserving the original order.
**Input:** the 8 employees above
**Expected Output:** `[Alice, Bob, Charlie, David, Eve, Frank, Grace, Alice]`

### 2. Distinct Employee Names
**Question:** From the list of employees, produce a list of unique employee
names (drop duplicate name strings, even if they belong to different
employees).
**Input:** same dataset
**Expected Output:** `[Alice, Bob, Charlie, David, Eve, Frank, Grace]`

### 3. Distinct Employees (by name)
**Question:** Two different `Employee` records can share the same name (e.g.
two people both named "Alice" in different departments). Return a collection
of employees with only one `Employee` object kept per distinct name.
**Input:** same dataset
**Expected Output:** one `Employee` per unique name (7 employees) — since
`Alice` appears twice, only one of the two `Alice` records is kept.

### 4. Employees Earning More Than 50000
**Question:** Filter the employee list down to only those whose `salary` is
strictly greater than 50000, and collect them into a `List<Employee>`.
**Input:** same dataset
**Expected Output:** `[Alice(60000), Bob(55000), Charlie(70000), Grace(60000)]`

### 5. Any Finance Employee
**Question:** Check whether at least one employee in the list belongs to the
"Finance" department. Return a boolean.
**Input:** same dataset
**Expected Output:** `true` (Charlie, David are in Finance)

### 6. All Employees Have Email
**Question:** Verify whether every employee in the list has a non-null
`email` field. Return a boolean.
**Input:** same dataset
**Expected Output:** `false` (Frank's email is `null`)

### 7. Emails of Active Employees as List
**Question:** Filter the list down to employees whose `active` flag is
`true`, then collect their `email` field into a `List<String>` (excluding any
null emails).
**Input:** same dataset
**Expected Output:** `[alice@co.com, bob@co.com, david@co.com, eve@co.com, grace@co.com, alice2@co.com]`

### 8. Highest Paid Employee
**Question:** Find the single `Employee` with the maximum `salary` in the
list.
**Input:** same dataset
**Expected Output:** `Charlie, 70000`

### 9. Lowest Paid Employee
**Question:** Find the single `Employee` with the minimum `salary` in the
list.
**Input:** same dataset
**Expected Output:** `Alice (Marketing), 40000`

### 10. Second Highest Paid Employee
**Question:** Without sorting the entire list manually, find the employee
(or salary) that ranks second when salaries are ordered from highest to
lowest.
**Input:** same dataset
**Expected Output:** `60000` (Alice or Grace — both tie for second, behavior
depends on sort stability)

### 11. Top 3 Salaries
**Question:** Return the 3 highest salary values in the list, ordered from
highest to lowest.
**Input:** same dataset
**Expected Output:** `[70000, 60000, 60000]`

### 12. Average Salary
**Question:** Compute the average (mean) salary across all employees in the
list.
**Input:** same dataset
**Expected Output:** `53750.0`

### 13. Total Salary
**Question:** Compute the sum of all employee salaries in the list.
**Input:** same dataset
**Expected Output:** `430000.0`

### 14. Group Employees By Department
**Question:** Group the employees by their `department` field, producing a
`Map<String, List<Employee>>` where each key is a department and each value
is the list of employees in that department.
**Input:** same dataset
**Expected Output:**
```
Engineering -> [Alice, Bob, Grace]
Finance     -> [Charlie, David]
HR          -> [Eve, Frank]
Marketing   -> [Alice]
```

### 15. Count Employees By Department
**Question:** For each department, count how many employees belong to it,
producing a `Map<String, Long>`.
**Input:** same dataset
**Expected Output:** `{Engineering=3, Finance=2, HR=2, Marketing=1}`

### 16. Average Salary By Department
**Question:** For each department, compute the average salary of the
employees in that department, producing a `Map<String, Double>`.
**Input:** same dataset
**Expected Output:**
```
Engineering -> 58333.33
Finance     -> 57500.0
HR          -> 50000.0
Marketing   -> 40000.0
```

### 17. Sum Salary By Department
**Question:** For each department, compute the total (summed) salary of the
employees in that department, producing a `Map<String, Double>`.
**Input:** same dataset
**Expected Output:** `{Engineering=175000.0, Finance=115000.0, HR=100000.0, Marketing=40000.0}`

### 18. Highest Paid Employee By Department
**Question:** For each department, find the single highest-paid employee,
producing a `Map<String, Employee>` (or `Optional<Employee>` per department).
**Input:** same dataset
**Expected Output:**
```
Engineering -> Alice (60000)
Finance     -> Charlie (70000)
HR          -> Eve (50000)
Marketing   -> Alice (40000)
```

### 19. Duplicate Names
**Question:** Identify which employee names appear more than once in the
list, and return them as a `List<String>`.
**Input:** same dataset
**Expected Output:** `[Alice]`

### 20. Department With Highest Average Salary
**Question:** Across all departments, determine which single department has
the highest average salary.
**Input:** same dataset
**Expected Output:** `Engineering` (58333.33)

### 21. List\<Employee\> → Map\<Id, Employee\>
**Question:** Convert the `List<Employee>` into a `Map<Integer, Employee>`
keyed by each employee's `id`, for O(1) lookup by id.
**Input:** same dataset
**Expected Output:** `{1=Alice, 2=Bob, 3=Charlie, 4=David, 5=Eve, 6=Frank, 7=Grace, 8=Alice}`

### 22. Partition Employees by Salary > 50000
**Question:** Split the employee list into two groups — those earning more
than 50000 and those earning 50000 or less — producing a
`Map<Boolean, List<Employee>>`.
**Input:** same dataset
**Expected Output:**
```
true  -> [Alice(60000), Bob(55000), Charlie(70000), Grace(60000)]
false -> [David(45000), Eve(50000), Frank(50000), Alice(40000)]
```

### 23. Department → List of Employee Names
**Question:** Group employees by department, but instead of storing full
`Employee` objects per department, store just their names, producing a
`Map<String, List<String>>`.
**Input:** same dataset
**Expected Output:**
```
Engineering -> [Alice, Bob, Grace]
Finance     -> [Charlie, David]
HR          -> [Eve, Frank]
Marketing   -> [Alice]
```

### 24. Comma Separated Employee Names
**Question:** Join all employee names into a single comma-and-space
separated `String`.
**Input:** same dataset
**Expected Output:** `"Alice, Bob, Charlie, David, Eve, Frank, Grace, Alice"`

### 25. Increment Salary by 10% (Immutable)
**Question:** Produce a brand-new `List<Employee>` where every employee's
salary is increased by 10%, without mutating the original list or the
original `Employee` objects.
**Input:** same dataset
**Expected Output:**
```
Alice: 66000.0, Bob: 60500.0, Charlie: 77000.0, David: 49500.0,
Eve: 55000.0, Frank: 55000.0, Grace: 66000.0, Alice: 44000.0
```

### 26. Nth Highest Salary (e.g. 3rd Highest, Not Distinct)
**Question:** Find the salary that ranks 3rd when all salaries (including
duplicates) are sorted from highest to lowest — i.e. don't dedupe salary
values first.
**Input:** same dataset, `skip(2)` after descending sort
**Expected Output:** `55000` (sorted desc: 70000, 60000, 60000, **55000**, ...)

### 27. Salary Histogram
**Question:** Bucket every employee into one of three salary ranges —
`<30K`, `30K-60K`, or `>60K` — and count how many employees fall into each
bucket.
**Input:** same dataset
**Expected Output:** `{30K-60K=5, >60K=3}` (no one falls under `<30K`)

### 28. Longest Employee Name
**Question:** Find the employee name with the most characters in the list.
**Input:** same dataset
**Expected Output:** `"Charlie"` (7 characters)

### 29. Employee Name Frequency
**Question:** Count how many times each distinct employee name appears in
the list, producing a `Map<String, Long>`.
**Input:** same dataset
**Expected Output:** `{Alice=2, Bob=1, Charlie=1, David=1, Eve=1, Frank=1, Grace=1}`

### 30. Department With Maximum Employees
**Question:** Determine which single department has the most employees
assigned to it.
**Input:** same dataset
**Expected Output:** `Engineering` (3 employees)