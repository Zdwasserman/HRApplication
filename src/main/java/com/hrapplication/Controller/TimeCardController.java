package com.hrapplication.Controller;

import com.hrapplication.Model.Employee;
import com.hrapplication.Model.TimeCard;
import com.hrapplication.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

/**
 * Created by kurtmccann on 12/1/16.
 */
@Controller
@CrossOrigin(origins = "http://localhost:9000")
public class TimeCardController
{
    @Autowired
    EmployeeRepository empRepo;

    @RequestMapping(value = "/timecards", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String updateEmployeeHours(@RequestBody TimeCard submitted)
    {
        System.out.println("HELLO SPRING");
        System.out.println(submitted.getEmployeeID());
        System.out.println(submitted.getNumHours());
        System.out.println(submitted.getWidgetSales());

//        Employee employee = empRepo.findById(submitted.getEmployeeID());
        Employee employee = empRepo.findOne(submitted.getEmployeeID());
        System.out.println(employee.getFirstName());

        employee.setHours(employee.getHours()+(int)submitted.getNumHours());
        employee.setWidgetSales(employee.getWidgetSales()+(int)submitted.getWidgetSales());
        empRepo.saveAndFlush(employee);

        return "{\"name\": \"JOHN LECZNER\"}";
//        try
//        {
//            System.out.println("Hours: " + submitted.getNumHours());
//        }
//        catch(Exception e)
//        {
//            System.out.println("YOU HAVE ERRED");
//        }
    }


}
