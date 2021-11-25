package com.poli.rentalVehicle.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity(name="vehicle")

public class Vehicle {
	
	@Id
	private long id;
	
	@Column(name="typeVehicle")
	private String typeVehicle;
	
	@Column(name="disponible")
	private  boolean disponible;
	
	@Column(name="brand")
	private String brand;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTypeVehicle() {
		return typeVehicle;
	}
	public void setTypeVehicle(String typeVehicle) {
		this.typeVehicle = typeVehicle;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

}
