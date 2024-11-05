package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Address(String address1, int pincode) {
	public void testAddress() {
		System.out.println("Address: " + address1 + "\nPincode: " + pincode);
	}
}

@Configuration
public class DemoConfiguration {

	@Bean
	public String run() {
		System.out.println("Test run Bean");
		return "Testing Bean";
	}
	
	@Bean
	public Address address() {
		return new Address("G-0, George Tower, NewTown, Kolkata", 700102);
	}
}
