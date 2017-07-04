package com.everteam.anand.EmployeeMGMT.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everteam.anand.EmployeeMGMT.Model.Department;
import com.everteam.anand.EmployeeMGMT.dao.DepartmentDao;

@Service
public class DepartmentService {
    
    @Autowired
    DepartmentDao departmentDao;
    
    public List<Department> findAll() {
        List<Department> departmentList = departmentDao.findAll();
        return departmentList;
    }

    public Department findById(Integer id) {
        return departmentDao.findById(id);
    }

    public Department save(String name, String detail) {
        Department department = new Department();
        department.setName(name);
        department.setDetail(detail);
        return departmentDao.save(department);
    }

}
