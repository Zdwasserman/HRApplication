package com.hrapplication;

import com.hrapplication.Model.Employee;

/**
 * Created by zacharywasserman on 11/28/16.
 */
public class PayCalculator
{

    public Employee calculatePayment (Employee employee) {

        int balance;
        int paycheck;
        Payment getPaycheck;

        switch (employee.getType()) {
            case SALARY: getPaycheck = (Employee emp) -> {emp.}
            break;
            case HOURLY: break;
            case COMMISSION: break;
        }

        return employee;
    }
    
}
