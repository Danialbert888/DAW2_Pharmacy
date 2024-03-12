package com.cibertec.pharmacy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.pharmacy.model.Prescription;
import com.cibertec.pharmacy.repo.PrescriptionRepo;
import com.cibertec.pharmacy.service.PrescriptionService;

@Service
public class PrescriptionServiceImpl implements PrescriptionService{

	@Autowired
	PrescriptionRepo prescriptionRepo;
	
	@Override
	public List<Prescription> list() {
		return prescriptionRepo.findAll();
	}

	@Override
	public Prescription add(Prescription p) {
		return prescriptionRepo.save(p);
	}

	@Override
	public Prescription update(Prescription p) {
		return prescriptionRepo.save(p);
	}

	@Override
	public void delete(int id) {
		prescriptionRepo.deleteById(id);
	}

}
