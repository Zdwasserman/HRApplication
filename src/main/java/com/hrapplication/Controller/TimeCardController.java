package com.hrapplication.Controller;

import com.hrapplication.Model.TimeCard;
import com.hrapplication.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    public void updateEmployeeHours(@RequestBody TimeCard submitted)
    {
        try
        {
            System.out.println("Hours: " + submitted.getNumHours());
        }
        catch(Exception e)
        {
            System.out.println("YOU HAVE ERRED");
        }

    }


}
