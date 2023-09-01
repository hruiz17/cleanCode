package com.practice.cleancode.p5_dip;


import com.practice.cleancode.p5_dip.factory.EmployeeePersistenceFactory;
import com.practice.cleancode.p5_dip.persistence.EmployeePersistence;

public class Company {

    private EmployeePersistence persistence;

    public Company(EmployeeePersistenceFactory persistenceFactory) {
        persistence = persistenceFactory.getEmployeePersistance();
    }

    public void addEmployee(Employee e) {
        persistence.save(e);
    }
}