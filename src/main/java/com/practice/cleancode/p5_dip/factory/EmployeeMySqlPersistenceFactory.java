package com.practice.cleancode.p5_dip.factory;

import com.practice.cleancode.p5_dip.persistence.EmployeePersistence;
import com.practice.cleancode.p5_dip.persistence.EmployeeMySqlPersistence;

public class EmployeeMySqlPersistenceFactory implements EmployeeePersistenceFactory {

    @Override
    public EmployeePersistence getEmployeePersistance() {
        return new EmployeeMySqlPersistence(System.getProperty("mysqlurl"),
                System.getProperty("mysqlurl"), System.getProperty("mysqlurl"));
    }

}