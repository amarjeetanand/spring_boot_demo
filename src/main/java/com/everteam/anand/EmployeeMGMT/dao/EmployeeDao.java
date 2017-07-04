package com.everteam.anand.EmployeeMGMT.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.everteam.anand.EmployeeMGMT.Model.Employee;

@Repository

public class EmployeeDao {
    
    @Autowired
    EmployeeCrudRepo employeeCrudRepo;
    @Autowired
    AddressCrudRepo addressCrudRepo;
    
    public List<Employee> findAll() {
        return employeeCrudRepo.findAll();
    }

    public Employee findById(Integer id) {
        return employeeCrudRepo.findById(id);
    }

}
