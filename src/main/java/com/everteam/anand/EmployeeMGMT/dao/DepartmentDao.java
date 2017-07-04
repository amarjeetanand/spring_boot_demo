package com.everteam.anand.EmployeeMGMT.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.everteam.anand.EmployeeMGMT.Model.Department;

@Repository
public class DepartmentDao {

    @Autowired
    DepartmentCrudRepo departmentCrudRepo;
    
    public List<Department> findAll() {
        return (List<Department>) departmentCrudRepo.findAll();
    }

    public Department findById(Integer id) {
        return departmentCrudRepo.findById(id);
    }

    public Department save(Department department) {
        return departmentCrudRepo.save(department);
    }

}
