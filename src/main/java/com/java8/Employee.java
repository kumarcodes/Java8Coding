package com.java8;

public class Employee {

    Long employeeId;
    String name;
    String emailId;
    String dept;

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Employee(Long employeeId, String name, String emailId, String dept) {
        this.employeeId = employeeId;
        this.name = name;
        this.emailId = emailId;
        this.dept = dept;
    }
}
