package com.cibertec.pharmacy.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ordered_drug")
public class OrderedDrug {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderedDrugId;
	
	@ManyToOne
	@JoinColumn(name = "orden_id")
	private Orden orden;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "medicine_id")
	private Medicine medicine;
	
	private int orderQuantity;
	private double price;
	
}
