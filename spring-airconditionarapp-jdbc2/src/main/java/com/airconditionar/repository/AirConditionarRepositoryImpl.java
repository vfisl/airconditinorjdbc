package com.airconditionar.repository;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.airconditionar.model.AirConditionar;
import com.airconditionar.util.DbQuery;
@Repository
public class AirConditionarRepositoryImpl implements IAirConditionarRepository {
	
private JdbcTemplate jdbctemplate;

@Autowired
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
	this.jdbctemplate = jdbctemplate;
}

	@Override
	public void addAirConditionar(AirConditionar airConditionar) {
		
		Object[] airArray= {airConditionar.getName(),airConditionar.getBrand(),airConditionar.getPrice(),airConditionar.getType(),airConditionar.getId()
		};
		jdbctemplate.update(DbQuery.INSERTQUERY,airArray);
		}
		
	

	@Override
	public void updateAirConditionar(int id, double price) {
		jdbctemplate.update(DbQuery.UPDATEQUERY,id,price);
		
	}

	@Override
	public void deleteAirConditionar(int id) {
		jdbctemplate.update(DbQuery.DELETEQUERY,id);
		
	}

	@Override
	public List<AirConditionar> findAll() {
		RowMapper<AirConditionar> mapper= new AirConditionarMapper();
		List<AirConditionar>airConditionars=jdbctemplate.query(DbQuery.SELECTQUERY, mapper);
		return airConditionars;
	}

	@Override
	public List<AirConditionar> findByName(String name) {
		List<AirConditionar>airConditionars=jdbctemplate.query(DbQuery.SELECTNAME, new AirConditionarMapper(),name);
		
		return airConditionars;
				
	}

	@Override
	public List<AirConditionar> findByBrand(String brand) {
		List<AirConditionar>airConditionars=jdbctemplate.query(DbQuery.SELECTBRAND,new AirConditionarMapper(),brand);
		return airConditionars;
	}

	@Override
	public List<AirConditionar> findByPrice(double price) {
		List<AirConditionar>airConditionars=jdbctemplate.query(DbQuery.SELECTPRICE,new AirConditionarMapper(),price);
		return airConditionars;
	}

	@Override
	public List<AirConditionar> findByType(String type) {
		List<AirConditionar>airConditionars=jdbctemplate.query(DbQuery.SELECTTYPE,new AirConditionarMapper(),type);
				
		return airConditionars;
	}

	@Override
	public AirConditionar findById(int id) {
		List<AirConditionar>airConditionars=jdbctemplate.query(DbQuery.SELECTID,new AirConditionarMapper(),id);
		return airConditionars.stream().findFirst().get();
	}

	
}

















