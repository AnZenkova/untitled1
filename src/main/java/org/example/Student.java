package org.example;

import java.util.Objects;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);

    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Student student = (Student) other;
        return age == student.age && Objects.equals(name, student.name);
    }
}
