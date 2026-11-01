package com.java8;

import java.util.Objects;

public final class EmployeeWithStatus {
    private final int id;
    private final String name;
    private final String department;
    private final double salary;
    private final String status; // "ACTIVE" or "INACTIVE"

    // Canonical Constructor
    public EmployeeWithStatus(int id, String name, String department, double salary, String status) {
        this.id = id;
        this.name = Objects.requireNonNull(name, "Name cannot be null");
        this.department = Objects.requireNonNull(department, "Department cannot be null");
        this.salary = salary;
        this.status = Objects.requireNonNull(status, "Status cannot be null");
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public String getStatus() { return status; }

    // Equals and HashCode (Crucial for groupingBy and Set collections)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeWithStatus EmployeeWithStatus = (EmployeeWithStatus) o;
        return id == EmployeeWithStatus.id &&
                Double.compare(EmployeeWithStatus.salary, salary) == 0 &&
                name.equals(EmployeeWithStatus.name) &&
                department.equals(EmployeeWithStatus.department) &&
                status.equals(EmployeeWithStatus.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, department, salary, status);
    }

    // Custom string output for clean debug logging
    @Override
    public String toString() {
        return String.format("EmployeeWithStatus[id=%d, name='%s', dept='%s', salary=%.2f, status='%s']",
                id, name, department, salary, status);
    }
}
