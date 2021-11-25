package com.poli.rentalVehicle.api.service.impl;

import java.util.List;

import javax.persistence.Entity;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.poli.rentalVehicle.api.dto.VehicleDTO;
import com.poli.rentalVehicle.api.entity.Vehicle;
import com.poli.rentalVehicle.api.repository.IVehicleRepository;

public class AvionetaService extends AVehicle {

	@Autowired
	IVehicleRepository repo;
	ModelMapper map = new  ModelMapper();
	@Override
	public List<Vehicle> listVehicle() {
		
		return repo.findAll();
	}

	
	@Override
	public Vehicle addVehicle(VehicleDTO dto) {
		Vehicle vh = null;
		//regresa el registro que se realizó
		try {
			Vehicle entity = maperEntity(dto);
					vh = repo.save(entity);
		} catch (Exception e) {
			System.out.println(" No se registró el vehiculo");
		}
		return vh;
	}
	

	@Override
	boolean updateVehicle(VehicleDTO dto) {
		Vehicle vh = null;
		try {
			Vehicle entity = maperEntity(dto);
			vh = repo.save(entity);
			
		} catch (Exception e) {
			System.out.println("Error no actualizo");
		}
		return false;
	}

	@Override
	boolean deleteVehicle(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	Vehicle searchVehicle(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
