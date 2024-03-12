package com.cibertec.pharmacy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.pharmacy.model.Prescription;

public interface PrescriptionRepo extends JpaRepository<Prescription, Integer>{

}
