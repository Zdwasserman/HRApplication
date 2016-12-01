package com.hrapplication;

import com.hrapplication.Model.Employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PayCalculator
{
    private Logger log = LoggerFactory.getLogger(PayCalculator.class);

    public double calculatePaycheck (Employee employee) {

        double paycheck;
        Payment payScheme;

        switch (employee.getType()) {
            case SALARY:
                payScheme = (Employee emp) -> {
                    return emp.getSalary();
                };
                break;
            case HOURLY:
                payScheme = (Employee emp) -> {
                    return emp.getHours() * emp.getHourlyRate();
                };
                break;
            case COMMISION:
                payScheme = (Employee emp) -> {
                    return emp.getWidgetSales() * 0.2;
                };
                break;
            default:
                payScheme = null;
        }

        try {
            paycheck = payScheme.calcPay(employee);
        } catch (NullPointerException e) {
            log.warn("Invalid employee payment scheme: " + employee.getId());
            paycheck = 0;
        }

        return paycheck;
    }

    public Employee payEmployee (Employee employee, double amount) {
        double balance = employee.getYearToDate();
        employee.setYearToDate(balance + amount);
        employee.setHours(0);
        employee.setWidgetSales(0);
        return employee;
    }

    public Employee resetYearToDate (Employee employee) {
        employee.setYearToDate(0);
        return employee;
    }

}
