package com.everteam.anand.EmployeeMGMT.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.everteam.anand.EmployeeMGMT.Model.Employee;

@Repository
@Transactional
public class EmployeeDao {
    
    @Autowired
    EmployeeCrudRepo employeeCrudRepo;
    
    public List<Employee> findAll() {
        return employeeCrudRepo.findAll();
    }
}
