package com.superthirty;

import java.util.Objects;

public class Employee {

    private int id;
    private String name;
    private String department;
    private double salary;
    private boolean active;
    private String email;

    public Employee(int id, String name, String department, double salary, boolean active, String email) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.active = active;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isActive() {
        return active;
    }

    public String getEmail() {
        return email;
    }

    // Handy for the "Increment Salary by 10% (Immutable)" style problems,
    // where you build a new Employee instead of mutating the existing one.
    public Employee withSalary(double newSalary) {
        return new Employee(this.id, this.name, this.department, newSalary, this.active, this.email);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", department='" + department + '\'' + ", salary=" + salary + ", active=" + active + ", email='" + email + '\'' + '}';
    }
}
