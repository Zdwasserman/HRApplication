package com.hrapplication.Controller;

import com.hrapplication.Model.Employee;
import com.hrapplication.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by zacharywasserman on 11/28/16.
 */

@CrossOrigin("http://localhost:9000")
@RestController
public class EmployeeController
{

    @Autowired
    EmployeeRepository employeeRepo;


    public EmployeeController(EmployeeRepository employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }

    @RequestMapping(value = "/createEmployee", method = RequestMethod.POST)
    public Employee createEmployee(@RequestBody Employee employee)
    {
        employeeRepo.save(employee);
        return employee;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Employee> getEmployee()
    {
        return employeeRepo.findAll();
    }

    @RequestMapping(value="/findID", method = RequestMethod.GET, params="empID")
    public @ResponseBody Employee getEmployee(@RequestParam("empID") int id)
    {
        System.out.println("GETTING EMPLOYEE");
        return employeeRepo.findOne(id);
    }



}
