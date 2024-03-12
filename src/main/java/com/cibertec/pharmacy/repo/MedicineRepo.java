package com.cibertec.pharmacy.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cibertec.pharmacy.model.Medicine;
import com.cibertec.pharmacy.projections.ReportOrderMedicine;
import com.cibertec.pharmacy.projections.ReportOrderMedicineC;

public interface MedicineRepo extends JpaRepository<Medicine, Integer> {

	@Query("SELECT "
	        + "m.medicineId, "
	        + "m.stockQuantity, "
	        + "od.orden.ordenId, "
	        + "od.orderQuantity "
	        + "FROM Medicine m "
	        + "INNER JOIN OrderedDrug od "
	        + "ON m.medicineId = od.medicine.medicineId")
	public List<Object[]> getReportOrderMedicine();

	@Query("SELECT new com.cibertec.pharmacy.projections.ReportOrderMedicineC("
	        + "m.medicineId, "
	        + "m.stockQuantity, "
	        + "od.orden.ordenId, "
	        + "od.orderQuantity )"
	        + "FROM Medicine m "
	        + "INNER JOIN OrderedDrug od "
	        + "ON m.medicineId = od.medicine.medicineId")
	public List<ReportOrderMedicineC> getReportOrderMedicineC();
	
	@Query("SELECT " 
	        + "m.medicineId, "
	        + "m.stockQuantity, "
	        + "od.orden.ordenId, "
	        + "od.orderQuantity "
	        + "FROM Medicine m "
	        + "INNER JOIN OrderedDrug od "
	        + "ON m.medicineId = od.medicine.medicineId")
	public List<ReportOrderMedicine> getReportOrderMedicineI();


}
