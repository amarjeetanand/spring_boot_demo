package com.everteam.anand.EmployeeMGMT.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.everteam.anand.EmployeeMGMT.Model.Address;

@Repository
public class AddressDao {
    
    @Autowired 
    AddressCrudRepo addressCrudRepo;
    
    public Address findById(Integer id) {
        Address address = addressCrudRepo.findById(id);
        return address;
    }
    public List<Address> findAll() {
        return (List<Address>) addressCrudRepo.findAll();
    }
    public Boolean update(Address address) {
        addressCrudRepo.save(address);
        return true;
    }

}
