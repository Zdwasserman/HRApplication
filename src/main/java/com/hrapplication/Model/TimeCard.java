package com.hrapplication.Model;

/**
 * Created by zacharywasserman on 11/28/16.
 */
public class TimeCard
{
    private int EmployeeID;
    private double widgetSales;
    private double numHours;

    public TimeCard(){}

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public double getWidgetSales() {
        return widgetSales;
    }

    public void setWidgetSales(double widgetSales) {
        this.widgetSales = widgetSales;
    }

    public double getNumHours() {
        return numHours;
    }

    public void setNumHours(double numHours) {
        this.numHours = numHours;
    }
}
