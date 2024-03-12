package com.cibertec.pharmacy.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "medicine")
public class Medicine {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int medicineId;
	private String medicineType;
	private String manufacturer;
	private int stockQuantity;
	private LocalDate expiryDate;
	private double price;
	
}
