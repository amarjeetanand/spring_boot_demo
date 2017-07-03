package com.everteam.anand.EmployeeMGMT.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everteam.anand.EmployeeMGMT.Model.Employee;
import com.everteam.anand.EmployeeMGMT.Service.EmployeeService;

@RestController
@RequestMapping("/emplyee")
public class EmployeeController {
    
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/listAll")
    public ResponseEntity<List<Employee>> findAll() {
        List<Employee> employeeList = employeeService.findAll();
        return new ResponseEntity<List<Employee>>(employeeList, HttpStatus.OK);
    }
}
