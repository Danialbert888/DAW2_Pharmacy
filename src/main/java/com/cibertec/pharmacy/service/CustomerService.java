package com.cibertec.pharmacy.service;

import java.util.List;

import com.cibertec.pharmacy.model.Customer;

public interface CustomerService {

	public List<Customer> list();
	public Customer add(Customer c);
	public Customer update(Customer c);
	public void delete(int id);
	
}
