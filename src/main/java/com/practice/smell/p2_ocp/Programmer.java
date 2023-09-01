package com.practice.smell.p2_ocp;


public class Programmer {

    private String fullName;
    private Integer salary;

    public Programmer(String fullName, Integer salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getSalary() {
        return salary;
    }

}