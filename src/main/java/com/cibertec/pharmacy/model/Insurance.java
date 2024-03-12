package com.cibertec.pharmacy.model;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "insurance")
public class Insurance {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int insuranceId;
	private String companyName;
	private LocalDate starDate;
	private LocalDate endDate;	
	
}
