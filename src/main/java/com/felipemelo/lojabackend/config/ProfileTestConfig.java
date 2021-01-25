package com.felipemelo.lojabackend.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.felipemelo.lojabackend.services.DBService;
import com.felipemelo.lojabackend.services.EmailService;
import com.felipemelo.lojabackend.services.MockEmailService;

@Configuration
@Profile("test")
public class ProfileTestConfig {
	
	@Autowired
	private DBService dbService;
	
	@Bean
	public boolean instantiateTest() throws ParseException {
		dbService.instantiateTestDatabase();
		return true;
	}
	
	@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}

}
