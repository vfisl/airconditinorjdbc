package com.airconditionar.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.airconditionar.exception.AirConditionarNotFoundException;
import com.airconditionar.exception.IdNotFoundException;
import com.airconditionar.model.AirConditionar;

@Service
public interface IAirConditionar {
	void addAirConditionar(AirConditionar airConditionar);
	void updateAirConditionar(int id, double price);
	void deleteAirConditionar(int id);
	
	List<AirConditionar> getAll();
	
	List<AirConditionar> getByName(String name);
	List<AirConditionar> getByBrand(String brand);
	List<AirConditionar> getByPrice(double price);
	List<AirConditionar> getByType(String type);
	AirConditionar getById(int id);
	 
	
}



