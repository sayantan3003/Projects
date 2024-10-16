package com.dassoftware.appgaming.spring01;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {};
record Address(String firstLine, String city) {};

@Configuration
public class AppGamingSpringConfiguration {
	
	@Bean
	public String name() {
		return "Sayantan";
	}
	
	@Bean
	public int age() {
		return 25;
	}
	
	@Bean(name = "address2")
	public Address address() {
		return new Address("New Jersy", "USA");
	}
	
	@Bean(name = "home")
	public Address homeAddress() {
		return new Address("Bengal", "India");
	}
	
	@Bean(name = "office")
	@Qualifier("office_lvs")
	public Address officeAddress() {
		return new Address("Kolkata", "India");
	}
	
	@Bean
	@Primary
	public Person person() {
		return new Person("Ravi", 20, new Address("London", "UK"));
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());	// name, age, address
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address home) {
		// name, age, addr
		return new Person(name, age, home);
	}
	
	@Bean
	public Person employee(String name, int age, @Qualifier("office_lvs") Address address) {
		return new Person(name, age, address);
	}
}
