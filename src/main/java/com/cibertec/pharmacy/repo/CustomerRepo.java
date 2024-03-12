package com.cibertec.pharmacy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cibertec.pharmacy.model.Customer;
import com.cibertec.pharmacy.projections.ReportOrderMedicine;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

	
}
