package com.cibertec.pharmacy.projections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportOrderMedicineC {

	private Integer medicineId;
	private Integer stockId;
	private Integer stockQuantity;
	private Integer ordenQuantity;
}
