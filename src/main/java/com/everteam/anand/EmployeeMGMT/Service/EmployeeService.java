package com.everteam.anand.EmployeeMGMT.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everteam.anand.EmployeeMGMT.Model.Employee;
import com.everteam.anand.EmployeeMGMT.dao.EmployeeDao;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDao;
    
    public List<Employee> findAll(){
        return employeeDao.findAll();
    }

    public Employee findById(Integer id) {
        return employeeDao.findById(id);
    }

}
