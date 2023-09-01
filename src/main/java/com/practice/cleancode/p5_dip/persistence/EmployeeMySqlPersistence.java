package com.practice.cleancode.p5_dip.persistence;


import java.util.ArrayList;
import java.util.List;

import com.practice.cleancode.p5_dip.Employee;

public class EmployeeMySqlPersistence implements EmployeePersistence {

    public EmployeeMySqlPersistence(String url, String user, String password) {

    }

    @Override
    public List<Employee> findAll() {
        // Database Query
        return new ArrayList<Employee>();
    }

    @Override
    public void save(Employee employee) {
        // Database Save

    }
}