package com.everteam.anand.EmployeeMGMT.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.everteam.anand.EmployeeMGMT.Model.Email;

public interface EmailCrudRepo extends CrudRepository<Email, Integer> {
    
    public Email findById(Integer id);
    
    public List<Email> findAll();
    
    public Email save(Email email);

    public Integer deleteById(Integer id);
    
//    public Integer updateEmail
    
}
