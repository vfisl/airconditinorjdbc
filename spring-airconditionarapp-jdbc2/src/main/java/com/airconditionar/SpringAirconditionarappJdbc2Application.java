package com.airconditionar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.airconditionar.model.AirConditionar;
import com.airconditionar.service.IAirConditionar;

@SpringBootApplication
public class SpringAirconditionarappJdbc2Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringAirconditionarappJdbc2Application.class, args);
		
		
	}

	@Autowired
	IAirConditionar airConditionar;
	@Override
	public void run(String... args) throws Exception {
		
		AirConditionar air=new AirConditionar("Invo", "LG", 20000, "AC", 1);
         airConditionar.addAirConditionar(air);
		
	}

}
