package com.java8;

import java.util.List;

public class Person {
    String name;
    List<String> color;
    int age;

    public Person(String name, List<String> color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getColor() {
        return color;
    }

    public void setColor(List<String> color) {
        this.color = color;
    }
}
