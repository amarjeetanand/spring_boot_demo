package com.everteam.anand.EmployeeMGMT.Controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.everteam.anand.EmployeeMGMT.Model.Employee;
import com.everteam.anand.EmployeeMGMT.Service.EmployeeService;

@RestController
@RequestMapping("/emplyee")
public class EmployeeController {
    
    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    public ResponseEntity<List<Employee>> findAll() {
        List<Employee> employeeList = employeeService.findAll();
        return new ResponseEntity<List<Employee>>(employeeList, HttpStatus.OK);
    }
    

    @RequestMapping(value = "id/{id}", method = RequestMethod.GET)
    public ResponseEntity<Employee> findById(@PathVariable("id") Integer id){
        Employee employee = employeeService.findById(id);
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }
}
