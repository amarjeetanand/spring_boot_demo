package com.everteam.anand.EmployeeMGMT.dao;

import org.springframework.data.repository.CrudRepository;

import com.everteam.anand.EmployeeMGMT.Model.Department;

public interface DepartmentCrudRepo extends CrudRepository<Department, Integer> {

    Department findById(Integer id);

}
