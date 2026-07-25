package com.topfifty;


import java.util.List;

public class EmployeesDTO {
    public static List<Employees> getEmployees() {
        return List.of(
                new Employees(1, "Alice", "Engineering", 60000, true, "alice@co.com"),
                new Employees(2, "Bob", "Engineering", 55000, true, "bob@co.com"),
                new Employees(3, "Charlie", "Finance", 70000, false, "charlie@co.com"),
                new Employees(4, "David", "Finance", 45000, true, "david@co.com"),
                new Employees(5, "Eve", "HR", 50000, true, "eve@co.com"),
                new Employees(6, "Frank", "HR", 50000, false, null),
                new Employees(7, "Grace", "Engineering", 60000, true, "grace@co.com"),
                new Employees(8, "Alice", "Marketing", 40000, true, "alice2@co.com")
        );
    }
}
