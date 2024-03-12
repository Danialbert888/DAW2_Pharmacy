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
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int employeeId;
	private String firstName;
	private String lastName;
	private LocalDate startDate;
	private LocalDate endDate;
	private char rol;
	private double salary;
	private String phoneNumber;
	private LocalDate dateOfBirth;
	
}
