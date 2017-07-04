package com.everteam.anand.EmployeeMGMT.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everteam.anand.EmployeeMGMT.Model.Address;
import com.everteam.anand.EmployeeMGMT.dao.AddressDao;
import com.everteam.anand.EmployeeMGMT.dao.EmployeeDao;

@Service
public class AddressService {
    
   @Autowired
   AddressDao addressDao;
   
   @Autowired
   EmployeeDao employeeDao;
   


    public Address findById(Integer id) {
        Address address = addressDao.findById(id);
        return address;
    }

    public List<Address> findAll() {
        List<Address> addressList = addressDao.findAll();
        return addressList;
    }

    @Transactional
    public Boolean update(int id, String city, String state, String country) {
        
        Address address = new Address();
        address.setId(id);
        address.setCity(city);
        address.setState(state);
        address.setCountry(country);
        
        Boolean updated = addressDao.update(address);
        return updated;
    }
   
}
