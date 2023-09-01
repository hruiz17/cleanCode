package com.practice.cleancode.p5_dip.persistence;


import com.practice.cleancode.p5_dip.Employee;

import java.util.List;


public interface EmployeePersistence {

    public List<Employee> findAll();

    public void save(Employee employee);
}