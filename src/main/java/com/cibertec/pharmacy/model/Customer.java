package com.cibertec.pharmacy.model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "customer")
public class Customer implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	private String firstName;
	private String lastName;
	private String phone;
	private char gender;
	private String address;
	private LocalDate dateOfBirth;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "insurance_id", referencedColumnName = "insuranceId")
	private Insurance insurance;
	
}
