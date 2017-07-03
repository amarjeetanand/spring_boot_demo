package com.everteam.anand.EmployeeMGMT.dao;

import org.springframework.data.repository.CrudRepository;

import com.everteam.anand.EmployeeMGMT.Model.Email;

public interface EmailCrudRepo extends CrudRepository<Email, Integer> {
    
    public Email findById(Integer id);
    
}
