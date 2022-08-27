package com.airconditionar.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.airconditionar.exception.AirConditionarNotFoundException;
import com.airconditionar.exception.IdNotFoundException;
import com.airconditionar.model.AirConditionar;

@Repository
public interface IAirConditionarRepository {
	void addAirConditionar(AirConditionar airConditionar);
	void updateAirConditionar(int id, double price);
	void deleteAirConditionar(int id);
	
	List<AirConditionar> findAll();
	
	List<AirConditionar> findByName(String name);
	List<AirConditionar> findByBrand(String brand);
	List<AirConditionar> findByPrice(double price);
	List<AirConditionar> findByType(String type);
	AirConditionar findById(int id);
	
	
	
}
