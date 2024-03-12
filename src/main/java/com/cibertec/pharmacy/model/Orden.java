package com.cibertec.pharmacy.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "orden")
public class Orden {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ordenId;
	
	private LocalDate orderDate;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "prescription_id")
	private Prescription prescription;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "employee_id") 
	private Employee employee;
	
}
