package com.poli.rentalVehicle.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.poli.rentalVehicle.api.dto.VehicleDTO;
import com.poli.rentalVehicle.api.service.impl.AutoService;

@RestController
@RequestMapping("/rental")
public class RentalVehicleController {
	
	@Autowired
	AutoService autoService;	
	
	@ResponseBody
	@GetMapping("/list")
	public ResponseEntity<?> listVehicle()
	{
		return ResponseEntity.status(HttpStatus.OK).body(autoService.listVehicle());
	}
	
	@ResponseBody
	@GetMapping("/search/{id}")
	public ResponseEntity<?> searchVehicle(@PathVariable long id)
	{
		return ResponseEntity.status(HttpStatus.OK).body(autoService.searchVehicle(id));
	}
	
	@ResponseBody
	@PostMapping("/create")
	public ResponseEntity<?> createVehicle(@RequestBody VehicleDTO dto)
	{
		return ResponseEntity.status(HttpStatus.OK).body(autoService.addVehicle(dto));
	}
	
	@ResponseBody
	@PutMapping("update")
	public ResponseEntity<?> updateVehicle(@RequestBody VehicleDTO dto){
		
		return ResponseEntity.status(HttpStatus.OK).body(autoService.updateVehicle(dto));
	}
	
	@ResponseBody
	@DeleteMapping("/delete")
	public ResponseEntity<?> deleteVehicle(@RequestParam VehicleDTO dto){
		
		return ResponseEntity.status(HttpStatus.OK).body(autoService.listVehicle());
		
	}
	
	

}
