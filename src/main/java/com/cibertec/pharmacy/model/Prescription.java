package com.cibertec.pharmacy.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "prescription")
public class Prescription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prescriptionId;
	private String nameDoctor;
	private LocalDate prescribedDate;

	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;
}
