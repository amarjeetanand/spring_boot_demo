package com.everteam.anand.EmployeeMGMT.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everteam.anand.EmployeeMGMT.Model.Address;
import com.everteam.anand.EmployeeMGMT.Service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
    
    @Autowired
    AddressService addressService;
    
    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public ResponseEntity<Address> findById(@RequestParam("id")Integer id){
        Address address = addressService.findById(id);
        return new ResponseEntity<Address>(address, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    public ResponseEntity<List<Address>> listAll(){
        List<Address> addressList = addressService.findAll();
        return new ResponseEntity<List<Address>>(addressList, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public ResponseEntity<Boolean> update(
                                    @RequestParam(name="id") Integer id,
                                    @RequestParam(name="city") String city,
                                    @RequestParam(name="state") String state,
                                    @RequestParam(name="country") String country){
                                    
        Boolean updated = addressService.update(id, city, state, country);
        return new ResponseEntity<Boolean>(updated, HttpStatus.ACCEPTED);
    }
}













