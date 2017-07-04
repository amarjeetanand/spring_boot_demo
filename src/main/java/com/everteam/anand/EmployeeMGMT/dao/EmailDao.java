package com.everteam.anand.EmployeeMGMT.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.everteam.anand.EmployeeMGMT.Model.Email;

@Repository
public class EmailDao {

    @Autowired
    private EmailCrudRepo emailCrudRepo;
    
    public List<Email> findAll() {
        return (List<Email>) emailCrudRepo.findAll();
    }

    public Email findById(Integer email_id) {
        Email email = emailCrudRepo.findById(email_id);
        return email;
    }

    public Boolean save(Email email) {
        Email insertedEmail = emailCrudRepo.save(email);
        return insertedEmail != null ? Boolean.TRUE : Boolean.FALSE;
    }
    
    @Transactional
    public int delete(Integer id) {
        return emailCrudRepo.deleteById(id);
    }

    @Transactional
    public Boolean updateEmail(Email email, String emailString) {
        email.setAddress(emailString);
        Email savedEmail = emailCrudRepo.save(email);
        
        return savedEmail.getAddress().equals(emailString) ? true: false;
    }
    
    

}
