package com.practice.cleancode.p5_dip.factory;

import com.practice.cleancode.p5_dip.persistence.EmployeePersistence;

public interface EmployeeePersistenceFactory {

    public EmployeePersistence getEmployeePersistance();
}