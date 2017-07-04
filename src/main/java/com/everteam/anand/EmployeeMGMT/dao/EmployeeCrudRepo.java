package com.everteam.anand.EmployeeMGMT.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.everteam.anand.EmployeeMGMT.Model.Address;
import com.everteam.anand.EmployeeMGMT.Model.Employee;

public interface EmployeeCrudRepo extends CrudRepository<Employee, Integer> {
    public List<Employee> findAll();

    public Employee findById(Integer employeeId);
    
}
