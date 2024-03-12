package com.cibertec.pharmacy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.pharmacy.model.Customer;
import com.cibertec.pharmacy.repo.CustomerRepo;
import com.cibertec.pharmacy.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepo customerRepo;
	
	@Override
	public List<Customer> list() {
		return customerRepo.findAll();
	}

	@Override
	public Customer add(Customer c) {
		return customerRepo.save(c);
	}

	@Override
	public Customer update(Customer c) {
		return customerRepo.save(c);
	}

	@Override
	public void delete(int id) {
		customerRepo.deleteById(id);
	}



}
