package com.jhonathansoftwerehouse.portfolio1.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.jhonathansoftwerehouse.portfolio1.entities.User;
import com.jhonathansoftwerehouse.portfolio1.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "998877665", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "997777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
}
