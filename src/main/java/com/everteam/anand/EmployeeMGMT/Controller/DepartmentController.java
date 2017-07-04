package com.everteam.anand.EmployeeMGMT.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everteam.anand.EmployeeMGMT.Model.Department;
import com.everteam.anand.EmployeeMGMT.Service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    
    @Autowired
    DepartmentService departmentService;
    
    @RequestMapping(value ="/listAll", method = RequestMethod.GET)
    public List<Department> findAll() {
        return departmentService.findAll();
    }
    
    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    public ResponseEntity<Department> findById(@PathVariable("id") Integer id) {
        Department department = departmentService.findById(id);
        return new ResponseEntity<Department>(department, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public ResponseEntity<Department> save(
                                        @RequestParam("name")String name,
                                        @RequestParam("detail")String detail) {
        
        Department saved = departmentService.save(name, detail);
        return new ResponseEntity<Department>(saved, HttpStatus.OK);
    }
}
