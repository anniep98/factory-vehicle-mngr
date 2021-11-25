package com.poli.rentalVehicle.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poli.rentalVehicle.api.entity.Vehicle;

public interface IVehicleRepository extends JpaRepository<Vehicle, Long> {

}
