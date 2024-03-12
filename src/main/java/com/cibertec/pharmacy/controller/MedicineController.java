package com.cibertec.pharmacy.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.pharmacy.projections.ReportOrderMedicine;
import com.cibertec.pharmacy.projections.ReportOrderMedicineC;
import com.cibertec.pharmacy.service.MedicineService;

@RestController
@RequestMapping("/medicine")
public class MedicineController {

	@Autowired
	MedicineService medicineService;
	
	@GetMapping("/report-order-medicine-o")
	public ResponseEntity<List<ReportOrderMedicineC>> getReportObject(){
		return  new ResponseEntity<>(medicineService.getReportOrderMedicine(), HttpStatus.OK)  ;
	}
	
	@GetMapping("/report-order-medicine-c")
	public ResponseEntity<List<ReportOrderMedicineC>> getReportClass(){
		return  new ResponseEntity<>(medicineService.getReportOrderMedicineC(), HttpStatus.OK)  ;
	}
	
	@GetMapping("/report-order-medicine-f")
	public ResponseEntity<List<ReportOrderMedicine>> getReportInterface(){
		return  new ResponseEntity<>(medicineService.getReportOrderMedicineI(), HttpStatus.OK)  ;
	}
}
