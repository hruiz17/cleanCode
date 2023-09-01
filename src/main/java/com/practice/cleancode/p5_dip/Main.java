package com.practice.cleancode.p5_dip;

import com.practice.cleancode.p5_dip.factory.EmployeeMySqlPersistenceFactory;

public class Main {

    public static void main(String[] args) {
        Company company = new Company(new EmployeeMySqlPersistenceFactory());
    }

}