package com.everteam.anand.EmployeeMGMT.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.everteam.anand.EmployeeMGMT.Model.Address;

public interface AddressCrudRepo extends CrudRepository<Address, Integer> {
    
    public List<Address> findAll();
    public Address findById(Integer id);
}

