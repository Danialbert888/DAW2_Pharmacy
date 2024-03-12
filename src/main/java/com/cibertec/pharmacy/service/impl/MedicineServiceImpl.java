package com.cibertec.pharmacy.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.pharmacy.projections.ReportOrderMedicine;
import com.cibertec.pharmacy.projections.ReportOrderMedicineC;
import com.cibertec.pharmacy.repo.MedicineRepo;
import com.cibertec.pharmacy.service.MedicineService;

@Service
public class MedicineServiceImpl implements MedicineService{

	@Autowired
	public MedicineRepo medicineRepo;

	@Override
	public List<ReportOrderMedicineC> getReportOrderMedicine() {
		
		List<Object[]> resultList = medicineRepo.getReportOrderMedicine();
		List<ReportOrderMedicineC> reportList = new ArrayList<>();

	    for (Object[] row : resultList) {
	        Integer medicineId = (Integer) row[0];
	        Integer stockId = (Integer) row[1];
	        Integer stockQuantity = (Integer) row[2];
	        Integer orderQuantity = (Integer) row[3];

	        ReportOrderMedicineC report = new ReportOrderMedicineC(medicineId, stockId, stockQuantity, orderQuantity);
	        reportList.add(report);
	    }
		return reportList;
	}

	@Override
	public List<ReportOrderMedicineC> getReportOrderMedicineC() {
		List<ReportOrderMedicineC> list = medicineRepo.getReportOrderMedicineC();
		return list;
	}

	@Override
	public List<ReportOrderMedicine> getReportOrderMedicineI() {
		List<ReportOrderMedicine> list = medicineRepo.getReportOrderMedicineI();
		return list;
	}
	
	
}
