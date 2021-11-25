package com.poli.rentalVehicle.api.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.poli.rentalVehicle.api.dto.VehicleDTO;
import com.poli.rentalVehicle.api.entity.Vehicle;
import com.poli.rentalVehicle.api.repository.IVehicleRepository;

@Service
public class AutoService extends AVehicle {
	
	
	
	@Autowired
	IVehicleRepository repo;
	ModelMapper map = new ModelMapper();
	@Override
	
	public Vehicle addVehicle(VehicleDTO dto) {
		Vehicle vh = null;
		//me regresa el registro que hizo para saber que registró
		try {
			Vehicle entity = maperEntity(dto);
			vh = repo.save(entity);
					
		}catch(Exception e) {
			System.out.println("No seregistro el Auto");
		}
		return vh;
	}
	
	@Override
	
	public boolean updateVehicle(VehicleDTO dto) {
		
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
		repo.deleteById(id);
		return false;
	}
	@Override
	public Vehicle searchVehicle(long id) {
	 return	repo.findById(id).get();
	}
	
	private Vehicle maperEntity(VehicleDTO dto) {
		return map.map(dto, Vehicle.class);
	}
	
	@Override
	public List<Vehicle> listVehicle() {
		return repo.findAll();
	}
	

}
