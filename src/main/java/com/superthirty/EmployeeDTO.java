package com.superthirty;

import java.util.List;

public class EmployeeDTO {
    public static List<Employee> getEmployees() {
        return List.of(
                new Employee(1, "Alice", "Engineering", 60000, true, "alice@co.com"),
                new Employee(2, "Bob", "Engineering", 55000, true, "bob@co.com"),
                new Employee(3, "Charlie", "Finance", 70000, false, "charlie@co.com"),
                new Employee(4, "David", "Finance", 45000, true, "david@co.com"),
                new Employee(5, "Eve", "HR", 50000, true, "eve@co.com"),
                new Employee(6, "Frank", "HR", 50000, false, null),
                new Employee(7, "Grace", "Engineering", 60000, true, "grace@co.com"),
                new Employee(8, "Alice", "Marketing", 40000, true, "alice2@co.com")
        );
    }
}
