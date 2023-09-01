package com.practice.cleancode.p5_dip.factory;

import com.practice.cleancode.p5_dip.persistence.EmployeeMemoryPersistence;
import com.practice.cleancode.p5_dip.persistence.EmployeePersistence;

public class EmployeeMemoryPersistenceFactory implements EmployeeePersistenceFactory {

    @Override
    public EmployeePersistence getEmployeePersistance() {
        return new EmployeeMemoryPersistence();
    }

}