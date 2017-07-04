package com.everteam.anand.EmployeeMGMT.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everteam.anand.EmployeeMGMT.Model.Email;
import com.everteam.anand.EmployeeMGMT.Service.EmailService;

@RestController
@RequestMapping("/email")
public class EmailController {
    
    @Autowired
    private EmailService emailService;
    
    
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    public ResponseEntity<List<Email>> listAll () {
        List<Email> emailList = emailService.findAll();
        return new ResponseEntity<List<Email>>(emailList, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public ResponseEntity<Email> findById(@RequestParam("id") Integer email_id) {
        Email email = emailService.findById(email_id);
        return new ResponseEntity<Email>(email, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public ResponseEntity<Boolean> save(@RequestParam("email")String email) { 
        Boolean inserted = emailService.save(email);
        return new ResponseEntity<Boolean>(inserted, HttpStatus.ACCEPTED);
    }
    
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public ResponseEntity<Boolean> delete(@RequestParam("id")Integer id) { 
        Boolean deleted = emailService.delete(id);
        return new ResponseEntity<Boolean>(deleted, HttpStatus.ACCEPTED);
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public ResponseEntity<Boolean> update(@RequestParam("id")Integer id, @RequestParam("email") String email) {
        Boolean updated = emailService.updateEmail(id, email);
        return new ResponseEntity<Boolean>(updated, HttpStatus.ACCEPTED);
    }
}
