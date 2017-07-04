package com.everteam.anand.EmployeeMGMT.Service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everteam.anand.EmployeeMGMT.Model.Email;
import com.everteam.anand.EmployeeMGMT.dao.EmailDao;

@Service
public class EmailService {
    
    @Autowired
    private EmailDao emailDao;
    
    @Autowired
    private EntityManager entityManager;
    
    public List<Email> findAll() {
        List<Email> emailList = emailDao.findAll();
        return emailList;
    }

    public Email findById(Integer email_id) {
        Email email = emailDao.findById(email_id);
        return email;
    }

    public Boolean save(String emailString) {
        Email email = new Email();
        email.setAddress(emailString);
        return emailDao.save(email);
    }

    public Boolean delete(Integer id) {
        
        int deleteCount = emailDao.delete(id);
        
        return deleteCount == 1 ? true : false;
    }
    
    public Boolean updateEmail(Integer id, String emailString) { 
        Email email = entityManager.find(Email.class, id);
        return emailDao.updateEmail(email, emailString);
    }
}
