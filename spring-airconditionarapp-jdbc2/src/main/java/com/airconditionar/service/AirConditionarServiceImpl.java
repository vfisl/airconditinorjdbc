package com.airconditionar.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.airconditionar.exception.AirConditionarNotFoundException;
import com.airconditionar.exception.IdNotFoundException;
import com.airconditionar.model.AirConditionar;
import com.airconditionar.repository.IAirConditionarRepository;


@Service
public class AirConditionarServiceImpl implements IAirConditionar {
	@Autowired
 IAirConditionarRepository airConditionarRepository;
	


	public void setAirConditionarRepository(IAirConditionarRepository airConditionarRepository) {
		this.airConditionarRepository = airConditionarRepository;
	}

	@Override
	public void addAirConditionar(AirConditionar airConditionar) {
		airConditionarRepository.addAirConditionar(airConditionar);
		
	}

	@Override
	public void updateAirConditionar(int id, double price) {
		airConditionarRepository.updateAirConditionar(id, price);
		
	}

	@Override
	public void deleteAirConditionar(int id) {
		airConditionarRepository.deleteAirConditionar(id);
		
	}

	@Override
	public List<AirConditionar> getAll() {
		return airConditionarRepository.findAll();
	}

	@Override
	public List<AirConditionar> getByName(String name) {
		return airConditionarRepository.findByName(name);
	}

	@Override
	public List<AirConditionar> getByBrand(String brand) {
		return airConditionarRepository.findByBrand(brand);
	}

	@Override
	public List<AirConditionar> getByPrice(double price) {
		return airConditionarRepository.findByPrice(price);
	}

	@Override
	public List<AirConditionar> getByType(String type) {
		return airConditionarRepository.findByType(type);
	}

	@Override
	public AirConditionar getById(int id) {
		return airConditionarRepository.findById(id);
	}

	
	

	
}
