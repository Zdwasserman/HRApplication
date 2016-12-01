package com.hrapplication.Model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by zacharywasserman on 11/28/16.
 */

@Entity
@Table(name="employees")
@Component
public class Employee
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstName;
    private String lastName;
    private Enum type;
    private double widgetSales;
    private int hours;
    private double hourlyRate;

    public Employee(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNAme() {
        return lastName;
    }

    public void setLastNAme(String lastNAme) {
        this.lastName = lastNAme;
    }

    public Enum getType() {
        return type;
    }

    public void setType(Enum type) {
        this.type = type;
    }

    public double getWidgetSales() {
        return widgetSales;
    }

    public void setWidgetSales(double widgetSales) {
        this.widgetSales = widgetSales;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void updateHoursWidgets()
    {

    }
}
