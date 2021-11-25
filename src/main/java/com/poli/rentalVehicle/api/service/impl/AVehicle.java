package com.poli.rentalVehicle.api.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.poli.rentalVehicle.api.dto.VehicleDTO;
import com.poli.rentalVehicle.api.entity.Vehicle;
import com.poli.rentalVehicle.api.repository.IVehicleRepository;


public abstract class AVehicle {
	
	public 	abstract List<Vehicle> listVehicle();
	abstract Vehicle addVehicle(VehicleDTO dto);
	abstract boolean updateVehicle(VehicleDTO dto);
	abstract boolean deleteVehicle(long id);
	abstract Vehicle searchVehicle(long id);

}
