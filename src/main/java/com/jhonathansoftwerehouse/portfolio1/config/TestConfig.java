package com.jhonathansoftwerehouse.portfolio1.config;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.jhonathansoftwerehouse.portfolio1.entities.Category;
import com.jhonathansoftwerehouse.portfolio1.entities.Order;
import com.jhonathansoftwerehouse.portfolio1.entities.User;
import com.jhonathansoftwerehouse.portfolio1.entities.enums.OrderStatus;
import com.jhonathansoftwerehouse.portfolio1.repositories.CategoryRepository;
import com.jhonathansoftwerehouse.portfolio1.repositories.OrderRepository;
import com.jhonathansoftwerehouse.portfolio1.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository; 

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Eletronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "998877665", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "997777777", "123456");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.WAITING_PAYMENT, u1); 
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2); 
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.PAID, u1); 
		

		
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}
}
