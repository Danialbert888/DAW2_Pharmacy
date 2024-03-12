package com.cibertec.pharmacy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.pharmacy.model.Customer;
import com.cibertec.pharmacy.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;

	@GetMapping
	public ResponseEntity<List<Customer>> list(){
		return  new ResponseEntity<>(customerService.list(), HttpStatus.OK)  ;
	}
	
	@PostMapping
	public ResponseEntity<Customer> add(@RequestBody Customer c) {
		return new ResponseEntity<>(customerService.add(c), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Customer> update(@RequestBody Customer c) {
		return new ResponseEntity<>(customerService.update(c), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int id) {
		customerService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
