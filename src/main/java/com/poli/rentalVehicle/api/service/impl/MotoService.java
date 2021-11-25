package com.poli.rentalVehicle.api.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poli.rentalVehicle.api.dto.VehicleDTO;
import com.poli.rentalVehicle.api.entity.Vehicle;
import com.poli.rentalVehicle.api.repository.IVehicleRepository;

@Service
public class MotoService extends AVehicle {
	
@Autowired
IVehicleRepository repo;
ModelMapper map = new ModelMapper();
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
	} catch (Exception e) {
		System.out.println(" No se registró el vehiculo");
	}
	return vh;
}
	
private Vehicle maperEntity(VehicleDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}


@Override
boolean updateVehicle(VehicleDTO dto) {
	// TODO Auto-generated method stub
	return false;
}
@Override
boolean deleteVehicle(long id) {

	repo.deleteById(id);
	return false;
}
@Override
Vehicle searchVehicle(long id) {
	// TODO Auto-generated method stub
	return null;
}



	

}
