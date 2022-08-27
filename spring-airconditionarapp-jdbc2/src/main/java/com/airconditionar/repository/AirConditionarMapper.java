package com.airconditionar.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.airconditionar.model.AirConditionar;

public class AirConditionarMapper implements RowMapper<AirConditionar>{

	@Override
	public AirConditionar mapRow(ResultSet rs, int rowNum) throws SQLException {
		String name=rs.getString("name");
		String brand=rs.getString("brand");
		String type=rs.getString("type");
		double price=rs.getDouble("price");
		int id=rs.getInt("id");
		
		AirConditionar airConditionar=new AirConditionar();
		airConditionar.setBrand(brand);
		airConditionar.setId(rowNum);
		airConditionar.setName(name);
		airConditionar.setPrice(price);
		airConditionar.setType(type);
		return airConditionar;
	}


}
