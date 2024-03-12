package com.cibertec.pharmacy.service;

import java.util.List;
import java.util.Map;

import com.cibertec.pharmacy.projections.ReportOrderMedicine;
import com.cibertec.pharmacy.projections.ReportOrderMedicineC;

public interface MedicineService {

	public List<ReportOrderMedicineC> getReportOrderMedicine();
	public List<ReportOrderMedicineC> getReportOrderMedicineC();
	public List<ReportOrderMedicine> getReportOrderMedicineI();
}
